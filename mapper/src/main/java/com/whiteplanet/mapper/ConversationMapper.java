package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Conversation;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ConversationMapper {
    @Delete({
        "delete from conversation",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into conversation (id, roomId, ",
        "userId, type, status, `group`, ",
        "create_date, update_date)",
        "values (#{id,jdbcType=INTEGER}, #{roomid,jdbcType=VARCHAR}, ",
        "#{userid,jdbcType=VARCHAR}, #{type,jdbcType=INTEGER}, #{status,jdbcType=INTEGER}, #{group,jdbcType=BIT},",
        "#{createDate,jdbcType=TIMESTAMP}, #{updateDate,jdbcType=TIMESTAMP})"
    })
    int insert(Conversation record);

    @InsertProvider(type=ConversationSqlProvider.class, method="insertSelective")
    int insertSelective(Conversation record);

    @Select({
        "select",
        "id, roomId, userId, type, status,`group`, create_date, update_date",
        "from conversation",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="roomId", property="roomid", jdbcType= JdbcType.VARCHAR),
        @Result(column="userId", property="userid", jdbcType= JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType= JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="group", property="group", jdbcType= JdbcType.BIT),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    Conversation selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "count(1)",
            "from conversation",
            "where roomId = #{roomId,jdbcType=VARCHAR}",
            "and status = 0"
    })
    Integer selectByRoomId(String roomId);

    @Update({
            "update conversation set status = 1 where roomId = #{id,jdbcType=VARCHAR}"
    })
    int updateByRoomDisable(String roomId);

    @UpdateProvider(type=ConversationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Conversation record);

    @Update({
        "update conversation",
        "set roomId = #{roomid,jdbcType=VARCHAR},",
          "userId = #{userid,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
           "`group`= #{group,jdbcType=BIT},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Conversation record);

    @Select({
            "select ",
            "roomId",
            "from conversation ",
            "where userId in(#{user,jdbcType=VARCHAR}, #{friend,jdbcType=VARCHAR}) ",
            "and `group` = false and status =0 group by roomId having count(1) = 2"
    })
    String selectByUserAndFriend(@Param("user") String userId, @Param("friend") String friend);
}