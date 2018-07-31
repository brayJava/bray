package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Patient;
import org.apache.ibatis.jdbc.SQL;

public class PatientSqlProvider {

    public String insertSelective(Patient record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("patient");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
        }

        if (record.getPhone() != null) {
            sql.VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }

        if (record.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=VARCHAR}");
        }

        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=BIT}");
        }

        if (record.getRealName() != null) {
            sql.VALUES("real_name", "#{realName,jdbcType=VARCHAR}");
        }

        if (record.getIntroduce() != null) {
            sql.VALUES("introduce", "#{introduce,jdbcType=VARCHAR}");
        }

        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }

        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }

        if (record.getPatientcol() != null) {
            sql.VALUES("patientcol", "#{patientcol,jdbcType=VARCHAR}");
        }

        if (record.getAge() != null) {
            sql.VALUES("age", "#{age,jdbcType=INTEGER}");
        }

        if (record.getSource() != null) {
            sql.VALUES("source", "#{source,jdbcType=VARCHAR}");
        }

        if (record.getMobileType() != null) {
            sql.VALUES("mobile_type", "#{mobileType,jdbcType=VARCHAR}");
        }

        if (record.getScreenSize() != null) {
            sql.VALUES("screen_size", "#{screenSize,jdbcType=VARCHAR}");
        }

        if (record.getLastLoginIp() != null) {
            sql.VALUES("last_login_ip", "#{lastLoginIp,jdbcType=VARCHAR}");
        }

        if (record.getLastLoginDate() != null) {
            sql.VALUES("last_login_date", "#{lastLoginDate,jdbcType=TIMESTAMP}");
        }

        if (record.getOpenId() != null) {
            sql.VALUES("open_id", "#{openId,jdbcType=VARCHAR}");
        }

        if (record.getNickname() != null) {
            sql.VALUES("nickname", "#{nickname,jdbcType=VARCHAR}");
        }

        if (record.getProvince() != null) {
            sql.VALUES("province", "#{province,jdbcType=VARCHAR}");
        }

        if (record.getCity() != null) {
            sql.VALUES("city", "#{city,jdbcType=VARCHAR}");
        }

        if (record.getCountry() != null) {
            sql.VALUES("country", "#{country,jdbcType=VARCHAR}");
        }

        if (record.getHeadimgurl() != null) {
            sql.VALUES("headimgurl", "#{headimgurl,jdbcType=VARCHAR}");
        }

        if (record.getFollow() != null) {
            sql.VALUES("follow", "#{follow,jdbcType=BIT}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Patient record) {
        SQL sql = new SQL();
        sql.UPDATE("patient");

        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }

        if (record.getPhone() != null) {
            sql.SET("phone = #{phone,jdbcType=VARCHAR}");
        }

        if (record.getPassword() != null) {
            sql.SET("password = #{password,jdbcType=VARCHAR}");
        }

        if (record.getSex() != null) {
            sql.SET("sex = #{sex,jdbcType=BIT}");
        }

        if (record.getRealName() != null) {
            sql.SET("real_name = #{realName,jdbcType=VARCHAR}");
        }

        if (record.getIntroduce() != null) {
            sql.SET("introduce = #{introduce,jdbcType=VARCHAR}");
        }

        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateDate() != null) {
            sql.SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
        }

        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }

        if (record.getPatientcol() != null) {
            sql.SET("patientcol = #{patientcol,jdbcType=VARCHAR}");
        }

        if (record.getAge() != null) {
            sql.SET("age = #{age,jdbcType=INTEGER}");
        }

        if (record.getSource() != null) {
            sql.SET("source = #{source,jdbcType=VARCHAR}");
        }

        if (record.getMobileType() != null) {
            sql.SET("mobile_type = #{mobileType,jdbcType=VARCHAR}");
        }

        if (record.getScreenSize() != null) {
            sql.SET("screen_size = #{screenSize,jdbcType=VARCHAR}");
        }

        if (record.getLastLoginIp() != null) {
            sql.SET("last_login_ip = #{lastLoginIp,jdbcType=VARCHAR}");
        }

        if (record.getLastLoginDate() != null) {
            sql.SET("last_login_date = #{lastLoginDate,jdbcType=TIMESTAMP}");
        }

        if (record.getOpenId() != null) {
            sql.SET("open_id = #{openId,jdbcType=VARCHAR}");
        }

        if (record.getNickname() != null) {
            sql.SET("nickname = #{nickname,jdbcType=VARCHAR}");
        }

        if (record.getProvince() != null) {
            sql.SET("province = #{province,jdbcType=VARCHAR}");
        }

        if (record.getCity() != null) {
            sql.SET("city = #{city,jdbcType=VARCHAR}");
        }

        if (record.getCountry() != null) {
            sql.SET("country = #{country,jdbcType=VARCHAR}");
        }

        if (record.getHeadimgurl() != null) {
            sql.SET("headimgurl = #{headimgurl,jdbcType=VARCHAR}");
        }

        if (record.getFollow() != null) {
            sql.SET("follow = #{follow,jdbcType=BIT}");
        }

        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }
}
