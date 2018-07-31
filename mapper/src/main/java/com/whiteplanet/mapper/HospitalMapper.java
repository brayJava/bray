package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Hospital;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface HospitalMapper {
    @Delete({
        "delete from hospital",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into hospital (id, name, ",
        "address, country, ",
        "province, city, ",
        "level, status, create_date, ",
        "update_date)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{country,jdbcType=VARCHAR}, ",
        "#{province,jdbcType=VARCHAR}, #{city,jdbcType=VARCHAR}, ",
        "#{level,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateDate,jdbcType=TIMESTAMP})"
    })
    int insert(Hospital record);

    @InsertProvider(type=HospitalSqlProvider.class, method="insertSelective")
    int insertSelective(Hospital record);

    @Select({
        "select",
        "id, name, address, country, province, city, level, status, create_date, update_date",
        "from hospital",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
        @Result(column="country", property="country", jdbcType= JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType= JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType= JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType= JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    Hospital selectByPrimaryKey(String id);

    @UpdateProvider(type=HospitalSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Hospital record);

    @Update({
        "update hospital",
        "set name = #{name,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "country = #{country,jdbcType=VARCHAR},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "level = #{level,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Hospital record);

    @Select({
            "select",
            "id, name, address, country, province, city",
            "from hospital",
            "where name like CONCAT('%',#{text,jdbcType=VARCHAR},'%' )",
            "and status = 0",
            "order by update_date asc",
            "limit 20"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
            @Result(column="country", property="country", jdbcType= JdbcType.VARCHAR),
            @Result(column="province", property="province", jdbcType= JdbcType.VARCHAR),
            @Result(column="city", property="city", jdbcType= JdbcType.VARCHAR)
    })
    List<Hospital> selectByLinkName(String text);

    @Select({
            "select",
            "id, name, address, country, province, city",
            "from hospital",
            "where name like CONCAT('%',#{text,jdbcType=VARCHAR},'%' )",
            "and status = 0",
            "order by update_date asc",
            "limit #{count,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
            @Result(column="country", property="country", jdbcType= JdbcType.VARCHAR),
            @Result(column="province", property="province", jdbcType= JdbcType.VARCHAR),
            @Result(column="city", property="city", jdbcType= JdbcType.VARCHAR)
    })
    List<Hospital> selectByLinkNameWithCount(@Param("text")String text,@Param("count")Integer count);
    @Select({
            "select",
            "id, name, address, country, province, city",
            "from hospital",
            "where name = #{text,jdbcType=VARCHAR}",
            "order by update_date asc",
            "limit 20"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType= JdbcType.VARCHAR),
            @Result(column="country", property="country", jdbcType= JdbcType.VARCHAR),
            @Result(column="province", property="province", jdbcType= JdbcType.VARCHAR),
            @Result(column="city", property="city", jdbcType= JdbcType.VARCHAR)
    })
    Hospital selectByName(String text);
}