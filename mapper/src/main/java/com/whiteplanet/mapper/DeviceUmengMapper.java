package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DeviceUmeng;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface DeviceUmengMapper {

    @Delete({
        "DELETE FROM device_umeng",
        "WHERE id = #{id, jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "INSERT INTO device_umeng",
            "(id, role_id, device_token, role, device_platform, enable, create_date, update_date)",
        "VALUES",
            "(#{id, jdbcType=VARCHAR}, #{roleId, jdbcType=VARCHAR}, #{deviceToken, jdbcType=VARCHAR},",
            "#{role, jdbcType=INTEGER}, #{devicePlatform, jdbcType=INTEGER}, #{enable, jdbcType=BIT},",
            "#{createDate, jdbcType=TIMESTAMP}, #{updateDate, jdbcType=TIMESTAMP})"
    })
    int insert(DeviceUmeng deviceUmeng);

    @Select({
        "SELECT",
            "id, role_id, device_token, role, device_platform, enable, create_date, update_date",
        "FROM",
            "device_umeng",
        "WHERE",
            "id = #{id, jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
        @Result(column = "role_id", property = "roleId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "device_token", property = "deviceToken", jdbcType = JdbcType.VARCHAR),
        @Result(column = "role", property = "role", jdbcType = JdbcType.INTEGER),
        @Result(column = "device_platform", property = "devicePlatform", jdbcType = JdbcType.INTEGER),
        @Result(column = "enable", property = "enable", jdbcType = JdbcType.BOOLEAN),
        @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.TIMESTAMP),
        @Result(column = "update_date", property = "updateDate", jdbcType = JdbcType.TIMESTAMP),
    })
    DeviceUmeng selectByPrimaryKey(String id);

    @Update({
        "UPDATE device_umeng",
        "SET",
            "role_id = #{roleId, jdbcType=VARCHAR},",
            "device_token = #{deviceToken, jdbcType=VARCHAR},",
            "role = #{role, jdbcType=INTEGER},",
            "device_platform = #{devicePlatform, jdbcType=INTEGER},",
            "enable = #{enable. jdbcType=BIT},",
            "create_date = #{createDate, jdbcType=TIMESTAMP},",
            "update_date = #{updateDate, jdbcType=TIMESTAMP}",
        "WHERE",
            "id = #{id, jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(String id);

    @Select({
        "SELECT",
            "id, role_id, device_token, role, device_platform, enable, create_date, update_date",
        "FROM",
            "device_umeng",
        "WHERE",
            "role_id = #{roleId, jdbcType=VARCHAR}",
            "AND role = #{role, jdbcType=INTEGER}",
            "AND device_platform = #{devicePlatform, jdbcType=INTEGER}"
    })
    @Results({
        @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
        @Result(column = "role_id", property = "roleId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "device_token", property = "deviceToken", jdbcType = JdbcType.VARCHAR),
        @Result(column = "role", property = "role", jdbcType = JdbcType.INTEGER),
        @Result(column = "device_platform", property = "devicePlatform", jdbcType = JdbcType.INTEGER),
        @Result(column = "enable", property = "enable", jdbcType = JdbcType.BOOLEAN),
        @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.TIMESTAMP),
        @Result(column = "update_date", property = "updateDate", jdbcType = JdbcType.TIMESTAMP),
    })
    DeviceUmeng selectByRoleIdAndRoleAndDevicePlatform(DeviceUmeng deviceUmeng);

    @Update({
        "UPDATE device_umeng",
        "SET",
            "device_token = #{deviceToken, jdbcType=VARCHAR}",
        "WHERE",
            "role_id = #{roleId, jdbcType=VARCHAR}",
            "AND role = #{role, jdbcType=INTEGER}",
            "AND device_platform = #{devicePlatform, jdbcType=INTEGER}"
    })
    int updateDeviceTokenByRoleIdAndRoleAndDevicePlatform(DeviceUmeng deviceUmeng);

}
