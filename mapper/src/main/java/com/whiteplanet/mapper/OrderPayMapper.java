package com.whiteplanet.mapper;

import com.whiteplanet.mapper.data.PayBean;
import com.whiteplanet.mapper.model.OrderPay;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface OrderPayMapper {
    @Delete({
            "delete from order_pay",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into order_pay (id, order_id, ",
            "money, create_date, ",
            "source, service_order_id, ",
            "second_order_id, status, ",
            "update_date, doctor_id, ",
            "doctor_name, ref_doctor_id, ",
            "ref_doctor_name, patient_id, err_status, err_date",
            "patient_name)",
            "values (#{id,jdbcType=VARCHAR}, #{orderId,jdbcType=VARCHAR}, ",
            "#{money,jdbcType=DECIMAL}, #{createDate,jdbcType=TIMESTAMP}, ",
            "#{source,jdbcType=INTEGER}, #{serviceOrderId,jdbcType=VARCHAR}, ",
            "#{secondOrderId,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
            "#{updateDate,jdbcType=TIMESTAMP}, #{doctorId,jdbcType=VARCHAR}, ",
            "#{doctorName,jdbcType=VARCHAR}, #{refDoctorId,jdbcType=VARCHAR}, ",
            "#{refDoctorName,jdbcType=VARCHAR}, #{patientId,jdbcType=VARCHAR}, #{errStatus,jdbcType=INTEGER},#{errDate,jdbcType=TIMESTAMP},  ",
            "#{patientName,jdbcType=VARCHAR})"
    })
    int insert(OrderPay record);

    @InsertProvider(type=OrderPaySqlProvider.class, method="insertSelective")
    int insertSelective(OrderPay record);

    @Select({
            "select",
            "id, order_id, money, create_date, source, service_order_id, second_order_id, ",
            "status, update_date, doctor_id, doctor_name, ref_doctor_id, ref_doctor_name, ",
            "patient_id, patient_name,err_status,err_date",
            "from order_pay",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="source", property="source", jdbcType= JdbcType.INTEGER),
            @Result(column="err_date", property="errDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="err_status", property="errStatus", jdbcType= JdbcType.INTEGER),
            @Result(column="service_order_id", property="serviceOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="second_order_id", property="secondOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.VARCHAR),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="doctor_name", property="doctorName", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref_doctor_id", property="refDoctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref_doctor_name", property="refDoctorName", jdbcType= JdbcType.VARCHAR),
            @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR),
            @Result(column="patient_name", property="patientName", jdbcType= JdbcType.VARCHAR)
    })
    OrderPay selectByPrimaryKey(String id);

    @UpdateProvider(type=OrderPaySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OrderPay record);

    @Update({
            "update order_pay",
            "set order_id = #{orderId,jdbcType=VARCHAR},",
            "money = #{money,jdbcType=DECIMAL},",
            "create_date = #{createDate,jdbcType=TIMESTAMP},",
            "source = #{source,jdbcType=INTEGER},",
            "service_order_id = #{serviceOrderId,jdbcType=VARCHAR},",
            "second_order_id = #{secondOrderId,jdbcType=VARCHAR},",
            "status = #{status,jdbcType=INTEGER},",
            "update_date = #{updateDate,jdbcType=TIMESTAMP},",
            "doctor_id = #{doctorId,jdbcType=VARCHAR},",
            "doctor_name = #{doctorName,jdbcType=VARCHAR},",
            "ref_doctor_id = #{refDoctorId,jdbcType=VARCHAR},",
            "ref_doctor_name = #{refDoctorName,jdbcType=VARCHAR},",
            "patient_id = #{patientId,jdbcType=VARCHAR},",
            "patient_name = #{patientName,jdbcType=VARCHAR}",
            "err_status = #{errStatus,jdbcType=INTEGER}",
            "err_date = #{errDate,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(OrderPay record);

    @Select({
            "select",
            "id, order_id, money, create_date, source, service_order_id, second_order_id, ",
            "status, update_date, doctor_id, doctor_name, ref_doctor_id, ref_doctor_name, ",
            "patient_id, patient_name",
            "from order_pay",
            "where order_id = #{orderId,jdbcType=VARCHAR}",
            "and status = #{status,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="source", property="source", jdbcType= JdbcType.INTEGER),
            @Result(column="service_order_id", property="serviceOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="second_order_id", property="secondOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.VARCHAR),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="doctor_name", property="doctorName", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref_doctor_id", property="refDoctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref_doctor_name", property="refDoctorName", jdbcType= JdbcType.VARCHAR),
            @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR),
            @Result(column="patient_name", property="patientName", jdbcType= JdbcType.VARCHAR)
    })
    OrderPay selectByOrderId(@Param("orderId") String orderId, @Param("status") Integer status);

    @Select({
            "select",
            "id, order_id, money, create_date, source, service_order_id, second_order_id, ",
            "status, update_date, doctor_id, doctor_name, ref_doctor_id, ref_doctor_name, ",
            "patient_id, patient_name",
            "from order_pay",
            "where order_id = #{orderId,jdbcType=VARCHAR}",
            "and status >= 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="source", property="source", jdbcType= JdbcType.INTEGER),
            @Result(column="service_order_id", property="serviceOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="second_order_id", property="secondOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.VARCHAR),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="doctor_name", property="doctorName", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref_doctor_id", property="refDoctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref_doctor_name", property="refDoctorName", jdbcType= JdbcType.VARCHAR),
            @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR),
            @Result(column="patient_name", property="patientName", jdbcType= JdbcType.VARCHAR)
    })
    OrderPay selectByOrderIdEnable(@Param("orderId") String orderId);

    @Select({
            "select * from (" ,
            "   (select t.money,t.doctor_id,t.doctor_name,t.ref_doctor_id,t.ref_doctor_name, false as refund, t.update_date as `time` " ,
            "       from order_pay t where t.status = 1 and patient_id = #{patientId,jdbcType=VARCHAR})",
            "union all" ,
            "   (select t2.money,t2.doctor_id,t2.doctor_name,t2.ref_doctor_id,t2.ref_doctor_name, true as refund,t2.update_date as `time` " ,
            "       from order_pay_refund t2 where t2.status = 1 and patient_id = #{patientId,jdbcType=VARCHAR})" ,
            ") tab"
    })
    @Results({
            @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="doctor_name", property="doctorName", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref_doctor_id", property="refDoctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref_doctor_name", property="refDoctorName", jdbcType= JdbcType.VARCHAR),
            @Result(column="refund", property="refund", jdbcType= JdbcType.BIT),
            @Result(column="time", property="time", jdbcType= JdbcType.TIMESTAMP),
    })
    List<PayBean> selectAllByPatientId(String patientId);
}