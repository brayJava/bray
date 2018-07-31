package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Doctor;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;
import java.util.List;
import java.util.Map;
public class DoctorSqlProvider {

    public String insertSelective(Doctor record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("doctor");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getDepartmentId() != null) {
            sql.VALUES("department_id", "#{departmentId,jdbcType=VARCHAR}");
        }

        if (record.getHospitalId() != null) {
            sql.VALUES("hospital_id", "#{hospitalId,jdbcType=VARCHAR}");
        }

        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
        }

        if (record.getDepartmentFunctionId() != null) {
            sql.VALUES("department_function_id", "#{departmentFunctionId,jdbcType=VARCHAR}");
        }

        if (record.getPhone() != null) {
            sql.VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }

        if (record.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=VARCHAR}");
        }

        if (record.getRealName() != null) {
            sql.VALUES("real_name", "#{realName,jdbcType=VARCHAR}");
        }

        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=BIT}");
        }

        if (record.getKinde() != null) {
            sql.VALUES("kinde", "#{kinde,jdbcType=VARCHAR}");
        }

        if (record.getIntroduce() != null) {
            sql.VALUES("introduce", "#{introduce,jdbcType=VARCHAR}");
        }

        if (record.getTreatment() != null) {
            sql.VALUES("treatment", "#{treatment,jdbcType=BIT}");
        }

        if (record.getTreatmentMoney() != null) {
            sql.VALUES("treatment_money", "#{treatmentMoney,jdbcType=DECIMAL}");
        }

        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }

        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }

        if (record.getFaceimg() != null) {
            sql.VALUES("faceimg", "#{faceimg,jdbcType=VARCHAR}");
        }

        if (record.getCredits() != null) {
            sql.VALUES("credits", "#{credits,jdbcType=DECIMAL}");
        }

        if (record.getAge() != null) {
            sql.VALUES("age", "#{age,jdbcType=INTEGER}");
        }

        if (record.getSource() != null) {
            sql.VALUES("source", "#{source,jdbcType=VARCHAR}");
        }

        if (record.getDepartmentName() != null) {
            sql.VALUES("department_name", "#{departmentName,jdbcType=VARCHAR}");
        }

        if (record.getDepartmentFunctionName() != null) {
            sql.VALUES("department_function_name", "#{departmentFunctionName,jdbcType=VARCHAR}");
        }

        if (record.getHospitalName() != null) {
            sql.VALUES("hospital_name", "#{hospitalName,jdbcType=VARCHAR}");
        }

        if (record.getThumbsUp() != null) {
            sql.VALUES("thumbs_up", "#{thumbsUp,jdbcType=INTEGER}");
        }

        if (record.getCryptogram() != null) {
            sql.VALUES("cryptogram", "#{cryptogram,jdbcType=VARCHAR}");
        }

        if (record.getStep() != null) {
            sql.VALUES("step", "#{step, jdbcType=INTEGER}");
        }

        if (record.isFirstLogin() != null) {
            sql.VALUES("is_first_login", "#{firstLogin, jdbcType=INTEGER}");
        }

        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Doctor record) {
        SQL sql = new SQL();
        sql.UPDATE("doctor");

        if (record.getDepartmentId() != null) {
            sql.SET("department_id = #{departmentId,jdbcType=VARCHAR}");
        }

        if (record.getHospitalId() != null) {
            sql.SET("hospital_id = #{hospitalId,jdbcType=VARCHAR}");
        }

        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }

        if (record.getDepartmentFunctionId() != null) {
            sql.SET("department_function_id = #{departmentFunctionId,jdbcType=VARCHAR}");
        }

        if (record.getPhone() != null) {
            sql.SET("phone = #{phone,jdbcType=VARCHAR}");
        }

        if (record.getPassword() != null) {
            sql.SET("password = #{password,jdbcType=VARCHAR}");
        }

        if (record.getRealName() != null) {
            sql.SET("real_name = #{realName,jdbcType=VARCHAR}");
        }

        if (record.getSex() != null) {
            sql.SET("sex = #{sex,jdbcType=BIT}");
        }

        if (record.getKinde() != null) {
            sql.SET("kinde = #{kinde,jdbcType=VARCHAR}");
        }

        if (record.getIntroduce() != null) {
            sql.SET("introduce = #{introduce,jdbcType=VARCHAR}");
        }

        if (record.getTreatment() != null) {
            sql.SET("treatment = #{treatment,jdbcType=BIT}");
        }

        if (record.getTreatmentMoney() != null) {
            sql.SET("treatment_money = #{treatmentMoney,jdbcType=DECIMAL}");
        }

        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }

        if (record.getUpdateDate() != null) {
            sql.SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
        }

        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }

        if (record.getFaceimg() != null) {
            sql.SET("faceimg = #{faceimg,jdbcType=VARCHAR}");
        }

        if (record.getCredits() != null) {
            sql.SET("credits = #{credits,jdbcType=DECIMAL}");
        }

        if (record.getAge() != null) {
            sql.SET("age = #{age,jdbcType=INTEGER}");
        }

        if (record.getSource() != null) {
            sql.SET("source = #{source,jdbcType=VARCHAR}");
        }

        if (record.getDepartmentName() != null) {
            sql.SET("department_name = #{departmentName,jdbcType=VARCHAR}");
        }

        if (record.getDepartmentFunctionName() != null) {
            sql.SET("department_function_name = #{departmentFunctionName,jdbcType=VARCHAR}");
        }

        if (record.getHospitalName() != null) {
            sql.SET("hospital_name = #{hospitalName,jdbcType=VARCHAR}");
        }

        if (record.getThumbsUp() != null) {
            sql.SET("thumbs_up = #{thumbsUp,jdbcType=INTEGER}");
        }

        if (record.getCryptogram() != null) {
            sql.SET("cryptogram = #{cryptogram,jdbcType=VARCHAR}");
        }
        if (record.getStep() != null) {
            sql.SET("step = #{step,jdbcType=INTEGER}");
        }
        if (record.isFirstLogin() != null) {
            sql.SET("is_first_login = #{firstLogin, jdbcType=INTEGER}");
        }
        if (record.getIdentifyStatus() != null) {
            sql.SET("identify_status = #{identifyStatus, jdbcType=INTEGER}");
        }
        if (record.getIdentifyRemarks() != null) {
            sql.SET("identify_remarks = #{identifyRemarks, jdbcType=VARCHAR}");
        }
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }

    public String selectByDepartments(Map<String,Object> params){
        List<String> ids = (List<String>) params.get("ids");
        String patientId = (String) params.get("patientId");

        StringBuffer idBuffer = new StringBuffer();
        for(String id:ids){
            idBuffer.append("'").append(id).append("'").append(",");
        }
        idBuffer.append("''");

        return "select * from doctor " +
                "where NOT EXISTS(select 1 from doctor_patient dp where dp.doctor_id = doctor.id and dp.patient_id = '"+ patientId +"') "+
                "and doctor.department_function_id in("+idBuffer.toString()+ ")";
    }

    public String selectPartnerByDocAndDf(Map<String,Object> params){
        String doctorId = (String) params.get("doctorId");
        String departmentFunctionId = (String)params.get("departmentFunctionId");
        Integer count = (Integer)params.get("count");
        StringBuffer sqlBuffer = new StringBuffer();
        sqlBuffer.append("SELECT d.id,dc.show as hide ,d.`real_name` as `name`,  ");
        sqlBuffer.append("d.`department_name` as `department`, d.`hospital_name` as `hospital`, ");
        sqlBuffer.append("d.`faceimg` as `faceimage`  ");
        sqlBuffer.append("from clinic c,doctor_clinic dc,doctor d ");
        sqlBuffer.append("where c.id = dc.clinic_id and dc.doctor_id = d.id " );
        sqlBuffer.append("and c.doctor_id = '"+doctorId+"'");
        if(departmentFunctionId != null && !"".equals(departmentFunctionId)){
            sqlBuffer.append("and d.department_function_id = '"+departmentFunctionId+"' ");
        }
        sqlBuffer.append("order by dc.create_date desc ");
        sqlBuffer.append("limit "+count);

        return sqlBuffer.toString();
    }
    /**
     * 按条件查询语句提供
     * @param paramMap
     * @return
     */
    public String selectDoctorByCondition(Map<String,Object> paramMap) {
        String doctorId = (String)paramMap.get("doctorId");
        String phone = (String)paramMap.get("phone");
        String realName =(String) paramMap.get("realName");
        String status = (String)paramMap.get("status");
        String hospitalName = (String)paramMap.get("hospitalName");
        StringBuffer querySql = new StringBuffer();
        querySql.append("select * from doctor");
        querySql.append(" where 1 = 1 ");
        if(!StringUtils.isEmpty(doctorId))
            querySql.append(" and id = #{doctorId,jdbcType=VARCHAR} ");
        if(!StringUtils.isEmpty(phone))
            querySql.append(" and phone = #{phone,jdbcType=VARCHAR} ");
        if(!StringUtils.isEmpty(status) && status != "null")
            querySql.append(" and identify_status = #{status,jdbcType=VARCHAR} ");
        if(!StringUtils.isEmpty(hospitalName))
            querySql.append(" and hospital_name like CONCAT('%',#{hospitalName,jdbcType=VARCHAR},'%' ) ");
        if(!StringUtils.isEmpty(realName))
            querySql.append(" and real_name like CONCAT('%',#{realName,jdbcType=VARCHAR},'%' ) ");
//        querySql.append(" create_date >= #{startTime,jdbcType=VARCHAR} " );
//        querySql.append(" and update_date <= #{endTime,jdbcType=VARCHAR} " );
        System.out.println(querySql.toString());
        return querySql.toString();
    }
}