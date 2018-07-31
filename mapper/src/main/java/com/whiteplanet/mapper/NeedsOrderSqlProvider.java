package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.NeedsOrder;
import org.apache.ibatis.jdbc.SQL;

public class NeedsOrderSqlProvider {


    public String insertSelective(NeedsOrder record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("needs_order");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getDockerId() != null) {
            sql.VALUES("docker_id", "#{dockerId,jdbcType=VARCHAR}");
        }

        if (record.getCaseIllnessId() != null) {
            sql.VALUES("case_illness_id", "#{caseIllnessId,jdbcType=VARCHAR}");
        }

        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }

        if (record.getCancel() != null) {
            sql.VALUES("cancel", "#{cancel,jdbcType=INTEGER}");
        }

        if (record.getPay() != null) {
            sql.VALUES("pay", "#{pay,jdbcType=BIT}");
        }

        if (record.getRef() != null) {
            sql.VALUES("ref", "#{ref,jdbcType=BIT}");
        }

        if (record.getCancelDate() != null) {
            sql.VALUES("cancel_date", "#{cancelDate,jdbcType=TIMESTAMP}");
        }

        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(NeedsOrder record) {
        SQL sql = new SQL();
        sql.UPDATE("needs_order");

        if (record.getDockerId() != null) {
            sql.SET("docker_id = #{dockerId,jdbcType=VARCHAR}");
        }

        if (record.getCaseIllnessId() != null) {
            sql.SET("case_illness_id = #{caseIllnessId,jdbcType=VARCHAR}");
        }

        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }

        if (record.getCancel() != null) {
            sql.SET("cancel = #{cancel,jdbcType=INTEGER}");
        }

        if (record.getPay() != null) {
            sql.SET("pay = #{pay,jdbcType=BIT}");
        }

        if (record.getRef() != null) {
            sql.SET("ref = #{ref,jdbcType=BIT}");
        }

        if (record.getCancelDate() != null) {
            sql.SET("cancel_date = #{cancelDate,jdbcType=TIMESTAMP}");
        }

        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateDate() != null) {
            sql.SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
        }

        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }
}