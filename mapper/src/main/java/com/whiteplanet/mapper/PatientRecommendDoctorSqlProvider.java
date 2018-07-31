package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.PatientRecommendDoctor;
import org.apache.ibatis.jdbc.SQL;

public class PatientRecommendDoctorSqlProvider {

    public String insertSelective(PatientRecommendDoctor record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("patient_recommend_doctor");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientId() != null) {
            sql.VALUES("patient_id", "#{patientId,jdbcType=VARCHAR}");
        }

        if (record.getScore() != null) {
            sql.VALUES("score", "#{score,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PatientRecommendDoctor record) {
        SQL sql = new SQL();
        sql.UPDATE("patient_recommend_doctor");
        
        if (record.getPatientId() != null) {
            sql.SET("patient_id = #{patientId,jdbcType=VARCHAR}");
        }
        
        if (record.getScore() != null) {
            sql.SET("score = #{score,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}