package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.AppVersionContent;
import com.whiteplanet.mapper.model.AppVersionContentExample;
import java.util.List;

import com.whiteplanet.mapper.model.ImSingleMessage;
import org.apache.ibatis.annotations.*;
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
        "insert into app_version_content (id, content, type,",
        "app_version_id, create_time, ",
        "update_time)",
        "values (#{id,jdbcType=INTEGER}, #{content,jdbcType=VARCHAR}, #{type,jdbcType=VARCHAR},",
        "#{appVersionId,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int insert(AppVersionContent record);

    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    @InsertProvider(type=AppVersionContentSqlProvider.class, method="insertSelective")
    int insertSelective(AppVersionContent record);

    /**
     * 批量插入
     * @param list
     * @return
     */
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    @InsertProvider(type=AppVersionContentSqlProvider.class,method = "insertBatch")
    int insertBatch(@Param("list") List<AppVersionContent> list);

    @SelectProvider(type=AppVersionContentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_version_id", property="appVersionId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AppVersionContent> selectByExample(AppVersionContentExample example);

    @Select({
        "select",
        "id, content, app_version_id,type, create_time, update_time",
        "from app_version_content",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
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
        "set content = #{content,jdbcType=VARCHAR},type = #{type,jdbcType=VARCHAR},",
          "app_version_id = #{appVersionId,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AppVersionContent record);

    /**
     * 依据版本id查询所有更新内容
     */
    @Select({
            "select",
            "id, content, type,app_version_id, create_time, update_time",
            "from app_version_content",
            "where app_version_id = #{appVersionId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
            @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
            @Result(column="app_version_id", property="appVersionId", jdbcType=JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AppVersionContent> selectAppVersionContentByVersionID(int appVersionId);
}