// source: ControlTarget.proto
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

goog.provide('proto.CLIPPY.control.MultiSystemControlTarget');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.CLIPPY.control.ControlTarget');
goog.require('proto.google.protobuf.Timestamp');

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
proto.CLIPPY.control.MultiSystemControlTarget = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.CLIPPY.control.MultiSystemControlTarget.repeatedFields_, null);
};
goog.inherits(proto.CLIPPY.control.MultiSystemControlTarget, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.CLIPPY.control.MultiSystemControlTarget.displayName = 'proto.CLIPPY.control.MultiSystemControlTarget';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.CLIPPY.control.MultiSystemControlTarget.repeatedFields_ = [3];



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
proto.CLIPPY.control.MultiSystemControlTarget.prototype.toObject = function(opt_includeInstance) {
  return proto.CLIPPY.control.MultiSystemControlTarget.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.CLIPPY.control.MultiSystemControlTarget} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.CLIPPY.control.MultiSystemControlTarget.toObject = function(includeInstance, msg) {
  var f, obj = {
timestamp: (f = msg.getTimestamp()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
targetsList: jspb.Message.toObjectList(msg.getTargetsList(),
    proto.CLIPPY.control.ControlTarget.toObject, includeInstance)
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
 * @return {!proto.CLIPPY.control.MultiSystemControlTarget}
 */
proto.CLIPPY.control.MultiSystemControlTarget.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.CLIPPY.control.MultiSystemControlTarget;
  return proto.CLIPPY.control.MultiSystemControlTarget.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.CLIPPY.control.MultiSystemControlTarget} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.CLIPPY.control.MultiSystemControlTarget}
 */
proto.CLIPPY.control.MultiSystemControlTarget.deserializeBinaryFromReader = function(msg, reader) {
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
    case 3:
      var value = new proto.CLIPPY.control.ControlTarget;
      reader.readMessage(value,proto.CLIPPY.control.ControlTarget.deserializeBinaryFromReader);
      msg.addTargets(value);
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
proto.CLIPPY.control.MultiSystemControlTarget.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.CLIPPY.control.MultiSystemControlTarget.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.CLIPPY.control.MultiSystemControlTarget} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.CLIPPY.control.MultiSystemControlTarget.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTimestamp();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getTargetsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.CLIPPY.control.ControlTarget.serializeBinaryToWriter
    );
  }
};


/**
 * optional google.protobuf.Timestamp timestamp = 1;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.CLIPPY.control.MultiSystemControlTarget.prototype.getTimestamp = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 1));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.CLIPPY.control.MultiSystemControlTarget} returns this
*/
proto.CLIPPY.control.MultiSystemControlTarget.prototype.setTimestamp = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.CLIPPY.control.MultiSystemControlTarget} returns this
 */
proto.CLIPPY.control.MultiSystemControlTarget.prototype.clearTimestamp = function() {
  return this.setTimestamp(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.CLIPPY.control.MultiSystemControlTarget.prototype.hasTimestamp = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated ControlTarget targets = 3;
 * @return {!Array<!proto.CLIPPY.control.ControlTarget>}
 */
proto.CLIPPY.control.MultiSystemControlTarget.prototype.getTargetsList = function() {
  return /** @type{!Array<!proto.CLIPPY.control.ControlTarget>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.CLIPPY.control.ControlTarget, 3));
};


/**
 * @param {!Array<!proto.CLIPPY.control.ControlTarget>} value
 * @return {!proto.CLIPPY.control.MultiSystemControlTarget} returns this
*/
proto.CLIPPY.control.MultiSystemControlTarget.prototype.setTargetsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.CLIPPY.control.ControlTarget=} opt_value
 * @param {number=} opt_index
 * @return {!proto.CLIPPY.control.ControlTarget}
 */
proto.CLIPPY.control.MultiSystemControlTarget.prototype.addTargets = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.CLIPPY.control.ControlTarget, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.CLIPPY.control.MultiSystemControlTarget} returns this
 */
proto.CLIPPY.control.MultiSystemControlTarget.prototype.clearTargetsList = function() {
  return this.setTargetsList([]);
};


