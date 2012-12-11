import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import java.util.*;

public class getAll_result implements org.apache.thrift.TBase<getAll_result, getAll_result._Fields>, java.io.Serializable, Cloneable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getAll_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.LIST, (short)0);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
        schemes.put(StandardScheme.class, new getAll_resultStandardSchemeFactory());
        schemes.put(TupleScheme.class, new getAll_resultTupleSchemeFactory());
    }

    private List<ApplicantRecommendation> success; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        SUCCESS((short)0, "success");

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
                case 0: // SUCCESS
                    return SUCCESS;
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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
                        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ApplicantRecommendation.class))));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(getAll_result.class, metaDataMap);
    }

    public getAll_result() {
    }

    public getAll_result(
            List<ApplicantRecommendation> success)
    {
        this();
        this.success = success;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public getAll_result(getAll_result other) {
        if (other.isSetSuccess()) {
            List<ApplicantRecommendation> __this__success = new ArrayList<ApplicantRecommendation>();
            for (ApplicantRecommendation other_element : other.success) {
                __this__success.add(new ApplicantRecommendation(other_element));
            }
            this.success = __this__success;
        }
    }

    public getAll_result deepCopy() {
        return new getAll_result(this);
    }

    @Override
    public void clear() {
        this.success = null;
    }

    public int getSuccessSize() {
        return (this.success == null) ? 0 : this.success.size();
    }

    public java.util.Iterator<ApplicantRecommendation> getSuccessIterator() {
        return (this.success == null) ? null : this.success.iterator();
    }

    public void addToSuccess(ApplicantRecommendation elem) {
        if (this.success == null) {
            this.success = new ArrayList<ApplicantRecommendation>();
        }
        this.success.add(elem);
    }

    public List<ApplicantRecommendation> getSuccess() {
        return this.success;
    }

    public void setSuccess(List<ApplicantRecommendation> success) {
        this.success = success;
    }

    public void unsetSuccess() {
        this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
        return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
        if (!value) {
            this.success = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case SUCCESS:
                if (value == null) {
                    unsetSuccess();
                } else {
                    setSuccess((List<ApplicantRecommendation>)value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case SUCCESS:
                return getSuccess();

        }
        throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case SUCCESS:
                return isSetSuccess();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof getAll_result)
            return this.equals((getAll_result)that);
        return false;
    }

    public boolean equals(getAll_result that) {
        if (that == null)
            return false;

        boolean this_present_success = true && this.isSetSuccess();
        boolean that_present_success = true && that.isSetSuccess();
        if (this_present_success || that_present_success) {
            if (!(this_present_success && that_present_success))
                return false;
            if (!this.success.equals(that.success))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public int compareTo(getAll_result other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;
        getAll_result typedOther = (getAll_result)other;

        lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(typedOther.isSetSuccess());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetSuccess()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, typedOther.success);
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
        StringBuilder sb = new StringBuilder("getAll_result(");
        boolean first = true;

        sb.append("success:");
        if (this.success == null) {
            sb.append("null");
        } else {
            sb.append(this.success);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
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
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class getAll_resultStandardSchemeFactory implements SchemeFactory {
        public getAll_resultStandardScheme getScheme() {
            return new getAll_resultStandardScheme();
        }
    }

    private static class getAll_resultStandardScheme extends StandardScheme<getAll_result> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, getAll_result struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true)
            {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 0: // SUCCESS
                        if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                            {
                                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                                struct.success = new ArrayList<ApplicantRecommendation>(_list0.size);
                                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                                {
                                    ApplicantRecommendation _elem2; // required
                                    _elem2 = new ApplicantRecommendation();
                                    _elem2.read(iprot);
                                    struct.success.add(_elem2);
                                }
                                iprot.readListEnd();
                            }
                            struct.setSuccessIsSet(true);
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
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, getAll_result struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.success != null) {
                oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
                {
                    oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.success.size()));
                    for (ApplicantRecommendation _iter3 : struct.success)
                    {
                        _iter3.write(oprot);
                    }
                    oprot.writeListEnd();
                }
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class getAll_resultTupleSchemeFactory implements SchemeFactory {
        public getAll_resultTupleScheme getScheme() {
            return new getAll_resultTupleScheme();
        }
    }

    private static class getAll_resultTupleScheme extends TupleScheme<getAll_result> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, getAll_result struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetSuccess()) {
                optionals.set(0);
            }
            oprot.writeBitSet(optionals, 1);
            if (struct.isSetSuccess()) {
                {
                    oprot.writeI32(struct.success.size());
                    for (ApplicantRecommendation _iter4 : struct.success)
                    {
                        _iter4.write(oprot);
                    }
                }
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, getAll_result struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(1);
            if (incoming.get(0)) {
                {
                    org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
                    struct.success = new ArrayList<ApplicantRecommendation>(_list5.size);
                    for (int _i6 = 0; _i6 < _list5.size; ++_i6)
                    {
                        ApplicantRecommendation _elem7; // required
                        _elem7 = new ApplicantRecommendation();
                        _elem7.read(iprot);
                        struct.success.add(_elem7);
                    }
                }
                struct.setSuccessIsSet(true);
            }
        }
    }

}