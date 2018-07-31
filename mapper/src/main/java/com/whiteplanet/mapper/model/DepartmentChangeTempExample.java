package com.whiteplanet.mapper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentChangeTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentChangeTempExample() {
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

        public Criteria andDocIdIsNull() {
            addCriterion("doc_id is null");
            return (Criteria) this;
        }

        public Criteria andDocIdIsNotNull() {
            addCriterion("doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andDocIdEqualTo(String value) {
            addCriterion("doc_id =", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotEqualTo(String value) {
            addCriterion("doc_id <>", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdGreaterThan(String value) {
            addCriterion("doc_id >", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdGreaterThanOrEqualTo(String value) {
            addCriterion("doc_id >=", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLessThan(String value) {
            addCriterion("doc_id <", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLessThanOrEqualTo(String value) {
            addCriterion("doc_id <=", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLike(String value) {
            addCriterion("doc_id like", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotLike(String value) {
            addCriterion("doc_id not like", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdIn(List<String> values) {
            addCriterion("doc_id in", values, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotIn(List<String> values) {
            addCriterion("doc_id not in", values, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdBetween(String value1, String value2) {
            addCriterion("doc_id between", value1, value2, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotBetween(String value1, String value2) {
            addCriterion("doc_id not between", value1, value2, "docId");
            return (Criteria) this;
        }

        public Criteria andToDepartmentNameIsNull() {
            addCriterion("to_department_name is null");
            return (Criteria) this;
        }

        public Criteria andToDepartmentNameIsNotNull() {
            addCriterion("to_department_name is not null");
            return (Criteria) this;
        }

        public Criteria andToDepartmentNameEqualTo(String value) {
            addCriterion("to_department_name =", value, "toDepartmentName");
            return (Criteria) this;
        }

        public Criteria andToDepartmentNameNotEqualTo(String value) {
            addCriterion("to_department_name <>", value, "toDepartmentName");
            return (Criteria) this;
        }

        public Criteria andToDepartmentNameGreaterThan(String value) {
            addCriterion("to_department_name >", value, "toDepartmentName");
            return (Criteria) this;
        }

        public Criteria andToDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_department_name >=", value, "toDepartmentName");
            return (Criteria) this;
        }

        public Criteria andToDepartmentNameLessThan(String value) {
            addCriterion("to_department_name <", value, "toDepartmentName");
            return (Criteria) this;
        }

        public Criteria andToDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("to_department_name <=", value, "toDepartmentName");
            return (Criteria) this;
        }

        public Criteria andToDepartmentNameLike(String value) {
            addCriterion("to_department_name like", value, "toDepartmentName");
            return (Criteria) this;
        }

        public Criteria andToDepartmentNameNotLike(String value) {
            addCriterion("to_department_name not like", value, "toDepartmentName");
            return (Criteria) this;
        }

        public Criteria andToDepartmentNameIn(List<String> values) {
            addCriterion("to_department_name in", values, "toDepartmentName");
            return (Criteria) this;
        }

        public Criteria andToDepartmentNameNotIn(List<String> values) {
            addCriterion("to_department_name not in", values, "toDepartmentName");
            return (Criteria) this;
        }

        public Criteria andToDepartmentNameBetween(String value1, String value2) {
            addCriterion("to_department_name between", value1, value2, "toDepartmentName");
            return (Criteria) this;
        }

        public Criteria andToDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("to_department_name not between", value1, value2, "toDepartmentName");
            return (Criteria) this;
        }

        public Criteria andToDepartmentIdIsNull() {
            addCriterion("to_department_id is null");
            return (Criteria) this;
        }

        public Criteria andToDepartmentIdIsNotNull() {
            addCriterion("to_department_id is not null");
            return (Criteria) this;
        }

        public Criteria andToDepartmentIdEqualTo(String value) {
            addCriterion("to_department_id =", value, "toDepartmentId");
            return (Criteria) this;
        }

        public Criteria andToDepartmentIdNotEqualTo(String value) {
            addCriterion("to_department_id <>", value, "toDepartmentId");
            return (Criteria) this;
        }

        public Criteria andToDepartmentIdGreaterThan(String value) {
            addCriterion("to_department_id >", value, "toDepartmentId");
            return (Criteria) this;
        }

        public Criteria andToDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("to_department_id >=", value, "toDepartmentId");
            return (Criteria) this;
        }

        public Criteria andToDepartmentIdLessThan(String value) {
            addCriterion("to_department_id <", value, "toDepartmentId");
            return (Criteria) this;
        }

        public Criteria andToDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("to_department_id <=", value, "toDepartmentId");
            return (Criteria) this;
        }

        public Criteria andToDepartmentIdLike(String value) {
            addCriterion("to_department_id like", value, "toDepartmentId");
            return (Criteria) this;
        }

        public Criteria andToDepartmentIdNotLike(String value) {
            addCriterion("to_department_id not like", value, "toDepartmentId");
            return (Criteria) this;
        }

        public Criteria andToDepartmentIdIn(List<String> values) {
            addCriterion("to_department_id in", values, "toDepartmentId");
            return (Criteria) this;
        }

        public Criteria andToDepartmentIdNotIn(List<String> values) {
            addCriterion("to_department_id not in", values, "toDepartmentId");
            return (Criteria) this;
        }

        public Criteria andToDepartmentIdBetween(String value1, String value2) {
            addCriterion("to_department_id between", value1, value2, "toDepartmentId");
            return (Criteria) this;
        }

        public Criteria andToDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("to_department_id not between", value1, value2, "toDepartmentId");
            return (Criteria) this;
        }

        public Criteria andToFunctionIdIsNull() {
            addCriterion("to_function_id is null");
            return (Criteria) this;
        }

        public Criteria andToFunctionIdIsNotNull() {
            addCriterion("to_function_id is not null");
            return (Criteria) this;
        }

        public Criteria andToFunctionIdEqualTo(String value) {
            addCriterion("to_function_id =", value, "toFunctionId");
            return (Criteria) this;
        }

        public Criteria andToFunctionIdNotEqualTo(String value) {
            addCriterion("to_function_id <>", value, "toFunctionId");
            return (Criteria) this;
        }

        public Criteria andToFunctionIdGreaterThan(String value) {
            addCriterion("to_function_id >", value, "toFunctionId");
            return (Criteria) this;
        }

        public Criteria andToFunctionIdGreaterThanOrEqualTo(String value) {
            addCriterion("to_function_id >=", value, "toFunctionId");
            return (Criteria) this;
        }

        public Criteria andToFunctionIdLessThan(String value) {
            addCriterion("to_function_id <", value, "toFunctionId");
            return (Criteria) this;
        }

        public Criteria andToFunctionIdLessThanOrEqualTo(String value) {
            addCriterion("to_function_id <=", value, "toFunctionId");
            return (Criteria) this;
        }

        public Criteria andToFunctionIdLike(String value) {
            addCriterion("to_function_id like", value, "toFunctionId");
            return (Criteria) this;
        }

        public Criteria andToFunctionIdNotLike(String value) {
            addCriterion("to_function_id not like", value, "toFunctionId");
            return (Criteria) this;
        }

        public Criteria andToFunctionIdIn(List<String> values) {
            addCriterion("to_function_id in", values, "toFunctionId");
            return (Criteria) this;
        }

        public Criteria andToFunctionIdNotIn(List<String> values) {
            addCriterion("to_function_id not in", values, "toFunctionId");
            return (Criteria) this;
        }

        public Criteria andToFunctionIdBetween(String value1, String value2) {
            addCriterion("to_function_id between", value1, value2, "toFunctionId");
            return (Criteria) this;
        }

        public Criteria andToFunctionIdNotBetween(String value1, String value2) {
            addCriterion("to_function_id not between", value1, value2, "toFunctionId");
            return (Criteria) this;
        }

        public Criteria andToFunctionNameIsNull() {
            addCriterion("to_function_name is null");
            return (Criteria) this;
        }

        public Criteria andToFunctionNameIsNotNull() {
            addCriterion("to_function_name is not null");
            return (Criteria) this;
        }

        public Criteria andToFunctionNameEqualTo(String value) {
            addCriterion("to_function_name =", value, "toFunctionName");
            return (Criteria) this;
        }

        public Criteria andToFunctionNameNotEqualTo(String value) {
            addCriterion("to_function_name <>", value, "toFunctionName");
            return (Criteria) this;
        }

        public Criteria andToFunctionNameGreaterThan(String value) {
            addCriterion("to_function_name >", value, "toFunctionName");
            return (Criteria) this;
        }

        public Criteria andToFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_function_name >=", value, "toFunctionName");
            return (Criteria) this;
        }

        public Criteria andToFunctionNameLessThan(String value) {
            addCriterion("to_function_name <", value, "toFunctionName");
            return (Criteria) this;
        }

        public Criteria andToFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("to_function_name <=", value, "toFunctionName");
            return (Criteria) this;
        }

        public Criteria andToFunctionNameLike(String value) {
            addCriterion("to_function_name like", value, "toFunctionName");
            return (Criteria) this;
        }

        public Criteria andToFunctionNameNotLike(String value) {
            addCriterion("to_function_name not like", value, "toFunctionName");
            return (Criteria) this;
        }

        public Criteria andToFunctionNameIn(List<String> values) {
            addCriterion("to_function_name in", values, "toFunctionName");
            return (Criteria) this;
        }

        public Criteria andToFunctionNameNotIn(List<String> values) {
            addCriterion("to_function_name not in", values, "toFunctionName");
            return (Criteria) this;
        }

        public Criteria andToFunctionNameBetween(String value1, String value2) {
            addCriterion("to_function_name between", value1, value2, "toFunctionName");
            return (Criteria) this;
        }

        public Criteria andToFunctionNameNotBetween(String value1, String value2) {
            addCriterion("to_function_name not between", value1, value2, "toFunctionName");
            return (Criteria) this;
        }

        public Criteria andToHospitalIdIsNull() {
            addCriterion("to_hospital_id is null");
            return (Criteria) this;
        }

        public Criteria andToHospitalIdIsNotNull() {
            addCriterion("to_hospital_id is not null");
            return (Criteria) this;
        }

        public Criteria andToHospitalIdEqualTo(String value) {
            addCriterion("to_hospital_id =", value, "toHospitalId");
            return (Criteria) this;
        }

        public Criteria andToHospitalIdNotEqualTo(String value) {
            addCriterion("to_hospital_id <>", value, "toHospitalId");
            return (Criteria) this;
        }

        public Criteria andToHospitalIdGreaterThan(String value) {
            addCriterion("to_hospital_id >", value, "toHospitalId");
            return (Criteria) this;
        }

        public Criteria andToHospitalIdGreaterThanOrEqualTo(String value) {
            addCriterion("to_hospital_id >=", value, "toHospitalId");
            return (Criteria) this;
        }

        public Criteria andToHospitalIdLessThan(String value) {
            addCriterion("to_hospital_id <", value, "toHospitalId");
            return (Criteria) this;
        }

        public Criteria andToHospitalIdLessThanOrEqualTo(String value) {
            addCriterion("to_hospital_id <=", value, "toHospitalId");
            return (Criteria) this;
        }

        public Criteria andToHospitalIdLike(String value) {
            addCriterion("to_hospital_id like", value, "toHospitalId");
            return (Criteria) this;
        }

        public Criteria andToHospitalIdNotLike(String value) {
            addCriterion("to_hospital_id not like", value, "toHospitalId");
            return (Criteria) this;
        }

        public Criteria andToHospitalIdIn(List<String> values) {
            addCriterion("to_hospital_id in", values, "toHospitalId");
            return (Criteria) this;
        }

        public Criteria andToHospitalIdNotIn(List<String> values) {
            addCriterion("to_hospital_id not in", values, "toHospitalId");
            return (Criteria) this;
        }

        public Criteria andToHospitalIdBetween(String value1, String value2) {
            addCriterion("to_hospital_id between", value1, value2, "toHospitalId");
            return (Criteria) this;
        }

        public Criteria andToHospitalIdNotBetween(String value1, String value2) {
            addCriterion("to_hospital_id not between", value1, value2, "toHospitalId");
            return (Criteria) this;
        }

        public Criteria andToHospitalNameIsNull() {
            addCriterion("to_hospital_name is null");
            return (Criteria) this;
        }

        public Criteria andToHospitalNameIsNotNull() {
            addCriterion("to_hospital_name is not null");
            return (Criteria) this;
        }

        public Criteria andToHospitalNameEqualTo(String value) {
            addCriterion("to_hospital_name =", value, "toHospitalName");
            return (Criteria) this;
        }

        public Criteria andToHospitalNameNotEqualTo(String value) {
            addCriterion("to_hospital_name <>", value, "toHospitalName");
            return (Criteria) this;
        }

        public Criteria andToHospitalNameGreaterThan(String value) {
            addCriterion("to_hospital_name >", value, "toHospitalName");
            return (Criteria) this;
        }

        public Criteria andToHospitalNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_hospital_name >=", value, "toHospitalName");
            return (Criteria) this;
        }

        public Criteria andToHospitalNameLessThan(String value) {
            addCriterion("to_hospital_name <", value, "toHospitalName");
            return (Criteria) this;
        }

        public Criteria andToHospitalNameLessThanOrEqualTo(String value) {
            addCriterion("to_hospital_name <=", value, "toHospitalName");
            return (Criteria) this;
        }

        public Criteria andToHospitalNameLike(String value) {
            addCriterion("to_hospital_name like", value, "toHospitalName");
            return (Criteria) this;
        }

        public Criteria andToHospitalNameNotLike(String value) {
            addCriterion("to_hospital_name not like", value, "toHospitalName");
            return (Criteria) this;
        }

        public Criteria andToHospitalNameIn(List<String> values) {
            addCriterion("to_hospital_name in", values, "toHospitalName");
            return (Criteria) this;
        }

        public Criteria andToHospitalNameNotIn(List<String> values) {
            addCriterion("to_hospital_name not in", values, "toHospitalName");
            return (Criteria) this;
        }

        public Criteria andToHospitalNameBetween(String value1, String value2) {
            addCriterion("to_hospital_name between", value1, value2, "toHospitalName");
            return (Criteria) this;
        }

        public Criteria andToHospitalNameNotBetween(String value1, String value2) {
            addCriterion("to_hospital_name not between", value1, value2, "toHospitalName");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Integer value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Integer value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Integer value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Integer value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Integer> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Integer> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Integer value1, Integer value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
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