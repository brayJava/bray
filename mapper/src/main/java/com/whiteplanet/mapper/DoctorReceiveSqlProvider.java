package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorReceive;
import org.apache.ibatis.jdbc.SQL;

public class DoctorReceiveSqlProvider {

    public String insertSelective(DoctorReceive record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("doctor_receive");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getMoney() != null) {
            sql.VALUES("money", "#{money,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorName() != null) {
            sql.VALUES("doctor_name", "#{doctorName,jdbcType=VARCHAR}");
        }
        
        if (record.getRefDoctorId() != null) {
            sql.VALUES("ref_doctor_id", "#{refDoctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getRefDoctorName() != null) {
            sql.VALUES("ref_doctor_name", "#{refDoctorName,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientId() != null) {
            sql.VALUES("patient_id", "#{patientId,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientName() != null) {
            sql.VALUES("patient_name", "#{patientName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DoctorReceive record) {
        SQL sql = new SQL();
        sql.UPDATE("doctor_receive");
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getMoney() != null) {
            sql.SET("money = #{money,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorName() != null) {
            sql.SET("doctor_name = #{doctorName,jdbcType=VARCHAR}");
        }
        
        if (record.getRefDoctorId() != null) {
            sql.SET("ref_doctor_id = #{refDoctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getRefDoctorName() != null) {
            sql.SET("ref_doctor_name = #{refDoctorName,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientId() != null) {
            sql.SET("patient_id = #{patientId,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientName() != null) {
            sql.SET("patient_name = #{patientName,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}