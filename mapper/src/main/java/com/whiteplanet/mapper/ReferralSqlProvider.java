package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Referral;
import org.apache.ibatis.jdbc.SQL;

public class ReferralSqlProvider {

    public String insertSelective(Referral record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("referral");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getSource() != null) {
            sql.VALUES("source", "#{source,jdbcType=INTEGER}");
        }

        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }

        if (record.getMoney() != null) {
            sql.VALUES("money", "#{money,jdbcType=BIT}");
        }

        if (record.getNeedsOrderId() != null) {
            sql.VALUES("needs_order_id", "#{needsOrderId,jdbcType=VARCHAR}");
        }

        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }

        if (record.getTimeout() != null) {
            sql.VALUES("timeout", "#{timeout,jdbcType=BIT}");
        }

        if (record.getTimeoutTime() != null) {
            sql.VALUES("timeout_time", "#{timeoutTime,jdbcType=TIMESTAMP}");
        }

        if (record.getNotes() != null) {
            sql.VALUES("notes", "#{notes,jdbcType=LONGVARCHAR}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Referral record) {
        SQL sql = new SQL();
        sql.UPDATE("referral");

        if (record.getSource() != null) {
            sql.SET("source = #{source,jdbcType=INTEGER}");
        }

        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }

        if (record.getMoney() != null) {
            sql.SET("money = #{money,jdbcType=BIT}");
        }

        if (record.getNeedsOrderId() != null) {
            sql.SET("needs_order_id = #{needsOrderId,jdbcType=VARCHAR}");
        }

        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }

        if (record.getTimeout() != null) {
            sql.SET("timeout = #{timeout,jdbcType=BIT}");
        }

        if (record.getTimeoutTime() != null) {
            sql.SET("timeout_time = #{timeoutTime,jdbcType=TIMESTAMP}");
        }

        if (record.getNotes() != null) {
            sql.SET("notes = #{notes,jdbcType=LONGVARCHAR}");
        }

        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }
}