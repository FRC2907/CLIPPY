# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: ControlGains.proto
# Protobuf Python Version: 5.28.1
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    28,
    1,
    '',
    'ControlGains.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x12\x43ontrolGains.proto\x12\x0e\x43LIPPY.control\"\x91\x01\n\x0c\x43ontrolGains\x12\x11\n\tsystem_id\x18\x01 \x01(\t\x12\n\n\x02kP\x18\x07 \x01(\x01\x12\n\n\x02kI\x18\x08 \x01(\x01\x12\n\n\x02kD\x18\t \x01(\x01\x12\x11\n\tkF_static\x18\n \x01(\x01\x12\x11\n\tkF_linear\x18\x0b \x01(\x01\x12\x11\n\tkF_square\x18\x0c \x01(\x01\x12\x11\n\tkF_cosine\x18\r \x01(\x01\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ControlGains_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  DESCRIPTOR._loaded_options = None
  _globals['_CONTROLGAINS']._serialized_start=39
  _globals['_CONTROLGAINS']._serialized_end=184
# @@protoc_insertion_point(module_scope)
