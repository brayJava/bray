package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorPatient;
import org.apache.ibatis.jdbc.SQL;

public class DoctorPatientSqlProvider {

    public String insertSelective(DoctorPatient record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("doctor_patient");
        
        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientId() != null) {
            sql.VALUES("patient_id", "#{patientId,jdbcType=VARCHAR}");
        }
        
        if (record.getSilent() != null) {
            sql.VALUES("silent", "#{silent,jdbcType=BIT}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DoctorPatient record) {
        SQL sql = new SQL();
        sql.UPDATE("doctor_patient");
        
        if (record.getSilent() != null) {
            sql.SET("silent = #{silent,jdbcType=BIT}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        sql.WHERE("patient_id = #{patientId,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}