package com.whiteplanet.mapper.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClinicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClinicExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andDoctorCountIsNull() {
            addCriterion("doctor_count is null");
            return (Criteria) this;
        }

        public Criteria andDoctorCountIsNotNull() {
            addCriterion("doctor_count is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorCountEqualTo(Integer value) {
            addCriterion("doctor_count =", value, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountNotEqualTo(Integer value) {
            addCriterion("doctor_count <>", value, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountGreaterThan(Integer value) {
            addCriterion("doctor_count >", value, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_count >=", value, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountLessThan(Integer value) {
            addCriterion("doctor_count <", value, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_count <=", value, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountIn(List<Integer> values) {
            addCriterion("doctor_count in", values, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountNotIn(List<Integer> values) {
            addCriterion("doctor_count not in", values, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountBetween(Integer value1, Integer value2) {
            addCriterion("doctor_count between", value1, value2, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_count not between", value1, value2, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNull() {
            addCriterion("business is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNotNull() {
            addCriterion("business is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessEqualTo(Boolean value) {
            addCriterion("business =", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotEqualTo(Boolean value) {
            addCriterion("business <>", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThan(Boolean value) {
            addCriterion("business >", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThanOrEqualTo(Boolean value) {
            addCriterion("business >=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThan(Boolean value) {
            addCriterion("business <", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThanOrEqualTo(Boolean value) {
            addCriterion("business <=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessIn(List<Boolean> values) {
            addCriterion("business in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotIn(List<Boolean> values) {
            addCriterion("business not in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessBetween(Boolean value1, Boolean value2) {
            addCriterion("business between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotBetween(Boolean value1, Boolean value2) {
            addCriterion("business not between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessDateIsNull() {
            addCriterion("business_date is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDateIsNotNull() {
            addCriterion("business_date is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDateEqualTo(Date value) {
            addCriterion("business_date =", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateNotEqualTo(Date value) {
            addCriterion("business_date <>", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateGreaterThan(Date value) {
            addCriterion("business_date >", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateGreaterThanOrEqualTo(Date value) {
            addCriterion("business_date >=", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLessThan(Date value) {
            addCriterion("business_date <", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLessThanOrEqualTo(Date value) {
            addCriterion("business_date <=", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateIn(List<Date> values) {
            addCriterion("business_date in", values, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateNotIn(List<Date> values) {
            addCriterion("business_date not in", values, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateBetween(Date value1, Date value2) {
            addCriterion("business_date between", value1, value2, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateNotBetween(Date value1, Date value2) {
            addCriterion("business_date not between", value1, value2, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDayIsNull() {
            addCriterion("business_day is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDayIsNotNull() {
            addCriterion("business_day is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDayEqualTo(Integer value) {
            addCriterion("business_day =", value, "businessDay");
            return (Criteria) this;
        }

        public Criteria andBusinessDayNotEqualTo(Integer value) {
            addCriterion("business_day <>", value, "businessDay");
            return (Criteria) this;
        }

        public Criteria andBusinessDayGreaterThan(Integer value) {
            addCriterion("business_day >", value, "businessDay");
            return (Criteria) this;
        }

        public Criteria andBusinessDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_day >=", value, "businessDay");
            return (Criteria) this;
        }

        public Criteria andBusinessDayLessThan(Integer value) {
            addCriterion("business_day <", value, "businessDay");
            return (Criteria) this;
        }

        public Criteria andBusinessDayLessThanOrEqualTo(Integer value) {
            addCriterion("business_day <=", value, "businessDay");
            return (Criteria) this;
        }

        public Criteria andBusinessDayIn(List<Integer> values) {
            addCriterion("business_day in", values, "businessDay");
            return (Criteria) this;
        }

        public Criteria andBusinessDayNotIn(List<Integer> values) {
            addCriterion("business_day not in", values, "businessDay");
            return (Criteria) this;
        }

        public Criteria andBusinessDayBetween(Integer value1, Integer value2) {
            addCriterion("business_day between", value1, value2, "businessDay");
            return (Criteria) this;
        }

        public Criteria andBusinessDayNotBetween(Integer value1, Integer value2) {
            addCriterion("business_day not between", value1, value2, "businessDay");
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyIsNull() {
            addCriterion("receive_money is null");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyIsNotNull() {
            addCriterion("receive_money is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyEqualTo(BigDecimal value) {
            addCriterion("receive_money =", value, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyNotEqualTo(BigDecimal value) {
            addCriterion("receive_money <>", value, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyGreaterThan(BigDecimal value) {
            addCriterion("receive_money >", value, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receive_money >=", value, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyLessThan(BigDecimal value) {
            addCriterion("receive_money <", value, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receive_money <=", value, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyIn(List<BigDecimal> values) {
            addCriterion("receive_money in", values, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyNotIn(List<BigDecimal> values) {
            addCriterion("receive_money not in", values, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receive_money between", value1, value2, "receiveMoney");
            return (Criteria) this;
        }

        public Criteria andReceiveMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receive_money not between", value1, value2, "receiveMoney");
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

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andRefMoneyIsNull() {
            addCriterion("ref_money is null");
            return (Criteria) this;
        }

        public Criteria andRefMoneyIsNotNull() {
            addCriterion("ref_money is not null");
            return (Criteria) this;
        }

        public Criteria andRefMoneyEqualTo(BigDecimal value) {
            addCriterion("ref_money =", value, "refMoney");
            return (Criteria) this;
        }

        public Criteria andRefMoneyNotEqualTo(BigDecimal value) {
            addCriterion("ref_money <>", value, "refMoney");
            return (Criteria) this;
        }

        public Criteria andRefMoneyGreaterThan(BigDecimal value) {
            addCriterion("ref_money >", value, "refMoney");
            return (Criteria) this;
        }

        public Criteria andRefMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ref_money >=", value, "refMoney");
            return (Criteria) this;
        }

        public Criteria andRefMoneyLessThan(BigDecimal value) {
            addCriterion("ref_money <", value, "refMoney");
            return (Criteria) this;
        }

        public Criteria andRefMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ref_money <=", value, "refMoney");
            return (Criteria) this;
        }

        public Criteria andRefMoneyIn(List<BigDecimal> values) {
            addCriterion("ref_money in", values, "refMoney");
            return (Criteria) this;
        }

        public Criteria andRefMoneyNotIn(List<BigDecimal> values) {
            addCriterion("ref_money not in", values, "refMoney");
            return (Criteria) this;
        }

        public Criteria andRefMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ref_money between", value1, value2, "refMoney");
            return (Criteria) this;
        }

        public Criteria andRefMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ref_money not between", value1, value2, "refMoney");
            return (Criteria) this;
        }

        public Criteria andServiceMoneyIsNull() {
            addCriterion("service_money is null");
            return (Criteria) this;
        }

        public Criteria andServiceMoneyIsNotNull() {
            addCriterion("service_money is not null");
            return (Criteria) this;
        }

        public Criteria andServiceMoneyEqualTo(BigDecimal value) {
            addCriterion("service_money =", value, "serviceMoney");
            return (Criteria) this;
        }

        public Criteria andServiceMoneyNotEqualTo(BigDecimal value) {
            addCriterion("service_money <>", value, "serviceMoney");
            return (Criteria) this;
        }

        public Criteria andServiceMoneyGreaterThan(BigDecimal value) {
            addCriterion("service_money >", value, "serviceMoney");
            return (Criteria) this;
        }

        public Criteria andServiceMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("service_money >=", value, "serviceMoney");
            return (Criteria) this;
        }

        public Criteria andServiceMoneyLessThan(BigDecimal value) {
            addCriterion("service_money <", value, "serviceMoney");
            return (Criteria) this;
        }

        public Criteria andServiceMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("service_money <=", value, "serviceMoney");
            return (Criteria) this;
        }

        public Criteria andServiceMoneyIn(List<BigDecimal> values) {
            addCriterion("service_money in", values, "serviceMoney");
            return (Criteria) this;
        }

        public Criteria andServiceMoneyNotIn(List<BigDecimal> values) {
            addCriterion("service_money not in", values, "serviceMoney");
            return (Criteria) this;
        }

        public Criteria andServiceMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_money between", value1, value2, "serviceMoney");
            return (Criteria) this;
        }

        public Criteria andServiceMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_money not between", value1, value2, "serviceMoney");
            return (Criteria) this;
        }

        public Criteria andServiceWaitIsNull() {
            addCriterion("service_wait is null");
            return (Criteria) this;
        }

        public Criteria andServiceWaitIsNotNull() {
            addCriterion("service_wait is not null");
            return (Criteria) this;
        }

        public Criteria andServiceWaitEqualTo(Integer value) {
            addCriterion("service_wait =", value, "serviceWait");
            return (Criteria) this;
        }

        public Criteria andServiceWaitNotEqualTo(Integer value) {
            addCriterion("service_wait <>", value, "serviceWait");
            return (Criteria) this;
        }

        public Criteria andServiceWaitGreaterThan(Integer value) {
            addCriterion("service_wait >", value, "serviceWait");
            return (Criteria) this;
        }

        public Criteria andServiceWaitGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_wait >=", value, "serviceWait");
            return (Criteria) this;
        }

        public Criteria andServiceWaitLessThan(Integer value) {
            addCriterion("service_wait <", value, "serviceWait");
            return (Criteria) this;
        }

        public Criteria andServiceWaitLessThanOrEqualTo(Integer value) {
            addCriterion("service_wait <=", value, "serviceWait");
            return (Criteria) this;
        }

        public Criteria andServiceWaitIn(List<Integer> values) {
            addCriterion("service_wait in", values, "serviceWait");
            return (Criteria) this;
        }

        public Criteria andServiceWaitNotIn(List<Integer> values) {
            addCriterion("service_wait not in", values, "serviceWait");
            return (Criteria) this;
        }

        public Criteria andServiceWaitBetween(Integer value1, Integer value2) {
            addCriterion("service_wait between", value1, value2, "serviceWait");
            return (Criteria) this;
        }

        public Criteria andServiceWaitNotBetween(Integer value1, Integer value2) {
            addCriterion("service_wait not between", value1, value2, "serviceWait");
            return (Criteria) this;
        }

        public Criteria andDoctorRefCountIsNull() {
            addCriterion("doctor_ref_count is null");
            return (Criteria) this;
        }

        public Criteria andDoctorRefCountIsNotNull() {
            addCriterion("doctor_ref_count is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorRefCountEqualTo(Integer value) {
            addCriterion("doctor_ref_count =", value, "doctorRefCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRefCountNotEqualTo(Integer value) {
            addCriterion("doctor_ref_count <>", value, "doctorRefCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRefCountGreaterThan(Integer value) {
            addCriterion("doctor_ref_count >", value, "doctorRefCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRefCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_ref_count >=", value, "doctorRefCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRefCountLessThan(Integer value) {
            addCriterion("doctor_ref_count <", value, "doctorRefCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRefCountLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_ref_count <=", value, "doctorRefCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRefCountIn(List<Integer> values) {
            addCriterion("doctor_ref_count in", values, "doctorRefCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRefCountNotIn(List<Integer> values) {
            addCriterion("doctor_ref_count not in", values, "doctorRefCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRefCountBetween(Integer value1, Integer value2) {
            addCriterion("doctor_ref_count between", value1, value2, "doctorRefCount");
            return (Criteria) this;
        }

        public Criteria andDoctorRefCountNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_ref_count not between", value1, value2, "doctorRefCount");
            return (Criteria) this;
        }

        public Criteria andDoctorReciveCountIsNull() {
            addCriterion("doctor_recive_count is null");
            return (Criteria) this;
        }

        public Criteria andDoctorReciveCountIsNotNull() {
            addCriterion("doctor_recive_count is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorReciveCountEqualTo(Integer value) {
            addCriterion("doctor_recive_count =", value, "doctorReciveCount");
            return (Criteria) this;
        }

        public Criteria andDoctorReciveCountNotEqualTo(Integer value) {
            addCriterion("doctor_recive_count <>", value, "doctorReciveCount");
            return (Criteria) this;
        }

        public Criteria andDoctorReciveCountGreaterThan(Integer value) {
            addCriterion("doctor_recive_count >", value, "doctorReciveCount");
            return (Criteria) this;
        }

        public Criteria andDoctorReciveCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_recive_count >=", value, "doctorReciveCount");
            return (Criteria) this;
        }

        public Criteria andDoctorReciveCountLessThan(Integer value) {
            addCriterion("doctor_recive_count <", value, "doctorReciveCount");
            return (Criteria) this;
        }

        public Criteria andDoctorReciveCountLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_recive_count <=", value, "doctorReciveCount");
            return (Criteria) this;
        }

        public Criteria andDoctorReciveCountIn(List<Integer> values) {
            addCriterion("doctor_recive_count in", values, "doctorReciveCount");
            return (Criteria) this;
        }

        public Criteria andDoctorReciveCountNotIn(List<Integer> values) {
            addCriterion("doctor_recive_count not in", values, "doctorReciveCount");
            return (Criteria) this;
        }

        public Criteria andDoctorReciveCountBetween(Integer value1, Integer value2) {
            addCriterion("doctor_recive_count between", value1, value2, "doctorReciveCount");
            return (Criteria) this;
        }

        public Criteria andDoctorReciveCountNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_recive_count not between", value1, value2, "doctorReciveCount");
            return (Criteria) this;
        }

        public Criteria andDoctorDepartmentCountIsNull() {
            addCriterion("doctor_department_count is null");
            return (Criteria) this;
        }

        public Criteria andDoctorDepartmentCountIsNotNull() {
            addCriterion("doctor_department_count is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorDepartmentCountEqualTo(Integer value) {
            addCriterion("doctor_department_count =", value, "doctorDepartmentCount");
            return (Criteria) this;
        }

        public Criteria andDoctorDepartmentCountNotEqualTo(Integer value) {
            addCriterion("doctor_department_count <>", value, "doctorDepartmentCount");
            return (Criteria) this;
        }

        public Criteria andDoctorDepartmentCountGreaterThan(Integer value) {
            addCriterion("doctor_department_count >", value, "doctorDepartmentCount");
            return (Criteria) this;
        }

        public Criteria andDoctorDepartmentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_department_count >=", value, "doctorDepartmentCount");
            return (Criteria) this;
        }

        public Criteria andDoctorDepartmentCountLessThan(Integer value) {
            addCriterion("doctor_department_count <", value, "doctorDepartmentCount");
            return (Criteria) this;
        }

        public Criteria andDoctorDepartmentCountLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_department_count <=", value, "doctorDepartmentCount");
            return (Criteria) this;
        }

        public Criteria andDoctorDepartmentCountIn(List<Integer> values) {
            addCriterion("doctor_department_count in", values, "doctorDepartmentCount");
            return (Criteria) this;
        }

        public Criteria andDoctorDepartmentCountNotIn(List<Integer> values) {
            addCriterion("doctor_department_count not in", values, "doctorDepartmentCount");
            return (Criteria) this;
        }

        public Criteria andDoctorDepartmentCountBetween(Integer value1, Integer value2) {
            addCriterion("doctor_department_count between", value1, value2, "doctorDepartmentCount");
            return (Criteria) this;
        }

        public Criteria andDoctorDepartmentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_department_count not between", value1, value2, "doctorDepartmentCount");
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