package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.SysAuthCode;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface SysAuthCodeMapper {
    @Delete({
        "delete from sys_auth_code",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into sys_auth_code (id, doctor, ",
        "token, create_time, ",
        "account_id)",
        "values (#{id,jdbcType=INTEGER}, #{doctor,jdbcType=BIT}, ",
        "#{token,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{accountId,jdbcType=VARCHAR})"
    })
    int insert(SysAuthCode record);

    @InsertProvider(type=SysAuthCodeSqlProvider.class, method="insertSelective")
    int insertSelective(SysAuthCode record);

    @Select({
        "select",
        "id, doctor, token, create_time, account_id",
        "from sys_auth_code",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="doctor", property="doctor", jdbcType= JdbcType.BIT),
        @Result(column="token", property="token", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="account_id", property="accountId", jdbcType= JdbcType.VARCHAR)
    })
    SysAuthCode selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "account_id",
            "from sys_auth_code",
            "where token = #{token,jdbcType=INTEGER}",
            "and doctor = #{doctor,jdbcType=BIT}",
            "order by create_time asc",
            "limit 1"
    })
    String selectAccountIdByToken(@Param("token") String token, @Param("doctor") Boolean doctor);

    @UpdateProvider(type=SysAuthCodeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysAuthCode record);

    @Update({
        "update sys_auth_code",
        "set doctor = #{doctor,jdbcType=BIT},",
          "token = #{token,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "account_id = #{accountId,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SysAuthCode record);
}