<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: RobotController.proto

namespace GPBMetadata;

class RobotController
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\ControlTarget::initOnce();
        \GPBMetadata\ControlStyle::initOnce();
        \GPBMetadata\Google\Protobuf\GPBEmpty::initOnce();
        $pool->internalAddGeneratedFile(
            '
�
RobotController.protoCLIPPY.controlControlStyle.protogoogle/protobuf/empty.proto2�
RobotControllerK
SetControlTarget.CLIPPY.control.ControlTarget.google.protobuf.Empty" I
SetControlStyle.CLIPPY.control.ControlStyle.google.protobuf.Empty" bproto3'
        , true);

        static::$is_initialized = true;
    }
}

