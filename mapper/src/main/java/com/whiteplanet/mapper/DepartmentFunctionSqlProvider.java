package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DepartmentFunction;
import org.apache.ibatis.jdbc.SQL;

public class DepartmentFunctionSqlProvider {

    public String insertSelective(DepartmentFunction record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("department_function");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }

        if (record.getPid() != null) {
            sql.VALUES("pid", "#{pid,jdbcType=VARCHAR}");
        }

        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
        }

        if (record.getAsname() != null) {
            sql.VALUES("asname", "#{asname,jdbcType=VARCHAR}");
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

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DepartmentFunction record) {
        SQL sql = new SQL();
        sql.UPDATE("department_function");

        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }

        if (record.getPid() != null) {
            sql.SET("pid = #{pid,jdbcType=VARCHAR}");
        }

        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }

        if (record.getAsname() != null) {
            sql.SET("asname = #{asname,jdbcType=VARCHAR}");
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

        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }
}