package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.ServayResult;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ServayResultMapper {
    @Delete({
        "delete from servay_result",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into servay_result (id, code, ",
        "notes, status, create_time)",
        "values (#{id,jdbcType=INTEGER}, #{code,jdbcType=VARCHAR}, ",
        "#{notes,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(ServayResult record);

    @InsertProvider(type=ServayResultSqlProvider.class, method="insertSelective")
    int insertSelective(ServayResult record);

    @Select({
        "select",
        "id, code, notes, status, create_time",
        "from servay_result",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
        @Result(column="notes", property="notes", jdbcType= JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP)
    })
    ServayResult selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ServayResultSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ServayResult record);

    @Update({
        "update servay_result",
        "set code = #{code,jdbcType=VARCHAR},",
          "notes = #{notes,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ServayResult record);

    @Select({
            "select",
            "id, notes",
            "from servay_result",
            "where code = #{score,jdbcType=INTEGER}",
            "and status = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="notes", property="notes", jdbcType= JdbcType.VARCHAR)
    })
    ServayResult selectByCode(String score);
}