from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from typing import ClassVar as _ClassVar

DESCRIPTOR: _descriptor.FileDescriptor

class Urgency(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    UNASSIGNED: _ClassVar[Urgency]
    HYPOTHETICAL: _ClassVar[Urgency]
    SUGGESTION: _ClassVar[Urgency]
    REQUEST: _ClassVar[Urgency]
    DEMAND: _ClassVar[Urgency]
UNASSIGNED: Urgency
HYPOTHETICAL: Urgency
SUGGESTION: Urgency
REQUEST: Urgency
DEMAND: Urgency
