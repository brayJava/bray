package com.whiteplanet.back.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClinicInvocationStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClinicInvocationStatisticsExample() {
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andInvocationTotalCountIsNull() {
            addCriterion("invocation_total_count is null");
            return (Criteria) this;
        }

        public Criteria andInvocationTotalCountIsNotNull() {
            addCriterion("invocation_total_count is not null");
            return (Criteria) this;
        }

        public Criteria andInvocationTotalCountEqualTo(Integer value) {
            addCriterion("invocation_total_count =", value, "invocationTotalCount");
            return (Criteria) this;
        }

        public Criteria andInvocationTotalCountNotEqualTo(Integer value) {
            addCriterion("invocation_total_count <>", value, "invocationTotalCount");
            return (Criteria) this;
        }

        public Criteria andInvocationTotalCountGreaterThan(Integer value) {
            addCriterion("invocation_total_count >", value, "invocationTotalCount");
            return (Criteria) this;
        }

        public Criteria andInvocationTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("invocation_total_count >=", value, "invocationTotalCount");
            return (Criteria) this;
        }

        public Criteria andInvocationTotalCountLessThan(Integer value) {
            addCriterion("invocation_total_count <", value, "invocationTotalCount");
            return (Criteria) this;
        }

        public Criteria andInvocationTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("invocation_total_count <=", value, "invocationTotalCount");
            return (Criteria) this;
        }

        public Criteria andInvocationTotalCountIn(List<Integer> values) {
            addCriterion("invocation_total_count in", values, "invocationTotalCount");
            return (Criteria) this;
        }

        public Criteria andInvocationTotalCountNotIn(List<Integer> values) {
            addCriterion("invocation_total_count not in", values, "invocationTotalCount");
            return (Criteria) this;
        }

        public Criteria andInvocationTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("invocation_total_count between", value1, value2, "invocationTotalCount");
            return (Criteria) this;
        }

        public Criteria andInvocationTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("invocation_total_count not between", value1, value2, "invocationTotalCount");
            return (Criteria) this;
        }

        public Criteria andInvocationRegisterCountIsNull() {
            addCriterion("invocation_register_count is null");
            return (Criteria) this;
        }

        public Criteria andInvocationRegisterCountIsNotNull() {
            addCriterion("invocation_register_count is not null");
            return (Criteria) this;
        }

        public Criteria andInvocationRegisterCountEqualTo(Integer value) {
            addCriterion("invocation_register_count =", value, "invocationRegisterCount");
            return (Criteria) this;
        }

        public Criteria andInvocationRegisterCountNotEqualTo(Integer value) {
            addCriterion("invocation_register_count <>", value, "invocationRegisterCount");
            return (Criteria) this;
        }

        public Criteria andInvocationRegisterCountGreaterThan(Integer value) {
            addCriterion("invocation_register_count >", value, "invocationRegisterCount");
            return (Criteria) this;
        }

        public Criteria andInvocationRegisterCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("invocation_register_count >=", value, "invocationRegisterCount");
            return (Criteria) this;
        }

        public Criteria andInvocationRegisterCountLessThan(Integer value) {
            addCriterion("invocation_register_count <", value, "invocationRegisterCount");
            return (Criteria) this;
        }

        public Criteria andInvocationRegisterCountLessThanOrEqualTo(Integer value) {
            addCriterion("invocation_register_count <=", value, "invocationRegisterCount");
            return (Criteria) this;
        }

        public Criteria andInvocationRegisterCountIn(List<Integer> values) {
            addCriterion("invocation_register_count in", values, "invocationRegisterCount");
            return (Criteria) this;
        }

        public Criteria andInvocationRegisterCountNotIn(List<Integer> values) {
            addCriterion("invocation_register_count not in", values, "invocationRegisterCount");
            return (Criteria) this;
        }

        public Criteria andInvocationRegisterCountBetween(Integer value1, Integer value2) {
            addCriterion("invocation_register_count between", value1, value2, "invocationRegisterCount");
            return (Criteria) this;
        }

        public Criteria andInvocationRegisterCountNotBetween(Integer value1, Integer value2) {
            addCriterion("invocation_register_count not between", value1, value2, "invocationRegisterCount");
            return (Criteria) this;
        }

        public Criteria andInvocationSuccessPerIsNull() {
            addCriterion("invocation_success_per is null");
            return (Criteria) this;
        }

        public Criteria andInvocationSuccessPerIsNotNull() {
            addCriterion("invocation_success_per is not null");
            return (Criteria) this;
        }

        public Criteria andInvocationSuccessPerEqualTo(String value) {
            addCriterion("invocation_success_per =", value, "invocationSuccessPer");
            return (Criteria) this;
        }

        public Criteria andInvocationSuccessPerNotEqualTo(String value) {
            addCriterion("invocation_success_per <>", value, "invocationSuccessPer");
            return (Criteria) this;
        }

        public Criteria andInvocationSuccessPerGreaterThan(String value) {
            addCriterion("invocation_success_per >", value, "invocationSuccessPer");
            return (Criteria) this;
        }

        public Criteria andInvocationSuccessPerGreaterThanOrEqualTo(String value) {
            addCriterion("invocation_success_per >=", value, "invocationSuccessPer");
            return (Criteria) this;
        }

        public Criteria andInvocationSuccessPerLessThan(String value) {
            addCriterion("invocation_success_per <", value, "invocationSuccessPer");
            return (Criteria) this;
        }

        public Criteria andInvocationSuccessPerLessThanOrEqualTo(String value) {
            addCriterion("invocation_success_per <=", value, "invocationSuccessPer");
            return (Criteria) this;
        }

        public Criteria andInvocationSuccessPerLike(String value) {
            addCriterion("invocation_success_per like", value, "invocationSuccessPer");
            return (Criteria) this;
        }

        public Criteria andInvocationSuccessPerNotLike(String value) {
            addCriterion("invocation_success_per not like", value, "invocationSuccessPer");
            return (Criteria) this;
        }

        public Criteria andInvocationSuccessPerIn(List<String> values) {
            addCriterion("invocation_success_per in", values, "invocationSuccessPer");
            return (Criteria) this;
        }

        public Criteria andInvocationSuccessPerNotIn(List<String> values) {
            addCriterion("invocation_success_per not in", values, "invocationSuccessPer");
            return (Criteria) this;
        }

        public Criteria andInvocationSuccessPerBetween(String value1, String value2) {
            addCriterion("invocation_success_per between", value1, value2, "invocationSuccessPer");
            return (Criteria) this;
        }

        public Criteria andInvocationSuccessPerNotBetween(String value1, String value2) {
            addCriterion("invocation_success_per not between", value1, value2, "invocationSuccessPer");
            return (Criteria) this;
        }

        public Criteria andClinicAvgInvocationIsNull() {
            addCriterion("clinic_avg_invocation is null");
            return (Criteria) this;
        }

        public Criteria andClinicAvgInvocationIsNotNull() {
            addCriterion("clinic_avg_invocation is not null");
            return (Criteria) this;
        }

        public Criteria andClinicAvgInvocationEqualTo(Integer value) {
            addCriterion("clinic_avg_invocation =", value, "clinicAvgInvocation");
            return (Criteria) this;
        }

        public Criteria andClinicAvgInvocationNotEqualTo(Integer value) {
            addCriterion("clinic_avg_invocation <>", value, "clinicAvgInvocation");
            return (Criteria) this;
        }

        public Criteria andClinicAvgInvocationGreaterThan(Integer value) {
            addCriterion("clinic_avg_invocation >", value, "clinicAvgInvocation");
            return (Criteria) this;
        }

        public Criteria andClinicAvgInvocationGreaterThanOrEqualTo(Integer value) {
            addCriterion("clinic_avg_invocation >=", value, "clinicAvgInvocation");
            return (Criteria) this;
        }

        public Criteria andClinicAvgInvocationLessThan(Integer value) {
            addCriterion("clinic_avg_invocation <", value, "clinicAvgInvocation");
            return (Criteria) this;
        }

        public Criteria andClinicAvgInvocationLessThanOrEqualTo(Integer value) {
            addCriterion("clinic_avg_invocation <=", value, "clinicAvgInvocation");
            return (Criteria) this;
        }

        public Criteria andClinicAvgInvocationIn(List<Integer> values) {
            addCriterion("clinic_avg_invocation in", values, "clinicAvgInvocation");
            return (Criteria) this;
        }

        public Criteria andClinicAvgInvocationNotIn(List<Integer> values) {
            addCriterion("clinic_avg_invocation not in", values, "clinicAvgInvocation");
            return (Criteria) this;
        }

        public Criteria andClinicAvgInvocationBetween(Integer value1, Integer value2) {
            addCriterion("clinic_avg_invocation between", value1, value2, "clinicAvgInvocation");
            return (Criteria) this;
        }

        public Criteria andClinicAvgInvocationNotBetween(Integer value1, Integer value2) {
            addCriterion("clinic_avg_invocation not between", value1, value2, "clinicAvgInvocation");
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