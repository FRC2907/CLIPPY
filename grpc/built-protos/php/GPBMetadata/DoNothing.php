<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: DoNothing.proto

namespace GPBMetadata;

class DoNothing
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Nada::initOnce();
        \GPBMetadata\Google\Protobuf\GPBEmpty::initOnce();
        $pool->internalAddGeneratedFile(
            '
�
DoNothing.protoCLIPPY.nadagoogle/protobuf/empty.proto2?
	DoNothing2
Nop.CLIPPY.nada.Nada.google.protobuf.Empty" bproto3'
        , true);

        static::$is_initialized = true;
    }
}

