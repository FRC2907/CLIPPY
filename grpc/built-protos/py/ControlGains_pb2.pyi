from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Optional as _Optional

DESCRIPTOR: _descriptor.FileDescriptor

class ControlGains(_message.Message):
    __slots__ = ("system_id", "kP", "kI", "kD", "kF_static", "kF_linear", "kF_square", "kF_cosine", "kU")
    SYSTEM_ID_FIELD_NUMBER: _ClassVar[int]
    KP_FIELD_NUMBER: _ClassVar[int]
    KI_FIELD_NUMBER: _ClassVar[int]
    KD_FIELD_NUMBER: _ClassVar[int]
    KF_STATIC_FIELD_NUMBER: _ClassVar[int]
    KF_LINEAR_FIELD_NUMBER: _ClassVar[int]
    KF_SQUARE_FIELD_NUMBER: _ClassVar[int]
    KF_COSINE_FIELD_NUMBER: _ClassVar[int]
    KU_FIELD_NUMBER: _ClassVar[int]
    system_id: str
    kP: float
    kI: float
    kD: float
    kF_static: float
    kF_linear: float
    kF_square: float
    kF_cosine: float
    kU: float
    def __init__(self, system_id: _Optional[str] = ..., kP: _Optional[float] = ..., kI: _Optional[float] = ..., kD: _Optional[float] = ..., kF_static: _Optional[float] = ..., kF_linear: _Optional[float] = ..., kF_square: _Optional[float] = ..., kF_cosine: _Optional[float] = ..., kU: _Optional[float] = ...) -> None: ...
