package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.UserDataStatistics;
import com.whiteplanet.mapper.model.UserDataStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserDataStatisticsMapper {
    @SelectProvider(type=UserDataStatisticsSqlProvider.class, method="countByExample")
    int countByExample(UserDataStatisticsExample example);

    @DeleteProvider(type=UserDataStatisticsSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserDataStatisticsExample example);

    @Delete({
        "delete from user_data_statistics",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user_data_statistics (id, time, ",
        "load_user_count, register_user_count, ",
        "fill_data_count, apply_realname_count, ",
        "register_load_per, fill_data_user_per, ",
        "realname_submit_per, active_device_number)",
        "values (#{id,jdbcType=INTEGER}, #{time,jdbcType=TIMESTAMP}, ",
        "#{loadUserCount,jdbcType=INTEGER}, #{registerUserCount,jdbcType=INTEGER}, ",
        "#{fillDataCount,jdbcType=INTEGER}, #{applyRealnameCount,jdbcType=INTEGER}, ",
        "#{registerLoadPer,jdbcType=VARCHAR}, #{fillDataUserPer,jdbcType=VARCHAR}, ",
        "#{realnameSubmitPer,jdbcType=VARCHAR}, #{activeDeviceNumber,jdbcType=INTEGER})"
    })
    int insert(UserDataStatistics record);

    @InsertProvider(type=UserDataStatisticsSqlProvider.class, method="insertSelective")
    int insertSelective(UserDataStatistics record);

    @SelectProvider(type=UserDataStatisticsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="load_user_count", property="loadUserCount", jdbcType=JdbcType.INTEGER),
        @Result(column="register_user_count", property="registerUserCount", jdbcType=JdbcType.INTEGER),
        @Result(column="fill_data_count", property="fillDataCount", jdbcType=JdbcType.INTEGER),
        @Result(column="apply_realname_count", property="applyRealnameCount", jdbcType=JdbcType.INTEGER),
        @Result(column="register_load_per", property="registerLoadPer", jdbcType=JdbcType.VARCHAR),
        @Result(column="fill_data_user_per", property="fillDataUserPer", jdbcType=JdbcType.VARCHAR),
        @Result(column="realname_submit_per", property="realnameSubmitPer", jdbcType=JdbcType.VARCHAR),
        @Result(column="active_device_number", property="activeDeviceNumber", jdbcType=JdbcType.INTEGER)
    })
    List<UserDataStatistics> selectByExample(UserDataStatisticsExample example);

    @Select({
        "select",
        "id, time, load_user_count, register_user_count, fill_data_count, apply_realname_count, ",
        "register_load_per, fill_data_user_per, realname_submit_per, active_device_number",
        "from user_data_statistics",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="load_user_count", property="loadUserCount", jdbcType=JdbcType.INTEGER),
        @Result(column="register_user_count", property="registerUserCount", jdbcType=JdbcType.INTEGER),
        @Result(column="fill_data_count", property="fillDataCount", jdbcType=JdbcType.INTEGER),
        @Result(column="apply_realname_count", property="applyRealnameCount", jdbcType=JdbcType.INTEGER),
        @Result(column="register_load_per", property="registerLoadPer", jdbcType=JdbcType.VARCHAR),
        @Result(column="fill_data_user_per", property="fillDataUserPer", jdbcType=JdbcType.VARCHAR),
        @Result(column="realname_submit_per", property="realnameSubmitPer", jdbcType=JdbcType.VARCHAR),
        @Result(column="active_device_number", property="activeDeviceNumber", jdbcType=JdbcType.INTEGER)
    })
    UserDataStatistics selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserDataStatisticsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserDataStatistics record, @Param("example") UserDataStatisticsExample example);

    @UpdateProvider(type=UserDataStatisticsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserDataStatistics record, @Param("example") UserDataStatisticsExample example);

    @UpdateProvider(type=UserDataStatisticsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserDataStatistics record);

    @Update({
        "update user_data_statistics",
        "set time = #{time,jdbcType=TIMESTAMP},",
          "load_user_count = #{loadUserCount,jdbcType=INTEGER},",
          "register_user_count = #{registerUserCount,jdbcType=INTEGER},",
          "fill_data_count = #{fillDataCount,jdbcType=INTEGER},",
          "apply_realname_count = #{applyRealnameCount,jdbcType=INTEGER},",
          "register_load_per = #{registerLoadPer,jdbcType=VARCHAR},",
          "fill_data_user_per = #{fillDataUserPer,jdbcType=VARCHAR},",
          "realname_submit_per = #{realnameSubmitPer,jdbcType=VARCHAR},",
          "active_device_number = #{activeDeviceNumber,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserDataStatistics record);
}