package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.IllnessDepartmentFunctionKey;
import org.apache.ibatis.jdbc.SQL;

public class IllnessDepartmentFunctionSqlProvider {

    public String insertSelective(IllnessDepartmentFunctionKey record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("illness_department_function");
        
        if (record.getIllnessId() != null) {
            sql.VALUES("illness_id", "#{illnessId,jdbcType=VARCHAR}");
        }
        
        if (record.getDepartmentFunctionId() != null) {
            sql.VALUES("department_function_id", "#{departmentFunctionId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }
}