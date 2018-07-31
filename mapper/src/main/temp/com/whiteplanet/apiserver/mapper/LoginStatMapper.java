package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.LoginStat;
import com.whiteplanet.mapper.model.LoginStatExample;
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

public interface LoginStatMapper {
    @SelectProvider(type=LoginStatSqlProvider.class, method="countByExample")
    int countByExample(LoginStatExample example);

    @DeleteProvider(type=LoginStatSqlProvider.class, method="deleteByExample")
    int deleteByExample(LoginStatExample example);

    @Delete({
        "delete from login_stat",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into login_stat (id, doctor_id, ",
        "login_date)",
        "values (#{id,jdbcType=INTEGER}, #{doctorId,jdbcType=VARCHAR}, ",
        "#{loginDate,jdbcType=TIMESTAMP})"
    })
    int insert(LoginStat record);

    @InsertProvider(type=LoginStatSqlProvider.class, method="insertSelective")
    int insertSelective(LoginStat record);

    @SelectProvider(type=LoginStatSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="doctor_id", property="doctorId", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_date", property="loginDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<LoginStat> selectByExample(LoginStatExample example);

    @Select({
        "select",
        "id, doctor_id, login_date",
        "from login_stat",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="doctor_id", property="doctorId", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_date", property="loginDate", jdbcType=JdbcType.TIMESTAMP)
    })
    LoginStat selectByPrimaryKey(Integer id);

    @UpdateProvider(type=LoginStatSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LoginStat record, @Param("example") LoginStatExample example);

    @UpdateProvider(type=LoginStatSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LoginStat record, @Param("example") LoginStatExample example);

    @UpdateProvider(type=LoginStatSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LoginStat record);

    @Update({
        "update login_stat",
        "set doctor_id = #{doctorId,jdbcType=VARCHAR},",
          "login_date = #{loginDate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LoginStat record);
}