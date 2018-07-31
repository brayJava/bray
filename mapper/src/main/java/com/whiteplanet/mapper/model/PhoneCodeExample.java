package com.whiteplanet.mapper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhoneCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhoneCodeExample() {
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

        public Criteria andPhonenumberIsNull() {
            addCriterion("phonenumber is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNotNull() {
            addCriterion("phonenumber is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberEqualTo(String value) {
            addCriterion("phonenumber =", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotEqualTo(String value) {
            addCriterion("phonenumber <>", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThan(String value) {
            addCriterion("phonenumber >", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("phonenumber >=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThan(String value) {
            addCriterion("phonenumber <", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("phonenumber <=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLike(String value) {
            addCriterion("phonenumber like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotLike(String value) {
            addCriterion("phonenumber not like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIn(List<String> values) {
            addCriterion("phonenumber in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotIn(List<String> values) {
            addCriterion("phonenumber not in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberBetween(String value1, String value2) {
            addCriterion("phonenumber between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotBetween(String value1, String value2) {
            addCriterion("phonenumber not between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andSenddatetimeIsNull() {
            addCriterion("senddatetime is null");
            return (Criteria) this;
        }

        public Criteria andSenddatetimeIsNotNull() {
            addCriterion("senddatetime is not null");
            return (Criteria) this;
        }

        public Criteria andSenddatetimeEqualTo(Date value) {
            addCriterion("senddatetime =", value, "senddatetime");
            return (Criteria) this;
        }

        public Criteria andSenddatetimeNotEqualTo(Date value) {
            addCriterion("senddatetime <>", value, "senddatetime");
            return (Criteria) this;
        }

        public Criteria andSenddatetimeGreaterThan(Date value) {
            addCriterion("senddatetime >", value, "senddatetime");
            return (Criteria) this;
        }

        public Criteria andSenddatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("senddatetime >=", value, "senddatetime");
            return (Criteria) this;
        }

        public Criteria andSenddatetimeLessThan(Date value) {
            addCriterion("senddatetime <", value, "senddatetime");
            return (Criteria) this;
        }

        public Criteria andSenddatetimeLessThanOrEqualTo(Date value) {
            addCriterion("senddatetime <=", value, "senddatetime");
            return (Criteria) this;
        }

        public Criteria andSenddatetimeIn(List<Date> values) {
            addCriterion("senddatetime in", values, "senddatetime");
            return (Criteria) this;
        }

        public Criteria andSenddatetimeNotIn(List<Date> values) {
            addCriterion("senddatetime not in", values, "senddatetime");
            return (Criteria) this;
        }

        public Criteria andSenddatetimeBetween(Date value1, Date value2) {
            addCriterion("senddatetime between", value1, value2, "senddatetime");
            return (Criteria) this;
        }

        public Criteria andSenddatetimeNotBetween(Date value1, Date value2) {
            addCriterion("senddatetime not between", value1, value2, "senddatetime");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andNextdatetimeIsNull() {
            addCriterion("nextdatetime is null");
            return (Criteria) this;
        }

        public Criteria andNextdatetimeIsNotNull() {
            addCriterion("nextdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andNextdatetimeEqualTo(Date value) {
            addCriterion("nextdatetime =", value, "nextdatetime");
            return (Criteria) this;
        }

        public Criteria andNextdatetimeNotEqualTo(Date value) {
            addCriterion("nextdatetime <>", value, "nextdatetime");
            return (Criteria) this;
        }

        public Criteria andNextdatetimeGreaterThan(Date value) {
            addCriterion("nextdatetime >", value, "nextdatetime");
            return (Criteria) this;
        }

        public Criteria andNextdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nextdatetime >=", value, "nextdatetime");
            return (Criteria) this;
        }

        public Criteria andNextdatetimeLessThan(Date value) {
            addCriterion("nextdatetime <", value, "nextdatetime");
            return (Criteria) this;
        }

        public Criteria andNextdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("nextdatetime <=", value, "nextdatetime");
            return (Criteria) this;
        }

        public Criteria andNextdatetimeIn(List<Date> values) {
            addCriterion("nextdatetime in", values, "nextdatetime");
            return (Criteria) this;
        }

        public Criteria andNextdatetimeNotIn(List<Date> values) {
            addCriterion("nextdatetime not in", values, "nextdatetime");
            return (Criteria) this;
        }

        public Criteria andNextdatetimeBetween(Date value1, Date value2) {
            addCriterion("nextdatetime between", value1, value2, "nextdatetime");
            return (Criteria) this;
        }

        public Criteria andNextdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("nextdatetime not between", value1, value2, "nextdatetime");
            return (Criteria) this;
        }

        public Criteria andValiddatetimeIsNull() {
            addCriterion("validdatetime is null");
            return (Criteria) this;
        }

        public Criteria andValiddatetimeIsNotNull() {
            addCriterion("validdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andValiddatetimeEqualTo(Date value) {
            addCriterion("validdatetime =", value, "validdatetime");
            return (Criteria) this;
        }

        public Criteria andValiddatetimeNotEqualTo(Date value) {
            addCriterion("validdatetime <>", value, "validdatetime");
            return (Criteria) this;
        }

        public Criteria andValiddatetimeGreaterThan(Date value) {
            addCriterion("validdatetime >", value, "validdatetime");
            return (Criteria) this;
        }

        public Criteria andValiddatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("validdatetime >=", value, "validdatetime");
            return (Criteria) this;
        }

        public Criteria andValiddatetimeLessThan(Date value) {
            addCriterion("validdatetime <", value, "validdatetime");
            return (Criteria) this;
        }

        public Criteria andValiddatetimeLessThanOrEqualTo(Date value) {
            addCriterion("validdatetime <=", value, "validdatetime");
            return (Criteria) this;
        }

        public Criteria andValiddatetimeIn(List<Date> values) {
            addCriterion("validdatetime in", values, "validdatetime");
            return (Criteria) this;
        }

        public Criteria andValiddatetimeNotIn(List<Date> values) {
            addCriterion("validdatetime not in", values, "validdatetime");
            return (Criteria) this;
        }

        public Criteria andValiddatetimeBetween(Date value1, Date value2) {
            addCriterion("validdatetime between", value1, value2, "validdatetime");
            return (Criteria) this;
        }

        public Criteria andValiddatetimeNotBetween(Date value1, Date value2) {
            addCriterion("validdatetime not between", value1, value2, "validdatetime");
            return (Criteria) this;
        }

        public Criteria andRegIsNull() {
            addCriterion("reg is null");
            return (Criteria) this;
        }

        public Criteria andRegIsNotNull() {
            addCriterion("reg is not null");
            return (Criteria) this;
        }

        public Criteria andRegEqualTo(Boolean value) {
            addCriterion("reg =", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegNotEqualTo(Boolean value) {
            addCriterion("reg <>", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegGreaterThan(Boolean value) {
            addCriterion("reg >", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reg >=", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegLessThan(Boolean value) {
            addCriterion("reg <", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegLessThanOrEqualTo(Boolean value) {
            addCriterion("reg <=", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegIn(List<Boolean> values) {
            addCriterion("reg in", values, "reg");
            return (Criteria) this;
        }

        public Criteria andRegNotIn(List<Boolean> values) {
            addCriterion("reg not in", values, "reg");
            return (Criteria) this;
        }

        public Criteria andRegBetween(Boolean value1, Boolean value2) {
            addCriterion("reg between", value1, value2, "reg");
            return (Criteria) this;
        }

        public Criteria andRegNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reg not between", value1, value2, "reg");
            return (Criteria) this;
        }

        public Criteria andDoctorIsNull() {
            addCriterion("doctor is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIsNotNull() {
            addCriterion("doctor is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorEqualTo(Boolean value) {
            addCriterion("doctor =", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotEqualTo(Boolean value) {
            addCriterion("doctor <>", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThan(Boolean value) {
            addCriterion("doctor >", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("doctor >=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThan(Boolean value) {
            addCriterion("doctor <", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThanOrEqualTo(Boolean value) {
            addCriterion("doctor <=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorIn(List<Boolean> values) {
            addCriterion("doctor in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotIn(List<Boolean> values) {
            addCriterion("doctor not in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorBetween(Boolean value1, Boolean value2) {
            addCriterion("doctor between", value1, value2, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("doctor not between", value1, value2, "doctor");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andTimeCountIsNull() {
            addCriterion("time_count is null");
            return (Criteria) this;
        }

        public Criteria andTimeCountIsNotNull() {
            addCriterion("time_count is not null");
            return (Criteria) this;
        }

        public Criteria andTimeCountEqualTo(Integer value) {
            addCriterion("time_count =", value, "timeCount");
            return (Criteria) this;
        }

        public Criteria andTimeCountNotEqualTo(Integer value) {
            addCriterion("time_count <>", value, "timeCount");
            return (Criteria) this;
        }

        public Criteria andTimeCountGreaterThan(Integer value) {
            addCriterion("time_count >", value, "timeCount");
            return (Criteria) this;
        }

        public Criteria andTimeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_count >=", value, "timeCount");
            return (Criteria) this;
        }

        public Criteria andTimeCountLessThan(Integer value) {
            addCriterion("time_count <", value, "timeCount");
            return (Criteria) this;
        }

        public Criteria andTimeCountLessThanOrEqualTo(Integer value) {
            addCriterion("time_count <=", value, "timeCount");
            return (Criteria) this;
        }

        public Criteria andTimeCountIn(List<Integer> values) {
            addCriterion("time_count in", values, "timeCount");
            return (Criteria) this;
        }

        public Criteria andTimeCountNotIn(List<Integer> values) {
            addCriterion("time_count not in", values, "timeCount");
            return (Criteria) this;
        }

        public Criteria andTimeCountBetween(Integer value1, Integer value2) {
            addCriterion("time_count between", value1, value2, "timeCount");
            return (Criteria) this;
        }

        public Criteria andTimeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("time_count not between", value1, value2, "timeCount");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNull() {
            addCriterion("bank_card is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNotNull() {
            addCriterion("bank_card is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardEqualTo(Boolean value) {
            addCriterion("bank_card =", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotEqualTo(Boolean value) {
            addCriterion("bank_card <>", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThan(Boolean value) {
            addCriterion("bank_card >", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bank_card >=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThan(Boolean value) {
            addCriterion("bank_card <", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThanOrEqualTo(Boolean value) {
            addCriterion("bank_card <=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardIn(List<Boolean> values) {
            addCriterion("bank_card in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotIn(List<Boolean> values) {
            addCriterion("bank_card not in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardBetween(Boolean value1, Boolean value2) {
            addCriterion("bank_card between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bank_card not between", value1, value2, "bankCard");
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