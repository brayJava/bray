package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Bankcard;
import org.apache.ibatis.jdbc.SQL;

public class BankcardSqlProvider {

    public String insertSelective(Bankcard record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("bankcard");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getBankcode() != null) {
            sql.VALUES("bankcode", "#{bankcode,jdbcType=VARCHAR}");
        }
        
        if (record.getIdcard() != null) {
            sql.VALUES("idcard", "#{idcard,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getBank() != null) {
            sql.VALUES("bank", "#{bank,jdbcType=VARCHAR}");
        }
        
        if (record.getCardtype() != null) {
            sql.VALUES("cardtype", "#{cardtype,jdbcType=INTEGER}");
        }
        
        if (record.getMobile() != null) {
            sql.VALUES("mobile", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getBankcardBinId() != null) {
            sql.VALUES("bankcard_bin_id", "#{bankcardBinId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Bankcard record) {
        SQL sql = new SQL();
        sql.UPDATE("bankcard");
        
        if (record.getBankcode() != null) {
            sql.SET("bankcode = #{bankcode,jdbcType=VARCHAR}");
        }
        
        if (record.getIdcard() != null) {
            sql.SET("idcard = #{idcard,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getBank() != null) {
            sql.SET("bank = #{bank,jdbcType=VARCHAR}");
        }
        
        if (record.getCardtype() != null) {
            sql.SET("cardtype = #{cardtype,jdbcType=INTEGER}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=VARCHAR}");
        }
        
        if (record.getBankcardBinId() != null) {
            sql.SET("bankcard_bin_id = #{bankcardBinId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}