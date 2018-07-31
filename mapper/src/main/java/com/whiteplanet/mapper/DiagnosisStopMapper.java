package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DiagnosisStop;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DiagnosisStopMapper {
  @Delete({
          "delete from diagnosis_stop",
          "where id = #{id,jdbcType=VARCHAR}"
  })
  int deleteByPrimaryKey(String id);

  @Insert({
          "insert into diagnosis_stop (id, `group`, ",
          "order_id, `status`, ",
          "text, create_date, ",
          "update_date, patient_emergency_id)",
          "values (#{id,jdbcType=VARCHAR}, #{group,jdbcType=VARCHAR}, ",
          "#{orderId,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
          "#{text,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
          "#{updateDate,jdbcType=TIMESTAMP},#{patientEmergencyId,jdbcType=VARCHAR))"
  })
  int insert(DiagnosisStop record);

  @InsertProvider(type=DiagnosisStopSqlProvider.class, method="insertSelective")
  int insertSelective(DiagnosisStop record);

  @Select({
          "select",
          "id, `group`, order_id, `status`, text, create_date, update_date, patient_emergency_id",
          "from diagnosis_stop",
          "where id = #{id,jdbcType=VARCHAR}"
  })
  @Results({
          @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
          @Result(column="group", property="group", jdbcType= JdbcType.VARCHAR),
          @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
          @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
          @Result(column="text", property="text", jdbcType= JdbcType.VARCHAR),
          @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
          @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
          @Result(column="patient_emergency_id", property="patientEmergencyId", jdbcType= JdbcType.VARCHAR)
  })
  DiagnosisStop selectByPrimaryKey(String id);

  @UpdateProvider(type=DiagnosisStopSqlProvider.class, method="updateByPrimaryKeySelective")
  int updateByPrimaryKeySelective(DiagnosisStop record);

  @Update({
          "update diagnosis_stop",
          "set `group` = #{group,jdbcType=VARCHAR},",
          "order_id = #{orderId,jdbcType=VARCHAR},",
          "`status` = #{status,jdbcType=INTEGER},",
          "text = #{text,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP}",
          "patient_emergency_id = #{patientEmergencyId,jdbcType=VARCHAR}",
          "where id = #{id,jdbcType=VARCHAR}"
  })
  int updateByPrimaryKey(DiagnosisStop record);

  @Select({
          "select",
          "id, `group`, order_id, `status`, text, create_date, update_date,patient_emergency_id",
          "from diagnosis_stop",
          "where order_id = #{orderId, jdbcType=VARCHAR}",
          "and status = 0"
  })
  @Results({
          @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
          @Result(column="group", property="group", jdbcType= JdbcType.VARCHAR),
          @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
          @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
          @Result(column="text", property="text", jdbcType= JdbcType.VARCHAR),
          @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
          @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
          @Result(column="patient_emergency_id", property="patientEmergencyId", jdbcType= JdbcType.VARCHAR)
  })
  DiagnosisStop selectByOrderId(String orderId);

  @Select({
          "SELECT",
          "id, `group`, order_id, `status`, text, create_date, update_date, patient_emergency_id",
          "FROM",
          "diagnosis_stop",
          "WHERE",
          "status = 0",
          "AND DATE_SUB(create_date,INTERVAL -1 DAY) < NOW()"
  })
  @Results({
          @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
          @Result(column="group", property="group", jdbcType= JdbcType.VARCHAR),
          @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
          @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
          @Result(column="text", property="text", jdbcType= JdbcType.VARCHAR),
          @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
          @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
          @Result(column="patient_emergency_id", property="patientEmergencyId", jdbcType= JdbcType.VARCHAR)
  })
  List<DiagnosisStop> selectDiagnosisStop24ByStatusZeroAndCreateTime();
}
