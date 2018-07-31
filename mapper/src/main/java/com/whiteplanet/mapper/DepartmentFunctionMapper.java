package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DepartmentFunction;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DepartmentFunctionMapper {
    @Delete({
            "delete from department_function",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into department_function (id, name, ",
            "pid, code, asname, ",
            "use_count, create_date, ",
            "update_date)",
            "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
            "#{pid,jdbcType=VARCHAR}, #{code,jdbcType=VARCHAR}, #{asname,jdbcType=VARCHAR}, ",
            "#{useCount,jdbcType=INTEGER}, #{createDate,jdbcType=TIMESTAMP}, ",
            "#{updateDate,jdbcType=TIMESTAMP})"
    })
    int insert(DepartmentFunction record);

    @InsertProvider(type=DepartmentFunctionSqlProvider.class, method="insertSelective")
    int insertSelective(DepartmentFunction record);

    @Select({
            "select",
            "id, name, pid, code, asname, use_count, create_date, update_date",
            "from department_function",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="pid", property="pid", jdbcType= JdbcType.VARCHAR),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="asname", property="asname", jdbcType= JdbcType.VARCHAR),
            @Result(column="use_count", property="useCount", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    DepartmentFunction selectByPrimaryKey(String id);

    @UpdateProvider(type=DepartmentFunctionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DepartmentFunction record);

    @Update({
            "update department_function",
            "set name = #{name,jdbcType=VARCHAR},",
            "pid = #{pid,jdbcType=VARCHAR},",
            "code = #{code,jdbcType=VARCHAR},",
            "asname = #{asname,jdbcType=VARCHAR},",
            "use_count = #{useCount,jdbcType=INTEGER},",
            "create_date = #{createDate,jdbcType=TIMESTAMP},",
            "update_date = #{updateDate,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DepartmentFunction record);

    @Select({
            "select",
            "id, name, pid, code, asname",
            "from department_function",
            "where name like CONCAT('%',#{text,jdbcType=VARCHAR},'%' )",
            "and pid is not null",
            "order by update_date asc",
            "limit #{count,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="pid", property="pid", jdbcType= JdbcType.VARCHAR),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="asname", property="asname", jdbcType= JdbcType.VARCHAR)
    })
    List<DepartmentFunction> selectByLikeName(String text,Integer count);

    @Select({
            "select",
            "id, name, pid, code, asname",
            "from department_function",
            "where code = '9999'",
            "and pid is not null",
            "order by update_date asc",
            "limit 1"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="pid", property="pid", jdbcType= JdbcType.VARCHAR),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="asname", property="asname", jdbcType= JdbcType.VARCHAR)
    })
    DepartmentFunction selectOther();


    @Select({
            "select",
            "id, name, pid, code, asname",
            "from department_function",
            "where pid = #{pid, jdbcType=VARCHAR}",
            "and name = #{name, jdbcType=VARCHAR}",
            "limit 1"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="pid", property="pid", jdbcType= JdbcType.VARCHAR),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="asname", property="asname", jdbcType= JdbcType.VARCHAR)
    })
    DepartmentFunction selectByPidAndName(@Param("pid") String pid, @Param("name") String name);


    @Select({
            "select df.id",
            "from department_function df,department_function_patient dfp",
            "where df.id = dfp.department_function_id",
            "and (exists(",
            "        select 1 from patient_department_illness t, patient_recommend_doctor p",
            "        where t.patient_recommend_doctor_id = p.id",
            "           and t.label_notes_id = dfp.label_notes_id",
            "           and p.patient_id = #{patientId, jdbcType=VARCHAR}",
            "        )",
            "     or exists(",
            "        select 1 from patient_home_illness t, patient_recommend_doctor p",
            "        where t.patient_recommend_doctor_id = p.id",
            "        and t.label_notes_id = dfp.label_notes_id",
            "        and p.patient_id = #{patientId, jdbcType=VARCHAR}",
            "        )",
            ")",
            "and dfp.status = 0"

            })
    List<String> selectByPatientId(@Param("patientId") String patientId);
}