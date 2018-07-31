package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorImage;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DoctorImageMapper {
    @Delete({
        "delete from doctor_image",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Delete({
            "delete from doctor_image",
            "where pub_file_id = #{pubFileId,jdbcType=INTEGER}"
    })
    int deleteByPubFileId(String pubFileId);

    @Insert({
        "insert into doctor_image (id, sort, ",
        "doctor_id, pub_file_id)",
        "values (#{id,jdbcType=INTEGER}, #{sort,jdbcType=INTEGER}, ",
        "#{doctorId,jdbcType=VARCHAR}, #{pubFileId,jdbcType=VARCHAR})"
    })
    int insert(DoctorImage record);

    @InsertProvider(type=DoctorImageSqlProvider.class, method="insertSelective")
    int insertSelective(DoctorImage record);

    @Select({
        "select",
        "id, sort, doctor_id, pub_file_id",
        "from doctor_image",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="sort", property="sort", jdbcType= JdbcType.INTEGER),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="pub_file_id", property="pubFileId", jdbcType= JdbcType.VARCHAR)
    })
    DoctorImage selectByPrimaryKey(Integer id);

    @UpdateProvider(type=DoctorImageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DoctorImage record);

    @Update({
        "update doctor_image",
        "set sort = #{sort,jdbcType=INTEGER},",
          "doctor_id = #{doctorId,jdbcType=VARCHAR},",
          "pub_file_id = #{pubFileId,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DoctorImage record);

    @Select({
            "select",
            "pub_file_id, sort",
            "from doctor_image",
            "where doctor_id = #{doctorId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="sort", property="sort", jdbcType= JdbcType.INTEGER),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="pub_file_id", property="pubFileId", jdbcType= JdbcType.VARCHAR)
    })
    List<DoctorImage> selectImageIdByDoctorId(String doctorId);

    @Select({
            "select",
            "id, sort, doctor_id, pub_file_id",
            "from doctor_image",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and sort = #{sort,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="sort", property="sort", jdbcType= JdbcType.INTEGER),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pub_file_id", property="pubFileId", jdbcType= JdbcType.VARCHAR)
    })
    DoctorImage selectByDoctorIdAndSort(@Param("doctorId") String doctorId, @Param("sort") Integer sort);

}