package CLIPPY.grpc;

import CLIPPY.control.SystemTunerGrpc.SystemTunerImplBase;
import CLIPPY.control.ITunableSystem;
import CLIPPY.control.SystemRegistry;
import CLIPPY.control.ControlGainsOuterClass.ControlGains;
import io.grpc.stub.StreamObserver;
import com.google.protobuf.Empty;

public class SystemTunerServer extends SystemTunerImplBase {

    private SystemTunerServer() {
    }
    private static SystemTunerServer instance;
    public static SystemTunerServer getInstance() {
        if (instance == null) instance = new SystemTunerServer();
        return instance;
    }

    @Override
    public StreamObserver<ControlGains> setControlGains(StreamObserver<Empty> responseObserver) {
        System.err.println("[info] Client opened stream of control gains");
        return new StreamObserver<ControlGains>() {

            @Override
            public void onNext(ControlGains gains) {
                ITunableSystem sys = SystemRegistry.getInstance().systems.get(gains.getSystemId());
                if (sys != null) {
                    if (gains.hasKP()) sys.setP(gains.getKP().getValue());
                    if (gains.hasKI()) sys.setI(gains.getKI().getValue());
                    if (gains.hasKD()) sys.setD(gains.getKD().getValue());
                    if (gains.hasKFStatic()) sys.setF_static(gains.getKFStatic().getValue());
                    if (gains.hasKFLinear()) sys.setF_linear(gains.getKFLinear().getValue());
                    if (gains.hasKFLinearPerTime()) sys.setF_linear_per_time(gains.getKFLinearPerTime().getValue());
                    if (gains.hasKFConstant()) sys.setF_constant(gains.getKFConstant().getValue());

                    // TODO set this up with a logger
                    if (gains.hasKU()) {
                        if (gains.hasTU()) {
                            sys.zieglify(gains.getKU().getValue(), gains.getTU().getValue(), gains.getZnControlRule());
                        } else {
                            System.err.print("[warn] Attempted to set kU = " + gains.getKU().getValue() + ", but no period tU was specified.");
                        }
                    }
                }
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.err.println("[info] Client closed stream of control gains");
                responseObserver.onCompleted();
            }
        };
    }
}
