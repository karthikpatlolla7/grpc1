// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloService.proto

package com.example.grpc.server.grpcserver;

public final class HelloService {
  private HelloService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_PingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_PingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_PongResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_PongResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022HelloService.proto\022\"com.example.grpc.s" +
      "erver.grpcserver\"\033\n\013PingRequest\022\014\n\004ping\030" +
      "\001 \001(\t\"\034\n\014PongResponse\022\014\n\004pong\030\001 \001(\t2|\n\017P" +
      "ingPongService\022i\n\004ping\022/.com.example.grp" +
      "c.server.grpcserver.PingRequest\0320.com.ex" +
      "ample.grpc.server.grpcserver.PongRespons" +
      "eB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_grpc_server_grpcserver_PingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_server_grpcserver_PingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_PingRequest_descriptor,
        new java.lang.String[] { "Ping", });
    internal_static_com_example_grpc_server_grpcserver_PongResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_server_grpcserver_PongResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_PongResponse_descriptor,
        new java.lang.String[] { "Pong", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
