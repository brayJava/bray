package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.MessageTemplate;
import org.apache.ibatis.jdbc.SQL;

public class MessageTemplateSqlProvider {

    public String insertSelective(MessageTemplate record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("message_template");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getKind() != null) {
            sql.VALUES("kind", "#{kind,jdbcType=INTEGER}");
        }
        
        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
        }
        
        if (record.getDataitem() != null) {
            sql.VALUES("dataitem", "#{dataitem,jdbcType=VARCHAR}");
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
        
        if (record.getMessageGroupId() != null) {
            sql.VALUES("message_group_id", "#{messageGroupId,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.VALUES("note", "#{note,jdbcType=LONGVARCHAR}");
        }

        if (record.getRole() != null) {
            sql.VALUES("role", "#{role,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MessageTemplate record) {
        SQL sql = new SQL();
        sql.UPDATE("message_template");
        
        if (record.getKind() != null) {
            sql.SET("kind = #{kind,jdbcType=INTEGER}");
        }
        
        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getDataitem() != null) {
            sql.SET("dataitem = #{dataitem,jdbcType=VARCHAR}");
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
        
        if (record.getMessageGroupId() != null) {
            sql.SET("message_group_id = #{messageGroupId,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.SET("note = #{note,jdbcType=LONGVARCHAR}");
        }

        if (record.getRole() != null) {
            sql.SET("role = #{role,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}