package com.whiteplanet.mapper;

import com.whiteplanet.mapper.data.AppVersionWithCont;
import com.whiteplanet.mapper.model.AppVersion;
import com.whiteplanet.mapper.model.AppVersionContent;
import com.whiteplanet.mapper.model.AppVersionExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;

public interface AppVersionMapper {
    @SelectProvider(type=AppVersionSqlProvider.class, method="countByExample")
    int countByExample(AppVersionExample example);

    @DeleteProvider(type=AppVersionSqlProvider.class, method="deleteByExample")
    int deleteByExample(AppVersionExample example);

    @Delete({
        "delete from app_version",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into app_version (id, version, ",
        "is_constranint_update, update_url,market_url,create_time, ",
        "update_time)",
        "values (#{id,jdbcType=INTEGER}, #{version,jdbcType=VARCHAR}, ",
        "#{isConstranintUpdate,jdbcType=TINYINT}, #{updateUrl,jdbcType=VARCHAR}, #{marketUrl,jdbcType=VARCHAR},#{creatTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int insert(AppVersion record);

    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    @InsertProvider(type=AppVersionSqlProvider.class, method="insertSelective")
    int insertSelective(AppVersion record);

    @SelectProvider(type=AppVersionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_constranint_update", property="isConstranintUpdate", jdbcType=JdbcType.TINYINT),
        @Result(column="update_url", property="updateUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="market_url", property="marketUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="creatTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AppVersion> selectByExample(AppVersionExample example);

    @Select({
        "select",
        "id, version, is_constranint_update, update_url,market_url,create_time, update_time",
        "from app_version",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_constranint_update", property="isConstranintUpdate", jdbcType=JdbcType.TINYINT),
        @Result(column="update_url", property="updateUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="market_url", property="marketUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="creatTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    AppVersion selectByPrimaryKey(Integer id);

    @UpdateProvider(type=AppVersionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AppVersion record, @Param("example") AppVersionExample example);

    @UpdateProvider(type=AppVersionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AppVersion record, @Param("example") AppVersionExample example);

    @UpdateProvider(type=AppVersionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AppVersion record);

    @Update({
        "update app_version",
        "set version = #{version,jdbcType=VARCHAR},",
          "is_constranint_update = #{isConstranintUpdate,jdbcType=TINYINT},",
          "update_url = #{updateUrl,jdbcType=VARCHAR},",
          "market_url = #{marketUrl,jdbcType=VARCHAR},",
          "create_time = #{creatTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AppVersion record);
    /**
     * 查询最近的版本号
     * @return
     */
    @Select({
            " select id, version, is_constranint_update,update_url,market_url,create_time, update_time  ",
            " from app_version ORDER BY create_time desc LIMIT 1 "
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
            @Result(column="is_constranint_update", property="isConstranintUpdate", jdbcType=JdbcType.TINYINT),
            @Result(column="update_url", property="updateUrl", jdbcType=JdbcType.VARCHAR),
            @Result(column="market_url", property="marketUrl", jdbcType=JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    AppVersion selectNewestAppVersion();
    /**
     * 一个版本对应多个内容
     */
    @Select("select id, version, is_constranint_update, update_url,market_url,create_time, update_time from app_version order by id DESC")
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
            @Result(column="is_constranint_update", property="isConstranintUpdate", jdbcType=JdbcType.TINYINT),
            @Result(column="update_url", property="updateUrl", jdbcType=JdbcType.VARCHAR),
            @Result(column="market_url", property="marketUrl", jdbcType=JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(property="appVersionContents",column="id",javaType=List.class,
                    many=@Many(select="com.whiteplanet.mapper.AppVersionContentMapper.selectAppVersionContentByVersionID",fetchType= FetchType.LAZY))
    })
    List<AppVersionWithCont> selectAppVersions();


}