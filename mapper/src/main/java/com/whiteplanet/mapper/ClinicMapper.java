package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Clinic;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ClinicMapper {
  @Delete({
          "delete from clinic",
          "where id = #{id,jdbcType=VARCHAR}"
  })
  int deleteByPrimaryKey(String id);

  @Insert({
          "insert into clinic (id, name, ",
          "note, doctor_count, ",
          "business, business_date, ",
          "business_day, create_date, ",
          "update_date, doctor_id, ",
          "amount, receive_money, ",
          "money, ref_money, ",
          "service_money, service_wait, ",
          "doctor_ref_count, doctor_recive_count, ",
          "doctor_department_count)",
          "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
          "#{note,jdbcType=VARCHAR}, #{doctorCount,jdbcType=INTEGER}, ",
          "#{business,jdbcType=BIT}, #{businessDate,jdbcType=TIMESTAMP}, ",
          "#{businessDay,jdbcType=INTEGER}, #{createDate,jdbcType=TIMESTAMP}, ",
          "#{updateDate,jdbcType=TIMESTAMP}, #{doctorId,jdbcType=VARCHAR}, ",
          "#{amount,jdbcType=DECIMAL}, #{receiveMoney,jdbcType=DECIMAL}, ",
          "#{money,jdbcType=DECIMAL}, #{refMoney,jdbcType=DECIMAL}, ",
          "#{serviceMoney,jdbcType=DECIMAL}, #{serviceWait,jdbcType=INTEGER}, ",
          "#{doctorRefCount,jdbcType=INTEGER}, #{doctorReciveCount,jdbcType=INTEGER}, ",
          "#{doctorDepartmentCount,jdbcType=INTEGER})"
  })
  int insert(Clinic record);

  @InsertProvider(type=ClinicSqlProvider.class, method="insertSelective")
  int insertSelective(Clinic record);

  @Select({
          "select",
          "id, name, note, doctor_count, business, business_date, business_day, create_date, ",
          "update_date, doctor_id, amount, receive_money, money, ref_money, service_money, ",
          "service_wait, doctor_ref_count, doctor_recive_count, doctor_department_count",
          "from clinic",
          "where id = #{id,jdbcType=VARCHAR}"
  })
  @Results({
          @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
          @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
          @Result(column="note", property="note", jdbcType= JdbcType.VARCHAR),
          @Result(column="doctor_count", property="doctorCount", jdbcType= JdbcType.INTEGER),
          @Result(column="business", property="business", jdbcType= JdbcType.BIT),
          @Result(column="business_date", property="businessDate", jdbcType= JdbcType.TIMESTAMP),
          @Result(column="business_day", property="businessDay", jdbcType= JdbcType.INTEGER),
          @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
          @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
          @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
          @Result(column="amount", property="amount", jdbcType= JdbcType.DECIMAL),
          @Result(column="receive_money", property="receiveMoney", jdbcType= JdbcType.DECIMAL),
          @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
          @Result(column="ref_money", property="refMoney", jdbcType= JdbcType.DECIMAL),
          @Result(column="service_money", property="serviceMoney", jdbcType= JdbcType.DECIMAL),
          @Result(column="service_wait", property="serviceWait", jdbcType= JdbcType.INTEGER),
          @Result(column="doctor_ref_count", property="doctorRefCount", jdbcType= JdbcType.INTEGER),
          @Result(column="doctor_recive_count", property="doctorReciveCount", jdbcType= JdbcType.INTEGER),
          @Result(column="doctor_department_count", property="doctorDepartmentCount", jdbcType= JdbcType.INTEGER)
  })
  Clinic selectByPrimaryKey(String id);

  @UpdateProvider(type=ClinicSqlProvider.class, method="updateByPrimaryKeySelective")
  int updateByPrimaryKeySelective(Clinic record);

  @Update({
          "update clinic",
          "set name = #{name,jdbcType=VARCHAR},",
          "note = #{note,jdbcType=VARCHAR},",
          "doctor_count = #{doctorCount,jdbcType=INTEGER},",
          "business = #{business,jdbcType=BIT},",
          "business_date = #{businessDate,jdbcType=TIMESTAMP},",
          "business_day = #{businessDay,jdbcType=INTEGER},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "doctor_id = #{doctorId,jdbcType=VARCHAR},",
          "amount = #{amount,jdbcType=DECIMAL},",
          "receive_money = #{receiveMoney,jdbcType=DECIMAL},",
          "money = #{money,jdbcType=DECIMAL},",
          "ref_money = #{refMoney,jdbcType=DECIMAL},",
          "service_money = #{serviceMoney,jdbcType=DECIMAL},",
          "service_wait = #{serviceWait,jdbcType=INTEGER},",
          "doctor_ref_count = #{doctorRefCount,jdbcType=INTEGER},",
          "doctor_recive_count = #{doctorReciveCount,jdbcType=INTEGER},",
          "doctor_department_count = #{doctorDepartmentCount,jdbcType=INTEGER}",
          "where id = #{id,jdbcType=VARCHAR}"
  })
  int updateByPrimaryKey(Clinic record);

  @Select({
          "select",
          "id, name, note, doctor_count, business, business_date, business_day, create_date, ",
          "update_date, doctor_id, amount, receive_money, money, ref_money, service_money, ",
          "service_wait, doctor_ref_count, doctor_recive_count, doctor_department_count ",
          "from clinic",
          "where doctor_id = #{doctorId,jdbcType=VARCHAR}"
  })
  @Results({
          @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
          @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
          @Result(column="note", property="note", jdbcType= JdbcType.VARCHAR),
          @Result(column="doctor_count", property="doctorCount", jdbcType= JdbcType.INTEGER),
          @Result(column="business", property="business", jdbcType= JdbcType.BIT),
          @Result(column="business_date", property="businessDate", jdbcType= JdbcType.TIMESTAMP),
          @Result(column="business_day", property="businessDay", jdbcType= JdbcType.INTEGER),
          @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
          @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
          @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
          @Result(column="amount", property="amount", jdbcType= JdbcType.DECIMAL),
          @Result(column="receive_money", property="receiveMoney", jdbcType= JdbcType.DECIMAL),
          @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
          @Result(column="ref_money", property="refMoney", jdbcType= JdbcType.DECIMAL),
          @Result(column="service_money", property="serviceMoney", jdbcType= JdbcType.DECIMAL),
          @Result(column="service_wait", property="serviceWait", jdbcType= JdbcType.INTEGER),
          @Result(column="doctor_ref_count", property="doctorRefCount", jdbcType= JdbcType.INTEGER),
          @Result(column="doctor_recive_count", property="doctorReciveCount", jdbcType= JdbcType.INTEGER),
          @Result(column="doctor_department_count", property="doctorDepartmentCount", jdbcType= JdbcType.INTEGER)
  })
  Clinic selectByDoctorId(String doctorId);

  @Update({
    "update clinic",
    "set doctor_recive_count = doctor_recive_count + 1",
    "where doctor_id = #{doctorId, jdbcType=VARCHAR}"
  })
  int updateDoctorReciveCountAddOneByDoctorId(String doctorId);

  @Update({
    "update clinic",
    "set doctor_ref_count = #{doctorRefCount, jdbcType=INTEGER}",
    "where doctor_id = #{doctorId, jdbcType=VARCHAR}"
  })
  int updateDoctorRefCountAddXByDoctorId(Clinic clinic);

  @Update({
    "update clinic",
    "set doctor_department_count = doctor_department_count + 1",
    "where id = #{clinicId, jdbcType=VARCHAR}"
  })
  int updateDoctorDepartmentCountAddOneByClinicId(String clinicId);

  @Select({
    "select d.department_function_id",
    "from doctor as d, doctor_clinic as dc",
    "where dc.clinic_id = #{clinicId, jdbcType=VARCHAR}",
    "and dc.doctor_id = d.id",
    "group by d.department_function_id",
    "order by count(1) desc"
  })
  List<String> findClinicDepartmentFunctionIdByClinicId(String clinicId);

  @Select({
          "select count(1) from doctor_clinic,clinic",
          "where clinic.id = doctor_clinic.clinic_id",
          "and clinic.doctor_id = #{doctorId, jdbcType=VARCHAR}",
          "and doctor_clinic.`status` = 0"
  })
  int selectCountByDoctorId(String doctorId);

  @Select({
          "select",
          "count(1)",
          "from clinic",
          "where doctor_id = #{doctorId,jdbcType=VARCHAR}"
  })
  int selectExistByDoctorId(String doctorId);
}