<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ControlStyle.proto

namespace GPBMetadata;

class ControlStyle
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Google\Protobuf\Timestamp::initOnce();
        $pool->internalAddGeneratedFile(
            '
�
ControlStyle.protoCLIPPY.control"v
ControlStyle-
	timestamp (2.google.protobuf.Timestamp7
control_style (2 .CLIPPY.control.ControlStyleEnum*J
ControlStyleEnum

NO_CONTROL 
	MANUAL_DS

MANUAL
PLANNERbproto3'
        , true);

        static::$is_initialized = true;
    }
}

