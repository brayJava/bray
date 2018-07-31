package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Illness;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface IllnessMapper {
    @Delete({
        "delete from illness",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into illness (id, name, ",
        "note, create_date, ",
        "update_date, status)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{note,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{status,jdbcType=INTEGER})"
    })
    int insert(Illness record);

    @InsertProvider(type=IllnessSqlProvider.class, method="insertSelective")
    int insertSelective(Illness record);

    @Select({
        "select",
        "id, name, note, create_date, update_date, status",
        "from illness",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    Illness selectByPrimaryKey(String id);

    @UpdateProvider(type=IllnessSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Illness record);

    @Update({
        "update illness",
        "set name = #{name,jdbcType=VARCHAR},",
          "note = #{note,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Illness record);

    /**
     *
     * @param name
     * @return
     */
    @Select({
            "select id, name, note, create_date, update_date, status",
            "from illness",
            "where status = 0",
            " and name like CONCAT('%',#{name,jdbcType=VARCHAR},'%' )",
            "limit #{count,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="note", property="note", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    List<Illness> selectByLikeName(@Param("name") String name,
                                   @Param("count") Integer count);

    @Select({
            "select",
            "id, name, note, create_date, update_date, status",
            "from illness",
            "where name = #{name,jdbcType=VARCHAR}",
            "limit 1"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="note", property="note", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    Illness selectByName(String name);
}