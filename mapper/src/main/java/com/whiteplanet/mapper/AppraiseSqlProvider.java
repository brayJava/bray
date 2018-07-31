package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Appraise;
import org.apache.ibatis.jdbc.SQL;

public class AppraiseSqlProvider {

    public String insertSelective(Appraise record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("appraise");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.VALUES("comment", "#{comment,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getMajor() != null) {
            sql.VALUES("major", "#{major,jdbcType=INTEGER}");
        }
        
        if (record.getManner() != null) {
            sql.VALUES("manner", "#{manner,jdbcType=INTEGER}");
        }
        
        if (record.getEffect() != null) {
            sql.VALUES("effect", "#{effect,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Appraise record) {
        SQL sql = new SQL();
        sql.UPDATE("appraise");
        
        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.SET("comment = #{comment,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getMajor() != null) {
            sql.SET("major = #{major,jdbcType=INTEGER}");
        }
        
        if (record.getManner() != null) {
            sql.SET("manner = #{manner,jdbcType=INTEGER}");
        }
        
        if (record.getEffect() != null) {
            sql.SET("effect = #{effect,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}