package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.RecommendReasonShareDoctor;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface RecommendReasonShareDoctorMapper {

    @Delete({
        "delete from recommend_reason_share_doctor",
        "where id = #{id, jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into recommend_reason_share_doctor",
        "(id, group_id, doctor_id, recommend_reason_id, recommend_reason_doctor_name, ",
        "recommend_reason, `from`, source, create_time)",
        "values",
        "(#{id, jdbcType=VARCHAR}, #{groupId, jdbcType=VARCHAR}, #{doctorId, jdbcType=VARCHAR}, ",
        "#{recommendReasonId, jdbcType=VARCHAR}, #{recommendReasonDoctorName, jdbcType=VARCHAR}, ",
        "#{recommendReason, jdbcType=VARCHAR}, #{from, jdbcType=VARCHAR}, #{source, jdbcType=INTEGER}, ",
        "#{createTime, jdbcType=TIMESTAMP})"
    })
    int insert(RecommendReasonShareDoctor recommendReasonShareDoctor);

    @Select({
        "select",
            "id, group_id, doctor_id, recommend_reason_id, recommend_reason_doctor_name, ",
            "recommend_reason, `from`, source, create_time",
        "from recommend_reason_share_doctor",
        "where id = #{id, jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
        @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "doctor_id", property = "doctorId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "recommend_reason_id", property = "recommendReasonId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "recommend_reason_doctor_name", property = "recommendReasonDoctorName", jdbcType = JdbcType.VARCHAR),
        @Result(column = "recommend_reason", property = "recommendReason", jdbcType = JdbcType.VARCHAR),
        @Result(column = "from", property = "from", jdbcType = JdbcType.VARCHAR),
        @Result(column = "source", property = "source", jdbcType = JdbcType.INTEGER),
        @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP)
    })
    RecommendReasonShareDoctor selectByPrimaryKey(String id);

    @Update({
        "update recommend_reason_share_doctor",
        "set",
            "id = #{id, jdbcType=VARCHAR}, ",
            "group_id = #{groupId, jdbcType=VARCHAR}, ",
            "doctor_id = #{doctorId, jdbcType=VARCHAR}, ",
            "recommend_reason_id = #{recommendReasonId, jdbcType=VARCHAR}, ",
            "recommend_reason_doctor_name = #{recommendReasonDoctorName, jdbcType=VARCHAR}, ",
            "recommend_reason = #{recommendReason, jdbcType=VARCHAR}, ",
            "`from` = #{from, jdbcType=VARCHAR}, ",
            "source = #{source, jdbcType=INTEGER}, ",
            "create_time = #{createTime, jdbcType=TIMESTAMP}",
        "where id = #{id, jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(RecommendReasonShareDoctor recommendReasonShareDoctor);

    @Select({
        "select",
        "id, group_id, doctor_id, recommend_reason_id, recommend_reason_doctor_name, ",
        "recommend_reason, `from`, source, create_time",
        "from recommend_reason_share_doctor",
        "where group_id = #{groupId, jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
        @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "doctor_id", property = "doctorId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "recommend_reason_id", property = "recommendReasonId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "recommend_reason_doctor_name", property = "recommendReasonDoctorName", jdbcType = JdbcType.VARCHAR),
        @Result(column = "recommend_reason", property = "recommendReason", jdbcType = JdbcType.VARCHAR),
        @Result(column = "from", property = "from", jdbcType = JdbcType.VARCHAR),
        @Result(column = "source", property = "source", jdbcType = JdbcType.INTEGER),
        @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP)
    })
    List<RecommendReasonShareDoctor> selectRecommendReasonShareDoctorListByGroupId(String groupId);

}
