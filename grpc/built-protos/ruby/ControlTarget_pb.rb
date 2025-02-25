# frozen_string_literal: true
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ControlTarget.proto

require 'google/protobuf'

require 'google/protobuf/timestamp_pb'


descriptor_data = "\n\x13\x43ontrolTarget.proto\x12\x0e\x43LIPPY.control\x1a\x1fgoogle/protobuf/timestamp.proto\"\xd3\x01\n\rControlTarget\x12-\n\ttimestamp\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x11\n\tsystem_id\x18\x02 \x01(\t\x12\x11\n\x07voltage\x18\x07 \x01(\x01H\x00\x12\x11\n\x07\x63urrent\x18\x08 \x01(\x01H\x00\x12\x12\n\x08position\x18\t \x01(\x01H\x00\x12\x12\n\x08velocity\x18\n \x01(\x01H\x00\x12\x16\n\x0c\x61\x63\x63\x65leration\x18\x0b \x01(\x01H\x00\x12\x10\n\x06\x61\x63tive\x18\x0c \x01(\x08H\x00\x42\x08\n\x06target\"y\n\x18MultiSystemControlTarget\x12-\n\ttimestamp\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12.\n\x07targets\x18\x03 \x03(\x0b\x32\x1d.CLIPPY.control.ControlTargetb\x06proto3"

pool = Google::Protobuf::DescriptorPool.generated_pool

begin
  pool.add_serialized_file(descriptor_data)
rescue TypeError => e
  # Compatibility code: will be removed in the next major version.
  require 'google/protobuf/descriptor_pb'
  parsed = Google::Protobuf::FileDescriptorProto.decode(descriptor_data)
  parsed.clear_dependency
  serialized = parsed.class.encode(parsed)
  file = pool.add_serialized_file(serialized)
  warn "Warning: Protobuf detected an import path issue while loading generated file #{__FILE__}"
  imports = [
    ["google.protobuf.Timestamp", "google/protobuf/timestamp.proto"],
  ]
  imports.each do |type_name, expected_filename|
    import_file = pool.lookup(type_name).file_descriptor
    if import_file.name != expected_filename
      warn "- #{file.name} imports #{expected_filename}, but that import was loaded as #{import_file.name}"
    end
  end
  warn "Each proto file must use a consistent fully-qualified name."
  warn "This will become an error in the next major version."
end

module CLIPPY
  module Control
    ControlTarget = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("CLIPPY.control.ControlTarget").msgclass
    MultiSystemControlTarget = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("CLIPPY.control.MultiSystemControlTarget").msgclass
  end
end
