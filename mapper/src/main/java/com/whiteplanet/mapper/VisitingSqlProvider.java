package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Visiting;
import org.apache.ibatis.jdbc.SQL;

public class VisitingSqlProvider {

    public String insertSelective(Visiting record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("visiting");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=VARCHAR}");
        }

        if (record.getDoctorCalendarId() != null) {
            sql.VALUES("doctor_calendar_id", "#{doctorCalendarId,jdbcType=VARCHAR}");
        }

        if (record.getTime() != null) {
            sql.VALUES("time", "#{time,jdbcType=TIMESTAMP}");
        }

        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }

        if (record.getHospitalId() != null) {
            sql.VALUES("hospital_id", "#{hospitalId,jdbcType=VARCHAR}");
        }

        if (record.getHospitalName() != null) {
            sql.VALUES("hospital_name", "#{hospitalName,jdbcType=VARCHAR}");
        }

        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }

        if (record.getRoom() != null) {
            sql.VALUES("room", "#{room,jdbcType=VARCHAR}");
        }

        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Visiting record) {
        SQL sql = new SQL();
        sql.UPDATE("visiting");

        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=VARCHAR}");
        }

        if (record.getDoctorCalendarId() != null) {
            sql.SET("doctor_calendar_id = #{doctorCalendarId,jdbcType=VARCHAR}");
        }

        if (record.getTime() != null) {
            sql.SET("time = #{time,jdbcType=TIMESTAMP}");
        }

        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }

        if (record.getHospitalId() != null) {
            sql.SET("hospital_id = #{hospitalId,jdbcType=VARCHAR}");
        }

        if (record.getHospitalName() != null) {
            sql.SET("hospital_name = #{hospitalName,jdbcType=VARCHAR}");
        }

        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }

        if (record.getRoom() != null) {
            sql.SET("room = #{room,jdbcType=VARCHAR}");
        }

        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }

        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }
}