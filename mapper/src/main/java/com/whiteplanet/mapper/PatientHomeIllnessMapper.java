package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.PatientHomeIllnessKey;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Collection;
import java.util.List;

public interface PatientHomeIllnessMapper {
    @Delete({
        "delete from patient_home_illness",
        "where patient_recommend_doctor_id = #{patientRecommendDoctorId,jdbcType=VARCHAR}",
          "and label_notes_id = #{labelNotesId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(PatientHomeIllnessKey key);

    @Insert({
        "insert into patient_home_illness (patient_recommend_doctor_id, label_notes_id)",
        "values (#{patientRecommendDoctorId,jdbcType=VARCHAR}, #{labelNotesId,jdbcType=VARCHAR})"
    })
    int insert(PatientHomeIllnessKey record);

    @Select({
            "select patient_recommend_doctor_id,label_notes_id from patient_home_illness",
            "where patient_recommend_doctor_id = #{recommendId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="patient_recommend_doctor_id", property="patientRecommendDoctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="label_notes_id", property="labelNotesId", jdbcType= JdbcType.VARCHAR)
    })
    List<PatientHomeIllnessKey> selectByRecommendId(String recommendId);

    @InsertProvider(type=PatientHomeIllnessSqlProvider.class, method="insertSelective")
    int insertSelective(PatientHomeIllnessKey record);

    @InsertProvider(type=PatientHomeIllnessSqlProvider.class, method="insertSelectives")
    int insertSelectives(@Param("records") Collection<PatientHomeIllnessKey> records);
}