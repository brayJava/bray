package com.whiteplanet.mapper;

import com.whiteplanet.mapper.data.DoctorReceiveBean;
import com.whiteplanet.mapper.model.DoctorReceive;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DoctorReceiveMapper {
    @Delete({
            "delete from doctor_receive",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into doctor_receive (id, order_id, ",
            "money, create_date, ",
            "doctor_id, doctor_name, ",
            "ref_doctor_id, ref_doctor_name, ",
            "patient_id, patient_name)",
            "values (#{id,jdbcType=VARCHAR}, #{orderId,jdbcType=VARCHAR}, ",
            "#{money,jdbcType=DECIMAL}, #{createDate,jdbcType=TIMESTAMP}, ",
            "#{doctorId,jdbcType=VARCHAR}, #{doctorName,jdbcType=VARCHAR}, ",
            "#{refDoctorId,jdbcType=VARCHAR}, #{refDoctorName,jdbcType=VARCHAR}, ",
            "#{patientId,jdbcType=VARCHAR}, #{patientName,jdbcType=VARCHAR})"
    })
    int insert(DoctorReceive record);

    @InsertProvider(type=DoctorReceiveSqlProvider.class, method="insertSelective")
    int insertSelective(DoctorReceive record);

    @Select({
            "select",
            "id, order_id, money, create_date, doctor_id, doctor_name, ref_doctor_id, ref_doctor_name, ",
            "patient_id, patient_name",
            "from doctor_receive",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="doctor_name", property="doctorName", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref_doctor_id", property="refDoctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref_doctor_name", property="refDoctorName", jdbcType= JdbcType.VARCHAR),
            @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR),
            @Result(column="patient_name", property="patientName", jdbcType= JdbcType.VARCHAR)
    })
    DoctorReceive selectByPrimaryKey(String id);

    @UpdateProvider(type=DoctorReceiveSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DoctorReceive record);

    @Update({
            "update doctor_receive",
            "set order_id = #{orderId,jdbcType=VARCHAR},",
            "money = #{money,jdbcType=DECIMAL},",
            "create_date = #{createDate,jdbcType=TIMESTAMP},",
            "doctor_id = #{doctorId,jdbcType=VARCHAR},",
            "doctor_name = #{doctorName,jdbcType=VARCHAR},",
            "ref_doctor_id = #{refDoctorId,jdbcType=VARCHAR},",
            "ref_doctor_name = #{refDoctorName,jdbcType=VARCHAR},",
            "patient_id = #{patientId,jdbcType=VARCHAR},",
            "patient_name = #{patientName,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DoctorReceive record);

    @Select({
            "select * from (",
            "select money,create_date,doctor_name,patient_name,ref_doctor_name, true as ref " ,
            "from doctor_receive where doctor_id = #{doctorId,jdbcType=VARCHAR}" ,
            "union" ,
            "select money,create_date,doctor_name,patient_name,'',false " ,
            "from doctor_ceo_receive where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            ") tb ",
            "where tb.create_date between SUBDATE(now(),INTERVAL #{day,jdbcType=VARCHAR} DAY) and now()"
    })
    @Results({
            @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_name", property="doctorName", jdbcType= JdbcType.DECIMAL),
            @Result(column="patient_name", property="patientName", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref_doctor_name", property="refDoctorName", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref", property="ref", jdbcType= JdbcType.BIT)
    })
    List<DoctorReceiveBean> selectByDoctor(@Param("doctorId") String doctorId, @Param("day") int day);
}