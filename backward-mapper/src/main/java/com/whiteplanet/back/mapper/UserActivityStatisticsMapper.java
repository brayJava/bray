package com.whiteplanet.back.mapper;


import com.whiteplanet.back.model.UserActivityStatistics;
import com.whiteplanet.back.model.UserActivityStatisticsExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UserActivityStatisticsMapper {
    @SelectProvider(type=UserActivityStatisticsSqlProvider.class, method="countByExample")
    int countByExample(UserActivityStatisticsExample example);

    @DeleteProvider(type=UserActivityStatisticsSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserActivityStatisticsExample example);

    @Delete({
        "delete from user_activity_statistics",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user_activity_statistics (id, time, ",
        "daily_activity, week_activity, ",
        "month_activity)",
        "values (#{id,jdbcType=INTEGER}, #{time,jdbcType=TIMESTAMP}, ",
        "#{dailyActivity,jdbcType=INTEGER}, #{weekActivity,jdbcType=INTEGER}, ",
        "#{monthActivity,jdbcType=INTEGER})"
    })
    int insert(UserActivityStatistics record);

    @InsertProvider(type=UserActivityStatisticsSqlProvider.class, method="insertSelective")
    int insertSelective(UserActivityStatistics record);

    @SelectProvider(type=UserActivityStatisticsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="daily_activity", property="dailyActivity", jdbcType=JdbcType.INTEGER),
        @Result(column="week_activity", property="weekActivity", jdbcType=JdbcType.INTEGER),
        @Result(column="month_activity", property="monthActivity", jdbcType=JdbcType.INTEGER)
    })
    List<UserActivityStatistics> selectByExample(UserActivityStatisticsExample example);

    @Select({
        "select",
        "id, time, daily_activity, week_activity, month_activity",
        "from user_activity_statistics",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="daily_activity", property="dailyActivity", jdbcType=JdbcType.INTEGER),
        @Result(column="week_activity", property="weekActivity", jdbcType=JdbcType.INTEGER),
        @Result(column="month_activity", property="monthActivity", jdbcType=JdbcType.INTEGER)
    })
    UserActivityStatistics selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, time, daily_activity, week_activity, month_activity",
            "from user_activity_statistics",
            " where date_format(time, '%Y/%m/%d') >= #{startTime,jdbcType=VARCHAR} " ,
            " and date_format(time, '%Y/%m/%d') <= #{endTime,jdbcType=VARCHAR} " ,
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="daily_activity", property="dailyActivity", jdbcType=JdbcType.INTEGER),
            @Result(column="week_activity", property="weekActivity", jdbcType=JdbcType.INTEGER),
            @Result(column="month_activity", property="monthActivity", jdbcType=JdbcType.INTEGER)
    })
    List<UserActivityStatistics> selectUserActivityStat(String startTime, String endTime);

    @UpdateProvider(type=UserActivityStatisticsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserActivityStatistics record, @Param("example") UserActivityStatisticsExample example);

    @UpdateProvider(type=UserActivityStatisticsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserActivityStatistics record, @Param("example") UserActivityStatisticsExample example);

    @UpdateProvider(type=UserActivityStatisticsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserActivityStatistics record);

    @Update({
        "update user_activity_statistics",
        "set time = #{time,jdbcType=TIMESTAMP},",
          "daily_activity = #{dailyActivity,jdbcType=INTEGER},",
          "week_activity = #{weekActivity,jdbcType=INTEGER},",
          "month_activity = #{monthActivity,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserActivityStatistics record);
}