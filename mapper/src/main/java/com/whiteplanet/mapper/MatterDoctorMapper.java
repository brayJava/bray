package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.MatterDoctor;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface MatterDoctorMapper {
    @Delete({
        "delete from matter_doctor",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into matter_doctor (id, `key`, ",
        "parentKey, value, score, ",
        "pkey, update_time, ",
        "doctor_id)",
        "values (#{id,jdbcType=INTEGER}, #{key,jdbcType=VARCHAR}, ",
        "#{parentkey,jdbcType=VARCHAR}, #{value,jdbcType=BIT}, #{score,jdbcType=INTEGER}, ",
        "#{pkey,jdbcType=VARCHAR}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{doctorId,jdbcType=VARCHAR})"
    })
    int insert(MatterDoctor record);

    @InsertProvider(type=MatterDoctorSqlProvider.class, method="insertSelective")
    int insertSelective(MatterDoctor record);

    @Select({
        "select",
        "id, `key`, parentKey, value, score, pkey, update_time, doctor_id",
        "from matter_doctor",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="key", property="key", jdbcType= JdbcType.VARCHAR),
        @Result(column="parentKey", property="parentkey", jdbcType= JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType= JdbcType.BIT),
        @Result(column="score", property="score", jdbcType= JdbcType.INTEGER),
        @Result(column="pkey", property="pkey", jdbcType= JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR)
    })
    MatterDoctor selectByPrimaryKey(Integer id);

    @UpdateProvider(type=MatterDoctorSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MatterDoctor record);

    @Update({
        "update matter_doctor",
        "set `key` = #{key,jdbcType=VARCHAR},",
          "parentKey = #{parentkey,jdbcType=VARCHAR},",
          "value = #{value,jdbcType=BIT},",
          "score = #{score,jdbcType=INTEGER},",
          "pkey = #{pkey,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "doctor_id = #{doctorId,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MatterDoctor record);

    @InsertProvider(type=MatterDoctorSqlProvider.class, method="insertMatteSelective")
    int insertMatteSelective(String doctorId);

    @Select({
            "select sum(score) from matter_doctor " ,
            "where doctor_id=#{doctorId,jdbcType=VARCHAR} " ,
            "and value = true " ,
            "and parentKey is null"
    })
    Integer selectScoreByDoctorId(String doctorId);

    @Select({
            "select value from matter_doctor",
            "where doctor_id=#{doctorId,jdbcType=VARCHAR} " ,
            "and `key` = #{key,jdbcType=VARCHAR}"
    })
    Boolean selectBooleanByDoctorIdAndKey(@Param("doctorId") String doctorId, @Param("key") String key);

    @Select({
            "select",
            "id, `key`, parentKey, `value`, score, pkey, update_time, doctor_id",
            "from matter_doctor",
            "where doctor_id=#{doctorId,jdbcType=VARCHAR} " ,
            "and `key` = #{key,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="key", property="key", jdbcType= JdbcType.VARCHAR),
            @Result(column="parentKey", property="parentkey", jdbcType= JdbcType.VARCHAR),
            @Result(column="value", property="value", jdbcType= JdbcType.BIT),
            @Result(column="score", property="score", jdbcType= JdbcType.INTEGER),
            @Result(column="pkey", property="pkey", jdbcType= JdbcType.VARCHAR),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR)
    })
    MatterDoctor selectByDoctorIdAndKey(@Param("doctorId") String doctorId, @Param("key") String key);

    @Select({
            "select",
            "id, `key`, parentKey, `value`, score, pkey, update_time, doctor_id",
            "from matter_doctor",
            "where doctor_id=#{doctorId,jdbcType=VARCHAR} " ,
            "and parentKey = #{key,jdbcType=VARCHAR}",
            "and value = true"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="key", property="key", jdbcType= JdbcType.VARCHAR),
            @Result(column="parentKey", property="parentkey", jdbcType= JdbcType.VARCHAR),
            @Result(column="value", property="value", jdbcType= JdbcType.BIT),
            @Result(column="score", property="score", jdbcType= JdbcType.INTEGER),
            @Result(column="pkey", property="pkey", jdbcType= JdbcType.VARCHAR),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR)
    })
    List<MatterDoctor> selectChildByDoctorIdAndKey(@Param("doctorId") String doctorId, @Param("key") String key);

    @Select({
            "select sum(score) from matter_doctor",
            "where doctor_id=#{doctorId,jdbcType=VARCHAR} " ,
            "and `parentKey` = #{parentKey,jdbcType=VARCHAR}",
            "and value = true"
    })
    Integer selectSourceByDoctorIdAndKey(@Param("doctorId") String doctorId, @Param("parentKey") String parentKey);

}