package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.PlatformRecevice;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface PlatformReceviceMapper {
    @Delete({
        "delete from platform_recevice",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into platform_recevice (id, order_id, ",
        "money, create_date, ",
        "patient_id, patient_name, ",
        "doctor_id, doctor_name, ",
        "ref_doctor_id, ref_doctor_name)",
        "values (#{id,jdbcType=VARCHAR}, #{orderId,jdbcType=VARCHAR}, ",
        "#{money,jdbcType=DECIMAL}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{patientId,jdbcType=VARCHAR}, #{patientName,jdbcType=VARCHAR}, ",
        "#{doctorId,jdbcType=VARCHAR}, #{doctorName,jdbcType=VARCHAR}, ",
        "#{refDoctorId,jdbcType=VARCHAR}, #{refDoctorName,jdbcType=VARCHAR})"
    })
    int insert(PlatformRecevice record);

    @InsertProvider(type=PlatformReceviceSqlProvider.class, method="insertSelective")
    int insertSelective(PlatformRecevice record);

    @Select({
        "select",
        "id, order_id, money, create_date, patient_id, patient_name, doctor_id, doctor_name, ",
        "ref_doctor_id, ref_doctor_name",
        "from platform_recevice",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR),
        @Result(column="patient_name", property="patientName", jdbcType= JdbcType.VARCHAR),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="doctor_name", property="doctorName", jdbcType= JdbcType.VARCHAR),
        @Result(column="ref_doctor_id", property="refDoctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="ref_doctor_name", property="refDoctorName", jdbcType= JdbcType.VARCHAR)
    })
    PlatformRecevice selectByPrimaryKey(String id);

    @UpdateProvider(type=PlatformReceviceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PlatformRecevice record);

    @Update({
        "update platform_recevice",
        "set order_id = #{orderId,jdbcType=VARCHAR},",
          "money = #{money,jdbcType=DECIMAL},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "patient_id = #{patientId,jdbcType=VARCHAR},",
          "patient_name = #{patientName,jdbcType=VARCHAR},",
          "doctor_id = #{doctorId,jdbcType=VARCHAR},",
          "doctor_name = #{doctorName,jdbcType=VARCHAR},",
          "ref_doctor_id = #{refDoctorId,jdbcType=VARCHAR},",
          "ref_doctor_name = #{refDoctorName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(PlatformRecevice record);
}