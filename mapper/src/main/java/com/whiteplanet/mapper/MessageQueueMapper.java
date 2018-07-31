package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.MessageQueue;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface MessageQueueMapper {
    @Delete({
        "delete from message_queue",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into message_queue (id, message_template_id, ",
        "code, create_date, ",
        "send_date, status, ",
        "update_date, kinde, ",
        "object_kinde, object_id, ",
        "note)",
        "values (#{id,jdbcType=VARCHAR}, #{messageTemplateId,jdbcType=VARCHAR}, ",
        "#{code,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{sendDate,jdbcType=TIMESTAMP}, #{status,jdbcType=INTEGER}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{kinde,jdbcType=INTEGER}, ",
        "#{objectKinde,jdbcType=INTEGER}, #{objectId,jdbcType=VARCHAR}, ",
        "#{note,jdbcType=LONGVARCHAR})"
    })
    int insert(MessageQueue record);

    @InsertProvider(type=MessageQueueSqlProvider.class, method="insertSelective")
    int insertSelective(MessageQueue record);

    @Select({
        "select",
        "id, message_template_id, code, create_date, send_date, status, update_date, ",
        "kinde, object_kinde, object_id, note",
        "from message_queue",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="message_template_id", property="messageTemplateId", jdbcType= JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="send_date", property="sendDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="kinde", property="kinde", jdbcType= JdbcType.INTEGER),
        @Result(column="object_kinde", property="objectKinde", jdbcType= JdbcType.INTEGER),
        @Result(column="object_id", property="objectId", jdbcType= JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType= JdbcType.LONGVARCHAR)
    })
    MessageQueue selectByPrimaryKey(String id);

    @UpdateProvider(type=MessageQueueSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MessageQueue record);

    @Update({
        "update message_queue",
        "set message_template_id = #{messageTemplateId,jdbcType=VARCHAR},",
          "code = #{code,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "send_date = #{sendDate,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "kinde = #{kinde,jdbcType=INTEGER},",
          "object_kinde = #{objectKinde,jdbcType=INTEGER},",
          "object_id = #{objectId,jdbcType=VARCHAR},",
          "note = #{note,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(MessageQueue record);

    @Update({
        "update message_queue",
        "set message_template_id = #{messageTemplateId,jdbcType=VARCHAR},",
          "code = #{code,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "send_date = #{sendDate,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "kinde = #{kinde,jdbcType=INTEGER},",
          "object_kinde = #{objectKinde,jdbcType=INTEGER},",
          "object_id = #{objectId,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(MessageQueue record);
}