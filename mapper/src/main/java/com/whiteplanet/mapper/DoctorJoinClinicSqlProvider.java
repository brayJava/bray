package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorJoinClinicWithBLOBs;
import org.apache.ibatis.jdbc.SQL;

public class DoctorJoinClinicSqlProvider {

    public String insertSelective(DoctorJoinClinicWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("doctor_join_clinic");

        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getClinicId() != null) {
            sql.VALUES("clinic_id", "#{clinicId,jdbcType=VARCHAR}");
        }

        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }

        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }

        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getReadflag() != null) {
            sql.VALUES("readflag", "#{readflag,jdbcType=INTEGER}");
        }

        if (record.getApply() != null) {
            sql.VALUES("apply", "#{apply,jdbcType=BIT}");
        }

        if (record.getInvitation() != null) {
            sql.VALUES("invitation", "#{invitation,jdbcType=BIT}");
        }

        if (record.getOkApply() != null) {
            sql.VALUES("ok_apply", "#{okApply,jdbcType=BIT}");
        }

        if (record.getOkInvitation() != null) {
            sql.VALUES("ok_invitation", "#{okInvitation,jdbcType=BIT}");
        }

        if (record.getApplyNote() != null) {
            sql.VALUES("apply_note", "#{applyNote,jdbcType=LONGVARCHAR}");
        }

        if (record.getInvitationNote() != null) {
            sql.VALUES("invitation_note", "#{invitationNote,jdbcType=LONGVARCHAR}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DoctorJoinClinicWithBLOBs record) {
        SQL sql = new SQL();
        sql.UPDATE("doctor_join_clinic");

        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }

        if (record.getUpdateDate() != null) {
            sql.SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
        }

        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getReadflag() != null) {
            sql.SET("readflag = #{readflag,jdbcType=INTEGER}");
        }

        if (record.getApply() != null) {
            sql.SET("apply = #{apply,jdbcType=BIT}");
        }

        if (record.getInvitation() != null) {
            sql.SET("invitation = #{invitation,jdbcType=BIT}");
        }

        if (record.getOkApply() != null) {
            sql.SET("ok_apply = #{okApply,jdbcType=BIT}");
        }

        if (record.getOkInvitation() != null) {
            sql.SET("ok_invitation = #{okInvitation,jdbcType=BIT}");
        }

        if (record.getApplyNote() != null) {
            sql.SET("apply_note = #{applyNote,jdbcType=LONGVARCHAR}");
        }

        if (record.getInvitationNote() != null) {
            sql.SET("invitation_note = #{invitationNote,jdbcType=LONGVARCHAR}");
        }

        sql.WHERE("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        sql.WHERE("clinic_id = #{clinicId,jdbcType=VARCHAR}");

        return sql.toString();
    }
}