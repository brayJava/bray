package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.OrderPayRefund;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface OrderPayRefundMapper {
    @Delete({
        "delete from order_pay_refund",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into order_pay_refund (id, money, ",
        "create_date, source, ",
        "service_order_id, second_order_id, ",
        "status, order_pay_id, ",
        "update_date, doctor_id, ",
        "doctor_name, ref_doctor_id, ",
        "ref_doctor_name, patient_id, ",
        "patient_name)",
        "values (#{id,jdbcType=VARCHAR}, #{money,jdbcType=DECIMAL}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{source,jdbcType=INTEGER}, ",
        "#{serviceOrderId,jdbcType=VARCHAR}, #{secondOrderId,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=VARCHAR}, #{orderPayId,jdbcType=VARCHAR}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{doctorId,jdbcType=VARCHAR}, ",
        "#{doctorName,jdbcType=VARCHAR}, #{refDoctorId,jdbcType=VARCHAR}, ",
        "#{refDoctorName,jdbcType=VARCHAR}, #{patientId,jdbcType=VARCHAR}, ",
        "#{patientName,jdbcType=VARCHAR})"
    })
    int insert(OrderPayRefund record);

    @InsertProvider(type=OrderPayRefundSqlProvider.class, method="insertSelective")
    int insertSelective(OrderPayRefund record);

    @Select({
        "select",
        "id, money, create_date, source, service_order_id, second_order_id, status, order_pay_id, ",
        "update_date, doctor_id, doctor_name, ref_doctor_id, ref_doctor_name, patient_id, ",
        "patient_name",
        "from order_pay_refund",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="source", property="source", jdbcType= JdbcType.INTEGER),
        @Result(column="service_order_id", property="serviceOrderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="second_order_id", property="secondOrderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType= JdbcType.VARCHAR),
        @Result(column="order_pay_id", property="orderPayId", jdbcType= JdbcType.VARCHAR),
        @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="doctor_name", property="doctorName", jdbcType= JdbcType.VARCHAR),
        @Result(column="ref_doctor_id", property="refDoctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="ref_doctor_name", property="refDoctorName", jdbcType= JdbcType.VARCHAR),
        @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR),
        @Result(column="patient_name", property="patientName", jdbcType= JdbcType.VARCHAR)
    })
    OrderPayRefund selectByPrimaryKey(String id);

    @Select({
            "select",
            "id, money, create_date, source, service_order_id, second_order_id, status, order_pay_id, ",
            "update_date, doctor_id, doctor_name, ref_doctor_id, ref_doctor_name, patient_id, ",
            "patient_name",
            "from order_pay_refund",
            "where order_pay_id = #{orderPayId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="source", property="source", jdbcType= JdbcType.INTEGER),
            @Result(column="service_order_id", property="serviceOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="second_order_id", property="secondOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.VARCHAR),
            @Result(column="order_pay_id", property="orderPayId", jdbcType= JdbcType.VARCHAR),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="doctor_name", property="doctorName", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref_doctor_id", property="refDoctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref_doctor_name", property="refDoctorName", jdbcType= JdbcType.VARCHAR),
            @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR),
            @Result(column="patient_name", property="patientName", jdbcType= JdbcType.VARCHAR)
    })
    OrderPayRefund selectByOrderPayId(String orderPayId);

    @UpdateProvider(type=OrderPayRefundSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OrderPayRefund record);

    @Update({
        "update order_pay_refund",
        "set money = #{money,jdbcType=DECIMAL},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "source = #{source,jdbcType=INTEGER},",
          "service_order_id = #{serviceOrderId,jdbcType=VARCHAR},",
          "second_order_id = #{secondOrderId,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR},",
          "order_pay_id = #{orderPayId,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "doctor_id = #{doctorId,jdbcType=VARCHAR},",
          "doctor_name = #{doctorName,jdbcType=VARCHAR},",
          "ref_doctor_id = #{refDoctorId,jdbcType=VARCHAR},",
          "ref_doctor_name = #{refDoctorName,jdbcType=VARCHAR},",
          "patient_id = #{patientId,jdbcType=VARCHAR},",
          "patient_name = #{patientName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(OrderPayRefund record);
}