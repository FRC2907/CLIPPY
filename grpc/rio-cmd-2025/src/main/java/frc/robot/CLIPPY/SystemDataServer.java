package frc.robot.CLIPPY;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.protobuf.Empty;

import CLIPPY.control.SystemDataServerGrpc.SystemDataServerImplBase;
import CLIPPY.control.SystemStateOuterClass.SystemIDs;
import CLIPPY.control.SystemStateOuterClass.SystemState;
import CLIPPY.control.SystemStateOuterClass.SystemTags;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.flow.Registry;
import io.grpc.stub.ServerCallStreamObserver;
import io.grpc.stub.StreamObserver;

public class SystemDataServer extends SystemDataServerImplBase implements Subsystem {

    private SystemDataServer() {
        CommandScheduler.getInstance().registerSubsystem(this);
    }
    private static SystemDataServer instance;
    public static SystemDataServer getInstance() {
        if (instance == null) instance = new SystemDataServer();
        return instance;
    }

    private Map<String, List<StreamObserver<SystemState>>> clients = new HashMap<>();

    /**
     * <pre>
     * Return all IDs that are tagged with ANY of these tags. Empty set returns all IDs.
     * </pre>
     */
    @Override
    public void getSystemIDs(SystemTags request, StreamObserver<SystemIDs> responseObserver) {
        System.out.println("[info] Fetching system IDs for tags: " + request.toString());
        SystemIDs out = SystemIDs.newBuilder().build();
        for (ITunableSystem sys : Registry.getInstance().systems.values()) {
            if (request.getSystemTagsCount() == 0) out = out.toBuilder().addSystemIds(sys.getID()).build();
            else {
                for (String tag : request.getSystemTagsList())
                if (sys.hasTag(tag)) out.toBuilder().addSystemIds(sys.getID());
            }
        }
        System.out.println("[info] Sending response: " + out);
        responseObserver.onNext(out.toBuilder().build());
        responseObserver.onCompleted();
    }

    /**
     */
    @Override
    public void getSystemTags(Empty request, StreamObserver<SystemTags> responseObserver) {
        responseObserver.onNext(SystemTags.newBuilder().addAllSystemTags(Registry.getInstance().systemTags).build());
        responseObserver.onCompleted();
    }

    /**
     */
    @Override
    public void getSystemData(SystemIDs request, StreamObserver<SystemState> responseObserver) {
        // https://github.com/grpc/grpc-java/blob/master/examples/src/main/java/io/grpc/examples/cancellation/CancellationServer.java#L99
        ((ServerCallStreamObserver<SystemState>)responseObserver).setOnCancelHandler(() -> {
            for (String id : clients.keySet())
            clients.get(id).remove(responseObserver);
        });;
        for (String id : request.getSystemIdsList())
        if (clients.containsKey(id)) clients.get(id).add(responseObserver);
        else clients.put(id, new ArrayList<>(List.of(responseObserver)));
    }


    public void periodic() {
        for (String id : clients.keySet()) {
            SystemState state = Registry.getInstance().systems.get(id).buildSystemState();
            for (StreamObserver<SystemState> client : clients.get(id))
                client.onNext(state);
        }
        // FIXME does not account for clients closing their connections
    }
}
