package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Clinic;
import org.apache.ibatis.jdbc.SQL;

public class ClinicSqlProvider {

    public String insertSelective(Clinic record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("clinic");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }

        if (record.getNote() != null) {
            sql.VALUES("note", "#{note,jdbcType=VARCHAR}");
        }

        if (record.getDoctorCount() != null) {
            sql.VALUES("doctor_count", "#{doctorCount,jdbcType=INTEGER}");
        }

        if (record.getBusiness() != null) {
            sql.VALUES("business", "#{business,jdbcType=BIT}");
        }

        if (record.getBusinessDate() != null) {
            sql.VALUES("business_date", "#{businessDate,jdbcType=TIMESTAMP}");
        }

        if (record.getBusinessDay() != null) {
            sql.VALUES("business_day", "#{businessDay,jdbcType=INTEGER}");
        }

        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }

        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getAmount() != null) {
            sql.VALUES("amount", "#{amount,jdbcType=DECIMAL}");
        }

        if (record.getReceiveMoney() != null) {
            sql.VALUES("receive_money", "#{receiveMoney,jdbcType=DECIMAL}");
        }

        if (record.getMoney() != null) {
            sql.VALUES("money", "#{money,jdbcType=DECIMAL}");
        }

        if (record.getRefMoney() != null) {
            sql.VALUES("ref_money", "#{refMoney,jdbcType=DECIMAL}");
        }

        if (record.getServiceMoney() != null) {
            sql.VALUES("service_money", "#{serviceMoney,jdbcType=DECIMAL}");
        }

        if (record.getServiceWait() != null) {
            sql.VALUES("service_wait", "#{serviceWait,jdbcType=INTEGER}");
        }

        if (record.getDoctorRefCount() != null) {
            sql.VALUES("doctor_ref_count", "#{doctorRefCount,jdbcType=INTEGER}");
        }

        if (record.getDoctorReciveCount() != null) {
            sql.VALUES("doctor_recive_count", "#{doctorReciveCount,jdbcType=INTEGER}");
        }

        if (record.getDoctorDepartmentCount() != null) {
            sql.VALUES("doctor_department_count", "#{doctorDepartmentCount,jdbcType=INTEGER}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Clinic record) {
        SQL sql = new SQL();
        sql.UPDATE("clinic");

        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }

        if (record.getNote() != null) {
            sql.SET("note = #{note,jdbcType=VARCHAR}");
        }

        if (record.getDoctorCount() != null) {
            sql.SET("doctor_count = #{doctorCount,jdbcType=INTEGER}");
        }

        if (record.getBusiness() != null) {
            sql.SET("business = #{business,jdbcType=BIT}");
        }

        if (record.getBusinessDate() != null) {
            sql.SET("business_date = #{businessDate,jdbcType=TIMESTAMP}");
        }

        if (record.getBusinessDay() != null) {
            sql.SET("business_day = #{businessDay,jdbcType=INTEGER}");
        }

        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateDate() != null) {
            sql.SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
        }

        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getAmount() != null) {
            sql.SET("amount = #{amount,jdbcType=DECIMAL}");
        }

        if (record.getReceiveMoney() != null) {
            sql.SET("receive_money = #{receiveMoney,jdbcType=DECIMAL}");
        }

        if (record.getMoney() != null) {
            sql.SET("money = #{money,jdbcType=DECIMAL}");
        }

        if (record.getRefMoney() != null) {
            sql.SET("ref_money = #{refMoney,jdbcType=DECIMAL}");
        }

        if (record.getServiceMoney() != null) {
            sql.SET("service_money = #{serviceMoney,jdbcType=DECIMAL}");
        }

        if (record.getServiceWait() != null) {
            sql.SET("service_wait = #{serviceWait,jdbcType=INTEGER}");
        }

        if (record.getDoctorRefCount() != null) {
            sql.SET("doctor_ref_count = #{doctorRefCount,jdbcType=INTEGER}");
        }

        if (record.getDoctorReciveCount() != null) {
            sql.SET("doctor_recive_count = #{doctorReciveCount,jdbcType=INTEGER}");
        }

        if (record.getDoctorDepartmentCount() != null) {
            sql.SET("doctor_department_count = #{doctorDepartmentCount,jdbcType=INTEGER}");
        }

        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }
}