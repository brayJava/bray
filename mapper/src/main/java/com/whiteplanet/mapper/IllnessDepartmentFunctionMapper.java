package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.IllnessDepartmentFunctionKey;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface IllnessDepartmentFunctionMapper {
    @Delete({
        "delete from illness_department_function",
        "where illness_id = #{illnessId,jdbcType=VARCHAR}",
          "and department_function_id = #{departmentFunctionId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(IllnessDepartmentFunctionKey key);

    @Insert({
        "insert into illness_department_function (illness_id, department_function_id)",
        "values (#{illnessId,jdbcType=VARCHAR}, #{departmentFunctionId,jdbcType=VARCHAR})"
    })
    int insert(IllnessDepartmentFunctionKey record);

    @InsertProvider(type=IllnessDepartmentFunctionSqlProvider.class, method="insertSelective")
    int insertSelective(IllnessDepartmentFunctionKey record);

    @Select({
            "select",
            "illness_id,department_function_id",
            "from illness_department_function",
            "where illness_id = #{illnessId,jdbcType=VARCHAR}",
            "and department_function_id = #{departmentFunctionId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="illness_id", property="illnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_id", property="departmentFunctionId", jdbcType= JdbcType.VARCHAR)
    })
    IllnessDepartmentFunctionKey selectByPrimaryKey(IllnessDepartmentFunctionKey key);
}