package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DiagnosisStopMessage;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface DiagnosisStopMessageMapper {
    @Delete({
        "delete from diagnosis_stop_message",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into diagnosis_stop_message (id, not_time, ",
        "create_date, diagnosis_stop_id, ",
        "message)",
        "values (#{id,jdbcType=VARCHAR}, #{notTime,jdbcType=BIT}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{diagnosisStopId,jdbcType=VARCHAR}, ",
        "#{message,jdbcType=LONGVARCHAR})"
    })
    int insert(DiagnosisStopMessage record);

    @InsertProvider(type=DiagnosisStopMessageSqlProvider.class, method="insertSelective")
    int insertSelective(DiagnosisStopMessage record);

    @Select({
        "select",
        "id, not_time, create_date, diagnosis_stop_id, message",
        "from diagnosis_stop_message",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="not_time", property="notTime", jdbcType= JdbcType.BIT),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="diagnosis_stop_id", property="diagnosisStopId", jdbcType= JdbcType.VARCHAR),
        @Result(column="message", property="message", jdbcType= JdbcType.LONGVARCHAR)
    })
    DiagnosisStopMessage selectByPrimaryKey(String id);

    @UpdateProvider(type=DiagnosisStopMessageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DiagnosisStopMessage record);

    @Update({
        "update diagnosis_stop_message",
        "set not_time = #{notTime,jdbcType=BIT},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "diagnosis_stop_id = #{diagnosisStopId,jdbcType=VARCHAR},",
          "message = #{message,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(DiagnosisStopMessage record);

    @Update({
        "update diagnosis_stop_message",
        "set not_time = #{notTime,jdbcType=BIT},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "diagnosis_stop_id = #{diagnosisStopId,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DiagnosisStopMessage record);
}