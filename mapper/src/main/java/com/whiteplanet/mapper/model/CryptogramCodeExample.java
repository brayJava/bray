package com.whiteplanet.mapper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CryptogramCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CryptogramCodeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andLockFailureTimeIsNull() {
            addCriterion("lock_failure_time is null");
            return (Criteria) this;
        }

        public Criteria andLockFailureTimeIsNotNull() {
            addCriterion("lock_failure_time is not null");
            return (Criteria) this;
        }

        public Criteria andLockFailureTimeEqualTo(Date value) {
            addCriterion("lock_failure_time =", value, "lockFailureTime");
            return (Criteria) this;
        }

        public Criteria andLockFailureTimeNotEqualTo(Date value) {
            addCriterion("lock_failure_time <>", value, "lockFailureTime");
            return (Criteria) this;
        }

        public Criteria andLockFailureTimeGreaterThan(Date value) {
            addCriterion("lock_failure_time >", value, "lockFailureTime");
            return (Criteria) this;
        }

        public Criteria andLockFailureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lock_failure_time >=", value, "lockFailureTime");
            return (Criteria) this;
        }

        public Criteria andLockFailureTimeLessThan(Date value) {
            addCriterion("lock_failure_time <", value, "lockFailureTime");
            return (Criteria) this;
        }

        public Criteria andLockFailureTimeLessThanOrEqualTo(Date value) {
            addCriterion("lock_failure_time <=", value, "lockFailureTime");
            return (Criteria) this;
        }

        public Criteria andLockFailureTimeIn(List<Date> values) {
            addCriterion("lock_failure_time in", values, "lockFailureTime");
            return (Criteria) this;
        }

        public Criteria andLockFailureTimeNotIn(List<Date> values) {
            addCriterion("lock_failure_time not in", values, "lockFailureTime");
            return (Criteria) this;
        }

        public Criteria andLockFailureTimeBetween(Date value1, Date value2) {
            addCriterion("lock_failure_time between", value1, value2, "lockFailureTime");
            return (Criteria) this;
        }

        public Criteria andLockFailureTimeNotBetween(Date value1, Date value2) {
            addCriterion("lock_failure_time not between", value1, value2, "lockFailureTime");
            return (Criteria) this;
        }

        public Criteria andFirstWrongTimeIsNull() {
            addCriterion("first_wrong_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstWrongTimeIsNotNull() {
            addCriterion("first_wrong_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstWrongTimeEqualTo(Date value) {
            addCriterion("first_wrong_time =", value, "firstWrongTime");
            return (Criteria) this;
        }

        public Criteria andFirstWrongTimeNotEqualTo(Date value) {
            addCriterion("first_wrong_time <>", value, "firstWrongTime");
            return (Criteria) this;
        }

        public Criteria andFirstWrongTimeGreaterThan(Date value) {
            addCriterion("first_wrong_time >", value, "firstWrongTime");
            return (Criteria) this;
        }

        public Criteria andFirstWrongTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_wrong_time >=", value, "firstWrongTime");
            return (Criteria) this;
        }

        public Criteria andFirstWrongTimeLessThan(Date value) {
            addCriterion("first_wrong_time <", value, "firstWrongTime");
            return (Criteria) this;
        }

        public Criteria andFirstWrongTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_wrong_time <=", value, "firstWrongTime");
            return (Criteria) this;
        }

        public Criteria andFirstWrongTimeIn(List<Date> values) {
            addCriterion("first_wrong_time in", values, "firstWrongTime");
            return (Criteria) this;
        }

        public Criteria andFirstWrongTimeNotIn(List<Date> values) {
            addCriterion("first_wrong_time not in", values, "firstWrongTime");
            return (Criteria) this;
        }

        public Criteria andFirstWrongTimeBetween(Date value1, Date value2) {
            addCriterion("first_wrong_time between", value1, value2, "firstWrongTime");
            return (Criteria) this;
        }

        public Criteria andFirstWrongTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_wrong_time not between", value1, value2, "firstWrongTime");
            return (Criteria) this;
        }

        public Criteria andLastWrongTimeIsNull() {
            addCriterion("last_wrong_time is null");
            return (Criteria) this;
        }

        public Criteria andLastWrongTimeIsNotNull() {
            addCriterion("last_wrong_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastWrongTimeEqualTo(Date value) {
            addCriterion("last_wrong_time =", value, "lastWrongTime");
            return (Criteria) this;
        }

        public Criteria andLastWrongTimeNotEqualTo(Date value) {
            addCriterion("last_wrong_time <>", value, "lastWrongTime");
            return (Criteria) this;
        }

        public Criteria andLastWrongTimeGreaterThan(Date value) {
            addCriterion("last_wrong_time >", value, "lastWrongTime");
            return (Criteria) this;
        }

        public Criteria andLastWrongTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_wrong_time >=", value, "lastWrongTime");
            return (Criteria) this;
        }

        public Criteria andLastWrongTimeLessThan(Date value) {
            addCriterion("last_wrong_time <", value, "lastWrongTime");
            return (Criteria) this;
        }

        public Criteria andLastWrongTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_wrong_time <=", value, "lastWrongTime");
            return (Criteria) this;
        }

        public Criteria andLastWrongTimeIn(List<Date> values) {
            addCriterion("last_wrong_time in", values, "lastWrongTime");
            return (Criteria) this;
        }

        public Criteria andLastWrongTimeNotIn(List<Date> values) {
            addCriterion("last_wrong_time not in", values, "lastWrongTime");
            return (Criteria) this;
        }

        public Criteria andLastWrongTimeBetween(Date value1, Date value2) {
            addCriterion("last_wrong_time between", value1, value2, "lastWrongTime");
            return (Criteria) this;
        }

        public Criteria andLastWrongTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_wrong_time not between", value1, value2, "lastWrongTime");
            return (Criteria) this;
        }

        public Criteria andWrongCountIsNull() {
            addCriterion("wrong_count is null");
            return (Criteria) this;
        }

        public Criteria andWrongCountIsNotNull() {
            addCriterion("wrong_count is not null");
            return (Criteria) this;
        }

        public Criteria andWrongCountEqualTo(Integer value) {
            addCriterion("wrong_count =", value, "wrongCount");
            return (Criteria) this;
        }

        public Criteria andWrongCountNotEqualTo(Integer value) {
            addCriterion("wrong_count <>", value, "wrongCount");
            return (Criteria) this;
        }

        public Criteria andWrongCountGreaterThan(Integer value) {
            addCriterion("wrong_count >", value, "wrongCount");
            return (Criteria) this;
        }

        public Criteria andWrongCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("wrong_count >=", value, "wrongCount");
            return (Criteria) this;
        }

        public Criteria andWrongCountLessThan(Integer value) {
            addCriterion("wrong_count <", value, "wrongCount");
            return (Criteria) this;
        }

        public Criteria andWrongCountLessThanOrEqualTo(Integer value) {
            addCriterion("wrong_count <=", value, "wrongCount");
            return (Criteria) this;
        }

        public Criteria andWrongCountIn(List<Integer> values) {
            addCriterion("wrong_count in", values, "wrongCount");
            return (Criteria) this;
        }

        public Criteria andWrongCountNotIn(List<Integer> values) {
            addCriterion("wrong_count not in", values, "wrongCount");
            return (Criteria) this;
        }

        public Criteria andWrongCountBetween(Integer value1, Integer value2) {
            addCriterion("wrong_count between", value1, value2, "wrongCount");
            return (Criteria) this;
        }

        public Criteria andWrongCountNotBetween(Integer value1, Integer value2) {
            addCriterion("wrong_count not between", value1, value2, "wrongCount");
            return (Criteria) this;
        }

        public Criteria andContinuousWrongCountIsNull() {
            addCriterion("continuous_wrong_count is null");
            return (Criteria) this;
        }

        public Criteria andContinuousWrongCountIsNotNull() {
            addCriterion("continuous_wrong_count is not null");
            return (Criteria) this;
        }

        public Criteria andContinuousWrongCountEqualTo(Integer value) {
            addCriterion("continuous_wrong_count =", value, "continuousWrongCount");
            return (Criteria) this;
        }

        public Criteria andContinuousWrongCountNotEqualTo(Integer value) {
            addCriterion("continuous_wrong_count <>", value, "continuousWrongCount");
            return (Criteria) this;
        }

        public Criteria andContinuousWrongCountGreaterThan(Integer value) {
            addCriterion("continuous_wrong_count >", value, "continuousWrongCount");
            return (Criteria) this;
        }

        public Criteria andContinuousWrongCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("continuous_wrong_count >=", value, "continuousWrongCount");
            return (Criteria) this;
        }

        public Criteria andContinuousWrongCountLessThan(Integer value) {
            addCriterion("continuous_wrong_count <", value, "continuousWrongCount");
            return (Criteria) this;
        }

        public Criteria andContinuousWrongCountLessThanOrEqualTo(Integer value) {
            addCriterion("continuous_wrong_count <=", value, "continuousWrongCount");
            return (Criteria) this;
        }

        public Criteria andContinuousWrongCountIn(List<Integer> values) {
            addCriterion("continuous_wrong_count in", values, "continuousWrongCount");
            return (Criteria) this;
        }

        public Criteria andContinuousWrongCountNotIn(List<Integer> values) {
            addCriterion("continuous_wrong_count not in", values, "continuousWrongCount");
            return (Criteria) this;
        }

        public Criteria andContinuousWrongCountBetween(Integer value1, Integer value2) {
            addCriterion("continuous_wrong_count between", value1, value2, "continuousWrongCount");
            return (Criteria) this;
        }

        public Criteria andContinuousWrongCountNotBetween(Integer value1, Integer value2) {
            addCriterion("continuous_wrong_count not between", value1, value2, "continuousWrongCount");
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