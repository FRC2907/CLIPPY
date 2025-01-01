// Generated by the protocol buffer compiler.  DO NOT EDIT!
// clang-format off
// source: LogRecord.proto

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

#import "LogRecord.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"
#pragma clang diagnostic ignored "-Wdollar-in-identifier-extension"

#pragma mark - Objective-C Class declarations
// Forward declarations of Objective-C classes that we can use as
// static values in struct initializers.
// We don't use [Foo class] because it is not a static value.
GPBObjCClassDeclaration(GPBTimestamp);
GPBObjCClassDeclaration(LogRecord);

#pragma mark - LogRecordRoot

@implementation LogRecordRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

static GPBFileDescription LogRecordRoot_FileDescription = {
  .package = "CLIPPY.log",
  .prefix = NULL,
  .syntax = GPBFileSyntaxProto3
};

#pragma mark - Enum LogSeverity

GPBEnumDescriptor *LogSeverity_EnumDescriptor(void) {
  static _Atomic(GPBEnumDescriptor*) descriptor = nil;
  if (!descriptor) {
    GPB_DEBUG_CHECK_RUNTIME_VERSIONS();
    static const char *valueNames =
        "Unknown\000Trace\000Debug\000Info\000Ok\000Warn\000Error\000";
    static const int32_t values[] = {
        LogSeverity_Unknown,
        LogSeverity_Trace,
        LogSeverity_Debug,
        LogSeverity_Info,
        LogSeverity_Ok,
        LogSeverity_Warn,
        LogSeverity_Error,
    };
    GPBEnumDescriptor *worker =
        [GPBEnumDescriptor allocDescriptorForName:GPBNSStringifySymbol(LogSeverity)
                                       valueNames:valueNames
                                           values:values
                                            count:(uint32_t)(sizeof(values) / sizeof(int32_t))
                                     enumVerifier:LogSeverity_IsValidValue
                                            flags:GPBEnumDescriptorInitializationFlag_None];
    GPBEnumDescriptor *expected = nil;
    if (!atomic_compare_exchange_strong(&descriptor, &expected, worker)) {
      [worker release];
    }
  }
  return descriptor;
}

BOOL LogSeverity_IsValidValue(int32_t value__) {
  switch (value__) {
    case LogSeverity_Unknown:
    case LogSeverity_Trace:
    case LogSeverity_Debug:
    case LogSeverity_Info:
    case LogSeverity_Ok:
    case LogSeverity_Warn:
    case LogSeverity_Error:
      return YES;
    default:
      return NO;
  }
}

#pragma mark - LogRecord

@implementation LogRecord

@dynamic hasTimestamp, timestamp;
@dynamic reporter;
@dynamic severity;
@dynamic value;

typedef struct LogRecord__storage_ {
  uint32_t _has_storage_[1];
  LogSeverity severity;
  GPBTimestamp *timestamp;
  NSString *reporter;
  NSString *value;
} LogRecord__storage_;

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
        .number = LogRecord_FieldNumber_Timestamp,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(LogRecord__storage_, timestamp),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "reporter",
        .dataTypeSpecific.clazz = Nil,
        .number = LogRecord_FieldNumber_Reporter,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(LogRecord__storage_, reporter),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "severity",
        .dataTypeSpecific.enumDescFunc = LogSeverity_EnumDescriptor,
        .number = LogRecord_FieldNumber_Severity,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(LogRecord__storage_, severity),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "value",
        .dataTypeSpecific.clazz = Nil,
        .number = LogRecord_FieldNumber_Value,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(LogRecord__storage_, value),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:GPBObjCClass(LogRecord)
                                   messageName:@"LogRecord"
                               fileDescription:&LogRecordRoot_FileDescription
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(LogRecord__storage_)
                                         flags:(GPBDescriptorInitializationFlags)(GPBDescriptorInitializationFlag_UsesClassRefs | GPBDescriptorInitializationFlag_Proto3OptionalKnown | GPBDescriptorInitializationFlag_ClosedEnumSupportKnown)];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

int32_t LogRecord_Severity_RawValue(LogRecord *message) {
  GPBDescriptor *descriptor = [LogRecord descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:LogRecord_FieldNumber_Severity];
  return GPBGetMessageRawEnumField(message, field);
}

void SetLogRecord_Severity_RawValue(LogRecord *message, int32_t value) {
  GPBDescriptor *descriptor = [LogRecord descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:LogRecord_FieldNumber_Severity];
  GPBSetMessageRawEnumField(message, field, value);
}


#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)

// clang-format on