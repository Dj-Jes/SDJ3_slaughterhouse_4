// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Tray.proto

package via.sdj3.slaughterhouse.protobuf.tray;

/**
 * Protobuf type {@code via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest}
 */
public final class CreateTrayRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest)
    CreateTrayRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateTrayRequest.newBuilder() to construct.
  private CreateTrayRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateTrayRequest() {
    description_ = "";
    animalPartIds_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateTrayRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateTrayRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 17: {

            weight_ = input.readDouble();
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              animalPartIds_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            animalPartIds_.addInt(input.readInt32());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              animalPartIds_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              animalPartIds_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        animalPartIds_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.sdj3.slaughterhouse.protobuf.tray.Tray.internal_static_via_sdj3_slaughterhouse_protobuf_tray_CreateTrayRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sdj3.slaughterhouse.protobuf.tray.Tray.internal_static_via_sdj3_slaughterhouse_protobuf_tray_CreateTrayRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest.class, via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest.Builder.class);
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 1;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 1;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WEIGHT_FIELD_NUMBER = 2;
  private double weight_;
  /**
   * <code>double weight = 2;</code>
   * @return The weight.
   */
  @java.lang.Override
  public double getWeight() {
    return weight_;
  }

  public static final int ANIMALPARTIDS_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.IntList animalPartIds_;
  /**
   * <code>repeated int32 animalPartIds = 3;</code>
   * @return A list containing the animalPartIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getAnimalPartIdsList() {
    return animalPartIds_;
  }
  /**
   * <code>repeated int32 animalPartIds = 3;</code>
   * @return The count of animalPartIds.
   */
  public int getAnimalPartIdsCount() {
    return animalPartIds_.size();
  }
  /**
   * <code>repeated int32 animalPartIds = 3;</code>
   * @param index The index of the element to return.
   * @return The animalPartIds at the given index.
   */
  public int getAnimalPartIds(int index) {
    return animalPartIds_.getInt(index);
  }
  private int animalPartIdsMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, description_);
    }
    if (java.lang.Double.doubleToRawLongBits(weight_) != 0) {
      output.writeDouble(2, weight_);
    }
    if (getAnimalPartIdsList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(animalPartIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < animalPartIds_.size(); i++) {
      output.writeInt32NoTag(animalPartIds_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, description_);
    }
    if (java.lang.Double.doubleToRawLongBits(weight_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, weight_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < animalPartIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(animalPartIds_.getInt(i));
      }
      size += dataSize;
      if (!getAnimalPartIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      animalPartIdsMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest)) {
      return super.equals(obj);
    }
    via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest other = (via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest) obj;

    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (java.lang.Double.doubleToLongBits(getWeight())
        != java.lang.Double.doubleToLongBits(
            other.getWeight())) return false;
    if (!getAnimalPartIdsList()
        .equals(other.getAnimalPartIdsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWeight()));
    if (getAnimalPartIdsCount() > 0) {
      hash = (37 * hash) + ANIMALPARTIDS_FIELD_NUMBER;
      hash = (53 * hash) + getAnimalPartIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
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
  public static Builder newBuilder(via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest prototype) {
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
   * Protobuf type {@code via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest)
      via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sdj3.slaughterhouse.protobuf.tray.Tray.internal_static_via_sdj3_slaughterhouse_protobuf_tray_CreateTrayRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sdj3.slaughterhouse.protobuf.tray.Tray.internal_static_via_sdj3_slaughterhouse_protobuf_tray_CreateTrayRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest.class, via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest.Builder.class);
    }

    // Construct using via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      description_ = "";

      weight_ = 0D;

      animalPartIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sdj3.slaughterhouse.protobuf.tray.Tray.internal_static_via_sdj3_slaughterhouse_protobuf_tray_CreateTrayRequest_descriptor;
    }

    @java.lang.Override
    public via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest getDefaultInstanceForType() {
      return via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest.getDefaultInstance();
    }

    @java.lang.Override
    public via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest build() {
      via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest buildPartial() {
      via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest result = new via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest(this);
      int from_bitField0_ = bitField0_;
      result.description_ = description_;
      result.weight_ = weight_;
      if (((bitField0_ & 0x00000001) != 0)) {
        animalPartIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.animalPartIds_ = animalPartIds_;
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
      if (other instanceof via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest) {
        return mergeFrom((via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest other) {
      if (other == via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest.getDefaultInstance()) return this;
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.getWeight() != 0D) {
        setWeight(other.getWeight());
      }
      if (!other.animalPartIds_.isEmpty()) {
        if (animalPartIds_.isEmpty()) {
          animalPartIds_ = other.animalPartIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAnimalPartIdsIsMutable();
          animalPartIds_.addAll(other.animalPartIds_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 1;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 1;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 1;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 1;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private double weight_ ;
    /**
     * <code>double weight = 2;</code>
     * @return The weight.
     */
    @java.lang.Override
    public double getWeight() {
      return weight_;
    }
    /**
     * <code>double weight = 2;</code>
     * @param value The weight to set.
     * @return This builder for chaining.
     */
    public Builder setWeight(double value) {
      
      weight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double weight = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeight() {
      
      weight_ = 0D;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList animalPartIds_ = emptyIntList();
    private void ensureAnimalPartIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        animalPartIds_ = mutableCopy(animalPartIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 animalPartIds = 3;</code>
     * @return A list containing the animalPartIds.
     */
    public java.util.List<java.lang.Integer>
        getAnimalPartIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(animalPartIds_) : animalPartIds_;
    }
    /**
     * <code>repeated int32 animalPartIds = 3;</code>
     * @return The count of animalPartIds.
     */
    public int getAnimalPartIdsCount() {
      return animalPartIds_.size();
    }
    /**
     * <code>repeated int32 animalPartIds = 3;</code>
     * @param index The index of the element to return.
     * @return The animalPartIds at the given index.
     */
    public int getAnimalPartIds(int index) {
      return animalPartIds_.getInt(index);
    }
    /**
     * <code>repeated int32 animalPartIds = 3;</code>
     * @param index The index to set the value at.
     * @param value The animalPartIds to set.
     * @return This builder for chaining.
     */
    public Builder setAnimalPartIds(
        int index, int value) {
      ensureAnimalPartIdsIsMutable();
      animalPartIds_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 animalPartIds = 3;</code>
     * @param value The animalPartIds to add.
     * @return This builder for chaining.
     */
    public Builder addAnimalPartIds(int value) {
      ensureAnimalPartIdsIsMutable();
      animalPartIds_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 animalPartIds = 3;</code>
     * @param values The animalPartIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllAnimalPartIds(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureAnimalPartIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, animalPartIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 animalPartIds = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnimalPartIds() {
      animalPartIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest)
  }

  // @@protoc_insertion_point(class_scope:via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest)
  private static final via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest();
  }

  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTrayRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateTrayRequest>() {
    @java.lang.Override
    public CreateTrayRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateTrayRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateTrayRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTrayRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sdj3.slaughterhouse.protobuf.tray.CreateTrayRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

