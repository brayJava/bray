package com.whiteplanet.mapper.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andPayIsNull() {
            addCriterion("pay is null");
            return (Criteria) this;
        }

        public Criteria andPayIsNotNull() {
            addCriterion("pay is not null");
            return (Criteria) this;
        }

        public Criteria andPayEqualTo(Boolean value) {
            addCriterion("pay =", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotEqualTo(Boolean value) {
            addCriterion("pay <>", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThan(Boolean value) {
            addCriterion("pay >", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pay >=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThan(Boolean value) {
            addCriterion("pay <", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThanOrEqualTo(Boolean value) {
            addCriterion("pay <=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayIn(List<Boolean> values) {
            addCriterion("pay in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotIn(List<Boolean> values) {
            addCriterion("pay not in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayBetween(Boolean value1, Boolean value2) {
            addCriterion("pay between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pay not between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andVisIsNull() {
            addCriterion("vis is null");
            return (Criteria) this;
        }

        public Criteria andVisIsNotNull() {
            addCriterion("vis is not null");
            return (Criteria) this;
        }

        public Criteria andVisEqualTo(Boolean value) {
            addCriterion("vis =", value, "vis");
            return (Criteria) this;
        }

        public Criteria andVisNotEqualTo(Boolean value) {
            addCriterion("vis <>", value, "vis");
            return (Criteria) this;
        }

        public Criteria andVisGreaterThan(Boolean value) {
            addCriterion("vis >", value, "vis");
            return (Criteria) this;
        }

        public Criteria andVisGreaterThanOrEqualTo(Boolean value) {
            addCriterion("vis >=", value, "vis");
            return (Criteria) this;
        }

        public Criteria andVisLessThan(Boolean value) {
            addCriterion("vis <", value, "vis");
            return (Criteria) this;
        }

        public Criteria andVisLessThanOrEqualTo(Boolean value) {
            addCriterion("vis <=", value, "vis");
            return (Criteria) this;
        }

        public Criteria andVisIn(List<Boolean> values) {
            addCriterion("vis in", values, "vis");
            return (Criteria) this;
        }

        public Criteria andVisNotIn(List<Boolean> values) {
            addCriterion("vis not in", values, "vis");
            return (Criteria) this;
        }

        public Criteria andVisBetween(Boolean value1, Boolean value2) {
            addCriterion("vis between", value1, value2, "vis");
            return (Criteria) this;
        }

        public Criteria andVisNotBetween(Boolean value1, Boolean value2) {
            addCriterion("vis not between", value1, value2, "vis");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsNull() {
            addCriterion("appraise is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsNotNull() {
            addCriterion("appraise is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseEqualTo(Boolean value) {
            addCriterion("appraise =", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseNotEqualTo(Boolean value) {
            addCriterion("appraise <>", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseGreaterThan(Boolean value) {
            addCriterion("appraise >", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("appraise >=", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseLessThan(Boolean value) {
            addCriterion("appraise <", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseLessThanOrEqualTo(Boolean value) {
            addCriterion("appraise <=", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseIn(List<Boolean> values) {
            addCriterion("appraise in", values, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseNotIn(List<Boolean> values) {
            addCriterion("appraise not in", values, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseBetween(Boolean value1, Boolean value2) {
            addCriterion("appraise between", value1, value2, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("appraise not between", value1, value2, "appraise");
            return (Criteria) this;
        }

        public Criteria andTimeoutIsNull() {
            addCriterion("timeout is null");
            return (Criteria) this;
        }

        public Criteria andTimeoutIsNotNull() {
            addCriterion("timeout is not null");
            return (Criteria) this;
        }

        public Criteria andTimeoutEqualTo(Boolean value) {
            addCriterion("timeout =", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutNotEqualTo(Boolean value) {
            addCriterion("timeout <>", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutGreaterThan(Boolean value) {
            addCriterion("timeout >", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutGreaterThanOrEqualTo(Boolean value) {
            addCriterion("timeout >=", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutLessThan(Boolean value) {
            addCriterion("timeout <", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutLessThanOrEqualTo(Boolean value) {
            addCriterion("timeout <=", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutIn(List<Boolean> values) {
            addCriterion("timeout in", values, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutNotIn(List<Boolean> values) {
            addCriterion("timeout not in", values, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutBetween(Boolean value1, Boolean value2) {
            addCriterion("timeout between", value1, value2, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutNotBetween(Boolean value1, Boolean value2) {
            addCriterion("timeout not between", value1, value2, "timeout");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andNeedsOrderIdIsNull() {
            addCriterion("needs_order_id is null");
            return (Criteria) this;
        }

        public Criteria andNeedsOrderIdIsNotNull() {
            addCriterion("needs_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andNeedsOrderIdEqualTo(String value) {
            addCriterion("needs_order_id =", value, "needsOrderId");
            return (Criteria) this;
        }

        public Criteria andNeedsOrderIdNotEqualTo(String value) {
            addCriterion("needs_order_id <>", value, "needsOrderId");
            return (Criteria) this;
        }

        public Criteria andNeedsOrderIdGreaterThan(String value) {
            addCriterion("needs_order_id >", value, "needsOrderId");
            return (Criteria) this;
        }

        public Criteria andNeedsOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("needs_order_id >=", value, "needsOrderId");
            return (Criteria) this;
        }

        public Criteria andNeedsOrderIdLessThan(String value) {
            addCriterion("needs_order_id <", value, "needsOrderId");
            return (Criteria) this;
        }

        public Criteria andNeedsOrderIdLessThanOrEqualTo(String value) {
            addCriterion("needs_order_id <=", value, "needsOrderId");
            return (Criteria) this;
        }

        public Criteria andNeedsOrderIdLike(String value) {
            addCriterion("needs_order_id like", value, "needsOrderId");
            return (Criteria) this;
        }

        public Criteria andNeedsOrderIdNotLike(String value) {
            addCriterion("needs_order_id not like", value, "needsOrderId");
            return (Criteria) this;
        }

        public Criteria andNeedsOrderIdIn(List<String> values) {
            addCriterion("needs_order_id in", values, "needsOrderId");
            return (Criteria) this;
        }

        public Criteria andNeedsOrderIdNotIn(List<String> values) {
            addCriterion("needs_order_id not in", values, "needsOrderId");
            return (Criteria) this;
        }

        public Criteria andNeedsOrderIdBetween(String value1, String value2) {
            addCriterion("needs_order_id between", value1, value2, "needsOrderId");
            return (Criteria) this;
        }

        public Criteria andNeedsOrderIdNotBetween(String value1, String value2) {
            addCriterion("needs_order_id not between", value1, value2, "needsOrderId");
            return (Criteria) this;
        }

        public Criteria andCaseIllnessIdIsNull() {
            addCriterion("case_illness_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseIllnessIdIsNotNull() {
            addCriterion("case_illness_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIllnessIdEqualTo(String value) {
            addCriterion("case_illness_id =", value, "caseIllnessId");
            return (Criteria) this;
        }

        public Criteria andCaseIllnessIdNotEqualTo(String value) {
            addCriterion("case_illness_id <>", value, "caseIllnessId");
            return (Criteria) this;
        }

        public Criteria andCaseIllnessIdGreaterThan(String value) {
            addCriterion("case_illness_id >", value, "caseIllnessId");
            return (Criteria) this;
        }

        public Criteria andCaseIllnessIdGreaterThanOrEqualTo(String value) {
            addCriterion("case_illness_id >=", value, "caseIllnessId");
            return (Criteria) this;
        }

        public Criteria andCaseIllnessIdLessThan(String value) {
            addCriterion("case_illness_id <", value, "caseIllnessId");
            return (Criteria) this;
        }

        public Criteria andCaseIllnessIdLessThanOrEqualTo(String value) {
            addCriterion("case_illness_id <=", value, "caseIllnessId");
            return (Criteria) this;
        }

        public Criteria andCaseIllnessIdLike(String value) {
            addCriterion("case_illness_id like", value, "caseIllnessId");
            return (Criteria) this;
        }

        public Criteria andCaseIllnessIdNotLike(String value) {
            addCriterion("case_illness_id not like", value, "caseIllnessId");
            return (Criteria) this;
        }

        public Criteria andCaseIllnessIdIn(List<String> values) {
            addCriterion("case_illness_id in", values, "caseIllnessId");
            return (Criteria) this;
        }

        public Criteria andCaseIllnessIdNotIn(List<String> values) {
            addCriterion("case_illness_id not in", values, "caseIllnessId");
            return (Criteria) this;
        }

        public Criteria andCaseIllnessIdBetween(String value1, String value2) {
            addCriterion("case_illness_id between", value1, value2, "caseIllnessId");
            return (Criteria) this;
        }

        public Criteria andCaseIllnessIdNotBetween(String value1, String value2) {
            addCriterion("case_illness_id not between", value1, value2, "caseIllnessId");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("pay_date is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(Date value) {
            addCriterion("pay_date =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(Date value) {
            addCriterion("pay_date <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(Date value) {
            addCriterion("pay_date >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_date >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(Date value) {
            addCriterion("pay_date <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(Date value) {
            addCriterion("pay_date <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<Date> values) {
            addCriterion("pay_date in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<Date> values) {
            addCriterion("pay_date not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(Date value1, Date value2) {
            addCriterion("pay_date between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(Date value1, Date value2) {
            addCriterion("pay_date not between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andVisDateIsNull() {
            addCriterion("vis_date is null");
            return (Criteria) this;
        }

        public Criteria andVisDateIsNotNull() {
            addCriterion("vis_date is not null");
            return (Criteria) this;
        }

        public Criteria andVisDateEqualTo(Date value) {
            addCriterion("vis_date =", value, "visDate");
            return (Criteria) this;
        }

        public Criteria andVisDateNotEqualTo(Date value) {
            addCriterion("vis_date <>", value, "visDate");
            return (Criteria) this;
        }

        public Criteria andVisDateGreaterThan(Date value) {
            addCriterion("vis_date >", value, "visDate");
            return (Criteria) this;
        }

        public Criteria andVisDateGreaterThanOrEqualTo(Date value) {
            addCriterion("vis_date >=", value, "visDate");
            return (Criteria) this;
        }

        public Criteria andVisDateLessThan(Date value) {
            addCriterion("vis_date <", value, "visDate");
            return (Criteria) this;
        }

        public Criteria andVisDateLessThanOrEqualTo(Date value) {
            addCriterion("vis_date <=", value, "visDate");
            return (Criteria) this;
        }

        public Criteria andVisDateIn(List<Date> values) {
            addCriterion("vis_date in", values, "visDate");
            return (Criteria) this;
        }

        public Criteria andVisDateNotIn(List<Date> values) {
            addCriterion("vis_date not in", values, "visDate");
            return (Criteria) this;
        }

        public Criteria andVisDateBetween(Date value1, Date value2) {
            addCriterion("vis_date between", value1, value2, "visDate");
            return (Criteria) this;
        }

        public Criteria andVisDateNotBetween(Date value1, Date value2) {
            addCriterion("vis_date not between", value1, value2, "visDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateIsNull() {
            addCriterion("timeout_date is null");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateIsNotNull() {
            addCriterion("timeout_date is not null");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateEqualTo(Date value) {
            addCriterion("timeout_date =", value, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateNotEqualTo(Date value) {
            addCriterion("timeout_date <>", value, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateGreaterThan(Date value) {
            addCriterion("timeout_date >", value, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("timeout_date >=", value, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateLessThan(Date value) {
            addCriterion("timeout_date <", value, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateLessThanOrEqualTo(Date value) {
            addCriterion("timeout_date <=", value, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateIn(List<Date> values) {
            addCriterion("timeout_date in", values, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateNotIn(List<Date> values) {
            addCriterion("timeout_date not in", values, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateBetween(Date value1, Date value2) {
            addCriterion("timeout_date between", value1, value2, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andTimeoutDateNotBetween(Date value1, Date value2) {
            addCriterion("timeout_date not between", value1, value2, "timeoutDate");
            return (Criteria) this;
        }

        public Criteria andFinshDateIsNull() {
            addCriterion("finsh_date is null");
            return (Criteria) this;
        }

        public Criteria andFinshDateIsNotNull() {
            addCriterion("finsh_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinshDateEqualTo(Date value) {
            addCriterion("finsh_date =", value, "finshDate");
            return (Criteria) this;
        }

        public Criteria andFinshDateNotEqualTo(Date value) {
            addCriterion("finsh_date <>", value, "finshDate");
            return (Criteria) this;
        }

        public Criteria andFinshDateGreaterThan(Date value) {
            addCriterion("finsh_date >", value, "finshDate");
            return (Criteria) this;
        }

        public Criteria andFinshDateGreaterThanOrEqualTo(Date value) {
            addCriterion("finsh_date >=", value, "finshDate");
            return (Criteria) this;
        }

        public Criteria andFinshDateLessThan(Date value) {
            addCriterion("finsh_date <", value, "finshDate");
            return (Criteria) this;
        }

        public Criteria andFinshDateLessThanOrEqualTo(Date value) {
            addCriterion("finsh_date <=", value, "finshDate");
            return (Criteria) this;
        }

        public Criteria andFinshDateIn(List<Date> values) {
            addCriterion("finsh_date in", values, "finshDate");
            return (Criteria) this;
        }

        public Criteria andFinshDateNotIn(List<Date> values) {
            addCriterion("finsh_date not in", values, "finshDate");
            return (Criteria) this;
        }

        public Criteria andFinshDateBetween(Date value1, Date value2) {
            addCriterion("finsh_date between", value1, value2, "finshDate");
            return (Criteria) this;
        }

        public Criteria andFinshDateNotBetween(Date value1, Date value2) {
            addCriterion("finsh_date not between", value1, value2, "finshDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNull() {
            addCriterion("cancel_date is null");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNotNull() {
            addCriterion("cancel_date is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDateEqualTo(Date value) {
            addCriterion("cancel_date =", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotEqualTo(Date value) {
            addCriterion("cancel_date <>", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThan(Date value) {
            addCriterion("cancel_date >", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cancel_date >=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThan(Date value) {
            addCriterion("cancel_date <", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThanOrEqualTo(Date value) {
            addCriterion("cancel_date <=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIn(List<Date> values) {
            addCriterion("cancel_date in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotIn(List<Date> values) {
            addCriterion("cancel_date not in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateBetween(Date value1, Date value2) {
            addCriterion("cancel_date between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotBetween(Date value1, Date value2) {
            addCriterion("cancel_date not between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andAppraiseDateIsNull() {
            addCriterion("appraise_date is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseDateIsNotNull() {
            addCriterion("appraise_date is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseDateEqualTo(Date value) {
            addCriterion("appraise_date =", value, "appraiseDate");
            return (Criteria) this;
        }

        public Criteria andAppraiseDateNotEqualTo(Date value) {
            addCriterion("appraise_date <>", value, "appraiseDate");
            return (Criteria) this;
        }

        public Criteria andAppraiseDateGreaterThan(Date value) {
            addCriterion("appraise_date >", value, "appraiseDate");
            return (Criteria) this;
        }

        public Criteria andAppraiseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("appraise_date >=", value, "appraiseDate");
            return (Criteria) this;
        }

        public Criteria andAppraiseDateLessThan(Date value) {
            addCriterion("appraise_date <", value, "appraiseDate");
            return (Criteria) this;
        }

        public Criteria andAppraiseDateLessThanOrEqualTo(Date value) {
            addCriterion("appraise_date <=", value, "appraiseDate");
            return (Criteria) this;
        }

        public Criteria andAppraiseDateIn(List<Date> values) {
            addCriterion("appraise_date in", values, "appraiseDate");
            return (Criteria) this;
        }

        public Criteria andAppraiseDateNotIn(List<Date> values) {
            addCriterion("appraise_date not in", values, "appraiseDate");
            return (Criteria) this;
        }

        public Criteria andAppraiseDateBetween(Date value1, Date value2) {
            addCriterion("appraise_date between", value1, value2, "appraiseDate");
            return (Criteria) this;
        }

        public Criteria andAppraiseDateNotBetween(Date value1, Date value2) {
            addCriterion("appraise_date not between", value1, value2, "appraiseDate");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Boolean value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Boolean value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Boolean value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Boolean value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Boolean value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Boolean> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Boolean> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Boolean value1, Boolean value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("money not between", value1, value2, "money");
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

        public Criteria andFabulousIsNull() {
            addCriterion("fabulous is null");
            return (Criteria) this;
        }

        public Criteria andFabulousIsNotNull() {
            addCriterion("fabulous is not null");
            return (Criteria) this;
        }

        public Criteria andFabulousEqualTo(Boolean value) {
            addCriterion("fabulous =", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousNotEqualTo(Boolean value) {
            addCriterion("fabulous <>", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousGreaterThan(Boolean value) {
            addCriterion("fabulous >", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fabulous >=", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousLessThan(Boolean value) {
            addCriterion("fabulous <", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousLessThanOrEqualTo(Boolean value) {
            addCriterion("fabulous <=", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousIn(List<Boolean> values) {
            addCriterion("fabulous in", values, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousNotIn(List<Boolean> values) {
            addCriterion("fabulous not in", values, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousBetween(Boolean value1, Boolean value2) {
            addCriterion("fabulous between", value1, value2, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fabulous not between", value1, value2, "fabulous");
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