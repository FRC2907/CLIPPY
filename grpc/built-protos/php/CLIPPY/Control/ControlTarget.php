<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ControlTarget.proto

namespace CLIPPY\Control;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>CLIPPY.control.ControlTarget</code>
 */
class ControlTarget extends \Google\Protobuf\Internal\Message
{
    /**
     * Timestamp at which we wish to achieve this target (empty for "now")
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    protected $timestamp = null;
    /**
     * Generated from protobuf field <code>string system_id = 2;</code>
     */
    protected $system_id = '';
    protected $target;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Protobuf\Timestamp $timestamp
     *           Timestamp at which we wish to achieve this target (empty for "now")
     *     @type string $system_id
     *     @type float $voltage
     *           avoid
     *     @type float $current
     *     @type float $position
     *     @type float $velocity
     *     @type float $acceleration
     *     @type bool $active
     *           for solenoids
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\ControlTarget::initOnce();
        parent::__construct($data);
    }

    /**
     * Timestamp at which we wish to achieve this target (empty for "now")
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
     * Timestamp at which we wish to achieve this target (empty for "now")
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
     * Generated from protobuf field <code>string system_id = 2;</code>
     * @return string
     */
    public function getSystemId()
    {
        return $this->system_id;
    }

    /**
     * Generated from protobuf field <code>string system_id = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setSystemId($var)
    {
        GPBUtil::checkString($var, True);
        $this->system_id = $var;

        return $this;
    }

    /**
     * avoid
     *
     * Generated from protobuf field <code>double voltage = 7;</code>
     * @return float
     */
    public function getVoltage()
    {
        return $this->readOneof(7);
    }

    public function hasVoltage()
    {
        return $this->hasOneof(7);
    }

    /**
     * avoid
     *
     * Generated from protobuf field <code>double voltage = 7;</code>
     * @param float $var
     * @return $this
     */
    public function setVoltage($var)
    {
        GPBUtil::checkDouble($var);
        $this->writeOneof(7, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>double current = 8;</code>
     * @return float
     */
    public function getCurrent()
    {
        return $this->readOneof(8);
    }

    public function hasCurrent()
    {
        return $this->hasOneof(8);
    }

    /**
     * Generated from protobuf field <code>double current = 8;</code>
     * @param float $var
     * @return $this
     */
    public function setCurrent($var)
    {
        GPBUtil::checkDouble($var);
        $this->writeOneof(8, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>double position = 9;</code>
     * @return float
     */
    public function getPosition()
    {
        return $this->readOneof(9);
    }

    public function hasPosition()
    {
        return $this->hasOneof(9);
    }

    /**
     * Generated from protobuf field <code>double position = 9;</code>
     * @param float $var
     * @return $this
     */
    public function setPosition($var)
    {
        GPBUtil::checkDouble($var);
        $this->writeOneof(9, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>double velocity = 10;</code>
     * @return float
     */
    public function getVelocity()
    {
        return $this->readOneof(10);
    }

    public function hasVelocity()
    {
        return $this->hasOneof(10);
    }

    /**
     * Generated from protobuf field <code>double velocity = 10;</code>
     * @param float $var
     * @return $this
     */
    public function setVelocity($var)
    {
        GPBUtil::checkDouble($var);
        $this->writeOneof(10, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>double acceleration = 11;</code>
     * @return float
     */
    public function getAcceleration()
    {
        return $this->readOneof(11);
    }

    public function hasAcceleration()
    {
        return $this->hasOneof(11);
    }

    /**
     * Generated from protobuf field <code>double acceleration = 11;</code>
     * @param float $var
     * @return $this
     */
    public function setAcceleration($var)
    {
        GPBUtil::checkDouble($var);
        $this->writeOneof(11, $var);

        return $this;
    }

    /**
     * for solenoids
     *
     * Generated from protobuf field <code>bool active = 12;</code>
     * @return bool
     */
    public function getActive()
    {
        return $this->readOneof(12);
    }

    public function hasActive()
    {
        return $this->hasOneof(12);
    }

    /**
     * for solenoids
     *
     * Generated from protobuf field <code>bool active = 12;</code>
     * @param bool $var
     * @return $this
     */
    public function setActive($var)
    {
        GPBUtil::checkBool($var);
        $this->writeOneof(12, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getTarget()
    {
        return $this->whichOneof("target");
    }

}

