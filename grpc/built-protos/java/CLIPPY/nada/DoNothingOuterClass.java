// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DoNothing.proto

package CLIPPY.nada;

public final class DoNothingOuterClass {
  private DoNothingOuterClass() {}
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
      "\n\017DoNothing.proto\022\013CLIPPY.nada\032\nNada.pro" +
      "to\032\033google/protobuf/empty.proto2?\n\tDoNot" +
      "hing\0222\n\003Nop\022\021.CLIPPY.nada.Nada\032\026.google." +
      "protobuf.Empty\"\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          CLIPPY.nada.NadaOuterClass.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    CLIPPY.nada.NadaOuterClass.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
