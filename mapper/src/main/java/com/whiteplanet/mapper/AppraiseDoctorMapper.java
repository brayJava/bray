package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.AppraiseDoctor;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface AppraiseDoctorMapper {
    @Delete({
            "delete from appraise_doctor",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
            "insert into appraise_doctor (id, doctor_id, ",
            "doctor_id_target, order_id, ",
            "major, comment, ",
            "familiar, create_date, ethics)",
            "values (#{id,jdbcType=INTEGER}, #{doctorId,jdbcType=VARCHAR}, ",
            "#{doctorIdTarget,jdbcType=VARCHAR}, #{orderId,jdbcType=VARCHAR}, ",
            "#{major,jdbcType=INTEGER}, #{comment,jdbcType=VARCHAR}, ",
            "#{familiar,jdbcType=INTEGER}, #{createDate,jdbcType=TIMESTAMP}, #{ethics,jdbcType=INTEGER})"
    })
    int insert(AppraiseDoctor record);

    @InsertProvider(type=AppraiseDoctorSqlProvider.class, method="insertSelective")
    int insertSelective(AppraiseDoctor record);

    @Select({
            "select",
            "id, doctor_id, doctor_id_target, order_id, major, comment, familiar, create_date, ethics",
            "from appraise_doctor",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="doctor_id_target", property="doctorIdTarget", jdbcType= JdbcType.VARCHAR),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="major", property="major", jdbcType= JdbcType.INTEGER),
            @Result(column="comment", property="comment", jdbcType= JdbcType.VARCHAR),
            @Result(column="familiar", property="familiar", jdbcType= JdbcType.INTEGER),
            @Result(column="ethics", property="ethics", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    AppraiseDoctor selectByPrimaryKey(Integer id);

    @UpdateProvider(type=AppraiseDoctorSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AppraiseDoctor record);

    @Update({
            "update appraise_doctor",
            "set doctor_id = #{doctorId,jdbcType=VARCHAR},",
            "doctor_id_target = #{doctorIdTarget,jdbcType=VARCHAR},",
            "order_id = #{orderId,jdbcType=VARCHAR},",
            "major = #{major,jdbcType=INTEGER},",
            "comment = #{comment,jdbcType=VARCHAR},",
            "familiar = #{familiar,jdbcType=INTEGER},",
            "ethics = #{ethics,jdbcType=INTEGER},",
            "create_date = #{createDate,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AppraiseDoctor record);

    @Select({
            "select",
            "id, doctor_id, doctor_id_target, order_id, major, comment, familiar, create_date, ethics",
            "from appraise_doctor",
            "where order_id = #{orderId, jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="doctor_id_target", property="doctorIdTarget", jdbcType= JdbcType.VARCHAR),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="major", property="major", jdbcType= JdbcType.INTEGER),
            @Result(column="comment", property="comment", jdbcType= JdbcType.VARCHAR),
            @Result(column="familiar", property="familiar", jdbcType= JdbcType.INTEGER),
            @Result(column="ethics", property="ethics", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    AppraiseDoctor selectByOrderId(String orderId);
}