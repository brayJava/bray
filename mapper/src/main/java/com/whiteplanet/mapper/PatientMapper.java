package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Patient;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface PatientMapper {
    @Delete({
            "delete from patient",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into patient (id, code, ",
            "phone, password, ",
            "sex, real_name, introduce, ",
            "create_date, update_date, ",
            "status, patientcol, ",
            "age, source, mobile_type, ",
            "screen_size, last_login_ip, ",
            "last_login_date, open_id, ",
            "nickname, province, ",
            "city, country, headimgurl, ",
            "follow)",
            "values (#{id,jdbcType=VARCHAR}, #{code,jdbcType=VARCHAR}, ",
            "#{phone,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
            "#{sex,jdbcType=BIT}, #{realName,jdbcType=VARCHAR}, #{introduce,jdbcType=VARCHAR}, ",
            "#{createDate,jdbcType=TIMESTAMP}, #{updateDate,jdbcType=TIMESTAMP}, ",
            "#{status,jdbcType=INTEGER}, #{patientcol,jdbcType=VARCHAR}, ",
            "#{age,jdbcType=INTEGER}, #{source,jdbcType=VARCHAR}, #{mobileType,jdbcType=VARCHAR}, ",
            "#{screenSize,jdbcType=VARCHAR}, #{lastLoginIp,jdbcType=VARCHAR}, ",
            "#{lastLoginDate,jdbcType=TIMESTAMP}, #{openId,jdbcType=VARCHAR}, ",
            "#{nickname,jdbcType=VARCHAR}, #{province,jdbcType=VARCHAR}, ",
            "#{city,jdbcType=VARCHAR}, #{country,jdbcType=VARCHAR}, #{headimgurl,jdbcType=VARCHAR}, ",
            "#{follow,jdbcType=BIT})"
    })
    int insert(Patient record);

    @InsertProvider(type=PatientSqlProvider.class, method="insertSelective")
    int insertSelective(Patient record);

    @Select({
            "select",
            "id, code, phone, password, sex, real_name, introduce, create_date, update_date, ",
            "status, patientcol, age, source, mobile_type, screen_size, last_login_ip, last_login_date, ",
            "open_id, nickname, province, city, country, headimgurl, follow",
            "from patient",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="password", property="password", jdbcType= JdbcType.VARCHAR),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="real_name", property="realName", jdbcType= JdbcType.VARCHAR),
            @Result(column="introduce", property="introduce", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="patientcol", property="patientcol", jdbcType= JdbcType.VARCHAR),
            @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
            @Result(column="source", property="source", jdbcType= JdbcType.VARCHAR),
            @Result(column="mobile_type", property="mobileType", jdbcType= JdbcType.VARCHAR),
            @Result(column="screen_size", property="screenSize", jdbcType= JdbcType.VARCHAR),
            @Result(column="last_login_ip", property="lastLoginIp", jdbcType= JdbcType.VARCHAR),
            @Result(column="last_login_date", property="lastLoginDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="open_id", property="openId", jdbcType= JdbcType.VARCHAR),
            @Result(column="nickname", property="nickname", jdbcType= JdbcType.VARCHAR),
            @Result(column="province", property="province", jdbcType= JdbcType.VARCHAR),
            @Result(column="city", property="city", jdbcType= JdbcType.VARCHAR),
            @Result(column="country", property="country", jdbcType= JdbcType.VARCHAR),
            @Result(column="headimgurl", property="headimgurl", jdbcType= JdbcType.VARCHAR),
            @Result(column="follow", property="follow", jdbcType= JdbcType.BIT)
    })
    Patient selectByPrimaryKey(String id);

    @UpdateProvider(type=PatientSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Patient record);

    @Update({
            "update patient",
            "set code = #{code,jdbcType=VARCHAR},",
            "phone = #{phone,jdbcType=VARCHAR},",
            "password = #{password,jdbcType=VARCHAR},",
            "sex = #{sex,jdbcType=BIT},",
            "real_name = #{realName,jdbcType=VARCHAR},",
            "introduce = #{introduce,jdbcType=VARCHAR},",
            "create_date = #{createDate,jdbcType=TIMESTAMP},",
            "update_date = #{updateDate,jdbcType=TIMESTAMP},",
            "status = #{status,jdbcType=INTEGER},",
            "patientcol = #{patientcol,jdbcType=VARCHAR},",
            "age = #{age,jdbcType=INTEGER},",
            "source = #{source,jdbcType=VARCHAR},",
            "mobile_type = #{mobileType,jdbcType=VARCHAR},",
            "screen_size = #{screenSize,jdbcType=VARCHAR},",
            "last_login_ip = #{lastLoginIp,jdbcType=VARCHAR},",
            "last_login_date = #{lastLoginDate,jdbcType=TIMESTAMP},",
            "open_id = #{openId,jdbcType=VARCHAR},",
            "nickname = #{nickname,jdbcType=VARCHAR},",
            "province = #{province,jdbcType=VARCHAR},",
            "city = #{city,jdbcType=VARCHAR},",
            "country = #{country,jdbcType=VARCHAR},",
            "headimgurl = #{headimgurl,jdbcType=VARCHAR},",
            "follow = #{follow,jdbcType=BIT}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Patient record);

    /**
     *
     * 判断是否已经关注
     *
     * @param openId
     * @return
     */
    @Select({
            "select",
            "count(1)",
            "from patient",
            "where open_id = #{openId,jdbcType=VARCHAR}"
    })
    int countByOpenId(String openId);

    /**
     * 判断是否已经取消关注
     * @param openId
     * @return
     */
    @Select({
            "select",
            "id, code, phone, password, sex, real_name, introduce, create_date, update_date, ",
            "status, patientcol, age, source, mobile_type, screen_size, last_login_ip, last_login_date, ",
            "open_id, nickname, province, city, country, headimgurl, follow",
            "from patient",
            "where open_id = #{openId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="password", property="password", jdbcType= JdbcType.VARCHAR),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="real_name", property="realName", jdbcType= JdbcType.VARCHAR),
            @Result(column="introduce", property="introduce", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="patientcol", property="patientcol", jdbcType= JdbcType.VARCHAR),
            @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
            @Result(column="source", property="source", jdbcType= JdbcType.VARCHAR),
            @Result(column="mobile_type", property="mobileType", jdbcType= JdbcType.VARCHAR),
            @Result(column="screen_size", property="screenSize", jdbcType= JdbcType.VARCHAR),
            @Result(column="last_login_ip", property="lastLoginIp", jdbcType= JdbcType.VARCHAR),
            @Result(column="last_login_date", property="lastLoginDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="open_id", property="openId", jdbcType= JdbcType.VARCHAR),
            @Result(column="nickname", property="nickname", jdbcType= JdbcType.VARCHAR),
            @Result(column="province", property="province", jdbcType= JdbcType.VARCHAR),
            @Result(column="city", property="city", jdbcType= JdbcType.VARCHAR),
            @Result(column="country", property="country", jdbcType= JdbcType.VARCHAR),
            @Result(column="headimgurl", property="headimgurl", jdbcType= JdbcType.VARCHAR),
            @Result(column="follow", property="follow", jdbcType= JdbcType.BIT)
    })
    Patient selectByOpenId(@Param("openId") String openId);

    @Select({
            "select",
            "code",
            "from patient",
            "order by create_date desc limit 1"
    })
    String selectByLastCode();

    @Select({
            "select",
            "count(1)",
            "from patient",
            "where phone = #{phone,jdbcType=VARCHAR}"
    })
    int selectExistByPhone(String phone);

    @Select({
            "select",
            "id, code, phone, password, sex, real_name, introduce, create_date, update_date, ",
            "status, patientcol, age, source, mobile_type, screen_size, last_login_ip, last_login_date, ",
            "open_id, nickname, province, city, country, headimgurl, follow",
            "from patient",
            "where phone = #{phone,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="password", property="password", jdbcType= JdbcType.VARCHAR),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="real_name", property="realName", jdbcType= JdbcType.VARCHAR),
            @Result(column="introduce", property="introduce", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="patientcol", property="patientcol", jdbcType= JdbcType.VARCHAR),
            @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
            @Result(column="source", property="source", jdbcType= JdbcType.VARCHAR),
            @Result(column="mobile_type", property="mobileType", jdbcType= JdbcType.VARCHAR),
            @Result(column="screen_size", property="screenSize", jdbcType= JdbcType.VARCHAR),
            @Result(column="last_login_ip", property="lastLoginIp", jdbcType= JdbcType.VARCHAR),
            @Result(column="last_login_date", property="lastLoginDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="open_id", property="openId", jdbcType= JdbcType.VARCHAR),
            @Result(column="nickname", property="nickname", jdbcType= JdbcType.VARCHAR),
            @Result(column="province", property="province", jdbcType= JdbcType.VARCHAR),
            @Result(column="city", property="city", jdbcType= JdbcType.VARCHAR),
            @Result(column="country", property="country", jdbcType= JdbcType.VARCHAR),
            @Result(column="headimgurl", property="headimgurl", jdbcType= JdbcType.VARCHAR),
            @Result(column="follow", property="follow", jdbcType= JdbcType.BIT)
    })
    Patient selectByPhone(String phone);

}