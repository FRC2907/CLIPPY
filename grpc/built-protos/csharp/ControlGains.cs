// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: ControlGains.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace CLIPPY.Control {

  /// <summary>Holder for reflection information generated from ControlGains.proto</summary>
  public static partial class ControlGainsReflection {

    #region Descriptor
    /// <summary>File descriptor for ControlGains.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static ControlGainsReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "ChJDb250cm9sR2FpbnMucHJvdG8SDkNMSVBQWS5jb250cm9sIpEBCgxDb250",
            "cm9sR2FpbnMSEQoJc3lzdGVtX2lkGAEgASgJEgoKAmtQGAcgASgBEgoKAmtJ",
            "GAggASgBEgoKAmtEGAkgASgBEhEKCWtGX3N0YXRpYxgKIAEoARIRCglrRl9s",
            "aW5lYXIYCyABKAESEQoJa0Zfc3F1YXJlGAwgASgBEhEKCWtGX2Nvc2luZRgN",
            "IAEoAWIGcHJvdG8z"));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::CLIPPY.Control.ControlGains), global::CLIPPY.Control.ControlGains.Parser, new[]{ "SystemId", "KP", "KI", "KD", "KFStatic", "KFLinear", "KFSquare", "KFCosine" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class ControlGains : pb::IMessage<ControlGains>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<ControlGains> _parser = new pb::MessageParser<ControlGains>(() => new ControlGains());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<ControlGains> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::CLIPPY.Control.ControlGainsReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public ControlGains() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public ControlGains(ControlGains other) : this() {
      systemId_ = other.systemId_;
      kP_ = other.kP_;
      kI_ = other.kI_;
      kD_ = other.kD_;
      kFStatic_ = other.kFStatic_;
      kFLinear_ = other.kFLinear_;
      kFSquare_ = other.kFSquare_;
      kFCosine_ = other.kFCosine_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public ControlGains Clone() {
      return new ControlGains(this);
    }

    /// <summary>Field number for the "system_id" field.</summary>
    public const int SystemIdFieldNumber = 1;
    private string systemId_ = "";
    /// <summary>
    /// recall that all fields are optional
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string SystemId {
      get { return systemId_; }
      set {
        systemId_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "kP" field.</summary>
    public const int KPFieldNumber = 7;
    private double kP_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public double KP {
      get { return kP_; }
      set {
        kP_ = value;
      }
    }

    /// <summary>Field number for the "kI" field.</summary>
    public const int KIFieldNumber = 8;
    private double kI_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public double KI {
      get { return kI_; }
      set {
        kI_ = value;
      }
    }

    /// <summary>Field number for the "kD" field.</summary>
    public const int KDFieldNumber = 9;
    private double kD_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public double KD {
      get { return kD_; }
      set {
        kD_ = value;
      }
    }

    /// <summary>Field number for the "kF_static" field.</summary>
    public const int KFStaticFieldNumber = 10;
    private double kFStatic_;
    /// <summary>
    /// kS for vel ctl
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public double KFStatic {
      get { return kFStatic_; }
      set {
        kFStatic_ = value;
      }
    }

    /// <summary>Field number for the "kF_linear" field.</summary>
    public const int KFLinearFieldNumber = 11;
    private double kFLinear_;
    /// <summary>
    /// kV for vel ctl
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public double KFLinear {
      get { return kFLinear_; }
      set {
        kFLinear_ = value;
      }
    }

    /// <summary>Field number for the "kF_square" field.</summary>
    public const int KFSquareFieldNumber = 12;
    private double kFSquare_;
    /// <summary>
    /// kA for vel ctl
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public double KFSquare {
      get { return kFSquare_; }
      set {
        kFSquare_ = value;
      }
    }

    /// <summary>Field number for the "kF_cosine" field.</summary>
    public const int KFCosineFieldNumber = 13;
    private double kFCosine_;
    /// <summary>
    /// kG for arm pos ctl
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public double KFCosine {
      get { return kFCosine_; }
      set {
        kFCosine_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as ControlGains);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(ControlGains other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (SystemId != other.SystemId) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.Equals(KP, other.KP)) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.Equals(KI, other.KI)) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.Equals(KD, other.KD)) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.Equals(KFStatic, other.KFStatic)) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.Equals(KFLinear, other.KFLinear)) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.Equals(KFSquare, other.KFSquare)) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.Equals(KFCosine, other.KFCosine)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (SystemId.Length != 0) hash ^= SystemId.GetHashCode();
      if (KP != 0D) hash ^= pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.GetHashCode(KP);
      if (KI != 0D) hash ^= pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.GetHashCode(KI);
      if (KD != 0D) hash ^= pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.GetHashCode(KD);
      if (KFStatic != 0D) hash ^= pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.GetHashCode(KFStatic);
      if (KFLinear != 0D) hash ^= pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.GetHashCode(KFLinear);
      if (KFSquare != 0D) hash ^= pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.GetHashCode(KFSquare);
      if (KFCosine != 0D) hash ^= pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.GetHashCode(KFCosine);
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
      if (SystemId.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(SystemId);
      }
      if (KP != 0D) {
        output.WriteRawTag(57);
        output.WriteDouble(KP);
      }
      if (KI != 0D) {
        output.WriteRawTag(65);
        output.WriteDouble(KI);
      }
      if (KD != 0D) {
        output.WriteRawTag(73);
        output.WriteDouble(KD);
      }
      if (KFStatic != 0D) {
        output.WriteRawTag(81);
        output.WriteDouble(KFStatic);
      }
      if (KFLinear != 0D) {
        output.WriteRawTag(89);
        output.WriteDouble(KFLinear);
      }
      if (KFSquare != 0D) {
        output.WriteRawTag(97);
        output.WriteDouble(KFSquare);
      }
      if (KFCosine != 0D) {
        output.WriteRawTag(105);
        output.WriteDouble(KFCosine);
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
      if (SystemId.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(SystemId);
      }
      if (KP != 0D) {
        output.WriteRawTag(57);
        output.WriteDouble(KP);
      }
      if (KI != 0D) {
        output.WriteRawTag(65);
        output.WriteDouble(KI);
      }
      if (KD != 0D) {
        output.WriteRawTag(73);
        output.WriteDouble(KD);
      }
      if (KFStatic != 0D) {
        output.WriteRawTag(81);
        output.WriteDouble(KFStatic);
      }
      if (KFLinear != 0D) {
        output.WriteRawTag(89);
        output.WriteDouble(KFLinear);
      }
      if (KFSquare != 0D) {
        output.WriteRawTag(97);
        output.WriteDouble(KFSquare);
      }
      if (KFCosine != 0D) {
        output.WriteRawTag(105);
        output.WriteDouble(KFCosine);
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
      if (SystemId.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(SystemId);
      }
      if (KP != 0D) {
        size += 1 + 8;
      }
      if (KI != 0D) {
        size += 1 + 8;
      }
      if (KD != 0D) {
        size += 1 + 8;
      }
      if (KFStatic != 0D) {
        size += 1 + 8;
      }
      if (KFLinear != 0D) {
        size += 1 + 8;
      }
      if (KFSquare != 0D) {
        size += 1 + 8;
      }
      if (KFCosine != 0D) {
        size += 1 + 8;
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(ControlGains other) {
      if (other == null) {
        return;
      }
      if (other.SystemId.Length != 0) {
        SystemId = other.SystemId;
      }
      if (other.KP != 0D) {
        KP = other.KP;
      }
      if (other.KI != 0D) {
        KI = other.KI;
      }
      if (other.KD != 0D) {
        KD = other.KD;
      }
      if (other.KFStatic != 0D) {
        KFStatic = other.KFStatic;
      }
      if (other.KFLinear != 0D) {
        KFLinear = other.KFLinear;
      }
      if (other.KFSquare != 0D) {
        KFSquare = other.KFSquare;
      }
      if (other.KFCosine != 0D) {
        KFCosine = other.KFCosine;
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
            SystemId = input.ReadString();
            break;
          }
          case 57: {
            KP = input.ReadDouble();
            break;
          }
          case 65: {
            KI = input.ReadDouble();
            break;
          }
          case 73: {
            KD = input.ReadDouble();
            break;
          }
          case 81: {
            KFStatic = input.ReadDouble();
            break;
          }
          case 89: {
            KFLinear = input.ReadDouble();
            break;
          }
          case 97: {
            KFSquare = input.ReadDouble();
            break;
          }
          case 105: {
            KFCosine = input.ReadDouble();
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
            SystemId = input.ReadString();
            break;
          }
          case 57: {
            KP = input.ReadDouble();
            break;
          }
          case 65: {
            KI = input.ReadDouble();
            break;
          }
          case 73: {
            KD = input.ReadDouble();
            break;
          }
          case 81: {
            KFStatic = input.ReadDouble();
            break;
          }
          case 89: {
            KFLinear = input.ReadDouble();
            break;
          }
          case 97: {
            KFSquare = input.ReadDouble();
            break;
          }
          case 105: {
            KFCosine = input.ReadDouble();
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
