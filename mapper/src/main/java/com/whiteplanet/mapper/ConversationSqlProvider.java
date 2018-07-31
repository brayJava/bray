package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Conversation;
import org.apache.ibatis.jdbc.SQL;

public class ConversationSqlProvider {

    public String insertSelective(Conversation record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("conversation");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getRoomid() != null) {
            sql.VALUES("roomId", "#{roomid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserid() != null) {
            sql.VALUES("userId", "#{userid,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }

        if (record.getGroup() != null) {
            sql.VALUES("`group`", " #{group,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Conversation record) {
        SQL sql = new SQL();
        sql.UPDATE("conversation");
        
        if (record.getRoomid() != null) {
            sql.SET("roomId = #{roomid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserid() != null) {
            sql.SET("userId = #{userid,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }

        if (record.getGroup() != null) {
            sql.SET("group= #{group,jdbcType=BIT}");
        }

        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}