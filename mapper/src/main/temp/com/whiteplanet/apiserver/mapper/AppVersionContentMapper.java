package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.AppVersionContent;
import com.whiteplanet.mapper.model.AppVersionContentExample;
import java.util.List;
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

public interface AppVersionContentMapper {
    @SelectProvider(type=AppVersionContentSqlProvider.class, method="countByExample")
    int countByExample(AppVersionContentExample example);

    @DeleteProvider(type=AppVersionContentSqlProvider.class, method="deleteByExample")
    int deleteByExample(AppVersionContentExample example);

    @Delete({
        "delete from app_version_content",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into app_version_content (id, content, ",
        "app_version_id, create_time, ",
        "update_time)",
        "values (#{id,jdbcType=INTEGER}, #{content,jdbcType=VARCHAR}, ",
        "#{appVersionId,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(AppVersionContent record);

    @InsertProvider(type=AppVersionContentSqlProvider.class, method="insertSelective")
    int insertSelective(AppVersionContent record);

    @SelectProvider(type=AppVersionContentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_version_id", property="appVersionId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AppVersionContent> selectByExample(AppVersionContentExample example);

    @Select({
        "select",
        "id, content, app_version_id, create_time, update_time",
        "from app_version_content",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_version_id", property="appVersionId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    AppVersionContent selectByPrimaryKey(Integer id);

    @UpdateProvider(type=AppVersionContentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AppVersionContent record, @Param("example") AppVersionContentExample example);

    @UpdateProvider(type=AppVersionContentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AppVersionContent record, @Param("example") AppVersionContentExample example);

    @UpdateProvider(type=AppVersionContentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AppVersionContent record);

    @Update({
        "update app_version_content",
        "set content = #{content,jdbcType=VARCHAR},",
          "app_version_id = #{appVersionId,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AppVersionContent record);
}