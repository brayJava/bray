package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorCeoReceive;
import org.apache.ibatis.jdbc.SQL;

public class DoctoCeoReceiveSqlProvider {

    public String insertSelective(DoctorCeoReceive record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("docto_ceo_receive");
        
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
        
        if (record.getPatientId() != null) {
            sql.VALUES("patient_id", "#{patientId,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientName() != null) {
            sql.VALUES("patient_name", "#{patientName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DoctorCeoReceive record) {
        SQL sql = new SQL();
        sql.UPDATE("docto_ceo_receive");
        
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