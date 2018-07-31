package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.PatientInfo;
import com.whiteplanet.mapper.model.PatientInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PatientInfoMapper {
    @SelectProvider(type=PatientInfoSqlProvider.class, method="countByExample")
    int countByExample(PatientInfoExample example);

    @DeleteProvider(type=PatientInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(PatientInfoExample example);

    @Insert({
        "insert into patient_info (id, visit_person_id, ",
        "name, sex, phone, ",
        "birth_date, city, ",
        "create_time, update_time)",
        "values (#{id,jdbcType=VARCHAR}, #{visitPersonId,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{sex,jdbcType=INTEGER}, #{phone,jdbcType=VARCHAR}, ",
        "#{birthDate,jdbcType=TIMESTAMP}, #{city,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(PatientInfo record);

    @InsertProvider(type=PatientInfoSqlProvider.class, method="insertSelective")
    int insertSelective(PatientInfo record);

    @SelectProvider(type=PatientInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR),
        @Result(column="visit_person_id", property="visitPersonId", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="birth_date", property="birthDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<PatientInfo> selectByExample(PatientInfoExample example);

    @UpdateProvider(type=PatientInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PatientInfo record, @Param("example") PatientInfoExample example);

    @UpdateProvider(type=PatientInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PatientInfo record, @Param("example") PatientInfoExample example);
}