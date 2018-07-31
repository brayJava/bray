package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorStatistics;
import org.apache.ibatis.jdbc.SQL;

public class DoctorStatisticsSqlProvider {

    public String insertSelective(DoctorStatistics record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("doctor_statistics");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }

        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getTime() != null) {
            sql.VALUES("time", "#{time,jdbcType=TIMESTAMP}");
        }

        if (record.getPartnerCount() != null) {
            sql.VALUES("partner_count", "#{partnerCount,jdbcType=INTEGER}");
        }

        if (record.getPartnerTwo() != null) {
            sql.VALUES("partner_two", "#{partnerTwo,jdbcType=INTEGER}");
        }

        if (record.getCustomerCount() != null) {
            sql.VALUES("customer_count", "#{customerCount,jdbcType=INTEGER}");
        }

        if (record.getProfit() != null) {
            sql.VALUES("profit", "#{profit,jdbcType=DECIMAL}");
        }

        if (record.getProfitRef() != null) {
            sql.VALUES("profit_ref", "#{profitRef,jdbcType=DECIMAL}");
        }

        if (record.getInvitationsDoctor() != null) {
            sql.VALUES("invitations_doctor", "#{invitationsDoctor,jdbcType=INTEGER}");
        }

        if (record.getInvitationsDoctorRead() != null) {
            sql.VALUES("invitations_doctor_read", "#{invitationsDoctorRead,jdbcType=INTEGER}");
        }

        if (record.getInvitationsDoctorRegister() != null) {
            sql.VALUES("invitations_doctor_register", "#{invitationsDoctorRegister,jdbcType=INTEGER}");
        }

        if (record.getApplyClinic() != null) {
            sql.VALUES("apply_clinic", "#{applyClinic,jdbcType=INTEGER}");
        }

        if (record.getApplyClinicRead() != null) {
            sql.VALUES("apply_clinic_read", "#{applyClinicRead,jdbcType=INTEGER}");
        }

        if (record.getApplyClinicOk() != null) {
            sql.VALUES("apply_clinic_ok", "#{applyClinicOk,jdbcType=INTEGER}");
        }

        if (record.getSendCustomer() != null) {
            sql.VALUES("send_customer", "#{sendCustomer,jdbcType=INTEGER}");
        }

        if (record.getSendCustomerRead() != null) {
            sql.VALUES("send_customer_read", "#{sendCustomerRead,jdbcType=INTEGER}");
        }

        if (record.getSendCustomerFollow() != null) {
            sql.VALUES("send_customer_follow", "#{sendCustomerFollow,jdbcType=INTEGER}");
        }

        if (record.getClinicCount() != null) {
            sql.VALUES("clinic_count", "#{clinicCount,jdbcType=INTEGER}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DoctorStatistics record) {
        SQL sql = new SQL();
        sql.UPDATE("doctor_statistics");

        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getTime() != null) {
            sql.SET("time = #{time,jdbcType=TIMESTAMP}");
        }

        if (record.getPartnerCount() != null) {
            sql.SET("partner_count = #{partnerCount,jdbcType=INTEGER}");
        }

        if (record.getPartnerTwo() != null) {
            sql.SET("partner_two = #{partnerTwo,jdbcType=INTEGER}");
        }

        if (record.getCustomerCount() != null) {
            sql.SET("customer_count = #{customerCount,jdbcType=INTEGER}");
        }

        if (record.getProfit() != null) {
            sql.SET("profit = #{profit,jdbcType=DECIMAL}");
        }

        if (record.getProfitRef() != null) {
            sql.SET("profit_ref = #{profitRef,jdbcType=DECIMAL}");
        }

        if (record.getInvitationsDoctor() != null) {
            sql.SET("invitations_doctor = #{invitationsDoctor,jdbcType=INTEGER}");
        }

        if (record.getInvitationsDoctorRead() != null) {
            sql.SET("invitations_doctor_read = #{invitationsDoctorRead,jdbcType=INTEGER}");
        }

        if (record.getInvitationsDoctorRegister() != null) {
            sql.SET("invitations_doctor_register = #{invitationsDoctorRegister,jdbcType=INTEGER}");
        }

        if (record.getApplyClinic() != null) {
            sql.SET("apply_clinic = #{applyClinic,jdbcType=INTEGER}");
        }

        if (record.getApplyClinicRead() != null) {
            sql.SET("apply_clinic_read = #{applyClinicRead,jdbcType=INTEGER}");
        }

        if (record.getApplyClinicOk() != null) {
            sql.SET("apply_clinic_ok = #{applyClinicOk,jdbcType=INTEGER}");
        }

        if (record.getSendCustomer() != null) {
            sql.SET("send_customer = #{sendCustomer,jdbcType=INTEGER}");
        }

        if (record.getSendCustomerRead() != null) {
            sql.SET("send_customer_read = #{sendCustomerRead,jdbcType=INTEGER}");
        }

        if (record.getSendCustomerFollow() != null) {
            sql.SET("send_customer_follow = #{sendCustomerFollow,jdbcType=INTEGER}");
        }

        if (record.getClinicCount() != null) {
            sql.SET("clinic_count = #{clinicCount,jdbcType=INTEGER}");
        }

        sql.WHERE("id = #{id,jdbcType=INTEGER}");

        return sql.toString();
    }

    public String selectWinCountByDoctorStatistics(DoctorStatistics record){
        SQL subSql = new SQL();
        if (record.getPartnerCount() != null) {
            subSql.SELECT("sum(partner_count) as partner_count") ;
        }

        if (record.getPartnerTwo() != null) {
            subSql.SELECT("sum(partner_two) as partner_two") ;
        }

        if (record.getCustomerCount() != null) {
            subSql.SELECT("sum(customer_count) as customer_count") ;
        }

        if (record.getProfit() != null) {
            subSql.SELECT("sum(profit) as profit") ;
        }

        if (record.getProfitRef() != null) {
            subSql.SELECT("sum(profit_ref) as profit_ref") ;
        }

        if (record.getInvitationsDoctor() != null) {
            subSql.SELECT("sum(invitations_doctor) as invitations_doctor") ;
        }

        if (record.getInvitationsDoctorRead() != null) {
            subSql.SELECT("sum(invitations_doctor_read) as invitations_doctor_read") ;
        }

        if (record.getInvitationsDoctorRegister() != null) {
            subSql.SELECT("sum(invitations_doctor_register) as invitations_doctor_register") ;
        }

        if (record.getApplyClinic() != null) {
            subSql.SELECT("sum(apply_clinic) as apply_clinic") ;
        }

        if (record.getApplyClinicRead() != null) {
            subSql.SELECT("sum(apply_clinic_read) as apply_clinic_read") ;
        }

        if (record.getApplyClinicOk() != null) {
            subSql.SELECT("sum(apply_clinic_ok) as apply_clinic_ok") ;
        }

        if (record.getSendCustomer() != null) {
            subSql.SELECT("sum(send_customer) as send_customer") ;
        }

        if (record.getSendCustomerRead() != null) {
            subSql.SELECT("sum(send_customer_read) as send_customer_read") ;
        }

        if (record.getSendCustomerFollow() != null) {
            subSql.SELECT("sum(send_customer_follow) as send_customer_follow") ;
        }

        if (record.getClinicCount() != null) {
            subSql.SELECT("sum(clinic_count) as clinic_count") ;
        }
        subSql.FROM("doctor_statistics");
        subSql.GROUP_BY("doctor_id");


        SQL sql = new SQL();
        sql.SELECT("count(1)");
        sql.FROM("(" + subSql.toString()+ ")t");
        if (record.getPartnerCount() != null) {
            sql.WHERE("partner_count<=#{partnerCount,jdbcType=INTEGER}");
        }

        if (record.getPartnerTwo() != null) {
            sql.WHERE("partner_two<=#{partnerTwo,jdbcType=INTEGER}");
        }

        if (record.getCustomerCount() != null) {
            sql.WHERE("customer_count<=#{customerCount,jdbcType=INTEGER}");
        }

        if (record.getProfit() != null) {
            sql.WHERE("profit<=#{profit,jdbcType=DECIMAL}");
        }

        if (record.getProfitRef() != null) {
            sql.WHERE("profit_ref<=#{profitRef,jdbcType=DECIMAL}");
        }

        if (record.getInvitationsDoctor() != null) {
            sql.WHERE("invitations_doctor<=#{invitationsDoctor,jdbcType=INTEGER}");
        }

        if (record.getInvitationsDoctorRead() != null) {
            sql.WHERE("invitations_doctor_read<=#{invitationsDoctorRead,jdbcType=INTEGER}");
        }

        if (record.getInvitationsDoctorRegister() != null) {
            sql.WHERE("invitations_doctor_register<=#{invitationsDoctorRegister,jdbcType=INTEGER}");
        }

        if (record.getApplyClinic() != null) {
            sql.WHERE("apply_clinic<=#{applyClinic,jdbcType=INTEGER}");
        }

        if (record.getApplyClinicRead() != null) {
            sql.WHERE("apply_clinic_read<=#{applyClinicRead,jdbcType=INTEGER}");
        }

        if (record.getApplyClinicOk() != null) {
            sql.WHERE("apply_clinic_ok<=#{applyClinicOk,jdbcType=INTEGER}");
        }

        if (record.getSendCustomer() != null) {
            sql.WHERE("send_customer<=#{sendCustomer,jdbcType=INTEGER}");
        }

        if (record.getSendCustomerRead() != null) {
            sql.WHERE("send_customer_read<=#{sendCustomerRead,jdbcType=INTEGER}");
        }

        if (record.getSendCustomerFollow() != null) {
            sql.WHERE("send_customer_follow<=#{sendCustomerFollow,jdbcType=INTEGER}");
        }

        if (record.getClinicCount() != null) {
            sql.WHERE("clinic_count<=#{clinicCount,jdbcType=INTEGER}");
        }

        return sql.toString();
    }
}