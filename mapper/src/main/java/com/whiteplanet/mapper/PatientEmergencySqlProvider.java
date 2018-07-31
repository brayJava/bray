package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.PatientEmergency;
import org.apache.ibatis.jdbc.SQL;

public class PatientEmergencySqlProvider {

    public String insertSelective(PatientEmergency record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("patient_emergency");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getText() != null) {
            sql.VALUES("text", "#{text,jdbcType=VARCHAR}");
        }
        
        if (record.getTime() != null) {
            sql.VALUES("time", "#{time,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PatientEmergency record) {
        SQL sql = new SQL();
        sql.UPDATE("patient_emergency");
        
        if (record.getText() != null) {
            sql.SET("text = #{text,jdbcType=VARCHAR}");
        }
        
        if (record.getTime() != null) {
            sql.SET("time = #{time,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}