package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.ClinicImage;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ClinicImageMapper {
    @Delete({
        "delete from clinic_image",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Delete({
            "delete from clinic_image",
            "where pub_file_id = #{pubFileId,jdbcType=INTEGER}"
    })
    int deleteByPubFileId(String pubFileId);

    @Insert({
        "insert into clinic_image (id, sort, ",
        "pub_file_id, clinic_id)",
        "values (#{id,jdbcType=INTEGER}, #{sort,jdbcType=INTEGER}, ",
        "#{pubFileId,jdbcType=VARCHAR}, #{clinicId,jdbcType=VARCHAR})"
    })
    int insert(ClinicImage record);

    @InsertProvider(type=ClinicImageSqlProvider.class, method="insertSelective")
    int insertSelective(ClinicImage record);

    @Select({
        "select",
        "id, sort, pub_file_id, clinic_id",
        "from clinic_image",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="sort", property="sort", jdbcType= JdbcType.INTEGER),
        @Result(column="pub_file_id", property="pubFileId", jdbcType= JdbcType.VARCHAR),
        @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR)
    })
    ClinicImage selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ClinicImageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ClinicImage record);

    @Update({
        "update clinic_image",
        "set sort = #{sort,jdbcType=INTEGER},",
          "pub_file_id = #{pubFileId,jdbcType=VARCHAR},",
          "clinic_id = #{clinicId,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ClinicImage record);

    @Select({
            "select",
            "pub_file_id, sort",
            "from clinic_image",
            "where clinic_id = #{clinicId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="sort", property="sort", jdbcType= JdbcType.INTEGER),
            @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pub_file_id", property="pubFileId", jdbcType= JdbcType.VARCHAR)
    })
    List<ClinicImage> selectImageIdByClinicId(String clinicId);

    @Select({
            "select",
            "id, sort, clinic_id, pub_file_id",
            "from clinic_image",
            "where clinic_id = #{clinicId,jdbcType=VARCHAR}",
            "and sort = #{sort,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="sort", property="sort", jdbcType= JdbcType.INTEGER),
            @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pub_file_id", property="pubFileId", jdbcType= JdbcType.VARCHAR)
    })
    ClinicImage selectByClinicIdAndSort(@Param("clinicId") String clinicId, @Param("sort") Integer sort);
}