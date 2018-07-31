package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.ServiceLog;
import com.whiteplanet.mapper.model.ServiceLogWithBLOBs;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ServiceLogMapper {
    @Delete({
        "delete from service_log",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into service_log (id, service_name, ",
        "rest_url, input_date, ",
        "output_date, docker_id, ",
        "patient_id, create_date, ",
        "input, output)",
        "values (#{id,jdbcType=INTEGER}, #{serviceName,jdbcType=VARCHAR}, ",
        "#{restUrl,jdbcType=VARCHAR}, #{inputDate,jdbcType=TIMESTAMP}, ",
        "#{outputDate,jdbcType=TIMESTAMP}, #{dockerId,jdbcType=VARCHAR}, ",
        "#{patientId,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{input,jdbcType=LONGVARCHAR}, #{output,jdbcType=LONGVARCHAR})"
    })
    int insert(ServiceLogWithBLOBs record);

    @InsertProvider(type=ServiceLogSqlProvider.class, method="insertSelective")
    int insertSelective(ServiceLogWithBLOBs record);

    @Select({
        "select",
        "id, service_name, rest_url, input_date, output_date, docker_id, patient_id, ",
        "create_date, input, output",
        "from service_log",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="service_name", property="serviceName", jdbcType= JdbcType.VARCHAR),
        @Result(column="rest_url", property="restUrl", jdbcType= JdbcType.VARCHAR),
        @Result(column="input_date", property="inputDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="output_date", property="outputDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="docker_id", property="dockerId", jdbcType= JdbcType.VARCHAR),
        @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="input", property="input", jdbcType= JdbcType.LONGVARCHAR),
        @Result(column="output", property="output", jdbcType= JdbcType.LONGVARCHAR)
    })
    ServiceLogWithBLOBs selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ServiceLogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ServiceLogWithBLOBs record);

    @Update({
        "update service_log",
        "set service_name = #{serviceName,jdbcType=VARCHAR},",
          "rest_url = #{restUrl,jdbcType=VARCHAR},",
          "input_date = #{inputDate,jdbcType=TIMESTAMP},",
          "output_date = #{outputDate,jdbcType=TIMESTAMP},",
          "docker_id = #{dockerId,jdbcType=VARCHAR},",
          "patient_id = #{patientId,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "input = #{input,jdbcType=LONGVARCHAR},",
          "output = #{output,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(ServiceLogWithBLOBs record);

    @Update({
        "update service_log",
        "set service_name = #{serviceName,jdbcType=VARCHAR},",
          "rest_url = #{restUrl,jdbcType=VARCHAR},",
          "input_date = #{inputDate,jdbcType=TIMESTAMP},",
          "output_date = #{outputDate,jdbcType=TIMESTAMP},",
          "docker_id = #{dockerId,jdbcType=VARCHAR},",
          "patient_id = #{patientId,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ServiceLog record);
}