package com.whiteplanet.mapper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReceiveDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiveDetailExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andOutpatientTypeIsNull() {
            addCriterion("outpatient_type is null");
            return (Criteria) this;
        }

        public Criteria andOutpatientTypeIsNotNull() {
            addCriterion("outpatient_type is not null");
            return (Criteria) this;
        }

        public Criteria andOutpatientTypeEqualTo(Integer value) {
            addCriterion("outpatient_type =", value, "outpatientType");
            return (Criteria) this;
        }

        public Criteria andOutpatientTypeNotEqualTo(Integer value) {
            addCriterion("outpatient_type <>", value, "outpatientType");
            return (Criteria) this;
        }

        public Criteria andOutpatientTypeGreaterThan(Integer value) {
            addCriterion("outpatient_type >", value, "outpatientType");
            return (Criteria) this;
        }

        public Criteria andOutpatientTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("outpatient_type >=", value, "outpatientType");
            return (Criteria) this;
        }

        public Criteria andOutpatientTypeLessThan(Integer value) {
            addCriterion("outpatient_type <", value, "outpatientType");
            return (Criteria) this;
        }

        public Criteria andOutpatientTypeLessThanOrEqualTo(Integer value) {
            addCriterion("outpatient_type <=", value, "outpatientType");
            return (Criteria) this;
        }

        public Criteria andOutpatientTypeIn(List<Integer> values) {
            addCriterion("outpatient_type in", values, "outpatientType");
            return (Criteria) this;
        }

        public Criteria andOutpatientTypeNotIn(List<Integer> values) {
            addCriterion("outpatient_type not in", values, "outpatientType");
            return (Criteria) this;
        }

        public Criteria andOutpatientTypeBetween(Integer value1, Integer value2) {
            addCriterion("outpatient_type between", value1, value2, "outpatientType");
            return (Criteria) this;
        }

        public Criteria andOutpatientTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("outpatient_type not between", value1, value2, "outpatientType");
            return (Criteria) this;
        }

        public Criteria andOutpatientNameIsNull() {
            addCriterion("outpatient_name is null");
            return (Criteria) this;
        }

        public Criteria andOutpatientNameIsNotNull() {
            addCriterion("outpatient_name is not null");
            return (Criteria) this;
        }

        public Criteria andOutpatientNameEqualTo(String value) {
            addCriterion("outpatient_name =", value, "outpatientName");
            return (Criteria) this;
        }

        public Criteria andOutpatientNameNotEqualTo(String value) {
            addCriterion("outpatient_name <>", value, "outpatientName");
            return (Criteria) this;
        }

        public Criteria andOutpatientNameGreaterThan(String value) {
            addCriterion("outpatient_name >", value, "outpatientName");
            return (Criteria) this;
        }

        public Criteria andOutpatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("outpatient_name >=", value, "outpatientName");
            return (Criteria) this;
        }

        public Criteria andOutpatientNameLessThan(String value) {
            addCriterion("outpatient_name <", value, "outpatientName");
            return (Criteria) this;
        }

        public Criteria andOutpatientNameLessThanOrEqualTo(String value) {
            addCriterion("outpatient_name <=", value, "outpatientName");
            return (Criteria) this;
        }

        public Criteria andOutpatientNameLike(String value) {
            addCriterion("outpatient_name like", value, "outpatientName");
            return (Criteria) this;
        }

        public Criteria andOutpatientNameNotLike(String value) {
            addCriterion("outpatient_name not like", value, "outpatientName");
            return (Criteria) this;
        }

        public Criteria andOutpatientNameIn(List<String> values) {
            addCriterion("outpatient_name in", values, "outpatientName");
            return (Criteria) this;
        }

        public Criteria andOutpatientNameNotIn(List<String> values) {
            addCriterion("outpatient_name not in", values, "outpatientName");
            return (Criteria) this;
        }

        public Criteria andOutpatientNameBetween(String value1, String value2) {
            addCriterion("outpatient_name between", value1, value2, "outpatientName");
            return (Criteria) this;
        }

        public Criteria andOutpatientNameNotBetween(String value1, String value2) {
            addCriterion("outpatient_name not between", value1, value2, "outpatientName");
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

        public Criteria andHospitalAddrIsNull() {
            addCriterion("hospital_addr is null");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrIsNotNull() {
            addCriterion("hospital_addr is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrEqualTo(String value) {
            addCriterion("hospital_addr =", value, "hospitalAddr");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrNotEqualTo(String value) {
            addCriterion("hospital_addr <>", value, "hospitalAddr");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrGreaterThan(String value) {
            addCriterion("hospital_addr >", value, "hospitalAddr");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_addr >=", value, "hospitalAddr");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrLessThan(String value) {
            addCriterion("hospital_addr <", value, "hospitalAddr");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrLessThanOrEqualTo(String value) {
            addCriterion("hospital_addr <=", value, "hospitalAddr");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrLike(String value) {
            addCriterion("hospital_addr like", value, "hospitalAddr");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrNotLike(String value) {
            addCriterion("hospital_addr not like", value, "hospitalAddr");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrIn(List<String> values) {
            addCriterion("hospital_addr in", values, "hospitalAddr");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrNotIn(List<String> values) {
            addCriterion("hospital_addr not in", values, "hospitalAddr");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrBetween(String value1, String value2) {
            addCriterion("hospital_addr between", value1, value2, "hospitalAddr");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrNotBetween(String value1, String value2) {
            addCriterion("hospital_addr not between", value1, value2, "hospitalAddr");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrDetailIsNull() {
            addCriterion("hospital_addr_detail is null");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrDetailIsNotNull() {
            addCriterion("hospital_addr_detail is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrDetailEqualTo(String value) {
            addCriterion("hospital_addr_detail =", value, "hospitalAddrDetail");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrDetailNotEqualTo(String value) {
            addCriterion("hospital_addr_detail <>", value, "hospitalAddrDetail");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrDetailGreaterThan(String value) {
            addCriterion("hospital_addr_detail >", value, "hospitalAddrDetail");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrDetailGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_addr_detail >=", value, "hospitalAddrDetail");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrDetailLessThan(String value) {
            addCriterion("hospital_addr_detail <", value, "hospitalAddrDetail");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrDetailLessThanOrEqualTo(String value) {
            addCriterion("hospital_addr_detail <=", value, "hospitalAddrDetail");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrDetailLike(String value) {
            addCriterion("hospital_addr_detail like", value, "hospitalAddrDetail");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrDetailNotLike(String value) {
            addCriterion("hospital_addr_detail not like", value, "hospitalAddrDetail");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrDetailIn(List<String> values) {
            addCriterion("hospital_addr_detail in", values, "hospitalAddrDetail");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrDetailNotIn(List<String> values) {
            addCriterion("hospital_addr_detail not in", values, "hospitalAddrDetail");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrDetailBetween(String value1, String value2) {
            addCriterion("hospital_addr_detail between", value1, value2, "hospitalAddrDetail");
            return (Criteria) this;
        }

        public Criteria andHospitalAddrDetailNotBetween(String value1, String value2) {
            addCriterion("hospital_addr_detail not between", value1, value2, "hospitalAddrDetail");
            return (Criteria) this;
        }

        public Criteria andIsFreeIsNull() {
            addCriterion("is_free is null");
            return (Criteria) this;
        }

        public Criteria andIsFreeIsNotNull() {
            addCriterion("is_free is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreeEqualTo(Integer value) {
            addCriterion("is_free =", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotEqualTo(Integer value) {
            addCriterion("is_free <>", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeGreaterThan(Integer value) {
            addCriterion("is_free >", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_free >=", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeLessThan(Integer value) {
            addCriterion("is_free <", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeLessThanOrEqualTo(Integer value) {
            addCriterion("is_free <=", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeIn(List<Integer> values) {
            addCriterion("is_free in", values, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotIn(List<Integer> values) {
            addCriterion("is_free not in", values, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeBetween(Integer value1, Integer value2) {
            addCriterion("is_free between", value1, value2, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_free not between", value1, value2, "isFree");
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