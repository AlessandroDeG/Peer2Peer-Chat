// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msgFormat.proto

package Exercise3;

/**
 * Protobuf type {@code Exercise3.Message}
 */
public final class Message extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Exercise3.Message)
    MessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Message.newBuilder() to construct.
  private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Message() {
    msg_ = "";
    msgid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Message();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Exercise3.MsgFormat.internal_static_Exercise3_Message_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Exercise3.MsgFormat.internal_static_Exercise3_Message_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Exercise3.Message.class, Exercise3.Message.Builder.class);
  }

  private int bitField0_;
  public static final int FR_FIELD_NUMBER = 1;
  private int fr_;
  /**
   * <code>required int32 fr = 1;</code>
   * @return Whether the fr field is set.
   */
  @java.lang.Override
  public boolean hasFr() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required int32 fr = 1;</code>
   * @return The fr.
   */
  @java.lang.Override
  public int getFr() {
    return fr_;
  }

  public static final int TO_FIELD_NUMBER = 2;
  private int to_;
  /**
   * <code>required int32 to = 2;</code>
   * @return Whether the to field is set.
   */
  @java.lang.Override
  public boolean hasTo() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>required int32 to = 2;</code>
   * @return The to.
   */
  @java.lang.Override
  public int getTo() {
    return to_;
  }

  public static final int MSG_FIELD_NUMBER = 3;
  private volatile java.lang.Object msg_;
  /**
   * <code>required string msg = 3;</code>
   * @return Whether the msg field is set.
   */
  @java.lang.Override
  public boolean hasMsg() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>required string msg = 3;</code>
   * @return The msg.
   */
  @java.lang.Override
  public java.lang.String getMsg() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        msg_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string msg = 3;</code>
   * @return The bytes for msg.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMsgBytes() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SENDER_FIELD_NUMBER = 4;
  private int sender_;
  /**
   * <code>required int32 sender = 4;</code>
   * @return Whether the sender field is set.
   */
  @java.lang.Override
  public boolean hasSender() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>required int32 sender = 4;</code>
   * @return The sender.
   */
  @java.lang.Override
  public int getSender() {
    return sender_;
  }

  public static final int MSGID_FIELD_NUMBER = 5;
  private volatile java.lang.Object msgid_;
  /**
   * <code>required string msgid = 5;</code>
   * @return Whether the msgid field is set.
   */
  @java.lang.Override
  public boolean hasMsgid() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>required string msgid = 5;</code>
   * @return The msgid.
   */
  @java.lang.Override
  public java.lang.String getMsgid() {
    java.lang.Object ref = msgid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        msgid_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string msgid = 5;</code>
   * @return The bytes for msgid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMsgidBytes() {
    java.lang.Object ref = msgid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msgid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasFr()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasTo()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasMsg()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasSender()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasMsgid()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(1, fr_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, to_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, msg_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt32(4, sender_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, msgid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, fr_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, to_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, msg_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, sender_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, msgid_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Exercise3.Message)) {
      return super.equals(obj);
    }
    Exercise3.Message other = (Exercise3.Message) obj;

    if (hasFr() != other.hasFr()) return false;
    if (hasFr()) {
      if (getFr()
          != other.getFr()) return false;
    }
    if (hasTo() != other.hasTo()) return false;
    if (hasTo()) {
      if (getTo()
          != other.getTo()) return false;
    }
    if (hasMsg() != other.hasMsg()) return false;
    if (hasMsg()) {
      if (!getMsg()
          .equals(other.getMsg())) return false;
    }
    if (hasSender() != other.hasSender()) return false;
    if (hasSender()) {
      if (getSender()
          != other.getSender()) return false;
    }
    if (hasMsgid() != other.hasMsgid()) return false;
    if (hasMsgid()) {
      if (!getMsgid()
          .equals(other.getMsgid())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasFr()) {
      hash = (37 * hash) + FR_FIELD_NUMBER;
      hash = (53 * hash) + getFr();
    }
    if (hasTo()) {
      hash = (37 * hash) + TO_FIELD_NUMBER;
      hash = (53 * hash) + getTo();
    }
    if (hasMsg()) {
      hash = (37 * hash) + MSG_FIELD_NUMBER;
      hash = (53 * hash) + getMsg().hashCode();
    }
    if (hasSender()) {
      hash = (37 * hash) + SENDER_FIELD_NUMBER;
      hash = (53 * hash) + getSender();
    }
    if (hasMsgid()) {
      hash = (37 * hash) + MSGID_FIELD_NUMBER;
      hash = (53 * hash) + getMsgid().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Exercise3.Message parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Exercise3.Message parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Exercise3.Message parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Exercise3.Message parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Exercise3.Message parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Exercise3.Message parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Exercise3.Message parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Exercise3.Message parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Exercise3.Message parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Exercise3.Message parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Exercise3.Message parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Exercise3.Message parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Exercise3.Message prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code Exercise3.Message}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Exercise3.Message)
      Exercise3.MessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Exercise3.MsgFormat.internal_static_Exercise3_Message_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Exercise3.MsgFormat.internal_static_Exercise3_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Exercise3.Message.class, Exercise3.Message.Builder.class);
    }

    // Construct using Exercise3.Message.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      fr_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      to_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      msg_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      sender_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      msgid_ = "";
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Exercise3.MsgFormat.internal_static_Exercise3_Message_descriptor;
    }

    @java.lang.Override
    public Exercise3.Message getDefaultInstanceForType() {
      return Exercise3.Message.getDefaultInstance();
    }

    @java.lang.Override
    public Exercise3.Message build() {
      Exercise3.Message result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public Exercise3.Message buildPartial() {
      Exercise3.Message result = new Exercise3.Message(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fr_ = fr_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.to_ = to_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.msg_ = msg_;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.sender_ = sender_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        to_bitField0_ |= 0x00000010;
      }
      result.msgid_ = msgid_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Exercise3.Message) {
        return mergeFrom((Exercise3.Message)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Exercise3.Message other) {
      if (other == Exercise3.Message.getDefaultInstance()) return this;
      if (other.hasFr()) {
        setFr(other.getFr());
      }
      if (other.hasTo()) {
        setTo(other.getTo());
      }
      if (other.hasMsg()) {
        bitField0_ |= 0x00000004;
        msg_ = other.msg_;
        onChanged();
      }
      if (other.hasSender()) {
        setSender(other.getSender());
      }
      if (other.hasMsgid()) {
        bitField0_ |= 0x00000010;
        msgid_ = other.msgid_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasFr()) {
        return false;
      }
      if (!hasTo()) {
        return false;
      }
      if (!hasMsg()) {
        return false;
      }
      if (!hasSender()) {
        return false;
      }
      if (!hasMsgid()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              fr_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              to_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              msg_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              sender_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              msgid_ = input.readBytes();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int fr_ ;
    /**
     * <code>required int32 fr = 1;</code>
     * @return Whether the fr field is set.
     */
    @java.lang.Override
    public boolean hasFr() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int32 fr = 1;</code>
     * @return The fr.
     */
    @java.lang.Override
    public int getFr() {
      return fr_;
    }
    /**
     * <code>required int32 fr = 1;</code>
     * @param value The fr to set.
     * @return This builder for chaining.
     */
    public Builder setFr(int value) {
      bitField0_ |= 0x00000001;
      fr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 fr = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFr() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fr_ = 0;
      onChanged();
      return this;
    }

    private int to_ ;
    /**
     * <code>required int32 to = 2;</code>
     * @return Whether the to field is set.
     */
    @java.lang.Override
    public boolean hasTo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required int32 to = 2;</code>
     * @return The to.
     */
    @java.lang.Override
    public int getTo() {
      return to_;
    }
    /**
     * <code>required int32 to = 2;</code>
     * @param value The to to set.
     * @return This builder for chaining.
     */
    public Builder setTo(int value) {
      bitField0_ |= 0x00000002;
      to_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 to = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      to_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object msg_ = "";
    /**
     * <code>required string msg = 3;</code>
     * @return Whether the msg field is set.
     */
    public boolean hasMsg() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required string msg = 3;</code>
     * @return The msg.
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          msg_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string msg = 3;</code>
     * @return The bytes for msg.
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string msg = 3;</code>
     * @param value The msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      msg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string msg = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsg() {
      bitField0_ = (bitField0_ & ~0x00000004);
      msg_ = getDefaultInstance().getMsg();
      onChanged();
      return this;
    }
    /**
     * <code>required string msg = 3;</code>
     * @param value The bytes for msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      msg_ = value;
      onChanged();
      return this;
    }

    private int sender_ ;
    /**
     * <code>required int32 sender = 4;</code>
     * @return Whether the sender field is set.
     */
    @java.lang.Override
    public boolean hasSender() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required int32 sender = 4;</code>
     * @return The sender.
     */
    @java.lang.Override
    public int getSender() {
      return sender_;
    }
    /**
     * <code>required int32 sender = 4;</code>
     * @param value The sender to set.
     * @return This builder for chaining.
     */
    public Builder setSender(int value) {
      bitField0_ |= 0x00000008;
      sender_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 sender = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      bitField0_ = (bitField0_ & ~0x00000008);
      sender_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object msgid_ = "";
    /**
     * <code>required string msgid = 5;</code>
     * @return Whether the msgid field is set.
     */
    public boolean hasMsgid() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>required string msgid = 5;</code>
     * @return The msgid.
     */
    public java.lang.String getMsgid() {
      java.lang.Object ref = msgid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          msgid_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string msgid = 5;</code>
     * @return The bytes for msgid.
     */
    public com.google.protobuf.ByteString
        getMsgidBytes() {
      java.lang.Object ref = msgid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msgid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string msgid = 5;</code>
     * @param value The msgid to set.
     * @return This builder for chaining.
     */
    public Builder setMsgid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      msgid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string msgid = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgid() {
      bitField0_ = (bitField0_ & ~0x00000010);
      msgid_ = getDefaultInstance().getMsgid();
      onChanged();
      return this;
    }
    /**
     * <code>required string msgid = 5;</code>
     * @param value The bytes for msgid to set.
     * @return This builder for chaining.
     */
    public Builder setMsgidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      msgid_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Exercise3.Message)
  }

  // @@protoc_insertion_point(class_scope:Exercise3.Message)
  private static final Exercise3.Message DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Exercise3.Message();
  }

  public static Exercise3.Message getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Message>
      PARSER = new com.google.protobuf.AbstractParser<Message>() {
    @java.lang.Override
    public Message parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Message> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Message> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public Exercise3.Message getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
