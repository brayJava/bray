package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.PatientNeeds;
import org.apache.ibatis.jdbc.SQL;

public class PatientNeedsSqlProvider {

    public String insertSelective(PatientNeeds record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("patient_needs");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getMoney() != null) {
            sql.VALUES("money", "#{money,jdbcType=INTEGER}");
        }

        if (record.getTime() != null) {
            sql.VALUES("time", "#{time,jdbcType=INTEGER}");
        }

        if (record.getCityId() != null) {
            sql.VALUES("city_id", "#{cityId,jdbcType=INTEGER}");
        }

        if (record.getCityName() != null) {
            sql.VALUES("city_name", "#{cityName,jdbcType=VARCHAR}");
        }

        if (record.getProvinceId() != null) {
            sql.VALUES("province_id", "#{provinceId,jdbcType=INTEGER}");
        }

        if (record.getProvinceName() != null) {
            sql.VALUES("province_name", "#{provinceName,jdbcType=VARCHAR}");
        }

        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=VARCHAR}");
        }

        if (record.getNeedsOrderId() != null) {
            sql.VALUES("needs_order_id", "#{needsOrderId,jdbcType=VARCHAR}");
        }

        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PatientNeeds record) {
        SQL sql = new SQL();
        sql.UPDATE("patient_needs");

        if (record.getMoney() != null) {
            sql.SET("money = #{money,jdbcType=INTEGER}");
        }

        if (record.getTime() != null) {
            sql.SET("time = #{time,jdbcType=INTEGER}");
        }

        if (record.getCityId() != null) {
            sql.SET("city_id = #{cityId,jdbcType=INTEGER}");
        }

        if (record.getCityName() != null) {
            sql.SET("city_name = #{cityName,jdbcType=VARCHAR}");
        }

        if (record.getProvinceId() != null) {
            sql.SET("province_id = #{provinceId,jdbcType=INTEGER}");
        }

        if (record.getProvinceName() != null) {
            sql.SET("province_name = #{provinceName,jdbcType=VARCHAR}");
        }

        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=VARCHAR}");
        }

        if (record.getNeedsOrderId() != null) {
            sql.SET("needs_order_id = #{needsOrderId,jdbcType=VARCHAR}");
        }

        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }

        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }
}