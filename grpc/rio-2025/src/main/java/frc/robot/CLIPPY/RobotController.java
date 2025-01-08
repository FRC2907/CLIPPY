package frc.robot.CLIPPY;

import CLIPPY.control.RobotControllerGrpc.RobotControllerImplBase;
import frc.robot.control.ISystem;
import frc.robot.flow.Registry;

public class RobotController extends RobotControllerImplBase {

    // Singleton
    private RobotController() {}
    private static RobotController instance;
    public static RobotController getInstance() {
        if (instance == null)
            instance = new RobotController();
        return instance;
    }

    private Registry r = Registry.getInstance();

    //@Override
    //public void submitControlTarget(CLIPPY.control.ControlTargetOuterClass.ControlTarget request,
    //    io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
    //  asyncUnimplementedUnaryCall(METHOD_SUBMIT_CONTROL_TARGET, responseObserver);
    //}

    @Override
    public void submitControlGains(CLIPPY.control.ControlGainsOuterClass.ControlGains request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
            if (r.systems.containsKey(request.getSystemId())) {
                ISystem system = r.systems.get(request.getSystemId());
                if (request.hasKP()) system.setP(request.getKP().getValue());
                if (request.hasKI()) system.setI(request.getKI().getValue());
                if (request.hasKD()) system.setD(request.getKD().getValue());
                if (request.hasKFStatic()) system.setF_static(request.getKFStatic().getValue());
                if (request.hasKFLinear()) system.setF_linear(request.getKFLinear().getValue());
                if (request.hasKFLinearPerTime()) system.setF_linear_per_time(request.getKFLinearPerTime().getValue());
                if (request.hasKFConstant()) system.setF_constant(request.getKFConstant().getValue());
                // TODO set this up with a logger
                if (request.hasKU()) System.err.print("[warn] Attempted to set kU = " + request.getKU().getValue() + ", but Ziegler-Nichols via gRPC is not yet supported.");
            }
    }

    //@Override
    //public void setControlStyle(CLIPPY.control.ControlStyleOuterClass.ControlStyle request,
    //    io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
    //  asyncUnimplementedUnaryCall(METHOD_SET_CONTROL_STYLE, responseObserver);
    //}

}
