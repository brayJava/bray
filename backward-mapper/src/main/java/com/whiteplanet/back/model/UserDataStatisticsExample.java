package com.whiteplanet.back.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDataStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDataStatisticsExample() {
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

        public Criteria andLoadUserCountIsNull() {
            addCriterion("load_user_count is null");
            return (Criteria) this;
        }

        public Criteria andLoadUserCountIsNotNull() {
            addCriterion("load_user_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoadUserCountEqualTo(Integer value) {
            addCriterion("load_user_count =", value, "loadUserCount");
            return (Criteria) this;
        }

        public Criteria andLoadUserCountNotEqualTo(Integer value) {
            addCriterion("load_user_count <>", value, "loadUserCount");
            return (Criteria) this;
        }

        public Criteria andLoadUserCountGreaterThan(Integer value) {
            addCriterion("load_user_count >", value, "loadUserCount");
            return (Criteria) this;
        }

        public Criteria andLoadUserCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("load_user_count >=", value, "loadUserCount");
            return (Criteria) this;
        }

        public Criteria andLoadUserCountLessThan(Integer value) {
            addCriterion("load_user_count <", value, "loadUserCount");
            return (Criteria) this;
        }

        public Criteria andLoadUserCountLessThanOrEqualTo(Integer value) {
            addCriterion("load_user_count <=", value, "loadUserCount");
            return (Criteria) this;
        }

        public Criteria andLoadUserCountIn(List<Integer> values) {
            addCriterion("load_user_count in", values, "loadUserCount");
            return (Criteria) this;
        }

        public Criteria andLoadUserCountNotIn(List<Integer> values) {
            addCriterion("load_user_count not in", values, "loadUserCount");
            return (Criteria) this;
        }

        public Criteria andLoadUserCountBetween(Integer value1, Integer value2) {
            addCriterion("load_user_count between", value1, value2, "loadUserCount");
            return (Criteria) this;
        }

        public Criteria andLoadUserCountNotBetween(Integer value1, Integer value2) {
            addCriterion("load_user_count not between", value1, value2, "loadUserCount");
            return (Criteria) this;
        }

        public Criteria andRegisterUserCountIsNull() {
            addCriterion("register_user_count is null");
            return (Criteria) this;
        }

        public Criteria andRegisterUserCountIsNotNull() {
            addCriterion("register_user_count is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterUserCountEqualTo(Integer value) {
            addCriterion("register_user_count =", value, "registerUserCount");
            return (Criteria) this;
        }

        public Criteria andRegisterUserCountNotEqualTo(Integer value) {
            addCriterion("register_user_count <>", value, "registerUserCount");
            return (Criteria) this;
        }

        public Criteria andRegisterUserCountGreaterThan(Integer value) {
            addCriterion("register_user_count >", value, "registerUserCount");
            return (Criteria) this;
        }

        public Criteria andRegisterUserCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_user_count >=", value, "registerUserCount");
            return (Criteria) this;
        }

        public Criteria andRegisterUserCountLessThan(Integer value) {
            addCriterion("register_user_count <", value, "registerUserCount");
            return (Criteria) this;
        }

        public Criteria andRegisterUserCountLessThanOrEqualTo(Integer value) {
            addCriterion("register_user_count <=", value, "registerUserCount");
            return (Criteria) this;
        }

        public Criteria andRegisterUserCountIn(List<Integer> values) {
            addCriterion("register_user_count in", values, "registerUserCount");
            return (Criteria) this;
        }

        public Criteria andRegisterUserCountNotIn(List<Integer> values) {
            addCriterion("register_user_count not in", values, "registerUserCount");
            return (Criteria) this;
        }

        public Criteria andRegisterUserCountBetween(Integer value1, Integer value2) {
            addCriterion("register_user_count between", value1, value2, "registerUserCount");
            return (Criteria) this;
        }

        public Criteria andRegisterUserCountNotBetween(Integer value1, Integer value2) {
            addCriterion("register_user_count not between", value1, value2, "registerUserCount");
            return (Criteria) this;
        }

        public Criteria andFillDataCountIsNull() {
            addCriterion("fill_data_count is null");
            return (Criteria) this;
        }

        public Criteria andFillDataCountIsNotNull() {
            addCriterion("fill_data_count is not null");
            return (Criteria) this;
        }

        public Criteria andFillDataCountEqualTo(Integer value) {
            addCriterion("fill_data_count =", value, "fillDataCount");
            return (Criteria) this;
        }

        public Criteria andFillDataCountNotEqualTo(Integer value) {
            addCriterion("fill_data_count <>", value, "fillDataCount");
            return (Criteria) this;
        }

        public Criteria andFillDataCountGreaterThan(Integer value) {
            addCriterion("fill_data_count >", value, "fillDataCount");
            return (Criteria) this;
        }

        public Criteria andFillDataCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fill_data_count >=", value, "fillDataCount");
            return (Criteria) this;
        }

        public Criteria andFillDataCountLessThan(Integer value) {
            addCriterion("fill_data_count <", value, "fillDataCount");
            return (Criteria) this;
        }

        public Criteria andFillDataCountLessThanOrEqualTo(Integer value) {
            addCriterion("fill_data_count <=", value, "fillDataCount");
            return (Criteria) this;
        }

        public Criteria andFillDataCountIn(List<Integer> values) {
            addCriterion("fill_data_count in", values, "fillDataCount");
            return (Criteria) this;
        }

        public Criteria andFillDataCountNotIn(List<Integer> values) {
            addCriterion("fill_data_count not in", values, "fillDataCount");
            return (Criteria) this;
        }

        public Criteria andFillDataCountBetween(Integer value1, Integer value2) {
            addCriterion("fill_data_count between", value1, value2, "fillDataCount");
            return (Criteria) this;
        }

        public Criteria andFillDataCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fill_data_count not between", value1, value2, "fillDataCount");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameCountIsNull() {
            addCriterion("apply_realname_count is null");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameCountIsNotNull() {
            addCriterion("apply_realname_count is not null");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameCountEqualTo(Integer value) {
            addCriterion("apply_realname_count =", value, "applyRealnameCount");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameCountNotEqualTo(Integer value) {
            addCriterion("apply_realname_count <>", value, "applyRealnameCount");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameCountGreaterThan(Integer value) {
            addCriterion("apply_realname_count >", value, "applyRealnameCount");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_realname_count >=", value, "applyRealnameCount");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameCountLessThan(Integer value) {
            addCriterion("apply_realname_count <", value, "applyRealnameCount");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameCountLessThanOrEqualTo(Integer value) {
            addCriterion("apply_realname_count <=", value, "applyRealnameCount");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameCountIn(List<Integer> values) {
            addCriterion("apply_realname_count in", values, "applyRealnameCount");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameCountNotIn(List<Integer> values) {
            addCriterion("apply_realname_count not in", values, "applyRealnameCount");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameCountBetween(Integer value1, Integer value2) {
            addCriterion("apply_realname_count between", value1, value2, "applyRealnameCount");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameCountNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_realname_count not between", value1, value2, "applyRealnameCount");
            return (Criteria) this;
        }

        public Criteria andRegisterLoadPerIsNull() {
            addCriterion("register_load_per is null");
            return (Criteria) this;
        }

        public Criteria andRegisterLoadPerIsNotNull() {
            addCriterion("register_load_per is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterLoadPerEqualTo(String value) {
            addCriterion("register_load_per =", value, "registerLoadPer");
            return (Criteria) this;
        }

        public Criteria andRegisterLoadPerNotEqualTo(String value) {
            addCriterion("register_load_per <>", value, "registerLoadPer");
            return (Criteria) this;
        }

        public Criteria andRegisterLoadPerGreaterThan(String value) {
            addCriterion("register_load_per >", value, "registerLoadPer");
            return (Criteria) this;
        }

        public Criteria andRegisterLoadPerGreaterThanOrEqualTo(String value) {
            addCriterion("register_load_per >=", value, "registerLoadPer");
            return (Criteria) this;
        }

        public Criteria andRegisterLoadPerLessThan(String value) {
            addCriterion("register_load_per <", value, "registerLoadPer");
            return (Criteria) this;
        }

        public Criteria andRegisterLoadPerLessThanOrEqualTo(String value) {
            addCriterion("register_load_per <=", value, "registerLoadPer");
            return (Criteria) this;
        }

        public Criteria andRegisterLoadPerLike(String value) {
            addCriterion("register_load_per like", value, "registerLoadPer");
            return (Criteria) this;
        }

        public Criteria andRegisterLoadPerNotLike(String value) {
            addCriterion("register_load_per not like", value, "registerLoadPer");
            return (Criteria) this;
        }

        public Criteria andRegisterLoadPerIn(List<String> values) {
            addCriterion("register_load_per in", values, "registerLoadPer");
            return (Criteria) this;
        }

        public Criteria andRegisterLoadPerNotIn(List<String> values) {
            addCriterion("register_load_per not in", values, "registerLoadPer");
            return (Criteria) this;
        }

        public Criteria andRegisterLoadPerBetween(String value1, String value2) {
            addCriterion("register_load_per between", value1, value2, "registerLoadPer");
            return (Criteria) this;
        }

        public Criteria andRegisterLoadPerNotBetween(String value1, String value2) {
            addCriterion("register_load_per not between", value1, value2, "registerLoadPer");
            return (Criteria) this;
        }

        public Criteria andFillDataUserPerIsNull() {
            addCriterion("fill_data_user_per is null");
            return (Criteria) this;
        }

        public Criteria andFillDataUserPerIsNotNull() {
            addCriterion("fill_data_user_per is not null");
            return (Criteria) this;
        }

        public Criteria andFillDataUserPerEqualTo(String value) {
            addCriterion("fill_data_user_per =", value, "fillDataUserPer");
            return (Criteria) this;
        }

        public Criteria andFillDataUserPerNotEqualTo(String value) {
            addCriterion("fill_data_user_per <>", value, "fillDataUserPer");
            return (Criteria) this;
        }

        public Criteria andFillDataUserPerGreaterThan(String value) {
            addCriterion("fill_data_user_per >", value, "fillDataUserPer");
            return (Criteria) this;
        }

        public Criteria andFillDataUserPerGreaterThanOrEqualTo(String value) {
            addCriterion("fill_data_user_per >=", value, "fillDataUserPer");
            return (Criteria) this;
        }

        public Criteria andFillDataUserPerLessThan(String value) {
            addCriterion("fill_data_user_per <", value, "fillDataUserPer");
            return (Criteria) this;
        }

        public Criteria andFillDataUserPerLessThanOrEqualTo(String value) {
            addCriterion("fill_data_user_per <=", value, "fillDataUserPer");
            return (Criteria) this;
        }

        public Criteria andFillDataUserPerLike(String value) {
            addCriterion("fill_data_user_per like", value, "fillDataUserPer");
            return (Criteria) this;
        }

        public Criteria andFillDataUserPerNotLike(String value) {
            addCriterion("fill_data_user_per not like", value, "fillDataUserPer");
            return (Criteria) this;
        }

        public Criteria andFillDataUserPerIn(List<String> values) {
            addCriterion("fill_data_user_per in", values, "fillDataUserPer");
            return (Criteria) this;
        }

        public Criteria andFillDataUserPerNotIn(List<String> values) {
            addCriterion("fill_data_user_per not in", values, "fillDataUserPer");
            return (Criteria) this;
        }

        public Criteria andFillDataUserPerBetween(String value1, String value2) {
            addCriterion("fill_data_user_per between", value1, value2, "fillDataUserPer");
            return (Criteria) this;
        }

        public Criteria andFillDataUserPerNotBetween(String value1, String value2) {
            addCriterion("fill_data_user_per not between", value1, value2, "fillDataUserPer");
            return (Criteria) this;
        }

        public Criteria andRealnameSubmitPerIsNull() {
            addCriterion("realname_submit_per is null");
            return (Criteria) this;
        }

        public Criteria andRealnameSubmitPerIsNotNull() {
            addCriterion("realname_submit_per is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameSubmitPerEqualTo(String value) {
            addCriterion("realname_submit_per =", value, "realnameSubmitPer");
            return (Criteria) this;
        }

        public Criteria andRealnameSubmitPerNotEqualTo(String value) {
            addCriterion("realname_submit_per <>", value, "realnameSubmitPer");
            return (Criteria) this;
        }

        public Criteria andRealnameSubmitPerGreaterThan(String value) {
            addCriterion("realname_submit_per >", value, "realnameSubmitPer");
            return (Criteria) this;
        }

        public Criteria andRealnameSubmitPerGreaterThanOrEqualTo(String value) {
            addCriterion("realname_submit_per >=", value, "realnameSubmitPer");
            return (Criteria) this;
        }

        public Criteria andRealnameSubmitPerLessThan(String value) {
            addCriterion("realname_submit_per <", value, "realnameSubmitPer");
            return (Criteria) this;
        }

        public Criteria andRealnameSubmitPerLessThanOrEqualTo(String value) {
            addCriterion("realname_submit_per <=", value, "realnameSubmitPer");
            return (Criteria) this;
        }

        public Criteria andRealnameSubmitPerLike(String value) {
            addCriterion("realname_submit_per like", value, "realnameSubmitPer");
            return (Criteria) this;
        }

        public Criteria andRealnameSubmitPerNotLike(String value) {
            addCriterion("realname_submit_per not like", value, "realnameSubmitPer");
            return (Criteria) this;
        }

        public Criteria andRealnameSubmitPerIn(List<String> values) {
            addCriterion("realname_submit_per in", values, "realnameSubmitPer");
            return (Criteria) this;
        }

        public Criteria andRealnameSubmitPerNotIn(List<String> values) {
            addCriterion("realname_submit_per not in", values, "realnameSubmitPer");
            return (Criteria) this;
        }

        public Criteria andRealnameSubmitPerBetween(String value1, String value2) {
            addCriterion("realname_submit_per between", value1, value2, "realnameSubmitPer");
            return (Criteria) this;
        }

        public Criteria andRealnameSubmitPerNotBetween(String value1, String value2) {
            addCriterion("realname_submit_per not between", value1, value2, "realnameSubmitPer");
            return (Criteria) this;
        }

        public Criteria andActiveDeviceNumberIsNull() {
            addCriterion("active_device_number is null");
            return (Criteria) this;
        }

        public Criteria andActiveDeviceNumberIsNotNull() {
            addCriterion("active_device_number is not null");
            return (Criteria) this;
        }

        public Criteria andActiveDeviceNumberEqualTo(Integer value) {
            addCriterion("active_device_number =", value, "activeDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andActiveDeviceNumberNotEqualTo(Integer value) {
            addCriterion("active_device_number <>", value, "activeDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andActiveDeviceNumberGreaterThan(Integer value) {
            addCriterion("active_device_number >", value, "activeDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andActiveDeviceNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_device_number >=", value, "activeDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andActiveDeviceNumberLessThan(Integer value) {
            addCriterion("active_device_number <", value, "activeDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andActiveDeviceNumberLessThanOrEqualTo(Integer value) {
            addCriterion("active_device_number <=", value, "activeDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andActiveDeviceNumberIn(List<Integer> values) {
            addCriterion("active_device_number in", values, "activeDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andActiveDeviceNumberNotIn(List<Integer> values) {
            addCriterion("active_device_number not in", values, "activeDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andActiveDeviceNumberBetween(Integer value1, Integer value2) {
            addCriterion("active_device_number between", value1, value2, "activeDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andActiveDeviceNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("active_device_number not between", value1, value2, "activeDeviceNumber");
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