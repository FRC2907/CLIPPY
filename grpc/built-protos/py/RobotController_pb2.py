# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: RobotController.proto
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
    'RobotController.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import ControlTarget_pb2 as ControlTarget__pb2
import ControlStyle_pb2 as ControlStyle__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x15RobotController.proto\x12\x0e\x43LIPPY.control\x1a\x13\x43ontrolTarget.proto\x1a\x12\x43ontrolStyle.proto\x1a\x1bgoogle/protobuf/empty.proto2\xa9\x01\n\x0fRobotController\x12K\n\x10SetControlTarget\x12\x1d.CLIPPY.control.ControlTarget\x1a\x16.google.protobuf.Empty\"\x00\x12I\n\x0fSetControlStyle\x12\x1c.CLIPPY.control.ControlStyle\x1a\x16.google.protobuf.Empty\"\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'RobotController_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  DESCRIPTOR._loaded_options = None
  _globals['_ROBOTCONTROLLER']._serialized_start=112
  _globals['_ROBOTCONTROLLER']._serialized_end=281
# @@protoc_insertion_point(module_scope)
