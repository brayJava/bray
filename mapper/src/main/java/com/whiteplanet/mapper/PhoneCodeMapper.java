package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.PhoneCode;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface PhoneCodeMapper {
    @Delete({
            "delete from phone_code",
            "where phonenumber = #{phonenumber,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String phonenumber);

    @Insert({
            "insert into phone_code (phonenumber, senddatetime, ",
            "count, nextdatetime, ",
            "validdatetime, reg, ",
            "doctor, value, time_count, ",
            "bank_card)",
            "values (#{phonenumber,jdbcType=VARCHAR}, #{senddatetime,jdbcType=TIMESTAMP}, ",
            "#{count,jdbcType=INTEGER}, #{nextdatetime,jdbcType=TIMESTAMP}, ",
            "#{validdatetime,jdbcType=TIMESTAMP}, #{reg,jdbcType=BIT}, ",
            "#{doctor,jdbcType=BIT}, #{value,jdbcType=VARCHAR}, #{timeCount,jdbcType=INTEGER}, ",
            "#{bankCard,jdbcType=BIT})"
    })
    int insert(PhoneCode record);

    @InsertProvider(type=PhoneCodeSqlProvider.class, method="insertSelective")
    int insertSelective(PhoneCode record);

    @Select({
            "select",
            "phonenumber, senddatetime, count, nextdatetime, validdatetime, reg, doctor, ",
            "value, time_count, bank_card",
            "from phone_code",
            "where phonenumber = #{phonenumber,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="phonenumber", property="phonenumber", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="senddatetime", property="senddatetime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="count", property="count", jdbcType= JdbcType.INTEGER),
            @Result(column="nextdatetime", property="nextdatetime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="validdatetime", property="validdatetime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="reg", property="reg", jdbcType= JdbcType.BIT),
            @Result(column="doctor", property="doctor", jdbcType= JdbcType.BIT),
            @Result(column="value", property="value", jdbcType= JdbcType.VARCHAR),
            @Result(column="time_count", property="timeCount", jdbcType= JdbcType.INTEGER),
            @Result(column="bank_card", property="bankCard", jdbcType= JdbcType.BIT)
    })
    PhoneCode selectByPrimaryKey(String phonenumber);

    @Select({
            "select",
            "phonenumber, senddatetime, count, nextdatetime, validdatetime, reg, doctor, ",
            "value, time_count, bank_card",
            "from phone_code",
            "where phonenumber = #{phonenumber,jdbcType=VARCHAR}",
            "and bank_card = true"
    })
    @Results({
            @Result(column="phonenumber", property="phonenumber", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="senddatetime", property="senddatetime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="count", property="count", jdbcType= JdbcType.INTEGER),
            @Result(column="nextdatetime", property="nextdatetime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="validdatetime", property="validdatetime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="reg", property="reg", jdbcType= JdbcType.BIT),
            @Result(column="doctor", property="doctor", jdbcType= JdbcType.BIT),
            @Result(column="value", property="value", jdbcType= JdbcType.VARCHAR),
            @Result(column="time_count", property="timeCount", jdbcType= JdbcType.INTEGER),
            @Result(column="bank_card", property="bankCard", jdbcType= JdbcType.BIT)
    })
    PhoneCode selectByBankcard(String phonenumber);


    @UpdateProvider(type=PhoneCodeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PhoneCode record);

    /**
     * 查询所有验证码信息
     *
     * @return
     */
    @Select({
            "select",
            "phonenumber, senddatetime, count, nextdatetime, validdatetime, reg, doctor, ",
            "value, time_count",
            "from phone_code"
    })
    @Results({
            @Result(column="phonenumber", property="phonenumber", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="senddatetime", property="senddatetime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="count", property="count", jdbcType= JdbcType.INTEGER),
            @Result(column="nextdatetime", property="nextdatetime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="validdatetime", property="validdatetime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="reg", property="reg", jdbcType= JdbcType.BIT),
            @Result(column="doctor", property="doctor", jdbcType= JdbcType.BIT),
            @Result(column="value", property="value", jdbcType= JdbcType.VARCHAR),
            @Result(column="time_count", property="timeCount", jdbcType= JdbcType.INTEGER)
    })
    List<PhoneCode> selectAll();

    @Select({
            "select",
            "count(1)",
            "from phone_code",
            "where phonenumber = #{phonenumber,jdbcType=VARCHAR}"
    })
    int selectExist(@Param("phonenumber") String phonenumber);


    @Select({
            "select",
            "phonenumber, senddatetime, count, nextdatetime, validdatetime, reg, doctor, ",
            "value, time_count",
            "from phone_code",
            "where phonenumber = #{phonenumber,jdbcType=VARCHAR}",
            "and doctor = #{doctor,jdbcType=BIT}",
            "and reg = #{reg,jdbcType=BIT}",
            "and bank_card = 0",
    })
    @Results({
            @Result(column="phonenumber", property="phonenumber", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="senddatetime", property="senddatetime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="count", property="count", jdbcType= JdbcType.INTEGER),
            @Result(column="nextdatetime", property="nextdatetime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="validdatetime", property="validdatetime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="reg", property="reg", jdbcType= JdbcType.BIT),
            @Result(column="doctor", property="doctor", jdbcType= JdbcType.BIT),
            @Result(column="value", property="value", jdbcType= JdbcType.VARCHAR),
            @Result(column="time_count", property="timeCount", jdbcType= JdbcType.INTEGER)
    })
    PhoneCode selectByPhoneAndDockerAndReg(@Param("phonenumber") String phonenumber, @Param("doctor") Boolean doctor, @Param("reg") Boolean reg);

    @Select({
            "select",
            "phonenumber, senddatetime, count, nextdatetime, validdatetime, doctor, ",
            "value, time_count",
            "from phone_code",
            "order by senddatetime DESC"
    })
    @Results({
            @Result(column="phonenumber", property="phonenumber", jdbcType= JdbcType.VARCHAR),
            @Result(column="senddatetime", property="senddatetime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="count", property="count", jdbcType= JdbcType.INTEGER),
            @Result(column="nextdatetime", property="nextdatetime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="validdatetime", property="validdatetime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor", property="doctor", jdbcType= JdbcType.BIT),
            @Result(column="value", property="value", jdbcType= JdbcType.VARCHAR),
            @Result(column="time_count", property="timeCount", jdbcType= JdbcType.INTEGER),
    })
    List<PhoneCode> selectNewestSms();
}