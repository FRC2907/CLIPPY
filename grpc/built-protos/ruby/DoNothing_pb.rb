# frozen_string_literal: true
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: DoNothing.proto

require 'google/protobuf'

require 'Nada_pb'
require 'google/protobuf/empty_pb'


descriptor_data = "\n\x0f\x44oNothing.proto\x12\x0b\x43LIPPY.nada\x1a\nNada.proto\x1a\x1bgoogle/protobuf/empty.proto2?\n\tDoNothing\x12\x32\n\x03Nop\x12\x11.CLIPPY.nada.Nada\x1a\x16.google.protobuf.Empty\"\x00\x62\x06proto3"

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
  module Nada
  end
end
