package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.RecommendReasonDoctor;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface RecommendReasonDoctorMapper {

    @Delete({
        "delete from recommend_reason_doctor",
        "where id = #{id, jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into recommend_reason_doctor",
        "(id, recommend_reason, doctor_id, doctor_name, `from`, create_time)",
        "values",
        "(#{id, jdbcType=VARCHAR}, #{recommendReason, jdbcType=VARCHAR}, ",
        "#{doctorId, jdbcType=VARCHAR}, #{doctorName, jdbcType=VARCHAR}, ",
        "#{from, jdbcType=VARCHAR}, #{createTime, jdbcType=TIMESTAMP})"
    })
    int insert(RecommendReasonDoctor recommendReasonDoctor);

    @Select({
        "select",
            "id, recommend_reason, doctor_id, doctor_name, `from`, create_time",
        "from recommend_reason_doctor",
        "where id = #{id, jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
        @Result(column = "recommend_reason", property = "recommendReason", jdbcType = JdbcType.VARCHAR),
        @Result(column = "doctor_id", property = "doctorId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "doctor_name", property = "doctorName", jdbcType = JdbcType.VARCHAR),
        @Result(column = "from", property = "from", jdbcType = JdbcType.VARCHAR),
        @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP)
    })
    RecommendReasonDoctor selectByPrimaryKey(String id);

    @Update({
        "update recommend_reason_doctor",
        "set",
            "id = #{id, jdbcType=VARCHAR}, ",
            "recommend_reason = #{recommendReason, jdbcType=VARCHAR}, ",
            "doctor_id = #{doctorId, jdbcType=VARCHAR}, ",
            "doctor_name = #{doctorName, jdbcType=VARCHAR}, ",
            "`from` = #{from, jdbcType=VARCHAR}, ",
            "create_time = #{createTime, jdbcType=TIMESTAMP}",
        "where id = #{id, jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(RecommendReasonDoctor recommendReasonDoctor);

}
