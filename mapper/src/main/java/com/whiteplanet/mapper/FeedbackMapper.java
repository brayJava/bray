package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Feedback;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface FeedbackMapper {
    @Delete({
        "delete from feedback",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into feedback (id, doctor_id, ",
        "patient_id, notes, phone, ",
        "create_time)",
        "values (#{id,jdbcType=INTEGER}, #{doctorId,jdbcType=VARCHAR}, ",
        "#{patientId,jdbcType=VARCHAR}, #{notes,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(Feedback record);

    @InsertProvider(type=FeedbackSqlProvider.class, method="insertSelective")
    int insertSelective(Feedback record);

    @Select({
        "select",
        "id, doctor_id, patient_id, notes, phone, create_time",
        "from feedback",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR),
        @Result(column="notes", property="notes", jdbcType= JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP)
    })
    Feedback selectByPrimaryKey(Integer id);
    @Select({
            "select",
            "id, doctor_id, patient_id, notes, phone, create_time",
            "from feedback",
            "order by create_time desc"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR),
            @Result(column="notes", property="notes", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP)
    })
    List<Feedback> selectAllFeedBack();


    @UpdateProvider(type=FeedbackSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Feedback record);

    @Update({
        "update feedback",
        "set doctor_id = #{doctorId,jdbcType=VARCHAR},",
          "patient_id = #{patientId,jdbcType=VARCHAR},",
          "notes = #{notes,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Feedback record);
}