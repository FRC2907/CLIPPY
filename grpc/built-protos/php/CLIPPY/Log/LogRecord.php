<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: LogRecord.proto

namespace CLIPPY\Log;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>CLIPPY.log.LogRecord</code>
 */
class LogRecord extends \Google\Protobuf\Internal\Message
{
    /**
     * When did this happen
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    protected $timestamp = null;
    /**
     * Who wants to record this event
     *
     * Generated from protobuf field <code>string reporter = 2;</code>
     */
    protected $reporter = '';
    /**
     * Generated from protobuf field <code>.CLIPPY.log.LogSeverity severity = 3;</code>
     */
    protected $severity = 0;
    /**
     * Generated from protobuf field <code>string value = 4;</code>
     */
    protected $value = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Protobuf\Timestamp $timestamp
     *           When did this happen
     *     @type string $reporter
     *           Who wants to record this event
     *     @type int $severity
     *     @type string $value
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\LogRecord::initOnce();
        parent::__construct($data);
    }

    /**
     * When did this happen
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp timestamp = 1;</code>
     * @return \Google\Protobuf\Timestamp|null
     */
    public function getTimestamp()
    {
        return $this->timestamp;
    }

    public function hasTimestamp()
    {
        return isset($this->timestamp);
    }

    public function clearTimestamp()
    {
        unset($this->timestamp);
    }

    /**
     * When did this happen
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp timestamp = 1;</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setTimestamp($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->timestamp = $var;

        return $this;
    }

    /**
     * Who wants to record this event
     *
     * Generated from protobuf field <code>string reporter = 2;</code>
     * @return string
     */
    public function getReporter()
    {
        return $this->reporter;
    }

    /**
     * Who wants to record this event
     *
     * Generated from protobuf field <code>string reporter = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setReporter($var)
    {
        GPBUtil::checkString($var, True);
        $this->reporter = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.CLIPPY.log.LogSeverity severity = 3;</code>
     * @return int
     */
    public function getSeverity()
    {
        return $this->severity;
    }

    /**
     * Generated from protobuf field <code>.CLIPPY.log.LogSeverity severity = 3;</code>
     * @param int $var
     * @return $this
     */
    public function setSeverity($var)
    {
        GPBUtil::checkEnum($var, \CLIPPY\Log\LogSeverity::class);
        $this->severity = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string value = 4;</code>
     * @return string
     */
    public function getValue()
    {
        return $this->value;
    }

    /**
     * Generated from protobuf field <code>string value = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setValue($var)
    {
        GPBUtil::checkString($var, True);
        $this->value = $var;

        return $this;
    }

}

