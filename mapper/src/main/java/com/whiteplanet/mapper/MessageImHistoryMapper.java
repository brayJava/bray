package com.whiteplanet.mapper;


import com.whiteplanet.mapper.model.MessageImHistory;
import com.whiteplanet.mapper.model.MessageImHistoryExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface MessageImHistoryMapper {
    @SelectProvider(type=MessageImHistorySqlProvider.class, method="countByExample")
    int countByExample(MessageImHistoryExample example);

    @DeleteProvider(type=MessageImHistorySqlProvider.class, method="deleteByExample")
    int deleteByExample(MessageImHistoryExample example);

    @Delete({
        "delete from message_im_history",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into message_im_history (id, type, ",
        "title, content, ",
        "user_id, order_id, ",
        "send_date, del_flag)",
        "values (#{id,jdbcType=BIGINT}, #{type,jdbcType=INTEGER}, ",
        "#{title,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=VARCHAR}, #{orderId,jdbcType=VARCHAR}, ",
        "#{sendDate,jdbcType=TIMESTAMP}, #{delFlag,jdbcType=INTEGER})"
    })
    int insert(MessageImHistory record);

    @InsertProvider(type=MessageImHistorySqlProvider.class, method="insertSelective")
    int insertSelective(MessageImHistory record);

    @SelectProvider(type=MessageImHistorySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.BIGINT, id=true),
        @Result(column="type", property="type", jdbcType= JdbcType.INTEGER),
        @Result(column="title", property="title", jdbcType= JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType= JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType= JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="send_date", property="sendDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="del_flag", property="delFlag", jdbcType= JdbcType.INTEGER)
    })
    List<MessageImHistory> selectByExample(MessageImHistoryExample example);

    @Select({
        "select",
        "id, type, title, content, user_id, order_id, send_date, del_flag",
        "from message_im_history",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.BIGINT, id=true),
        @Result(column="type", property="type", jdbcType= JdbcType.INTEGER),
        @Result(column="title", property="title", jdbcType= JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType= JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType= JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="send_date", property="sendDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="del_flag", property="delFlag", jdbcType= JdbcType.INTEGER)
    })
    MessageImHistory selectByPrimaryKey(Long id);

    @UpdateProvider(type=MessageImHistorySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MessageImHistory record, @Param("example") MessageImHistoryExample example);

    @UpdateProvider(type=MessageImHistorySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MessageImHistory record, @Param("example") MessageImHistoryExample example);

    @UpdateProvider(type=MessageImHistorySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MessageImHistory record);

    @Update({
        "update message_im_history",
        "set type = #{type,jdbcType=INTEGER},",
          "title = #{title,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=VARCHAR},",
          "order_id = #{orderId,jdbcType=VARCHAR},",
          "send_date = #{sendDate,jdbcType=TIMESTAMP},",
          "del_flag = #{delFlag,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MessageImHistory record);

    @Select({
            "select",
            "id, type, title, content, user_id, order_id, send_date, del_flag",
            "from message_im_history",
            "where user_id = #{id,jdbcType=BIGINT}",
            "order by send_date desc",
            "limit #{index,jdbcType=INTEGER},#{pageSize,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.BIGINT, id=true),
            @Result(column="type", property="type", jdbcType= JdbcType.INTEGER),
            @Result(column="title", property="title", jdbcType= JdbcType.VARCHAR),
            @Result(column="content", property="content", jdbcType= JdbcType.VARCHAR),
            @Result(column="user_id", property="userId", jdbcType= JdbcType.VARCHAR),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="send_date", property="sendDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="del_flag", property="delFlag", jdbcType= JdbcType.INTEGER)
    })
    List<MessageImHistory> selectByDocId(@Param("id") String id, @Param("index") Integer index, @Param("pageSize") Integer pageSize);
}