// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Logger.proto

#include "Logger.pb.h"

#include <algorithm>
#include "google/protobuf/io/coded_stream.h"
#include "google/protobuf/extension_set.h"
#include "google/protobuf/wire_format_lite.h"
#include "google/protobuf/descriptor.h"
#include "google/protobuf/generated_message_reflection.h"
#include "google/protobuf/reflection_ops.h"
#include "google/protobuf/wire_format.h"
#include "google/protobuf/generated_message_tctable_impl.h"
// @@protoc_insertion_point(includes)

// Must be included last.
#include "google/protobuf/port_def.inc"
PROTOBUF_PRAGMA_INIT_SEG
namespace _pb = ::google::protobuf;
namespace _pbi = ::google::protobuf::internal;
namespace _fl = ::google::protobuf::internal::field_layout;
namespace CLIPPY {
namespace log {
}  // namespace log
}  // namespace CLIPPY
static constexpr const ::_pb::EnumDescriptor**
    file_level_enum_descriptors_Logger_2eproto = nullptr;
static constexpr const ::_pb::ServiceDescriptor**
    file_level_service_descriptors_Logger_2eproto = nullptr;
const ::uint32_t TableStruct_Logger_2eproto::offsets[1] = {};
static constexpr ::_pbi::MigrationSchema* schemas = nullptr;
static constexpr ::_pb::Message* const* file_default_instances = nullptr;
const char descriptor_table_protodef_Logger_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
    "\n\014Logger.proto\022\nCLIPPY.log\032\017LogRecord.pr"
    "oto\032\033google/protobuf/empty.proto2L\n\006Logg"
    "er\022B\n\017SubmitLogRecord\022\025.CLIPPY.log.LogRe"
    "cord\032\026.google.protobuf.Empty\"\000b\006proto3"
};
static const ::_pbi::DescriptorTable* const descriptor_table_Logger_2eproto_deps[2] =
    {
        &::descriptor_table_LogRecord_2eproto,
        &::descriptor_table_google_2fprotobuf_2fempty_2eproto,
};
static ::absl::once_flag descriptor_table_Logger_2eproto_once;
const ::_pbi::DescriptorTable descriptor_table_Logger_2eproto = {
    false,
    false,
    158,
    descriptor_table_protodef_Logger_2eproto,
    "Logger.proto",
    &descriptor_table_Logger_2eproto_once,
    descriptor_table_Logger_2eproto_deps,
    2,
    0,
    schemas,
    file_default_instances,
    TableStruct_Logger_2eproto::offsets,
    nullptr,
    file_level_enum_descriptors_Logger_2eproto,
    file_level_service_descriptors_Logger_2eproto,
};

// This function exists to be marked as weak.
// It can significantly speed up compilation by breaking up LLVM's SCC
// in the .pb.cc translation units. Large translation units see a
// reduction of more than 35% of walltime for optimized builds. Without
// the weak attribute all the messages in the file, including all the
// vtables and everything they use become part of the same SCC through
// a cycle like:
// GetMetadata -> descriptor table -> default instances ->
//   vtables -> GetMetadata
// By adding a weak function here we break the connection from the
// individual vtables back into the descriptor table.
PROTOBUF_ATTRIBUTE_WEAK const ::_pbi::DescriptorTable* descriptor_table_Logger_2eproto_getter() {
  return &descriptor_table_Logger_2eproto;
}
// Force running AddDescriptors() at dynamic initialization time.
PROTOBUF_ATTRIBUTE_INIT_PRIORITY2
static ::_pbi::AddDescriptorsRunner dynamic_init_dummy_Logger_2eproto(&descriptor_table_Logger_2eproto);
namespace CLIPPY {
namespace log {
// @@protoc_insertion_point(namespace_scope)
}  // namespace log
}  // namespace CLIPPY
namespace google {
namespace protobuf {
}  // namespace protobuf
}  // namespace google
// @@protoc_insertion_point(global_scope)
#include "google/protobuf/port_undef.inc"
