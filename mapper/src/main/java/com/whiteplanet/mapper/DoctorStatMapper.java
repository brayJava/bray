package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.FillDataStat;
import com.whiteplanet.mapper.model.RealnameAuthStat;
import com.whiteplanet.mapper.model.RegisterStat;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 用户统计
 * @date: Created in 15:47 2018/3/30
 * @modified By:
 */
public interface DoctorStatMapper {

    @Select({
            " SELECT",
            " date_format(create_date, '%Y/%m/%d') register_time,",
            " count(*) register_count ",
            " FROM ",
            " doctor",
            " WHERE",
            " phone <> '' ",
            " AND",
            " date_format(create_date, '%Y/%m/%d') > #{startTime, jdbcType=VARCHAR} ",
//            " AND ",
//            " date_format(create_date, '%Y/%m/%d') <= #{endTime, jdbcType=VARCHAR} ",
            " GROUP BY",
            " register_time DESC "
    })
    @Results({
            @Result(column="register_time", property="registerTime", jdbcType= JdbcType.VARCHAR),
            @Result(column="register_count", property="registerCount", jdbcType= JdbcType.INTEGER),
    })
    List<RegisterStat> selectRegisterTimes(String startTime);

    @Select({
            " select",
            " date_format(update_date, '%Y/%m/%d') fill_data_time,",
            " COUNT(*) fill_data_count",
            " FROM",
            " doctor",
            " where" ,
            " real_name <> '' ",
            " AND ",
            " date_format(update_date, '%Y/%m/%d') > #{startTime, jdbcType=VARCHAR} " ,
//            " AND ",
//            " date_format(update_date, '%Y/%m/%d') <= #{endTime, jdbcType=VARCHAR} " ,
            " GROUP BY ",
            " fill_data_time DESC "
    })
    @Results({
            @Result(column="fill_data_time", property="fillDataTime", jdbcType= JdbcType.VARCHAR),
            @Result(column="fill_data_count", property="fillDataCount", jdbcType= JdbcType.INTEGER),
    })
    List<FillDataStat> selectFillDataTimes(String startTime);

    @Select({
            " select",
            " date_format(create_date, '%Y/%m/%d') realname_auth_time, ",
            " COUNT(*) realname_auth_count ",
            " FROM ",
            " doctor" ,
            " where ",
            " identify_status not in(0) " ,
            " AND ",
            " date_format(create_date, '%Y/%m/%d') > #{startTime, jdbcType=VARCHAR} ",
//            " AND ",
//            " date_format(create_date, '%Y/%m/%d') <= #{end, jdbcType=VARCHAR} ",
            " GROUP BY ",
            " realname_auth_time DESC "
    })
    @Results({
            @Result(column="realname_auth_time", property="realnameAuthTime", jdbcType= JdbcType.VARCHAR),
            @Result(column="realname_auth_count", property="realnameAuthCount", jdbcType= JdbcType.INTEGER),
    })
    List<RealnameAuthStat> selectRealnameAuthTimes(String startTime);
}
