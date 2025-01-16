// Generated by the protocol buffer compiler.  DO NOT EDIT!
// clang-format off
// source: ControlGains.proto

// This CPP symbol can be defined to use imports that match up to the framework
// imports needed when using CocoaPods.
#if !defined(GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS)
 #define GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS 0
#endif

#if GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS
 #import <Protobuf/GPBProtocolBuffers.h>
#else
 #import "GPBProtocolBuffers.h"
#endif

#if GOOGLE_PROTOBUF_OBJC_VERSION < 30007
#error This file was generated by a newer version of protoc which is incompatible with your Protocol Buffer library sources.
#endif
#if 30007 < GOOGLE_PROTOBUF_OBJC_MIN_SUPPORTED_VERSION
#error This file was generated by an older version of protoc which is incompatible with your Protocol Buffer library sources.
#endif

// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

CF_EXTERN_C_BEGIN

NS_ASSUME_NONNULL_BEGIN

#pragma mark - Enum ZNControlRule

typedef GPB_ENUM(ZNControlRule) {
  /**
   * Value used if any message's field encounters a value that is not defined
   * by this enum. The message will also have C functions to get/set the rawValue
   * of the field.
   **/
  ZNControlRule_GPBUnrecognizedEnumeratorValue = kGPBUnrecognizedEnumeratorValue,
  ZNControlRule_Unset = 0,
  ZNControlRule_P = 1,
  ZNControlRule_Pi = 2,
  ZNControlRule_Pd = 3,
  ZNControlRule_Pid = 4,
  ZNControlRule_Pessen = 5,
  ZNControlRule_MildOvershoot = 6,
  ZNControlRule_NoOvershoot = 7,
};

GPBEnumDescriptor *ZNControlRule_EnumDescriptor(void);

/**
 * Checks to see if the given value is defined by the enum or was not known at
 * the time this source was generated.
 **/
BOOL ZNControlRule_IsValidValue(int32_t value);

#pragma mark - ControlGainsRoot

/**
 * Exposes the extension registry for this file.
 *
 * The base class provides:
 * @code
 *   + (GPBExtensionRegistry *)extensionRegistry;
 * @endcode
 * which is a @c GPBExtensionRegistry that includes all the extensions defined by
 * this file and all files that it depends on.
 **/
GPB_FINAL @interface ControlGainsRoot : GPBRootObject
@end

#pragma mark - ControlGains

typedef GPB_ENUM(ControlGains_FieldNumber) {
  ControlGains_FieldNumber_SystemId = 1,
  ControlGains_FieldNumber_KP = 2,
  ControlGains_FieldNumber_KI = 3,
  ControlGains_FieldNumber_KD = 4,
  ControlGains_FieldNumber_KFStatic = 5,
  ControlGains_FieldNumber_KFLinear = 6,
  ControlGains_FieldNumber_KFLinearPerTime = 7,
  ControlGains_FieldNumber_KFConstant = 8,
  ControlGains_FieldNumber_KU = 9,
  ControlGains_FieldNumber_TU = 10,
  ControlGains_FieldNumber_ZnControlRule = 11,
};

GPB_FINAL @interface ControlGains : GPBMessage

/** recall that all fields are optional */
@property(nonatomic, readwrite, copy, null_resettable) NSString *systemId;

@property(nonatomic, readwrite, strong, null_resettable) GPBDoubleValue *kP;
/** Test to see if @c kP has been set. */
@property(nonatomic, readwrite) BOOL hasKP;

@property(nonatomic, readwrite, strong, null_resettable) GPBDoubleValue *kI;
/** Test to see if @c kI has been set. */
@property(nonatomic, readwrite) BOOL hasKI;

@property(nonatomic, readwrite, strong, null_resettable) GPBDoubleValue *kD;
/** Test to see if @c kD has been set. */
@property(nonatomic, readwrite) BOOL hasKD;

/** kS for vel ctl */
@property(nonatomic, readwrite, strong, null_resettable) GPBDoubleValue *kFStatic;
/** Test to see if @c kFStatic has been set. */
@property(nonatomic, readwrite) BOOL hasKFStatic;

/** kV for vel ctl */
@property(nonatomic, readwrite, strong, null_resettable) GPBDoubleValue *kFLinear;
/** Test to see if @c kFLinear has been set. */
@property(nonatomic, readwrite) BOOL hasKFLinear;

/** kA for vel ctl */
@property(nonatomic, readwrite, strong, null_resettable) GPBDoubleValue *kFLinearPerTime;
/** Test to see if @c kFLinearPerTime has been set. */
@property(nonatomic, readwrite) BOOL hasKFLinearPerTime;

/** kG for elevator ctl */
@property(nonatomic, readwrite, strong, null_resettable) GPBDoubleValue *kFConstant;
/** Test to see if @c kFConstant has been set. */
@property(nonatomic, readwrite) BOOL hasKFConstant;

/** "ultimate gain" for ziegler-nichols */
@property(nonatomic, readwrite, strong, null_resettable) GPBDoubleValue *kU;
/** Test to see if @c kU has been set. */
@property(nonatomic, readwrite) BOOL hasKU;

/** period of oscillation for ziegler-nichols */
@property(nonatomic, readwrite, strong, null_resettable) GPBDoubleValue *tU;
/** Test to see if @c tU has been set. */
@property(nonatomic, readwrite) BOOL hasTU;

/** ziegler-nichols meta-gains to derive PID from using kU */
@property(nonatomic, readwrite) ZNControlRule znControlRule;

@end

/**
 * Fetches the raw value of a @c ControlGains's @c znControlRule property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t ControlGains_ZnControlRule_RawValue(ControlGains *message);
/**
 * Sets the raw value of an @c ControlGains's @c znControlRule property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetControlGains_ZnControlRule_RawValue(ControlGains *message, int32_t value);

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)

// clang-format on
