package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.PatientRecommendDoctor;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface PatientRecommendDoctorMapper {
    @Delete({
        "delete from patient_recommend_doctor",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into patient_recommend_doctor (id, patient_id, ",
        "score, create_date, ",
        "update_date, status)",
        "values (#{id,jdbcType=VARCHAR}, #{patientId,jdbcType=VARCHAR}, ",
        "#{score,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{status,jdbcType=INTEGER})"
    })
    int insert(PatientRecommendDoctor record);

    @InsertProvider(type=PatientRecommendDoctorSqlProvider.class, method="insertSelective")
    int insertSelective(PatientRecommendDoctor record);

    @Select({
        "select",
        "id, patient_id, score, create_date, update_date, ",
        "status",
        "from patient_recommend_doctor",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR),
        @Result(column="score", property="score", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    PatientRecommendDoctor selectByPrimaryKey(String id);

    @UpdateProvider(type=PatientRecommendDoctorSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PatientRecommendDoctor record);

    @Update({
        "update patient_recommend_doctor",
        "set patient_id = #{patientId,jdbcType=VARCHAR},",
          "score = #{score,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(PatientRecommendDoctor record);

    @Select({
            "select",
            "id, patient_id, score, create_date, update_date, ",
            "status",
            "from patient_recommend_doctor",
            "where patient_id = #{patientId,jdbcType=VARCHAR}",
            "and status = #{status,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR),
            @Result(column="score", property="score", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    PatientRecommendDoctor selectByPatientStatus(@Param("patientId") String patientId, @Param("status") Integer status);
}