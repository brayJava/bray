package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorClinic;
import org.apache.ibatis.jdbc.SQL;

public class DoctorClinicSqlProvider {

    public String insertSelective(DoctorClinic record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("doctor_clinic");

        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getClinicId() != null) {
            sql.VALUES("clinic_id", "#{clinicId,jdbcType=VARCHAR}");
        }

        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getShow() != null) {
            sql.VALUES("`show`", "#{show,jdbcType=BIT}");
        }

        if (record.getStatus() != null) {
            sql.VALUES("`status`", "#{status,jdbcType=INTEGER}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DoctorClinic record) {
        SQL sql = new SQL();
        sql.UPDATE("doctor_clinic");

        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getShow() != null) {
            sql.SET("`show` = #{show,jdbcType=BIT}");
        }

        if (record.getStatus() != null) {
            sql.SET("`status` = #{status,jdbcType=INTEGER}");
        }

        sql.WHERE("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        sql.WHERE("clinic_id = #{clinicId,jdbcType=VARCHAR}");

        return sql.toString();
    }
}