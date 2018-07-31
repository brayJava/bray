package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.PubFile;
import org.apache.ibatis.jdbc.SQL;

public class PubFileSqlProvider {

    public String insertSelective(PubFile record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("pub_file");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getFileType() != null) {
            sql.VALUES("file_type", "#{fileType,jdbcType=VARCHAR}");
        }
        
        if (record.getFilePath() != null) {
            sql.VALUES("file_path", "#{filePath,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PubFile record) {
        SQL sql = new SQL();
        sql.UPDATE("pub_file");
        
        if (record.getFileType() != null) {
            sql.SET("file_type = #{fileType,jdbcType=VARCHAR}");
        }
        
        if (record.getFilePath() != null) {
            sql.SET("file_path = #{filePath,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}