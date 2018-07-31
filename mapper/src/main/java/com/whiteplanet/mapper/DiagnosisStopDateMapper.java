package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DiagnosisStopDate;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DiagnosisStopDateMapper {
  @Delete({
      "delete from diagnosis_stop_date",
      "where id = #{id,jdbcType=VARCHAR}"
  })
  int deleteByPrimaryKey(String id);

  @Insert({
      "insert into diagnosis_stop_date (id, `group`, ",
      "date_time, status, ",
      "stop, create_date, ",
      "update_date, doctor_calendar_id)",
      "values (#{id,jdbcType=VARCHAR}, #{group,jdbcType=VARCHAR}, ",
      "#{dateTime,jdbcType=TIMESTAMP}, #{status,jdbcType=INTEGER}, ",
      "#{stop,jdbcType=BIT}, #{createDate,jdbcType=TIMESTAMP}, ",
      "#{updateDate,jdbcType=TIMESTAMP}, #{doctorCalendarId,jdbcType=VARCHAR})"
  })
  int insert(DiagnosisStopDate record);

  @InsertProvider(type=DiagnosisStopDateSqlProvider.class, method="insertSelective")
  int insertSelective(DiagnosisStopDate record);

  @Select({
      "select",
      "id, `group`, date_time, status, stop, create_date, update_date, doctor_calendar_id",
      "from diagnosis_stop_date",
      "where id = #{id,jdbcType=VARCHAR}"
  })
  @Results({
      @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
      @Result(column="group", property="group", jdbcType= JdbcType.VARCHAR),
      @Result(column="date_time", property="dateTime", jdbcType= JdbcType.TIMESTAMP),
      @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
      @Result(column="stop", property="stop", jdbcType= JdbcType.BIT),
      @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
      @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
      @Result(column="doctor_calendar_id", property="doctorCalendarId", jdbcType= JdbcType.VARCHAR)
  })
  DiagnosisStopDate selectByPrimaryKey(String id);

  @UpdateProvider(type=DiagnosisStopDateSqlProvider.class, method="updateByPrimaryKeySelective")
  int updateByPrimaryKeySelective(DiagnosisStopDate record);

  @Update({
      "update diagnosis_stop_date",
      "set `group` = #{group,jdbcType=VARCHAR},",
        "date_time = #{dateTime,jdbcType=TIMESTAMP},",
        "status = #{status,jdbcType=INTEGER},",
        "stop = #{stop,jdbcType=BIT},",
        "create_date = #{createDate,jdbcType=TIMESTAMP},",
        "update_date = #{updateDate,jdbcType=TIMESTAMP},",
        "doctor_calendar_id = #{doctorCalendarId,jdbcType=VARCHAR}",
      "where id = #{id,jdbcType=VARCHAR}"
  })
  int updateByPrimaryKey(DiagnosisStopDate record);

  @Select({
        "select",
        "id, `group`, date_time, status, stop, create_date, update_date, doctor_calendar_id",
        "from diagnosis_stop_date",
        "where `group` = #{groupId, jdbcType=VARCHAR}"
  })
  @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="group", property="group", jdbcType= JdbcType.VARCHAR),
        @Result(column="date_time", property="dateTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="stop", property="stop", jdbcType= JdbcType.BIT),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="doctor_calendar_id", property="doctorCalendarId", jdbcType= JdbcType.VARCHAR)
  })
  List<DiagnosisStopDate> selectByGroupId(@Param("groupId") String groupId);

  @Select({
          "select",
          "id, `group`, date_time, status, stop, create_date, update_date, doctor_calendar_id",
          "from diagnosis_stop_date",
          "where doctor_calendar_id = #{id, jdbcType=VARCHAR}"
  })
  @Results({
          @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
          @Result(column="group", property="group", jdbcType= JdbcType.VARCHAR),
          @Result(column="date_time", property="dateTime", jdbcType= JdbcType.TIMESTAMP),
          @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
          @Result(column="stop", property="stop", jdbcType= JdbcType.BIT),
          @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
          @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
          @Result(column="doctor_calendar_id", property="doctorCalendarId", jdbcType= JdbcType.VARCHAR)
  })
  List<DiagnosisStopDate> selectDiagnosisStopDateListByDoctorCalendarId(String id);
}
