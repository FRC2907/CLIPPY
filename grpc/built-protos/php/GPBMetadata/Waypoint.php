<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Waypoint.proto

namespace GPBMetadata;

class Waypoint
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
Waypoint.protoCLIPPY.controlgoogle/protobuf/timestamp.proto"�
Waypoint-
	timestamp (2.google.protobuf.Timestamp3
waypoint_type (2.CLIPPY.control.WaypointType(
urgency (2.CLIPPY.control.Urgency	
x (	
y (	
z	 (
t_xy
 (

dx (

dy (

dz (
dt_xy (*V
WaypointType
UNKNOWN 
NEUTRAL
OBSTACLE
FREE

TARGET
SELFbproto3'
        , true);

        static::$is_initialized = true;
    }
}

