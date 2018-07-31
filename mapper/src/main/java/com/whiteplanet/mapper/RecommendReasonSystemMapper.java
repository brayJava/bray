package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.RecommendReasonSystem;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface RecommendReasonSystemMapper {

    @Delete({
        "delete from recommend_reason_system",
        "where id = #{id, jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into recommend_reason_system",
        "(id, recommend_reason, `from`, create_time)",
        "values",
        "(#{id, jdbcType=VARCHAR}, #{recommendReason, jdbcType=VARCHAR}, ",
        "#{from, jdbcType=VARCHAR}, #{createTime, jdbcType=TIMESTAMP})"
    })
    int insert(RecommendReasonSystem recommendReasonSystem);

    @Select({
        "select",
            "id, recommend_reason, `from`, create_time",
        "from recommend_reason_system",
        "where id = #{id, jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
        @Result(column = "recommend_reason", property = "recommendReason", jdbcType = JdbcType.VARCHAR),
        @Result(column = "from", property = "from", jdbcType = JdbcType.VARCHAR),
        @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP)
    })
    RecommendReasonSystem selectByPrimaryKey(String id);

    @Update({
        "update recommend_reason_system",
        "set",
            "id = #{id, jdbcType=VARCHAR}, ",
            "recommend_reason = #{recommendReason, jdbcType=VARCHAR}, ",
            "`from` = #{from, jdbcType=VARCHAR}, ",
            "create_time = #{createTime, jdbcType=TIMESTAMP}",
        "where id = #{id, jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(RecommendReasonSystem recommendReasonSystem);

}
