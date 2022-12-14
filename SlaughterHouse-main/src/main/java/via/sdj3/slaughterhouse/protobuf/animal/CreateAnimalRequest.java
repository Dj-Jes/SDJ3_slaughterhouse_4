// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Animal.proto

package via.sdj3.slaughterhouse.protobuf.animal;

/**
 * Protobuf type {@code via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest}
 */
public final class CreateAnimalRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest)
    CreateAnimalRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAnimalRequest.newBuilder() to construct.
  private CreateAnimalRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAnimalRequest() {
    registrationDate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAnimalRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateAnimalRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            animalTypeId_ = input.readInt32();
            break;
          }
          case 17: {

            weight_ = input.readDouble();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            registrationDate_ = s;
            break;
          }
          case 32: {

            healthy_ = input.readBool();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.sdj3.slaughterhouse.protobuf.animal.Animal.internal_static_via_sdj3_slaughterhouse_protobuf_animal_CreateAnimalRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sdj3.slaughterhouse.protobuf.animal.Animal.internal_static_via_sdj3_slaughterhouse_protobuf_animal_CreateAnimalRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest.class, via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest.Builder.class);
  }

  public static final int ANIMALTYPEID_FIELD_NUMBER = 1;
  private int animalTypeId_;
  /**
   * <code>int32 animalTypeId = 1;</code>
   * @return The animalTypeId.
   */
  @java.lang.Override
  public int getAnimalTypeId() {
    return animalTypeId_;
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

  public static final int REGISTRATIONDATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object registrationDate_;
  /**
   * <code>string registrationDate = 3;</code>
   * @return The registrationDate.
   */
  @java.lang.Override
  public java.lang.String getRegistrationDate() {
    java.lang.Object ref = registrationDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      registrationDate_ = s;
      return s;
    }
  }
  /**
   * <code>string registrationDate = 3;</code>
   * @return The bytes for registrationDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRegistrationDateBytes() {
    java.lang.Object ref = registrationDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      registrationDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEALTHY_FIELD_NUMBER = 4;
  private boolean healthy_;
  /**
   * <code>bool healthy = 4;</code>
   * @return The healthy.
   */
  @java.lang.Override
  public boolean getHealthy() {
    return healthy_;
  }

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
    if (animalTypeId_ != 0) {
      output.writeInt32(1, animalTypeId_);
    }
    if (java.lang.Double.doubleToRawLongBits(weight_) != 0) {
      output.writeDouble(2, weight_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(registrationDate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, registrationDate_);
    }
    if (healthy_ != false) {
      output.writeBool(4, healthy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (animalTypeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, animalTypeId_);
    }
    if (java.lang.Double.doubleToRawLongBits(weight_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, weight_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(registrationDate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, registrationDate_);
    }
    if (healthy_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, healthy_);
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
    if (!(obj instanceof via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest)) {
      return super.equals(obj);
    }
    via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest other = (via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest) obj;

    if (getAnimalTypeId()
        != other.getAnimalTypeId()) return false;
    if (java.lang.Double.doubleToLongBits(getWeight())
        != java.lang.Double.doubleToLongBits(
            other.getWeight())) return false;
    if (!getRegistrationDate()
        .equals(other.getRegistrationDate())) return false;
    if (getHealthy()
        != other.getHealthy()) return false;
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
    hash = (37 * hash) + ANIMALTYPEID_FIELD_NUMBER;
    hash = (53 * hash) + getAnimalTypeId();
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWeight()));
    hash = (37 * hash) + REGISTRATIONDATE_FIELD_NUMBER;
    hash = (53 * hash) + getRegistrationDate().hashCode();
    hash = (37 * hash) + HEALTHY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHealthy());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest parseFrom(
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
  public static Builder newBuilder(via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest prototype) {
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
   * Protobuf type {@code via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest)
      via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sdj3.slaughterhouse.protobuf.animal.Animal.internal_static_via_sdj3_slaughterhouse_protobuf_animal_CreateAnimalRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sdj3.slaughterhouse.protobuf.animal.Animal.internal_static_via_sdj3_slaughterhouse_protobuf_animal_CreateAnimalRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest.class, via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest.Builder.class);
    }

    // Construct using via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest.newBuilder()
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
      animalTypeId_ = 0;

      weight_ = 0D;

      registrationDate_ = "";

      healthy_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sdj3.slaughterhouse.protobuf.animal.Animal.internal_static_via_sdj3_slaughterhouse_protobuf_animal_CreateAnimalRequest_descriptor;
    }

    @java.lang.Override
    public via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest getDefaultInstanceForType() {
      return via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest.getDefaultInstance();
    }

    @java.lang.Override
    public via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest build() {
      via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest buildPartial() {
      via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest result = new via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest(this);
      result.animalTypeId_ = animalTypeId_;
      result.weight_ = weight_;
      result.registrationDate_ = registrationDate_;
      result.healthy_ = healthy_;
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
      if (other instanceof via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest) {
        return mergeFrom((via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest other) {
      if (other == via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest.getDefaultInstance()) return this;
      if (other.getAnimalTypeId() != 0) {
        setAnimalTypeId(other.getAnimalTypeId());
      }
      if (other.getWeight() != 0D) {
        setWeight(other.getWeight());
      }
      if (!other.getRegistrationDate().isEmpty()) {
        registrationDate_ = other.registrationDate_;
        onChanged();
      }
      if (other.getHealthy() != false) {
        setHealthy(other.getHealthy());
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
      via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int animalTypeId_ ;
    /**
     * <code>int32 animalTypeId = 1;</code>
     * @return The animalTypeId.
     */
    @java.lang.Override
    public int getAnimalTypeId() {
      return animalTypeId_;
    }
    /**
     * <code>int32 animalTypeId = 1;</code>
     * @param value The animalTypeId to set.
     * @return This builder for chaining.
     */
    public Builder setAnimalTypeId(int value) {
      
      animalTypeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 animalTypeId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnimalTypeId() {
      
      animalTypeId_ = 0;
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

    private java.lang.Object registrationDate_ = "";
    /**
     * <code>string registrationDate = 3;</code>
     * @return The registrationDate.
     */
    public java.lang.String getRegistrationDate() {
      java.lang.Object ref = registrationDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        registrationDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string registrationDate = 3;</code>
     * @return The bytes for registrationDate.
     */
    public com.google.protobuf.ByteString
        getRegistrationDateBytes() {
      java.lang.Object ref = registrationDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        registrationDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string registrationDate = 3;</code>
     * @param value The registrationDate to set.
     * @return This builder for chaining.
     */
    public Builder setRegistrationDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      registrationDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string registrationDate = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegistrationDate() {
      
      registrationDate_ = getDefaultInstance().getRegistrationDate();
      onChanged();
      return this;
    }
    /**
     * <code>string registrationDate = 3;</code>
     * @param value The bytes for registrationDate to set.
     * @return This builder for chaining.
     */
    public Builder setRegistrationDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      registrationDate_ = value;
      onChanged();
      return this;
    }

    private boolean healthy_ ;
    /**
     * <code>bool healthy = 4;</code>
     * @return The healthy.
     */
    @java.lang.Override
    public boolean getHealthy() {
      return healthy_;
    }
    /**
     * <code>bool healthy = 4;</code>
     * @param value The healthy to set.
     * @return This builder for chaining.
     */
    public Builder setHealthy(boolean value) {
      
      healthy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool healthy = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHealthy() {
      
      healthy_ = false;
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


    // @@protoc_insertion_point(builder_scope:via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest)
  }

  // @@protoc_insertion_point(class_scope:via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest)
  private static final via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest();
  }

  public static via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAnimalRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAnimalRequest>() {
    @java.lang.Override
    public CreateAnimalRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateAnimalRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateAnimalRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAnimalRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sdj3.slaughterhouse.protobuf.animal.CreateAnimalRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

