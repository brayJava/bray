package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DiagnosisStopMessage;
import org.apache.ibatis.jdbc.SQL;

public class DiagnosisStopMessageSqlProvider {

    public String insertSelective(DiagnosisStopMessage record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("diagnosis_stop_message");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getNotTime() != null) {
            sql.VALUES("not_time", "#{notTime,jdbcType=BIT}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDiagnosisStopId() != null) {
            sql.VALUES("diagnosis_stop_id", "#{diagnosisStopId,jdbcType=VARCHAR}");
        }
        
        if (record.getMessage() != null) {
            sql.VALUES("message", "#{message,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DiagnosisStopMessage record) {
        SQL sql = new SQL();
        sql.UPDATE("diagnosis_stop_message");
        
        if (record.getNotTime() != null) {
            sql.SET("not_time = #{notTime,jdbcType=BIT}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDiagnosisStopId() != null) {
            sql.SET("diagnosis_stop_id = #{diagnosisStopId,jdbcType=VARCHAR}");
        }
        
        if (record.getMessage() != null) {
            sql.SET("message = #{message,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}