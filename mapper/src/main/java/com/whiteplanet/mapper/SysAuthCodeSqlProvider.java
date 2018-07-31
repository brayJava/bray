package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.SysAuthCode;
import org.apache.ibatis.jdbc.SQL;

public class SysAuthCodeSqlProvider {

    public String insertSelective(SysAuthCode record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_auth_code");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getDoctor() != null) {
            sql.VALUES("doctor", "#{doctor,jdbcType=BIT}");
        }
        
        if (record.getToken() != null) {
            sql.VALUES("token", "#{token,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAccountId() != null) {
            sql.VALUES("account_id", "#{accountId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SysAuthCode record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_auth_code");
        
        if (record.getDoctor() != null) {
            sql.SET("doctor = #{doctor,jdbcType=BIT}");
        }
        
        if (record.getToken() != null) {
            sql.SET("token = #{token,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAccountId() != null) {
            sql.SET("account_id = #{accountId,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}