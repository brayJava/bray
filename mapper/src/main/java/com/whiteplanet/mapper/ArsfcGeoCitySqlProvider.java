package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.ArsfcGeoCity;
import org.apache.ibatis.jdbc.SQL;

public class ArsfcGeoCitySqlProvider {

    public String insertSelective(ArsfcGeoCity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("arsfc_geo_city");
        
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
        
        if (record.getParentadcode() != null) {
            sql.VALUES("parentAdcode", "#{parentadcode,jdbcType=VARCHAR}");
        }
        
        if (record.getCitycode() != null) {
            sql.VALUES("citycode", "#{citycode,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ArsfcGeoCity record) {
        SQL sql = new SQL();
        sql.UPDATE("arsfc_geo_city");
        
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
        
        if (record.getParentadcode() != null) {
            sql.SET("parentAdcode = #{parentadcode,jdbcType=VARCHAR}");
        }
        
        if (record.getCitycode() != null) {
            sql.SET("citycode = #{citycode,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}