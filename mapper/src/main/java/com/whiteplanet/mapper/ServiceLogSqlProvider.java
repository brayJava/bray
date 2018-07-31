package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.ServiceLogWithBLOBs;
import org.apache.ibatis.jdbc.SQL;

public class ServiceLogSqlProvider {

    public String insertSelective(ServiceLogWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("service_log");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getServiceName() != null) {
            sql.VALUES("service_name", "#{serviceName,jdbcType=VARCHAR}");
        }
        
        if (record.getRestUrl() != null) {
            sql.VALUES("rest_url", "#{restUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getInputDate() != null) {
            sql.VALUES("input_date", "#{inputDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOutputDate() != null) {
            sql.VALUES("output_date", "#{outputDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDockerId() != null) {
            sql.VALUES("docker_id", "#{dockerId,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientId() != null) {
            sql.VALUES("patient_id", "#{patientId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInput() != null) {
            sql.VALUES("input", "#{input,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getOutput() != null) {
            sql.VALUES("output", "#{output,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ServiceLogWithBLOBs record) {
        SQL sql = new SQL();
        sql.UPDATE("service_log");
        
        if (record.getServiceName() != null) {
            sql.SET("service_name = #{serviceName,jdbcType=VARCHAR}");
        }
        
        if (record.getRestUrl() != null) {
            sql.SET("rest_url = #{restUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getInputDate() != null) {
            sql.SET("input_date = #{inputDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOutputDate() != null) {
            sql.SET("output_date = #{outputDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDockerId() != null) {
            sql.SET("docker_id = #{dockerId,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientId() != null) {
            sql.SET("patient_id = #{patientId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInput() != null) {
            sql.SET("input = #{input,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getOutput() != null) {
            sql.SET("output = #{output,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}