<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ControlGains.proto

namespace GPBMetadata;

class ControlGains
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Google\Protobuf\Wrappers::initOnce();
        $pool->internalAddGeneratedFile(
            '
�
ControlGains.protoCLIPPY.control"�
ControlGains
	system_id (	(
kP (2.google.protobuf.DoubleValue(
kI (2.google.protobuf.DoubleValue(
kD (2.google.protobuf.DoubleValue/
	kF_static (2.google.protobuf.DoubleValue/
	kF_linear (2.google.protobuf.DoubleValue8
kF_linear_per_time (2.google.protobuf.DoubleValue1
kF_constant (2.google.protobuf.DoubleValue(
kU	 (2.google.protobuf.DoubleValue(
tU
 (2.google.protobuf.DoubleValue4
znControlRule (2.CLIPPY.control.ZNControlRule*l
ZNControlRule	
UNSET 
P
PI
PD
PID

PESSEN
MILD_OVERSHOOT
NO_OVERSHOOTbproto3'
        , true);

        static::$is_initialized = true;
    }
}

