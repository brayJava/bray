package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorIllnessKey;
import org.apache.ibatis.jdbc.SQL;

public class DoctorIllnessSqlProvider {

    public String insertSelective(DoctorIllnessKey record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("doctor_illness");
        
        if (record.getIllnessId() != null) {
            sql.VALUES("illness_id", "#{illnessId,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }
}