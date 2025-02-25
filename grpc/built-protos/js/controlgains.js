// source: ControlGains.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.CLIPPY.control.ControlGains');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.DoubleValue');

goog.forwardDeclare('proto.CLIPPY.control.ZNControlRule');
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.CLIPPY.control.ControlGains = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.CLIPPY.control.ControlGains, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.CLIPPY.control.ControlGains.displayName = 'proto.CLIPPY.control.ControlGains';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.CLIPPY.control.ControlGains.prototype.toObject = function(opt_includeInstance) {
  return proto.CLIPPY.control.ControlGains.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.CLIPPY.control.ControlGains} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.CLIPPY.control.ControlGains.toObject = function(includeInstance, msg) {
  var f, obj = {
systemId: jspb.Message.getFieldWithDefault(msg, 1, ""),
kp: (f = msg.getKp()) && proto.google.protobuf.DoubleValue.toObject(includeInstance, f),
ki: (f = msg.getKi()) && proto.google.protobuf.DoubleValue.toObject(includeInstance, f),
kd: (f = msg.getKd()) && proto.google.protobuf.DoubleValue.toObject(includeInstance, f),
kfStatic: (f = msg.getKfStatic()) && proto.google.protobuf.DoubleValue.toObject(includeInstance, f),
kfLinear: (f = msg.getKfLinear()) && proto.google.protobuf.DoubleValue.toObject(includeInstance, f),
kfLinearPerTime: (f = msg.getKfLinearPerTime()) && proto.google.protobuf.DoubleValue.toObject(includeInstance, f),
kfConstant: (f = msg.getKfConstant()) && proto.google.protobuf.DoubleValue.toObject(includeInstance, f),
ku: (f = msg.getKu()) && proto.google.protobuf.DoubleValue.toObject(includeInstance, f),
tu: (f = msg.getTu()) && proto.google.protobuf.DoubleValue.toObject(includeInstance, f),
zncontrolrule: jspb.Message.getFieldWithDefault(msg, 11, 0)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.CLIPPY.control.ControlGains}
 */
proto.CLIPPY.control.ControlGains.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.CLIPPY.control.ControlGains;
  return proto.CLIPPY.control.ControlGains.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.CLIPPY.control.ControlGains} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.CLIPPY.control.ControlGains}
 */
proto.CLIPPY.control.ControlGains.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSystemId(value);
      break;
    case 2:
      var value = new proto.google.protobuf.DoubleValue;
      reader.readMessage(value,proto.google.protobuf.DoubleValue.deserializeBinaryFromReader);
      msg.setKp(value);
      break;
    case 3:
      var value = new proto.google.protobuf.DoubleValue;
      reader.readMessage(value,proto.google.protobuf.DoubleValue.deserializeBinaryFromReader);
      msg.setKi(value);
      break;
    case 4:
      var value = new proto.google.protobuf.DoubleValue;
      reader.readMessage(value,proto.google.protobuf.DoubleValue.deserializeBinaryFromReader);
      msg.setKd(value);
      break;
    case 5:
      var value = new proto.google.protobuf.DoubleValue;
      reader.readMessage(value,proto.google.protobuf.DoubleValue.deserializeBinaryFromReader);
      msg.setKfStatic(value);
      break;
    case 6:
      var value = new proto.google.protobuf.DoubleValue;
      reader.readMessage(value,proto.google.protobuf.DoubleValue.deserializeBinaryFromReader);
      msg.setKfLinear(value);
      break;
    case 7:
      var value = new proto.google.protobuf.DoubleValue;
      reader.readMessage(value,proto.google.protobuf.DoubleValue.deserializeBinaryFromReader);
      msg.setKfLinearPerTime(value);
      break;
    case 8:
      var value = new proto.google.protobuf.DoubleValue;
      reader.readMessage(value,proto.google.protobuf.DoubleValue.deserializeBinaryFromReader);
      msg.setKfConstant(value);
      break;
    case 9:
      var value = new proto.google.protobuf.DoubleValue;
      reader.readMessage(value,proto.google.protobuf.DoubleValue.deserializeBinaryFromReader);
      msg.setKu(value);
      break;
    case 10:
      var value = new proto.google.protobuf.DoubleValue;
      reader.readMessage(value,proto.google.protobuf.DoubleValue.deserializeBinaryFromReader);
      msg.setTu(value);
      break;
    case 11:
      var value = /** @type {!proto.CLIPPY.control.ZNControlRule} */ (reader.readEnum());
      msg.setZncontrolrule(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.CLIPPY.control.ControlGains.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.CLIPPY.control.ControlGains.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.CLIPPY.control.ControlGains} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.CLIPPY.control.ControlGains.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSystemId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getKp();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.DoubleValue.serializeBinaryToWriter
    );
  }
  f = message.getKi();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.DoubleValue.serializeBinaryToWriter
    );
  }
  f = message.getKd();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.DoubleValue.serializeBinaryToWriter
    );
  }
  f = message.getKfStatic();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.google.protobuf.DoubleValue.serializeBinaryToWriter
    );
  }
  f = message.getKfLinear();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.google.protobuf.DoubleValue.serializeBinaryToWriter
    );
  }
  f = message.getKfLinearPerTime();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.google.protobuf.DoubleValue.serializeBinaryToWriter
    );
  }
  f = message.getKfConstant();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.google.protobuf.DoubleValue.serializeBinaryToWriter
    );
  }
  f = message.getKu();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.google.protobuf.DoubleValue.serializeBinaryToWriter
    );
  }
  f = message.getTu();
  if (f != null) {
    writer.writeMessage(
      10,
      f,
      proto.google.protobuf.DoubleValue.serializeBinaryToWriter
    );
  }
  f = message.getZncontrolrule();
  if (f !== 0.0) {
    writer.writeEnum(
      11,
      f
    );
  }
};


/**
 * optional string system_id = 1;
 * @return {string}
 */
proto.CLIPPY.control.ControlGains.prototype.getSystemId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.CLIPPY.control.ControlGains} returns this
 */
proto.CLIPPY.control.ControlGains.prototype.setSystemId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional google.protobuf.DoubleValue kP = 2;
 * @return {?proto.google.protobuf.DoubleValue}
 */
proto.CLIPPY.control.ControlGains.prototype.getKp = function() {
  return /** @type{?proto.google.protobuf.DoubleValue} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.DoubleValue, 2));
};


/**
 * @param {?proto.google.protobuf.DoubleValue|undefined} value
 * @return {!proto.CLIPPY.control.ControlGains} returns this
*/
proto.CLIPPY.control.ControlGains.prototype.setKp = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.CLIPPY.control.ControlGains} returns this
 */
proto.CLIPPY.control.ControlGains.prototype.clearKp = function() {
  return this.setKp(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.CLIPPY.control.ControlGains.prototype.hasKp = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional google.protobuf.DoubleValue kI = 3;
 * @return {?proto.google.protobuf.DoubleValue}
 */
proto.CLIPPY.control.ControlGains.prototype.getKi = function() {
  return /** @type{?proto.google.protobuf.DoubleValue} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.DoubleValue, 3));
};


/**
 * @param {?proto.google.protobuf.DoubleValue|undefined} value
 * @return {!proto.CLIPPY.control.ControlGains} returns this
*/
proto.CLIPPY.control.ControlGains.prototype.setKi = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.CLIPPY.control.ControlGains} returns this
 */
proto.CLIPPY.control.ControlGains.prototype.clearKi = function() {
  return this.setKi(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.CLIPPY.control.ControlGains.prototype.hasKi = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional google.protobuf.DoubleValue kD = 4;
 * @return {?proto.google.protobuf.DoubleValue}
 */
proto.CLIPPY.control.ControlGains.prototype.getKd = function() {
  return /** @type{?proto.google.protobuf.DoubleValue} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.DoubleValue, 4));
};


/**
 * @param {?proto.google.protobuf.DoubleValue|undefined} value
 * @return {!proto.CLIPPY.control.ControlGains} returns this
*/
proto.CLIPPY.control.ControlGains.prototype.setKd = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.CLIPPY.control.ControlGains} returns this
 */
proto.CLIPPY.control.ControlGains.prototype.clearKd = function() {
  return this.setKd(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.CLIPPY.control.ControlGains.prototype.hasKd = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional google.protobuf.DoubleValue kF_static = 5;
 * @return {?proto.google.protobuf.DoubleValue}
 */
proto.CLIPPY.control.ControlGains.prototype.getKfStatic = function() {
  return /** @type{?proto.google.protobuf.DoubleValue} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.DoubleValue, 5));
};


/**
 * @param {?proto.google.protobuf.DoubleValue|undefined} value
 * @return {!proto.CLIPPY.control.ControlGains} returns this
*/
proto.CLIPPY.control.ControlGains.prototype.setKfStatic = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.CLIPPY.control.ControlGains} returns this
 */
proto.CLIPPY.control.ControlGains.prototype.clearKfStatic = function() {
  return this.setKfStatic(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.CLIPPY.control.ControlGains.prototype.hasKfStatic = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional google.protobuf.DoubleValue kF_linear = 6;
 * @return {?proto.google.protobuf.DoubleValue}
 */
proto.CLIPPY.control.ControlGains.prototype.getKfLinear = function() {
  return /** @type{?proto.google.protobuf.DoubleValue} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.DoubleValue, 6));
};


/**
 * @param {?proto.google.protobuf.DoubleValue|undefined} value
 * @return {!proto.CLIPPY.control.ControlGains} returns this
*/
proto.CLIPPY.control.ControlGains.prototype.setKfLinear = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.CLIPPY.control.ControlGains} returns this
 */
proto.CLIPPY.control.ControlGains.prototype.clearKfLinear = function() {
  return this.setKfLinear(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.CLIPPY.control.ControlGains.prototype.hasKfLinear = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional google.protobuf.DoubleValue kF_linear_per_time = 7;
 * @return {?proto.google.protobuf.DoubleValue}
 */
proto.CLIPPY.control.ControlGains.prototype.getKfLinearPerTime = function() {
  return /** @type{?proto.google.protobuf.DoubleValue} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.DoubleValue, 7));
};


/**
 * @param {?proto.google.protobuf.DoubleValue|undefined} value
 * @return {!proto.CLIPPY.control.ControlGains} returns this
*/
proto.CLIPPY.control.ControlGains.prototype.setKfLinearPerTime = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.CLIPPY.control.ControlGains} returns this
 */
proto.CLIPPY.control.ControlGains.prototype.clearKfLinearPerTime = function() {
  return this.setKfLinearPerTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.CLIPPY.control.ControlGains.prototype.hasKfLinearPerTime = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional google.protobuf.DoubleValue kF_constant = 8;
 * @return {?proto.google.protobuf.DoubleValue}
 */
proto.CLIPPY.control.ControlGains.prototype.getKfConstant = function() {
  return /** @type{?proto.google.protobuf.DoubleValue} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.DoubleValue, 8));
};


/**
 * @param {?proto.google.protobuf.DoubleValue|undefined} value
 * @return {!proto.CLIPPY.control.ControlGains} returns this
*/
proto.CLIPPY.control.ControlGains.prototype.setKfConstant = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.CLIPPY.control.ControlGains} returns this
 */
proto.CLIPPY.control.ControlGains.prototype.clearKfConstant = function() {
  return this.setKfConstant(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.CLIPPY.control.ControlGains.prototype.hasKfConstant = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * optional google.protobuf.DoubleValue kU = 9;
 * @return {?proto.google.protobuf.DoubleValue}
 */
proto.CLIPPY.control.ControlGains.prototype.getKu = function() {
  return /** @type{?proto.google.protobuf.DoubleValue} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.DoubleValue, 9));
};


/**
 * @param {?proto.google.protobuf.DoubleValue|undefined} value
 * @return {!proto.CLIPPY.control.ControlGains} returns this
*/
proto.CLIPPY.control.ControlGains.prototype.setKu = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.CLIPPY.control.ControlGains} returns this
 */
proto.CLIPPY.control.ControlGains.prototype.clearKu = function() {
  return this.setKu(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.CLIPPY.control.ControlGains.prototype.hasKu = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * optional google.protobuf.DoubleValue tU = 10;
 * @return {?proto.google.protobuf.DoubleValue}
 */
proto.CLIPPY.control.ControlGains.prototype.getTu = function() {
  return /** @type{?proto.google.protobuf.DoubleValue} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.DoubleValue, 10));
};


/**
 * @param {?proto.google.protobuf.DoubleValue|undefined} value
 * @return {!proto.CLIPPY.control.ControlGains} returns this
*/
proto.CLIPPY.control.ControlGains.prototype.setTu = function(value) {
  return jspb.Message.setWrapperField(this, 10, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.CLIPPY.control.ControlGains} returns this
 */
proto.CLIPPY.control.ControlGains.prototype.clearTu = function() {
  return this.setTu(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.CLIPPY.control.ControlGains.prototype.hasTu = function() {
  return jspb.Message.getField(this, 10) != null;
};


/**
 * optional ZNControlRule znControlRule = 11;
 * @return {!proto.CLIPPY.control.ZNControlRule}
 */
proto.CLIPPY.control.ControlGains.prototype.getZncontrolrule = function() {
  return /** @type {!proto.CLIPPY.control.ZNControlRule} */ (jspb.Message.getFieldWithDefault(this, 11, 0));
};


/**
 * @param {!proto.CLIPPY.control.ZNControlRule} value
 * @return {!proto.CLIPPY.control.ControlGains} returns this
 */
proto.CLIPPY.control.ControlGains.prototype.setZncontrolrule = function(value) {
  return jspb.Message.setProto3EnumField(this, 11, value);
};


