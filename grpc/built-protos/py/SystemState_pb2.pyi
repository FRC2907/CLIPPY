from google.protobuf import timestamp_pb2 as _timestamp_pb2
import ControlGains_pb2 as _ControlGains_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class SystemIDs(_message.Message):
    __slots__ = ("system_ids",)
    SYSTEM_IDS_FIELD_NUMBER: _ClassVar[int]
    system_ids: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, system_ids: _Optional[_Iterable[str]] = ...) -> None: ...

class SystemTags(_message.Message):
    __slots__ = ("system_tags",)
    SYSTEM_TAGS_FIELD_NUMBER: _ClassVar[int]
    system_tags: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, system_tags: _Optional[_Iterable[str]] = ...) -> None: ...

class SystemState(_message.Message):
    __slots__ = ("timestamp", "system_id", "state", "gains")
    class Measurement(_message.Message):
        __slots__ = ("position", "velocity", "acceleration", "voltage", "current", "active", "triggered", "power", "energy", "pressure", "jerk", "temperature")
        POSITION_FIELD_NUMBER: _ClassVar[int]
        VELOCITY_FIELD_NUMBER: _ClassVar[int]
        ACCELERATION_FIELD_NUMBER: _ClassVar[int]
        VOLTAGE_FIELD_NUMBER: _ClassVar[int]
        CURRENT_FIELD_NUMBER: _ClassVar[int]
        ACTIVE_FIELD_NUMBER: _ClassVar[int]
        TRIGGERED_FIELD_NUMBER: _ClassVar[int]
        POWER_FIELD_NUMBER: _ClassVar[int]
        ENERGY_FIELD_NUMBER: _ClassVar[int]
        PRESSURE_FIELD_NUMBER: _ClassVar[int]
        JERK_FIELD_NUMBER: _ClassVar[int]
        TEMPERATURE_FIELD_NUMBER: _ClassVar[int]
        position: float
        velocity: float
        acceleration: float
        voltage: float
        current: float
        active: bool
        triggered: bool
        power: float
        energy: float
        pressure: float
        jerk: float
        temperature: float
        def __init__(self, position: _Optional[float] = ..., velocity: _Optional[float] = ..., acceleration: _Optional[float] = ..., voltage: _Optional[float] = ..., current: _Optional[float] = ..., active: bool = ..., triggered: bool = ..., power: _Optional[float] = ..., energy: _Optional[float] = ..., pressure: _Optional[float] = ..., jerk: _Optional[float] = ..., temperature: _Optional[float] = ...) -> None: ...
    TIMESTAMP_FIELD_NUMBER: _ClassVar[int]
    SYSTEM_ID_FIELD_NUMBER: _ClassVar[int]
    STATE_FIELD_NUMBER: _ClassVar[int]
    GAINS_FIELD_NUMBER: _ClassVar[int]
    timestamp: _timestamp_pb2.Timestamp
    system_id: str
    state: SystemState.Measurement
    gains: _ControlGains_pb2.ControlGains
    def __init__(self, timestamp: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., system_id: _Optional[str] = ..., state: _Optional[_Union[SystemState.Measurement, _Mapping]] = ..., gains: _Optional[_Union[_ControlGains_pb2.ControlGains, _Mapping]] = ...) -> None: ...
