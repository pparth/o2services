import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import java.util.*;

public class Insert_args implements org.apache.thrift.TBase<Insert_args, Insert_args._Fields>, java.io.Serializable, Cloneable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Insert_args");

    private static final org.apache.thrift.protocol.TField APPLICANT_RECOMMENDATION_FIELD_DESC = new org.apache.thrift.protocol.TField("applicantRecommendation", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
        schemes.put(StandardScheme.class, new Insert_argsStandardSchemeFactory());
        schemes.put(TupleScheme.class, new Insert_argsTupleSchemeFactory());
    }

    private ApplicantRecommendation applicantRecommendation; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        APPLICANT_RECOMMENDATION((short)1, "applicantRecommendation");

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
                case 1: // APPLICANT_RECOMMENDATION
                    return APPLICANT_RECOMMENDATION;
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
        tmpMap.put(_Fields.APPLICANT_RECOMMENDATION, new org.apache.thrift.meta_data.FieldMetaData("applicantRecommendation", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ApplicantRecommendation.class)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Insert_args.class, metaDataMap);
    }

    public Insert_args() {
    }

    public Insert_args(
            ApplicantRecommendation applicantRecommendation)
    {
        this();
        this.applicantRecommendation = applicantRecommendation;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public Insert_args(Insert_args other) {
        if (other.isSetApplicantRecommendation()) {
            this.applicantRecommendation = new ApplicantRecommendation(other.applicantRecommendation);
        }
    }

    public Insert_args deepCopy() {
        return new Insert_args(this);
    }

    @Override
    public void clear() {
        this.applicantRecommendation = null;
    }

    public ApplicantRecommendation getApplicantRecommendation() {
        return this.applicantRecommendation;
    }

    public void setApplicantRecommendation(ApplicantRecommendation applicantRecommendation) {
        this.applicantRecommendation = applicantRecommendation;
    }

    public void unsetApplicantRecommendation() {
        this.applicantRecommendation = null;
    }

    /** Returns true if field applicantRecommendation is set (has been assigned a value) and false otherwise */
    public boolean isSetApplicantRecommendation() {
        return this.applicantRecommendation != null;
    }

    public void setApplicantRecommendationIsSet(boolean value) {
        if (!value) {
            this.applicantRecommendation = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case APPLICANT_RECOMMENDATION:
                if (value == null) {
                    unsetApplicantRecommendation();
                } else {
                    setApplicantRecommendation((ApplicantRecommendation)value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case APPLICANT_RECOMMENDATION:
                return getApplicantRecommendation();

        }
        throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case APPLICANT_RECOMMENDATION:
                return isSetApplicantRecommendation();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof Insert_args)
            return this.equals((Insert_args)that);
        return false;
    }

    public boolean equals(Insert_args that) {
        if (that == null)
            return false;

        boolean this_present_applicantRecommendation = true && this.isSetApplicantRecommendation();
        boolean that_present_applicantRecommendation = true && that.isSetApplicantRecommendation();
        if (this_present_applicantRecommendation || that_present_applicantRecommendation) {
            if (!(this_present_applicantRecommendation && that_present_applicantRecommendation))
                return false;
            if (!this.applicantRecommendation.equals(that.applicantRecommendation))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public int compareTo(Insert_args other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;
        Insert_args typedOther = (Insert_args)other;

        lastComparison = Boolean.valueOf(isSetApplicantRecommendation()).compareTo(typedOther.isSetApplicantRecommendation());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetApplicantRecommendation()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.applicantRecommendation, typedOther.applicantRecommendation);
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
        StringBuilder sb = new StringBuilder("Insert_args(");
        boolean first = true;

        sb.append("applicantRecommendation:");
        if (this.applicantRecommendation == null) {
            sb.append("null");
        } else {
            sb.append(this.applicantRecommendation);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // check for sub-struct validity
        if (applicantRecommendation != null) {
            applicantRecommendation.validate();
        }
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

    private static class Insert_argsStandardSchemeFactory implements SchemeFactory {
        public Insert_argsStandardScheme getScheme() {
            return new Insert_argsStandardScheme();
        }
    }

    private static class Insert_argsStandardScheme extends StandardScheme<Insert_args> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, Insert_args struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true)
            {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // APPLICANT_RECOMMENDATION
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                            struct.applicantRecommendation = new ApplicantRecommendation();
                            struct.applicantRecommendation.read(iprot);
                            struct.setApplicantRecommendationIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, Insert_args struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.applicantRecommendation != null) {
                oprot.writeFieldBegin(APPLICANT_RECOMMENDATION_FIELD_DESC);
                struct.applicantRecommendation.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class Insert_argsTupleSchemeFactory implements SchemeFactory {
        public Insert_argsTupleScheme getScheme() {
            return new Insert_argsTupleScheme();
        }
    }

    private static class Insert_argsTupleScheme extends TupleScheme<Insert_args> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, Insert_args struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetApplicantRecommendation()) {
                optionals.set(0);
            }
            oprot.writeBitSet(optionals, 1);
            if (struct.isSetApplicantRecommendation()) {
                struct.applicantRecommendation.write(oprot);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, Insert_args struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(1);
            if (incoming.get(0)) {
                struct.applicantRecommendation = new ApplicantRecommendation();
                struct.applicantRecommendation.read(iprot);
                struct.setApplicantRecommendationIsSet(true);
            }
        }
    }

}
