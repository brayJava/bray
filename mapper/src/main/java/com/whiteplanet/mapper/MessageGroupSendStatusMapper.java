package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.MessageGroupSendStatus;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface MessageGroupSendStatusMapper {

    @Delete({
        "DELETE FROM message_group_send_status",
        "WHERE",
            "id = #{id, jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "INSERT INTO message_group_send_status",
            "(id, param_id, message_group_id, create_date)",
        "VALUES",
            "(#{id, jdbcType=INTEGER}, #{paramId, jdbcType=VARCHAR}, ",
            "#{messageGroupId, jdbcType=VARCHAR}, ",
            "#{createDate, jdbcType=TIMESTAMP})"
    })
    int insert(MessageGroupSendStatus messageGroupSendStatus);

    @Select({
        "SELECT",
            "id, param_id, message_group_id, create_date",
        "FROM",
            "message_group_send_status",
        "WHERE",
            "id = #{id, jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="param_id", property="paramId", jdbcType= JdbcType.VARCHAR),
            @Result(column="message_group_id", property="messageGroupId", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    MessageGroupSendStatus selectByPrimaryKey(Integer id);

    @Update({
        "UPDATE message_group_send_status",
        "SET",
            "param_id = #{paramId, jdbcType=VARCHAR},",
            "message_group_id = #{messageGroupId, jdbcType=VARCHAR},",
            "create_date = #{createDate, jdbcType=TIMESTAMP}",
        "WHERE",
            "id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MessageGroupSendStatus messageGroupSendStatus);

    @Select({
            "SELECT",
                "id, param_id, message_group_id, create_date",
            "FROM",
                "message_group_send_status",
            "WHERE",
                "param_id = #{paramId, jdbcType=VARCHAR}",
                "AND message_group_id = #{messageGroupId, jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="param_id", property="paramId", jdbcType= JdbcType.VARCHAR),
            @Result(column="message_group_id", property="messageGroupId", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    MessageGroupSendStatus selectByParamIdAndMessageGroupId(@Param("paramId") String paramId, @Param("messageGroupId") String messageGroupId);

}