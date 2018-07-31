package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.CaseIllness;
import com.whiteplanet.mapper.model.CaseIllnessFile;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface CaseIllnessMapper {
    @Delete({
        "delete from case_illness",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into case_illness (id, patient_id, ",
        "name, age, sex, illness,",
        "phone, status, update_date, ",
        "create_date)",
        "values (#{id,jdbcType=VARCHAR}, #{patientId,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER}, #{sex,jdbcType=BIT},#{illness,jdbcType=VARCHAR} ",
        "#{phone,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, #{updateDate,jdbcType=TIMESTAMP}, ",
        "#{createDate,jdbcType=TIMESTAMP})"
    })
    int insert(CaseIllness record);

    @InsertProvider(type=CaseIllnessSqlProvider.class, method="insertSelective")
    int insertSelective(CaseIllness record);

    @Select({
        "select",
        "id, patient_id, name, age, sex, phone, status,illness, update_date, create_date",
        "from case_illness",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        @Result(column="illness", property="illness", jdbcType= JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
        @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
        @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    CaseIllness selectByPrimaryKey(String id);

    @UpdateProvider(type=CaseIllnessSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CaseIllness record);

    @Update({
        "update case_illness",
        "set patient_id = #{patientId,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "age = #{age,jdbcType=INTEGER},",
          "sex = #{sex,jdbcType=BIT},",
          "phone = #{phone,jdbcType=VARCHAR},",
            "illness = #{illness,jdbcType=VARCHAR}",
          "status = #{status,jdbcType=INTEGER},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "create_date = #{createDate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(CaseIllness record);

    @Select({
            "select",
            "id, name, age, sex, phone, illness, create_date,status",
            "from case_illness",
            "where name = #{name,jdbcType=VARCHAR}",
            "and status != -1",
            "and patient_id = #{patientId, jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="illness", property="illness", jdbcType= JdbcType.VARCHAR),
            @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    List<CaseIllness> selectByName(@Param("name") String name, @Param("patientId") String patientId);

    @Select({
            "select",
            "id, name, age, sex, phone, illness, create_date,status",
            "from case_illness",
            "where name = #{name,jdbcType=VARCHAR}",
            "and status = 0",
            "and patient_id = #{patientId, jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="illness", property="illness", jdbcType= JdbcType.VARCHAR),
            @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    List<CaseIllness> selectByNameZero(@Param("name") String name, @Param("patientId") String patientId);

    /**
     *
     * @param id
     * @return
     */
    @Select({
            "select * from (",
            "select name, count(1) as `count`,max(create_date) as last_date_time",
            "from case_illness",
            "where patient_id = #{id, jdbcType=VARCHAR}",
            "and status != -1",
            "group by `name`",
            ") t order by t.last_date_time desc"
    })
    @Results({
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="count", property="count", jdbcType= JdbcType.VARCHAR),
            @Result(column="last_date_time", property="lastDateTime", jdbcType= JdbcType.VARCHAR)
    })
    List<CaseIllnessFile> selectFileCaseByPatientID(String id);

    /**
     * status = 0
     * @param id
     * @return
     */
    @Select({
            "select * from (",
            "select name, count(1) as `count`,UNIX_TIMESTAMP(max(create_date)) * 1000 as last_date_time",
            "from case_illness",
            "where patient_id = #{id, jdbcType=VARCHAR}",
            "and status = 0",
            "group by `name`",
            ") t order by t.last_date_time desc"
    })
    @Results({
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="count", property="count", jdbcType= JdbcType.VARCHAR),
            @Result(column="last_date_time", property="lastDateTime", jdbcType= JdbcType.VARCHAR)
    })
    List<CaseIllnessFile> selectFileCaseByPatientIDAndStatusZero(String id);

    @Select({
        "select",
        "id, patient_id, name, age, sex, phone, status,illness, update_date, create_date",
        "from case_illness",
        "where patient_id = #{patientId, jdbcType=VARCHAR}",
            "and status = 1"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="patient_id", property="patientId", jdbcType= JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        @Result(column="illness", property="illness", jdbcType= JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
        @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
        @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    List<CaseIllness> selectCaseIllnessListByPatientId(String id);
}
