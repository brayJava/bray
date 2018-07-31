package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorIllnessKey;
import com.whiteplanet.mapper.model.Illness;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DoctorIllnessMapper {
    @Delete({
        "delete from doctor_illness",
        "where illness_id = #{illnessId,jdbcType=VARCHAR}",
          "and doctor_id = #{doctorId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(DoctorIllnessKey key);

    @Insert({
        "insert into doctor_illness (illness_id, doctor_id)",
        "values (#{illnessId,jdbcType=VARCHAR}, #{doctorId,jdbcType=VARCHAR})"
    })
    int insert(DoctorIllnessKey record);

    @InsertProvider(type=DoctorIllnessSqlProvider.class, method="insertSelective")
    int insertSelective(DoctorIllnessKey record);

    @Select({
            "select * from doctor_illness",
            "where illness_id = #{illnessId,jdbcType=VARCHAR}",
            "and doctor_id = #{doctorId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="illness_id", property="illnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR)
    })
    DoctorIllnessKey selectByPrimaryKey(DoctorIllnessKey key);


    @Select({
            "select i.*",
            "from illness i,doctor_illness di " ,
            "where i.id = di.illness_id",
            "and di.doctor_id = #{doctorId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="note", property="note", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    List<Illness> selectByDoctorId(String doctorId);
}