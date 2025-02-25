// Generated by the protocol buffer compiler.  DO NOT EDIT!
// clang-format off
// source: SystemState.proto

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

@class ControlGains;
@class SystemState_Measurement;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - SystemStateRoot

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
GPB_FINAL @interface SystemStateRoot : GPBRootObject
@end

#pragma mark - SystemIDs

typedef GPB_ENUM(SystemIDs_FieldNumber) {
  SystemIDs_FieldNumber_SystemIdsArray = 1,
};

GPB_FINAL @interface SystemIDs : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *systemIdsArray;
/** The number of items in @c systemIdsArray without causing the container to be created. */
@property(nonatomic, readonly) NSUInteger systemIdsArray_Count;

@end

#pragma mark - SystemTags

typedef GPB_ENUM(SystemTags_FieldNumber) {
  SystemTags_FieldNumber_SystemTagsArray = 1,
};

GPB_FINAL @interface SystemTags : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *systemTagsArray;
/** The number of items in @c systemTagsArray without causing the container to be created. */
@property(nonatomic, readonly) NSUInteger systemTagsArray_Count;

@end

#pragma mark - SystemState

typedef GPB_ENUM(SystemState_FieldNumber) {
  SystemState_FieldNumber_Timestamp = 1,
  SystemState_FieldNumber_SystemId = 2,
  SystemState_FieldNumber_State = 3,
  SystemState_FieldNumber_Gains = 4,
};

GPB_FINAL @interface SystemState : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) GPBTimestamp *timestamp;
/** Test to see if @c timestamp has been set. */
@property(nonatomic, readwrite) BOOL hasTimestamp;

@property(nonatomic, readwrite, copy, null_resettable) NSString *systemId;

@property(nonatomic, readwrite, strong, null_resettable) SystemState_Measurement *state;
/** Test to see if @c state has been set. */
@property(nonatomic, readwrite) BOOL hasState;

@property(nonatomic, readwrite, strong, null_resettable) ControlGains *gains;
/** Test to see if @c gains has been set. */
@property(nonatomic, readwrite) BOOL hasGains;

@end

#pragma mark - SystemState_Measurement

typedef GPB_ENUM(SystemState_Measurement_FieldNumber) {
  SystemState_Measurement_FieldNumber_Position = 1,
  SystemState_Measurement_FieldNumber_Velocity = 2,
  SystemState_Measurement_FieldNumber_Acceleration = 3,
  SystemState_Measurement_FieldNumber_Voltage = 4,
  SystemState_Measurement_FieldNumber_Current = 5,
  SystemState_Measurement_FieldNumber_Active = 6,
  SystemState_Measurement_FieldNumber_Triggered = 7,
  SystemState_Measurement_FieldNumber_Power = 8,
  SystemState_Measurement_FieldNumber_Energy = 9,
  SystemState_Measurement_FieldNumber_Pressure = 10,
  SystemState_Measurement_FieldNumber_Jerk = 11,
  SystemState_Measurement_FieldNumber_Temperature = 12,
};

GPB_FINAL @interface SystemState_Measurement : GPBMessage

@property(nonatomic, readwrite) double position;

@property(nonatomic, readwrite) double velocity;

@property(nonatomic, readwrite) double acceleration;

@property(nonatomic, readwrite) double voltage;

@property(nonatomic, readwrite) double current;

/** for solenoids */
@property(nonatomic, readwrite) BOOL active;

/** for boolean sensors like limit switches, beam breaks, etc. */
@property(nonatomic, readwrite) BOOL triggered;

@property(nonatomic, readwrite) double power;

@property(nonatomic, readwrite) double energy;

@property(nonatomic, readwrite) double pressure;

@property(nonatomic, readwrite) double jerk;

/** celsius */
@property(nonatomic, readwrite) double temperature;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)

// clang-format on
