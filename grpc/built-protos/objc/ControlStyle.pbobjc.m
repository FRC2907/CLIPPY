// Generated by the protocol buffer compiler.  DO NOT EDIT!
// clang-format off
// source: ControlStyle.proto

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

#import "ControlStyle.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"
#pragma clang diagnostic ignored "-Wdollar-in-identifier-extension"

#pragma mark - Objective-C Class declarations
// Forward declarations of Objective-C classes that we can use as
// static values in struct initializers.
// We don't use [Foo class] because it is not a static value.
GPBObjCClassDeclaration(ControlStyle);
GPBObjCClassDeclaration(GPBTimestamp);

#pragma mark - ControlStyleRoot

@implementation ControlStyleRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

static GPBFileDescription ControlStyleRoot_FileDescription = {
  .package = "CLIPPY.control",
  .prefix = NULL,
  .syntax = GPBFileSyntaxProto3
};

#pragma mark - Enum ControlStyleEnum

GPBEnumDescriptor *ControlStyleEnum_EnumDescriptor(void) {
  static _Atomic(GPBEnumDescriptor*) descriptor = nil;
  if (!descriptor) {
    GPB_DEBUG_CHECK_RUNTIME_VERSIONS();
    static const char *valueNames =
        "NoControl\000ManualDs\000Manual\000Planner\000";
    static const int32_t values[] = {
        ControlStyleEnum_NoControl,
        ControlStyleEnum_ManualDs,
        ControlStyleEnum_Manual,
        ControlStyleEnum_Planner,
    };
    GPBEnumDescriptor *worker =
        [GPBEnumDescriptor allocDescriptorForName:GPBNSStringifySymbol(ControlStyleEnum)
                                       valueNames:valueNames
                                           values:values
                                            count:(uint32_t)(sizeof(values) / sizeof(int32_t))
                                     enumVerifier:ControlStyleEnum_IsValidValue
                                            flags:GPBEnumDescriptorInitializationFlag_None];
    GPBEnumDescriptor *expected = nil;
    if (!atomic_compare_exchange_strong(&descriptor, &expected, worker)) {
      [worker release];
    }
  }
  return descriptor;
}

BOOL ControlStyleEnum_IsValidValue(int32_t value__) {
  switch (value__) {
    case ControlStyleEnum_NoControl:
    case ControlStyleEnum_ManualDs:
    case ControlStyleEnum_Manual:
    case ControlStyleEnum_Planner:
      return YES;
    default:
      return NO;
  }
}

#pragma mark - ControlStyle

@implementation ControlStyle

@dynamic hasTimestamp, timestamp;
@dynamic controlStyle;

typedef struct ControlStyle__storage_ {
  uint32_t _has_storage_[1];
  ControlStyleEnum controlStyle;
  GPBTimestamp *timestamp;
} ControlStyle__storage_;

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
        .number = ControlStyle_FieldNumber_Timestamp,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(ControlStyle__storage_, timestamp),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "controlStyle",
        .dataTypeSpecific.enumDescFunc = ControlStyleEnum_EnumDescriptor,
        .number = ControlStyle_FieldNumber_ControlStyle,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(ControlStyle__storage_, controlStyle),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeEnum,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:GPBObjCClass(ControlStyle)
                                   messageName:@"ControlStyle"
                               fileDescription:&ControlStyleRoot_FileDescription
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(ControlStyle__storage_)
                                         flags:(GPBDescriptorInitializationFlags)(GPBDescriptorInitializationFlag_UsesClassRefs | GPBDescriptorInitializationFlag_Proto3OptionalKnown | GPBDescriptorInitializationFlag_ClosedEnumSupportKnown)];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

int32_t ControlStyle_ControlStyle_RawValue(ControlStyle *message) {
  GPBDescriptor *descriptor = [ControlStyle descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:ControlStyle_FieldNumber_ControlStyle];
  return GPBGetMessageRawEnumField(message, field);
}

void SetControlStyle_ControlStyle_RawValue(ControlStyle *message, int32_t value) {
  GPBDescriptor *descriptor = [ControlStyle descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:ControlStyle_FieldNumber_ControlStyle];
  GPBSetMessageRawEnumField(message, field, value);
}


#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)

// clang-format on
