package com.whiteplanet.mapper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImSingleMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImSingleMessageExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFromTypeIsNull() {
            addCriterion("from_type is null");
            return (Criteria) this;
        }

        public Criteria andFromTypeIsNotNull() {
            addCriterion("from_type is not null");
            return (Criteria) this;
        }

        public Criteria andFromTypeEqualTo(String value) {
            addCriterion("from_type =", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotEqualTo(String value) {
            addCriterion("from_type <>", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeGreaterThan(String value) {
            addCriterion("from_type >", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeGreaterThanOrEqualTo(String value) {
            addCriterion("from_type >=", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeLessThan(String value) {
            addCriterion("from_type <", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeLessThanOrEqualTo(String value) {
            addCriterion("from_type <=", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeLike(String value) {
            addCriterion("from_type like", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotLike(String value) {
            addCriterion("from_type not like", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeIn(List<String> values) {
            addCriterion("from_type in", values, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotIn(List<String> values) {
            addCriterion("from_type not in", values, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeBetween(String value1, String value2) {
            addCriterion("from_type between", value1, value2, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotBetween(String value1, String value2) {
            addCriterion("from_type not between", value1, value2, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromIdIsNull() {
            addCriterion("from_id is null");
            return (Criteria) this;
        }

        public Criteria andFromIdIsNotNull() {
            addCriterion("from_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromIdEqualTo(String value) {
            addCriterion("from_id =", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdNotEqualTo(String value) {
            addCriterion("from_id <>", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdGreaterThan(String value) {
            addCriterion("from_id >", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdGreaterThanOrEqualTo(String value) {
            addCriterion("from_id >=", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdLessThan(String value) {
            addCriterion("from_id <", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdLessThanOrEqualTo(String value) {
            addCriterion("from_id <=", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdLike(String value) {
            addCriterion("from_id like", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdNotLike(String value) {
            addCriterion("from_id not like", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdIn(List<String> values) {
            addCriterion("from_id in", values, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdNotIn(List<String> values) {
            addCriterion("from_id not in", values, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdBetween(String value1, String value2) {
            addCriterion("from_id between", value1, value2, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdNotBetween(String value1, String value2) {
            addCriterion("from_id not between", value1, value2, "fromId");
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

        public Criteria andFromAppkeyIsNull() {
            addCriterion("from_appkey is null");
            return (Criteria) this;
        }

        public Criteria andFromAppkeyIsNotNull() {
            addCriterion("from_appkey is not null");
            return (Criteria) this;
        }

        public Criteria andFromAppkeyEqualTo(String value) {
            addCriterion("from_appkey =", value, "fromAppkey");
            return (Criteria) this;
        }

        public Criteria andFromAppkeyNotEqualTo(String value) {
            addCriterion("from_appkey <>", value, "fromAppkey");
            return (Criteria) this;
        }

        public Criteria andFromAppkeyGreaterThan(String value) {
            addCriterion("from_appkey >", value, "fromAppkey");
            return (Criteria) this;
        }

        public Criteria andFromAppkeyGreaterThanOrEqualTo(String value) {
            addCriterion("from_appkey >=", value, "fromAppkey");
            return (Criteria) this;
        }

        public Criteria andFromAppkeyLessThan(String value) {
            addCriterion("from_appkey <", value, "fromAppkey");
            return (Criteria) this;
        }

        public Criteria andFromAppkeyLessThanOrEqualTo(String value) {
            addCriterion("from_appkey <=", value, "fromAppkey");
            return (Criteria) this;
        }

        public Criteria andFromAppkeyLike(String value) {
            addCriterion("from_appkey like", value, "fromAppkey");
            return (Criteria) this;
        }

        public Criteria andFromAppkeyNotLike(String value) {
            addCriterion("from_appkey not like", value, "fromAppkey");
            return (Criteria) this;
        }

        public Criteria andFromAppkeyIn(List<String> values) {
            addCriterion("from_appkey in", values, "fromAppkey");
            return (Criteria) this;
        }

        public Criteria andFromAppkeyNotIn(List<String> values) {
            addCriterion("from_appkey not in", values, "fromAppkey");
            return (Criteria) this;
        }

        public Criteria andFromAppkeyBetween(String value1, String value2) {
            addCriterion("from_appkey between", value1, value2, "fromAppkey");
            return (Criteria) this;
        }

        public Criteria andFromAppkeyNotBetween(String value1, String value2) {
            addCriterion("from_appkey not between", value1, value2, "fromAppkey");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIsNull() {
            addCriterion("target_type is null");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIsNotNull() {
            addCriterion("target_type is not null");
            return (Criteria) this;
        }

        public Criteria andTargetTypeEqualTo(String value) {
            addCriterion("target_type =", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotEqualTo(String value) {
            addCriterion("target_type <>", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeGreaterThan(String value) {
            addCriterion("target_type >", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeGreaterThanOrEqualTo(String value) {
            addCriterion("target_type >=", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeLessThan(String value) {
            addCriterion("target_type <", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeLessThanOrEqualTo(String value) {
            addCriterion("target_type <=", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeLike(String value) {
            addCriterion("target_type like", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotLike(String value) {
            addCriterion("target_type not like", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIn(List<String> values) {
            addCriterion("target_type in", values, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotIn(List<String> values) {
            addCriterion("target_type not in", values, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeBetween(String value1, String value2) {
            addCriterion("target_type between", value1, value2, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotBetween(String value1, String value2) {
            addCriterion("target_type not between", value1, value2, "targetType");
            return (Criteria) this;
        }

        public Criteria andMsgExtrasIsNull() {
            addCriterion("msg_extras is null");
            return (Criteria) this;
        }

        public Criteria andMsgExtrasIsNotNull() {
            addCriterion("msg_extras is not null");
            return (Criteria) this;
        }

        public Criteria andMsgExtrasEqualTo(String value) {
            addCriterion("msg_extras =", value, "msgExtras");
            return (Criteria) this;
        }

        public Criteria andMsgExtrasNotEqualTo(String value) {
            addCriterion("msg_extras <>", value, "msgExtras");
            return (Criteria) this;
        }

        public Criteria andMsgExtrasGreaterThan(String value) {
            addCriterion("msg_extras >", value, "msgExtras");
            return (Criteria) this;
        }

        public Criteria andMsgExtrasGreaterThanOrEqualTo(String value) {
            addCriterion("msg_extras >=", value, "msgExtras");
            return (Criteria) this;
        }

        public Criteria andMsgExtrasLessThan(String value) {
            addCriterion("msg_extras <", value, "msgExtras");
            return (Criteria) this;
        }

        public Criteria andMsgExtrasLessThanOrEqualTo(String value) {
            addCriterion("msg_extras <=", value, "msgExtras");
            return (Criteria) this;
        }

        public Criteria andMsgExtrasLike(String value) {
            addCriterion("msg_extras like", value, "msgExtras");
            return (Criteria) this;
        }

        public Criteria andMsgExtrasNotLike(String value) {
            addCriterion("msg_extras not like", value, "msgExtras");
            return (Criteria) this;
        }

        public Criteria andMsgExtrasIn(List<String> values) {
            addCriterion("msg_extras in", values, "msgExtras");
            return (Criteria) this;
        }

        public Criteria andMsgExtrasNotIn(List<String> values) {
            addCriterion("msg_extras not in", values, "msgExtras");
            return (Criteria) this;
        }

        public Criteria andMsgExtrasBetween(String value1, String value2) {
            addCriterion("msg_extras between", value1, value2, "msgExtras");
            return (Criteria) this;
        }

        public Criteria andMsgExtrasNotBetween(String value1, String value2) {
            addCriterion("msg_extras not between", value1, value2, "msgExtras");
            return (Criteria) this;
        }

        public Criteria andMsgTextIsNull() {
            addCriterion("msg_text is null");
            return (Criteria) this;
        }

        public Criteria andMsgTextIsNotNull() {
            addCriterion("msg_text is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTextEqualTo(String value) {
            addCriterion("msg_text =", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextNotEqualTo(String value) {
            addCriterion("msg_text <>", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextGreaterThan(String value) {
            addCriterion("msg_text >", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextGreaterThanOrEqualTo(String value) {
            addCriterion("msg_text >=", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextLessThan(String value) {
            addCriterion("msg_text <", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextLessThanOrEqualTo(String value) {
            addCriterion("msg_text <=", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextLike(String value) {
            addCriterion("msg_text like", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextNotLike(String value) {
            addCriterion("msg_text not like", value, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextIn(List<String> values) {
            addCriterion("msg_text in", values, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextNotIn(List<String> values) {
            addCriterion("msg_text not in", values, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextBetween(String value1, String value2) {
            addCriterion("msg_text between", value1, value2, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTextNotBetween(String value1, String value2) {
            addCriterion("msg_text not between", value1, value2, "msgText");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNull() {
            addCriterion("msg_type is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNotNull() {
            addCriterion("msg_type is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeEqualTo(String value) {
            addCriterion("msg_type =", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotEqualTo(String value) {
            addCriterion("msg_type <>", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThan(String value) {
            addCriterion("msg_type >", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("msg_type >=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThan(String value) {
            addCriterion("msg_type <", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThanOrEqualTo(String value) {
            addCriterion("msg_type <=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLike(String value) {
            addCriterion("msg_type like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotLike(String value) {
            addCriterion("msg_type not like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIn(List<String> values) {
            addCriterion("msg_type in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotIn(List<String> values) {
            addCriterion("msg_type not in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeBetween(String value1, String value2) {
            addCriterion("msg_type between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotBetween(String value1, String value2) {
            addCriterion("msg_type not between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgRichmediaPathIsNull() {
            addCriterion("msg_richmedia_path is null");
            return (Criteria) this;
        }

        public Criteria andMsgRichmediaPathIsNotNull() {
            addCriterion("msg_richmedia_path is not null");
            return (Criteria) this;
        }

        public Criteria andMsgRichmediaPathEqualTo(String value) {
            addCriterion("msg_richmedia_path =", value, "msgRichmediaPath");
            return (Criteria) this;
        }

        public Criteria andMsgRichmediaPathNotEqualTo(String value) {
            addCriterion("msg_richmedia_path <>", value, "msgRichmediaPath");
            return (Criteria) this;
        }

        public Criteria andMsgRichmediaPathGreaterThan(String value) {
            addCriterion("msg_richmedia_path >", value, "msgRichmediaPath");
            return (Criteria) this;
        }

        public Criteria andMsgRichmediaPathGreaterThanOrEqualTo(String value) {
            addCriterion("msg_richmedia_path >=", value, "msgRichmediaPath");
            return (Criteria) this;
        }

        public Criteria andMsgRichmediaPathLessThan(String value) {
            addCriterion("msg_richmedia_path <", value, "msgRichmediaPath");
            return (Criteria) this;
        }

        public Criteria andMsgRichmediaPathLessThanOrEqualTo(String value) {
            addCriterion("msg_richmedia_path <=", value, "msgRichmediaPath");
            return (Criteria) this;
        }

        public Criteria andMsgRichmediaPathLike(String value) {
            addCriterion("msg_richmedia_path like", value, "msgRichmediaPath");
            return (Criteria) this;
        }

        public Criteria andMsgRichmediaPathNotLike(String value) {
            addCriterion("msg_richmedia_path not like", value, "msgRichmediaPath");
            return (Criteria) this;
        }

        public Criteria andMsgRichmediaPathIn(List<String> values) {
            addCriterion("msg_richmedia_path in", values, "msgRichmediaPath");
            return (Criteria) this;
        }

        public Criteria andMsgRichmediaPathNotIn(List<String> values) {
            addCriterion("msg_richmedia_path not in", values, "msgRichmediaPath");
            return (Criteria) this;
        }

        public Criteria andMsgRichmediaPathBetween(String value1, String value2) {
            addCriterion("msg_richmedia_path between", value1, value2, "msgRichmediaPath");
            return (Criteria) this;
        }

        public Criteria andMsgRichmediaPathNotBetween(String value1, String value2) {
            addCriterion("msg_richmedia_path not between", value1, value2, "msgRichmediaPath");
            return (Criteria) this;
        }

        public Criteria andLocalRechmediaPathIsNull() {
            addCriterion("local_rechmedia_path is null");
            return (Criteria) this;
        }

        public Criteria andLocalRechmediaPathIsNotNull() {
            addCriterion("local_rechmedia_path is not null");
            return (Criteria) this;
        }

        public Criteria andLocalRechmediaPathEqualTo(String value) {
            addCriterion("local_rechmedia_path =", value, "localRechmediaPath");
            return (Criteria) this;
        }

        public Criteria andLocalRechmediaPathNotEqualTo(String value) {
            addCriterion("local_rechmedia_path <>", value, "localRechmediaPath");
            return (Criteria) this;
        }

        public Criteria andLocalRechmediaPathGreaterThan(String value) {
            addCriterion("local_rechmedia_path >", value, "localRechmediaPath");
            return (Criteria) this;
        }

        public Criteria andLocalRechmediaPathGreaterThanOrEqualTo(String value) {
            addCriterion("local_rechmedia_path >=", value, "localRechmediaPath");
            return (Criteria) this;
        }

        public Criteria andLocalRechmediaPathLessThan(String value) {
            addCriterion("local_rechmedia_path <", value, "localRechmediaPath");
            return (Criteria) this;
        }

        public Criteria andLocalRechmediaPathLessThanOrEqualTo(String value) {
            addCriterion("local_rechmedia_path <=", value, "localRechmediaPath");
            return (Criteria) this;
        }

        public Criteria andLocalRechmediaPathLike(String value) {
            addCriterion("local_rechmedia_path like", value, "localRechmediaPath");
            return (Criteria) this;
        }

        public Criteria andLocalRechmediaPathNotLike(String value) {
            addCriterion("local_rechmedia_path not like", value, "localRechmediaPath");
            return (Criteria) this;
        }

        public Criteria andLocalRechmediaPathIn(List<String> values) {
            addCriterion("local_rechmedia_path in", values, "localRechmediaPath");
            return (Criteria) this;
        }

        public Criteria andLocalRechmediaPathNotIn(List<String> values) {
            addCriterion("local_rechmedia_path not in", values, "localRechmediaPath");
            return (Criteria) this;
        }

        public Criteria andLocalRechmediaPathBetween(String value1, String value2) {
            addCriterion("local_rechmedia_path between", value1, value2, "localRechmediaPath");
            return (Criteria) this;
        }

        public Criteria andLocalRechmediaPathNotBetween(String value1, String value2) {
            addCriterion("local_rechmedia_path not between", value1, value2, "localRechmediaPath");
            return (Criteria) this;
        }

        public Criteria andFromPlatformIsNull() {
            addCriterion("from_platform is null");
            return (Criteria) this;
        }

        public Criteria andFromPlatformIsNotNull() {
            addCriterion("from_platform is not null");
            return (Criteria) this;
        }

        public Criteria andFromPlatformEqualTo(String value) {
            addCriterion("from_platform =", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNotEqualTo(String value) {
            addCriterion("from_platform <>", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformGreaterThan(String value) {
            addCriterion("from_platform >", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("from_platform >=", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformLessThan(String value) {
            addCriterion("from_platform <", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformLessThanOrEqualTo(String value) {
            addCriterion("from_platform <=", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformLike(String value) {
            addCriterion("from_platform like", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNotLike(String value) {
            addCriterion("from_platform not like", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformIn(List<String> values) {
            addCriterion("from_platform in", values, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNotIn(List<String> values) {
            addCriterion("from_platform not in", values, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformBetween(String value1, String value2) {
            addCriterion("from_platform between", value1, value2, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNotBetween(String value1, String value2) {
            addCriterion("from_platform not between", value1, value2, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andTargetIdIsNull() {
            addCriterion("target_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetIdIsNotNull() {
            addCriterion("target_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetIdEqualTo(String value) {
            addCriterion("target_id =", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotEqualTo(String value) {
            addCriterion("target_id <>", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThan(String value) {
            addCriterion("target_id >", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThanOrEqualTo(String value) {
            addCriterion("target_id >=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThan(String value) {
            addCriterion("target_id <", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThanOrEqualTo(String value) {
            addCriterion("target_id <=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLike(String value) {
            addCriterion("target_id like", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotLike(String value) {
            addCriterion("target_id not like", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdIn(List<String> values) {
            addCriterion("target_id in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotIn(List<String> values) {
            addCriterion("target_id not in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdBetween(String value1, String value2) {
            addCriterion("target_id between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotBetween(String value1, String value2) {
            addCriterion("target_id not between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andMsgidIsNull() {
            addCriterion("msgid is null");
            return (Criteria) this;
        }

        public Criteria andMsgidIsNotNull() {
            addCriterion("msgid is not null");
            return (Criteria) this;
        }

        public Criteria andMsgidEqualTo(String value) {
            addCriterion("msgid =", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotEqualTo(String value) {
            addCriterion("msgid <>", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidGreaterThan(String value) {
            addCriterion("msgid >", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidGreaterThanOrEqualTo(String value) {
            addCriterion("msgid >=", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidLessThan(String value) {
            addCriterion("msgid <", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidLessThanOrEqualTo(String value) {
            addCriterion("msgid <=", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidLike(String value) {
            addCriterion("msgid like", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotLike(String value) {
            addCriterion("msgid not like", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidIn(List<String> values) {
            addCriterion("msgid in", values, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotIn(List<String> values) {
            addCriterion("msgid not in", values, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidBetween(String value1, String value2) {
            addCriterion("msgid between", value1, value2, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotBetween(String value1, String value2) {
            addCriterion("msgid not between", value1, value2, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgCtimeIsNull() {
            addCriterion("msg_ctime is null");
            return (Criteria) this;
        }

        public Criteria andMsgCtimeIsNotNull() {
            addCriterion("msg_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andMsgCtimeEqualTo(Date value) {
            addCriterion("msg_ctime =", value, "msgCtime");
            return (Criteria) this;
        }

        public Criteria andMsgCtimeNotEqualTo(Date value) {
            addCriterion("msg_ctime <>", value, "msgCtime");
            return (Criteria) this;
        }

        public Criteria andMsgCtimeGreaterThan(Date value) {
            addCriterion("msg_ctime >", value, "msgCtime");
            return (Criteria) this;
        }

        public Criteria andMsgCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("msg_ctime >=", value, "msgCtime");
            return (Criteria) this;
        }

        public Criteria andMsgCtimeLessThan(Date value) {
            addCriterion("msg_ctime <", value, "msgCtime");
            return (Criteria) this;
        }

        public Criteria andMsgCtimeLessThanOrEqualTo(Date value) {
            addCriterion("msg_ctime <=", value, "msgCtime");
            return (Criteria) this;
        }

        public Criteria andMsgCtimeIn(List<Date> values) {
            addCriterion("msg_ctime in", values, "msgCtime");
            return (Criteria) this;
        }

        public Criteria andMsgCtimeNotIn(List<Date> values) {
            addCriterion("msg_ctime not in", values, "msgCtime");
            return (Criteria) this;
        }

        public Criteria andMsgCtimeBetween(Date value1, Date value2) {
            addCriterion("msg_ctime between", value1, value2, "msgCtime");
            return (Criteria) this;
        }

        public Criteria andMsgCtimeNotBetween(Date value1, Date value2) {
            addCriterion("msg_ctime not between", value1, value2, "msgCtime");
            return (Criteria) this;
        }

        public Criteria andMsgLevelIsNull() {
            addCriterion("msg_level is null");
            return (Criteria) this;
        }

        public Criteria andMsgLevelIsNotNull() {
            addCriterion("msg_level is not null");
            return (Criteria) this;
        }

        public Criteria andMsgLevelEqualTo(String value) {
            addCriterion("msg_level =", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNotEqualTo(String value) {
            addCriterion("msg_level <>", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelGreaterThan(String value) {
            addCriterion("msg_level >", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelGreaterThanOrEqualTo(String value) {
            addCriterion("msg_level >=", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelLessThan(String value) {
            addCriterion("msg_level <", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelLessThanOrEqualTo(String value) {
            addCriterion("msg_level <=", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelLike(String value) {
            addCriterion("msg_level like", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNotLike(String value) {
            addCriterion("msg_level not like", value, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelIn(List<String> values) {
            addCriterion("msg_level in", values, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNotIn(List<String> values) {
            addCriterion("msg_level not in", values, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelBetween(String value1, String value2) {
            addCriterion("msg_level between", value1, value2, "msgLevel");
            return (Criteria) this;
        }

        public Criteria andMsgLevelNotBetween(String value1, String value2) {
            addCriterion("msg_level not between", value1, value2, "msgLevel");
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