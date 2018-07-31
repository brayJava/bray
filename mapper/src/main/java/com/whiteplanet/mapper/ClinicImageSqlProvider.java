package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.ClinicImage;
import org.apache.ibatis.jdbc.SQL;

public class ClinicImageSqlProvider {

    public String insertSelective(ClinicImage record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("clinic_image");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getSort() != null) {
            sql.VALUES("sort", "#{sort,jdbcType=INTEGER}");
        }
        
        if (record.getPubFileId() != null) {
            sql.VALUES("pub_file_id", "#{pubFileId,jdbcType=VARCHAR}");
        }
        
        if (record.getClinicId() != null) {
            sql.VALUES("clinic_id", "#{clinicId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ClinicImage record) {
        SQL sql = new SQL();
        sql.UPDATE("clinic_image");
        
        if (record.getSort() != null) {
            sql.SET("sort = #{sort,jdbcType=INTEGER}");
        }
        
        if (record.getPubFileId() != null) {
            sql.SET("pub_file_id = #{pubFileId,jdbcType=VARCHAR}");
        }
        
        if (record.getClinicId() != null) {
            sql.SET("clinic_id = #{clinicId,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}