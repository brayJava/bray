package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DepartmentFunctionPatient;
import org.apache.ibatis.jdbc.SQL;

public class DepartmentFunctionPatientSqlProvider {

    public String insertSelective(DepartmentFunctionPatient record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("department_function_patient");
        
        if (record.getDepartmentFunctionId() != null) {
            sql.VALUES("department_function_id", "#{departmentFunctionId,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelNotesId() != null) {
            sql.VALUES("label_notes_id", "#{labelNotesId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DepartmentFunctionPatient record) {
        SQL sql = new SQL();
        sql.UPDATE("department_function_patient");
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        sql.WHERE("department_function_id = #{departmentFunctionId,jdbcType=VARCHAR}");
        sql.WHERE("label_notes_id = #{labelNotesId,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}