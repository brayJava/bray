package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Order;
import org.apache.ibatis.jdbc.SQL;

public class OrderSqlProvider {

    public String insertSelective(Order record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("order");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getPay() != null) {
            sql.VALUES("pay", "#{pay,jdbcType=BIT}");
        }

        if (record.getVis() != null) {
            sql.VALUES("vis", "#{vis,jdbcType=BIT}");
        }

        if (record.getAppraise() != null) {
            sql.VALUES("appraise", "#{appraise,jdbcType=BIT}");
        }

        if (record.getTimeout() != null) {
            sql.VALUES("timeout", "#{timeout,jdbcType=BIT}");
        }

        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }

        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }

        if (record.getNeedsOrderId() != null) {
            sql.VALUES("needs_order_id", "#{needsOrderId,jdbcType=VARCHAR}");
        }

        if (record.getCaseIllnessId() != null) {
            sql.VALUES("case_illness_id", "#{caseIllnessId,jdbcType=VARCHAR}");
        }

        if (record.getPayDate() != null) {
            sql.VALUES("pay_date", "#{payDate,jdbcType=TIMESTAMP}");
        }

        if (record.getVisDate() != null) {
            sql.VALUES("vis_date", "#{visDate,jdbcType=TIMESTAMP}");
        }

        if (record.getTimeoutDate() != null) {
            sql.VALUES("timeout_date", "#{timeoutDate,jdbcType=TIMESTAMP}");
        }

        if (record.getFinshDate() != null) {
            sql.VALUES("finsh_date", "#{finshDate,jdbcType=TIMESTAMP}");
        }

        if (record.getCancelDate() != null) {
            sql.VALUES("cancel_date", "#{cancelDate,jdbcType=TIMESTAMP}");
        }

        if (record.getAppraiseDate() != null) {
            sql.VALUES("appraise_date", "#{appraiseDate,jdbcType=TIMESTAMP}");
        }

        if(record.getFabulous() != null){
            sql.VALUES("fabulous" ,"#{fabulous,jdbcType=BIT}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Order record) {
        SQL sql = new SQL();
        sql.UPDATE("`order`");

        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getPay() != null) {
            sql.SET("pay = #{pay,jdbcType=BIT}");
        }

        if (record.getVis() != null) {
            sql.SET("vis = #{vis,jdbcType=BIT}");
        }

        if (record.getAppraise() != null) {
            sql.SET("appraise = #{appraise,jdbcType=BIT}");
        }

        if (record.getTimeout() != null) {
            sql.SET("timeout = #{timeout,jdbcType=BIT}");
        }

        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }

        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }

        if (record.getNeedsOrderId() != null) {
            sql.SET("needs_order_id = #{needsOrderId,jdbcType=VARCHAR}");
        }

        if (record.getCaseIllnessId() != null) {
            sql.SET("case_illness_id = #{caseIllnessId,jdbcType=VARCHAR}");
        }

        if (record.getPayDate() != null) {
            sql.SET("pay_date = #{payDate,jdbcType=TIMESTAMP}");
        }

        if (record.getVisDate() != null) {
            sql.SET("vis_date = #{visDate,jdbcType=TIMESTAMP}");
        }

        if (record.getTimeoutDate() != null) {
            sql.SET("timeout_date = #{timeoutDate,jdbcType=TIMESTAMP}");
        }

        if (record.getFinshDate() != null) {
            sql.SET("finsh_date = #{finshDate,jdbcType=TIMESTAMP}");
        }

        if (record.getCancelDate() != null) {
            sql.SET("cancel_date = #{cancelDate,jdbcType=TIMESTAMP}");
        }

        if (record.getAppraiseDate() != null) {
            sql.SET("appraise_date = #{appraiseDate,jdbcType=TIMESTAMP}");
        }

        if (record.getMoney() != null) {
            sql.SET("money = #{money,jdbcType=BOOLEAN}");
        }

        if (record.getTreatmentMoney() != null) {
            sql.SET("treatment_money = #{treatmentMoney,jdbcType=TIMESTAMP}");
        }

        if(record.getFabulous() != null){
            sql.SET("fabulous = #{fabulous,jdbcType=BIT}");
        }

        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }
}
