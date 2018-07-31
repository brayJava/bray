package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Visiting;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface VisitingMapper {
    @Delete({
            "delete from visiting",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into visiting (id, order_id, ",
            "doctor_calendar_id, time, ",
            "create_time, hospital_id, ",
            "hospital_name, address,status, ",
            "room)",
            "values (#{id,jdbcType=VARCHAR}, #{orderId,jdbcType=VARCHAR}, ",
            "#{doctorCalendarId,jdbcType=VARCHAR}, #{time,jdbcType=TIMESTAMP}, ",
            "#{createTime,jdbcType=TIMESTAMP}, #{hospitalId,jdbcType=VARCHAR}, ",
            "#{hospitalName,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
            "#{status,jdbcType=INTEGER},{room,jdbcType=VARCHAR})"
    })
    int insert(Visiting record);

    @InsertProvider(type=VisitingSqlProvider.class, method="insertSelective")
    int insertSelective(Visiting record);

    @Select({
            "select",
            "id, order_id, doctor_calendar_id, time, create_time, hospital_id, hospital_name, ",
            "address, room, status",
            "from visiting",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="doctor_calendar_id", property="doctorCalendarId", jdbcType= JdbcType.VARCHAR),
            @Result(column="time", property="time", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
            @Result(column="room", property="room", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    Visiting selectByPrimaryKey(String id);

    @UpdateProvider(type=VisitingSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Visiting record);

    @Update({
            "update visiting",
            "set order_id = #{orderId,jdbcType=VARCHAR},",
            "doctor_calendar_id = #{doctorCalendarId,jdbcType=VARCHAR},",
            "time = #{time,jdbcType=TIMESTAMP},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "hospital_id = #{hospitalId,jdbcType=VARCHAR},",
            "hospital_name = #{hospitalName,jdbcType=VARCHAR},",
            "address = #{address,jdbcType=VARCHAR},",
            "room = #{room,jdbcType=VARCHAR}",
            "status = #{status,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Visiting record);

    @Select({
            "select",
            "id, order_id, doctor_calendar_id, time, create_time, hospital_id,",
            "hospital_name, address, room, status",
            "from visiting",
            "where order_id = #{orderId,jdbcType=VARCHAR}",
            "and status = 0",
            "order by create_time desc"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="doctor_calendar_id", property="doctorCalendarId", jdbcType= JdbcType.VARCHAR),
            @Result(column="time", property="time", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
            @Result(column="room", property="room", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    Visiting selectByOrderId(String id);

    @Select({
            "select",
            "id, order_id, doctor_calendar_id, time, create_time, hospital_id,",
            "hospital_name, address, room, status",
            "from visiting",
            "where status = 0",
            "and DATE_SUB(time,INTERVAL -2 DAY) < now()",
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="doctor_calendar_id", property="doctorCalendarId", jdbcType= JdbcType.VARCHAR),
            @Result(column="time", property="time", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
            @Result(column="room", property="room", jdbcType= JdbcType.VARCHAR),
    })
    List<Visiting> selectVisitingListCreateTimeTwoDay();

    @Select({
            "select",
            "id, order_id, doctor_calendar_id, time, create_time, hospital_id,",
            "hospital_name, address, room, status",
            "from visiting",
            "where status = 0",
            "and DATE_SUB(time,INTERVAL -2 HOUR) < now()",
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="doctor_calendar_id", property="doctorCalendarId", jdbcType= JdbcType.VARCHAR),
            @Result(column="time", property="time", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
            @Result(column="room", property="room", jdbcType= JdbcType.VARCHAR),
    })
    List<Visiting> selectVisitingListCreateTimeTwoHour();
}