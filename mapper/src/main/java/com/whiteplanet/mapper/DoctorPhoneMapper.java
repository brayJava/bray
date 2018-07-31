package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorPhone;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DoctorPhoneMapper {
    @Delete({
        "delete from doctor_phone",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Delete({
            "delete from doctor_phone",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}"
    })
    int deleteByDoctorId(String doctorId);

    @Insert({
        "insert into doctor_phone (id, doctor_id, ",
        "phone, name, owner_doctor_id, ",
        "create_date)",
        "values (#{id,jdbcType=VARCHAR}, #{doctorId,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, #{ownerDoctorId,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP})"
    })
    int insert(DoctorPhone record);

    @InsertProvider(type=DoctorPhoneSqlProvider.class, method="insertSelective")
    int insertSelective(DoctorPhone record);

    @InsertProvider(type=DoctorPhoneSqlProvider.class, method="insertSelectives")
    int insertSelectives(List<DoctorPhone> record);

    @InsertProvider(type=DoctorPhoneSqlProvider.class, method="insertSelectivesResult")
    int insertSelectivesResult(List<DoctorPhone> record);

    @Select({
        "select",
        "id, doctor_id, phone, name, owner_doctor_id, create_date",
        "from doctor_phone",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        @Result(column="owner_doctor_id", property="ownerDoctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    DoctorPhone selectByPrimaryKey(String id);

    @UpdateProvider(type=DoctorPhoneSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DoctorPhone record);

    @Update({
        "update doctor_phone",
        "set doctor_id = #{doctorId,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "owner_doctor_id = #{ownerDoctorId,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DoctorPhone record);

    @Select({
            "select distinct doctor_phone.name, doctor_phone.phone,doctor_phone.doctor_id,doctor.id as owner_doctor_id",
            "from doctor_phone,doctor",
            "where doctor_phone.phone = doctor.phone and doctor_id= #{doctorId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="owner_doctor_id", property="ownerDoctorId", jdbcType= JdbcType.VARCHAR)
    })
    List<DoctorPhone> selectDistinctByDoctorId(String doctorId);
}