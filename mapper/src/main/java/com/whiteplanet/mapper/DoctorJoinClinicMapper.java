package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorJoinClinic;
import com.whiteplanet.mapper.model.DoctorJoinClinicKey;
import com.whiteplanet.mapper.model.DoctorJoinClinicWithBLOBs;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DoctorJoinClinicMapper {
    @Delete({
            "delete from doctor_join_clinic",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and clinic_id = #{clinicId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(DoctorJoinClinicKey key);

    @Insert({
            "insert into doctor_join_clinic (doctor_id, clinic_id, ",
            "status, update_date, ",
            "create_date, readflag, ",
            "apply, invitation, ok_apply, ",
            "ok_invitation, apply_note, ",
            "invitation_note)",
            "values (#{doctorId,jdbcType=VARCHAR}, #{clinicId,jdbcType=VARCHAR}, ",
            "#{status,jdbcType=INTEGER}, #{updateDate,jdbcType=TIMESTAMP}, ",
            "#{createDate,jdbcType=TIMESTAMP}, #{readflag,jdbcType=INTEGER}, ",
            "#{apply,jdbcType=BIT}, #{invitation,jdbcType=BIT}, #{okApply,jdbcType=BIT}, ",
            "#{okInvitation,jdbcType=BIT}, #{applyNote,jdbcType=LONGVARCHAR}, ",
            "#{invitationNote,jdbcType=LONGVARCHAR})"
    })
    int insert(DoctorJoinClinicWithBLOBs record);

    @InsertProvider(type=DoctorJoinClinicSqlProvider.class, method="insertSelective")
    int insertSelective(DoctorJoinClinicWithBLOBs record);

    @Select({
            "select",
            "doctor_id, clinic_id, status, update_date, create_date, readflag, apply, invitation, ",
            "ok_apply, ok_invitation, apply_note, invitation_note",
            "from doctor_join_clinic",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and clinic_id = #{clinicId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="readflag", property="readflag", jdbcType= JdbcType.INTEGER),
            @Result(column="apply", property="apply", jdbcType= JdbcType.BIT),
            @Result(column="invitation", property="invitation", jdbcType= JdbcType.BIT),
            @Result(column="ok_apply", property="okApply", jdbcType= JdbcType.BIT),
            @Result(column="ok_invitation", property="okInvitation", jdbcType= JdbcType.BIT),
            @Result(column="apply_note", property="applyNote", jdbcType= JdbcType.LONGVARCHAR),
            @Result(column="invitation_note", property="invitationNote", jdbcType= JdbcType.LONGVARCHAR)
    })
    DoctorJoinClinicWithBLOBs selectByPrimaryKey(DoctorJoinClinicKey key);

    @UpdateProvider(type=DoctorJoinClinicSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DoctorJoinClinicWithBLOBs record);

    @Update({
            "update doctor_join_clinic",
            "set status = #{status,jdbcType=INTEGER},",
            "update_date = #{updateDate,jdbcType=TIMESTAMP},",
            "create_date = #{createDate,jdbcType=TIMESTAMP},",
            "readflag = #{readflag,jdbcType=INTEGER},",
            "apply = #{apply,jdbcType=BIT},",
            "invitation = #{invitation,jdbcType=BIT},",
            "ok_apply = #{okApply,jdbcType=BIT},",
            "ok_invitation = #{okInvitation,jdbcType=BIT},",
            "apply_note = #{applyNote,jdbcType=LONGVARCHAR},",
            "invitation_note = #{invitationNote,jdbcType=LONGVARCHAR}",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and clinic_id = #{clinicId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(DoctorJoinClinicWithBLOBs record);

    @Update({
            "update doctor_join_clinic",
            "set status = #{status,jdbcType=INTEGER},",
            "update_date = #{updateDate,jdbcType=TIMESTAMP},",
            "create_date = #{createDate,jdbcType=TIMESTAMP},",
            "readflag = #{readflag,jdbcType=INTEGER},",
            "apply = #{apply,jdbcType=BIT},",
            "invitation = #{invitation,jdbcType=BIT},",
            "ok_apply = #{okApply,jdbcType=BIT},",
            "ok_invitation = #{okInvitation,jdbcType=BIT}",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and clinic_id = #{clinicId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DoctorJoinClinic record);

    @Update({
            "update doctor_join_clinic",
            "set status = 1,",
            "update_date = #{updateDate,jdbcType = TIMESTAMP}",
            "where doctor_id = #{doctorId, jdbcType = VARCHAR}",
            "and clinic_id = #{clinicId, jdbcType = VARCHAR}",
            "and apply = #{apply, jdbcType = BIT}",
            "and invitation = #{invitation, jdbcType = BIT}",
            "and status = 0"
    })
    int updateStatusToOneByDoctorJoinClinic(DoctorJoinClinic doctorJoinClinic);

    @Select({
            "select",
            "doctor_id, apply_note",
            "from doctor_join_clinic",
            "where clinic_id = #{clinicId,jdbcType=VARCHAR}",
            "and apply = true",
            "and ok_apply = false"
    })
    @Results({
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="apply_note", property="applyNote", jdbcType= JdbcType.VARCHAR)
    })
    List<DoctorJoinClinicWithBLOBs> selectDoctorApplyByClinicId(@Param("clinicId") String clinicId);

    @Select({
            "select",
            "doctor_id, clinic_id, apply, ok_apply, ok_invitation",
            "from doctor_join_clinic",
            "where clinic_id = #{clinicId,jdbcType=VARCHAR}",
            "and doctor_id = #{doctorId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR),
            @Result(column="apply", property="apply", jdbcType= JdbcType.BIT),
            @Result(column = "invitation", property = "invitation", jdbcType= JdbcType.BIT),
            @Result(column="ok_apply", property="okApply", jdbcType= JdbcType.BIT),
            @Result(column="ok_invitation", property="okInvitation", jdbcType= JdbcType.BIT)
    })
    DoctorJoinClinic selectDoctorApplyByClinicIdAndDoctorId(@Param("clinicId") String clinicId, @Param("doctorId") String doctorId);

    @Select({
            "select",
            "doctor_id, apply_note,clinic_id",
            "from doctor_join_clinic",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and invitation = true",
            "and ok_invitation = false"
    })
    @Results({
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="invitation_note", property="invitationNote", jdbcType= JdbcType.VARCHAR)
    })
    List<DoctorJoinClinicWithBLOBs> selectDoctorInvitationByClinicId(@Param("doctorId") String doctorId);

    @Select({
            "select",
            "count(1)",
            "from doctor_join_clinic",
            "where doctor_id = #{doctor_id,jdbcType=VARCHAR}",
            "and invitation = true",
            "and ok_invitation = false"
    })
    int selectInvitationCountByClinicId(String clinicId);

    @Select({
            "select",
            "count(1)",
            "from doctor_join_clinic",
            "where clinic_id = #{clinicId,jdbcType=VARCHAR}",
            "and ok_apply = false",
            "and apply = true"
    })
    int selectApplyCountByClinicId(String clinicId);

    @Update({
            "update doctor_join_clinic",
            "set apply = #{apply, jdbcType=BIT}",
            "update_date = #{updateDate, jdbcType=TIMESTAMP}",
            "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and clinic_id = #{clinicId, jdbcType=VARCHAR}",
            "and status = 0"
    })
    int updateApplyByDoctorJoinClinic(DoctorJoinClinic doctorJoinClinic);

    @Update({
            "update doctor_join_clinic",
            "set invitation = #{invitation, jdbcType=BIT}",
            "update_date = #{updateDate,jdbcType=TIMESTAMP}",
            "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and clinic_id = #{clinicId,jdbcType=VARCHAR}",
            "and status = 0"
    })
    int updateInvitationByDoctorJoinClinic(DoctorJoinClinic doctorJoinClinic);

    @Select({
            " SELECT " ,
            " count(*)" ,
            " FROM " ,
            " doctor_join_clinic dc " ,
            " WHERE" ,
            " dc.invitation = TRUE" ,
            " AND date_format(dc.update_date, '%Y/%m/%d') = #{time,jdbcType=VARCHAR} "
    })
    int selectInvocationCount(String time);
    @Select({
            "SELECT " ,
            " count(DISTINCT clinic_id)" ,
            " FROM ",
            " doctor_join_clinic " ,
            " WHERE " ,
            " date_format(update_date, '%Y/%m/%d') = #{time,jdbcType=VARCHAR}"
            })
    int selectClinicAvgInvocationCount(String time);
}