package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.ReferralDoctor;
import org.apache.ibatis.jdbc.SQL;

public class ReferralDoctorSqlProvider {

    public String insertSelective(ReferralDoctor record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("referral_doctor");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getReferralId() != null) {
            sql.VALUES("referral_id", "#{referralId,jdbcType=VARCHAR}");
        }

        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }

        if (record.getMoney() != null) {
            sql.VALUES("money", "#{money,jdbcType=BIT}");
        }

        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ReferralDoctor record) {
        SQL sql = new SQL();
        sql.UPDATE("referral_doctor");

        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getReferralId() != null) {
            sql.SET("referral_id = #{referralId,jdbcType=VARCHAR}");
        }

        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }

        if (record.getMoney() != null) {
            sql.SET("money = #{money,jdbcType=BIT}");
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