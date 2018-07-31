package com.whiteplanet.mapper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClinicPriceStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClinicPriceStatisticsExample() {
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

        public Criteria andPriceRangeIsNull() {
            addCriterion("price_range is null");
            return (Criteria) this;
        }

        public Criteria andPriceRangeIsNotNull() {
            addCriterion("price_range is not null");
            return (Criteria) this;
        }

        public Criteria andPriceRangeEqualTo(String value) {
            addCriterion("price_range =", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeNotEqualTo(String value) {
            addCriterion("price_range <>", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeGreaterThan(String value) {
            addCriterion("price_range >", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeGreaterThanOrEqualTo(String value) {
            addCriterion("price_range >=", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeLessThan(String value) {
            addCriterion("price_range <", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeLessThanOrEqualTo(String value) {
            addCriterion("price_range <=", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeLike(String value) {
            addCriterion("price_range like", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeNotLike(String value) {
            addCriterion("price_range not like", value, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeIn(List<String> values) {
            addCriterion("price_range in", values, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeNotIn(List<String> values) {
            addCriterion("price_range not in", values, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeBetween(String value1, String value2) {
            addCriterion("price_range between", value1, value2, "priceRange");
            return (Criteria) this;
        }

        public Criteria andPriceRangeNotBetween(String value1, String value2) {
            addCriterion("price_range not between", value1, value2, "priceRange");
            return (Criteria) this;
        }

        public Criteria andUserCountIsNull() {
            addCriterion("user_count is null");
            return (Criteria) this;
        }

        public Criteria andUserCountIsNotNull() {
            addCriterion("user_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserCountEqualTo(Integer value) {
            addCriterion("user_count =", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotEqualTo(Integer value) {
            addCriterion("user_count <>", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThan(Integer value) {
            addCriterion("user_count >", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_count >=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThan(Integer value) {
            addCriterion("user_count <", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_count <=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountIn(List<Integer> values) {
            addCriterion("user_count in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotIn(List<Integer> values) {
            addCriterion("user_count not in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountBetween(Integer value1, Integer value2) {
            addCriterion("user_count between", value1, value2, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_count not between", value1, value2, "userCount");
            return (Criteria) this;
        }

        public Criteria andPercentageIsNull() {
            addCriterion("percentage is null");
            return (Criteria) this;
        }

        public Criteria andPercentageIsNotNull() {
            addCriterion("percentage is not null");
            return (Criteria) this;
        }

        public Criteria andPercentageEqualTo(String value) {
            addCriterion("percentage =", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageNotEqualTo(String value) {
            addCriterion("percentage <>", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageGreaterThan(String value) {
            addCriterion("percentage >", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageGreaterThanOrEqualTo(String value) {
            addCriterion("percentage >=", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageLessThan(String value) {
            addCriterion("percentage <", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageLessThanOrEqualTo(String value) {
            addCriterion("percentage <=", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageLike(String value) {
            addCriterion("percentage like", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageNotLike(String value) {
            addCriterion("percentage not like", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageIn(List<String> values) {
            addCriterion("percentage in", values, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageNotIn(List<String> values) {
            addCriterion("percentage not in", values, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageBetween(String value1, String value2) {
            addCriterion("percentage between", value1, value2, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageNotBetween(String value1, String value2) {
            addCriterion("percentage not between", value1, value2, "percentage");
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