<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ControlTarget.proto

namespace GPBMetadata;

class ControlTarget
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Urgency::initOnce();
        \GPBMetadata\Google\Protobuf\Timestamp::initOnce();
        $pool->internalAddGeneratedFile(
            '
�
ControlTarget.protoCLIPPY.controlgoogle/protobuf/timestamp.proto"�
ControlTarget-
	timestamp (2.google.protobuf.Timestamp
	system_id (	(
urgency (2.CLIPPY.control.Urgency
voltage (H 
current (H 
position	 (H 
velocity
 (H 
acceleration (H 
active (H B
target"�
MultiSystemControlTarget-
	timestamp (2.google.protobuf.Timestamp(
urgency (2.CLIPPY.control.Urgency.
targets (2.CLIPPY.control.ControlTargetbproto3'
        , true);

        static::$is_initialized = true;
    }
}

