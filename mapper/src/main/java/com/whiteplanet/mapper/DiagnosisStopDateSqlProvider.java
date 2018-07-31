package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DiagnosisStopDate;
import org.apache.ibatis.jdbc.SQL;

public class DiagnosisStopDateSqlProvider {

  public String insertSelective(DiagnosisStopDate record) {
      SQL sql = new SQL();
      sql.INSERT_INTO("diagnosis_stop_date");

      if (record.getId() != null) {
          sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
      }

      if (record.getGroup() != null) {
          sql.VALUES("group", "#{group,jdbcType=VARCHAR}");
      }

      if (record.getDateTime() != null) {
          sql.VALUES("date_time", "#{dateTime,jdbcType=TIMESTAMP}");
      }

      if (record.getStatus() != null) {
          sql.VALUES("status", "#{status,jdbcType=INTEGER}");
      }

      if (record.getStop() != null) {
          sql.VALUES("stop", "#{stop,jdbcType=BIT}");
      }

      if (record.getCreateDate() != null) {
          sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
      }

      if (record.getUpdateDate() != null) {
          sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
      }

      return sql.toString();
  }

  public String updateByPrimaryKeySelective(DiagnosisStopDate record) {
      SQL sql = new SQL();
      sql.UPDATE("diagnosis_stop_date");

      if (record.getGroup() != null) {
          sql.SET("group = #{group,jdbcType=VARCHAR}");
      }

      if (record.getDateTime() != null) {
          sql.SET("date_time = #{dateTime,jdbcType=TIMESTAMP}");
      }

      if (record.getStatus() != null) {
          sql.SET("status = #{status,jdbcType=INTEGER}");
      }

      if (record.getStop() != null) {
          sql.SET("stop = #{stop,jdbcType=BIT}");
      }

      if (record.getCreateDate() != null) {
          sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
      }

      if (record.getUpdateDate() != null) {
          sql.SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
      }

      sql.WHERE("id = #{id,jdbcType=VARCHAR}");

      return sql.toString();
  }
}
