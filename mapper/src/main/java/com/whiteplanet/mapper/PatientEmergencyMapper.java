package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.PatientEmergency;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface PatientEmergencyMapper {
    @Delete({
        "delete from patient_emergency",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into patient_emergency (id, text, ",
        "time, create_time, ",
        "update_time, status, ",
        "order_id)",
        "values (#{id,jdbcType=VARCHAR}, #{text,jdbcType=VARCHAR}, ",
        "#{time,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{status,jdbcType=INTEGER}, ",
        "#{orderId,jdbcType=VARCHAR})"
    })
    int insert(PatientEmergency record);

    @InsertProvider(type=PatientEmergencySqlProvider.class, method="insertSelective")
    int insertSelective(PatientEmergency record);

    @Select({
        "select",
        "id, text, time, create_time, update_time, status, order_id",
        "from patient_emergency",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="text", property="text", jdbcType= JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType= JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR)
    })
    PatientEmergency selectByPrimaryKey(String id);

    @UpdateProvider(type=PatientEmergencySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PatientEmergency record);

    @Update({
        "update patient_emergency",
        "set text = #{text,jdbcType=VARCHAR},",
          "time = #{time,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER},",
          "order_id = #{orderId,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(PatientEmergency record);

    @Select({
            "select",
            "id, text, time, create_time, update_time, status, order_id",
            "from patient_emergency",
            "where order_id = #{orderId, jdbcType=VARCHAR}",
            "and status = #{status, jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="text", property="text", jdbcType= JdbcType.VARCHAR),
            @Result(column="time", property="time", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR)
    })
    PatientEmergency selectByOrderId(@Param("orderId") String orderId, @Param("status") Integer status);

    @Select({
        "SELECT",
            "id, text, time, create_time, update_time, status, order_id",
        "FROM",
            "patient_emergency",
        "WHERE",
            "status = 0",
            "AND DATE_SUB(create_time,INTERVAL -1 DAY) < NOW()"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="text", property="text", jdbcType= JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType= JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR)
    })
    List<PatientEmergency> selectPatientEmergency24HoursByStatusZeroCreateTime();
}