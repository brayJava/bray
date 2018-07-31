package com.whiteplanet.back.mapper;


import java.util.List;
import com.whiteplanet.back.model.UserLossStatistics;
import com.whiteplanet.back.model.UserLossStatisticsExample;
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

public interface UserLossStatisticsMapper {
    @SelectProvider(type=UserLossStatisticsSqlProvider.class, method="countByExample")
    int countByExample(UserLossStatisticsExample example);

    @DeleteProvider(type=UserLossStatisticsSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserLossStatisticsExample example);

    @Delete({
        "delete from user_loss_statistics",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user_loss_statistics (id, time, ",
        "month_loss_count, quarter_loss_count, ",
        "halfyear_loss_count)",
        "values (#{id,jdbcType=INTEGER}, #{time,jdbcType=TIMESTAMP}, ",
        "#{monthLossCount,jdbcType=INTEGER}, #{quarterLossCount,jdbcType=INTEGER}, ",
        "#{halfyearLossCount,jdbcType=INTEGER})"
    })
    int insert(UserLossStatistics record);

    @InsertProvider(type=UserLossStatisticsSqlProvider.class, method="insertSelective")
    int insertSelective(UserLossStatistics record);

    @SelectProvider(type=UserLossStatisticsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="month_loss_count", property="monthLossCount", jdbcType=JdbcType.INTEGER),
        @Result(column="quarter_loss_count", property="quarterLossCount", jdbcType=JdbcType.INTEGER),
        @Result(column="halfyear_loss_count", property="halfyearLossCount", jdbcType=JdbcType.INTEGER)
    })
    List<UserLossStatistics> selectByExample(UserLossStatisticsExample example);

    @Select({
        "select",
        "id, time, month_loss_count, quarter_loss_count, halfyear_loss_count",
        "from user_loss_statistics",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="month_loss_count", property="monthLossCount", jdbcType=JdbcType.INTEGER),
        @Result(column="quarter_loss_count", property="quarterLossCount", jdbcType=JdbcType.INTEGER),
        @Result(column="halfyear_loss_count", property="halfyearLossCount", jdbcType=JdbcType.INTEGER)
    })
    UserLossStatistics selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserLossStatisticsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserLossStatistics record, @Param("example") UserLossStatisticsExample example);

    @UpdateProvider(type=UserLossStatisticsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserLossStatistics record, @Param("example") UserLossStatisticsExample example);

    @UpdateProvider(type=UserLossStatisticsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserLossStatistics record);

    @Update({
        "update user_loss_statistics",
        "set time = #{time,jdbcType=TIMESTAMP},",
          "month_loss_count = #{monthLossCount,jdbcType=INTEGER},",
          "quarter_loss_count = #{quarterLossCount,jdbcType=INTEGER},",
          "halfyear_loss_count = #{halfyearLossCount,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserLossStatistics record);
}