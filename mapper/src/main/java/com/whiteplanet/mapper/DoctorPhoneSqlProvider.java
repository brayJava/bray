package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.DoctorPhone;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class DoctorPhoneSqlProvider {

    public String insertSelective(DoctorPhone record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("doctor_phone");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getOwnerDoctorId() != null) {
            sql.VALUES("owner_doctor_id", "#{ownerDoctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DoctorPhone record) {
        SQL sql = new SQL();
        sql.UPDATE("doctor_phone");
        
        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getOwnerDoctorId() != null) {
            sql.SET("owner_doctor_id = #{ownerDoctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    public String insertSelectives(Map<String,Object> params){
        List<DoctorPhone> doctorPhoneList = (List<DoctorPhone>) params.get("list");
        StringBuilder sql = new StringBuilder();
        sql.append("insert doctor_phone(id, name, phone, doctor_id,create_date) values");

        for(DoctorPhone doctorPhone: doctorPhoneList){
            sql.append("(")
                    .append("replace(uuid(),'-',''),")
                    .append("'").append(doctorPhone.getName()).append("',")
                    .append("'").append(doctorPhone.getPhone()).append("',")
                    .append("'").append(doctorPhone.getDoctorId()).append("',")
                    .append("now()")
                    .append("),");
        }
        return sql.substring(0,sql.length() -1);
    }

    public String insertSelectivesResult(Map<String,Object> params){
        List<DoctorPhone> doctorPhoneList = (List<DoctorPhone>) params.get("list");
        StringBuilder sql = new StringBuilder();
        sql.append("insert doctor_phone(id, name, phone, doctor_id, owner_doctor_id, create_date) values");

        for(DoctorPhone doctorPhone: doctorPhoneList){
            sql.append("(")
                    .append("replace(uuid(),'-',''),")
                    .append("'").append(doctorPhone.getName()).append("',")
                    .append("'").append(doctorPhone.getPhone()).append("',")
                    .append("'").append(doctorPhone.getDoctorId()).append("',")
                    .append("'").append(doctorPhone.getOwnerDoctorId()).append("',")
                    .append("now()")
                    .append("),");
        }
        return sql.substring(0,sql.length() -1);
    }
}