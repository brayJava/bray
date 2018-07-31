package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.AppVersion;
import com.whiteplanet.mapper.model.AppVersionExample;
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
        "is_constranint_update, creat_time, ",
        "update_time)",
        "values (#{id,jdbcType=INTEGER}, #{version,jdbcType=VARCHAR}, ",
        "#{isConstranintUpdate,jdbcType=TINYINT}, #{creatTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(AppVersion record);

    @InsertProvider(type=AppVersionSqlProvider.class, method="insertSelective")
    int insertSelective(AppVersion record);

    @SelectProvider(type=AppVersionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_constranint_update", property="isConstranintUpdate", jdbcType=JdbcType.TINYINT),
        @Result(column="creat_time", property="creatTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AppVersion> selectByExample(AppVersionExample example);

    @Select({
        "select",
        "id, version, is_constranint_update, creat_time, update_time",
        "from app_version",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_constranint_update", property="isConstranintUpdate", jdbcType=JdbcType.TINYINT),
        @Result(column="creat_time", property="creatTime", jdbcType=JdbcType.TIMESTAMP),
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
          "creat_time = #{creatTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AppVersion record);
}