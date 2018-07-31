package com.whiteplanet.back.mapper;

import java.util.List;

import com.whiteplanet.back.model.ClinicPriceStatistics;
import com.whiteplanet.back.model.ClinicPriceStatisticsExample;
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

public interface ClinicPriceStatisticsMapper {
    @SelectProvider(type=ClinicPriceStatisticsSqlProvider.class, method="countByExample")
    int countByExample(ClinicPriceStatisticsExample example);

    @DeleteProvider(type=ClinicPriceStatisticsSqlProvider.class, method="deleteByExample")
    int deleteByExample(ClinicPriceStatisticsExample example);

    @Delete({
        "delete from clinic_price_statistics",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into clinic_price_statistics (id, time, ",
        "price_range, user_count, ",
        "percentage)",
        "values (#{id,jdbcType=INTEGER}, #{time,jdbcType=TIMESTAMP}, ",
        "#{priceRange,jdbcType=VARCHAR}, #{userCount,jdbcType=INTEGER}, ",
        "#{percentage,jdbcType=VARCHAR})"
    })
    int insert(ClinicPriceStatistics record);

    @InsertProvider(type=ClinicPriceStatisticsSqlProvider.class, method="insertSelective")
    int insertSelective(ClinicPriceStatistics record);

    @SelectProvider(type=ClinicPriceStatisticsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="price_range", property="priceRange", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_count", property="userCount", jdbcType=JdbcType.INTEGER),
        @Result(column="percentage", property="percentage", jdbcType=JdbcType.VARCHAR)
    })
    List<ClinicPriceStatistics> selectByExample(ClinicPriceStatisticsExample example);

    @Select({
        "select",
        "id, time, price_range, user_count, percentage",
        "from clinic_price_statistics",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="price_range", property="priceRange", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_count", property="userCount", jdbcType=JdbcType.INTEGER),
        @Result(column="percentage", property="percentage", jdbcType=JdbcType.VARCHAR)
    })
    ClinicPriceStatistics selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ClinicPriceStatisticsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ClinicPriceStatistics record, @Param("example") ClinicPriceStatisticsExample example);

    @UpdateProvider(type=ClinicPriceStatisticsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ClinicPriceStatistics record, @Param("example") ClinicPriceStatisticsExample example);

    @UpdateProvider(type=ClinicPriceStatisticsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ClinicPriceStatistics record);

    @Update({
        "update clinic_price_statistics",
        "set time = #{time,jdbcType=TIMESTAMP},",
          "price_range = #{priceRange,jdbcType=VARCHAR},",
          "user_count = #{userCount,jdbcType=INTEGER},",
          "percentage = #{percentage,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ClinicPriceStatistics record);
}