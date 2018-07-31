package com.whiteplanet.mapper.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctorStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorStatisticsExample() {
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

        public Criteria andPartnerCountIsNull() {
            addCriterion("partner_count is null");
            return (Criteria) this;
        }

        public Criteria andPartnerCountIsNotNull() {
            addCriterion("partner_count is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerCountEqualTo(Integer value) {
            addCriterion("partner_count =", value, "partnerCount");
            return (Criteria) this;
        }

        public Criteria andPartnerCountNotEqualTo(Integer value) {
            addCriterion("partner_count <>", value, "partnerCount");
            return (Criteria) this;
        }

        public Criteria andPartnerCountGreaterThan(Integer value) {
            addCriterion("partner_count >", value, "partnerCount");
            return (Criteria) this;
        }

        public Criteria andPartnerCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("partner_count >=", value, "partnerCount");
            return (Criteria) this;
        }

        public Criteria andPartnerCountLessThan(Integer value) {
            addCriterion("partner_count <", value, "partnerCount");
            return (Criteria) this;
        }

        public Criteria andPartnerCountLessThanOrEqualTo(Integer value) {
            addCriterion("partner_count <=", value, "partnerCount");
            return (Criteria) this;
        }

        public Criteria andPartnerCountIn(List<Integer> values) {
            addCriterion("partner_count in", values, "partnerCount");
            return (Criteria) this;
        }

        public Criteria andPartnerCountNotIn(List<Integer> values) {
            addCriterion("partner_count not in", values, "partnerCount");
            return (Criteria) this;
        }

        public Criteria andPartnerCountBetween(Integer value1, Integer value2) {
            addCriterion("partner_count between", value1, value2, "partnerCount");
            return (Criteria) this;
        }

        public Criteria andPartnerCountNotBetween(Integer value1, Integer value2) {
            addCriterion("partner_count not between", value1, value2, "partnerCount");
            return (Criteria) this;
        }

        public Criteria andPartnerTwoIsNull() {
            addCriterion("partner_two is null");
            return (Criteria) this;
        }

        public Criteria andPartnerTwoIsNotNull() {
            addCriterion("partner_two is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerTwoEqualTo(Integer value) {
            addCriterion("partner_two =", value, "partnerTwo");
            return (Criteria) this;
        }

        public Criteria andPartnerTwoNotEqualTo(Integer value) {
            addCriterion("partner_two <>", value, "partnerTwo");
            return (Criteria) this;
        }

        public Criteria andPartnerTwoGreaterThan(Integer value) {
            addCriterion("partner_two >", value, "partnerTwo");
            return (Criteria) this;
        }

        public Criteria andPartnerTwoGreaterThanOrEqualTo(Integer value) {
            addCriterion("partner_two >=", value, "partnerTwo");
            return (Criteria) this;
        }

        public Criteria andPartnerTwoLessThan(Integer value) {
            addCriterion("partner_two <", value, "partnerTwo");
            return (Criteria) this;
        }

        public Criteria andPartnerTwoLessThanOrEqualTo(Integer value) {
            addCriterion("partner_two <=", value, "partnerTwo");
            return (Criteria) this;
        }

        public Criteria andPartnerTwoIn(List<Integer> values) {
            addCriterion("partner_two in", values, "partnerTwo");
            return (Criteria) this;
        }

        public Criteria andPartnerTwoNotIn(List<Integer> values) {
            addCriterion("partner_two not in", values, "partnerTwo");
            return (Criteria) this;
        }

        public Criteria andPartnerTwoBetween(Integer value1, Integer value2) {
            addCriterion("partner_two between", value1, value2, "partnerTwo");
            return (Criteria) this;
        }

        public Criteria andPartnerTwoNotBetween(Integer value1, Integer value2) {
            addCriterion("partner_two not between", value1, value2, "partnerTwo");
            return (Criteria) this;
        }

        public Criteria andCustomerCountIsNull() {
            addCriterion("customer_count is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCountIsNotNull() {
            addCriterion("customer_count is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCountEqualTo(Integer value) {
            addCriterion("customer_count =", value, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountNotEqualTo(Integer value) {
            addCriterion("customer_count <>", value, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountGreaterThan(Integer value) {
            addCriterion("customer_count >", value, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_count >=", value, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountLessThan(Integer value) {
            addCriterion("customer_count <", value, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountLessThanOrEqualTo(Integer value) {
            addCriterion("customer_count <=", value, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountIn(List<Integer> values) {
            addCriterion("customer_count in", values, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountNotIn(List<Integer> values) {
            addCriterion("customer_count not in", values, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountBetween(Integer value1, Integer value2) {
            addCriterion("customer_count between", value1, value2, "customerCount");
            return (Criteria) this;
        }

        public Criteria andCustomerCountNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_count not between", value1, value2, "customerCount");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(BigDecimal value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(BigDecimal value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(BigDecimal value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(BigDecimal value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<BigDecimal> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<BigDecimal> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitRefIsNull() {
            addCriterion("profit_ref is null");
            return (Criteria) this;
        }

        public Criteria andProfitRefIsNotNull() {
            addCriterion("profit_ref is not null");
            return (Criteria) this;
        }

        public Criteria andProfitRefEqualTo(BigDecimal value) {
            addCriterion("profit_ref =", value, "profitRef");
            return (Criteria) this;
        }

        public Criteria andProfitRefNotEqualTo(BigDecimal value) {
            addCriterion("profit_ref <>", value, "profitRef");
            return (Criteria) this;
        }

        public Criteria andProfitRefGreaterThan(BigDecimal value) {
            addCriterion("profit_ref >", value, "profitRef");
            return (Criteria) this;
        }

        public Criteria andProfitRefGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_ref >=", value, "profitRef");
            return (Criteria) this;
        }

        public Criteria andProfitRefLessThan(BigDecimal value) {
            addCriterion("profit_ref <", value, "profitRef");
            return (Criteria) this;
        }

        public Criteria andProfitRefLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_ref <=", value, "profitRef");
            return (Criteria) this;
        }

        public Criteria andProfitRefIn(List<BigDecimal> values) {
            addCriterion("profit_ref in", values, "profitRef");
            return (Criteria) this;
        }

        public Criteria andProfitRefNotIn(List<BigDecimal> values) {
            addCriterion("profit_ref not in", values, "profitRef");
            return (Criteria) this;
        }

        public Criteria andProfitRefBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_ref between", value1, value2, "profitRef");
            return (Criteria) this;
        }

        public Criteria andProfitRefNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_ref not between", value1, value2, "profitRef");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorIsNull() {
            addCriterion("invitations_doctor is null");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorIsNotNull() {
            addCriterion("invitations_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorEqualTo(Integer value) {
            addCriterion("invitations_doctor =", value, "invitationsDoctor");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorNotEqualTo(Integer value) {
            addCriterion("invitations_doctor <>", value, "invitationsDoctor");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorGreaterThan(Integer value) {
            addCriterion("invitations_doctor >", value, "invitationsDoctor");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorGreaterThanOrEqualTo(Integer value) {
            addCriterion("invitations_doctor >=", value, "invitationsDoctor");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorLessThan(Integer value) {
            addCriterion("invitations_doctor <", value, "invitationsDoctor");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorLessThanOrEqualTo(Integer value) {
            addCriterion("invitations_doctor <=", value, "invitationsDoctor");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorIn(List<Integer> values) {
            addCriterion("invitations_doctor in", values, "invitationsDoctor");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorNotIn(List<Integer> values) {
            addCriterion("invitations_doctor not in", values, "invitationsDoctor");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorBetween(Integer value1, Integer value2) {
            addCriterion("invitations_doctor between", value1, value2, "invitationsDoctor");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorNotBetween(Integer value1, Integer value2) {
            addCriterion("invitations_doctor not between", value1, value2, "invitationsDoctor");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorReadIsNull() {
            addCriterion("invitations_doctor_read is null");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorReadIsNotNull() {
            addCriterion("invitations_doctor_read is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorReadEqualTo(Integer value) {
            addCriterion("invitations_doctor_read =", value, "invitationsDoctorRead");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorReadNotEqualTo(Integer value) {
            addCriterion("invitations_doctor_read <>", value, "invitationsDoctorRead");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorReadGreaterThan(Integer value) {
            addCriterion("invitations_doctor_read >", value, "invitationsDoctorRead");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("invitations_doctor_read >=", value, "invitationsDoctorRead");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorReadLessThan(Integer value) {
            addCriterion("invitations_doctor_read <", value, "invitationsDoctorRead");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorReadLessThanOrEqualTo(Integer value) {
            addCriterion("invitations_doctor_read <=", value, "invitationsDoctorRead");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorReadIn(List<Integer> values) {
            addCriterion("invitations_doctor_read in", values, "invitationsDoctorRead");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorReadNotIn(List<Integer> values) {
            addCriterion("invitations_doctor_read not in", values, "invitationsDoctorRead");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorReadBetween(Integer value1, Integer value2) {
            addCriterion("invitations_doctor_read between", value1, value2, "invitationsDoctorRead");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorReadNotBetween(Integer value1, Integer value2) {
            addCriterion("invitations_doctor_read not between", value1, value2, "invitationsDoctorRead");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorRegisterIsNull() {
            addCriterion("invitations_doctor_register is null");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorRegisterIsNotNull() {
            addCriterion("invitations_doctor_register is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorRegisterEqualTo(Integer value) {
            addCriterion("invitations_doctor_register =", value, "invitationsDoctorRegister");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorRegisterNotEqualTo(Integer value) {
            addCriterion("invitations_doctor_register <>", value, "invitationsDoctorRegister");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorRegisterGreaterThan(Integer value) {
            addCriterion("invitations_doctor_register >", value, "invitationsDoctorRegister");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorRegisterGreaterThanOrEqualTo(Integer value) {
            addCriterion("invitations_doctor_register >=", value, "invitationsDoctorRegister");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorRegisterLessThan(Integer value) {
            addCriterion("invitations_doctor_register <", value, "invitationsDoctorRegister");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorRegisterLessThanOrEqualTo(Integer value) {
            addCriterion("invitations_doctor_register <=", value, "invitationsDoctorRegister");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorRegisterIn(List<Integer> values) {
            addCriterion("invitations_doctor_register in", values, "invitationsDoctorRegister");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorRegisterNotIn(List<Integer> values) {
            addCriterion("invitations_doctor_register not in", values, "invitationsDoctorRegister");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorRegisterBetween(Integer value1, Integer value2) {
            addCriterion("invitations_doctor_register between", value1, value2, "invitationsDoctorRegister");
            return (Criteria) this;
        }

        public Criteria andInvitationsDoctorRegisterNotBetween(Integer value1, Integer value2) {
            addCriterion("invitations_doctor_register not between", value1, value2, "invitationsDoctorRegister");
            return (Criteria) this;
        }

        public Criteria andApplyClinicIsNull() {
            addCriterion("apply_clinic is null");
            return (Criteria) this;
        }

        public Criteria andApplyClinicIsNotNull() {
            addCriterion("apply_clinic is not null");
            return (Criteria) this;
        }

        public Criteria andApplyClinicEqualTo(Integer value) {
            addCriterion("apply_clinic =", value, "applyClinic");
            return (Criteria) this;
        }

        public Criteria andApplyClinicNotEqualTo(Integer value) {
            addCriterion("apply_clinic <>", value, "applyClinic");
            return (Criteria) this;
        }

        public Criteria andApplyClinicGreaterThan(Integer value) {
            addCriterion("apply_clinic >", value, "applyClinic");
            return (Criteria) this;
        }

        public Criteria andApplyClinicGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_clinic >=", value, "applyClinic");
            return (Criteria) this;
        }

        public Criteria andApplyClinicLessThan(Integer value) {
            addCriterion("apply_clinic <", value, "applyClinic");
            return (Criteria) this;
        }

        public Criteria andApplyClinicLessThanOrEqualTo(Integer value) {
            addCriterion("apply_clinic <=", value, "applyClinic");
            return (Criteria) this;
        }

        public Criteria andApplyClinicIn(List<Integer> values) {
            addCriterion("apply_clinic in", values, "applyClinic");
            return (Criteria) this;
        }

        public Criteria andApplyClinicNotIn(List<Integer> values) {
            addCriterion("apply_clinic not in", values, "applyClinic");
            return (Criteria) this;
        }

        public Criteria andApplyClinicBetween(Integer value1, Integer value2) {
            addCriterion("apply_clinic between", value1, value2, "applyClinic");
            return (Criteria) this;
        }

        public Criteria andApplyClinicNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_clinic not between", value1, value2, "applyClinic");
            return (Criteria) this;
        }

        public Criteria andApplyClinicReadIsNull() {
            addCriterion("apply_clinic_read is null");
            return (Criteria) this;
        }

        public Criteria andApplyClinicReadIsNotNull() {
            addCriterion("apply_clinic_read is not null");
            return (Criteria) this;
        }

        public Criteria andApplyClinicReadEqualTo(Integer value) {
            addCriterion("apply_clinic_read =", value, "applyClinicRead");
            return (Criteria) this;
        }

        public Criteria andApplyClinicReadNotEqualTo(Integer value) {
            addCriterion("apply_clinic_read <>", value, "applyClinicRead");
            return (Criteria) this;
        }

        public Criteria andApplyClinicReadGreaterThan(Integer value) {
            addCriterion("apply_clinic_read >", value, "applyClinicRead");
            return (Criteria) this;
        }

        public Criteria andApplyClinicReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_clinic_read >=", value, "applyClinicRead");
            return (Criteria) this;
        }

        public Criteria andApplyClinicReadLessThan(Integer value) {
            addCriterion("apply_clinic_read <", value, "applyClinicRead");
            return (Criteria) this;
        }

        public Criteria andApplyClinicReadLessThanOrEqualTo(Integer value) {
            addCriterion("apply_clinic_read <=", value, "applyClinicRead");
            return (Criteria) this;
        }

        public Criteria andApplyClinicReadIn(List<Integer> values) {
            addCriterion("apply_clinic_read in", values, "applyClinicRead");
            return (Criteria) this;
        }

        public Criteria andApplyClinicReadNotIn(List<Integer> values) {
            addCriterion("apply_clinic_read not in", values, "applyClinicRead");
            return (Criteria) this;
        }

        public Criteria andApplyClinicReadBetween(Integer value1, Integer value2) {
            addCriterion("apply_clinic_read between", value1, value2, "applyClinicRead");
            return (Criteria) this;
        }

        public Criteria andApplyClinicReadNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_clinic_read not between", value1, value2, "applyClinicRead");
            return (Criteria) this;
        }

        public Criteria andApplyClinicOkIsNull() {
            addCriterion("apply_clinic_ok is null");
            return (Criteria) this;
        }

        public Criteria andApplyClinicOkIsNotNull() {
            addCriterion("apply_clinic_ok is not null");
            return (Criteria) this;
        }

        public Criteria andApplyClinicOkEqualTo(Integer value) {
            addCriterion("apply_clinic_ok =", value, "applyClinicOk");
            return (Criteria) this;
        }

        public Criteria andApplyClinicOkNotEqualTo(Integer value) {
            addCriterion("apply_clinic_ok <>", value, "applyClinicOk");
            return (Criteria) this;
        }

        public Criteria andApplyClinicOkGreaterThan(Integer value) {
            addCriterion("apply_clinic_ok >", value, "applyClinicOk");
            return (Criteria) this;
        }

        public Criteria andApplyClinicOkGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_clinic_ok >=", value, "applyClinicOk");
            return (Criteria) this;
        }

        public Criteria andApplyClinicOkLessThan(Integer value) {
            addCriterion("apply_clinic_ok <", value, "applyClinicOk");
            return (Criteria) this;
        }

        public Criteria andApplyClinicOkLessThanOrEqualTo(Integer value) {
            addCriterion("apply_clinic_ok <=", value, "applyClinicOk");
            return (Criteria) this;
        }

        public Criteria andApplyClinicOkIn(List<Integer> values) {
            addCriterion("apply_clinic_ok in", values, "applyClinicOk");
            return (Criteria) this;
        }

        public Criteria andApplyClinicOkNotIn(List<Integer> values) {
            addCriterion("apply_clinic_ok not in", values, "applyClinicOk");
            return (Criteria) this;
        }

        public Criteria andApplyClinicOkBetween(Integer value1, Integer value2) {
            addCriterion("apply_clinic_ok between", value1, value2, "applyClinicOk");
            return (Criteria) this;
        }

        public Criteria andApplyClinicOkNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_clinic_ok not between", value1, value2, "applyClinicOk");
            return (Criteria) this;
        }

        public Criteria andSendCustomerIsNull() {
            addCriterion("send_customer is null");
            return (Criteria) this;
        }

        public Criteria andSendCustomerIsNotNull() {
            addCriterion("send_customer is not null");
            return (Criteria) this;
        }

        public Criteria andSendCustomerEqualTo(Integer value) {
            addCriterion("send_customer =", value, "sendCustomer");
            return (Criteria) this;
        }

        public Criteria andSendCustomerNotEqualTo(Integer value) {
            addCriterion("send_customer <>", value, "sendCustomer");
            return (Criteria) this;
        }

        public Criteria andSendCustomerGreaterThan(Integer value) {
            addCriterion("send_customer >", value, "sendCustomer");
            return (Criteria) this;
        }

        public Criteria andSendCustomerGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_customer >=", value, "sendCustomer");
            return (Criteria) this;
        }

        public Criteria andSendCustomerLessThan(Integer value) {
            addCriterion("send_customer <", value, "sendCustomer");
            return (Criteria) this;
        }

        public Criteria andSendCustomerLessThanOrEqualTo(Integer value) {
            addCriterion("send_customer <=", value, "sendCustomer");
            return (Criteria) this;
        }

        public Criteria andSendCustomerIn(List<Integer> values) {
            addCriterion("send_customer in", values, "sendCustomer");
            return (Criteria) this;
        }

        public Criteria andSendCustomerNotIn(List<Integer> values) {
            addCriterion("send_customer not in", values, "sendCustomer");
            return (Criteria) this;
        }

        public Criteria andSendCustomerBetween(Integer value1, Integer value2) {
            addCriterion("send_customer between", value1, value2, "sendCustomer");
            return (Criteria) this;
        }

        public Criteria andSendCustomerNotBetween(Integer value1, Integer value2) {
            addCriterion("send_customer not between", value1, value2, "sendCustomer");
            return (Criteria) this;
        }

        public Criteria andSendCustomerReadIsNull() {
            addCriterion("send_customer_read is null");
            return (Criteria) this;
        }

        public Criteria andSendCustomerReadIsNotNull() {
            addCriterion("send_customer_read is not null");
            return (Criteria) this;
        }

        public Criteria andSendCustomerReadEqualTo(Integer value) {
            addCriterion("send_customer_read =", value, "sendCustomerRead");
            return (Criteria) this;
        }

        public Criteria andSendCustomerReadNotEqualTo(Integer value) {
            addCriterion("send_customer_read <>", value, "sendCustomerRead");
            return (Criteria) this;
        }

        public Criteria andSendCustomerReadGreaterThan(Integer value) {
            addCriterion("send_customer_read >", value, "sendCustomerRead");
            return (Criteria) this;
        }

        public Criteria andSendCustomerReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_customer_read >=", value, "sendCustomerRead");
            return (Criteria) this;
        }

        public Criteria andSendCustomerReadLessThan(Integer value) {
            addCriterion("send_customer_read <", value, "sendCustomerRead");
            return (Criteria) this;
        }

        public Criteria andSendCustomerReadLessThanOrEqualTo(Integer value) {
            addCriterion("send_customer_read <=", value, "sendCustomerRead");
            return (Criteria) this;
        }

        public Criteria andSendCustomerReadIn(List<Integer> values) {
            addCriterion("send_customer_read in", values, "sendCustomerRead");
            return (Criteria) this;
        }

        public Criteria andSendCustomerReadNotIn(List<Integer> values) {
            addCriterion("send_customer_read not in", values, "sendCustomerRead");
            return (Criteria) this;
        }

        public Criteria andSendCustomerReadBetween(Integer value1, Integer value2) {
            addCriterion("send_customer_read between", value1, value2, "sendCustomerRead");
            return (Criteria) this;
        }

        public Criteria andSendCustomerReadNotBetween(Integer value1, Integer value2) {
            addCriterion("send_customer_read not between", value1, value2, "sendCustomerRead");
            return (Criteria) this;
        }

        public Criteria andSendCustomerFollowIsNull() {
            addCriterion("send_customer_follow is null");
            return (Criteria) this;
        }

        public Criteria andSendCustomerFollowIsNotNull() {
            addCriterion("send_customer_follow is not null");
            return (Criteria) this;
        }

        public Criteria andSendCustomerFollowEqualTo(Integer value) {
            addCriterion("send_customer_follow =", value, "sendCustomerFollow");
            return (Criteria) this;
        }

        public Criteria andSendCustomerFollowNotEqualTo(Integer value) {
            addCriterion("send_customer_follow <>", value, "sendCustomerFollow");
            return (Criteria) this;
        }

        public Criteria andSendCustomerFollowGreaterThan(Integer value) {
            addCriterion("send_customer_follow >", value, "sendCustomerFollow");
            return (Criteria) this;
        }

        public Criteria andSendCustomerFollowGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_customer_follow >=", value, "sendCustomerFollow");
            return (Criteria) this;
        }

        public Criteria andSendCustomerFollowLessThan(Integer value) {
            addCriterion("send_customer_follow <", value, "sendCustomerFollow");
            return (Criteria) this;
        }

        public Criteria andSendCustomerFollowLessThanOrEqualTo(Integer value) {
            addCriterion("send_customer_follow <=", value, "sendCustomerFollow");
            return (Criteria) this;
        }

        public Criteria andSendCustomerFollowIn(List<Integer> values) {
            addCriterion("send_customer_follow in", values, "sendCustomerFollow");
            return (Criteria) this;
        }

        public Criteria andSendCustomerFollowNotIn(List<Integer> values) {
            addCriterion("send_customer_follow not in", values, "sendCustomerFollow");
            return (Criteria) this;
        }

        public Criteria andSendCustomerFollowBetween(Integer value1, Integer value2) {
            addCriterion("send_customer_follow between", value1, value2, "sendCustomerFollow");
            return (Criteria) this;
        }

        public Criteria andSendCustomerFollowNotBetween(Integer value1, Integer value2) {
            addCriterion("send_customer_follow not between", value1, value2, "sendCustomerFollow");
            return (Criteria) this;
        }

        public Criteria andClinicCountIsNull() {
            addCriterion("clinic_count is null");
            return (Criteria) this;
        }

        public Criteria andClinicCountIsNotNull() {
            addCriterion("clinic_count is not null");
            return (Criteria) this;
        }

        public Criteria andClinicCountEqualTo(Integer value) {
            addCriterion("clinic_count =", value, "clinicCount");
            return (Criteria) this;
        }

        public Criteria andClinicCountNotEqualTo(Integer value) {
            addCriterion("clinic_count <>", value, "clinicCount");
            return (Criteria) this;
        }

        public Criteria andClinicCountGreaterThan(Integer value) {
            addCriterion("clinic_count >", value, "clinicCount");
            return (Criteria) this;
        }

        public Criteria andClinicCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("clinic_count >=", value, "clinicCount");
            return (Criteria) this;
        }

        public Criteria andClinicCountLessThan(Integer value) {
            addCriterion("clinic_count <", value, "clinicCount");
            return (Criteria) this;
        }

        public Criteria andClinicCountLessThanOrEqualTo(Integer value) {
            addCriterion("clinic_count <=", value, "clinicCount");
            return (Criteria) this;
        }

        public Criteria andClinicCountIn(List<Integer> values) {
            addCriterion("clinic_count in", values, "clinicCount");
            return (Criteria) this;
        }

        public Criteria andClinicCountNotIn(List<Integer> values) {
            addCriterion("clinic_count not in", values, "clinicCount");
            return (Criteria) this;
        }

        public Criteria andClinicCountBetween(Integer value1, Integer value2) {
            addCriterion("clinic_count between", value1, value2, "clinicCount");
            return (Criteria) this;
        }

        public Criteria andClinicCountNotBetween(Integer value1, Integer value2) {
            addCriterion("clinic_count not between", value1, value2, "clinicCount");
            return (Criteria) this;
        }

        public Criteria andDepartmentCountIsNull() {
            addCriterion("department_count is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCountIsNotNull() {
            addCriterion("department_count is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCountEqualTo(Integer value) {
            addCriterion("department_count =", value, "departmentCount");
            return (Criteria) this;
        }

        public Criteria andDepartmentCountNotEqualTo(Integer value) {
            addCriterion("department_count <>", value, "departmentCount");
            return (Criteria) this;
        }

        public Criteria andDepartmentCountGreaterThan(Integer value) {
            addCriterion("department_count >", value, "departmentCount");
            return (Criteria) this;
        }

        public Criteria andDepartmentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_count >=", value, "departmentCount");
            return (Criteria) this;
        }

        public Criteria andDepartmentCountLessThan(Integer value) {
            addCriterion("department_count <", value, "departmentCount");
            return (Criteria) this;
        }

        public Criteria andDepartmentCountLessThanOrEqualTo(Integer value) {
            addCriterion("department_count <=", value, "departmentCount");
            return (Criteria) this;
        }

        public Criteria andDepartmentCountIn(List<Integer> values) {
            addCriterion("department_count in", values, "departmentCount");
            return (Criteria) this;
        }

        public Criteria andDepartmentCountNotIn(List<Integer> values) {
            addCriterion("department_count not in", values, "departmentCount");
            return (Criteria) this;
        }

        public Criteria andDepartmentCountBetween(Integer value1, Integer value2) {
            addCriterion("department_count between", value1, value2, "departmentCount");
            return (Criteria) this;
        }

        public Criteria andDepartmentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("department_count not between", value1, value2, "departmentCount");
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