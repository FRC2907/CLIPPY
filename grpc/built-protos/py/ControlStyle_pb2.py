# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: ControlStyle.proto
# Protobuf Python Version: 5.29.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    29,
    0,
    '',
    'ControlStyle.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x12\x43ontrolStyle.proto\x12\x0e\x43LIPPY.control\x1a\x1fgoogle/protobuf/timestamp.proto\"v\n\x0c\x43ontrolStyle\x12-\n\ttimestamp\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x37\n\rcontrol_style\x18\x02 \x01(\x0e\x32 .CLIPPY.control.ControlStyleEnum*J\n\x10\x43ontrolStyleEnum\x12\x0e\n\nNO_CONTROL\x10\x00\x12\r\n\tMANUAL_DS\x10\x01\x12\n\n\x06MANUAL\x10\x02\x12\x0b\n\x07PLANNER\x10\x03\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ControlStyle_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  DESCRIPTOR._loaded_options = None
  _globals['_CONTROLSTYLEENUM']._serialized_start=191
  _globals['_CONTROLSTYLEENUM']._serialized_end=265
  _globals['_CONTROLSTYLE']._serialized_start=71
  _globals['_CONTROLSTYLE']._serialized_end=189
# @@protoc_insertion_point(module_scope)
