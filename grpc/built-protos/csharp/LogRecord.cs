// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: LogRecord.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace CLIPPY.Log {

  /// <summary>Holder for reflection information generated from LogRecord.proto</summary>
  public static partial class LogRecordReflection {

    #region Descriptor
    /// <summary>File descriptor for LogRecord.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static LogRecordReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "Cg9Mb2dSZWNvcmQucHJvdG8SCkNMSVBQWS5sb2caH2dvb2dsZS9wcm90b2J1",
            "Zi90aW1lc3RhbXAucHJvdG8ihgEKCUxvZ1JlY29yZBItCgl0aW1lc3RhbXAY",
            "ASABKAsyGi5nb29nbGUucHJvdG9idWYuVGltZXN0YW1wEhAKCHJlcG9ydGVy",
            "GAIgASgJEikKCHNldmVyaXR5GAMgASgOMhcuQ0xJUFBZLmxvZy5Mb2dTZXZl",
            "cml0eRINCgV2YWx1ZRgEIAEoCSpXCgtMb2dTZXZlcml0eRILCgdVTktOT1dO",
            "EAASCQoFVFJBQ0UQARIJCgVERUJVRxACEggKBElORk8QAxIGCgJPSxAEEggK",
            "BFdBUk4QBRIJCgVFUlJPUhAGYgZwcm90bzM="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Google.Protobuf.WellKnownTypes.TimestampReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(new[] {typeof(global::CLIPPY.Log.LogSeverity), }, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::CLIPPY.Log.LogRecord), global::CLIPPY.Log.LogRecord.Parser, new[]{ "Timestamp", "Reporter", "Severity", "Value" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Enums
  public enum LogSeverity {
    [pbr::OriginalName("UNKNOWN")] Unknown = 0,
    [pbr::OriginalName("TRACE")] Trace = 1,
    [pbr::OriginalName("DEBUG")] Debug = 2,
    [pbr::OriginalName("INFO")] Info = 3,
    [pbr::OriginalName("OK")] Ok = 4,
    [pbr::OriginalName("WARN")] Warn = 5,
    /// <summary>
    ///FATAL = 7;
    /// </summary>
    [pbr::OriginalName("ERROR")] Error = 6,
  }

  #endregion

  #region Messages
  public sealed partial class LogRecord : pb::IMessage<LogRecord>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<LogRecord> _parser = new pb::MessageParser<LogRecord>(() => new LogRecord());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<LogRecord> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::CLIPPY.Log.LogRecordReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public LogRecord() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public LogRecord(LogRecord other) : this() {
      timestamp_ = other.timestamp_ != null ? other.timestamp_.Clone() : null;
      reporter_ = other.reporter_;
      severity_ = other.severity_;
      value_ = other.value_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public LogRecord Clone() {
      return new LogRecord(this);
    }

    /// <summary>Field number for the "timestamp" field.</summary>
    public const int TimestampFieldNumber = 1;
    private global::Google.Protobuf.WellKnownTypes.Timestamp timestamp_;
    /// <summary>
    /// When did this happen
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::Google.Protobuf.WellKnownTypes.Timestamp Timestamp {
      get { return timestamp_; }
      set {
        timestamp_ = value;
      }
    }

    /// <summary>Field number for the "reporter" field.</summary>
    public const int ReporterFieldNumber = 2;
    private string reporter_ = "";
    /// <summary>
    /// Who wants to record this event
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Reporter {
      get { return reporter_; }
      set {
        reporter_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "severity" field.</summary>
    public const int SeverityFieldNumber = 3;
    private global::CLIPPY.Log.LogSeverity severity_ = global::CLIPPY.Log.LogSeverity.Unknown;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::CLIPPY.Log.LogSeverity Severity {
      get { return severity_; }
      set {
        severity_ = value;
      }
    }

    /// <summary>Field number for the "value" field.</summary>
    public const int ValueFieldNumber = 4;
    private string value_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Value {
      get { return value_; }
      set {
        value_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as LogRecord);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(LogRecord other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (!object.Equals(Timestamp, other.Timestamp)) return false;
      if (Reporter != other.Reporter) return false;
      if (Severity != other.Severity) return false;
      if (Value != other.Value) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (timestamp_ != null) hash ^= Timestamp.GetHashCode();
      if (Reporter.Length != 0) hash ^= Reporter.GetHashCode();
      if (Severity != global::CLIPPY.Log.LogSeverity.Unknown) hash ^= Severity.GetHashCode();
      if (Value.Length != 0) hash ^= Value.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void WriteTo(pb::CodedOutputStream output) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      output.WriteRawMessage(this);
    #else
      if (timestamp_ != null) {
        output.WriteRawTag(10);
        output.WriteMessage(Timestamp);
      }
      if (Reporter.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Reporter);
      }
      if (Severity != global::CLIPPY.Log.LogSeverity.Unknown) {
        output.WriteRawTag(24);
        output.WriteEnum((int) Severity);
      }
      if (Value.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(Value);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      if (timestamp_ != null) {
        output.WriteRawTag(10);
        output.WriteMessage(Timestamp);
      }
      if (Reporter.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Reporter);
      }
      if (Severity != global::CLIPPY.Log.LogSeverity.Unknown) {
        output.WriteRawTag(24);
        output.WriteEnum((int) Severity);
      }
      if (Value.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(Value);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int CalculateSize() {
      int size = 0;
      if (timestamp_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Timestamp);
      }
      if (Reporter.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Reporter);
      }
      if (Severity != global::CLIPPY.Log.LogSeverity.Unknown) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) Severity);
      }
      if (Value.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Value);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(LogRecord other) {
      if (other == null) {
        return;
      }
      if (other.timestamp_ != null) {
        if (timestamp_ == null) {
          Timestamp = new global::Google.Protobuf.WellKnownTypes.Timestamp();
        }
        Timestamp.MergeFrom(other.Timestamp);
      }
      if (other.Reporter.Length != 0) {
        Reporter = other.Reporter;
      }
      if (other.Severity != global::CLIPPY.Log.LogSeverity.Unknown) {
        Severity = other.Severity;
      }
      if (other.Value.Length != 0) {
        Value = other.Value;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            if (timestamp_ == null) {
              Timestamp = new global::Google.Protobuf.WellKnownTypes.Timestamp();
            }
            input.ReadMessage(Timestamp);
            break;
          }
          case 18: {
            Reporter = input.ReadString();
            break;
          }
          case 24: {
            Severity = (global::CLIPPY.Log.LogSeverity) input.ReadEnum();
            break;
          }
          case 34: {
            Value = input.ReadString();
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 10: {
            if (timestamp_ == null) {
              Timestamp = new global::Google.Protobuf.WellKnownTypes.Timestamp();
            }
            input.ReadMessage(Timestamp);
            break;
          }
          case 18: {
            Reporter = input.ReadString();
            break;
          }
          case 24: {
            Severity = (global::CLIPPY.Log.LogSeverity) input.ReadEnum();
            break;
          }
          case 34: {
            Value = input.ReadString();
            break;
          }
        }
      }
    }
    #endif

  }

  #endregion

}

#endregion Designer generated code
