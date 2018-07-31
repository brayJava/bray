package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.PatientDepartmentIllnessKey;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Collection;
import java.util.List;

public interface PatientDepartmentIllnessMapper {
    @Delete({
        "delete from patient_department_illness",
        "where patient_recommend_doctor_id = #{patientRecommendDoctorId,jdbcType=VARCHAR}",
          "and label_notes_id = #{labelNotesId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(PatientDepartmentIllnessKey key);

    @Insert({
        "insert into patient_department_illness (patient_recommend_doctor_id, label_notes_id)",
        "values (#{patientRecommendDoctorId,jdbcType=VARCHAR}, #{labelNotesId,jdbcType=VARCHAR})"
    })
    int insert(PatientDepartmentIllnessKey record);

    @Select({
            "select patient_recommend_doctor_id,label_notes_id from patient_department_illness",
            "where patient_recommend_doctor_id = #{recommendId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="patient_recommend_doctor_id", property="patientRecommendDoctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="label_notes_id", property="labelNotesId", jdbcType= JdbcType.VARCHAR)
    })
    List<PatientDepartmentIllnessKey> selectByRecommendId(String recommendId);

    @InsertProvider(type=PatientDepartmentIllnessSqlProvider.class, method="insertSelective")
    int insertSelective(PatientDepartmentIllnessKey record);

    @InsertProvider(type=PatientDepartmentIllnessSqlProvider.class, method="insertSelectives")
    int insertSelectives(@Param("records") Collection<PatientDepartmentIllnessKey> records);
}