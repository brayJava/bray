package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.MessageQueue;
import org.apache.ibatis.jdbc.SQL;

public class MessageQueueSqlProvider {

    public String insertSelective(MessageQueue record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("message_queue");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
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
        
        if (record.getSendDate() != null) {
            sql.VALUES("send_date", "#{sendDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getKinde() != null) {
            sql.VALUES("kinde", "#{kinde,jdbcType=INTEGER}");
        }
        
        if (record.getObjectKinde() != null) {
            sql.VALUES("object_kinde", "#{objectKinde,jdbcType=INTEGER}");
        }
        
        if (record.getObjectId() != null) {
            sql.VALUES("object_id", "#{objectId,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.VALUES("note", "#{note,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MessageQueue record) {
        SQL sql = new SQL();
        sql.UPDATE("message_queue");
        
        if (record.getMessageTemplateId() != null) {
            sql.SET("message_template_id = #{messageTemplateId,jdbcType=VARCHAR}");
        }
        
        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSendDate() != null) {
            sql.SET("send_date = #{sendDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getKinde() != null) {
            sql.SET("kinde = #{kinde,jdbcType=INTEGER}");
        }
        
        if (record.getObjectKinde() != null) {
            sql.SET("object_kinde = #{objectKinde,jdbcType=INTEGER}");
        }
        
        if (record.getObjectId() != null) {
            sql.SET("object_id = #{objectId,jdbcType=VARCHAR}");
        }
        
        if (record.getNote() != null) {
            sql.SET("note = #{note,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}