package com.whiteplanet.mapper;

import com.whiteplanet.mapper.data.DoctorPatientBean;
import com.whiteplanet.mapper.data.PatientDoctor;
import com.whiteplanet.mapper.model.DoctorPatientKey;
import com.whiteplanet.mapper.model.DoctorPatient;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DoctorPatientMapper {
    @Delete({
            "delete from doctor_patient",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and patient_id = #{patientId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(DoctorPatientKey key);

    @Insert({
            "insert into doctor_patient (doctor_id, patient_id, ",
            "silent, create_date, ",
            "update_date)",
            "values (#{doctorId,jdbcType=VARCHAR}, #{patientId,jdbcType=VARCHAR}, ",
            "#{silent,jdbcType=BIT}, #{createDate,jdbcType=TIMESTAMP}, ",
            "#{updateDate,jdbcType=TIMESTAMP})"
    })
    int insert(DoctorPatient record);

    @InsertProvider(type=DoctorPatientSqlProvider.class, method="insertSelective")
    int insertSelective(DoctorPatient record);

    @Select({
            "select",
            "doctor_id, patient_id, silent, `create_date`, update_date",
            "from doctor_patient",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and patient_id = #{patientId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="silent", property="silent", jdbcType= JdbcType.BIT),
            @Result(column="`create_date`", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    DoctorPatient selectByPrimaryKey(DoctorPatientKey key);

    @UpdateProvider(type=DoctorPatientSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DoctorPatient record);

    @Update({
            "update doctor_patient",
            "set silent = #{silent,jdbcType=BIT},",
            "`create_date` = #{createDate,jdbcType=TIMESTAMP},",
            "update_date = #{updateDate,jdbcType=TIMESTAMP}",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and patient_id = #{patientId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DoctorPatient record);

    @Update({
            "update doctor_patient",
            "set silent = #{silent, jdbcType=BIT},",
            "update_date = #{updateDate, jdbcType=TIMESTAMP}",
            "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and patient_id = #{patientId, jdbcType=VARCHAR}"
    })
    int updateSilentByDoctorPatient(DoctorPatient doctorPatient);


    @Select({
            "select d.department_name, d.id, d.sex, d.real_name, d.faceimg, d.department_function_name, d.hospital_name ,dp.silent",
            " from doctor d,doctor_patient dp, clinic c" ,
            " where d.id = dp.doctor_id" ,
            " and d.id = c.doctor_id" ,
            " and c.business = true",
            " and dp.patient_id = #{patientId,jdbcType=VARCHAR} "
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="real_name", property="realName", jdbcType= JdbcType.VARCHAR),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="faceimg", property="faceimg", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_name", property="departmentName", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_name", property="departmentFunctionName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR)
    })
    List<DoctorPatientBean> selectByPatientId(String patientId);

    /**
     *
     * @param patientId
     * @return
     */
    @Select({
            "select d.department_name, d.id, d.sex, d.real_name, d.faceimg,dp.create_date, d.department_function_name, d.hospital_name,c.business,dp.silent",
            "from doctor d, doctor_patient dp, clinic c" ,
            " where d.id = dp.doctor_id" ,
            " and d.id = c.doctor_id" ,
            " and dp.patient_id = #{patientId,jdbcType=VARCHAR} "
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="real_name", property="realName", jdbcType= JdbcType.VARCHAR),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="business", property="business", jdbcType= JdbcType.BIT),
            @Result(column="silent", property="silent", jdbcType= JdbcType.BIT),
            @Result(column="create_date", property="time", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="faceimg", property="faceimg", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_name", property="departmentName", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_name", property="departmentFunctionName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR)
    })
    List<PatientDoctor> selectByPatientIdEnable(String patientId);

    @Select({
            "select patient_id, doctor_id, silent, `create_date`, update_date",
            "from doctor_patient",
            "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and silent = 0",
            "limit #{count, jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "patient_id", property = "patientId" ,jdbcType = JdbcType.VARCHAR),
            @Result(column = "doctor_id", property = "doctorId" ,jdbcType = JdbcType.VARCHAR),
            @Result(column = "silent", property = "silent", jdbcType = JdbcType.BIT),
            @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_date", property = "updateDate", jdbcType = JdbcType.TIMESTAMP)
    })
    List<DoctorPatient> selectDoctorPatientByDoctorIdAndSilentFalse(@Param("doctorId") String doctorId, @Param("count") Integer count);
}