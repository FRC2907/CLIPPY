// Generated by the protocol buffer compiler.  DO NOT EDIT!
// clang-format off
// source: Waypoint.proto

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

#import <stdatomic.h>

#import "Waypoint.pbobjc.h"
#import "Urgency.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"
#pragma clang diagnostic ignored "-Wdollar-in-identifier-extension"

#pragma mark - Objective-C Class declarations
// Forward declarations of Objective-C classes that we can use as
// static values in struct initializers.
// We don't use [Foo class] because it is not a static value.
GPBObjCClassDeclaration(GPBTimestamp);
GPBObjCClassDeclaration(Waypoint);

#pragma mark - WaypointRoot

@implementation WaypointRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

static GPBFileDescription WaypointRoot_FileDescription = {
  .package = "CLIPPY.control",
  .prefix = NULL,
  .syntax = GPBFileSyntaxProto3
};

#pragma mark - Enum WaypointType

GPBEnumDescriptor *WaypointType_EnumDescriptor(void) {
  static _Atomic(GPBEnumDescriptor*) descriptor = nil;
  if (!descriptor) {
    GPB_DEBUG_CHECK_RUNTIME_VERSIONS();
    static const char *valueNames =
        "Unknown\000Neutral\000Obstacle\000Free\000Target\000Sel"
        "f\000";
    static const int32_t values[] = {
        WaypointType_Unknown,
        WaypointType_Neutral,
        WaypointType_Obstacle,
        WaypointType_Free,
        WaypointType_Target,
        WaypointType_Self,
    };
    GPBEnumDescriptor *worker =
        [GPBEnumDescriptor allocDescriptorForName:GPBNSStringifySymbol(WaypointType)
                                       valueNames:valueNames
                                           values:values
                                            count:(uint32_t)(sizeof(values) / sizeof(int32_t))
                                     enumVerifier:WaypointType_IsValidValue
                                            flags:GPBEnumDescriptorInitializationFlag_None];
    GPBEnumDescriptor *expected = nil;
    if (!atomic_compare_exchange_strong(&descriptor, &expected, worker)) {
      [worker release];
    }
  }
  return descriptor;
}

BOOL WaypointType_IsValidValue(int32_t value__) {
  switch (value__) {
    case WaypointType_Unknown:
    case WaypointType_Neutral:
    case WaypointType_Obstacle:
    case WaypointType_Free:
    case WaypointType_Target:
    case WaypointType_Self:
      return YES;
    default:
      return NO;
  }
}

#pragma mark - Waypoint

@implementation Waypoint

@dynamic hasTimestamp, timestamp;
@dynamic waypointType;
@dynamic urgency;
@dynamic x;
@dynamic y;
@dynamic z;
@dynamic tXy;
@dynamic dx;
@dynamic dy;
@dynamic dz;
@dynamic dtXy;

typedef struct Waypoint__storage_ {
  uint32_t _has_storage_[1];
  WaypointType waypointType;
  Urgency urgency;
  GPBTimestamp *timestamp;
  double x;
  double y;
  double z;
  double tXy;
  double dx;
  double dy;
  double dz;
  double dtXy;
} Waypoint__storage_;

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
        .number = Waypoint_FieldNumber_Timestamp,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(Waypoint__storage_, timestamp),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "waypointType",
        .dataTypeSpecific.enumDescFunc = WaypointType_EnumDescriptor,
        .number = Waypoint_FieldNumber_WaypointType,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(Waypoint__storage_, waypointType),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "urgency",
        .dataTypeSpecific.enumDescFunc = Urgency_EnumDescriptor,
        .number = Waypoint_FieldNumber_Urgency,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(Waypoint__storage_, urgency),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "x",
        .dataTypeSpecific.clazz = Nil,
        .number = Waypoint_FieldNumber_X,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(Waypoint__storage_, x),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeDouble,
      },
      {
        .name = "y",
        .dataTypeSpecific.clazz = Nil,
        .number = Waypoint_FieldNumber_Y,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(Waypoint__storage_, y),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeDouble,
      },
      {
        .name = "z",
        .dataTypeSpecific.clazz = Nil,
        .number = Waypoint_FieldNumber_Z,
        .hasIndex = 5,
        .offset = (uint32_t)offsetof(Waypoint__storage_, z),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeDouble,
      },
      {
        .name = "tXy",
        .dataTypeSpecific.clazz = Nil,
        .number = Waypoint_FieldNumber_TXy,
        .hasIndex = 6,
        .offset = (uint32_t)offsetof(Waypoint__storage_, tXy),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeDouble,
      },
      {
        .name = "dx",
        .dataTypeSpecific.clazz = Nil,
        .number = Waypoint_FieldNumber_Dx,
        .hasIndex = 7,
        .offset = (uint32_t)offsetof(Waypoint__storage_, dx),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeDouble,
      },
      {
        .name = "dy",
        .dataTypeSpecific.clazz = Nil,
        .number = Waypoint_FieldNumber_Dy,
        .hasIndex = 8,
        .offset = (uint32_t)offsetof(Waypoint__storage_, dy),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeDouble,
      },
      {
        .name = "dz",
        .dataTypeSpecific.clazz = Nil,
        .number = Waypoint_FieldNumber_Dz,
        .hasIndex = 9,
        .offset = (uint32_t)offsetof(Waypoint__storage_, dz),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeDouble,
      },
      {
        .name = "dtXy",
        .dataTypeSpecific.clazz = Nil,
        .number = Waypoint_FieldNumber_DtXy,
        .hasIndex = 10,
        .offset = (uint32_t)offsetof(Waypoint__storage_, dtXy),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeDouble,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:GPBObjCClass(Waypoint)
                                   messageName:@"Waypoint"
                               fileDescription:&WaypointRoot_FileDescription
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(Waypoint__storage_)
                                         flags:(GPBDescriptorInitializationFlags)(GPBDescriptorInitializationFlag_UsesClassRefs | GPBDescriptorInitializationFlag_Proto3OptionalKnown | GPBDescriptorInitializationFlag_ClosedEnumSupportKnown)];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

int32_t Waypoint_WaypointType_RawValue(Waypoint *message) {
  GPBDescriptor *descriptor = [Waypoint descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:Waypoint_FieldNumber_WaypointType];
  return GPBGetMessageRawEnumField(message, field);
}

void SetWaypoint_WaypointType_RawValue(Waypoint *message, int32_t value) {
  GPBDescriptor *descriptor = [Waypoint descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:Waypoint_FieldNumber_WaypointType];
  GPBSetMessageRawEnumField(message, field, value);
}

int32_t Waypoint_Urgency_RawValue(Waypoint *message) {
  GPBDescriptor *descriptor = [Waypoint descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:Waypoint_FieldNumber_Urgency];
  return GPBGetMessageRawEnumField(message, field);
}

void SetWaypoint_Urgency_RawValue(Waypoint *message, int32_t value) {
  GPBDescriptor *descriptor = [Waypoint descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:Waypoint_FieldNumber_Urgency];
  GPBSetMessageRawEnumField(message, field, value);
}


#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)

// clang-format on