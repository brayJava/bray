package com.whiteplanet.mapper;

import com.whiteplanet.mapper.data.DoctorClinicBean;
import com.whiteplanet.mapper.model.DoctorClinic;
import com.whiteplanet.mapper.model.DoctorClinicKey;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DoctorClinicMapper {
    @Delete({
            "delete from doctor_clinic",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and clinic_id = #{clinicId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(DoctorClinicKey key);

    @Insert({
            "insert into doctor_clinic (doctor_id, clinic_id, ",
            "create_date, `show` )",
            "values (#{doctorId,jdbcType=VARCHAR}, #{clinicId,jdbcType=VARCHAR}, ",
            "#{createDate,jdbcType=TIMESTAMP}, #{show,jdbcType=BIT})"
    })
    int insert(DoctorClinic record);

    @InsertProvider(type=DoctorClinicSqlProvider.class, method="insertSelective")
    int insertSelective(DoctorClinic record);

    @Select({
            "select",
            "doctor_id, clinic_id, create_date, `show`, status",
            "from doctor_clinic",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and clinic_id = #{clinicId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="show", property="show", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.BIT)
    })
    DoctorClinic selectByPrimaryKey(DoctorClinicKey key);

    @UpdateProvider(type=DoctorClinicSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DoctorClinic record);

    @Update({
            "update doctor_clinic",
            "set create_date = #{createDate,jdbcType=TIMESTAMP},",
            "`show` = #{show,jdbcType=BIT}",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and clinic_id = #{clinicId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DoctorClinic record);

    @Select({
            "select dc.clinic_id,d.real_name as docName,  " ,
            "d.status,d.id as docId, d.faceimg,d.department_name as departmentName ",
            "from doctor_clinic dc,doctor d,clinic c ",
            "where dc.clinic_id = c.id "

            ,
            "and c.doctor_id = d.id ",
            "and dc.doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "limit #{count,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="clinic_id", property="clinicId", jdbcType=JdbcType.VARCHAR),
            @Result(column="docName", property="doctorName", jdbcType=JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
            @Result(column="docId", property="doctorId", jdbcType=JdbcType.VARCHAR),
            @Result(column="departmentName", property="departmentName", jdbcType=JdbcType.VARCHAR),
            @Result(column="faceimg", property="faceImage", jdbcType=JdbcType.VARCHAR),
    })
    List<DoctorClinicBean> selectDoctorByDoctorId( @Param("doctorId") String doctorId, @Param("count") Integer count);

    @Update({
            "update doctor_clinic",
            "set `show` = if(`show`, false, true)",
            "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and clinic_id = #{clinicId, jdbcType=VARCHAR}"
    })
    int partnerHide(@Param("clinicId") String clinicId, @Param("doctorId") String doctorId);

    @Select({
            "select",
            "doctor_id, clinic_id, create_date, `show`",
            "from doctor_clinic",
            "where clinic_id = #{clinicId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="show", property="show", jdbcType= JdbcType.BIT)
    })
    List<DoctorClinicBean> selectByClinicId(String clinicId);

    @Select({
            "select",
            "doctor_id, clinic_id, create_date, `show`",
            "from doctor_clinic",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and doctor_clinic.status = 0"
    })
    @Results({
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="show", property="show", jdbcType= JdbcType.BIT)
    })
    List<DoctorClinicBean> selectByDoctorId(String doctorId);


    @Select({
        "select",
        "dc.clinic_id, dc.doctor_id, c.note",
        "from doctor_clinic as dc, clinic as c",
        "where c.doctor_id = #{clinicOwnerId, jdbcType=VARCHAR}",
        "and c.id = dc.clinic_id",
        "and dc.status = 0"
    })
    @Results({
        @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType= JdbcType.VARCHAR)
    })
    List<DoctorClinicBean> selectByClinicOwnerId(String clinicOwnerId);


    @Select({
        "select dcc.doctor_id, dcc.clinic_id, dcc.create_date, dcc.show, dcc.status",
        "from doctor_clinic dcc",
        "where exists(",
        "  select 1 from clinic c",
        "  where exists(",
        "    select 1 from doctor_clinic dc",
        "    where dc.doctor_id = c.doctor_id",
        "    and dc.clinic_id = #{clinicId, jdbcType=VARCHAR}",
        "  ) and dcc.clinic_id = c.id",
        ")",
        "and dcc.doctor_id = #{doctorId, jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="show", property="show", jdbcType= JdbcType.BIT),
        @Result(column="status", property="status", jdbcType= JdbcType.BIT)
    })
    List<DoctorClinic> findSecondDegreeDoctorClinicByDoctorClinicKey(DoctorClinicKey doctorClinicKey);

    @Select({
            "select count(1) from doctor_clinic where doctor_id = #{doctorId, jdbcType=VARCHAR} and status = 0"
    })
    int selectJoinClinicCountByDoctorId(String doctorId);

    @Select({
            "select count(1) from doctor_clinic dc where exists(",
            "   select id from clinic c where exists(",
            "       select 1",
            "        from doctor_clinic, clinic",
            "        where",
            "        clinic.id = doctor_clinic.clinic_id",
            "        and c.doctor_id = doctor_clinic.doctor_id",
            "        and doctor_clinic.clinic_id = #{clinicId, jdbcType=VARCHAR}",
            "        and doctor_clinic.status = 0",
            "   ) and c.id = dc.clinic_id",
            ") and status = 0"
    })
    int selectJoinClinicTowCountByClinicId(String clinicId);

    @Select({
            "select count(1) from doctor_clinic where clinic_id = #{clinicId, jdbcType=VARCHAR} and status = 0"
    })
    int selectCountByClinicId(String clinicId);
}