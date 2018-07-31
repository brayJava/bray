package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorCalendar;
import org.apache.ibatis.jdbc.SQL;

public class DoctorCalendarSqlProvider {

    public String insertSelective(DoctorCalendar record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("doctor_calendar");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getWeek() != null) {
            sql.VALUES("week", "#{week,jdbcType=INTEGER}");
        }

        if (record.getStage() != null) {
            sql.VALUES("stage", "#{stage,jdbcType=INTEGER}");
        }

        if (record.getHospitalId() != null) {
            sql.VALUES("hospital_id", "#{hospitalId,jdbcType=VARCHAR}");
        }

        if (record.getHospitalName() != null) {
            sql.VALUES("hospital_name", "#{hospitalName,jdbcType=VARCHAR}");
        }

        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }

        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }

        if (record.getRoom() != null) {
            sql.VALUES("room", "#{room,jdbcType=VARCHAR}");
        }

        if (record.getOutpatientType() != null) {
            sql.VALUES("outpatient_type", "#{outpatientType,jdbcType=VARCHAR}");
        }

        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=INTEGER}");
        }

        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DoctorCalendar record) {
        SQL sql = new SQL();
        sql.UPDATE("doctor_calendar");

        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getWeek() != null) {
            sql.SET("week = #{week,jdbcType=INTEGER}");
        }

        if (record.getStage() != null) {
            sql.SET("stage = #{stage,jdbcType=INTEGER}");
        }

        if (record.getHospitalId() != null) {
            sql.SET("hospital_id = #{hospitalId,jdbcType=VARCHAR}");
        }

        if (record.getHospitalName() != null) {
            sql.SET("hospital_name = #{hospitalName,jdbcType=VARCHAR}");
        }

        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }

        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }

        if (record.getRoom() != null) {
            sql.SET("room = #{room,jdbcType=VARCHAR}");
        }

        if (record.getOutpatientType() != null) {
            sql.SET("outpatient_type = #{outpatientType,jdbcType=VARCHAR}");
        }

        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=INTEGER}");
        }

        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }

        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }
}