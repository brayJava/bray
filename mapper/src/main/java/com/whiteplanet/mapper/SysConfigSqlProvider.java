package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.SysConfig;
import org.apache.ibatis.jdbc.SQL;

public class SysConfigSqlProvider {

    public String insertSelective(SysConfig record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_config");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getKey() != null) {
            sql.VALUES("key", "#{key,jdbcType=VARCHAR}");
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
        
        if (record.getValue() != null) {
            sql.VALUES("value", "#{value,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SysConfig record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_config");
        
        if (record.getKey() != null) {
            sql.SET("key = #{key,jdbcType=VARCHAR}");
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
        
        if (record.getValue() != null) {
            sql.SET("value = #{value,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}