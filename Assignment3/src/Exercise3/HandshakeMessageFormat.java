// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: handshakeMessageFormat.proto

package Exercise3;

public final class HandshakeMessageFormat {
  private HandshakeMessageFormat() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Exercise3_HandshakeMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Exercise3_HandshakeMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\034handshakeMessageFormat.proto\022\tExercise" +
      "3\"-\n\020HandshakeMessage\022\n\n\002id\030\001 \002(\005\022\r\n\005err" +
      "or\030\002 \002(\010B\002P\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Exercise3_HandshakeMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Exercise3_HandshakeMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Exercise3_HandshakeMessage_descriptor,
        new String[] { "Id", "Error", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
