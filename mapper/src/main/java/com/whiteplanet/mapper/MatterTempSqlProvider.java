package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.MatterTemp;
import org.apache.ibatis.jdbc.SQL;

public class MatterTempSqlProvider {

    public String insertSelective(MatterTemp record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("matter_temp");
        
        if (record.getKey() != null) {
            sql.VALUES("key", "#{key,jdbcType=VARCHAR}");
        }
        
        if (record.getScore() != null) {
            sql.VALUES("score", "#{score,jdbcType=INTEGER}");
        }
        
        if (record.getKind() != null) {
            sql.VALUES("kind", "#{kind,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getParentkey() != null) {
            sql.VALUES("parentkey", "#{parentkey,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNotes() != null) {
            sql.VALUES("notes", "#{notes,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MatterTemp record) {
        SQL sql = new SQL();
        sql.UPDATE("matter_temp");
        
        if (record.getScore() != null) {
            sql.SET("score = #{score,jdbcType=INTEGER}");
        }
        
        if (record.getKind() != null) {
            sql.SET("kind = #{kind,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getParentkey() != null) {
            sql.SET("parentkey = #{parentkey,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNotes() != null) {
            sql.SET("notes = #{notes,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("key = #{key,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}