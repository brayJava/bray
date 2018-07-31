package com.whiteplanet.mapper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctorJoinClinicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorJoinClinicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(String value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(String value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(String value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(String value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(String value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLike(String value) {
            addCriterion("doctor_id like", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotLike(String value) {
            addCriterion("doctor_id not like", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<String> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<String> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(String value1, String value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(String value1, String value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andClinicIdIsNull() {
            addCriterion("clinic_id is null");
            return (Criteria) this;
        }

        public Criteria andClinicIdIsNotNull() {
            addCriterion("clinic_id is not null");
            return (Criteria) this;
        }

        public Criteria andClinicIdEqualTo(String value) {
            addCriterion("clinic_id =", value, "clinicId");
            return (Criteria) this;
        }

        public Criteria andClinicIdNotEqualTo(String value) {
            addCriterion("clinic_id <>", value, "clinicId");
            return (Criteria) this;
        }

        public Criteria andClinicIdGreaterThan(String value) {
            addCriterion("clinic_id >", value, "clinicId");
            return (Criteria) this;
        }

        public Criteria andClinicIdGreaterThanOrEqualTo(String value) {
            addCriterion("clinic_id >=", value, "clinicId");
            return (Criteria) this;
        }

        public Criteria andClinicIdLessThan(String value) {
            addCriterion("clinic_id <", value, "clinicId");
            return (Criteria) this;
        }

        public Criteria andClinicIdLessThanOrEqualTo(String value) {
            addCriterion("clinic_id <=", value, "clinicId");
            return (Criteria) this;
        }

        public Criteria andClinicIdLike(String value) {
            addCriterion("clinic_id like", value, "clinicId");
            return (Criteria) this;
        }

        public Criteria andClinicIdNotLike(String value) {
            addCriterion("clinic_id not like", value, "clinicId");
            return (Criteria) this;
        }

        public Criteria andClinicIdIn(List<String> values) {
            addCriterion("clinic_id in", values, "clinicId");
            return (Criteria) this;
        }

        public Criteria andClinicIdNotIn(List<String> values) {
            addCriterion("clinic_id not in", values, "clinicId");
            return (Criteria) this;
        }

        public Criteria andClinicIdBetween(String value1, String value2) {
            addCriterion("clinic_id between", value1, value2, "clinicId");
            return (Criteria) this;
        }

        public Criteria andClinicIdNotBetween(String value1, String value2) {
            addCriterion("clinic_id not between", value1, value2, "clinicId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andReadflagIsNull() {
            addCriterion("readflag is null");
            return (Criteria) this;
        }

        public Criteria andReadflagIsNotNull() {
            addCriterion("readflag is not null");
            return (Criteria) this;
        }

        public Criteria andReadflagEqualTo(Integer value) {
            addCriterion("readflag =", value, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagNotEqualTo(Integer value) {
            addCriterion("readflag <>", value, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagGreaterThan(Integer value) {
            addCriterion("readflag >", value, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("readflag >=", value, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagLessThan(Integer value) {
            addCriterion("readflag <", value, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagLessThanOrEqualTo(Integer value) {
            addCriterion("readflag <=", value, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagIn(List<Integer> values) {
            addCriterion("readflag in", values, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagNotIn(List<Integer> values) {
            addCriterion("readflag not in", values, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagBetween(Integer value1, Integer value2) {
            addCriterion("readflag between", value1, value2, "readflag");
            return (Criteria) this;
        }

        public Criteria andReadflagNotBetween(Integer value1, Integer value2) {
            addCriterion("readflag not between", value1, value2, "readflag");
            return (Criteria) this;
        }

        public Criteria andApplyIsNull() {
            addCriterion("apply is null");
            return (Criteria) this;
        }

        public Criteria andApplyIsNotNull() {
            addCriterion("apply is not null");
            return (Criteria) this;
        }

        public Criteria andApplyEqualTo(Boolean value) {
            addCriterion("apply =", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyNotEqualTo(Boolean value) {
            addCriterion("apply <>", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyGreaterThan(Boolean value) {
            addCriterion("apply >", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("apply >=", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyLessThan(Boolean value) {
            addCriterion("apply <", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyLessThanOrEqualTo(Boolean value) {
            addCriterion("apply <=", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyIn(List<Boolean> values) {
            addCriterion("apply in", values, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyNotIn(List<Boolean> values) {
            addCriterion("apply not in", values, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyBetween(Boolean value1, Boolean value2) {
            addCriterion("apply between", value1, value2, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("apply not between", value1, value2, "apply");
            return (Criteria) this;
        }

        public Criteria andInvitationIsNull() {
            addCriterion("invitation is null");
            return (Criteria) this;
        }

        public Criteria andInvitationIsNotNull() {
            addCriterion("invitation is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationEqualTo(Boolean value) {
            addCriterion("invitation =", value, "invitation");
            return (Criteria) this;
        }

        public Criteria andInvitationNotEqualTo(Boolean value) {
            addCriterion("invitation <>", value, "invitation");
            return (Criteria) this;
        }

        public Criteria andInvitationGreaterThan(Boolean value) {
            addCriterion("invitation >", value, "invitation");
            return (Criteria) this;
        }

        public Criteria andInvitationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("invitation >=", value, "invitation");
            return (Criteria) this;
        }

        public Criteria andInvitationLessThan(Boolean value) {
            addCriterion("invitation <", value, "invitation");
            return (Criteria) this;
        }

        public Criteria andInvitationLessThanOrEqualTo(Boolean value) {
            addCriterion("invitation <=", value, "invitation");
            return (Criteria) this;
        }

        public Criteria andInvitationIn(List<Boolean> values) {
            addCriterion("invitation in", values, "invitation");
            return (Criteria) this;
        }

        public Criteria andInvitationNotIn(List<Boolean> values) {
            addCriterion("invitation not in", values, "invitation");
            return (Criteria) this;
        }

        public Criteria andInvitationBetween(Boolean value1, Boolean value2) {
            addCriterion("invitation between", value1, value2, "invitation");
            return (Criteria) this;
        }

        public Criteria andInvitationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("invitation not between", value1, value2, "invitation");
            return (Criteria) this;
        }

        public Criteria andOkApplyIsNull() {
            addCriterion("ok_apply is null");
            return (Criteria) this;
        }

        public Criteria andOkApplyIsNotNull() {
            addCriterion("ok_apply is not null");
            return (Criteria) this;
        }

        public Criteria andOkApplyEqualTo(Boolean value) {
            addCriterion("ok_apply =", value, "okApply");
            return (Criteria) this;
        }

        public Criteria andOkApplyNotEqualTo(Boolean value) {
            addCriterion("ok_apply <>", value, "okApply");
            return (Criteria) this;
        }

        public Criteria andOkApplyGreaterThan(Boolean value) {
            addCriterion("ok_apply >", value, "okApply");
            return (Criteria) this;
        }

        public Criteria andOkApplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ok_apply >=", value, "okApply");
            return (Criteria) this;
        }

        public Criteria andOkApplyLessThan(Boolean value) {
            addCriterion("ok_apply <", value, "okApply");
            return (Criteria) this;
        }

        public Criteria andOkApplyLessThanOrEqualTo(Boolean value) {
            addCriterion("ok_apply <=", value, "okApply");
            return (Criteria) this;
        }

        public Criteria andOkApplyIn(List<Boolean> values) {
            addCriterion("ok_apply in", values, "okApply");
            return (Criteria) this;
        }

        public Criteria andOkApplyNotIn(List<Boolean> values) {
            addCriterion("ok_apply not in", values, "okApply");
            return (Criteria) this;
        }

        public Criteria andOkApplyBetween(Boolean value1, Boolean value2) {
            addCriterion("ok_apply between", value1, value2, "okApply");
            return (Criteria) this;
        }

        public Criteria andOkApplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ok_apply not between", value1, value2, "okApply");
            return (Criteria) this;
        }

        public Criteria andOkInvitationIsNull() {
            addCriterion("ok_invitation is null");
            return (Criteria) this;
        }

        public Criteria andOkInvitationIsNotNull() {
            addCriterion("ok_invitation is not null");
            return (Criteria) this;
        }

        public Criteria andOkInvitationEqualTo(Boolean value) {
            addCriterion("ok_invitation =", value, "okInvitation");
            return (Criteria) this;
        }

        public Criteria andOkInvitationNotEqualTo(Boolean value) {
            addCriterion("ok_invitation <>", value, "okInvitation");
            return (Criteria) this;
        }

        public Criteria andOkInvitationGreaterThan(Boolean value) {
            addCriterion("ok_invitation >", value, "okInvitation");
            return (Criteria) this;
        }

        public Criteria andOkInvitationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ok_invitation >=", value, "okInvitation");
            return (Criteria) this;
        }

        public Criteria andOkInvitationLessThan(Boolean value) {
            addCriterion("ok_invitation <", value, "okInvitation");
            return (Criteria) this;
        }

        public Criteria andOkInvitationLessThanOrEqualTo(Boolean value) {
            addCriterion("ok_invitation <=", value, "okInvitation");
            return (Criteria) this;
        }

        public Criteria andOkInvitationIn(List<Boolean> values) {
            addCriterion("ok_invitation in", values, "okInvitation");
            return (Criteria) this;
        }

        public Criteria andOkInvitationNotIn(List<Boolean> values) {
            addCriterion("ok_invitation not in", values, "okInvitation");
            return (Criteria) this;
        }

        public Criteria andOkInvitationBetween(Boolean value1, Boolean value2) {
            addCriterion("ok_invitation between", value1, value2, "okInvitation");
            return (Criteria) this;
        }

        public Criteria andOkInvitationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ok_invitation not between", value1, value2, "okInvitation");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}