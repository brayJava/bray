package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.MessageGroup;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface MessageGroupMapper {
    @Delete({
        "delete from message_group",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into message_group (id, name, ",
        "code, create_date, ",
        "update_date, status, ",
        "note)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{code,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{status,jdbcType=INTEGER}, ",
        "#{note,jdbcType=LONGVARCHAR})"
    })
    int insert(MessageGroup record);

    @InsertProvider(type=MessageGroupSqlProvider.class, method="insertSelective")
    int insertSelective(MessageGroup record);

    @Select({
        "select",
        "id, name, code, create_date, update_date, status, note",
        "from message_group",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType= JdbcType.LONGVARCHAR)
    })
    MessageGroup selectByPrimaryKey(String id);

    @UpdateProvider(type=MessageGroupSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MessageGroup record);

    @Update({
        "update message_group",
        "set name = #{name,jdbcType=VARCHAR},",
          "code = #{code,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER},",
          "note = #{note,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(MessageGroup record);

    @Update({
        "update message_group",
        "set name = #{name,jdbcType=VARCHAR},",
          "code = #{code,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(MessageGroup record);

    @Select({
            "select",
            "id, name, code, create_date, update_date, status, note",
            "from message_group",
            "where code = #{code,jdbcType=VARCHAR}",
            " and status = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="note", property="note", jdbcType= JdbcType.LONGVARCHAR)
    })
    MessageGroup selectByCode(String code);
}