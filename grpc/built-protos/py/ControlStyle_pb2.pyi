from google.protobuf import timestamp_pb2 as _timestamp_pb2
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class ControlStyleEnum(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    NO_CONTROL: _ClassVar[ControlStyleEnum]
    MANUAL_DS: _ClassVar[ControlStyleEnum]
    MANUAL: _ClassVar[ControlStyleEnum]
    PLANNER: _ClassVar[ControlStyleEnum]
NO_CONTROL: ControlStyleEnum
MANUAL_DS: ControlStyleEnum
MANUAL: ControlStyleEnum
PLANNER: ControlStyleEnum

class ControlStyle(_message.Message):
    __slots__ = ("timestamp", "control_style")
    TIMESTAMP_FIELD_NUMBER: _ClassVar[int]
    CONTROL_STYLE_FIELD_NUMBER: _ClassVar[int]
    timestamp: _timestamp_pb2.Timestamp
    control_style: ControlStyleEnum
    def __init__(self, timestamp: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., control_style: _Optional[_Union[ControlStyleEnum, str]] = ...) -> None: ...
