package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorCeoReceive;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface DoctorCeoReceiveMapper {
    @Delete({
        "delete from doctor_ceo_receive",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into doctor_ceo_receive (id, order_id, ",
        "money, create_date, ",
        "doctor_id, doctor_name, ",
        "patient_id, patient_name)",
        "values (#{id,jdbcType=VARCHAR}, #{orderId,jdbcType=VARCHAR}, ",
        "#{money,jdbcType=DECIMAL}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{doctorId,jdbcType=VARCHAR}, #{doctorName,jdbcType=VARCHAR}, ",
        "#{patientId,jdbcType=VARCHAR}, #{patientName,jdbcType=VARCHAR})"
    })
    int insert(DoctorCeoReceive record);

    @InsertProvider(type=DoctoCeoReceiveSqlProvider.class, method="insertSelective")
    int insertSelective(DoctorCeoReceive record);

    @Select({
        "select",
        "id, order_id, money, create_date, doctor_id, doctor_name, patient_id, patient_name",
        "from doctor_ceo_receive",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="doctor_name", property="doctorName", jdbcType= JdbcType.VARCHAR),
        @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR),
        @Result(column="patient_name", property="patientName", jdbcType= JdbcType.VARCHAR)
    })
    DoctorCeoReceive selectByPrimaryKey(String id);

    @UpdateProvider(type=DoctoCeoReceiveSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DoctorCeoReceive record);

    @Update({
        "update doctor_ceo_receive",
        "set order_id = #{orderId,jdbcType=VARCHAR},",
          "money = #{money,jdbcType=DECIMAL},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "doctor_id = #{doctorId,jdbcType=VARCHAR},",
          "doctor_name = #{doctorName,jdbcType=VARCHAR},",
          "patient_id = #{patientId,jdbcType=VARCHAR},",
          "patient_name = #{patientName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DoctorCeoReceive record);
}