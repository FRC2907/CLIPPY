// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ControlGains.proto

#ifndef GOOGLE_PROTOBUF_INCLUDED_ControlGains_2eproto_2epb_2eh
#define GOOGLE_PROTOBUF_INCLUDED_ControlGains_2eproto_2epb_2eh

#include <limits>
#include <string>
#include <type_traits>

#include "google/protobuf/port_def.inc"
#if PROTOBUF_VERSION < 4024000
#error "This file was generated by a newer version of protoc which is"
#error "incompatible with your Protocol Buffer headers. Please update"
#error "your headers."
#endif  // PROTOBUF_VERSION

#if 4024004 < PROTOBUF_MIN_PROTOC_VERSION
#error "This file was generated by an older version of protoc which is"
#error "incompatible with your Protocol Buffer headers. Please"
#error "regenerate this file with a newer version of protoc."
#endif  // PROTOBUF_MIN_PROTOC_VERSION
#include "google/protobuf/port_undef.inc"
#include "google/protobuf/io/coded_stream.h"
#include "google/protobuf/arena.h"
#include "google/protobuf/arenastring.h"
#include "google/protobuf/generated_message_tctable_decl.h"
#include "google/protobuf/generated_message_util.h"
#include "google/protobuf/metadata_lite.h"
#include "google/protobuf/generated_message_reflection.h"
#include "google/protobuf/message.h"
#include "google/protobuf/repeated_field.h"  // IWYU pragma: export
#include "google/protobuf/extension_set.h"  // IWYU pragma: export
#include "google/protobuf/unknown_field_set.h"
// @@protoc_insertion_point(includes)

// Must be included last.
#include "google/protobuf/port_def.inc"

#define PROTOBUF_INTERNAL_EXPORT_ControlGains_2eproto

namespace google {
namespace protobuf {
namespace internal {
class AnyMetadata;
}  // namespace internal
}  // namespace protobuf
}  // namespace google

// Internal implementation detail -- do not use these members.
struct TableStruct_ControlGains_2eproto {
  static const ::uint32_t offsets[];
};
extern const ::google::protobuf::internal::DescriptorTable
    descriptor_table_ControlGains_2eproto;
namespace CLIPPY {
namespace control {
class ControlGains;
struct ControlGainsDefaultTypeInternal;
extern ControlGainsDefaultTypeInternal _ControlGains_default_instance_;
}  // namespace control
}  // namespace CLIPPY
namespace google {
namespace protobuf {
}  // namespace protobuf
}  // namespace google

namespace CLIPPY {
namespace control {

// ===================================================================


// -------------------------------------------------------------------

class ControlGains final :
    public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:CLIPPY.control.ControlGains) */ {
 public:
  inline ControlGains() : ControlGains(nullptr) {}
  ~ControlGains() override;
  template<typename = void>
  explicit PROTOBUF_CONSTEXPR ControlGains(::google::protobuf::internal::ConstantInitialized);

  ControlGains(const ControlGains& from);
  ControlGains(ControlGains&& from) noexcept
    : ControlGains() {
    *this = ::std::move(from);
  }

  inline ControlGains& operator=(const ControlGains& from) {
    CopyFrom(from);
    return *this;
  }
  inline ControlGains& operator=(ControlGains&& from) noexcept {
    if (this == &from) return *this;
    if (GetOwningArena() == from.GetOwningArena()
  #ifdef PROTOBUF_FORCE_COPY_IN_MOVE
        && GetOwningArena() != nullptr
  #endif  // !PROTOBUF_FORCE_COPY_IN_MOVE
    ) {
      InternalSwap(&from);
    } else {
      CopyFrom(from);
    }
    return *this;
  }

  inline const ::google::protobuf::UnknownFieldSet& unknown_fields() const {
    return _internal_metadata_.unknown_fields<::google::protobuf::UnknownFieldSet>(::google::protobuf::UnknownFieldSet::default_instance);
  }
  inline ::google::protobuf::UnknownFieldSet* mutable_unknown_fields() {
    return _internal_metadata_.mutable_unknown_fields<::google::protobuf::UnknownFieldSet>();
  }

  static const ::google::protobuf::Descriptor* descriptor() {
    return GetDescriptor();
  }
  static const ::google::protobuf::Descriptor* GetDescriptor() {
    return default_instance().GetMetadata().descriptor;
  }
  static const ::google::protobuf::Reflection* GetReflection() {
    return default_instance().GetMetadata().reflection;
  }
  static const ControlGains& default_instance() {
    return *internal_default_instance();
  }
  static inline const ControlGains* internal_default_instance() {
    return reinterpret_cast<const ControlGains*>(
               &_ControlGains_default_instance_);
  }
  static constexpr int kIndexInFileMessages =
    0;

  friend void swap(ControlGains& a, ControlGains& b) {
    a.Swap(&b);
  }
  inline void Swap(ControlGains* other) {
    if (other == this) return;
  #ifdef PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetOwningArena() != nullptr &&
        GetOwningArena() == other->GetOwningArena()) {
   #else  // PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetOwningArena() == other->GetOwningArena()) {
  #endif  // !PROTOBUF_FORCE_COPY_IN_SWAP
      InternalSwap(other);
    } else {
      ::google::protobuf::internal::GenericSwap(this, other);
    }
  }
  void UnsafeArenaSwap(ControlGains* other) {
    if (other == this) return;
    ABSL_DCHECK(GetOwningArena() == other->GetOwningArena());
    InternalSwap(other);
  }

  // implements Message ----------------------------------------------

  ControlGains* New(::google::protobuf::Arena* arena = nullptr) const final {
    return CreateMaybeMessage<ControlGains>(arena);
  }
  using ::google::protobuf::Message::CopyFrom;
  void CopyFrom(const ControlGains& from);
  using ::google::protobuf::Message::MergeFrom;
  void MergeFrom( const ControlGains& from) {
    ControlGains::MergeImpl(*this, from);
  }
  private:
  static void MergeImpl(::google::protobuf::Message& to_msg, const ::google::protobuf::Message& from_msg);
  public:
  PROTOBUF_ATTRIBUTE_REINITIALIZES void Clear() final;
  bool IsInitialized() const final;

  ::size_t ByteSizeLong() const final;
  const char* _InternalParse(const char* ptr, ::google::protobuf::internal::ParseContext* ctx) final;
  ::uint8_t* _InternalSerialize(
      ::uint8_t* target, ::google::protobuf::io::EpsCopyOutputStream* stream) const final;
  int GetCachedSize() const final { return _impl_._cached_size_.Get(); }

  private:
  void SharedCtor(::google::protobuf::Arena* arena);
  void SharedDtor();
  void SetCachedSize(int size) const final;
  void InternalSwap(ControlGains* other);

  private:
  friend class ::google::protobuf::internal::AnyMetadata;
  static ::absl::string_view FullMessageName() {
    return "CLIPPY.control.ControlGains";
  }
  protected:
  explicit ControlGains(::google::protobuf::Arena* arena);
  public:

  static const ClassData _class_data_;
  const ::google::protobuf::Message::ClassData*GetClassData() const final;

  ::google::protobuf::Metadata GetMetadata() const final;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  enum : int {
    kSystemIdFieldNumber = 1,
    kKPFieldNumber = 7,
    kKIFieldNumber = 8,
    kKDFieldNumber = 9,
    kKFStaticFieldNumber = 10,
    kKFLinearFieldNumber = 11,
    kKFSquareFieldNumber = 12,
    kKFCosineFieldNumber = 13,
  };
  // string system_id = 1;
  void clear_system_id() ;
  const std::string& system_id() const;
  template <typename Arg_ = const std::string&, typename... Args_>
  void set_system_id(Arg_&& arg, Args_... args);
  std::string* mutable_system_id();
  PROTOBUF_NODISCARD std::string* release_system_id();
  void set_allocated_system_id(std::string* ptr);

  private:
  const std::string& _internal_system_id() const;
  inline PROTOBUF_ALWAYS_INLINE void _internal_set_system_id(
      const std::string& value);
  std::string* _internal_mutable_system_id();

  public:
  // double kP = 7;
  void clear_kp() ;
  double kp() const;
  void set_kp(double value);

  private:
  double _internal_kp() const;
  void _internal_set_kp(double value);

  public:
  // double kI = 8;
  void clear_ki() ;
  double ki() const;
  void set_ki(double value);

  private:
  double _internal_ki() const;
  void _internal_set_ki(double value);

  public:
  // double kD = 9;
  void clear_kd() ;
  double kd() const;
  void set_kd(double value);

  private:
  double _internal_kd() const;
  void _internal_set_kd(double value);

  public:
  // double kF_static = 10;
  void clear_kf_static() ;
  double kf_static() const;
  void set_kf_static(double value);

  private:
  double _internal_kf_static() const;
  void _internal_set_kf_static(double value);

  public:
  // double kF_linear = 11;
  void clear_kf_linear() ;
  double kf_linear() const;
  void set_kf_linear(double value);

  private:
  double _internal_kf_linear() const;
  void _internal_set_kf_linear(double value);

  public:
  // double kF_square = 12;
  void clear_kf_square() ;
  double kf_square() const;
  void set_kf_square(double value);

  private:
  double _internal_kf_square() const;
  void _internal_set_kf_square(double value);

  public:
  // double kF_cosine = 13;
  void clear_kf_cosine() ;
  double kf_cosine() const;
  void set_kf_cosine(double value);

  private:
  double _internal_kf_cosine() const;
  void _internal_set_kf_cosine(double value);

  public:
  // @@protoc_insertion_point(class_scope:CLIPPY.control.ControlGains)
 private:
  class _Internal;

  friend class ::google::protobuf::internal::TcParser;
  static const ::google::protobuf::internal::TcParseTable<4, 8, 0, 53, 2> _table_;
  template <typename T> friend class ::google::protobuf::Arena::InternalHelper;
  typedef void InternalArenaConstructable_;
  typedef void DestructorSkippable_;
  struct Impl_ {
    ::google::protobuf::internal::ArenaStringPtr system_id_;
    double kp_;
    double ki_;
    double kd_;
    double kf_static_;
    double kf_linear_;
    double kf_square_;
    double kf_cosine_;
    mutable ::google::protobuf::internal::CachedSize _cached_size_;
    PROTOBUF_TSAN_DECLARE_MEMBER
  };
  union { Impl_ _impl_; };
  friend struct ::TableStruct_ControlGains_2eproto;
};

// ===================================================================




// ===================================================================


#ifdef __GNUC__
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wstrict-aliasing"
#endif  // __GNUC__
// -------------------------------------------------------------------

// ControlGains

// string system_id = 1;
inline void ControlGains::clear_system_id() {
  _impl_.system_id_.ClearToEmpty();
}
inline const std::string& ControlGains::system_id() const {
  // @@protoc_insertion_point(field_get:CLIPPY.control.ControlGains.system_id)
  return _internal_system_id();
}
template <typename Arg_, typename... Args_>
inline PROTOBUF_ALWAYS_INLINE void ControlGains::set_system_id(Arg_&& arg,
                                                     Args_... args) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  _impl_.system_id_.Set(static_cast<Arg_&&>(arg), args..., GetArenaForAllocation());
  // @@protoc_insertion_point(field_set:CLIPPY.control.ControlGains.system_id)
}
inline std::string* ControlGains::mutable_system_id() {
  std::string* _s = _internal_mutable_system_id();
  // @@protoc_insertion_point(field_mutable:CLIPPY.control.ControlGains.system_id)
  return _s;
}
inline const std::string& ControlGains::_internal_system_id() const {
  PROTOBUF_TSAN_READ(&_impl_._tsan_detect_race);
  return _impl_.system_id_.Get();
}
inline void ControlGains::_internal_set_system_id(const std::string& value) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  _impl_.system_id_.Set(value, GetArenaForAllocation());
}
inline std::string* ControlGains::_internal_mutable_system_id() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  return _impl_.system_id_.Mutable( GetArenaForAllocation());
}
inline std::string* ControlGains::release_system_id() {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  // @@protoc_insertion_point(field_release:CLIPPY.control.ControlGains.system_id)
  return _impl_.system_id_.Release();
}
inline void ControlGains::set_allocated_system_id(std::string* value) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  _impl_.system_id_.SetAllocated(value, GetArenaForAllocation());
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
        if (_impl_.system_id_.IsDefault()) {
          _impl_.system_id_.Set("", GetArenaForAllocation());
        }
  #endif  // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  // @@protoc_insertion_point(field_set_allocated:CLIPPY.control.ControlGains.system_id)
}

// double kP = 7;
inline void ControlGains::clear_kp() {
  _impl_.kp_ = 0;
}
inline double ControlGains::kp() const {
  // @@protoc_insertion_point(field_get:CLIPPY.control.ControlGains.kP)
  return _internal_kp();
}
inline void ControlGains::set_kp(double value) {
  _internal_set_kp(value);
  // @@protoc_insertion_point(field_set:CLIPPY.control.ControlGains.kP)
}
inline double ControlGains::_internal_kp() const {
  PROTOBUF_TSAN_READ(&_impl_._tsan_detect_race);
  return _impl_.kp_;
}
inline void ControlGains::_internal_set_kp(double value) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  _impl_.kp_ = value;
}

// double kI = 8;
inline void ControlGains::clear_ki() {
  _impl_.ki_ = 0;
}
inline double ControlGains::ki() const {
  // @@protoc_insertion_point(field_get:CLIPPY.control.ControlGains.kI)
  return _internal_ki();
}
inline void ControlGains::set_ki(double value) {
  _internal_set_ki(value);
  // @@protoc_insertion_point(field_set:CLIPPY.control.ControlGains.kI)
}
inline double ControlGains::_internal_ki() const {
  PROTOBUF_TSAN_READ(&_impl_._tsan_detect_race);
  return _impl_.ki_;
}
inline void ControlGains::_internal_set_ki(double value) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  _impl_.ki_ = value;
}

// double kD = 9;
inline void ControlGains::clear_kd() {
  _impl_.kd_ = 0;
}
inline double ControlGains::kd() const {
  // @@protoc_insertion_point(field_get:CLIPPY.control.ControlGains.kD)
  return _internal_kd();
}
inline void ControlGains::set_kd(double value) {
  _internal_set_kd(value);
  // @@protoc_insertion_point(field_set:CLIPPY.control.ControlGains.kD)
}
inline double ControlGains::_internal_kd() const {
  PROTOBUF_TSAN_READ(&_impl_._tsan_detect_race);
  return _impl_.kd_;
}
inline void ControlGains::_internal_set_kd(double value) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  _impl_.kd_ = value;
}

// double kF_static = 10;
inline void ControlGains::clear_kf_static() {
  _impl_.kf_static_ = 0;
}
inline double ControlGains::kf_static() const {
  // @@protoc_insertion_point(field_get:CLIPPY.control.ControlGains.kF_static)
  return _internal_kf_static();
}
inline void ControlGains::set_kf_static(double value) {
  _internal_set_kf_static(value);
  // @@protoc_insertion_point(field_set:CLIPPY.control.ControlGains.kF_static)
}
inline double ControlGains::_internal_kf_static() const {
  PROTOBUF_TSAN_READ(&_impl_._tsan_detect_race);
  return _impl_.kf_static_;
}
inline void ControlGains::_internal_set_kf_static(double value) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  _impl_.kf_static_ = value;
}

// double kF_linear = 11;
inline void ControlGains::clear_kf_linear() {
  _impl_.kf_linear_ = 0;
}
inline double ControlGains::kf_linear() const {
  // @@protoc_insertion_point(field_get:CLIPPY.control.ControlGains.kF_linear)
  return _internal_kf_linear();
}
inline void ControlGains::set_kf_linear(double value) {
  _internal_set_kf_linear(value);
  // @@protoc_insertion_point(field_set:CLIPPY.control.ControlGains.kF_linear)
}
inline double ControlGains::_internal_kf_linear() const {
  PROTOBUF_TSAN_READ(&_impl_._tsan_detect_race);
  return _impl_.kf_linear_;
}
inline void ControlGains::_internal_set_kf_linear(double value) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  _impl_.kf_linear_ = value;
}

// double kF_square = 12;
inline void ControlGains::clear_kf_square() {
  _impl_.kf_square_ = 0;
}
inline double ControlGains::kf_square() const {
  // @@protoc_insertion_point(field_get:CLIPPY.control.ControlGains.kF_square)
  return _internal_kf_square();
}
inline void ControlGains::set_kf_square(double value) {
  _internal_set_kf_square(value);
  // @@protoc_insertion_point(field_set:CLIPPY.control.ControlGains.kF_square)
}
inline double ControlGains::_internal_kf_square() const {
  PROTOBUF_TSAN_READ(&_impl_._tsan_detect_race);
  return _impl_.kf_square_;
}
inline void ControlGains::_internal_set_kf_square(double value) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  _impl_.kf_square_ = value;
}

// double kF_cosine = 13;
inline void ControlGains::clear_kf_cosine() {
  _impl_.kf_cosine_ = 0;
}
inline double ControlGains::kf_cosine() const {
  // @@protoc_insertion_point(field_get:CLIPPY.control.ControlGains.kF_cosine)
  return _internal_kf_cosine();
}
inline void ControlGains::set_kf_cosine(double value) {
  _internal_set_kf_cosine(value);
  // @@protoc_insertion_point(field_set:CLIPPY.control.ControlGains.kF_cosine)
}
inline double ControlGains::_internal_kf_cosine() const {
  PROTOBUF_TSAN_READ(&_impl_._tsan_detect_race);
  return _impl_.kf_cosine_;
}
inline void ControlGains::_internal_set_kf_cosine(double value) {
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ;
  _impl_.kf_cosine_ = value;
}

#ifdef __GNUC__
#pragma GCC diagnostic pop
#endif  // __GNUC__

// @@protoc_insertion_point(namespace_scope)
}  // namespace control
}  // namespace CLIPPY


// @@protoc_insertion_point(global_scope)

#include "google/protobuf/port_undef.inc"

#endif  // GOOGLE_PROTOBUF_INCLUDED_ControlGains_2eproto_2epb_2eh
