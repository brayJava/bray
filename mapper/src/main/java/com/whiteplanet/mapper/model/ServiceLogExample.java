package com.whiteplanet.mapper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceLogExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("service_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("service_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("service_name =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("service_name <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("service_name >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_name >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("service_name <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("service_name <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("service_name like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("service_name not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("service_name in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("service_name not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("service_name between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("service_name not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andRestUrlIsNull() {
            addCriterion("rest_url is null");
            return (Criteria) this;
        }

        public Criteria andRestUrlIsNotNull() {
            addCriterion("rest_url is not null");
            return (Criteria) this;
        }

        public Criteria andRestUrlEqualTo(String value) {
            addCriterion("rest_url =", value, "restUrl");
            return (Criteria) this;
        }

        public Criteria andRestUrlNotEqualTo(String value) {
            addCriterion("rest_url <>", value, "restUrl");
            return (Criteria) this;
        }

        public Criteria andRestUrlGreaterThan(String value) {
            addCriterion("rest_url >", value, "restUrl");
            return (Criteria) this;
        }

        public Criteria andRestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("rest_url >=", value, "restUrl");
            return (Criteria) this;
        }

        public Criteria andRestUrlLessThan(String value) {
            addCriterion("rest_url <", value, "restUrl");
            return (Criteria) this;
        }

        public Criteria andRestUrlLessThanOrEqualTo(String value) {
            addCriterion("rest_url <=", value, "restUrl");
            return (Criteria) this;
        }

        public Criteria andRestUrlLike(String value) {
            addCriterion("rest_url like", value, "restUrl");
            return (Criteria) this;
        }

        public Criteria andRestUrlNotLike(String value) {
            addCriterion("rest_url not like", value, "restUrl");
            return (Criteria) this;
        }

        public Criteria andRestUrlIn(List<String> values) {
            addCriterion("rest_url in", values, "restUrl");
            return (Criteria) this;
        }

        public Criteria andRestUrlNotIn(List<String> values) {
            addCriterion("rest_url not in", values, "restUrl");
            return (Criteria) this;
        }

        public Criteria andRestUrlBetween(String value1, String value2) {
            addCriterion("rest_url between", value1, value2, "restUrl");
            return (Criteria) this;
        }

        public Criteria andRestUrlNotBetween(String value1, String value2) {
            addCriterion("rest_url not between", value1, value2, "restUrl");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNull() {
            addCriterion("input_date is null");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNotNull() {
            addCriterion("input_date is not null");
            return (Criteria) this;
        }

        public Criteria andInputDateEqualTo(Date value) {
            addCriterion("input_date =", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotEqualTo(Date value) {
            addCriterion("input_date <>", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThan(Date value) {
            addCriterion("input_date >", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThanOrEqualTo(Date value) {
            addCriterion("input_date >=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThan(Date value) {
            addCriterion("input_date <", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThanOrEqualTo(Date value) {
            addCriterion("input_date <=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateIn(List<Date> values) {
            addCriterion("input_date in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotIn(List<Date> values) {
            addCriterion("input_date not in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateBetween(Date value1, Date value2) {
            addCriterion("input_date between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotBetween(Date value1, Date value2) {
            addCriterion("input_date not between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateIsNull() {
            addCriterion("output_date is null");
            return (Criteria) this;
        }

        public Criteria andOutputDateIsNotNull() {
            addCriterion("output_date is not null");
            return (Criteria) this;
        }

        public Criteria andOutputDateEqualTo(Date value) {
            addCriterion("output_date =", value, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateNotEqualTo(Date value) {
            addCriterion("output_date <>", value, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateGreaterThan(Date value) {
            addCriterion("output_date >", value, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateGreaterThanOrEqualTo(Date value) {
            addCriterion("output_date >=", value, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateLessThan(Date value) {
            addCriterion("output_date <", value, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateLessThanOrEqualTo(Date value) {
            addCriterion("output_date <=", value, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateIn(List<Date> values) {
            addCriterion("output_date in", values, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateNotIn(List<Date> values) {
            addCriterion("output_date not in", values, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateBetween(Date value1, Date value2) {
            addCriterion("output_date between", value1, value2, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateNotBetween(Date value1, Date value2) {
            addCriterion("output_date not between", value1, value2, "outputDate");
            return (Criteria) this;
        }

        public Criteria andDockerIdIsNull() {
            addCriterion("docker_id is null");
            return (Criteria) this;
        }

        public Criteria andDockerIdIsNotNull() {
            addCriterion("docker_id is not null");
            return (Criteria) this;
        }

        public Criteria andDockerIdEqualTo(String value) {
            addCriterion("docker_id =", value, "dockerId");
            return (Criteria) this;
        }

        public Criteria andDockerIdNotEqualTo(String value) {
            addCriterion("docker_id <>", value, "dockerId");
            return (Criteria) this;
        }

        public Criteria andDockerIdGreaterThan(String value) {
            addCriterion("docker_id >", value, "dockerId");
            return (Criteria) this;
        }

        public Criteria andDockerIdGreaterThanOrEqualTo(String value) {
            addCriterion("docker_id >=", value, "dockerId");
            return (Criteria) this;
        }

        public Criteria andDockerIdLessThan(String value) {
            addCriterion("docker_id <", value, "dockerId");
            return (Criteria) this;
        }

        public Criteria andDockerIdLessThanOrEqualTo(String value) {
            addCriterion("docker_id <=", value, "dockerId");
            return (Criteria) this;
        }

        public Criteria andDockerIdLike(String value) {
            addCriterion("docker_id like", value, "dockerId");
            return (Criteria) this;
        }

        public Criteria andDockerIdNotLike(String value) {
            addCriterion("docker_id not like", value, "dockerId");
            return (Criteria) this;
        }

        public Criteria andDockerIdIn(List<String> values) {
            addCriterion("docker_id in", values, "dockerId");
            return (Criteria) this;
        }

        public Criteria andDockerIdNotIn(List<String> values) {
            addCriterion("docker_id not in", values, "dockerId");
            return (Criteria) this;
        }

        public Criteria andDockerIdBetween(String value1, String value2) {
            addCriterion("docker_id between", value1, value2, "dockerId");
            return (Criteria) this;
        }

        public Criteria andDockerIdNotBetween(String value1, String value2) {
            addCriterion("docker_id not between", value1, value2, "dockerId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNull() {
            addCriterion("patient_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(String value) {
            addCriterion("patient_id =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(String value) {
            addCriterion("patient_id <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(String value) {
            addCriterion("patient_id >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_id >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(String value) {
            addCriterion("patient_id <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(String value) {
            addCriterion("patient_id <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLike(String value) {
            addCriterion("patient_id like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotLike(String value) {
            addCriterion("patient_id not like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<String> values) {
            addCriterion("patient_id in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<String> values) {
            addCriterion("patient_id not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(String value1, String value2) {
            addCriterion("patient_id between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(String value1, String value2) {
            addCriterion("patient_id not between", value1, value2, "patientId");
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