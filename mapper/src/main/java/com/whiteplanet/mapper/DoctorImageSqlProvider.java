package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorImage;
import org.apache.ibatis.jdbc.SQL;

public class DoctorImageSqlProvider {

    public String insertSelective(DoctorImage record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("doctor_image");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getSort() != null) {
            sql.VALUES("sort", "#{sort,jdbcType=INTEGER}");
        }
        
        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getPubFileId() != null) {
            sql.VALUES("pub_file_id", "#{pubFileId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DoctorImage record) {
        SQL sql = new SQL();
        sql.UPDATE("doctor_image");
        
        if (record.getSort() != null) {
            sql.SET("sort = #{sort,jdbcType=INTEGER}");
        }
        
        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getPubFileId() != null) {
            sql.SET("pub_file_id = #{pubFileId,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}