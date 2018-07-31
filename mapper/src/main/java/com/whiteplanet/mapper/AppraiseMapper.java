package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Appraise;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface AppraiseMapper {
    @Delete({
        "delete from appraise",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into appraise (id, doctor_id, ",
        "comment, create_time, ",
        "order_id, major, ",
        "manner, effect)",
        "values (#{id,jdbcType=VARCHAR}, #{doctorId,jdbcType=VARCHAR}, ",
        "#{comment,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{orderId,jdbcType=VARCHAR}, #{major,jdbcType=INTEGER}, ",
        "#{manner,jdbcType=INTEGER}, #{effect,jdbcType=INTEGER})"
    })
    int insert(Appraise record);

    @InsertProvider(type=AppraiseSqlProvider.class, method="insertSelective")
    int insertSelective(Appraise record);

    @Select({
        "select",
        "id, doctor_id, comment, create_time, order_id, major, manner, effect",
        "from appraise",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="comment", property="comment", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="major", property="major", jdbcType= JdbcType.INTEGER),
        @Result(column="manner", property="manner", jdbcType= JdbcType.INTEGER),
        @Result(column="effect", property="effect", jdbcType= JdbcType.INTEGER)
    })
    Appraise selectByPrimaryKey(String id);

    @UpdateProvider(type=AppraiseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Appraise record);

    @Update({
        "update appraise",
        "set doctor_id = #{doctorId,jdbcType=VARCHAR},",
          "comment = #{comment,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "order_id = #{orderId,jdbcType=VARCHAR},",
          "major = #{major,jdbcType=INTEGER},",
          "manner = #{manner,jdbcType=INTEGER},",
          "effect = #{effect,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Appraise record);

    @Select({
        "select",
        "id, doctor_id, comment, create_time, order_id, major, manner, effect",
        "from appraise",
        "where order_id = #{orderId, jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="comment", property="comment", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="major", property="major", jdbcType= JdbcType.INTEGER),
        @Result(column="manner", property="manner", jdbcType= JdbcType.INTEGER),
        @Result(column="effect", property="effect", jdbcType= JdbcType.INTEGER)
    })
    Appraise selectByOrderId(String orderId);
}