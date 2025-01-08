package frc.robot.CLIPPY;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import CLIPPY.control.SystemDataServerGrpc.SystemDataServerImplBase;
import CLIPPY.control.SystemStateOuterClass.SystemState;
import frc.robot.flow.ILooper;
import io.grpc.stub.StreamObserver;
import com.google.protobuf.Empty;

/**
 * When a client calls getSystemData, we'll add their connection to the list of
 * subscribers. Every loop, we'll iterate through the data we've collected since
 * the last loop, and send it off to everyone who's listening. When we end the
 * loop, we'll close the connections.
 */
public class SystemDataServer extends SystemDataServerImplBase implements ILooper {

    // Singleton
    private SystemDataServer() {}
    private static SystemDataServer instance;
    public static SystemDataServer getInstance() {
        if (instance == null)
            instance = new SystemDataServer();
        return instance;
    }

    // Data queue
    private List<SystemState> queued_data = new LinkedList<>();
    public SystemDataServer submit(SystemState state) {
        queued_data.add(state);
        return this;
    }

    // Subscribers
    private List<StreamObserver<SystemState>> subscribers = new ArrayList<>();
    @Override
    public void getSystemData(Empty request,
        StreamObserver<SystemState> responseObserver) {
            subscribers.add(responseObserver);
    }

    // Wooper looper
    @Override
    public ILooper init() { return this; }

    @Override
    public ILooper loop() {
        while (!queued_data.isEmpty()) {
            SystemState state = queued_data.remove(0);
            for (StreamObserver<SystemState> subscriber : subscribers)
                subscriber.onNext(state);
        }
        return this;
    }

    @Override
    public ILooper stop() {
        for (StreamObserver<SystemState> subscriber : subscribers)
        subscriber.onCompleted();
        return this;
    }


}
