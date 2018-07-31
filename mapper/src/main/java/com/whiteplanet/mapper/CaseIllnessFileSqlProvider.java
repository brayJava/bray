package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.CaseIllnessFileKey;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class CaseIllnessFileSqlProvider {

    public String insertSelective(CaseIllnessFileKey record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("case_illness_file");
        
        if (record.getCaseIllnessInfoId() != null) {
            sql.VALUES("case_illness_info_id", "#{caseIllnessInfoId,jdbcType=VARCHAR}");
        }
        
        if (record.getPubFileId() != null) {
            sql.VALUES("pub_file_id", "#{pubFileId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String insertSelectByCaseIllnessId(Map map){
        return "INSERT INTO case_illness_file(case_illness_info_id, pub_file_id)" +
                "(SELECT '" + map.get("newId") + "', pub_file_id FROM case_illness_file" +
                " WHERE (case_illness_info_id = '" + map.get("id") +"'))";
    }
}