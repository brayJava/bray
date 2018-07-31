package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.SysConfig;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface SysConfigMapper {
    @Delete({
        "delete from sys_config",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into sys_config (id, `key`, ",
        "create_date, update_date, ",
        "`status`, `value`)",
        "values (#{id,jdbcType=INTEGER}, #{key,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{updateDate,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=INTEGER}, #{value,jdbcType=LONGVARCHAR})"
    })
    int insert(SysConfig record);

    @InsertProvider(type=SysConfigSqlProvider.class, method="insertSelective")
    int insertSelective(SysConfig record);

    @Select({
        "select",
        "id, `key`, create_date, update_date, `status`, `value`",
        "from sys_config",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="key", property="key", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="value", property="value", jdbcType= JdbcType.LONGVARCHAR)
    })
    SysConfig selectByPrimaryKey(Integer id);

    @UpdateProvider(type=SysConfigSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysConfig record);

    @Update({
        "update sys_config",
        "set `key` = #{key,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "`status` = #{status,jdbcType=INTEGER},",
          "`value` = #{value,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(SysConfig record);

    @Update({
        "update sys_config",
        "set `key` = #{key,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "`status` = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SysConfig record);

    @Select({
            "select",
            "`id`, `key`, `status`, `value`",
            "from sys_config",
            "where `key` = #{key,jdbcType=INTEGER}",
            "or `key` like CONCAT(#{mobile,jdbcType=VARCHAR},'%' )",
            "and `status` = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="key", property="key", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="value", property="value", jdbcType= JdbcType.LONGVARCHAR)
    })
    List<SysConfig> selectByMobileKey(@Param("key") String key, @Param("mobile") String mobile);

    @Select({
            "select",
            "`id`, `key`, `status`, `value`",
            "from sys_config",
            "where `key` = #{key,jdbcType=INTEGER}",
            "and `status` = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="key", property="key", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="value", property="value", jdbcType= JdbcType.LONGVARCHAR)
    })
    SysConfig selectByKey(@Param("key") String key);
}