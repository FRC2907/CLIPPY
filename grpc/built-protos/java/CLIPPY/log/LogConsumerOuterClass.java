// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LogConsumer.proto

package CLIPPY.log;

public final class LogConsumerOuterClass {
  private LogConsumerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LogConsumer.proto\022\nCLIPPY.log\032\017LogReco" +
      "rd.proto\032\033google/protobuf/empty.proto2Q\n" +
      "\013LogConsumer\022B\n\017SubmitLogRecord\022\025.CLIPPY" +
      ".log.LogRecord\032\026.google.protobuf.Empty\"\000" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          CLIPPY.log.LogRecordOuterClass.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    CLIPPY.log.LogRecordOuterClass.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}