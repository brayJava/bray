package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.MRecord;
import com.whiteplanet.mapper.model.MRecordExample;
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

public interface MRecordMapper {
    @SelectProvider(type=MRecordSqlProvider.class, method="countByExample")
    int countByExample(MRecordExample example);

    @DeleteProvider(type=MRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(MRecordExample example);

    @Delete({
        "delete from m_record",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into m_record (id, name, ",
        "sex, phone, birth_date, ",
        "city, relation, ",
        "is_first_time, status)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=INTEGER}, #{phone,jdbcType=VARCHAR}, #{birthDate,jdbcType=TIMESTAMP}, ",
        "#{city,jdbcType=VARCHAR}, #{relation,jdbcType=INTEGER}, ",
        "#{isFirstTime,jdbcType=INTEGER}, #{status,jdbcType=INTEGER})"
    })
    int insert(MRecord record);

    @InsertProvider(type=MRecordSqlProvider.class, method="insertSelective")
    int insertSelective(MRecord record);

    @SelectProvider(type=MRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="birth_date", property="birthDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="relation", property="relation", jdbcType=JdbcType.INTEGER),
        @Result(column="is_first_time", property="isFirstTime", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    List<MRecord> selectByExample(MRecordExample example);

    @Select({
        "select",
        "id, name, sex, phone, birth_date, city, relation, is_first_time, status",
        "from m_record",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="birth_date", property="birthDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="relation", property="relation", jdbcType=JdbcType.INTEGER),
        @Result(column="is_first_time", property="isFirstTime", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    MRecord selectByPrimaryKey(String id);

    @UpdateProvider(type=MRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MRecord record, @Param("example") MRecordExample example);

    @UpdateProvider(type=MRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MRecord record, @Param("example") MRecordExample example);

    @UpdateProvider(type=MRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MRecord record);

    @Update({
        "update m_record",
        "set name = #{name,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=INTEGER},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "birth_date = #{birthDate,jdbcType=TIMESTAMP},",
          "city = #{city,jdbcType=VARCHAR},",
          "relation = #{relation,jdbcType=INTEGER},",
          "is_first_time = #{isFirstTime,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(MRecord record);
}