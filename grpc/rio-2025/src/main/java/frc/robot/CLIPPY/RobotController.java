package frc.robot.CLIPPY;

import java.util.Iterator;

import CLIPPY.control.RobotControllerGrpc.RobotControllerImplBase;
import edu.wpi.first.math.Pair;
import frc.robot.control.ISystem;
import frc.robot.flow.ILooper;
import frc.robot.flow.Registry;
import frc.robot.flow.Voidinator;
import frc.robot.util.Time;

public class RobotController extends RobotControllerImplBase implements ILooper {

    // Singleton
    private RobotController() { Registry.getInstance().loopers.add(this); }
    private static RobotController instance;
    public static RobotController getInstance() {
        if (instance == null)
            instance = new RobotController();
        return instance;
    }

    private Registry r = Registry.getInstance();

    @Override
    public void submitControlTarget(CLIPPY.control.ControlTargetOuterClass.ControlTarget request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
            Voidinator commit = () -> {
            if (r.systems.containsKey(request.getSystemId())) {
                ISystem system = r.systems.get(request.getSystemId());
                if (request.hasVelocity()) system.setReference(request.getVelocity());
                if (request.hasVoltage()) system.setBypassInput(request.getVoltage());
                if (request.hasCurrent()) System.err.print("[warn] Attempted to set current " + request.getCurrent() + " on system " + request.getSystemId() + ", but current control is not yet supported.");
                if (request.hasAcceleration()) System.err.print("[warn] Attempted to set acceleration " + request.getAcceleration() + " on system " + request.getSystemId() + ", but acceleration control is not yet supported.");
                if (request.hasPosition()) System.err.print("[warn] Attempted to set position " + request.getPosition() + " on system " + request.getSystemId() + ", but position control is not yet supported.");
            }
        };
        if (request.hasTimestamp()) {
            double time = Time.timeFromTimestamp(request.getTimestamp());
            r.delayedControlTargets.add(new Pair<Double,Voidinator>(time, commit));
        } else {
            // no timestamp, apply immediately
            commit.get();
        }

        responseObserver.onCompleted();
    }

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
            responseObserver.onCompleted();
    }

    //@Override
    //public void setControlStyle(CLIPPY.control.ControlStyleOuterClass.ControlStyle request,
    //    io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
    //  asyncUnimplementedUnaryCall(METHOD_SET_CONTROL_STYLE, responseObserver);
    //}

    @Override
    public ILooper init() { return this; }

    @Override
    public ILooper loop() {
        // https://stackoverflow.com/a/1196612/6627273
        Iterator<Pair<Double, Voidinator>> i = r.delayedControlTargets.iterator();
        while (i.hasNext()) {
        Pair<Double, Voidinator> action = i.next();
            if (action.getFirst() <= Time.now()) {
            action.getSecond().get();
            i.remove();
            }
        }
        return this;
    }

    @Override
    public ILooper stop() { return this; }

}
