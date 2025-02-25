<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: SystemState.proto

namespace CLIPPY\Control;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>CLIPPY.control.SystemTags</code>
 */
class SystemTags extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated string system_tags = 1;</code>
     */
    private $system_tags;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array<string>|\Google\Protobuf\Internal\RepeatedField $system_tags
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\SystemState::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated string system_tags = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getSystemTags()
    {
        return $this->system_tags;
    }

    /**
     * Generated from protobuf field <code>repeated string system_tags = 1;</code>
     * @param array<string>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setSystemTags($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->system_tags = $arr;

        return $this;
    }

}

