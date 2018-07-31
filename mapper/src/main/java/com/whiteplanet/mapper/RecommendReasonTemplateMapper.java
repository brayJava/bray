package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.RecommendReasonTemplate;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface RecommendReasonTemplateMapper {

    @Delete({
        "delete from recommend_reason_template",
        "where id = #{id, jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into recommend_reason_template",
        "(id, doctor_name, recommend_reason_id, recommend_reason, ",
        "`from`, source, enable, create_time)",
        "values",
        "(#{id, jdbcType=VARCHAR}, #{doctorName, jdbcType=VARCHAR}, ",
        "#{recommendReasonId, jdbcType=VARCHAR}, #{recommendReason, jdbcType=VARCHAR}, ",
        "#{from, jdbcType=VARCHAR}, #{source, jdbcType=INTEGER}, #{enable, jdbcType=BOOLEAN}, ",
        "#{createTime, jdbcType=TIMESTAMP})"
    })
    int insert(RecommendReasonTemplate recommendReasonTemplate);

    @Select({
        "select",
            "id, doctor_name, recommend_reason_id, recommend_reason, ",
            "`from`, source, enable, create_time",
        "from recommend_reason_template",
        "where id = #{id, jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
        @Result(column = "doctor_name", property = "doctorName", jdbcType = JdbcType.VARCHAR),
        @Result(column = "recommend_reason_id", property = "recommendReasonId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "recommend_reason", property = "recommendReason", jdbcType = JdbcType.VARCHAR),
        @Result(column = "from", property = "from", jdbcType = JdbcType.VARCHAR),
        @Result(column = "source", property = "source", jdbcType = JdbcType.INTEGER),
        @Result(column = "enable", property = "enable", jdbcType = JdbcType.BOOLEAN),
        @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP)
    })
    RecommendReasonTemplate selectByPrimaryKey(String id);

    @Update({
        "update recommend_reason_template",
        "set",
            "id = #{id, jdbcType=VARCHAR}, ",
            "doctor_name = #{doctorName, jdbcType=VARCHAR}, ",
            "recommend_reason_id = #{recommendReasonId, jdbcType=VARCHAR}, ",
            "recommend_reason = #{recommendReason, jdbcType=VARCHAR}, ",
            "`from` = #{from, jdbcType=VARCHAR}, ",
            "source = #{source, jdbcType=INTEGER}, ",
            "enable = #{enable, jdbcType=BOOLEAN}, ",
            "create_time = #{createTime, jdbcType=TIMESTAMP}",
        "where id = #{id, jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(RecommendReasonTemplate recommendReasonTemplate);

    @Select({
            "select",
            "id, doctor_name, recommend_reason_id, recommend_reason, ",
            "`from`, source, enable, create_time",
            "from recommend_reason_template",
            "where enable = TRUE"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "doctor_name", property = "doctorName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "recommend_reason_id", property = "recommendReasonId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "recommend_reason", property = "recommendReason", jdbcType = JdbcType.VARCHAR),
            @Result(column = "from", property = "from", jdbcType = JdbcType.VARCHAR),
            @Result(column = "source", property = "source", jdbcType = JdbcType.INTEGER),
            @Result(column = "enable", property = "enable", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP)
    })
    List<RecommendReasonTemplate> selectByEnable();

}
