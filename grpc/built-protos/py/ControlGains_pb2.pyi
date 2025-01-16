from google.protobuf import wrappers_pb2 as _wrappers_pb2
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class ZNControlRule(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    UNSET: _ClassVar[ZNControlRule]
    P: _ClassVar[ZNControlRule]
    PI: _ClassVar[ZNControlRule]
    PD: _ClassVar[ZNControlRule]
    PID: _ClassVar[ZNControlRule]
    PESSEN: _ClassVar[ZNControlRule]
    MILD_OVERSHOOT: _ClassVar[ZNControlRule]
    NO_OVERSHOOT: _ClassVar[ZNControlRule]
UNSET: ZNControlRule
P: ZNControlRule
PI: ZNControlRule
PD: ZNControlRule
PID: ZNControlRule
PESSEN: ZNControlRule
MILD_OVERSHOOT: ZNControlRule
NO_OVERSHOOT: ZNControlRule

class ControlGains(_message.Message):
    __slots__ = ("system_id", "kP", "kI", "kD", "kF_static", "kF_linear", "kF_linear_per_time", "kF_constant", "kU", "tU", "znControlRule")
    SYSTEM_ID_FIELD_NUMBER: _ClassVar[int]
    KP_FIELD_NUMBER: _ClassVar[int]
    KI_FIELD_NUMBER: _ClassVar[int]
    KD_FIELD_NUMBER: _ClassVar[int]
    KF_STATIC_FIELD_NUMBER: _ClassVar[int]
    KF_LINEAR_FIELD_NUMBER: _ClassVar[int]
    KF_LINEAR_PER_TIME_FIELD_NUMBER: _ClassVar[int]
    KF_CONSTANT_FIELD_NUMBER: _ClassVar[int]
    KU_FIELD_NUMBER: _ClassVar[int]
    TU_FIELD_NUMBER: _ClassVar[int]
    ZNCONTROLRULE_FIELD_NUMBER: _ClassVar[int]
    system_id: str
    kP: _wrappers_pb2.DoubleValue
    kI: _wrappers_pb2.DoubleValue
    kD: _wrappers_pb2.DoubleValue
    kF_static: _wrappers_pb2.DoubleValue
    kF_linear: _wrappers_pb2.DoubleValue
    kF_linear_per_time: _wrappers_pb2.DoubleValue
    kF_constant: _wrappers_pb2.DoubleValue
    kU: _wrappers_pb2.DoubleValue
    tU: _wrappers_pb2.DoubleValue
    znControlRule: ZNControlRule
    def __init__(self, system_id: _Optional[str] = ..., kP: _Optional[_Union[_wrappers_pb2.DoubleValue, _Mapping]] = ..., kI: _Optional[_Union[_wrappers_pb2.DoubleValue, _Mapping]] = ..., kD: _Optional[_Union[_wrappers_pb2.DoubleValue, _Mapping]] = ..., kF_static: _Optional[_Union[_wrappers_pb2.DoubleValue, _Mapping]] = ..., kF_linear: _Optional[_Union[_wrappers_pb2.DoubleValue, _Mapping]] = ..., kF_linear_per_time: _Optional[_Union[_wrappers_pb2.DoubleValue, _Mapping]] = ..., kF_constant: _Optional[_Union[_wrappers_pb2.DoubleValue, _Mapping]] = ..., kU: _Optional[_Union[_wrappers_pb2.DoubleValue, _Mapping]] = ..., tU: _Optional[_Union[_wrappers_pb2.DoubleValue, _Mapping]] = ..., znControlRule: _Optional[_Union[ZNControlRule, str]] = ...) -> None: ...
