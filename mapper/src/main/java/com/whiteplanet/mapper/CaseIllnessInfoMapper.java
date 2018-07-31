package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.CaseIllnessInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface CaseIllnessInfoMapper {
    @Delete({
        "delete from case_illness_info",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Delete({
            "delete from case_illness_info",
            "where case_illness_id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByCaseIllnessId(String id);

    @Insert({
        "insert into case_illness_info (id, case_illness_id, ",
        "illness, notes, ",
        "create_date)",
        "values (#{id,jdbcType=VARCHAR}, #{caseIllnessId,jdbcType=VARCHAR}, ",
        "#{illness,jdbcType=VARCHAR}, #{notes,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP})"
    })
    int insert(CaseIllnessInfo record);

    @InsertProvider(type=CaseIllnessInfoSqlProvider.class, method="insertSelective")
    int insertSelective(CaseIllnessInfo record);

    @Select({
        "select",
        "id, case_illness_id, illness, notes, create_date",
        "from case_illness_info",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
        @Result(column="illness", property="illness", jdbcType= JdbcType.VARCHAR),
        @Result(column="notes", property="notes", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    CaseIllnessInfo selectByPrimaryKey(String id);

    @UpdateProvider(type=CaseIllnessInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CaseIllnessInfo record);

    @Update({
        "update case_illness_info",
        "set case_illness_id = #{caseIllnessId,jdbcType=VARCHAR},",
          "illness = #{illness,jdbcType=VARCHAR},",
          "notes = #{notes,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(CaseIllnessInfo record);

    @Select({
            "select",
            "id, notes, illness, create_date",
            "from case_illness_info",
            "where case_illness_id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="notes", property="notes", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="illness", property="illness", jdbcType= JdbcType.VARCHAR),
    })
    List<CaseIllnessInfo> selectByCaseIllnessId(String id);
}