package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Certificates;
import org.apache.ibatis.jdbc.SQL;

public class CertificatesSqlProvider {

    public String insertSelective(Certificates record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("certificates");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getPubFileId() != null) {
            sql.VALUES("pub_file_id", "#{pubFileId,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Certificates record) {
        SQL sql = new SQL();
        sql.UPDATE("certificates");
        
        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getPubFileId() != null) {
            sql.SET("pub_file_id = #{pubFileId,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}