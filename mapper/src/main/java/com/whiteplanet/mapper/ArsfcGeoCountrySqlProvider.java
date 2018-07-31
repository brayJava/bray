package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.ArsfcGeoCountry;
import org.apache.ibatis.jdbc.SQL;

public class ArsfcGeoCountrySqlProvider {

    public String insertSelective(ArsfcGeoCountry record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("arsfc_geo_country");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getAdcode() != null) {
            sql.VALUES("adcode", "#{adcode,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getLat() != null) {
            sql.VALUES("lat", "#{lat,jdbcType=DOUBLE}");
        }
        
        if (record.getLng() != null) {
            sql.VALUES("lng", "#{lng,jdbcType=DOUBLE}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ArsfcGeoCountry record) {
        SQL sql = new SQL();
        sql.UPDATE("arsfc_geo_country");
        
        if (record.getAdcode() != null) {
            sql.SET("adcode = #{adcode,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getLat() != null) {
            sql.SET("lat = #{lat,jdbcType=DOUBLE}");
        }
        
        if (record.getLng() != null) {
            sql.SET("lng = #{lng,jdbcType=DOUBLE}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}