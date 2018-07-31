package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Department;
import org.apache.ibatis.jdbc.SQL;

public class DepartmentSqlProvider {

    public String insertSelective(Department record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("department");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
        }

        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }

        if (record.getPid() != null) {
            sql.VALUES("pid", "#{pid,jdbcType=VARCHAR}");
        }

        if (record.getMinMoney() != null) {
            sql.VALUES("min_money", "#{minMoney,jdbcType=INTEGER}");
        }

        if (record.getMaxMoney() != null) {
            sql.VALUES("max_money", "#{maxMoney,jdbcType=INTEGER}");
        }

        if (record.getCoustom() != null) {
            sql.VALUES("coustom", "#{coustom,jdbcType=BIT}");
        }

        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }

        if (record.getUseCount() != null) {
            sql.VALUES("use_count", "#{useCount,jdbcType=INTEGER}");
        }

        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }

        if (record.getVisiting() != null) {
            sql.VALUES("visiting", "#{visiting,jdbcType=BIT}");
        }


        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Department record) {
        SQL sql = new SQL();
        sql.UPDATE("department");

        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }

        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }

        if (record.getPid() != null) {
            sql.SET("pid = #{pid,jdbcType=VARCHAR}");
        }

        if (record.getMinMoney() != null) {
            sql.SET("min_money = #{minMoney,jdbcType=INTEGER}");
        }

        if (record.getMaxMoney() != null) {
            sql.SET("max_money = #{maxMoney,jdbcType=INTEGER}");
        }

        if (record.getCoustom() != null) {
            sql.SET("coustom = #{coustom,jdbcType=BIT}");
        }

        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }

        if (record.getUseCount() != null) {
            sql.SET("use_count = #{useCount,jdbcType=INTEGER}");
        }

        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateDate() != null) {
            sql.SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
        }

        if (record.getVisiting() != null) {
            sql.SET("visiting = #{visiting,jdbcType=BIT}");
        }

        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }
}