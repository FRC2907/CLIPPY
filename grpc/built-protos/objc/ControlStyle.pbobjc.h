// Generated by the protocol buffer compiler.  DO NOT EDIT!
// clang-format off
// source: ControlStyle.proto

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

#pragma mark - Enum ControlStyleEnum

typedef GPB_ENUM(ControlStyleEnum) {
  /**
   * Value used if any message's field encounters a value that is not defined
   * by this enum. The message will also have C functions to get/set the rawValue
   * of the field.
   **/
  ControlStyleEnum_GPBUnrecognizedEnumeratorValue = kGPBUnrecognizedEnumeratorValue,
  /** Go crazy go stupid */
  ControlStyleEnum_NoControl = 0,

  /** Fall back to traditional FRC controls */
  ControlStyleEnum_ManualDs = 1,

  /** Use control targets sent via gRPC directly from driver */
  ControlStyleEnum_Manual = 2,

  /** Listen for control targets from the motion planner */
  ControlStyleEnum_Planner = 3,
};

GPBEnumDescriptor *ControlStyleEnum_EnumDescriptor(void);

/**
 * Checks to see if the given value is defined by the enum or was not known at
 * the time this source was generated.
 **/
BOOL ControlStyleEnum_IsValidValue(int32_t value);

#pragma mark - ControlStyleRoot

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
GPB_FINAL @interface ControlStyleRoot : GPBRootObject
@end

#pragma mark - ControlStyle

typedef GPB_ENUM(ControlStyle_FieldNumber) {
  ControlStyle_FieldNumber_Timestamp = 1,
  ControlStyle_FieldNumber_ControlStyle = 2,
};

GPB_FINAL @interface ControlStyle : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) GPBTimestamp *timestamp;
/** Test to see if @c timestamp has been set. */
@property(nonatomic, readwrite) BOOL hasTimestamp;

@property(nonatomic, readwrite) ControlStyleEnum controlStyle;

@end

/**
 * Fetches the raw value of a @c ControlStyle's @c controlStyle property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t ControlStyle_ControlStyle_RawValue(ControlStyle *message);
/**
 * Sets the raw value of an @c ControlStyle's @c controlStyle property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetControlStyle_ControlStyle_RawValue(ControlStyle *message, int32_t value);

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)

// clang-format on
