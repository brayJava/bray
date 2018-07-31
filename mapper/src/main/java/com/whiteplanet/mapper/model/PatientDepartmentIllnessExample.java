package com.whiteplanet.mapper.model;

import java.util.ArrayList;
import java.util.List;

public class PatientDepartmentIllnessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientDepartmentIllnessExample() {
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

        public Criteria andPatientRecommendDoctorIdIsNull() {
            addCriterion("patient_recommend_doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientRecommendDoctorIdIsNotNull() {
            addCriterion("patient_recommend_doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientRecommendDoctorIdEqualTo(String value) {
            addCriterion("patient_recommend_doctor_id =", value, "patientRecommendDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientRecommendDoctorIdNotEqualTo(String value) {
            addCriterion("patient_recommend_doctor_id <>", value, "patientRecommendDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientRecommendDoctorIdGreaterThan(String value) {
            addCriterion("patient_recommend_doctor_id >", value, "patientRecommendDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientRecommendDoctorIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_recommend_doctor_id >=", value, "patientRecommendDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientRecommendDoctorIdLessThan(String value) {
            addCriterion("patient_recommend_doctor_id <", value, "patientRecommendDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientRecommendDoctorIdLessThanOrEqualTo(String value) {
            addCriterion("patient_recommend_doctor_id <=", value, "patientRecommendDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientRecommendDoctorIdLike(String value) {
            addCriterion("patient_recommend_doctor_id like", value, "patientRecommendDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientRecommendDoctorIdNotLike(String value) {
            addCriterion("patient_recommend_doctor_id not like", value, "patientRecommendDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientRecommendDoctorIdIn(List<String> values) {
            addCriterion("patient_recommend_doctor_id in", values, "patientRecommendDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientRecommendDoctorIdNotIn(List<String> values) {
            addCriterion("patient_recommend_doctor_id not in", values, "patientRecommendDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientRecommendDoctorIdBetween(String value1, String value2) {
            addCriterion("patient_recommend_doctor_id between", value1, value2, "patientRecommendDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientRecommendDoctorIdNotBetween(String value1, String value2) {
            addCriterion("patient_recommend_doctor_id not between", value1, value2, "patientRecommendDoctorId");
            return (Criteria) this;
        }

        public Criteria andLabelNotesIdIsNull() {
            addCriterion("label_notes_id is null");
            return (Criteria) this;
        }

        public Criteria andLabelNotesIdIsNotNull() {
            addCriterion("label_notes_id is not null");
            return (Criteria) this;
        }

        public Criteria andLabelNotesIdEqualTo(String value) {
            addCriterion("label_notes_id =", value, "labelNotesId");
            return (Criteria) this;
        }

        public Criteria andLabelNotesIdNotEqualTo(String value) {
            addCriterion("label_notes_id <>", value, "labelNotesId");
            return (Criteria) this;
        }

        public Criteria andLabelNotesIdGreaterThan(String value) {
            addCriterion("label_notes_id >", value, "labelNotesId");
            return (Criteria) this;
        }

        public Criteria andLabelNotesIdGreaterThanOrEqualTo(String value) {
            addCriterion("label_notes_id >=", value, "labelNotesId");
            return (Criteria) this;
        }

        public Criteria andLabelNotesIdLessThan(String value) {
            addCriterion("label_notes_id <", value, "labelNotesId");
            return (Criteria) this;
        }

        public Criteria andLabelNotesIdLessThanOrEqualTo(String value) {
            addCriterion("label_notes_id <=", value, "labelNotesId");
            return (Criteria) this;
        }

        public Criteria andLabelNotesIdLike(String value) {
            addCriterion("label_notes_id like", value, "labelNotesId");
            return (Criteria) this;
        }

        public Criteria andLabelNotesIdNotLike(String value) {
            addCriterion("label_notes_id not like", value, "labelNotesId");
            return (Criteria) this;
        }

        public Criteria andLabelNotesIdIn(List<String> values) {
            addCriterion("label_notes_id in", values, "labelNotesId");
            return (Criteria) this;
        }

        public Criteria andLabelNotesIdNotIn(List<String> values) {
            addCriterion("label_notes_id not in", values, "labelNotesId");
            return (Criteria) this;
        }

        public Criteria andLabelNotesIdBetween(String value1, String value2) {
            addCriterion("label_notes_id between", value1, value2, "labelNotesId");
            return (Criteria) this;
        }

        public Criteria andLabelNotesIdNotBetween(String value1, String value2) {
            addCriterion("label_notes_id not between", value1, value2, "labelNotesId");
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