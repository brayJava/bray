package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.OrderPay;
import org.apache.ibatis.jdbc.SQL;

public class OrderPaySqlProvider {

    public String insertSelective(OrderPay record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("order_pay");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getMoney() != null) {
            sql.VALUES("money", "#{money,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSource() != null) {
            sql.VALUES("source", "#{source,jdbcType=INTEGER}");
        }
        
        if (record.getServiceOrderId() != null) {
            sql.VALUES("service_order_id", "#{serviceOrderId,jdbcType=VARCHAR}");
        }
        
        if (record.getSecondOrderId() != null) {
            sql.VALUES("second_order_id", "#{secondOrderId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorName() != null) {
            sql.VALUES("doctor_name", "#{doctorName,jdbcType=VARCHAR}");
        }
        
        if (record.getRefDoctorId() != null) {
            sql.VALUES("ref_doctor_id", "#{refDoctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getRefDoctorName() != null) {
            sql.VALUES("ref_doctor_name", "#{refDoctorName,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientId() != null) {
            sql.VALUES("patient_id", "#{patientId,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientName() != null) {
            sql.VALUES("patient_name", "#{patientName,jdbcType=VARCHAR}");
        }

        if (record.getErrStatus() != null) {
            sql.VALUES("err_status", "#{errStatus,jdbcType=INTEGER}");
        }
        if (record.getErrDate() != null) {
            sql.VALUES("err_date", "#{errDate,jdbcType=TIMESTAMP}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(OrderPay record) {
        SQL sql = new SQL();
        sql.UPDATE("order_pay");
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getMoney() != null) {
            sql.SET("money = #{money,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSource() != null) {
            sql.SET("source = #{source,jdbcType=INTEGER}");
        }
        
        if (record.getServiceOrderId() != null) {
            sql.SET("service_order_id = #{serviceOrderId,jdbcType=VARCHAR}");
        }
        
        if (record.getSecondOrderId() != null) {
            sql.SET("second_order_id = #{secondOrderId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorName() != null) {
            sql.SET("doctor_name = #{doctorName,jdbcType=VARCHAR}");
        }
        
        if (record.getRefDoctorId() != null) {
            sql.SET("ref_doctor_id = #{refDoctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getRefDoctorName() != null) {
            sql.SET("ref_doctor_name = #{refDoctorName,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientId() != null) {
            sql.SET("patient_id = #{patientId,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientName() != null) {
            sql.SET("patient_name = #{patientName,jdbcType=VARCHAR}");
        }

        if (record.getErrStatus() != null) {
            sql.SET("err_status = #{errStatus,jdbcType=INTEGER}");
        }
        if (record.getErrDate() != null) {
            sql.SET("err_date = #{errDate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}