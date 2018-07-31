package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.MessageLog;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface MessageLogMapper {
    @Delete({
        "delete from message_log",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into message_log (id, message_queue_int, ",
        "message_template_id, code, ",
        "create_date, kinde, ",
        "object_kide, object_id, ",
        "note)",
        "values (#{id,jdbcType=INTEGER}, #{messageQueueInt,jdbcType=VARCHAR}, ",
        "#{messageTemplateId,jdbcType=VARCHAR}, #{code,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{kinde,jdbcType=INTEGER}, ",
        "#{objectKide,jdbcType=INTEGER}, #{objectId,jdbcType=VARCHAR}, ",
        "#{note,jdbcType=LONGVARCHAR})"
    })
    int insert(MessageLog record);

    @InsertProvider(type=MessageLogSqlProvider.class, method="insertSelective")
    int insertSelective(MessageLog record);

    @Select({
        "select",
        "id, message_queue_int, message_template_id, code, create_date, kinde, object_kide, ",
        "object_id, note",
        "from message_log",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="message_queue_int", property="messageQueueInt", jdbcType= JdbcType.VARCHAR),
        @Result(column="message_template_id", property="messageTemplateId", jdbcType= JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="kinde", property="kinde", jdbcType= JdbcType.INTEGER),
        @Result(column="object_kide", property="objectKide", jdbcType= JdbcType.INTEGER),
        @Result(column="object_id", property="objectId", jdbcType= JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType= JdbcType.LONGVARCHAR)
    })
    MessageLog selectByPrimaryKey(Integer id);

    @UpdateProvider(type=MessageLogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MessageLog record);

    @Update({
        "update message_log",
        "set message_queue_int = #{messageQueueInt,jdbcType=VARCHAR},",
          "message_template_id = #{messageTemplateId,jdbcType=VARCHAR},",
          "code = #{code,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "kinde = #{kinde,jdbcType=INTEGER},",
          "object_kide = #{objectKide,jdbcType=INTEGER},",
          "object_id = #{objectId,jdbcType=VARCHAR},",
          "note = #{note,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(MessageLog record);

    @Update({
        "update message_log",
        "set message_queue_int = #{messageQueueInt,jdbcType=VARCHAR},",
          "message_template_id = #{messageTemplateId,jdbcType=VARCHAR},",
          "code = #{code,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "kinde = #{kinde,jdbcType=INTEGER},",
          "object_kide = #{objectKide,jdbcType=INTEGER},",
          "object_id = #{objectId,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MessageLog record);
}