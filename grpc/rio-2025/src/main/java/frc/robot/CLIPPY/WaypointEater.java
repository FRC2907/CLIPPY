package frc.robot.CLIPPY;

import CLIPPY.control.WaypointEaterGrpc.WaypointEaterImplBase;
//import frc.robot.flow.Registry;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import CLIPPY.control.WaypointOuterClass.Waypoint;

public class WaypointEater extends WaypointEaterImplBase {
    // Singleton
    private WaypointEater() {
        //Registry.getInstance().loopers.add(this);
    }

    private static WaypointEater instance;

    public static WaypointEater getInstance() {
        if (instance == null)
            instance = new WaypointEater();
        return instance;
    }

    @Override
    public void ingestWaypoint(Waypoint request, StreamObserver<Empty> responseObserver) {
        System.out.println(request);
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }
}
