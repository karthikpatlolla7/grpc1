// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloService.proto

package com.example.grpc.server.grpcserver;

/**
 * Protobuf type {@code com.example.grpc.server.grpcserver.PongResponse}
 */
public  final class PongResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.server.grpcserver.PongResponse)
    PongResponseOrBuilder {
  // Use PongResponse.newBuilder() to construct.
  private PongResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PongResponse() {
    pong_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PongResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            pong_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.server.grpcserver.HelloService.internal_static_com_example_grpc_server_grpcserver_PongResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.server.grpcserver.HelloService.internal_static_com_example_grpc_server_grpcserver_PongResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.server.grpcserver.PongResponse.class, com.example.grpc.server.grpcserver.PongResponse.Builder.class);
  }

  public static final int PONG_FIELD_NUMBER = 1;
  private volatile java.lang.Object pong_;
  /**
   * <code>string pong = 1;</code>
   */
  public java.lang.String getPong() {
    java.lang.Object ref = pong_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pong_ = s;
      return s;
    }
  }
  /**
   * <code>string pong = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPongBytes() {
    java.lang.Object ref = pong_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pong_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPongBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pong_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPongBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pong_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.grpc.server.grpcserver.PongResponse)) {
      return super.equals(obj);
    }
    com.example.grpc.server.grpcserver.PongResponse other = (com.example.grpc.server.grpcserver.PongResponse) obj;

    boolean result = true;
    result = result && getPong()
        .equals(other.getPong());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PONG_FIELD_NUMBER;
    hash = (53 * hash) + getPong().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.server.grpcserver.PongResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.PongResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.PongResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.PongResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.PongResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.PongResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.PongResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.PongResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.PongResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.PongResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.PongResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.PongResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.grpc.server.grpcserver.PongResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.grpc.server.grpcserver.PongResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.server.grpcserver.PongResponse)
      com.example.grpc.server.grpcserver.PongResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.server.grpcserver.HelloService.internal_static_com_example_grpc_server_grpcserver_PongResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.server.grpcserver.HelloService.internal_static_com_example_grpc_server_grpcserver_PongResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.server.grpcserver.PongResponse.class, com.example.grpc.server.grpcserver.PongResponse.Builder.class);
    }

    // Construct using com.example.grpc.server.grpcserver.PongResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      pong_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.server.grpcserver.HelloService.internal_static_com_example_grpc_server_grpcserver_PongResponse_descriptor;
    }

    public com.example.grpc.server.grpcserver.PongResponse getDefaultInstanceForType() {
      return com.example.grpc.server.grpcserver.PongResponse.getDefaultInstance();
    }

    public com.example.grpc.server.grpcserver.PongResponse build() {
      com.example.grpc.server.grpcserver.PongResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.grpc.server.grpcserver.PongResponse buildPartial() {
      com.example.grpc.server.grpcserver.PongResponse result = new com.example.grpc.server.grpcserver.PongResponse(this);
      result.pong_ = pong_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.grpc.server.grpcserver.PongResponse) {
        return mergeFrom((com.example.grpc.server.grpcserver.PongResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.server.grpcserver.PongResponse other) {
      if (other == com.example.grpc.server.grpcserver.PongResponse.getDefaultInstance()) return this;
      if (!other.getPong().isEmpty()) {
        pong_ = other.pong_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.grpc.server.grpcserver.PongResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.server.grpcserver.PongResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pong_ = "";
    /**
     * <code>string pong = 1;</code>
     */
    public java.lang.String getPong() {
      java.lang.Object ref = pong_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pong_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pong = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPongBytes() {
      java.lang.Object ref = pong_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pong_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pong = 1;</code>
     */
    public Builder setPong(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pong_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pong = 1;</code>
     */
    public Builder clearPong() {
      
      pong_ = getDefaultInstance().getPong();
      onChanged();
      return this;
    }
    /**
     * <code>string pong = 1;</code>
     */
    public Builder setPongBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pong_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.example.grpc.server.grpcserver.PongResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.server.grpcserver.PongResponse)
  private static final com.example.grpc.server.grpcserver.PongResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.server.grpcserver.PongResponse();
  }

  public static com.example.grpc.server.grpcserver.PongResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PongResponse>
      PARSER = new com.google.protobuf.AbstractParser<PongResponse>() {
    public PongResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PongResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PongResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PongResponse> getParserForType() {
    return PARSER;
  }

  public com.example.grpc.server.grpcserver.PongResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

