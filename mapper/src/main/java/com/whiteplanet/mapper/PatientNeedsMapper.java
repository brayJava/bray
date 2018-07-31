package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.PatientNeeds;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface PatientNeedsMapper {
    @Delete({
            "delete from patient_needs",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into patient_needs (id, money, ",
            "time, city_id, city_name, ",
            "province_id, province_name, ",
            "order_id, needs_order_id, ",
            "create_date, status)",
            "values (#{id,jdbcType=VARCHAR}, #{money,jdbcType=INTEGER}, ",
            "#{time,jdbcType=INTEGER}, #{cityId,jdbcType=INTEGER}, #{cityName,jdbcType=VARCHAR}, ",
            "#{provinceId,jdbcType=INTEGER}, #{provinceName,jdbcType=VARCHAR}, ",
            "#{orderId,jdbcType=VARCHAR}, #{needsOrderId,jdbcType=VARCHAR}, ",
            "#{createDate,jdbcType=TIMESTAMP}, #{status,jdbcType=INTEGER})"
    })
    int insert(PatientNeeds record);

    @InsertProvider(type=PatientNeedsSqlProvider.class, method="insertSelective")
    int insertSelective(PatientNeeds record);

    @Select({
            "select",
            "id, money, time, city_id, city_name, province_id, province_name, order_id, needs_order_id, ",
            "create_date, status",
            "from patient_needs",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="money", property="money", jdbcType= JdbcType.INTEGER),
            @Result(column="time", property="time", jdbcType= JdbcType.INTEGER),
            @Result(column="city_id", property="cityId", jdbcType= JdbcType.INTEGER),
            @Result(column="city_name", property="cityName", jdbcType= JdbcType.VARCHAR),
            @Result(column="province_id", property="provinceId", jdbcType= JdbcType.INTEGER),
            @Result(column="province_name", property="provinceName", jdbcType= JdbcType.VARCHAR),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    PatientNeeds selectByPrimaryKey(String id);

    @UpdateProvider(type=PatientNeedsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PatientNeeds record);

    @Update({
            "update patient_needs",
            "set money = #{money,jdbcType=INTEGER},",
            "time = #{time,jdbcType=INTEGER},",
            "city_id = #{cityId,jdbcType=INTEGER},",
            "city_name = #{cityName,jdbcType=VARCHAR},",
            "province_id = #{provinceId,jdbcType=INTEGER},",
            "province_name = #{provinceName,jdbcType=VARCHAR},",
            "order_id = #{orderId,jdbcType=VARCHAR},",
            "needs_order_id = #{needsOrderId,jdbcType=VARCHAR},",
            "create_date = #{createDate,jdbcType=TIMESTAMP},",
            "status = #{status,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(PatientNeeds record);

    @Select({
        "select",
        "id, money, time, city_id, city_name, province_id, province_name, order_id, needs_order_id, ",
        "create_date",
        "from patient_needs",
        "where needs_order_id = #{needsOrderId,jdbcType=VARCHAR}",
        "and needs_order_id is not null",
        "and needs_order_id != ''",
        "and status = #{status,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="money", property="money", jdbcType= JdbcType.INTEGER),
        @Result(column="time", property="time", jdbcType= JdbcType.INTEGER),
        @Result(column="city_id", property="cityId", jdbcType= JdbcType.INTEGER),
        @Result(column="city_name", property="cityName", jdbcType= JdbcType.VARCHAR),
        @Result(column="province_id", property="provinceId", jdbcType= JdbcType.INTEGER),
        @Result(column="province_name", property="provinceName", jdbcType= JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    PatientNeeds selectByNeedsOrderId(@Param("neddsOrderId") String neddsOrderId, @Param("status") int status);

    @Select({
            "select",
            "id, money, time, city_id, city_name, province_id, province_name, order_id, needs_order_id, ",
            "create_date",
            "from patient_needs",
            "where needs_order_id = #{neddsOrderId,jdbcType=VARCHAR}",
            "and needs_order_id is not null",
            "and needs_order_id != ''"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="money", property="money", jdbcType= JdbcType.INTEGER),
            @Result(column="time", property="time", jdbcType= JdbcType.INTEGER),
            @Result(column="city_id", property="cityId", jdbcType= JdbcType.INTEGER),
            @Result(column="city_name", property="cityName", jdbcType= JdbcType.VARCHAR),
            @Result(column="province_id", property="provinceId", jdbcType= JdbcType.INTEGER),
            @Result(column="province_name", property="provinceName", jdbcType= JdbcType.VARCHAR),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    PatientNeeds selectByOnlyNeedsOrderId(@Param("neddsOrderId") String neddsOrderId);

}
