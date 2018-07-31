package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.ArsfcGeoProvince;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ArsfcGeoProvinceMapper {
    @Delete({
        "delete from arsfc_geo_province",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into arsfc_geo_province (id, adcode, ",
        "name, lat, lng, ",
        "parentAdcode, citycode)",
        "values (#{id,jdbcType=INTEGER}, #{adcode,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{lat,jdbcType=DOUBLE}, #{lng,jdbcType=DOUBLE}, ",
        "#{parentadcode,jdbcType=VARCHAR}, #{citycode,jdbcType=VARCHAR})"
    })
    int insert(ArsfcGeoProvince record);

    @InsertProvider(type=ArsfcGeoProvinceSqlProvider.class, method="insertSelective")
    int insertSelective(ArsfcGeoProvince record);

    @Select({
        "select",
        "id, adcode, name, lat, lng, parentAdcode, citycode",
        "from arsfc_geo_province",
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
    ArsfcGeoProvince selectByPrimaryKey(Integer id);

    /**
     *
     * @return
     */
    @Select({
            "select",
            "id, adcode, name",
            "from arsfc_geo_province"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="adcode", property="adcode", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
    })
    List<ArsfcGeoProvince> selectAll();

    @UpdateProvider(type=ArsfcGeoProvinceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ArsfcGeoProvince record);

    @Update({
        "update arsfc_geo_province",
        "set adcode = #{adcode,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "lat = #{lat,jdbcType=DOUBLE},",
          "lng = #{lng,jdbcType=DOUBLE},",
          "parentAdcode = #{parentadcode,jdbcType=VARCHAR},",
          "citycode = #{citycode,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ArsfcGeoProvince record);
}