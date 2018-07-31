package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorWithdrawals;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DoctorWithdrawalsMapper {
    @Delete({
            "delete from doctor_withdrawals",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into doctor_withdrawals (id, doctor_id, ",
            "money, success_date, ",
            "error_date, create_date, ",
            "update_date, type)",
            "values (#{id,jdbcType=VARCHAR}, #{doctorId,jdbcType=VARCHAR}, ",
            "#{money,jdbcType=DECIMAL}, #{successDate,jdbcType=TIMESTAMP}, ",
            "#{errorDate,jdbcType=TIMESTAMP}, #{createDate,jdbcType=TIMESTAMP}, ",
            "#{updateDate,jdbcType=TIMESTAMP}, #{type,jdbcType=INTEGER})"
    })
    int insert(DoctorWithdrawals record);

    @InsertProvider(type=DoctorWithdrawalsSqlProvider.class, method="insertSelective")
    int insertSelective(DoctorWithdrawals record);

    @Select({
            "select",
            "id, doctor_id, money, success_date, error_date, create_date, update_date, type",
            "from doctor_withdrawals",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
            @Result(column="success_date", property="successDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="error_date", property="errorDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="type", property="type", jdbcType= JdbcType.INTEGER)
    })
    DoctorWithdrawals selectByPrimaryKey(String id);

    @UpdateProvider(type=DoctorWithdrawalsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DoctorWithdrawals record);

    @Update({
            "update doctor_withdrawals",
            "set doctor_id = #{doctorId,jdbcType=VARCHAR},",
            "money = #{money,jdbcType=DECIMAL},",
            "success_date = #{successDate,jdbcType=TIMESTAMP},",
            "error_date = #{errorDate,jdbcType=TIMESTAMP},",
            "create_date = #{createDate,jdbcType=TIMESTAMP},",
            "update_date = #{updateDate,jdbcType=TIMESTAMP},",
            "type = #{type,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DoctorWithdrawals record);

    @Select({
            "select",
            "id, doctor_id, money, success_date, error_date, create_date, update_date, type",
            "from doctor_withdrawals",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and create_date between SUBDATE(now(),INTERVAL #{day,jdbcType=VARCHAR} DAY) and now()"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
            @Result(column="success_date", property="successDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="error_date", property="errorDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="type", property="type", jdbcType= JdbcType.INTEGER)
    })
    List<DoctorWithdrawals> selectByDoctor(@Param("doctorId") String doctorId, @Param("day") int day);

    @Select({
            "select",
            "id, doctor_id, money, success_date, error_date, create_date, update_date, type",
            "from doctor_withdrawals",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "order by update_date desc"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
            @Result(column="success_date", property="successDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="error_date", property="errorDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="type", property="type", jdbcType= JdbcType.INTEGER)
    })
    List<DoctorWithdrawals> selectAllByDoctor(@Param("doctorId") String doctorId);
}