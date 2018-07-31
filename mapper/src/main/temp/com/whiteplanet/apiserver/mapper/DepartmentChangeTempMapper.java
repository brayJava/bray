package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.DepartmentChangeTemp;
import com.whiteplanet.mapper.model.DepartmentChangeTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface DepartmentChangeTempMapper {
    @SelectProvider(type=DepartmentChangeTempSqlProvider.class, method="countByExample")
    int countByExample(DepartmentChangeTempExample example);

    @DeleteProvider(type=DepartmentChangeTempSqlProvider.class, method="deleteByExample")
    int deleteByExample(DepartmentChangeTempExample example);

    @Delete({
        "delete from department_change_temp",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into department_change_temp (id, doc_id, ",
        "to_department_name, to_department_id, ",
        "to_function_id, to_function_name, ",
        "to_hospital_id, to_hospital_name, ",
        "del_flag, create_date)",
        "values (#{id,jdbcType=INTEGER}, #{docId,jdbcType=VARCHAR}, ",
        "#{toDepartmentName,jdbcType=VARCHAR}, #{toDepartmentId,jdbcType=VARCHAR}, ",
        "#{toFunctionId,jdbcType=VARCHAR}, #{toFunctionName,jdbcType=VARCHAR}, ",
        "#{toHospitalId,jdbcType=VARCHAR}, #{toHospitalName,jdbcType=VARCHAR}, ",
        "#{delFlag,jdbcType=INTEGER}, #{createDate,jdbcType=TIMESTAMP})"
    })
    int insert(DepartmentChangeTemp record);

    @InsertProvider(type=DepartmentChangeTempSqlProvider.class, method="insertSelective")
    int insertSelective(DepartmentChangeTemp record);

    @SelectProvider(type=DepartmentChangeTempSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="doc_id", property="docId", jdbcType=JdbcType.VARCHAR),
        @Result(column="to_department_name", property="toDepartmentName", jdbcType=JdbcType.VARCHAR),
        @Result(column="to_department_id", property="toDepartmentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="to_function_id", property="toFunctionId", jdbcType=JdbcType.VARCHAR),
        @Result(column="to_function_name", property="toFunctionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="to_hospital_id", property="toHospitalId", jdbcType=JdbcType.VARCHAR),
        @Result(column="to_hospital_name", property="toHospitalName", jdbcType=JdbcType.VARCHAR),
        @Result(column="del_flag", property="delFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<DepartmentChangeTemp> selectByExample(DepartmentChangeTempExample example);

    @Select({
        "select",
        "id, doc_id, to_department_name, to_department_id, to_function_id, to_function_name, ",
        "to_hospital_id, to_hospital_name, del_flag, create_date",
        "from department_change_temp",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="doc_id", property="docId", jdbcType=JdbcType.VARCHAR),
        @Result(column="to_department_name", property="toDepartmentName", jdbcType=JdbcType.VARCHAR),
        @Result(column="to_department_id", property="toDepartmentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="to_function_id", property="toFunctionId", jdbcType=JdbcType.VARCHAR),
        @Result(column="to_function_name", property="toFunctionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="to_hospital_id", property="toHospitalId", jdbcType=JdbcType.VARCHAR),
        @Result(column="to_hospital_name", property="toHospitalName", jdbcType=JdbcType.VARCHAR),
        @Result(column="del_flag", property="delFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP)
    })
    DepartmentChangeTemp selectByPrimaryKey(Integer id);

    @UpdateProvider(type=DepartmentChangeTempSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") DepartmentChangeTemp record, @Param("example") DepartmentChangeTempExample example);

    @UpdateProvider(type=DepartmentChangeTempSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") DepartmentChangeTemp record, @Param("example") DepartmentChangeTempExample example);

    @UpdateProvider(type=DepartmentChangeTempSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DepartmentChangeTemp record);

    @Update({
        "update department_change_temp",
        "set doc_id = #{docId,jdbcType=VARCHAR},",
          "to_department_name = #{toDepartmentName,jdbcType=VARCHAR},",
          "to_department_id = #{toDepartmentId,jdbcType=VARCHAR},",
          "to_function_id = #{toFunctionId,jdbcType=VARCHAR},",
          "to_function_name = #{toFunctionName,jdbcType=VARCHAR},",
          "to_hospital_id = #{toHospitalId,jdbcType=VARCHAR},",
          "to_hospital_name = #{toHospitalName,jdbcType=VARCHAR},",
          "del_flag = #{delFlag,jdbcType=INTEGER},",
          "create_date = #{createDate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DepartmentChangeTemp record);
}