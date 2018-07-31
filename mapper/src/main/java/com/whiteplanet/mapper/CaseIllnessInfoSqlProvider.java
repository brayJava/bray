package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.CaseIllnessInfo;
import org.apache.ibatis.jdbc.SQL;

public class CaseIllnessInfoSqlProvider {

    public String insertSelective(CaseIllnessInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("case_illness_info");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getCaseIllnessId() != null) {
            sql.VALUES("case_illness_id", "#{caseIllnessId,jdbcType=VARCHAR}");
        }
        
        if (record.getIllness() != null) {
            sql.VALUES("illness", "#{illness,jdbcType=VARCHAR}");
        }
        
        if (record.getNotes() != null) {
            sql.VALUES("notes", "#{notes,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CaseIllnessInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("case_illness_info");
        
        if (record.getCaseIllnessId() != null) {
            sql.SET("case_illness_id = #{caseIllnessId,jdbcType=VARCHAR}");
        }
        
        if (record.getIllness() != null) {
            sql.SET("illness = #{illness,jdbcType=VARCHAR}");
        }
        
        if (record.getNotes() != null) {
            sql.SET("notes = #{notes,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}