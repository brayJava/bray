package com.whiteplanet.mapper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecommendReasonShareDoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecommendReasonShareDoctorExample() {
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
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

        public Criteria andRecommendReasonIdIsNull() {
            addCriterion("recommend_reason_id is null");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIdIsNotNull() {
            addCriterion("recommend_reason_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIdEqualTo(String value) {
            addCriterion("recommend_reason_id =", value, "recommendReasonId");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIdNotEqualTo(String value) {
            addCriterion("recommend_reason_id <>", value, "recommendReasonId");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIdGreaterThan(String value) {
            addCriterion("recommend_reason_id >", value, "recommendReasonId");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIdGreaterThanOrEqualTo(String value) {
            addCriterion("recommend_reason_id >=", value, "recommendReasonId");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIdLessThan(String value) {
            addCriterion("recommend_reason_id <", value, "recommendReasonId");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIdLessThanOrEqualTo(String value) {
            addCriterion("recommend_reason_id <=", value, "recommendReasonId");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIdLike(String value) {
            addCriterion("recommend_reason_id like", value, "recommendReasonId");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIdNotLike(String value) {
            addCriterion("recommend_reason_id not like", value, "recommendReasonId");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIdIn(List<String> values) {
            addCriterion("recommend_reason_id in", values, "recommendReasonId");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIdNotIn(List<String> values) {
            addCriterion("recommend_reason_id not in", values, "recommendReasonId");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIdBetween(String value1, String value2) {
            addCriterion("recommend_reason_id between", value1, value2, "recommendReasonId");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIdNotBetween(String value1, String value2) {
            addCriterion("recommend_reason_id not between", value1, value2, "recommendReasonId");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonDoctorNameIsNull() {
            addCriterion("recommend_reason_doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonDoctorNameIsNotNull() {
            addCriterion("recommend_reason_doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonDoctorNameEqualTo(String value) {
            addCriterion("recommend_reason_doctor_name =", value, "recommendReasonDoctorName");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonDoctorNameNotEqualTo(String value) {
            addCriterion("recommend_reason_doctor_name <>", value, "recommendReasonDoctorName");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonDoctorNameGreaterThan(String value) {
            addCriterion("recommend_reason_doctor_name >", value, "recommendReasonDoctorName");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("recommend_reason_doctor_name >=", value, "recommendReasonDoctorName");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonDoctorNameLessThan(String value) {
            addCriterion("recommend_reason_doctor_name <", value, "recommendReasonDoctorName");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("recommend_reason_doctor_name <=", value, "recommendReasonDoctorName");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonDoctorNameLike(String value) {
            addCriterion("recommend_reason_doctor_name like", value, "recommendReasonDoctorName");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonDoctorNameNotLike(String value) {
            addCriterion("recommend_reason_doctor_name not like", value, "recommendReasonDoctorName");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonDoctorNameIn(List<String> values) {
            addCriterion("recommend_reason_doctor_name in", values, "recommendReasonDoctorName");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonDoctorNameNotIn(List<String> values) {
            addCriterion("recommend_reason_doctor_name not in", values, "recommendReasonDoctorName");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonDoctorNameBetween(String value1, String value2) {
            addCriterion("recommend_reason_doctor_name between", value1, value2, "recommendReasonDoctorName");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonDoctorNameNotBetween(String value1, String value2) {
            addCriterion("recommend_reason_doctor_name not between", value1, value2, "recommendReasonDoctorName");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIsNull() {
            addCriterion("recommend_reason is null");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIsNotNull() {
            addCriterion("recommend_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonEqualTo(String value) {
            addCriterion("recommend_reason =", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonNotEqualTo(String value) {
            addCriterion("recommend_reason <>", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonGreaterThan(String value) {
            addCriterion("recommend_reason >", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonGreaterThanOrEqualTo(String value) {
            addCriterion("recommend_reason >=", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonLessThan(String value) {
            addCriterion("recommend_reason <", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonLessThanOrEqualTo(String value) {
            addCriterion("recommend_reason <=", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonLike(String value) {
            addCriterion("recommend_reason like", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonNotLike(String value) {
            addCriterion("recommend_reason not like", value, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonIn(List<String> values) {
            addCriterion("recommend_reason in", values, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonNotIn(List<String> values) {
            addCriterion("recommend_reason not in", values, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonBetween(String value1, String value2) {
            addCriterion("recommend_reason between", value1, value2, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andRecommendReasonNotBetween(String value1, String value2) {
            addCriterion("recommend_reason not between", value1, value2, "recommendReason");
            return (Criteria) this;
        }

        public Criteria andFromIsNull() {
            addCriterion("from is null");
            return (Criteria) this;
        }

        public Criteria andFromIsNotNull() {
            addCriterion("from is not null");
            return (Criteria) this;
        }

        public Criteria andFromEqualTo(String value) {
            addCriterion("from =", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotEqualTo(String value) {
            addCriterion("from <>", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThan(String value) {
            addCriterion("from >", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThanOrEqualTo(String value) {
            addCriterion("from >=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThan(String value) {
            addCriterion("from <", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThanOrEqualTo(String value) {
            addCriterion("from <=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLike(String value) {
            addCriterion("from like", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotLike(String value) {
            addCriterion("from not like", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromIn(List<String> values) {
            addCriterion("from in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotIn(List<String> values) {
            addCriterion("from not in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromBetween(String value1, String value2) {
            addCriterion("from between", value1, value2, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotBetween(String value1, String value2) {
            addCriterion("from not between", value1, value2, "from");
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

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
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