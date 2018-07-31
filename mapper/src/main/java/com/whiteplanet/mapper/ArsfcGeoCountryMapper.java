package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.ArsfcGeoCountry;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ArsfcGeoCountryMapper {
    @Delete({
        "delete from arsfc_geo_country",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into arsfc_geo_country (id, adcode, ",
        "name, lat, lng)",
        "values (#{id,jdbcType=INTEGER}, #{adcode,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{lat,jdbcType=DOUBLE}, #{lng,jdbcType=DOUBLE})"
    })
    int insert(ArsfcGeoCountry record);

    @InsertProvider(type=ArsfcGeoCountrySqlProvider.class, method="insertSelective")
    int insertSelective(ArsfcGeoCountry record);

    @Select({
        "select",
        "id, adcode, name, lat, lng",
        "from arsfc_geo_country",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="adcode", property="adcode", jdbcType= JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        @Result(column="lat", property="lat", jdbcType= JdbcType.DOUBLE),
        @Result(column="lng", property="lng", jdbcType= JdbcType.DOUBLE)
    })
    ArsfcGeoCountry selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ArsfcGeoCountrySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ArsfcGeoCountry record);

    @Update({
        "update arsfc_geo_country",
        "set adcode = #{adcode,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "lat = #{lat,jdbcType=DOUBLE},",
          "lng = #{lng,jdbcType=DOUBLE}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ArsfcGeoCountry record);
}