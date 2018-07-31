package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.CryptogramCode;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface CryptogramCodeMapper {

    @Delete({
        "delete from cryptogram_code",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into cryptogram_code",
        "(id, doctor_id, lock_failure_time, first_wrong_time, ",
        "last_wrong_time, wrong_count, continuous_wrong_count)",
        "values",
        "(#{id, jdbcType=VARCHAR}, #{doctorId, jdbcType=VARCHAR},",
        "#{lockFailureTime, jdbcType=TIMESTAMP}, #{firstWrongTime, jdbcType=TIMESTAMP}, ",
        "#{lastWrongTime, jdbcType=TIMESTAMP}, #{wrongCount, jdbcType=INTEGER}, ",
        "#{continuousWrongCount, jdbcType=TIMESTAMP})"
    })
    int insert(CryptogramCode cryptogramCode);

    @Select({
        "select",
        "id, doctor_id, lock_failure_time, lock_failure_time, first_wrong_time, ",
        "last_wrong_time, wrong_count, continuous_wrong_count",
        "from cryptogram_code",
        "where id = #{id, jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
        @Result(column = "doctor_id", property = "doctorId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "lock_failure_time", property = "lockFailureTime", jdbcType = JdbcType.TIMESTAMP),
        @Result(column = "first_wrong_time", property = "firstWrongTime", jdbcType = JdbcType.TIMESTAMP),
        @Result(column = "last_wrong_time", property = "lastWrongTime", jdbcType = JdbcType.TIMESTAMP),
        @Result(column = "wrong_count", property = "wrongCount", jdbcType = JdbcType.INTEGER),
        @Result(column = "continuous_wrong_count", property = "continuousWrongCount", jdbcType = JdbcType.INTEGER)
    })
    CryptogramCode selectByPrimaryKey(String id);

    @Update({
        "update cryptogram_code",
        "set",
        "id = #{id, jdbcType=VARCHAR},",
        "doctor_id = #{doctorId, jdbcType=VARCHAR},",
        "lock_failure_time = #{lockFailureTime, jdbcType=TIMESTAMP},",
        "first_wrong_time = #{firstWrongTime, jdbcType=TIMESTAMP},",
        "last_wrong_time = #{lastWrongTime, jdbcType=TIMESTAMP},",
        "wrong_count = #{wrongCount, jdbcType=INTEGER},",
        "continuous_wrong_count = #{continuousWrongCount, jdbcType=INTEGER}",
        "where id = #{id, jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(CryptogramCode cryptogramCode);

    @Select({
        "select",
        "id, doctor_id, lock_failure_time, lock_failure_time, first_wrong_time, ",
        "last_wrong_time, wrong_count, continuous_wrong_count",
        "from cryptogram_code",
        "where doctor_id = #{doctorId, jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
        @Result(column = "doctor_id", property = "doctorId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "lock_failure_time", property = "lockFailureTime", jdbcType = JdbcType.TIMESTAMP),
        @Result(column = "first_wrong_time", property = "firstWrongTime", jdbcType = JdbcType.TIMESTAMP),
        @Result(column = "last_wrong_time", property = "lastWrongTime", jdbcType = JdbcType.TIMESTAMP),
        @Result(column = "wrong_count", property = "wrongCount", jdbcType = JdbcType.INTEGER),
        @Result(column = "continuous_wrong_count", property = "continuousWrongCount", jdbcType = JdbcType.INTEGER)
    })
    CryptogramCode selectByDoctorId(String doctorId);

    @Update({
            "update cryptogram_code",
            "set",
            "id = #{id, jdbcType=VARCHAR},",
            "doctor_id = #{doctorId, jdbcType=VARCHAR},",
            "lock_failure_time = #{lockFailureTime, jdbcType=TIMESTAMP},",
            "first_wrong_time = #{firstWrongTime, jdbcType=TIMESTAMP},",
            "last_wrong_time = #{lastWrongTime, jdbcType=TIMESTAMP},",
            "wrong_count = #{wrongCount, jdbcType=INTEGER},",
            "continuous_wrong_count = #{continuousWrongCount, jdbcType=INTEGER}",
            "where doctor_id = #{doctorId, jdbcType=VARCHAR}"
    })
    int updateByDoctorId(CryptogramCode cryptogramCode);

}
