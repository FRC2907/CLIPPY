// source: Waypoint.proto
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

goog.provide('proto.CLIPPY.control.Waypoint');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');

goog.forwardDeclare('proto.CLIPPY.control.WaypointType');
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
proto.CLIPPY.control.Waypoint = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.CLIPPY.control.Waypoint, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.CLIPPY.control.Waypoint.displayName = 'proto.CLIPPY.control.Waypoint';
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
proto.CLIPPY.control.Waypoint.prototype.toObject = function(opt_includeInstance) {
  return proto.CLIPPY.control.Waypoint.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.CLIPPY.control.Waypoint} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.CLIPPY.control.Waypoint.toObject = function(includeInstance, msg) {
  var f, obj = {
timestamp: (f = msg.getTimestamp()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
waypointType: jspb.Message.getFieldWithDefault(msg, 2, 0),
x: jspb.Message.getFloatingPointFieldWithDefault(msg, 7, 0.0),
y: jspb.Message.getFloatingPointFieldWithDefault(msg, 8, 0.0),
z: jspb.Message.getFloatingPointFieldWithDefault(msg, 9, 0.0),
tXy: jspb.Message.getFloatingPointFieldWithDefault(msg, 10, 0.0),
dx: jspb.Message.getFloatingPointFieldWithDefault(msg, 13, 0.0),
dy: jspb.Message.getFloatingPointFieldWithDefault(msg, 14, 0.0),
dz: jspb.Message.getFloatingPointFieldWithDefault(msg, 15, 0.0),
dtXy: jspb.Message.getFloatingPointFieldWithDefault(msg, 16, 0.0)
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
 * @return {!proto.CLIPPY.control.Waypoint}
 */
proto.CLIPPY.control.Waypoint.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.CLIPPY.control.Waypoint;
  return proto.CLIPPY.control.Waypoint.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.CLIPPY.control.Waypoint} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.CLIPPY.control.Waypoint}
 */
proto.CLIPPY.control.Waypoint.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setTimestamp(value);
      break;
    case 2:
      var value = /** @type {!proto.CLIPPY.control.WaypointType} */ (reader.readEnum());
      msg.setWaypointType(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readDouble());
      msg.setX(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readDouble());
      msg.setY(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readDouble());
      msg.setZ(value);
      break;
    case 10:
      var value = /** @type {number} */ (reader.readDouble());
      msg.setTXy(value);
      break;
    case 13:
      var value = /** @type {number} */ (reader.readDouble());
      msg.setDx(value);
      break;
    case 14:
      var value = /** @type {number} */ (reader.readDouble());
      msg.setDy(value);
      break;
    case 15:
      var value = /** @type {number} */ (reader.readDouble());
      msg.setDz(value);
      break;
    case 16:
      var value = /** @type {number} */ (reader.readDouble());
      msg.setDtXy(value);
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
proto.CLIPPY.control.Waypoint.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.CLIPPY.control.Waypoint.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.CLIPPY.control.Waypoint} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.CLIPPY.control.Waypoint.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTimestamp();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getWaypointType();
  if (f !== 0.0) {
    writer.writeEnum(
      2,
      f
    );
  }
  f = message.getX();
  if (f !== 0.0) {
    writer.writeDouble(
      7,
      f
    );
  }
  f = message.getY();
  if (f !== 0.0) {
    writer.writeDouble(
      8,
      f
    );
  }
  f = message.getZ();
  if (f !== 0.0) {
    writer.writeDouble(
      9,
      f
    );
  }
  f = message.getTXy();
  if (f !== 0.0) {
    writer.writeDouble(
      10,
      f
    );
  }
  f = message.getDx();
  if (f !== 0.0) {
    writer.writeDouble(
      13,
      f
    );
  }
  f = message.getDy();
  if (f !== 0.0) {
    writer.writeDouble(
      14,
      f
    );
  }
  f = message.getDz();
  if (f !== 0.0) {
    writer.writeDouble(
      15,
      f
    );
  }
  f = message.getDtXy();
  if (f !== 0.0) {
    writer.writeDouble(
      16,
      f
    );
  }
};


/**
 * optional google.protobuf.Timestamp timestamp = 1;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.CLIPPY.control.Waypoint.prototype.getTimestamp = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 1));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.CLIPPY.control.Waypoint} returns this
*/
proto.CLIPPY.control.Waypoint.prototype.setTimestamp = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.CLIPPY.control.Waypoint} returns this
 */
proto.CLIPPY.control.Waypoint.prototype.clearTimestamp = function() {
  return this.setTimestamp(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.CLIPPY.control.Waypoint.prototype.hasTimestamp = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional WaypointType waypoint_type = 2;
 * @return {!proto.CLIPPY.control.WaypointType}
 */
proto.CLIPPY.control.Waypoint.prototype.getWaypointType = function() {
  return /** @type {!proto.CLIPPY.control.WaypointType} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {!proto.CLIPPY.control.WaypointType} value
 * @return {!proto.CLIPPY.control.Waypoint} returns this
 */
proto.CLIPPY.control.Waypoint.prototype.setWaypointType = function(value) {
  return jspb.Message.setProto3EnumField(this, 2, value);
};


/**
 * optional double x = 7;
 * @return {number}
 */
proto.CLIPPY.control.Waypoint.prototype.getX = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 7, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.CLIPPY.control.Waypoint} returns this
 */
proto.CLIPPY.control.Waypoint.prototype.setX = function(value) {
  return jspb.Message.setProto3FloatField(this, 7, value);
};


/**
 * optional double y = 8;
 * @return {number}
 */
proto.CLIPPY.control.Waypoint.prototype.getY = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 8, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.CLIPPY.control.Waypoint} returns this
 */
proto.CLIPPY.control.Waypoint.prototype.setY = function(value) {
  return jspb.Message.setProto3FloatField(this, 8, value);
};


/**
 * optional double z = 9;
 * @return {number}
 */
proto.CLIPPY.control.Waypoint.prototype.getZ = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 9, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.CLIPPY.control.Waypoint} returns this
 */
proto.CLIPPY.control.Waypoint.prototype.setZ = function(value) {
  return jspb.Message.setProto3FloatField(this, 9, value);
};


/**
 * optional double t_xy = 10;
 * @return {number}
 */
proto.CLIPPY.control.Waypoint.prototype.getTXy = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 10, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.CLIPPY.control.Waypoint} returns this
 */
proto.CLIPPY.control.Waypoint.prototype.setTXy = function(value) {
  return jspb.Message.setProto3FloatField(this, 10, value);
};


/**
 * optional double dx = 13;
 * @return {number}
 */
proto.CLIPPY.control.Waypoint.prototype.getDx = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 13, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.CLIPPY.control.Waypoint} returns this
 */
proto.CLIPPY.control.Waypoint.prototype.setDx = function(value) {
  return jspb.Message.setProto3FloatField(this, 13, value);
};


/**
 * optional double dy = 14;
 * @return {number}
 */
proto.CLIPPY.control.Waypoint.prototype.getDy = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 14, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.CLIPPY.control.Waypoint} returns this
 */
proto.CLIPPY.control.Waypoint.prototype.setDy = function(value) {
  return jspb.Message.setProto3FloatField(this, 14, value);
};


/**
 * optional double dz = 15;
 * @return {number}
 */
proto.CLIPPY.control.Waypoint.prototype.getDz = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 15, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.CLIPPY.control.Waypoint} returns this
 */
proto.CLIPPY.control.Waypoint.prototype.setDz = function(value) {
  return jspb.Message.setProto3FloatField(this, 15, value);
};


/**
 * optional double dt_xy = 16;
 * @return {number}
 */
proto.CLIPPY.control.Waypoint.prototype.getDtXy = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 16, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.CLIPPY.control.Waypoint} returns this
 */
proto.CLIPPY.control.Waypoint.prototype.setDtXy = function(value) {
  return jspb.Message.setProto3FloatField(this, 16, value);
};


