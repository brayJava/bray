package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.MessageTemplate;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface MessageTemplateMapper {
    @Delete({
            "delete from message_template",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into message_template (id, kind, ",
            "code, dataitem, ",
            "create_date, update_date, ",
            "status, message_group_id, ",
            "note, role)",
            "values (#{id,jdbcType=VARCHAR}, #{kind,jdbcType=INTEGER}, ",
            "#{code,jdbcType=VARCHAR}, #{dataitem,jdbcType=VARCHAR}, ",
            "#{createDate,jdbcType=TIMESTAMP}, #{updateDate,jdbcType=TIMESTAMP}, ",
            "#{status,jdbcType=INTEGER}, #{messageGroupId,jdbcType=VARCHAR}, ",
            "#{note,jdbcType=LONGVARCHAR}, #{role, jdbcType=INTEGER})"
    })
    int insert(MessageTemplate record);

    @InsertProvider(type=MessageTemplateSqlProvider.class, method="insertSelective")
    int insertSelective(MessageTemplate record);

    @Select({
            "select",
            "id, kind, code, dataitem, create_date, update_date, status, message_group_id, ",
            "note, role",
            "from message_template",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="kind", property="kind", jdbcType= JdbcType.INTEGER),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="dataitem", property="dataitem", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="message_group_id", property="messageGroupId", jdbcType= JdbcType.VARCHAR),
            @Result(column="note", property="note", jdbcType= JdbcType.LONGVARCHAR),
            @Result(column = "role", property = "role", jdbcType = JdbcType.INTEGER)
    })
    MessageTemplate selectByPrimaryKey(String id);

    @UpdateProvider(type=MessageTemplateSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MessageTemplate record);

    @Update({
            "update message_template",
            "set kind = #{kind,jdbcType=INTEGER},",
            "code = #{code,jdbcType=VARCHAR},",
            "dataitem = #{dataitem,jdbcType=VARCHAR},",
            "create_date = #{createDate,jdbcType=TIMESTAMP},",
            "update_date = #{updateDate,jdbcType=TIMESTAMP},",
            "status = #{status,jdbcType=INTEGER},",
            "message_group_id = #{messageGroupId,jdbcType=VARCHAR},",
            "note = #{note,jdbcType=LONGVARCHAR},",
            "role = #{role, jdbcType=INTEGER}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(MessageTemplate record);

    @Update({
            "update message_template",
            "set kind = #{kind,jdbcType=INTEGER},",
            "code = #{code,jdbcType=VARCHAR},",
            "dataitem = #{dataitem,jdbcType=VARCHAR},",
            "create_date = #{createDate,jdbcType=TIMESTAMP},",
            "update_date = #{updateDate,jdbcType=TIMESTAMP},",
            "status = #{status,jdbcType=INTEGER},",
            "message_group_id = #{messageGroupId,jdbcType=VARCHAR},",
            "role = #{role, jdbcType=INTEGER}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(MessageTemplate record);

    @Select({
            "select",
            "id, kind, code, dataitem, create_date, update_date, status, message_group_id, ",
            "note, role",
            "from message_template",
            "where message_group_id = #{id,jdbcType=VARCHAR} " ,
            " and role = #{role,jdbcType=INTEGER} ",
            " and status = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="kind", property="kind", jdbcType= JdbcType.INTEGER),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="dataitem", property="dataitem", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="message_group_id", property="messageGroupId", jdbcType= JdbcType.VARCHAR),
            @Result(column="note", property="note", jdbcType= JdbcType.LONGVARCHAR),
            @Result(column = "role", property = "role", jdbcType = JdbcType.INTEGER)
    })
    List<MessageTemplate> selectByGroup(@Param("id") String id, @Param("role") Integer role);

        @Select({
                "select note",
                "from message_template",
                "where code = #{code,jdbcType=VARCHAR} " ,
                " and status = 0"
        })
        String selectNoteByCode(String code);
}