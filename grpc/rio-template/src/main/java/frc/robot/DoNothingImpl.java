package frc.robot;

import com.google.protobuf.Empty;

import CLIPPY.nada.DoNothingGrpc.DoNothingImplBase;
import CLIPPY.nada.NadaOuterClass.Nada;
import io.grpc.stub.StreamObserver;

// https://github.com/grpc/grpc-java/blob/master/examples/src/main/java/io/grpc/examples/helloworld/HelloWorldServer.java

public class DoNothingImpl extends DoNothingImplBase {
    @Override
    public void nop(Nada nada, StreamObserver<Empty> out) {
        System.out.println("nyarrrrgh");
        out.onNext(Empty.getDefaultInstance());
        out.onCompleted();
    }
}
