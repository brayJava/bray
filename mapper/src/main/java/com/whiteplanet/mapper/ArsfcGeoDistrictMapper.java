package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.ArsfcGeoDistrict;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ArsfcGeoDistrictMapper {
    @Delete({
        "delete from arsfc_geo_district",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into arsfc_geo_district (id, adcode, ",
        "name, lat, lng, ",
        "parentAdcode, citycode)",
        "values (#{id,jdbcType=INTEGER}, #{adcode,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{lat,jdbcType=DOUBLE}, #{lng,jdbcType=DOUBLE}, ",
        "#{parentadcode,jdbcType=VARCHAR}, #{citycode,jdbcType=VARCHAR})"
    })
    int insert(ArsfcGeoDistrict record);

    @InsertProvider(type=ArsfcGeoDistrictSqlProvider.class, method="insertSelective")
    int insertSelective(ArsfcGeoDistrict record);

    @Select({
        "select",
        "id, adcode, name, lat, lng, parentAdcode, citycode",
        "from arsfc_geo_district",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="adcode", property="adcode", jdbcType= JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        @Result(column="lat", property="lat", jdbcType= JdbcType.DOUBLE),
        @Result(column="lng", property="lng", jdbcType= JdbcType.DOUBLE),
        @Result(column="parentAdcode", property="parentadcode", jdbcType= JdbcType.VARCHAR),
        @Result(column="citycode", property="citycode", jdbcType= JdbcType.VARCHAR)
    })
    ArsfcGeoDistrict selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, adcode, name, lat, lng, parentAdcode, citycode",
            "from arsfc_geo_district",
            "where parentAdcode = #{parentAdcode,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="adcode", property="adcode", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="lat", property="lat", jdbcType= JdbcType.DOUBLE),
            @Result(column="lng", property="lng", jdbcType= JdbcType.DOUBLE),
            @Result(column="parentAdcode", property="parentadcode", jdbcType= JdbcType.VARCHAR),
            @Result(column="citycode", property="citycode", jdbcType= JdbcType.VARCHAR)
    })
    List<ArsfcGeoDistrict> selectByParentCode(String parentAdcode);

    @UpdateProvider(type=ArsfcGeoDistrictSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ArsfcGeoDistrict record);

    @Update({
        "update arsfc_geo_district",
        "set adcode = #{adcode,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "lat = #{lat,jdbcType=DOUBLE},",
          "lng = #{lng,jdbcType=DOUBLE},",
          "parentAdcode = #{parentadcode,jdbcType=VARCHAR},",
          "citycode = #{citycode,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ArsfcGeoDistrict record);
}