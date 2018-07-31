package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.MatterDoctor;
import org.apache.ibatis.jdbc.SQL;

public class MatterDoctorSqlProvider {

    public String insertSelective(MatterDoctor record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("matter_doctor");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getKey() != null) {
            sql.VALUES("`key`", "#{key,jdbcType=VARCHAR}");
        }
        
        if (record.getParentkey() != null) {
            sql.VALUES("parentKey", "#{parentkey,jdbcType=VARCHAR}");
        }
        
        if (record.getValue() != null) {
            sql.VALUES("`value`", "#{value,jdbcType=BIT}");
        }
        
        if (record.getScore() != null) {
            sql.VALUES("score", "#{score,jdbcType=INTEGER}");
        }
        
        if (record.getPkey() != null) {
            sql.VALUES("pkey", "#{pkey,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(MatterDoctor record) {
        SQL sql = new SQL();
        sql.UPDATE("matter_doctor");
        
        if (record.getKey() != null) {
            sql.SET("`key` = #{key,jdbcType=VARCHAR}");
        }
        
        if (record.getParentkey() != null) {
            sql.SET("parentKey = #{parentkey,jdbcType=VARCHAR}");
        }
        
        if (record.getValue() != null) {
            sql.SET("`value` = #{value,jdbcType=BIT}");
        }
        
        if (record.getScore() != null) {
            sql.SET("score = #{score,jdbcType=INTEGER}");
        }
        
        if (record.getPkey() != null) {
            sql.SET("pkey = #{pkey,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    public String insertMatteSelective(String doctorId){
        return
            "insert into matter_doctor(`doctor_id`,`key`,`score`,`parentKey`)" +
            "SELECT '" + doctorId + "' as doctor_id, `key`,`score`,`parentKey`" +
            "FROM matter_temp as mt " +
            "where not exists(" +
            "SELECT 1 FROM matter_doctor md where md.`key` = mt.`key` " +
            "   and md.doctor_id = '"+doctorId+"')";
    }
}