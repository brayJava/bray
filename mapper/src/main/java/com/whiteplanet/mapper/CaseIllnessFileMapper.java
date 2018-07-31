package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.CaseIllnessFileKey;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface CaseIllnessFileMapper {
    @Delete({
            "delete from case_illness_file",
            "where case_illness_info_id = #{caseIllnessInfoId,jdbcType=VARCHAR}",
            "and pub_file_id = #{pubFileId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(CaseIllnessFileKey key);

    @Insert({
            "insert into case_illness_file (case_illness_info_id, pub_file_id)",
            "values (#{caseIllnessInfoId,jdbcType=VARCHAR}, #{pubFileId,jdbcType=VARCHAR})"
    })
    int insert(CaseIllnessFileKey record);

    @InsertProvider(type=CaseIllnessFileSqlProvider.class, method="insertSelective")
    int insertSelective(CaseIllnessFileKey record);


    /**
     *
     * @param id
     * @return
     */
    @InsertProvider(type=CaseIllnessFileSqlProvider.class, method="insertSelectByCaseIllnessId")
    int insertSelectByCaseIllnessId(@Param("newId") String newId, @Param("id") String id);

    /**
     *
     * @param id
     * @return
     */
    @Select({"select `pub_file_id` ,`case_illness_info_id`" ,
            "from case_illness_file " ,
            "where `case_illness_info_id` = #{id,jdbcType=VARCHAR}",
            "order by case_illness_info_id asc"
    })
    @Results({
            @Result(column="pub_file_id", property="pubFileId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_info_id", property="caseIllnessInfoId", jdbcType= JdbcType.VARCHAR),
    })
    List<CaseIllnessFileKey> selectByCaseIllnessInfoId(String id);
}