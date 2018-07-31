package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.MessageLog;
import org.apache.ibatis.jdbc.SQL;

public class MessageLogSqlProvider {

    public String insertSelective(MessageLog record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("message_log");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getMessageQueueInt() != null) {
            sql.VALUES("message_queue_int", "#{messageQueueInt,jdbcType=VARCHAR}");
        }
        
        if (record.getMessageTemplateId() != null) {
            sql.VALUES("message_template_id", "#{messageTemplateId,jdbcType=VARCHAR}");
        }
        
        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getKinde() != null) {
            sql.VALUES("kinde", "#{kinde,jdbcType=INTEGER}");
        }
        
        if (record.getObjectKide() != null) {
            sql.VALUES("object_kide", "#{objectKide,jdbcType=INTEGER}");
        }
        
        if (record.getObjectId() != null) {
            sql.VALUES("object_id", "#{objectId,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.VALUES("note", "#{note,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MessageLog record) {
        SQL sql = new SQL();
        sql.UPDATE("message_log");
        
        if (record.getMessageQueueInt() != null) {
            sql.SET("message_queue_int = #{messageQueueInt,jdbcType=VARCHAR}");
        }
        
        if (record.getMessageTemplateId() != null) {
            sql.SET("message_template_id = #{messageTemplateId,jdbcType=VARCHAR}");
        }
        
        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getKinde() != null) {
            sql.SET("kinde = #{kinde,jdbcType=INTEGER}");
        }
        
        if (record.getObjectKide() != null) {
            sql.SET("object_kide = #{objectKide,jdbcType=INTEGER}");
        }
        
        if (record.getObjectId() != null) {
            sql.SET("object_id = #{objectId,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.SET("note = #{note,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}