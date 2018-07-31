package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.MessagePushHistory;
import com.whiteplanet.mapper.model.MessagePushHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface MessagePushHistoryMapper {
    @SelectProvider(type=MessagePushHistorySqlProvider.class, method="countByExample")
    int countByExample(MessagePushHistoryExample example);

    @DeleteProvider(type=MessagePushHistorySqlProvider.class, method="deleteByExample")
    int deleteByExample(MessagePushHistoryExample example);

    @Delete({
        "delete from message_push_history",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into message_push_history (id, doctorId, ",
        "type, orderId, transId, ",
        "receiveId, content, ",
        "audit_status, reason, ",
        "create_date)",
        "values (#{id,jdbcType=VARCHAR}, #{doctorid,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{orderid,jdbcType=VARCHAR}, #{transid,jdbcType=VARCHAR}, ",
        "#{receiveid,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{auditStatus,jdbcType=VARCHAR}, #{reason,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP})"
    })
    int insert(MessagePushHistory record);

    @InsertProvider(type=MessagePushHistorySqlProvider.class, method="insertSelective")
    int insertSelective(MessagePushHistory record);

    @SelectProvider(type=MessagePushHistorySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="doctorId", property="doctorid", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="orderId", property="orderid", jdbcType=JdbcType.VARCHAR),
        @Result(column="transId", property="transid", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiveId", property="receiveid", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="audit_status", property="auditStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="reason", property="reason", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MessagePushHistory> selectByExample(MessagePushHistoryExample example);

    @Select({
        "select",
        "id, doctorId, type, orderId, transId, receiveId, content, audit_status, reason, ",
        "create_date",
        "from message_push_history",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="doctorId", property="doctorid", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="orderId", property="orderid", jdbcType=JdbcType.VARCHAR),
        @Result(column="transId", property="transid", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiveId", property="receiveid", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="audit_status", property="auditStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="reason", property="reason", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP)
    })
    MessagePushHistory selectByPrimaryKey(String id);

    @UpdateProvider(type=MessagePushHistorySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MessagePushHistory record, @Param("example") MessagePushHistoryExample example);

    @UpdateProvider(type=MessagePushHistorySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MessagePushHistory record, @Param("example") MessagePushHistoryExample example);

    @UpdateProvider(type=MessagePushHistorySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MessagePushHistory record);

    @Update({
        "update message_push_history",
        "set doctorId = #{doctorid,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "orderId = #{orderid,jdbcType=VARCHAR},",
          "transId = #{transid,jdbcType=VARCHAR},",
          "receiveId = #{receiveid,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=VARCHAR},",
          "audit_status = #{auditStatus,jdbcType=VARCHAR},",
          "reason = #{reason,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(MessagePushHistory record);
}