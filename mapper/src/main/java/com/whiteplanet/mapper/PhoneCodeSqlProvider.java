package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.PhoneCode;
import org.apache.ibatis.jdbc.SQL;

public class PhoneCodeSqlProvider {

    public String insertSelective(PhoneCode record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("phone_code");

        if (record.getPhonenumber() != null) {
            sql.VALUES("phonenumber", "#{phonenumber,jdbcType=VARCHAR}");
        }

        if (record.getSenddatetime() != null) {
            sql.VALUES("senddatetime", "#{senddatetime,jdbcType=TIMESTAMP}");
        }

        if (record.getCount() != null) {
            sql.VALUES("count", "#{count,jdbcType=INTEGER}");
        }

        if (record.getNextdatetime() != null) {
            sql.VALUES("nextdatetime", "#{nextdatetime,jdbcType=TIMESTAMP}");
        }

        if (record.getValiddatetime() != null) {
            sql.VALUES("validdatetime", "#{validdatetime,jdbcType=TIMESTAMP}");
        }

        if (record.getReg() != null) {
            sql.VALUES("reg", "#{reg,jdbcType=BIT}");
        }

        if (record.getDoctor() != null) {
            sql.VALUES("doctor", "#{doctor,jdbcType=BIT}");
        }

        if (record.getValue() != null) {
            sql.VALUES("value", "#{value,jdbcType=VARCHAR}");
        }

        if (record.getTimeCount() != null) {
            sql.VALUES("time_count", "#{timeCount,jdbcType=INTEGER}");
        }

        if (record.getBankCard() != null) {
            sql.VALUES("bank_card", "#{bankCard,jdbcType=BIT}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PhoneCode record) {
        SQL sql = new SQL();
        sql.UPDATE("phone_code");

        if (record.getSenddatetime() != null) {
            sql.SET("senddatetime = #{senddatetime,jdbcType=TIMESTAMP}");
        }

        if (record.getCount() != null) {
            sql.SET("count = #{count,jdbcType=INTEGER}");
        }

        if (record.getNextdatetime() != null) {
            sql.SET("nextdatetime = #{nextdatetime,jdbcType=TIMESTAMP}");
        }

        if (record.getValiddatetime() != null) {
            sql.SET("validdatetime = #{validdatetime,jdbcType=TIMESTAMP}");
        }

        if (record.getReg() != null) {
            sql.SET("reg = #{reg,jdbcType=BIT}");
        }

        if (record.getDoctor() != null) {
            sql.SET("doctor = #{doctor,jdbcType=BIT}");
        }

        if (record.getValue() != null) {
            sql.SET("value = #{value,jdbcType=VARCHAR}");
        }

        if (record.getTimeCount() != null) {
            sql.SET("time_count = #{timeCount,jdbcType=INTEGER}");
        }

        if (record.getBankCard() != null) {
            sql.SET("bank_card = #{bankCard,jdbcType=BIT}");
        }

        sql.WHERE("phonenumber = #{phonenumber,jdbcType=VARCHAR}");

        return sql.toString();
    }
}