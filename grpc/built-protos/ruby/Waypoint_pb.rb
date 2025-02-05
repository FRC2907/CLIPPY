# frozen_string_literal: true
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Waypoint.proto

require 'google/protobuf'

require 'google/protobuf/timestamp_pb'


descriptor_data = "\n\x0eWaypoint.proto\x12\x0e\x43LIPPY.control\x1a\x1fgoogle/protobuf/timestamp.proto\"\xd0\x01\n\x08Waypoint\x12-\n\ttimestamp\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x33\n\rwaypoint_type\x18\x02 \x01(\x0e\x32\x1c.CLIPPY.control.WaypointType\x12\t\n\x01x\x18\x07 \x01(\x01\x12\t\n\x01y\x18\x08 \x01(\x01\x12\t\n\x01z\x18\t \x01(\x01\x12\x0c\n\x04t_xy\x18\n \x01(\x01\x12\n\n\x02\x64x\x18\r \x01(\x01\x12\n\n\x02\x64y\x18\x0e \x01(\x01\x12\n\n\x02\x64z\x18\x0f \x01(\x01\x12\r\n\x05\x64t_xy\x18\x10 \x01(\x01*V\n\x0cWaypointType\x12\x0b\n\x07UNKNOWN\x10\x00\x12\x0b\n\x07NEUTRAL\x10\x01\x12\x0c\n\x08OBSTACLE\x10\x02\x12\x08\n\x04\x46REE\x10\x03\x12\n\n\x06TARGET\x10\x04\x12\x08\n\x04SELF\x10\x05\x62\x06proto3"

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
    Waypoint = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("CLIPPY.control.Waypoint").msgclass
    WaypointType = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("CLIPPY.control.WaypointType").enummodule
  end
end
