package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.ArsfcGeoCity;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ArsfcGeoCityMapper {
    @Delete({
        "delete from arsfc_geo_city",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into arsfc_geo_city (id, adcode, ",
        "name, lat, lng, ",
        "parentAdcode, citycode)",
        "values (#{id,jdbcType=INTEGER}, #{adcode,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{lat,jdbcType=DOUBLE}, #{lng,jdbcType=DOUBLE}, ",
        "#{parentadcode,jdbcType=VARCHAR}, #{citycode,jdbcType=VARCHAR})"
    })
    int insert(ArsfcGeoCity record);

    @InsertProvider(type=ArsfcGeoCitySqlProvider.class, method="insertSelective")
    int insertSelective(ArsfcGeoCity record);

    @Select({
        "select",
        "id, adcode, name, lat, lng, parentAdcode, citycode",
        "from arsfc_geo_city",
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
    ArsfcGeoCity selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, adcode, name, lat, lng, parentAdcode, citycode",
            "from arsfc_geo_city",
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
    List<ArsfcGeoCity> selectByParentCode(String parentAdcode);

    @UpdateProvider(type=ArsfcGeoCitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ArsfcGeoCity record);

    @Update({
        "update arsfc_geo_city",
        "set adcode = #{adcode,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "lat = #{lat,jdbcType=DOUBLE},",
          "lng = #{lng,jdbcType=DOUBLE},",
          "parentAdcode = #{parentadcode,jdbcType=VARCHAR},",
          "citycode = #{citycode,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ArsfcGeoCity record);

    @Select({
            "select",
            "id, adcode, name, parentAdcode, citycode",
            "from arsfc_geo_city"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="adcode", property="adcode", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="parentAdcode", property="parentadcode", jdbcType= JdbcType.VARCHAR),
    })
    List<ArsfcGeoCity> selectAll();
}