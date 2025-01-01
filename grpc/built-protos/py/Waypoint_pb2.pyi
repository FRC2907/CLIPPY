import Urgency_pb2 as _Urgency_pb2
from google.protobuf import timestamp_pb2 as _timestamp_pb2
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class WaypointType(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    UNKNOWN: _ClassVar[WaypointType]
    NEUTRAL: _ClassVar[WaypointType]
    OBSTACLE: _ClassVar[WaypointType]
    FREE: _ClassVar[WaypointType]
    TARGET: _ClassVar[WaypointType]
    SELF: _ClassVar[WaypointType]
UNKNOWN: WaypointType
NEUTRAL: WaypointType
OBSTACLE: WaypointType
FREE: WaypointType
TARGET: WaypointType
SELF: WaypointType

class Waypoint(_message.Message):
    __slots__ = ("timestamp", "waypoint_type", "urgency", "x", "y", "z", "t_xy", "dx", "dy", "dz", "dt_xy")
    TIMESTAMP_FIELD_NUMBER: _ClassVar[int]
    WAYPOINT_TYPE_FIELD_NUMBER: _ClassVar[int]
    URGENCY_FIELD_NUMBER: _ClassVar[int]
    X_FIELD_NUMBER: _ClassVar[int]
    Y_FIELD_NUMBER: _ClassVar[int]
    Z_FIELD_NUMBER: _ClassVar[int]
    T_XY_FIELD_NUMBER: _ClassVar[int]
    DX_FIELD_NUMBER: _ClassVar[int]
    DY_FIELD_NUMBER: _ClassVar[int]
    DZ_FIELD_NUMBER: _ClassVar[int]
    DT_XY_FIELD_NUMBER: _ClassVar[int]
    timestamp: _timestamp_pb2.Timestamp
    waypoint_type: WaypointType
    urgency: _Urgency_pb2.Urgency
    x: float
    y: float
    z: float
    t_xy: float
    dx: float
    dy: float
    dz: float
    dt_xy: float
    def __init__(self, timestamp: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., waypoint_type: _Optional[_Union[WaypointType, str]] = ..., urgency: _Optional[_Union[_Urgency_pb2.Urgency, str]] = ..., x: _Optional[float] = ..., y: _Optional[float] = ..., z: _Optional[float] = ..., t_xy: _Optional[float] = ..., dx: _Optional[float] = ..., dy: _Optional[float] = ..., dz: _Optional[float] = ..., dt_xy: _Optional[float] = ...) -> None: ...
