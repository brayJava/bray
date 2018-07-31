package com.whiteplanet.mapper.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("department_id like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("department_id not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNull() {
            addCriterion("hospital_id is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNotNull() {
            addCriterion("hospital_id is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdEqualTo(String value) {
            addCriterion("hospital_id =", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotEqualTo(String value) {
            addCriterion("hospital_id <>", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThan(String value) {
            addCriterion("hospital_id >", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_id >=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThan(String value) {
            addCriterion("hospital_id <", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThanOrEqualTo(String value) {
            addCriterion("hospital_id <=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLike(String value) {
            addCriterion("hospital_id like", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotLike(String value) {
            addCriterion("hospital_id not like", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIn(List<String> values) {
            addCriterion("hospital_id in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotIn(List<String> values) {
            addCriterion("hospital_id not in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdBetween(String value1, String value2) {
            addCriterion("hospital_id between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotBetween(String value1, String value2) {
            addCriterion("hospital_id not between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Boolean value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Boolean value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Boolean value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Boolean value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Boolean value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Boolean> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Boolean> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Boolean value1, Boolean value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andKindeIsNull() {
            addCriterion("kinde is null");
            return (Criteria) this;
        }

        public Criteria andKindeIsNotNull() {
            addCriterion("kinde is not null");
            return (Criteria) this;
        }

        public Criteria andKindeEqualTo(String value) {
            addCriterion("kinde =", value, "kinde");
            return (Criteria) this;
        }

        public Criteria andKindeNotEqualTo(String value) {
            addCriterion("kinde <>", value, "kinde");
            return (Criteria) this;
        }

        public Criteria andKindeGreaterThan(String value) {
            addCriterion("kinde >", value, "kinde");
            return (Criteria) this;
        }

        public Criteria andKindeGreaterThanOrEqualTo(String value) {
            addCriterion("kinde >=", value, "kinde");
            return (Criteria) this;
        }

        public Criteria andKindeLessThan(String value) {
            addCriterion("kinde <", value, "kinde");
            return (Criteria) this;
        }

        public Criteria andKindeLessThanOrEqualTo(String value) {
            addCriterion("kinde <=", value, "kinde");
            return (Criteria) this;
        }

        public Criteria andKindeLike(String value) {
            addCriterion("kinde like", value, "kinde");
            return (Criteria) this;
        }

        public Criteria andKindeNotLike(String value) {
            addCriterion("kinde not like", value, "kinde");
            return (Criteria) this;
        }

        public Criteria andKindeIn(List<String> values) {
            addCriterion("kinde in", values, "kinde");
            return (Criteria) this;
        }

        public Criteria andKindeNotIn(List<String> values) {
            addCriterion("kinde not in", values, "kinde");
            return (Criteria) this;
        }

        public Criteria andKindeBetween(String value1, String value2) {
            addCriterion("kinde between", value1, value2, "kinde");
            return (Criteria) this;
        }

        public Criteria andKindeNotBetween(String value1, String value2) {
            addCriterion("kinde not between", value1, value2, "kinde");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andTreatmentIsNull() {
            addCriterion("treatment is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentIsNotNull() {
            addCriterion("treatment is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentEqualTo(Boolean value) {
            addCriterion("treatment =", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotEqualTo(Boolean value) {
            addCriterion("treatment <>", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentGreaterThan(Boolean value) {
            addCriterion("treatment >", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("treatment >=", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLessThan(Boolean value) {
            addCriterion("treatment <", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLessThanOrEqualTo(Boolean value) {
            addCriterion("treatment <=", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentIn(List<Boolean> values) {
            addCriterion("treatment in", values, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotIn(List<Boolean> values) {
            addCriterion("treatment not in", values, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentBetween(Boolean value1, Boolean value2) {
            addCriterion("treatment between", value1, value2, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("treatment not between", value1, value2, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentMoneyIsNull() {
            addCriterion("treatment_money is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentMoneyIsNotNull() {
            addCriterion("treatment_money is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentMoneyEqualTo(BigDecimal value) {
            addCriterion("treatment_money =", value, "treatmentMoney");
            return (Criteria) this;
        }

        public Criteria andTreatmentMoneyNotEqualTo(BigDecimal value) {
            addCriterion("treatment_money <>", value, "treatmentMoney");
            return (Criteria) this;
        }

        public Criteria andTreatmentMoneyGreaterThan(BigDecimal value) {
            addCriterion("treatment_money >", value, "treatmentMoney");
            return (Criteria) this;
        }

        public Criteria andTreatmentMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("treatment_money >=", value, "treatmentMoney");
            return (Criteria) this;
        }

        public Criteria andTreatmentMoneyLessThan(BigDecimal value) {
            addCriterion("treatment_money <", value, "treatmentMoney");
            return (Criteria) this;
        }

        public Criteria andTreatmentMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("treatment_money <=", value, "treatmentMoney");
            return (Criteria) this;
        }

        public Criteria andTreatmentMoneyIn(List<BigDecimal> values) {
            addCriterion("treatment_money in", values, "treatmentMoney");
            return (Criteria) this;
        }

        public Criteria andTreatmentMoneyNotIn(List<BigDecimal> values) {
            addCriterion("treatment_money not in", values, "treatmentMoney");
            return (Criteria) this;
        }

        public Criteria andTreatmentMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("treatment_money between", value1, value2, "treatmentMoney");
            return (Criteria) this;
        }

        public Criteria andTreatmentMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("treatment_money not between", value1, value2, "treatmentMoney");
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

        public Criteria andFaceimgIsNull() {
            addCriterion("faceimg is null");
            return (Criteria) this;
        }

        public Criteria andFaceimgIsNotNull() {
            addCriterion("faceimg is not null");
            return (Criteria) this;
        }

        public Criteria andFaceimgEqualTo(String value) {
            addCriterion("faceimg =", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgNotEqualTo(String value) {
            addCriterion("faceimg <>", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgGreaterThan(String value) {
            addCriterion("faceimg >", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgGreaterThanOrEqualTo(String value) {
            addCriterion("faceimg >=", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgLessThan(String value) {
            addCriterion("faceimg <", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgLessThanOrEqualTo(String value) {
            addCriterion("faceimg <=", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgLike(String value) {
            addCriterion("faceimg like", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgNotLike(String value) {
            addCriterion("faceimg not like", value, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgIn(List<String> values) {
            addCriterion("faceimg in", values, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgNotIn(List<String> values) {
            addCriterion("faceimg not in", values, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgBetween(String value1, String value2) {
            addCriterion("faceimg between", value1, value2, "faceimg");
            return (Criteria) this;
        }

        public Criteria andFaceimgNotBetween(String value1, String value2) {
            addCriterion("faceimg not between", value1, value2, "faceimg");
            return (Criteria) this;
        }

        public Criteria andBgimgIsNull() {
            addCriterion("bgimg is null");
            return (Criteria) this;
        }

        public Criteria andBgimgIsNotNull() {
            addCriterion("bgimg is not null");
            return (Criteria) this;
        }

        public Criteria andBgimgEqualTo(String value) {
            addCriterion("bgimg =", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgNotEqualTo(String value) {
            addCriterion("bgimg <>", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgGreaterThan(String value) {
            addCriterion("bgimg >", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgGreaterThanOrEqualTo(String value) {
            addCriterion("bgimg >=", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgLessThan(String value) {
            addCriterion("bgimg <", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgLessThanOrEqualTo(String value) {
            addCriterion("bgimg <=", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgLike(String value) {
            addCriterion("bgimg like", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgNotLike(String value) {
            addCriterion("bgimg not like", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgIn(List<String> values) {
            addCriterion("bgimg in", values, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgNotIn(List<String> values) {
            addCriterion("bgimg not in", values, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgBetween(String value1, String value2) {
            addCriterion("bgimg between", value1, value2, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgNotBetween(String value1, String value2) {
            addCriterion("bgimg not between", value1, value2, "bgimg");
            return (Criteria) this;
        }

        public Criteria andCreditsIsNull() {
            addCriterion("credits is null");
            return (Criteria) this;
        }

        public Criteria andCreditsIsNotNull() {
            addCriterion("credits is not null");
            return (Criteria) this;
        }

        public Criteria andCreditsEqualTo(BigDecimal value) {
            addCriterion("credits =", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotEqualTo(BigDecimal value) {
            addCriterion("credits <>", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsGreaterThan(BigDecimal value) {
            addCriterion("credits >", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credits >=", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsLessThan(BigDecimal value) {
            addCriterion("credits <", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credits <=", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsIn(List<BigDecimal> values) {
            addCriterion("credits in", values, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotIn(List<BigDecimal> values) {
            addCriterion("credits not in", values, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credits between", value1, value2, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credits not between", value1, value2, "credits");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionNameIsNull() {
            addCriterion("department_function_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionNameIsNotNull() {
            addCriterion("department_function_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionNameEqualTo(String value) {
            addCriterion("department_function_name =", value, "departmentFunctionName");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionNameNotEqualTo(String value) {
            addCriterion("department_function_name <>", value, "departmentFunctionName");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionNameGreaterThan(String value) {
            addCriterion("department_function_name >", value, "departmentFunctionName");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_function_name >=", value, "departmentFunctionName");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionNameLessThan(String value) {
            addCriterion("department_function_name <", value, "departmentFunctionName");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("department_function_name <=", value, "departmentFunctionName");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionNameLike(String value) {
            addCriterion("department_function_name like", value, "departmentFunctionName");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionNameNotLike(String value) {
            addCriterion("department_function_name not like", value, "departmentFunctionName");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionNameIn(List<String> values) {
            addCriterion("department_function_name in", values, "departmentFunctionName");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionNameNotIn(List<String> values) {
            addCriterion("department_function_name not in", values, "departmentFunctionName");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionNameBetween(String value1, String value2) {
            addCriterion("department_function_name between", value1, value2, "departmentFunctionName");
            return (Criteria) this;
        }

        public Criteria andDepartmentFunctionNameNotBetween(String value1, String value2) {
            addCriterion("department_function_name not between", value1, value2, "departmentFunctionName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIsNull() {
            addCriterion("hospital_name is null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIsNotNull() {
            addCriterion("hospital_name is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameEqualTo(String value) {
            addCriterion("hospital_name =", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotEqualTo(String value) {
            addCriterion("hospital_name <>", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThan(String value) {
            addCriterion("hospital_name >", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_name >=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThan(String value) {
            addCriterion("hospital_name <", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThanOrEqualTo(String value) {
            addCriterion("hospital_name <=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLike(String value) {
            addCriterion("hospital_name like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotLike(String value) {
            addCriterion("hospital_name not like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIn(List<String> values) {
            addCriterion("hospital_name in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotIn(List<String> values) {
            addCriterion("hospital_name not in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameBetween(String value1, String value2) {
            addCriterion("hospital_name between", value1, value2, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotBetween(String value1, String value2) {
            addCriterion("hospital_name not between", value1, value2, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andThumbsUpIsNull() {
            addCriterion("thumbs_up is null");
            return (Criteria) this;
        }

        public Criteria andThumbsUpIsNotNull() {
            addCriterion("thumbs_up is not null");
            return (Criteria) this;
        }

        public Criteria andThumbsUpEqualTo(Integer value) {
            addCriterion("thumbs_up =", value, "thumbsUp");
            return (Criteria) this;
        }

        public Criteria andThumbsUpNotEqualTo(Integer value) {
            addCriterion("thumbs_up <>", value, "thumbsUp");
            return (Criteria) this;
        }

        public Criteria andThumbsUpGreaterThan(Integer value) {
            addCriterion("thumbs_up >", value, "thumbsUp");
            return (Criteria) this;
        }

        public Criteria andThumbsUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("thumbs_up >=", value, "thumbsUp");
            return (Criteria) this;
        }

        public Criteria andThumbsUpLessThan(Integer value) {
            addCriterion("thumbs_up <", value, "thumbsUp");
            return (Criteria) this;
        }

        public Criteria andThumbsUpLessThanOrEqualTo(Integer value) {
            addCriterion("thumbs_up <=", value, "thumbsUp");
            return (Criteria) this;
        }

        public Criteria andThumbsUpIn(List<Integer> values) {
            addCriterion("thumbs_up in", values, "thumbsUp");
            return (Criteria) this;
        }

        public Criteria andThumbsUpNotIn(List<Integer> values) {
            addCriterion("thumbs_up not in", values, "thumbsUp");
            return (Criteria) this;
        }

        public Criteria andThumbsUpBetween(Integer value1, Integer value2) {
            addCriterion("thumbs_up between", value1, value2, "thumbsUp");
            return (Criteria) this;
        }

        public Criteria andThumbsUpNotBetween(Integer value1, Integer value2) {
            addCriterion("thumbs_up not between", value1, value2, "thumbsUp");
            return (Criteria) this;
        }

        public Criteria andCryptogramIsNull() {
            addCriterion("cryptogram is null");
            return (Criteria) this;
        }

        public Criteria andCryptogramIsNotNull() {
            addCriterion("cryptogram is not null");
            return (Criteria) this;
        }

        public Criteria andCryptogramEqualTo(String value) {
            addCriterion("cryptogram =", value, "cryptogram");
            return (Criteria) this;
        }

        public Criteria andCryptogramNotEqualTo(String value) {
            addCriterion("cryptogram <>", value, "cryptogram");
            return (Criteria) this;
        }

        public Criteria andCryptogramGreaterThan(String value) {
            addCriterion("cryptogram >", value, "cryptogram");
            return (Criteria) this;
        }

        public Criteria andCryptogramGreaterThanOrEqualTo(String value) {
            addCriterion("cryptogram >=", value, "cryptogram");
            return (Criteria) this;
        }

        public Criteria andCryptogramLessThan(String value) {
            addCriterion("cryptogram <", value, "cryptogram");
            return (Criteria) this;
        }

        public Criteria andCryptogramLessThanOrEqualTo(String value) {
            addCriterion("cryptogram <=", value, "cryptogram");
            return (Criteria) this;
        }

        public Criteria andCryptogramLike(String value) {
            addCriterion("cryptogram like", value, "cryptogram");
            return (Criteria) this;
        }

        public Criteria andCryptogramNotLike(String value) {
            addCriterion("cryptogram not like", value, "cryptogram");
            return (Criteria) this;
        }

        public Criteria andCryptogramIn(List<String> values) {
            addCriterion("cryptogram in", values, "cryptogram");
            return (Criteria) this;
        }

        public Criteria andCryptogramNotIn(List<String> values) {
            addCriterion("cryptogram not in", values, "cryptogram");
            return (Criteria) this;
        }

        public Criteria andCryptogramBetween(String value1, String value2) {
            addCriterion("cryptogram between", value1, value2, "cryptogram");
            return (Criteria) this;
        }

        public Criteria andCryptogramNotBetween(String value1, String value2) {
            addCriterion("cryptogram not between", value1, value2, "cryptogram");
            return (Criteria) this;
        }

        public Criteria andStepIsNull() {
            addCriterion("step is null");
            return (Criteria) this;
        }

        public Criteria andStepIsNotNull() {
            addCriterion("step is not null");
            return (Criteria) this;
        }

        public Criteria andStepEqualTo(Integer value) {
            addCriterion("step =", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotEqualTo(Integer value) {
            addCriterion("step <>", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThan(Integer value) {
            addCriterion("step >", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThanOrEqualTo(Integer value) {
            addCriterion("step >=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThan(Integer value) {
            addCriterion("step <", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThanOrEqualTo(Integer value) {
            addCriterion("step <=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepIn(List<Integer> values) {
            addCriterion("step in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotIn(List<Integer> values) {
            addCriterion("step not in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepBetween(Integer value1, Integer value2) {
            addCriterion("step between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotBetween(Integer value1, Integer value2) {
            addCriterion("step not between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginIsNull() {
            addCriterion("is_first_login is null");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginIsNotNull() {
            addCriterion("is_first_login is not null");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginEqualTo(Byte value) {
            addCriterion("is_first_login =", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginNotEqualTo(Byte value) {
            addCriterion("is_first_login <>", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginGreaterThan(Byte value) {
            addCriterion("is_first_login >", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_first_login >=", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginLessThan(Byte value) {
            addCriterion("is_first_login <", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginLessThanOrEqualTo(Byte value) {
            addCriterion("is_first_login <=", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginIn(List<Byte> values) {
            addCriterion("is_first_login in", values, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginNotIn(List<Byte> values) {
            addCriterion("is_first_login not in", values, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginBetween(Byte value1, Byte value2) {
            addCriterion("is_first_login between", value1, value2, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginNotBetween(Byte value1, Byte value2) {
            addCriterion("is_first_login not between", value1, value2, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIdentifyStatusIsNull() {
            addCriterion("identify_status is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyStatusIsNotNull() {
            addCriterion("identify_status is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyStatusEqualTo(Byte value) {
            addCriterion("identify_status =", value, "identifyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentifyStatusNotEqualTo(Byte value) {
            addCriterion("identify_status <>", value, "identifyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentifyStatusGreaterThan(Byte value) {
            addCriterion("identify_status >", value, "identifyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentifyStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("identify_status >=", value, "identifyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentifyStatusLessThan(Byte value) {
            addCriterion("identify_status <", value, "identifyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentifyStatusLessThanOrEqualTo(Byte value) {
            addCriterion("identify_status <=", value, "identifyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentifyStatusIn(List<Byte> values) {
            addCriterion("identify_status in", values, "identifyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentifyStatusNotIn(List<Byte> values) {
            addCriterion("identify_status not in", values, "identifyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentifyStatusBetween(Byte value1, Byte value2) {
            addCriterion("identify_status between", value1, value2, "identifyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentifyStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("identify_status not between", value1, value2, "identifyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentifyRemarksIsNull() {
            addCriterion("identify_remarks is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyRemarksIsNotNull() {
            addCriterion("identify_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyRemarksEqualTo(String value) {
            addCriterion("identify_remarks =", value, "identifyRemarks");
            return (Criteria) this;
        }

        public Criteria andIdentifyRemarksNotEqualTo(String value) {
            addCriterion("identify_remarks <>", value, "identifyRemarks");
            return (Criteria) this;
        }

        public Criteria andIdentifyRemarksGreaterThan(String value) {
            addCriterion("identify_remarks >", value, "identifyRemarks");
            return (Criteria) this;
        }

        public Criteria andIdentifyRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("identify_remarks >=", value, "identifyRemarks");
            return (Criteria) this;
        }

        public Criteria andIdentifyRemarksLessThan(String value) {
            addCriterion("identify_remarks <", value, "identifyRemarks");
            return (Criteria) this;
        }

        public Criteria andIdentifyRemarksLessThanOrEqualTo(String value) {
            addCriterion("identify_remarks <=", value, "identifyRemarks");
            return (Criteria) this;
        }

        public Criteria andIdentifyRemarksLike(String value) {
            addCriterion("identify_remarks like", value, "identifyRemarks");
            return (Criteria) this;
        }

        public Criteria andIdentifyRemarksNotLike(String value) {
            addCriterion("identify_remarks not like", value, "identifyRemarks");
            return (Criteria) this;
        }

        public Criteria andIdentifyRemarksIn(List<String> values) {
            addCriterion("identify_remarks in", values, "identifyRemarks");
            return (Criteria) this;
        }

        public Criteria andIdentifyRemarksNotIn(List<String> values) {
            addCriterion("identify_remarks not in", values, "identifyRemarks");
            return (Criteria) this;
        }

        public Criteria andIdentifyRemarksBetween(String value1, String value2) {
            addCriterion("identify_remarks between", value1, value2, "identifyRemarks");
            return (Criteria) this;
        }

        public Criteria andIdentifyRemarksNotBetween(String value1, String value2) {
            addCriterion("identify_remarks not between", value1, value2, "identifyRemarks");
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