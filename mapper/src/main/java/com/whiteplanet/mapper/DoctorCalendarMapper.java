package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorCalendar;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.HashMap;
import java.util.List;

public interface DoctorCalendarMapper {
    @Delete({
            "delete from doctor_calendar",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into doctor_calendar (id, doctor_id, ",
            "week, stage, hospital_id, ",
            "hospital_name, name, ",
            "address, room, ",
            "outpatient_type, type, ",
            "status)",
            "values (#{id,jdbcType=VARCHAR}, #{doctorId,jdbcType=VARCHAR}, ",
            "#{week,jdbcType=INTEGER}, #{stage,jdbcType=INTEGER}, #{hospitalId,jdbcType=VARCHAR}, ",
            "#{hospitalName,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
            "#{address,jdbcType=VARCHAR}, #{room,jdbcType=VARCHAR}, ",
            "#{outpatientType,jdbcType=VARCHAR}, #{type,jdbcType=INTEGER}, ",
            "#{status,jdbcType=INTEGER})"
    })
    int insert(DoctorCalendar record);

    @InsertProvider(type=DoctorCalendarSqlProvider.class, method="insertSelective")
    int insertSelective(DoctorCalendar record);

    @Select({
            "select",
            "id, doctor_id, week, stage, hospital_id, hospital_name, name, address, room, ",
            "outpatient_type, type, status",
            "from doctor_calendar",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="week", property="week", jdbcType= JdbcType.INTEGER),
            @Result(column="stage", property="stage", jdbcType= JdbcType.INTEGER),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
            @Result(column="room", property="room", jdbcType= JdbcType.VARCHAR),
            @Result(column="outpatient_type", property="outpatientType", jdbcType= JdbcType.VARCHAR),
            @Result(column="type", property="type", jdbcType= JdbcType.INTEGER),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    DoctorCalendar selectByPrimaryKey(String id);

    @UpdateProvider(type=DoctorCalendarSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DoctorCalendar record);

    @Update({
            "update doctor_calendar",
            "set doctor_id = #{doctorId,jdbcType=VARCHAR},",
            "week = #{week,jdbcType=INTEGER},",
            "stage = #{stage,jdbcType=INTEGER},",
            "hospital_id = #{hospitalId,jdbcType=VARCHAR},",
            "hospital_name = #{hospitalName,jdbcType=VARCHAR},",
            "name = #{name,jdbcType=VARCHAR},",
            "address = #{address,jdbcType=VARCHAR},",
            "room = #{room,jdbcType=VARCHAR},",
            "outpatient_type = #{outpatientType,jdbcType=VARCHAR},",
            "type = #{type,jdbcType=INTEGER},",
            "status = #{status,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DoctorCalendar record);

    /**
     *
     * @param doctorId
     * @param kind
     * @return
     */
    @Select({
            "select",
            "id, doctor_id, week, stage, hospital_id, hospital_name, name, address, room, ",
            "outpatient_type, type",
            "from doctor_calendar",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and type = #{type,jdbcType=INTEGER}",
            "and status = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="week", property="week", jdbcType= JdbcType.INTEGER),
            @Result(column="stage", property="stage", jdbcType= JdbcType.INTEGER),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
            @Result(column="room", property="room", jdbcType= JdbcType.VARCHAR),
            @Result(column="outpatient_type", property="outpatientType", jdbcType= JdbcType.VARCHAR),
            @Result(column="type", property="type", jdbcType= JdbcType.INTEGER)
    })
    List<DoctorCalendar> selectByDoctorAndKind(@Param("doctorId") String doctorId, @Param("type") int kind);

    @Select({
            "select",
            "id, doctor_id, week, stage, hospital_id, hospital_name, name, address, room, ",
            "outpatient_type, type",
            "from doctor_calendar",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and type in (0, 1)",
            "and status = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="week", property="week", jdbcType= JdbcType.INTEGER),
            @Result(column="stage", property="stage", jdbcType= JdbcType.INTEGER),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
            @Result(column="room", property="room", jdbcType= JdbcType.VARCHAR),
            @Result(column="outpatient_type", property="outpatientType", jdbcType= JdbcType.VARCHAR),
            @Result(column="type", property="type", jdbcType= JdbcType.INTEGER)
    })
    List<DoctorCalendar> selectByDoctor(@Param("doctorId") String doctorId);

    @Select({
        "select ",
        "id, doctor_id, week, stage, hospital_id, hospital_name, name, address, room, ",
        "outpatient_type, type",
        "from doctor_calendar",
        "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
        "order by week asc"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="week", property="week", jdbcType= JdbcType.INTEGER),
        @Result(column="stage", property="stage", jdbcType= JdbcType.INTEGER),
        @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
        @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
        @Result(column="room", property="room", jdbcType= JdbcType.VARCHAR),
        @Result(column="outpatient_type", property="outpatientType", jdbcType= JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType= JdbcType.INTEGER)
    })
    List<DoctorCalendar> selectByDoctorId(String doctorId);  // must order by week asc

    @Select({
            "select ",
            "id, doctor_id, week, stage, hospital_id, hospital_name, name, address, room, ",
            "outpatient_type, type",
            "from doctor_calendar",
            "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and type != 2",
            "order by week asc"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="week", property="week", jdbcType= JdbcType.INTEGER),
            @Result(column="stage", property="stage", jdbcType= JdbcType.INTEGER),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
            @Result(column="room", property="room", jdbcType= JdbcType.VARCHAR),
            @Result(column="outpatient_type", property="outpatientType", jdbcType= JdbcType.VARCHAR),
            @Result(column="type", property="type", jdbcType= JdbcType.INTEGER)
    })
    List<DoctorCalendar> selectByDoctorIdAndNoTypeTwo(String doctorId);  // must order by week asc

    @Select({
            "select",
            "count(1)",
            "from doctor_calendar",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}"
    })
    int selectCountByDoctorId(String doctorId);


    @Select({
            "select ",
            "id, doctor_id, week, stage, hospital_id, hospital_name, name, address, room, ",
            "outpatient_type, type",
            "from doctor_calendar",
            "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and week = #{week, jdbcType=INTEGER}",
            "and stage = #{stage, jdbcType=INTEGER}",
            "and (type = #{typeA, jdbcType=INTEGER} or type = #{typeB, jdbcType=INTEGER})"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="week", property="week", jdbcType= JdbcType.INTEGER),
            @Result(column="stage", property="stage", jdbcType= JdbcType.INTEGER),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
            @Result(column="room", property="room", jdbcType= JdbcType.VARCHAR),
            @Result(column="outpatient_type", property="outpatientType", jdbcType= JdbcType.VARCHAR),
            @Result(column="type", property="type", jdbcType= JdbcType.INTEGER)
    })
    List<DoctorCalendar> selectByDoctorIdAndWeekAndStageAndTypeAORB(HashMap map);

    @Select({
            "select ",
            "id, doctor_id, week, stage, hospital_id, hospital_name, name, address, room, ",
            "outpatient_type, type",
            "from doctor_calendar",
            "where doctor_id = #{doctorId, jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="week", property="week", jdbcType= JdbcType.INTEGER),
            @Result(column="stage", property="stage", jdbcType= JdbcType.INTEGER),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
            @Result(column="room", property="room", jdbcType= JdbcType.VARCHAR),
            @Result(column="outpatient_type", property="outpatientType", jdbcType= JdbcType.VARCHAR),
            @Result(column="type", property="type", jdbcType= JdbcType.INTEGER)
    })
    List<DoctorCalendar> selectByDoctorIdAndWeekAndStageAndNoTypeNoStageNoWeek(HashMap map);

    @Select({
            "select ",
            "id, doctor_id, week, stage, hospital_id, hospital_name, name, address, room, ",
            "outpatient_type, type",
            "from doctor_calendar",
            "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and hospital_name like '%${hospitalName, jdbcType=VARCHAR}%'"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="week", property="week", jdbcType= JdbcType.INTEGER),
            @Result(column="stage", property="stage", jdbcType= JdbcType.INTEGER),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
            @Result(column="room", property="room", jdbcType= JdbcType.VARCHAR),
            @Result(column="outpatient_type", property="outpatientType", jdbcType= JdbcType.VARCHAR),
            @Result(column="type", property="type", jdbcType= JdbcType.INTEGER)
    })
    List<DoctorCalendar> selectByDoctorIdAndLikeHospitalName(HashMap map);
}
