package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorWithdrawals;
import org.apache.ibatis.jdbc.SQL;

public class DoctorWithdrawalsSqlProvider {

    public String insertSelective(DoctorWithdrawals record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("doctor_withdrawals");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getMoney() != null) {
            sql.VALUES("money", "#{money,jdbcType=DECIMAL}");
        }

        if (record.getServiceMoney() != null) {
            sql.VALUES("service_money", "#{serviceMoney,jdbcType=DECIMAL}");
        }

        if (record.getSuccessDate() != null) {
            sql.VALUES("success_date", "#{successDate,jdbcType=TIMESTAMP}");
        }

        if (record.getErrorDate() != null) {
            sql.VALUES("error_date", "#{errorDate,jdbcType=TIMESTAMP}");
        }

        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }

        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=INTEGER}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DoctorWithdrawals record) {
        SQL sql = new SQL();
        sql.UPDATE("doctor_withdrawals");

        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getMoney() != null) {
            sql.SET("money = #{money,jdbcType=DECIMAL}");
        }

        if (record.getServiceMoney() != null) {
            sql.SET("service_money = #{serviceMoney,jdbcType=DECIMAL}");
        }

        if (record.getSuccessDate() != null) {
            sql.SET("success_date = #{successDate,jdbcType=TIMESTAMP}");
        }

        if (record.getErrorDate() != null) {
            sql.SET("error_date = #{errorDate,jdbcType=TIMESTAMP}");
        }

        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateDate() != null) {
            sql.SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
        }

        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=INTEGER}");
        }

        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }
}