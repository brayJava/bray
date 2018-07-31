package com.whiteplanet.mapper.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppOrderExample() {
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andMRecordIdIsNull() {
            addCriterion("m_record_id is null");
            return (Criteria) this;
        }

        public Criteria andMRecordIdIsNotNull() {
            addCriterion("m_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andMRecordIdEqualTo(String value) {
            addCriterion("m_record_id =", value, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdNotEqualTo(String value) {
            addCriterion("m_record_id <>", value, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdGreaterThan(String value) {
            addCriterion("m_record_id >", value, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("m_record_id >=", value, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdLessThan(String value) {
            addCriterion("m_record_id <", value, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdLessThanOrEqualTo(String value) {
            addCriterion("m_record_id <=", value, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdLike(String value) {
            addCriterion("m_record_id like", value, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdNotLike(String value) {
            addCriterion("m_record_id not like", value, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdIn(List<String> values) {
            addCriterion("m_record_id in", values, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdNotIn(List<String> values) {
            addCriterion("m_record_id not in", values, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdBetween(String value1, String value2) {
            addCriterion("m_record_id between", value1, value2, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdNotBetween(String value1, String value2) {
            addCriterion("m_record_id not between", value1, value2, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andVisitPersonIdIsNull() {
            addCriterion("visit_person_id is null");
            return (Criteria) this;
        }

        public Criteria andVisitPersonIdIsNotNull() {
            addCriterion("visit_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andVisitPersonIdEqualTo(String value) {
            addCriterion("visit_person_id =", value, "visitPersonId");
            return (Criteria) this;
        }

        public Criteria andVisitPersonIdNotEqualTo(String value) {
            addCriterion("visit_person_id <>", value, "visitPersonId");
            return (Criteria) this;
        }

        public Criteria andVisitPersonIdGreaterThan(String value) {
            addCriterion("visit_person_id >", value, "visitPersonId");
            return (Criteria) this;
        }

        public Criteria andVisitPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("visit_person_id >=", value, "visitPersonId");
            return (Criteria) this;
        }

        public Criteria andVisitPersonIdLessThan(String value) {
            addCriterion("visit_person_id <", value, "visitPersonId");
            return (Criteria) this;
        }

        public Criteria andVisitPersonIdLessThanOrEqualTo(String value) {
            addCriterion("visit_person_id <=", value, "visitPersonId");
            return (Criteria) this;
        }

        public Criteria andVisitPersonIdLike(String value) {
            addCriterion("visit_person_id like", value, "visitPersonId");
            return (Criteria) this;
        }

        public Criteria andVisitPersonIdNotLike(String value) {
            addCriterion("visit_person_id not like", value, "visitPersonId");
            return (Criteria) this;
        }

        public Criteria andVisitPersonIdIn(List<String> values) {
            addCriterion("visit_person_id in", values, "visitPersonId");
            return (Criteria) this;
        }

        public Criteria andVisitPersonIdNotIn(List<String> values) {
            addCriterion("visit_person_id not in", values, "visitPersonId");
            return (Criteria) this;
        }

        public Criteria andVisitPersonIdBetween(String value1, String value2) {
            addCriterion("visit_person_id between", value1, value2, "visitPersonId");
            return (Criteria) this;
        }

        public Criteria andVisitPersonIdNotBetween(String value1, String value2) {
            addCriterion("visit_person_id not between", value1, value2, "visitPersonId");
            return (Criteria) this;
        }

        public Criteria andInspectStartDateIsNull() {
            addCriterion("inspect_start_date is null");
            return (Criteria) this;
        }

        public Criteria andInspectStartDateIsNotNull() {
            addCriterion("inspect_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andInspectStartDateEqualTo(Date value) {
            addCriterion("inspect_start_date =", value, "inspectStartDate");
            return (Criteria) this;
        }

        public Criteria andInspectStartDateNotEqualTo(Date value) {
            addCriterion("inspect_start_date <>", value, "inspectStartDate");
            return (Criteria) this;
        }

        public Criteria andInspectStartDateGreaterThan(Date value) {
            addCriterion("inspect_start_date >", value, "inspectStartDate");
            return (Criteria) this;
        }

        public Criteria andInspectStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("inspect_start_date >=", value, "inspectStartDate");
            return (Criteria) this;
        }

        public Criteria andInspectStartDateLessThan(Date value) {
            addCriterion("inspect_start_date <", value, "inspectStartDate");
            return (Criteria) this;
        }

        public Criteria andInspectStartDateLessThanOrEqualTo(Date value) {
            addCriterion("inspect_start_date <=", value, "inspectStartDate");
            return (Criteria) this;
        }

        public Criteria andInspectStartDateIn(List<Date> values) {
            addCriterion("inspect_start_date in", values, "inspectStartDate");
            return (Criteria) this;
        }

        public Criteria andInspectStartDateNotIn(List<Date> values) {
            addCriterion("inspect_start_date not in", values, "inspectStartDate");
            return (Criteria) this;
        }

        public Criteria andInspectStartDateBetween(Date value1, Date value2) {
            addCriterion("inspect_start_date between", value1, value2, "inspectStartDate");
            return (Criteria) this;
        }

        public Criteria andInspectStartDateNotBetween(Date value1, Date value2) {
            addCriterion("inspect_start_date not between", value1, value2, "inspectStartDate");
            return (Criteria) this;
        }

        public Criteria andInspectEndDateIsNull() {
            addCriterion("inspect_end_date is null");
            return (Criteria) this;
        }

        public Criteria andInspectEndDateIsNotNull() {
            addCriterion("inspect_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andInspectEndDateEqualTo(Date value) {
            addCriterion("inspect_end_date =", value, "inspectEndDate");
            return (Criteria) this;
        }

        public Criteria andInspectEndDateNotEqualTo(Date value) {
            addCriterion("inspect_end_date <>", value, "inspectEndDate");
            return (Criteria) this;
        }

        public Criteria andInspectEndDateGreaterThan(Date value) {
            addCriterion("inspect_end_date >", value, "inspectEndDate");
            return (Criteria) this;
        }

        public Criteria andInspectEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("inspect_end_date >=", value, "inspectEndDate");
            return (Criteria) this;
        }

        public Criteria andInspectEndDateLessThan(Date value) {
            addCriterion("inspect_end_date <", value, "inspectEndDate");
            return (Criteria) this;
        }

        public Criteria andInspectEndDateLessThanOrEqualTo(Date value) {
            addCriterion("inspect_end_date <=", value, "inspectEndDate");
            return (Criteria) this;
        }

        public Criteria andInspectEndDateIn(List<Date> values) {
            addCriterion("inspect_end_date in", values, "inspectEndDate");
            return (Criteria) this;
        }

        public Criteria andInspectEndDateNotIn(List<Date> values) {
            addCriterion("inspect_end_date not in", values, "inspectEndDate");
            return (Criteria) this;
        }

        public Criteria andInspectEndDateBetween(Date value1, Date value2) {
            addCriterion("inspect_end_date between", value1, value2, "inspectEndDate");
            return (Criteria) this;
        }

        public Criteria andInspectEndDateNotBetween(Date value1, Date value2) {
            addCriterion("inspect_end_date not between", value1, value2, "inspectEndDate");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCityIsNull() {
            addCriterion("inspect_check_city is null");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCityIsNotNull() {
            addCriterion("inspect_check_city is not null");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCityEqualTo(String value) {
            addCriterion("inspect_check_city =", value, "inspectCheckCity");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCityNotEqualTo(String value) {
            addCriterion("inspect_check_city <>", value, "inspectCheckCity");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCityGreaterThan(String value) {
            addCriterion("inspect_check_city >", value, "inspectCheckCity");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCityGreaterThanOrEqualTo(String value) {
            addCriterion("inspect_check_city >=", value, "inspectCheckCity");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCityLessThan(String value) {
            addCriterion("inspect_check_city <", value, "inspectCheckCity");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCityLessThanOrEqualTo(String value) {
            addCriterion("inspect_check_city <=", value, "inspectCheckCity");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCityLike(String value) {
            addCriterion("inspect_check_city like", value, "inspectCheckCity");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCityNotLike(String value) {
            addCriterion("inspect_check_city not like", value, "inspectCheckCity");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCityIn(List<String> values) {
            addCriterion("inspect_check_city in", values, "inspectCheckCity");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCityNotIn(List<String> values) {
            addCriterion("inspect_check_city not in", values, "inspectCheckCity");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCityBetween(String value1, String value2) {
            addCriterion("inspect_check_city between", value1, value2, "inspectCheckCity");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCityNotBetween(String value1, String value2) {
            addCriterion("inspect_check_city not between", value1, value2, "inspectCheckCity");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCostIsNull() {
            addCriterion("inspect_check_cost is null");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCostIsNotNull() {
            addCriterion("inspect_check_cost is not null");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCostEqualTo(Long value) {
            addCriterion("inspect_check_cost =", value, "inspectCheckCost");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCostNotEqualTo(Long value) {
            addCriterion("inspect_check_cost <>", value, "inspectCheckCost");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCostGreaterThan(Long value) {
            addCriterion("inspect_check_cost >", value, "inspectCheckCost");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCostGreaterThanOrEqualTo(Long value) {
            addCriterion("inspect_check_cost >=", value, "inspectCheckCost");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCostLessThan(Long value) {
            addCriterion("inspect_check_cost <", value, "inspectCheckCost");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCostLessThanOrEqualTo(Long value) {
            addCriterion("inspect_check_cost <=", value, "inspectCheckCost");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCostIn(List<Long> values) {
            addCriterion("inspect_check_cost in", values, "inspectCheckCost");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCostNotIn(List<Long> values) {
            addCriterion("inspect_check_cost not in", values, "inspectCheckCost");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCostBetween(Long value1, Long value2) {
            addCriterion("inspect_check_cost between", value1, value2, "inspectCheckCost");
            return (Criteria) this;
        }

        public Criteria andInspectCheckCostNotBetween(Long value1, Long value2) {
            addCriterion("inspect_check_cost not between", value1, value2, "inspectCheckCost");
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

        public Criteria andTransDocIdIsNull() {
            addCriterion("trans_doc_id is null");
            return (Criteria) this;
        }

        public Criteria andTransDocIdIsNotNull() {
            addCriterion("trans_doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransDocIdEqualTo(String value) {
            addCriterion("trans_doc_id =", value, "transDocId");
            return (Criteria) this;
        }

        public Criteria andTransDocIdNotEqualTo(String value) {
            addCriterion("trans_doc_id <>", value, "transDocId");
            return (Criteria) this;
        }

        public Criteria andTransDocIdGreaterThan(String value) {
            addCriterion("trans_doc_id >", value, "transDocId");
            return (Criteria) this;
        }

        public Criteria andTransDocIdGreaterThanOrEqualTo(String value) {
            addCriterion("trans_doc_id >=", value, "transDocId");
            return (Criteria) this;
        }

        public Criteria andTransDocIdLessThan(String value) {
            addCriterion("trans_doc_id <", value, "transDocId");
            return (Criteria) this;
        }

        public Criteria andTransDocIdLessThanOrEqualTo(String value) {
            addCriterion("trans_doc_id <=", value, "transDocId");
            return (Criteria) this;
        }

        public Criteria andTransDocIdLike(String value) {
            addCriterion("trans_doc_id like", value, "transDocId");
            return (Criteria) this;
        }

        public Criteria andTransDocIdNotLike(String value) {
            addCriterion("trans_doc_id not like", value, "transDocId");
            return (Criteria) this;
        }

        public Criteria andTransDocIdIn(List<String> values) {
            addCriterion("trans_doc_id in", values, "transDocId");
            return (Criteria) this;
        }

        public Criteria andTransDocIdNotIn(List<String> values) {
            addCriterion("trans_doc_id not in", values, "transDocId");
            return (Criteria) this;
        }

        public Criteria andTransDocIdBetween(String value1, String value2) {
            addCriterion("trans_doc_id between", value1, value2, "transDocId");
            return (Criteria) this;
        }

        public Criteria andTransDocIdNotBetween(String value1, String value2) {
            addCriterion("trans_doc_id not between", value1, value2, "transDocId");
            return (Criteria) this;
        }

        public Criteria andTransDocNameIsNull() {
            addCriterion("trans_doc_name is null");
            return (Criteria) this;
        }

        public Criteria andTransDocNameIsNotNull() {
            addCriterion("trans_doc_name is not null");
            return (Criteria) this;
        }

        public Criteria andTransDocNameEqualTo(String value) {
            addCriterion("trans_doc_name =", value, "transDocName");
            return (Criteria) this;
        }

        public Criteria andTransDocNameNotEqualTo(String value) {
            addCriterion("trans_doc_name <>", value, "transDocName");
            return (Criteria) this;
        }

        public Criteria andTransDocNameGreaterThan(String value) {
            addCriterion("trans_doc_name >", value, "transDocName");
            return (Criteria) this;
        }

        public Criteria andTransDocNameGreaterThanOrEqualTo(String value) {
            addCriterion("trans_doc_name >=", value, "transDocName");
            return (Criteria) this;
        }

        public Criteria andTransDocNameLessThan(String value) {
            addCriterion("trans_doc_name <", value, "transDocName");
            return (Criteria) this;
        }

        public Criteria andTransDocNameLessThanOrEqualTo(String value) {
            addCriterion("trans_doc_name <=", value, "transDocName");
            return (Criteria) this;
        }

        public Criteria andTransDocNameLike(String value) {
            addCriterion("trans_doc_name like", value, "transDocName");
            return (Criteria) this;
        }

        public Criteria andTransDocNameNotLike(String value) {
            addCriterion("trans_doc_name not like", value, "transDocName");
            return (Criteria) this;
        }

        public Criteria andTransDocNameIn(List<String> values) {
            addCriterion("trans_doc_name in", values, "transDocName");
            return (Criteria) this;
        }

        public Criteria andTransDocNameNotIn(List<String> values) {
            addCriterion("trans_doc_name not in", values, "transDocName");
            return (Criteria) this;
        }

        public Criteria andTransDocNameBetween(String value1, String value2) {
            addCriterion("trans_doc_name between", value1, value2, "transDocName");
            return (Criteria) this;
        }

        public Criteria andTransDocNameNotBetween(String value1, String value2) {
            addCriterion("trans_doc_name not between", value1, value2, "transDocName");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNull() {
            addCriterion("trans_date is null");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNotNull() {
            addCriterion("trans_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransDateEqualTo(Date value) {
            addCriterion("trans_date =", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotEqualTo(Date value) {
            addCriterion("trans_date <>", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThan(Date value) {
            addCriterion("trans_date >", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThanOrEqualTo(Date value) {
            addCriterion("trans_date >=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThan(Date value) {
            addCriterion("trans_date <", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThanOrEqualTo(Date value) {
            addCriterion("trans_date <=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateIn(List<Date> values) {
            addCriterion("trans_date in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotIn(List<Date> values) {
            addCriterion("trans_date not in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateBetween(Date value1, Date value2) {
            addCriterion("trans_date between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotBetween(Date value1, Date value2) {
            addCriterion("trans_date not between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDocIdIsNull() {
            addCriterion("receive_doc_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDocIdIsNotNull() {
            addCriterion("receive_doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDocIdEqualTo(String value) {
            addCriterion("receive_doc_id =", value, "receiveDocId");
            return (Criteria) this;
        }

        public Criteria andReceiveDocIdNotEqualTo(String value) {
            addCriterion("receive_doc_id <>", value, "receiveDocId");
            return (Criteria) this;
        }

        public Criteria andReceiveDocIdGreaterThan(String value) {
            addCriterion("receive_doc_id >", value, "receiveDocId");
            return (Criteria) this;
        }

        public Criteria andReceiveDocIdGreaterThanOrEqualTo(String value) {
            addCriterion("receive_doc_id >=", value, "receiveDocId");
            return (Criteria) this;
        }

        public Criteria andReceiveDocIdLessThan(String value) {
            addCriterion("receive_doc_id <", value, "receiveDocId");
            return (Criteria) this;
        }

        public Criteria andReceiveDocIdLessThanOrEqualTo(String value) {
            addCriterion("receive_doc_id <=", value, "receiveDocId");
            return (Criteria) this;
        }

        public Criteria andReceiveDocIdLike(String value) {
            addCriterion("receive_doc_id like", value, "receiveDocId");
            return (Criteria) this;
        }

        public Criteria andReceiveDocIdNotLike(String value) {
            addCriterion("receive_doc_id not like", value, "receiveDocId");
            return (Criteria) this;
        }

        public Criteria andReceiveDocIdIn(List<String> values) {
            addCriterion("receive_doc_id in", values, "receiveDocId");
            return (Criteria) this;
        }

        public Criteria andReceiveDocIdNotIn(List<String> values) {
            addCriterion("receive_doc_id not in", values, "receiveDocId");
            return (Criteria) this;
        }

        public Criteria andReceiveDocIdBetween(String value1, String value2) {
            addCriterion("receive_doc_id between", value1, value2, "receiveDocId");
            return (Criteria) this;
        }

        public Criteria andReceiveDocIdNotBetween(String value1, String value2) {
            addCriterion("receive_doc_id not between", value1, value2, "receiveDocId");
            return (Criteria) this;
        }

        public Criteria andReceiveDocNameIsNull() {
            addCriterion("receive_doc_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDocNameIsNotNull() {
            addCriterion("receive_doc_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDocNameEqualTo(String value) {
            addCriterion("receive_doc_name =", value, "receiveDocName");
            return (Criteria) this;
        }

        public Criteria andReceiveDocNameNotEqualTo(String value) {
            addCriterion("receive_doc_name <>", value, "receiveDocName");
            return (Criteria) this;
        }

        public Criteria andReceiveDocNameGreaterThan(String value) {
            addCriterion("receive_doc_name >", value, "receiveDocName");
            return (Criteria) this;
        }

        public Criteria andReceiveDocNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_doc_name >=", value, "receiveDocName");
            return (Criteria) this;
        }

        public Criteria andReceiveDocNameLessThan(String value) {
            addCriterion("receive_doc_name <", value, "receiveDocName");
            return (Criteria) this;
        }

        public Criteria andReceiveDocNameLessThanOrEqualTo(String value) {
            addCriterion("receive_doc_name <=", value, "receiveDocName");
            return (Criteria) this;
        }

        public Criteria andReceiveDocNameLike(String value) {
            addCriterion("receive_doc_name like", value, "receiveDocName");
            return (Criteria) this;
        }

        public Criteria andReceiveDocNameNotLike(String value) {
            addCriterion("receive_doc_name not like", value, "receiveDocName");
            return (Criteria) this;
        }

        public Criteria andReceiveDocNameIn(List<String> values) {
            addCriterion("receive_doc_name in", values, "receiveDocName");
            return (Criteria) this;
        }

        public Criteria andReceiveDocNameNotIn(List<String> values) {
            addCriterion("receive_doc_name not in", values, "receiveDocName");
            return (Criteria) this;
        }

        public Criteria andReceiveDocNameBetween(String value1, String value2) {
            addCriterion("receive_doc_name between", value1, value2, "receiveDocName");
            return (Criteria) this;
        }

        public Criteria andReceiveDocNameNotBetween(String value1, String value2) {
            addCriterion("receive_doc_name not between", value1, value2, "receiveDocName");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNull() {
            addCriterion("receive_date is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNotNull() {
            addCriterion("receive_date is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateEqualTo(Date value) {
            addCriterion("receive_date =", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotEqualTo(Date value) {
            addCriterion("receive_date <>", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThan(Date value) {
            addCriterion("receive_date >", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_date >=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThan(Date value) {
            addCriterion("receive_date <", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThanOrEqualTo(Date value) {
            addCriterion("receive_date <=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIn(List<Date> values) {
            addCriterion("receive_date in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotIn(List<Date> values) {
            addCriterion("receive_date not in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateBetween(Date value1, Date value2) {
            addCriterion("receive_date between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotBetween(Date value1, Date value2) {
            addCriterion("receive_date not between", value1, value2, "receiveDate");
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

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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