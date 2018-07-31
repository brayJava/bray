package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.AppraiseDoctor;
import org.apache.ibatis.jdbc.SQL;

public class AppraiseDoctorSqlProvider {

    public String insertSelective(AppraiseDoctor record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("appraise_doctor");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorIdTarget() != null) {
            sql.VALUES("doctor_id_target", "#{doctorIdTarget,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getMajor() != null) {
            sql.VALUES("major", "#{major,jdbcType=INTEGER}");
        }
        if (record.getFamiliar() != null) {
            sql.VALUES("familiar", "#{familiar,jdbcType=INTEGER}");
        }
        
        if (record.getComment() != null) {
            sql.VALUES("comment", "#{comment,jdbcType=VARCHAR}");
        }
        
        if (record.getEthics() != null) {
            sql.VALUES("ethics", "#{ethics,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(AppraiseDoctor record) {
        SQL sql = new SQL();
        sql.UPDATE("appraise_doctor");
        
        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorIdTarget() != null) {
            sql.SET("doctor_id_target = #{doctorIdTarget,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=VARCHAR}");
        }

        if (record.getMajor() != null) {
            sql.SET("major = #{major,jdbcType=INTEGER}");
        }

        if (record.getFamiliar() != null) {
            sql.SET("familiar = #{familiar,jdbcType=INTEGER}");
        }

        if (record.getComment() != null) {
            sql.SET("comment = #{comment,jdbcType=VARCHAR}");
        }

        if (record.getEthics() != null) {
            sql.SET("ethics = #{ethics,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}