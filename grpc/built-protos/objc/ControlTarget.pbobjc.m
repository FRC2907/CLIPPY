// Generated by the protocol buffer compiler.  DO NOT EDIT!
// clang-format off
// source: ControlTarget.proto

// This CPP symbol can be defined to use imports that match up to the framework
// imports needed when using CocoaPods.
#if !defined(GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS)
 #define GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS 0
#endif

#if GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS
 #import <Protobuf/GPBProtocolBuffers_RuntimeSupport.h>
#else
 #import "GPBProtocolBuffers_RuntimeSupport.h"
#endif

#if GOOGLE_PROTOBUF_OBJC_VERSION < 30007
#error This file was generated by a newer version of protoc which is incompatible with your Protocol Buffer library sources.
#endif
#if 30007 < GOOGLE_PROTOBUF_OBJC_MIN_SUPPORTED_VERSION
#error This file was generated by an older version of protoc which is incompatible with your Protocol Buffer library sources.
#endif

#import "ControlTarget.pbobjc.h"
#import "Urgency.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"
#pragma clang diagnostic ignored "-Wdirect-ivar-access"
#pragma clang diagnostic ignored "-Wdollar-in-identifier-extension"

#pragma mark - Objective-C Class declarations
// Forward declarations of Objective-C classes that we can use as
// static values in struct initializers.
// We don't use [Foo class] because it is not a static value.
GPBObjCClassDeclaration(ControlTarget);
GPBObjCClassDeclaration(GPBTimestamp);
GPBObjCClassDeclaration(MultiSystemControlTarget);

#pragma mark - ControlTargetRoot

@implementation ControlTargetRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

static GPBFileDescription ControlTargetRoot_FileDescription = {
  .package = "CLIPPY.control",
  .prefix = NULL,
  .syntax = GPBFileSyntaxProto3
};

#pragma mark - ControlTarget

@implementation ControlTarget

@dynamic outputOneOfCase;
@dynamic hasTimestamp, timestamp;
@dynamic systemId;
@dynamic urgency;
@dynamic voltage;
@dynamic current;
@dynamic position;
@dynamic velocity;
@dynamic acceleration;
@dynamic active;

typedef struct ControlTarget__storage_ {
  uint32_t _has_storage_[2];
  Urgency urgency;
  GPBTimestamp *timestamp;
  NSString *systemId;
  double voltage;
  double current;
  double position;
  double velocity;
  double acceleration;
} ControlTarget__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPB_DEBUG_CHECK_RUNTIME_VERSIONS();
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "timestamp",
        .dataTypeSpecific.clazz = GPBObjCClass(GPBTimestamp),
        .number = ControlTarget_FieldNumber_Timestamp,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(ControlTarget__storage_, timestamp),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "systemId",
        .dataTypeSpecific.clazz = Nil,
        .number = ControlTarget_FieldNumber_SystemId,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(ControlTarget__storage_, systemId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "urgency",
        .dataTypeSpecific.enumDescFunc = Urgency_EnumDescriptor,
        .number = ControlTarget_FieldNumber_Urgency,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(ControlTarget__storage_, urgency),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "voltage",
        .dataTypeSpecific.clazz = Nil,
        .number = ControlTarget_FieldNumber_Voltage,
        .hasIndex = -1,
        .offset = (uint32_t)offsetof(ControlTarget__storage_, voltage),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeDouble,
      },
      {
        .name = "current",
        .dataTypeSpecific.clazz = Nil,
        .number = ControlTarget_FieldNumber_Current,
        .hasIndex = -1,
        .offset = (uint32_t)offsetof(ControlTarget__storage_, current),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeDouble,
      },
      {
        .name = "position",
        .dataTypeSpecific.clazz = Nil,
        .number = ControlTarget_FieldNumber_Position,
        .hasIndex = -1,
        .offset = (uint32_t)offsetof(ControlTarget__storage_, position),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeDouble,
      },
      {
        .name = "velocity",
        .dataTypeSpecific.clazz = Nil,
        .number = ControlTarget_FieldNumber_Velocity,
        .hasIndex = -1,
        .offset = (uint32_t)offsetof(ControlTarget__storage_, velocity),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeDouble,
      },
      {
        .name = "acceleration",
        .dataTypeSpecific.clazz = Nil,
        .number = ControlTarget_FieldNumber_Acceleration,
        .hasIndex = -1,
        .offset = (uint32_t)offsetof(ControlTarget__storage_, acceleration),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeDouble,
      },
      {
        .name = "active",
        .dataTypeSpecific.clazz = Nil,
        .number = ControlTarget_FieldNumber_Active,
        .hasIndex = -1,
        .offset = 3,  // Stored in _has_storage_ to save space.
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeBool,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:GPBObjCClass(ControlTarget)
                                   messageName:@"ControlTarget"
                               fileDescription:&ControlTargetRoot_FileDescription
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(ControlTarget__storage_)
                                         flags:(GPBDescriptorInitializationFlags)(GPBDescriptorInitializationFlag_UsesClassRefs | GPBDescriptorInitializationFlag_Proto3OptionalKnown | GPBDescriptorInitializationFlag_ClosedEnumSupportKnown)];
    static const char *oneofs[] = {
      "output",
    };
    [localDescriptor setupOneofs:oneofs
                           count:(uint32_t)(sizeof(oneofs) / sizeof(char*))
                   firstHasIndex:-1];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

int32_t ControlTarget_Urgency_RawValue(ControlTarget *message) {
  GPBDescriptor *descriptor = [ControlTarget descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:ControlTarget_FieldNumber_Urgency];
  return GPBGetMessageRawEnumField(message, field);
}

void SetControlTarget_Urgency_RawValue(ControlTarget *message, int32_t value) {
  GPBDescriptor *descriptor = [ControlTarget descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:ControlTarget_FieldNumber_Urgency];
  GPBSetMessageRawEnumField(message, field, value);
}

void ControlTarget_ClearOutputOneOfCase(ControlTarget *message) {
  GPBDescriptor *descriptor = [ControlTarget descriptor];
  GPBOneofDescriptor *oneof = [descriptor.oneofs objectAtIndex:0];
  GPBClearOneof(message, oneof);
}
#pragma mark - MultiSystemControlTarget

@implementation MultiSystemControlTarget

@dynamic hasTimestamp, timestamp;
@dynamic urgency;
@dynamic targetsArray, targetsArray_Count;

typedef struct MultiSystemControlTarget__storage_ {
  uint32_t _has_storage_[1];
  Urgency urgency;
  GPBTimestamp *timestamp;
  NSMutableArray *targetsArray;
} MultiSystemControlTarget__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPB_DEBUG_CHECK_RUNTIME_VERSIONS();
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "timestamp",
        .dataTypeSpecific.clazz = GPBObjCClass(GPBTimestamp),
        .number = MultiSystemControlTarget_FieldNumber_Timestamp,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(MultiSystemControlTarget__storage_, timestamp),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "urgency",
        .dataTypeSpecific.enumDescFunc = Urgency_EnumDescriptor,
        .number = MultiSystemControlTarget_FieldNumber_Urgency,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(MultiSystemControlTarget__storage_, urgency),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "targetsArray",
        .dataTypeSpecific.clazz = GPBObjCClass(ControlTarget),
        .number = MultiSystemControlTarget_FieldNumber_TargetsArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(MultiSystemControlTarget__storage_, targetsArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:GPBObjCClass(MultiSystemControlTarget)
                                   messageName:@"MultiSystemControlTarget"
                               fileDescription:&ControlTargetRoot_FileDescription
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(MultiSystemControlTarget__storage_)
                                         flags:(GPBDescriptorInitializationFlags)(GPBDescriptorInitializationFlag_UsesClassRefs | GPBDescriptorInitializationFlag_Proto3OptionalKnown | GPBDescriptorInitializationFlag_ClosedEnumSupportKnown)];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

int32_t MultiSystemControlTarget_Urgency_RawValue(MultiSystemControlTarget *message) {
  GPBDescriptor *descriptor = [MultiSystemControlTarget descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:MultiSystemControlTarget_FieldNumber_Urgency];
  return GPBGetMessageRawEnumField(message, field);
}

void SetMultiSystemControlTarget_Urgency_RawValue(MultiSystemControlTarget *message, int32_t value) {
  GPBDescriptor *descriptor = [MultiSystemControlTarget descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:MultiSystemControlTarget_FieldNumber_Urgency];
  GPBSetMessageRawEnumField(message, field, value);
}


#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)

// clang-format on
