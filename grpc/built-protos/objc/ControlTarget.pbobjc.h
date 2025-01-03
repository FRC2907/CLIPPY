// Generated by the protocol buffer compiler.  DO NOT EDIT!
// clang-format off
// source: ControlTarget.proto

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

@class ControlTarget;
GPB_ENUM_FWD_DECLARE(Urgency);

NS_ASSUME_NONNULL_BEGIN

#pragma mark - ControlTargetRoot

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
GPB_FINAL @interface ControlTargetRoot : GPBRootObject
@end

#pragma mark - ControlTarget

typedef GPB_ENUM(ControlTarget_FieldNumber) {
  ControlTarget_FieldNumber_Timestamp = 1,
  ControlTarget_FieldNumber_SystemId = 2,
  ControlTarget_FieldNumber_Urgency = 3,
  ControlTarget_FieldNumber_Voltage = 7,
  ControlTarget_FieldNumber_Current = 8,
  ControlTarget_FieldNumber_Position = 9,
  ControlTarget_FieldNumber_Velocity = 10,
  ControlTarget_FieldNumber_Acceleration = 11,
  ControlTarget_FieldNumber_Active = 12,
};

typedef GPB_ENUM(ControlTarget_Target_OneOfCase) {
  ControlTarget_Target_OneOfCase_GPBUnsetOneOfCase = 0,
  ControlTarget_Target_OneOfCase_Voltage = 7,
  ControlTarget_Target_OneOfCase_Current = 8,
  ControlTarget_Target_OneOfCase_Position = 9,
  ControlTarget_Target_OneOfCase_Velocity = 10,
  ControlTarget_Target_OneOfCase_Acceleration = 11,
  ControlTarget_Target_OneOfCase_Active = 12,
};

GPB_FINAL @interface ControlTarget : GPBMessage

/** Timestamp at which this target takes effect (empty for "now") */
@property(nonatomic, readwrite, strong, null_resettable) GPBTimestamp *timestamp;
/** Test to see if @c timestamp has been set. */
@property(nonatomic, readwrite) BOOL hasTimestamp;

@property(nonatomic, readwrite, copy, null_resettable) NSString *systemId;

@property(nonatomic, readwrite) enum Urgency urgency;

@property(nonatomic, readonly) ControlTarget_Target_OneOfCase targetOneOfCase;

@property(nonatomic, readwrite) double voltage;

@property(nonatomic, readwrite) double current;

@property(nonatomic, readwrite) double position;

@property(nonatomic, readwrite) double velocity;

@property(nonatomic, readwrite) double acceleration;

/** for solenoids */
@property(nonatomic, readwrite) BOOL active;

@end

/**
 * Fetches the raw value of a @c ControlTarget's @c urgency property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t ControlTarget_Urgency_RawValue(ControlTarget *message);
/**
 * Sets the raw value of an @c ControlTarget's @c urgency property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetControlTarget_Urgency_RawValue(ControlTarget *message, int32_t value);

/**
 * Clears whatever value was set for the oneof 'target'.
 **/
void ControlTarget_ClearTargetOneOfCase(ControlTarget *message);

#pragma mark - MultiSystemControlTarget

typedef GPB_ENUM(MultiSystemControlTarget_FieldNumber) {
  MultiSystemControlTarget_FieldNumber_Timestamp = 1,
  MultiSystemControlTarget_FieldNumber_Urgency = 2,
  MultiSystemControlTarget_FieldNumber_TargetsArray = 3,
};

GPB_FINAL @interface MultiSystemControlTarget : GPBMessage

/**
 * Timestamp at which this collection of ControlTargets should be processed. Omit for immediate processing
 * Not the timestamp at which they should all take effect---those are specified by each individual target
 **/
@property(nonatomic, readwrite, strong, null_resettable) GPBTimestamp *timestamp;
/** Test to see if @c timestamp has been set. */
@property(nonatomic, readwrite) BOOL hasTimestamp;

@property(nonatomic, readwrite) enum Urgency urgency;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<ControlTarget*> *targetsArray;
/** The number of items in @c targetsArray without causing the container to be created. */
@property(nonatomic, readonly) NSUInteger targetsArray_Count;

@end

/**
 * Fetches the raw value of a @c MultiSystemControlTarget's @c urgency property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t MultiSystemControlTarget_Urgency_RawValue(MultiSystemControlTarget *message);
/**
 * Sets the raw value of an @c MultiSystemControlTarget's @c urgency property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetMultiSystemControlTarget_Urgency_RawValue(MultiSystemControlTarget *message, int32_t value);

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)

// clang-format on
