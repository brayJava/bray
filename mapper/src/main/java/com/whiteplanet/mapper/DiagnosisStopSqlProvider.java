package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DiagnosisStop;
import org.apache.ibatis.jdbc.SQL;

public class DiagnosisStopSqlProvider {

  public String insertSelective(DiagnosisStop record) {
      SQL sql = new SQL();
      sql.INSERT_INTO("diagnosis_stop");

      if (record.getId() != null) {
          sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
      }

      if (record.getGroup() != null) {
          sql.VALUES("`group`", "#{group,jdbcType=VARCHAR}");
      }

      if (record.getOrderId() != null) {
          sql.VALUES("order_id", "#{orderId,jdbcType=VARCHAR}");
      }

      if (record.getStatus() != null) {
          sql.VALUES("`status`", "#{status,jdbcType=INTEGER}");
      }

      if (record.getText() != null) {
          sql.VALUES("text", "#{text,jdbcType=VARCHAR}");
      }

      if (record.getCreateDate() != null) {
          sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
      }

      if (record.getUpdateDate() != null) {
          sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
      }
      if (record.getId() != null) {
          sql.VALUES("patient_emergency_id", "#{patientEmergencyId,jdbcType=VARCHAR}");
      }

      return sql.toString();
  }

  public String updateByPrimaryKeySelective(DiagnosisStop record) {
      SQL sql = new SQL();
      sql.UPDATE("diagnosis_stop");

      if (record.getGroup() != null) {
          sql.SET("`group` = #{group,jdbcType=VARCHAR}");
      }

      if (record.getOrderId() != null) {
          sql.SET("order_id = #{orderId,jdbcType=VARCHAR}");
      }

      if (record.getStatus() != null) {
          sql.SET("`status` = #{status,jdbcType=INTEGER}");
      }

      if (record.getText() != null) {
          sql.SET("text = #{text,jdbcType=VARCHAR}");
      }

      if (record.getCreateDate() != null) {
          sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
      }

      if (record.getUpdateDate() != null) {
          sql.SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
      }

      if (record.getId() != null) {
          sql.SET("patient_emergency_id = #{patientEmergencyId,jdbcType=VARCHAR}");
      }

      sql.WHERE("id = #{id,jdbcType=VARCHAR}");

      return sql.toString();
  }
}
