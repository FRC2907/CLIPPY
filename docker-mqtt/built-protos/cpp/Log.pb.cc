// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Log.proto

#include "Log.pb.h"

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
        template <typename>
PROTOBUF_CONSTEXPR Log_LogRecord::Log_LogRecord(::_pbi::ConstantInitialized)
    : _impl_{
      /*decltype(_impl_._has_bits_)*/ {},
      /*decltype(_impl_._cached_size_)*/ {},
      /*decltype(_impl_.key_)*/ {
          &::_pbi::fixed_address_empty_string,
          ::_pbi::ConstantInitialized{},
      },
      /*decltype(_impl_.value_)*/ {
          &::_pbi::fixed_address_empty_string,
          ::_pbi::ConstantInitialized{},
      },
      /*decltype(_impl_.timestamp_)*/ nullptr,
    } {}
struct Log_LogRecordDefaultTypeInternal {
  PROTOBUF_CONSTEXPR Log_LogRecordDefaultTypeInternal() : _instance(::_pbi::ConstantInitialized{}) {}
  ~Log_LogRecordDefaultTypeInternal() {}
  union {
    Log_LogRecord _instance;
  };
};

PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT
    PROTOBUF_ATTRIBUTE_INIT_PRIORITY1 Log_LogRecordDefaultTypeInternal _Log_LogRecord_default_instance_;
        template <typename>
PROTOBUF_CONSTEXPR Log::Log(::_pbi::ConstantInitialized)
    : _impl_{
      /*decltype(_impl_.records_)*/ {},
      /*decltype(_impl_._cached_size_)*/ {},
    } {}
struct LogDefaultTypeInternal {
  PROTOBUF_CONSTEXPR LogDefaultTypeInternal() : _instance(::_pbi::ConstantInitialized{}) {}
  ~LogDefaultTypeInternal() {}
  union {
    Log _instance;
  };
};

PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT
    PROTOBUF_ATTRIBUTE_INIT_PRIORITY1 LogDefaultTypeInternal _Log_default_instance_;
}  // namespace log
}  // namespace CLIPPY
static ::_pb::Metadata file_level_metadata_Log_2eproto[2];
static constexpr const ::_pb::EnumDescriptor**
    file_level_enum_descriptors_Log_2eproto = nullptr;
static constexpr const ::_pb::ServiceDescriptor**
    file_level_service_descriptors_Log_2eproto = nullptr;
const ::uint32_t TableStruct_Log_2eproto::offsets[] PROTOBUF_SECTION_VARIABLE(
    protodesc_cold) = {
    PROTOBUF_FIELD_OFFSET(::CLIPPY::log::Log_LogRecord, _impl_._has_bits_),
    PROTOBUF_FIELD_OFFSET(::CLIPPY::log::Log_LogRecord, _internal_metadata_),
    ~0u,  // no _extensions_
    ~0u,  // no _oneof_case_
    ~0u,  // no _weak_field_map_
    ~0u,  // no _inlined_string_donated_
    ~0u,  // no _split_
    ~0u,  // no sizeof(Split)
    PROTOBUF_FIELD_OFFSET(::CLIPPY::log::Log_LogRecord, _impl_.timestamp_),
    PROTOBUF_FIELD_OFFSET(::CLIPPY::log::Log_LogRecord, _impl_.key_),
    PROTOBUF_FIELD_OFFSET(::CLIPPY::log::Log_LogRecord, _impl_.value_),
    0,
    ~0u,
    ~0u,
    ~0u,  // no _has_bits_
    PROTOBUF_FIELD_OFFSET(::CLIPPY::log::Log, _internal_metadata_),
    ~0u,  // no _extensions_
    ~0u,  // no _oneof_case_
    ~0u,  // no _weak_field_map_
    ~0u,  // no _inlined_string_donated_
    ~0u,  // no _split_
    ~0u,  // no sizeof(Split)
    PROTOBUF_FIELD_OFFSET(::CLIPPY::log::Log, _impl_.records_),
};

static const ::_pbi::MigrationSchema
    schemas[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
        {0, 11, -1, sizeof(::CLIPPY::log::Log_LogRecord)},
        {14, -1, -1, sizeof(::CLIPPY::log::Log)},
};

static const ::_pb::Message* const file_default_instances[] = {
    &::CLIPPY::log::_Log_LogRecord_default_instance_._instance,
    &::CLIPPY::log::_Log_default_instance_._instance,
};
const char descriptor_table_protodef_Log_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
    "\n\tLog.proto\022\nCLIPPY.log\032\037google/protobuf"
    "/timestamp.proto\"\211\001\n\003Log\022*\n\007records\030\001 \003("
    "\0132\031.CLIPPY.log.Log.LogRecord\032V\n\tLogRecor"
    "d\022-\n\ttimestamp\030\001 \001(\0132\032.google.protobuf.T"
    "imestamp\022\013\n\003key\030\002 \001(\t\022\r\n\005value\030\003 \001(\tb\006pr"
    "oto3"
};
static const ::_pbi::DescriptorTable* const descriptor_table_Log_2eproto_deps[1] =
    {
        &::descriptor_table_google_2fprotobuf_2ftimestamp_2eproto,
};
static ::absl::once_flag descriptor_table_Log_2eproto_once;
const ::_pbi::DescriptorTable descriptor_table_Log_2eproto = {
    false,
    false,
    204,
    descriptor_table_protodef_Log_2eproto,
    "Log.proto",
    &descriptor_table_Log_2eproto_once,
    descriptor_table_Log_2eproto_deps,
    1,
    2,
    schemas,
    file_default_instances,
    TableStruct_Log_2eproto::offsets,
    file_level_metadata_Log_2eproto,
    file_level_enum_descriptors_Log_2eproto,
    file_level_service_descriptors_Log_2eproto,
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
PROTOBUF_ATTRIBUTE_WEAK const ::_pbi::DescriptorTable* descriptor_table_Log_2eproto_getter() {
  return &descriptor_table_Log_2eproto;
}
// Force running AddDescriptors() at dynamic initialization time.
PROTOBUF_ATTRIBUTE_INIT_PRIORITY2
static ::_pbi::AddDescriptorsRunner dynamic_init_dummy_Log_2eproto(&descriptor_table_Log_2eproto);
namespace CLIPPY {
namespace log {
// ===================================================================

class Log_LogRecord::_Internal {
 public:
  using HasBits = decltype(std::declval<Log_LogRecord>()._impl_._has_bits_);
  static constexpr ::int32_t kHasBitsOffset =
    8 * PROTOBUF_FIELD_OFFSET(Log_LogRecord, _impl_._has_bits_);
  static const ::google::protobuf::Timestamp& timestamp(const Log_LogRecord* msg);
  static void set_has_timestamp(HasBits* has_bits) {
    (*has_bits)[0] |= 1u;
  }
};

const ::google::protobuf::Timestamp& Log_LogRecord::_Internal::timestamp(const Log_LogRecord* msg) {
  return *msg->_impl_.timestamp_;
}
void Log_LogRecord::clear_timestamp() {
  if (_impl_.timestamp_ != nullptr) _impl_.timestamp_->Clear();
  _impl_._has_bits_[0] &= ~0x00000001u;
}
Log_LogRecord::Log_LogRecord(::google::protobuf::Arena* arena)
    : ::google::protobuf::Message(arena) {
  SharedCtor(arena);
  // @@protoc_insertion_point(arena_constructor:CLIPPY.log.Log.LogRecord)
}
Log_LogRecord::Log_LogRecord(const Log_LogRecord& from) : ::google::protobuf::Message() {
  Log_LogRecord* const _this = this;
  (void)_this;
  new (&_impl_) Impl_{
      decltype(_impl_._has_bits_){from._impl_._has_bits_},
      /*decltype(_impl_._cached_size_)*/ {},
      decltype(_impl_.key_){},
      decltype(_impl_.value_){},
      decltype(_impl_.timestamp_){nullptr},
  };
  _internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(
      from._internal_metadata_);
  _impl_.key_.InitDefault();
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
        _impl_.key_.Set("", GetArenaForAllocation());
  #endif  // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  if (!from._internal_key().empty()) {
    _this->_impl_.key_.Set(from._internal_key(), _this->GetArenaForAllocation());
  }
  _impl_.value_.InitDefault();
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
        _impl_.value_.Set("", GetArenaForAllocation());
  #endif  // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  if (!from._internal_value().empty()) {
    _this->_impl_.value_.Set(from._internal_value(), _this->GetArenaForAllocation());
  }
  if ((from._impl_._has_bits_[0] & 0x00000001u) != 0) {
    _this->_impl_.timestamp_ = new ::google::protobuf::Timestamp(*from._impl_.timestamp_);
  }

  // @@protoc_insertion_point(copy_constructor:CLIPPY.log.Log.LogRecord)
}
inline void Log_LogRecord::SharedCtor(::_pb::Arena* arena) {
  (void)arena;
  new (&_impl_) Impl_{
      decltype(_impl_._has_bits_){},
      /*decltype(_impl_._cached_size_)*/ {},
      decltype(_impl_.key_){},
      decltype(_impl_.value_){},
      decltype(_impl_.timestamp_){nullptr},
  };
  _impl_.key_.InitDefault();
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
        _impl_.key_.Set("", GetArenaForAllocation());
  #endif  // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  _impl_.value_.InitDefault();
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
        _impl_.value_.Set("", GetArenaForAllocation());
  #endif  // PROTOBUF_FORCE_COPY_DEFAULT_STRING
}
Log_LogRecord::~Log_LogRecord() {
  // @@protoc_insertion_point(destructor:CLIPPY.log.Log.LogRecord)
  _internal_metadata_.Delete<::google::protobuf::UnknownFieldSet>();
  SharedDtor();
}
inline void Log_LogRecord::SharedDtor() {
  ABSL_DCHECK(GetArenaForAllocation() == nullptr);
  _impl_.key_.Destroy();
  _impl_.value_.Destroy();
  if (this != internal_default_instance()) delete _impl_.timestamp_;
}
void Log_LogRecord::SetCachedSize(int size) const {
  _impl_._cached_size_.Set(size);
}

PROTOBUF_NOINLINE void Log_LogRecord::Clear() {
// @@protoc_insertion_point(message_clear_start:CLIPPY.log.Log.LogRecord)
  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  _impl_.key_.ClearToEmpty();
  _impl_.value_.ClearToEmpty();
  cached_has_bits = _impl_._has_bits_[0];
  if (cached_has_bits & 0x00000001u) {
    ABSL_DCHECK(_impl_.timestamp_ != nullptr);
    _impl_.timestamp_->Clear();
  }
  _impl_._has_bits_.Clear();
  _internal_metadata_.Clear<::google::protobuf::UnknownFieldSet>();
}

const char* Log_LogRecord::_InternalParse(
    const char* ptr, ::_pbi::ParseContext* ctx) {
  ptr = ::_pbi::TcParser::ParseLoop(this, ptr, ctx, &_table_.header);
  return ptr;
}


PROTOBUF_CONSTINIT PROTOBUF_ATTRIBUTE_INIT_PRIORITY1
const ::_pbi::TcParseTable<2, 3, 1, 41, 2> Log_LogRecord::_table_ = {
  {
    PROTOBUF_FIELD_OFFSET(Log_LogRecord, _impl_._has_bits_),
    0, // no _extensions_
    3, 24,  // max_field_number, fast_idx_mask
    offsetof(decltype(_table_), field_lookup_table),
    4294967288,  // skipmap
    offsetof(decltype(_table_), field_entries),
    3,  // num_field_entries
    1,  // num_aux_entries
    offsetof(decltype(_table_), aux_entries),
    &_Log_LogRecord_default_instance_._instance,
    ::_pbi::TcParser::GenericFallback,  // fallback
  }, {{
    {::_pbi::TcParser::MiniParse, {}},
    // .google.protobuf.Timestamp timestamp = 1;
    {::_pbi::TcParser::FastMtS1,
     {10, 0, 0, PROTOBUF_FIELD_OFFSET(Log_LogRecord, _impl_.timestamp_)}},
    // string key = 2;
    {::_pbi::TcParser::FastUS1,
     {18, 63, 0, PROTOBUF_FIELD_OFFSET(Log_LogRecord, _impl_.key_)}},
    // string value = 3;
    {::_pbi::TcParser::FastUS1,
     {26, 63, 0, PROTOBUF_FIELD_OFFSET(Log_LogRecord, _impl_.value_)}},
  }}, {{
    65535, 65535
  }}, {{
    // .google.protobuf.Timestamp timestamp = 1;
    {PROTOBUF_FIELD_OFFSET(Log_LogRecord, _impl_.timestamp_), _Internal::kHasBitsOffset + 0, 0,
    (0 | ::_fl::kFcOptional | ::_fl::kMessage | ::_fl::kTvTable)},
    // string key = 2;
    {PROTOBUF_FIELD_OFFSET(Log_LogRecord, _impl_.key_), -1, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kUtf8String | ::_fl::kRepAString)},
    // string value = 3;
    {PROTOBUF_FIELD_OFFSET(Log_LogRecord, _impl_.value_), -1, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kUtf8String | ::_fl::kRepAString)},
  }}, {{
    {::_pbi::TcParser::GetTable<::google::protobuf::Timestamp>()},
  }}, {{
    "\30\0\3\5\0\0\0\0"
    "CLIPPY.log.Log.LogRecord"
    "key"
    "value"
  }},
};

::uint8_t* Log_LogRecord::_InternalSerialize(
    ::uint8_t* target,
    ::google::protobuf::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:CLIPPY.log.Log.LogRecord)
  ::uint32_t cached_has_bits = 0;
  (void)cached_has_bits;

  cached_has_bits = _impl_._has_bits_[0];
  // .google.protobuf.Timestamp timestamp = 1;
  if (cached_has_bits & 0x00000001u) {
    target = ::google::protobuf::internal::WireFormatLite::
      InternalWriteMessage(1, _Internal::timestamp(this),
        _Internal::timestamp(this).GetCachedSize(), target, stream);
  }

  // string key = 2;
  if (!this->_internal_key().empty()) {
    const std::string& _s = this->_internal_key();
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
        _s.data(), static_cast<int>(_s.length()), ::google::protobuf::internal::WireFormatLite::SERIALIZE, "CLIPPY.log.Log.LogRecord.key");
    target = stream->WriteStringMaybeAliased(2, _s, target);
  }

  // string value = 3;
  if (!this->_internal_value().empty()) {
    const std::string& _s = this->_internal_value();
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
        _s.data(), static_cast<int>(_s.length()), ::google::protobuf::internal::WireFormatLite::SERIALIZE, "CLIPPY.log.Log.LogRecord.value");
    target = stream->WriteStringMaybeAliased(3, _s, target);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target =
        ::_pbi::WireFormat::InternalSerializeUnknownFieldsToArray(
            _internal_metadata_.unknown_fields<::google::protobuf::UnknownFieldSet>(::google::protobuf::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:CLIPPY.log.Log.LogRecord)
  return target;
}

::size_t Log_LogRecord::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:CLIPPY.log.Log.LogRecord)
  ::size_t total_size = 0;

  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // string key = 2;
  if (!this->_internal_key().empty()) {
    total_size += 1 + ::google::protobuf::internal::WireFormatLite::StringSize(
                                    this->_internal_key());
  }

  // string value = 3;
  if (!this->_internal_value().empty()) {
    total_size += 1 + ::google::protobuf::internal::WireFormatLite::StringSize(
                                    this->_internal_value());
  }

  // .google.protobuf.Timestamp timestamp = 1;
  cached_has_bits = _impl_._has_bits_[0];
  if (cached_has_bits & 0x00000001u) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::MessageSize(
        *_impl_.timestamp_);
  }

  return MaybeComputeUnknownFieldsSize(total_size, &_impl_._cached_size_);
}

const ::google::protobuf::Message::ClassData Log_LogRecord::_class_data_ = {
    ::google::protobuf::Message::CopyWithSourceCheck,
    Log_LogRecord::MergeImpl
};
const ::google::protobuf::Message::ClassData*Log_LogRecord::GetClassData() const { return &_class_data_; }


void Log_LogRecord::MergeImpl(::google::protobuf::Message& to_msg, const ::google::protobuf::Message& from_msg) {
  auto* const _this = static_cast<Log_LogRecord*>(&to_msg);
  auto& from = static_cast<const Log_LogRecord&>(from_msg);
  // @@protoc_insertion_point(class_specific_merge_from_start:CLIPPY.log.Log.LogRecord)
  ABSL_DCHECK_NE(&from, _this);
  ::uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  if (!from._internal_key().empty()) {
    _this->_internal_set_key(from._internal_key());
  }
  if (!from._internal_value().empty()) {
    _this->_internal_set_value(from._internal_value());
  }
  if ((from._impl_._has_bits_[0] & 0x00000001u) != 0) {
    _this->_internal_mutable_timestamp()->::google::protobuf::Timestamp::MergeFrom(
        from._internal_timestamp());
  }
  _this->_internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(from._internal_metadata_);
}

void Log_LogRecord::CopyFrom(const Log_LogRecord& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:CLIPPY.log.Log.LogRecord)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

PROTOBUF_NOINLINE bool Log_LogRecord::IsInitialized() const {
  return true;
}

void Log_LogRecord::InternalSwap(Log_LogRecord* other) {
  using std::swap;
  auto* lhs_arena = GetArenaForAllocation();
  auto* rhs_arena = other->GetArenaForAllocation();
  _internal_metadata_.InternalSwap(&other->_internal_metadata_);
  swap(_impl_._has_bits_[0], other->_impl_._has_bits_[0]);
  ::_pbi::ArenaStringPtr::InternalSwap(&_impl_.key_, lhs_arena,
                                       &other->_impl_.key_, rhs_arena);
  ::_pbi::ArenaStringPtr::InternalSwap(&_impl_.value_, lhs_arena,
                                       &other->_impl_.value_, rhs_arena);
  swap(_impl_.timestamp_, other->_impl_.timestamp_);
}

::google::protobuf::Metadata Log_LogRecord::GetMetadata() const {
  return ::_pbi::AssignDescriptors(
      &descriptor_table_Log_2eproto_getter, &descriptor_table_Log_2eproto_once,
      file_level_metadata_Log_2eproto[0]);
}
// ===================================================================

class Log::_Internal {
 public:
};

Log::Log(::google::protobuf::Arena* arena)
    : ::google::protobuf::Message(arena) {
  SharedCtor(arena);
  // @@protoc_insertion_point(arena_constructor:CLIPPY.log.Log)
}
Log::Log(const Log& from) : ::google::protobuf::Message() {
  Log* const _this = this;
  (void)_this;
  new (&_impl_) Impl_{
      decltype(_impl_.records_){from._impl_.records_},
      /*decltype(_impl_._cached_size_)*/ {},
  };
  _internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(
      from._internal_metadata_);

  // @@protoc_insertion_point(copy_constructor:CLIPPY.log.Log)
}
inline void Log::SharedCtor(::_pb::Arena* arena) {
  (void)arena;
  new (&_impl_) Impl_{
      decltype(_impl_.records_){arena},
      /*decltype(_impl_._cached_size_)*/ {},
  };
}
Log::~Log() {
  // @@protoc_insertion_point(destructor:CLIPPY.log.Log)
  _internal_metadata_.Delete<::google::protobuf::UnknownFieldSet>();
  SharedDtor();
}
inline void Log::SharedDtor() {
  ABSL_DCHECK(GetArenaForAllocation() == nullptr);
  _impl_.records_.~RepeatedPtrField();
}
void Log::SetCachedSize(int size) const {
  _impl_._cached_size_.Set(size);
}

PROTOBUF_NOINLINE void Log::Clear() {
// @@protoc_insertion_point(message_clear_start:CLIPPY.log.Log)
  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  _internal_mutable_records()->Clear();
  _internal_metadata_.Clear<::google::protobuf::UnknownFieldSet>();
}

const char* Log::_InternalParse(
    const char* ptr, ::_pbi::ParseContext* ctx) {
  ptr = ::_pbi::TcParser::ParseLoop(this, ptr, ctx, &_table_.header);
  return ptr;
}


PROTOBUF_CONSTINIT PROTOBUF_ATTRIBUTE_INIT_PRIORITY1
const ::_pbi::TcParseTable<0, 1, 1, 0, 2> Log::_table_ = {
  {
    0,  // no _has_bits_
    0, // no _extensions_
    1, 0,  // max_field_number, fast_idx_mask
    offsetof(decltype(_table_), field_lookup_table),
    4294967294,  // skipmap
    offsetof(decltype(_table_), field_entries),
    1,  // num_field_entries
    1,  // num_aux_entries
    offsetof(decltype(_table_), aux_entries),
    &_Log_default_instance_._instance,
    ::_pbi::TcParser::GenericFallback,  // fallback
  }, {{
    // repeated .CLIPPY.log.Log.LogRecord records = 1;
    {::_pbi::TcParser::FastMtR1,
     {10, 63, 0, PROTOBUF_FIELD_OFFSET(Log, _impl_.records_)}},
  }}, {{
    65535, 65535
  }}, {{
    // repeated .CLIPPY.log.Log.LogRecord records = 1;
    {PROTOBUF_FIELD_OFFSET(Log, _impl_.records_), 0, 0,
    (0 | ::_fl::kFcRepeated | ::_fl::kMessage | ::_fl::kTvTable)},
  }}, {{
    {::_pbi::TcParser::GetTable<::CLIPPY::log::Log_LogRecord>()},
  }}, {{
  }},
};

::uint8_t* Log::_InternalSerialize(
    ::uint8_t* target,
    ::google::protobuf::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:CLIPPY.log.Log)
  ::uint32_t cached_has_bits = 0;
  (void)cached_has_bits;

  // repeated .CLIPPY.log.Log.LogRecord records = 1;
  for (unsigned i = 0,
      n = static_cast<unsigned>(this->_internal_records_size()); i < n; i++) {
    const auto& repfield = this->_internal_records().Get(i);
    target = ::google::protobuf::internal::WireFormatLite::
        InternalWriteMessage(1, repfield, repfield.GetCachedSize(), target, stream);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target =
        ::_pbi::WireFormat::InternalSerializeUnknownFieldsToArray(
            _internal_metadata_.unknown_fields<::google::protobuf::UnknownFieldSet>(::google::protobuf::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:CLIPPY.log.Log)
  return target;
}

::size_t Log::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:CLIPPY.log.Log)
  ::size_t total_size = 0;

  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // repeated .CLIPPY.log.Log.LogRecord records = 1;
  total_size += 1UL * this->_internal_records_size();
  for (const auto& msg : this->_internal_records()) {
    total_size +=
      ::google::protobuf::internal::WireFormatLite::MessageSize(msg);
  }
  return MaybeComputeUnknownFieldsSize(total_size, &_impl_._cached_size_);
}

const ::google::protobuf::Message::ClassData Log::_class_data_ = {
    ::google::protobuf::Message::CopyWithSourceCheck,
    Log::MergeImpl
};
const ::google::protobuf::Message::ClassData*Log::GetClassData() const { return &_class_data_; }


void Log::MergeImpl(::google::protobuf::Message& to_msg, const ::google::protobuf::Message& from_msg) {
  auto* const _this = static_cast<Log*>(&to_msg);
  auto& from = static_cast<const Log&>(from_msg);
  // @@protoc_insertion_point(class_specific_merge_from_start:CLIPPY.log.Log)
  ABSL_DCHECK_NE(&from, _this);
  ::uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  _this->_internal_mutable_records()->MergeFrom(from._internal_records());
  _this->_internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(from._internal_metadata_);
}

void Log::CopyFrom(const Log& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:CLIPPY.log.Log)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

PROTOBUF_NOINLINE bool Log::IsInitialized() const {
  return true;
}

void Log::InternalSwap(Log* other) {
  using std::swap;
  _internal_metadata_.InternalSwap(&other->_internal_metadata_);
  _impl_.records_.InternalSwap(&other->_impl_.records_);
}

::google::protobuf::Metadata Log::GetMetadata() const {
  return ::_pbi::AssignDescriptors(
      &descriptor_table_Log_2eproto_getter, &descriptor_table_Log_2eproto_once,
      file_level_metadata_Log_2eproto[1]);
}
// @@protoc_insertion_point(namespace_scope)
}  // namespace log
}  // namespace CLIPPY
namespace google {
namespace protobuf {
}  // namespace protobuf
}  // namespace google
// @@protoc_insertion_point(global_scope)
#include "google/protobuf/port_undef.inc"
