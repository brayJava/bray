package com.whiteplanet.admin.mapper;

import com.whiteplanet.admin.mapper.model.AdminUser;
import com.whiteplanet.admin.mapper.model.AdminUserExample;
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

public interface AdminUserMapper {
    @SelectProvider(type=AdminUserSqlProvider.class, method="countByExample")
    int countByExample(AdminUserExample example);

    @DeleteProvider(type=AdminUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(AdminUserExample example);

    @Delete({
        "delete from admin_user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into admin_user (id, name, ",
        "pwd, create_time, ",
        "update_time)",
        "values (#{id,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{pwd,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(AdminUser record);

    @InsertProvider(type=AdminUserSqlProvider.class, method="insertSelective")
    int insertSelective(AdminUser record);

    @SelectProvider(type=AdminUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="pwd", property="pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AdminUser> selectByExample(AdminUserExample example);

    @Select({
        "select",
        "id, name, pwd, create_time, update_time",
        "from admin_user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="pwd", property="pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    AdminUser selectByPrimaryKey(Long id);

    @UpdateProvider(type=AdminUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    @UpdateProvider(type=AdminUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    @UpdateProvider(type=AdminUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AdminUser record);

    @Update({
        "update admin_user",
        "set name = #{name,jdbcType=VARCHAR},",
          "pwd = #{pwd,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AdminUser record);
}