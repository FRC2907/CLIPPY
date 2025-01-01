from google.protobuf import timestamp_pb2 as _timestamp_pb2
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class LogSeverity(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    UNKNOWN: _ClassVar[LogSeverity]
    TRACE: _ClassVar[LogSeverity]
    DEBUG: _ClassVar[LogSeverity]
    INFO: _ClassVar[LogSeverity]
    OK: _ClassVar[LogSeverity]
    WARN: _ClassVar[LogSeverity]
    ERROR: _ClassVar[LogSeverity]
UNKNOWN: LogSeverity
TRACE: LogSeverity
DEBUG: LogSeverity
INFO: LogSeverity
OK: LogSeverity
WARN: LogSeverity
ERROR: LogSeverity

class LogRecord(_message.Message):
    __slots__ = ("timestamp", "reporter", "severity", "value")
    TIMESTAMP_FIELD_NUMBER: _ClassVar[int]
    REPORTER_FIELD_NUMBER: _ClassVar[int]
    SEVERITY_FIELD_NUMBER: _ClassVar[int]
    VALUE_FIELD_NUMBER: _ClassVar[int]
    timestamp: _timestamp_pb2.Timestamp
    reporter: str
    severity: LogSeverity
    value: str
    def __init__(self, timestamp: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., reporter: _Optional[str] = ..., severity: _Optional[_Union[LogSeverity, str]] = ..., value: _Optional[str] = ...) -> None: ...
