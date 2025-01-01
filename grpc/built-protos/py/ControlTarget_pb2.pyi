import Urgency_pb2 as _Urgency_pb2
from google.protobuf import timestamp_pb2 as _timestamp_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class ControlTarget(_message.Message):
    __slots__ = ("timestamp", "system_id", "urgency", "voltage", "current", "position", "velocity", "acceleration", "active")
    TIMESTAMP_FIELD_NUMBER: _ClassVar[int]
    SYSTEM_ID_FIELD_NUMBER: _ClassVar[int]
    URGENCY_FIELD_NUMBER: _ClassVar[int]
    VOLTAGE_FIELD_NUMBER: _ClassVar[int]
    CURRENT_FIELD_NUMBER: _ClassVar[int]
    POSITION_FIELD_NUMBER: _ClassVar[int]
    VELOCITY_FIELD_NUMBER: _ClassVar[int]
    ACCELERATION_FIELD_NUMBER: _ClassVar[int]
    ACTIVE_FIELD_NUMBER: _ClassVar[int]
    timestamp: _timestamp_pb2.Timestamp
    system_id: str
    urgency: _Urgency_pb2.Urgency
    voltage: float
    current: float
    position: float
    velocity: float
    acceleration: float
    active: bool
    def __init__(self, timestamp: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., system_id: _Optional[str] = ..., urgency: _Optional[_Union[_Urgency_pb2.Urgency, str]] = ..., voltage: _Optional[float] = ..., current: _Optional[float] = ..., position: _Optional[float] = ..., velocity: _Optional[float] = ..., acceleration: _Optional[float] = ..., active: bool = ...) -> None: ...

class MultiSystemControlTarget(_message.Message):
    __slots__ = ("timestamp", "urgency", "targets")
    TIMESTAMP_FIELD_NUMBER: _ClassVar[int]
    URGENCY_FIELD_NUMBER: _ClassVar[int]
    TARGETS_FIELD_NUMBER: _ClassVar[int]
    timestamp: _timestamp_pb2.Timestamp
    urgency: _Urgency_pb2.Urgency
    targets: _containers.RepeatedCompositeFieldContainer[ControlTarget]
    def __init__(self, timestamp: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., urgency: _Optional[_Union[_Urgency_pb2.Urgency, str]] = ..., targets: _Optional[_Iterable[_Union[ControlTarget, _Mapping]]] = ...) -> None: ...
