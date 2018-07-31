package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.MatterTemp;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface MatterTempMapper {
    @Delete({
        "delete from matter_temp",
        "where key = #{key,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String key);

    @Insert({
        "insert into matter_temp (key, score, ",
        "kind, name, parentkey, ",
        "create_time, update_time, ",
        "notes)",
        "values (#{key,jdbcType=VARCHAR}, #{score,jdbcType=INTEGER}, ",
        "#{kind,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, #{parentkey,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{notes,jdbcType=LONGVARCHAR})"
    })
    int insert(MatterTemp record);

    @InsertProvider(type=MatterTempSqlProvider.class, method="insertSelective")
    int insertSelective(MatterTemp record);

    @Select({
        "select",
        "key, score, kind, name, parentkey, create_time, update_time, notes",
        "from matter_temp",
        "where key = #{key,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="key", property="key", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="score", property="score", jdbcType= JdbcType.INTEGER),
        @Result(column="kind", property="kind", jdbcType= JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        @Result(column="parentkey", property="parentkey", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="notes", property="notes", jdbcType= JdbcType.LONGVARCHAR)
    })
    MatterTemp selectByPrimaryKey(String key);

    @UpdateProvider(type=MatterTempSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MatterTemp record);

    @Update({
        "update matter_temp",
        "set score = #{score,jdbcType=INTEGER},",
          "kind = #{kind,jdbcType=INTEGER},",
          "name = #{name,jdbcType=VARCHAR},",
          "parentkey = #{parentkey,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "notes = #{notes,jdbcType=LONGVARCHAR}",
        "where key = #{key,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(MatterTemp record);

    @Update({
        "update matter_temp",
        "set score = #{score,jdbcType=INTEGER},",
          "kind = #{kind,jdbcType=INTEGER},",
          "name = #{name,jdbcType=VARCHAR},",
          "parentkey = #{parentkey,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where key = #{key,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(MatterTemp record);
}