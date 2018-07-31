package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.PatientHomeIllnessKey;
import org.apache.ibatis.jdbc.SQL;

import java.util.Collection;
import java.util.Map;

public class PatientHomeIllnessSqlProvider {

    public String insertSelective(PatientHomeIllnessKey record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("patient_home_illness");
        
        if (record.getPatientRecommendDoctorId() != null) {
            sql.VALUES("patient_recommend_doctor_id", "#{patientRecommendDoctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelNotesId() != null) {
            sql.VALUES("label_notes_id", "#{labelNotesId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String insertSelectives(Map<String,Object> params){
        Collection<PatientHomeIllnessKey> records = (Collection<PatientHomeIllnessKey>) params.get("records");
        StringBuilder sql = new StringBuilder();
        sql.append("insert into patient_home_illness(patient_recommend_doctor_id,label_notes_id)")
                .append("values");
        for(PatientHomeIllnessKey item:records){
            sql.append("(")
                    .append("'").append(item.getPatientRecommendDoctorId()).append("',")
                    .append("'").append(item.getLabelNotesId()).append("'")
                    .append("),");
        }
        return sql.subSequence(0, sql.length() -1).toString();
    }
}