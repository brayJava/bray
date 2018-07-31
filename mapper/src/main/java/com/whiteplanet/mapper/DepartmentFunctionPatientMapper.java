package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DepartmentFunctionPatientKey;
import com.whiteplanet.mapper.model.DepartmentFunctionPatient;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface DepartmentFunctionPatientMapper {
    @Delete({
        "delete from department_function_patient",
        "where department_function_id = #{departmentFunctionId,jdbcType=VARCHAR}",
          "and label_notes_id = #{labelNotesId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(DepartmentFunctionPatientKey key);

    @Insert({
        "insert into department_function_patient (department_function_id, label_notes_id, ",
        "create_time, status)",
        "values (#{departmentFunctionId,jdbcType=VARCHAR}, #{labelNotesId,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{status,jdbcType=INTEGER})"
    })
    int insert(DepartmentFunctionPatient record);

    @InsertProvider(type=DepartmentFunctionPatientSqlProvider.class, method="insertSelective")
    int insertSelective(DepartmentFunctionPatient record);

    @Select({
        "select",
        "department_function_id, label_notes_id, create_time, status",
        "from department_function_patient",
        "where department_function_id = #{departmentFunctionId,jdbcType=VARCHAR}",
          "and label_notes_id = #{labelNotesId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="department_function_id", property="departmentFunctionId", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="label_notes_id", property="labelNotesId", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    DepartmentFunctionPatient selectByPrimaryKey(DepartmentFunctionPatientKey key);

    @UpdateProvider(type=DepartmentFunctionPatientSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DepartmentFunctionPatient record);

    @Update({
        "update department_function_patient",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER}",
        "where department_function_id = #{departmentFunctionId,jdbcType=VARCHAR}",
          "and label_notes_id = #{labelNotesId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DepartmentFunctionPatient record);
}