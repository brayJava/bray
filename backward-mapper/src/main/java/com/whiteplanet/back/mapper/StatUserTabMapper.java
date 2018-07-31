package com.whiteplanet.back.mapper;

import java.util.List;
import com.whiteplanet.back.model.StatUserTab;
import com.whiteplanet.back.model.StatUserTabExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface StatUserTabMapper {
    @SelectProvider(type=StatUserTabSqlProvider.class, method="countByExample")
    int countByExample(StatUserTabExample example);

    @DeleteProvider(type=StatUserTabSqlProvider.class, method="deleteByExample")
    int deleteByExample(StatUserTabExample example);

    @Delete({
        "delete from stat_user_tab",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into stat_user_tab (id, code, ",
        "name, stat_type, ",
        "create_time)",
        "values (#{id,jdbcType=INTEGER}, #{code,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{statType,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(StatUserTab record);

    @InsertProvider(type=StatUserTabSqlProvider.class, method="insertSelective")
    int insertSelective(StatUserTab record);

    @SelectProvider(type=StatUserTabSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="stat_type", property="statType", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<StatUserTab> selectByExample(StatUserTabExample example);

    @Select({
        "select",
        "id, code, name, stat_type, create_time",
        "from stat_user_tab",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="stat_type", property="statType", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    StatUserTab selectByPrimaryKey(Integer id);
    @Select({
            "select",
            "id, code, name, stat_type, create_time",
            "from stat_user_tab",
            "where stat_type = #{stat_type,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
            @Result(column="stat_type", property="statType", jdbcType=JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<StatUserTab> selectAllTabs(String statType);

    @UpdateProvider(type=StatUserTabSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") StatUserTab record, @Param("example") StatUserTabExample example);

    @UpdateProvider(type=StatUserTabSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") StatUserTab record, @Param("example") StatUserTabExample example);

    @UpdateProvider(type=StatUserTabSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(StatUserTab record);

    @Update({
        "update stat_user_tab",
        "set code = #{code,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "stat_type = #{statType,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(StatUserTab record);
}