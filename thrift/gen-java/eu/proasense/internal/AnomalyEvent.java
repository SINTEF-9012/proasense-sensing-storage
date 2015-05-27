/**
 * Copyright 2015 Brian Elves�ter <${email}>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package eu.proasense.internal;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-3-31")
public class AnomalyEvent implements org.apache.thrift.TBase<AnomalyEvent, AnomalyEvent._Fields>, java.io.Serializable, Cloneable, Comparable<AnomalyEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AnomalyEvent");

  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField ANOMALY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("anomalyType", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField BLOB_FIELD_DESC = new org.apache.thrift.protocol.TField("blob", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AnomalyEventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AnomalyEventTupleSchemeFactory());
  }

  public long timestamp; // required
  public String anomalyType; // required
  public String blob; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TIMESTAMP((short)1, "timestamp"),
    ANOMALY_TYPE((short)2, "anomalyType"),
    BLOB((short)3, "blob");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TIMESTAMP
          return TIMESTAMP;
        case 2: // ANOMALY_TYPE
          return ANOMALY_TYPE;
        case 3: // BLOB
          return BLOB;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIMESTAMP_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "long")));
    tmpMap.put(_Fields.ANOMALY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("anomalyType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BLOB, new org.apache.thrift.meta_data.FieldMetaData("blob", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AnomalyEvent.class, metaDataMap);
  }

  public AnomalyEvent() {
  }

  public AnomalyEvent(
    long timestamp,
    String anomalyType,
    String blob)
  {
    this();
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    this.anomalyType = anomalyType;
    this.blob = blob;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AnomalyEvent(AnomalyEvent other) {
    __isset_bitfield = other.__isset_bitfield;
    this.timestamp = other.timestamp;
    if (other.isSetAnomalyType()) {
      this.anomalyType = other.anomalyType;
    }
    if (other.isSetBlob()) {
      this.blob = other.blob;
    }
  }

  public AnomalyEvent deepCopy() {
    return new AnomalyEvent(this);
  }

  @Override
  public void clear() {
    setTimestampIsSet(false);
    this.timestamp = 0;
    this.anomalyType = null;
    this.blob = null;
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public AnomalyEvent setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_ISSET_ID, value);
  }

  public String getAnomalyType() {
    return this.anomalyType;
  }

  public AnomalyEvent setAnomalyType(String anomalyType) {
    this.anomalyType = anomalyType;
    return this;
  }

  public void unsetAnomalyType() {
    this.anomalyType = null;
  }

  /** Returns true if field anomalyType is set (has been assigned a value) and false otherwise */
  public boolean isSetAnomalyType() {
    return this.anomalyType != null;
  }

  public void setAnomalyTypeIsSet(boolean value) {
    if (!value) {
      this.anomalyType = null;
    }
  }

  public String getBlob() {
    return this.blob;
  }

  public AnomalyEvent setBlob(String blob) {
    this.blob = blob;
    return this;
  }

  public void unsetBlob() {
    this.blob = null;
  }

  /** Returns true if field blob is set (has been assigned a value) and false otherwise */
  public boolean isSetBlob() {
    return this.blob != null;
  }

  public void setBlobIsSet(boolean value) {
    if (!value) {
      this.blob = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long)value);
      }
      break;

    case ANOMALY_TYPE:
      if (value == null) {
        unsetAnomalyType();
      } else {
        setAnomalyType((String)value);
      }
      break;

    case BLOB:
      if (value == null) {
        unsetBlob();
      } else {
        setBlob((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIMESTAMP:
      return Long.valueOf(getTimestamp());

    case ANOMALY_TYPE:
      return getAnomalyType();

    case BLOB:
      return getBlob();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TIMESTAMP:
      return isSetTimestamp();
    case ANOMALY_TYPE:
      return isSetAnomalyType();
    case BLOB:
      return isSetBlob();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AnomalyEvent)
      return this.equals((AnomalyEvent)that);
    return false;
  }

  public boolean equals(AnomalyEvent that) {
    if (that == null)
      return false;

    boolean this_present_timestamp = true;
    boolean that_present_timestamp = true;
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    boolean this_present_anomalyType = true && this.isSetAnomalyType();
    boolean that_present_anomalyType = true && that.isSetAnomalyType();
    if (this_present_anomalyType || that_present_anomalyType) {
      if (!(this_present_anomalyType && that_present_anomalyType))
        return false;
      if (!this.anomalyType.equals(that.anomalyType))
        return false;
    }

    boolean this_present_blob = true && this.isSetBlob();
    boolean that_present_blob = true && that.isSetBlob();
    if (this_present_blob || that_present_blob) {
      if (!(this_present_blob && that_present_blob))
        return false;
      if (!this.blob.equals(that.blob))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_timestamp = true;
    list.add(present_timestamp);
    if (present_timestamp)
      list.add(timestamp);

    boolean present_anomalyType = true && (isSetAnomalyType());
    list.add(present_anomalyType);
    if (present_anomalyType)
      list.add(anomalyType);

    boolean present_blob = true && (isSetBlob());
    list.add(present_blob);
    if (present_blob)
      list.add(blob);

    return list.hashCode();
  }

  @Override
  public int compareTo(AnomalyEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(other.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, other.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAnomalyType()).compareTo(other.isSetAnomalyType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnomalyType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.anomalyType, other.anomalyType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBlob()).compareTo(other.isSetBlob());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlob()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.blob, other.blob);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AnomalyEvent(");
    boolean first = true;

    sb.append("timestamp:");
    sb.append(this.timestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("anomalyType:");
    if (this.anomalyType == null) {
      sb.append("null");
    } else {
      sb.append(this.anomalyType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("blob:");
    if (this.blob == null) {
      sb.append("null");
    } else {
      sb.append(this.blob);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'timestamp' because it's a primitive and you chose the non-beans generator.
    if (anomalyType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'anomalyType' was not present! Struct: " + toString());
    }
    if (blob == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'blob' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AnomalyEventStandardSchemeFactory implements SchemeFactory {
    public AnomalyEventStandardScheme getScheme() {
      return new AnomalyEventStandardScheme();
    }
  }

  private static class AnomalyEventStandardScheme extends StandardScheme<AnomalyEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AnomalyEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ANOMALY_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.anomalyType = iprot.readString();
              struct.setAnomalyTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BLOB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.blob = iprot.readString();
              struct.setBlobIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetTimestamp()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'timestamp' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AnomalyEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.timestamp);
      oprot.writeFieldEnd();
      if (struct.anomalyType != null) {
        oprot.writeFieldBegin(ANOMALY_TYPE_FIELD_DESC);
        oprot.writeString(struct.anomalyType);
        oprot.writeFieldEnd();
      }
      if (struct.blob != null) {
        oprot.writeFieldBegin(BLOB_FIELD_DESC);
        oprot.writeString(struct.blob);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AnomalyEventTupleSchemeFactory implements SchemeFactory {
    public AnomalyEventTupleScheme getScheme() {
      return new AnomalyEventTupleScheme();
    }
  }

  private static class AnomalyEventTupleScheme extends TupleScheme<AnomalyEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AnomalyEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.timestamp);
      oprot.writeString(struct.anomalyType);
      oprot.writeString(struct.blob);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AnomalyEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.timestamp = iprot.readI64();
      struct.setTimestampIsSet(true);
      struct.anomalyType = iprot.readString();
      struct.setAnomalyTypeIsSet(true);
      struct.blob = iprot.readString();
      struct.setBlobIsSet(true);
    }
  }

}

