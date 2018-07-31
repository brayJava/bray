package com.whiteplanet.back.mapper;

import java.util.List;
import com.whiteplanet.back.model.ClinicInvocationStatistics;
import com.whiteplanet.back.model.ClinicInvocationStatisticsExample;
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

public interface ClinicInvocationStatisticsMapper {
    @SelectProvider(type=ClinicInvocationStatisticsSqlProvider.class, method="countByExample")
    int countByExample(ClinicInvocationStatisticsExample example);

    @DeleteProvider(type=ClinicInvocationStatisticsSqlProvider.class, method="deleteByExample")
    int deleteByExample(ClinicInvocationStatisticsExample example);

    @Delete({
        "delete from clinic_invocation_statistics",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into clinic_invocation_statistics (id, time, ",
        "invocation_total_count, invocation_register_count, ",
        "invocation_success_per, clinic_avg_invocation)",
        "values (#{id,jdbcType=INTEGER}, #{time,jdbcType=TIMESTAMP}, ",
        "#{invocationTotalCount,jdbcType=INTEGER}, #{invocationRegisterCount,jdbcType=INTEGER}, ",
        "#{invocationSuccessPer,jdbcType=VARCHAR}, #{clinicAvgInvocation,jdbcType=INTEGER})"
    })
    int insert(ClinicInvocationStatistics record);

    @InsertProvider(type=ClinicInvocationStatisticsSqlProvider.class, method="insertSelective")
    int insertSelective(ClinicInvocationStatistics record);

    @SelectProvider(type=ClinicInvocationStatisticsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="invocation_total_count", property="invocationTotalCount", jdbcType=JdbcType.INTEGER),
        @Result(column="invocation_register_count", property="invocationRegisterCount", jdbcType=JdbcType.INTEGER),
        @Result(column="invocation_success_per", property="invocationSuccessPer", jdbcType=JdbcType.VARCHAR),
        @Result(column="clinic_avg_invocation", property="clinicAvgInvocation", jdbcType=JdbcType.INTEGER)
    })
    List<ClinicInvocationStatistics> selectByExample(ClinicInvocationStatisticsExample example);

    @Select({
        "select",
        "id, time, invocation_total_count, invocation_register_count, invocation_success_per, ",
        "clinic_avg_invocation",
        "from clinic_invocation_statistics",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="invocation_total_count", property="invocationTotalCount", jdbcType=JdbcType.INTEGER),
        @Result(column="invocation_register_count", property="invocationRegisterCount", jdbcType=JdbcType.INTEGER),
        @Result(column="invocation_success_per", property="invocationSuccessPer", jdbcType=JdbcType.VARCHAR),
        @Result(column="clinic_avg_invocation", property="clinicAvgInvocation", jdbcType=JdbcType.INTEGER)
    })
    ClinicInvocationStatistics selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ClinicInvocationStatisticsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ClinicInvocationStatistics record, @Param("example") ClinicInvocationStatisticsExample example);

    @UpdateProvider(type=ClinicInvocationStatisticsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ClinicInvocationStatistics record, @Param("example") ClinicInvocationStatisticsExample example);

    @UpdateProvider(type=ClinicInvocationStatisticsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ClinicInvocationStatistics record);

    @Update({
        "update clinic_invocation_statistics",
        "set time = #{time,jdbcType=TIMESTAMP},",
          "invocation_total_count = #{invocationTotalCount,jdbcType=INTEGER},",
          "invocation_register_count = #{invocationRegisterCount,jdbcType=INTEGER},",
          "invocation_success_per = #{invocationSuccessPer,jdbcType=VARCHAR},",
          "clinic_avg_invocation = #{clinicAvgInvocation,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ClinicInvocationStatistics record);

    @Select({
            "select",
            "id, time, invocation_total_count, invocation_register_count, invocation_success_per, ",
            "clinic_avg_invocation",
            "from clinic_invocation_statistics",
            "where time >= #{startTime,jdbcType=VARCHAR} " ,
            " and time <= #{endTime,jdbcType=VARCHAR} "
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="invocation_total_count", property="invocationTotalCount", jdbcType=JdbcType.INTEGER),
            @Result(column="invocation_register_count", property="invocationRegisterCount", jdbcType=JdbcType.INTEGER),
            @Result(column="invocation_success_per", property="invocationSuccessPer", jdbcType=JdbcType.VARCHAR),
            @Result(column="clinic_avg_invocation", property="clinicAvgInvocation", jdbcType=JdbcType.INTEGER)
    })
    List<ClinicInvocationStatistics> selectInvocationStat(String startTime , String endTime);
}