package com.whiteplanet.mapper.model;

import java.util.ArrayList;
import java.util.List;

public class ClinicImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClinicImageExample() {
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

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andPubFileIdIsNull() {
            addCriterion("pub_file_id is null");
            return (Criteria) this;
        }

        public Criteria andPubFileIdIsNotNull() {
            addCriterion("pub_file_id is not null");
            return (Criteria) this;
        }

        public Criteria andPubFileIdEqualTo(String value) {
            addCriterion("pub_file_id =", value, "pubFileId");
            return (Criteria) this;
        }

        public Criteria andPubFileIdNotEqualTo(String value) {
            addCriterion("pub_file_id <>", value, "pubFileId");
            return (Criteria) this;
        }

        public Criteria andPubFileIdGreaterThan(String value) {
            addCriterion("pub_file_id >", value, "pubFileId");
            return (Criteria) this;
        }

        public Criteria andPubFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("pub_file_id >=", value, "pubFileId");
            return (Criteria) this;
        }

        public Criteria andPubFileIdLessThan(String value) {
            addCriterion("pub_file_id <", value, "pubFileId");
            return (Criteria) this;
        }

        public Criteria andPubFileIdLessThanOrEqualTo(String value) {
            addCriterion("pub_file_id <=", value, "pubFileId");
            return (Criteria) this;
        }

        public Criteria andPubFileIdLike(String value) {
            addCriterion("pub_file_id like", value, "pubFileId");
            return (Criteria) this;
        }

        public Criteria andPubFileIdNotLike(String value) {
            addCriterion("pub_file_id not like", value, "pubFileId");
            return (Criteria) this;
        }

        public Criteria andPubFileIdIn(List<String> values) {
            addCriterion("pub_file_id in", values, "pubFileId");
            return (Criteria) this;
        }

        public Criteria andPubFileIdNotIn(List<String> values) {
            addCriterion("pub_file_id not in", values, "pubFileId");
            return (Criteria) this;
        }

        public Criteria andPubFileIdBetween(String value1, String value2) {
            addCriterion("pub_file_id between", value1, value2, "pubFileId");
            return (Criteria) this;
        }

        public Criteria andPubFileIdNotBetween(String value1, String value2) {
            addCriterion("pub_file_id not between", value1, value2, "pubFileId");
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