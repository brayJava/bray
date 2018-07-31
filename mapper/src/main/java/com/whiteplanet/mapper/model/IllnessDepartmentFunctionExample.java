package com.whiteplanet.mapper.model;

import java.util.ArrayList;
import java.util.List;

public class IllnessDepartmentFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IllnessDepartmentFunctionExample() {
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

        public Criteria andIllnessIdIsNull() {
            addCriterion("illness_id is null");
            return (Criteria) this;
        }

        public Criteria andIllnessIdIsNotNull() {
            addCriterion("illness_id is not null");
            return (Criteria) this;
        }

        public Criteria andIllnessIdEqualTo(String value) {
            addCriterion("illness_id =", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdNotEqualTo(String value) {
            addCriterion("illness_id <>", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdGreaterThan(String value) {
            addCriterion("illness_id >", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdGreaterThanOrEqualTo(String value) {
            addCriterion("illness_id >=", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdLessThan(String value) {
            addCriterion("illness_id <", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdLessThanOrEqualTo(String value) {
            addCriterion("illness_id <=", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdLike(String value) {
            addCriterion("illness_id like", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdNotLike(String value) {
            addCriterion("illness_id not like", value, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdIn(List<String> values) {
            addCriterion("illness_id in", values, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdNotIn(List<String> values) {
            addCriterion("illness_id not in", values, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdBetween(String value1, String value2) {
            addCriterion("illness_id between", value1, value2, "illnessId");
            return (Criteria) this;
        }

        public Criteria andIllnessIdNotBetween(String value1, String value2) {
            addCriterion("illness_id not between", value1, value2, "illnessId");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionIdIsNull() {
            addCriterion("department_function_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionIdIsNotNull() {
            addCriterion("department_function_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionIdEqualTo(String value) {
            addCriterion("department_function_id =", value, "departmentFunctionId");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionIdNotEqualTo(String value) {
            addCriterion("department_function_id <>", value, "departmentFunctionId");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionIdGreaterThan(String value) {
            addCriterion("department_function_id >", value, "departmentFunctionId");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionIdGreaterThanOrEqualTo(String value) {
            addCriterion("department_function_id >=", value, "departmentFunctionId");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionIdLessThan(String value) {
            addCriterion("department_function_id <", value, "departmentFunctionId");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionIdLessThanOrEqualTo(String value) {
            addCriterion("department_function_id <=", value, "departmentFunctionId");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionIdLike(String value) {
            addCriterion("department_function_id like", value, "departmentFunctionId");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionIdNotLike(String value) {
            addCriterion("department_function_id not like", value, "departmentFunctionId");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionIdIn(List<String> values) {
            addCriterion("department_function_id in", values, "departmentFunctionId");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionIdNotIn(List<String> values) {
            addCriterion("department_function_id not in", values, "departmentFunctionId");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionIdBetween(String value1, String value2) {
            addCriterion("department_function_id between", value1, value2, "departmentFunctionId");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionIdNotBetween(String value1, String value2) {
            addCriterion("department_function_id not between", value1, value2, "departmentFunctionId");
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