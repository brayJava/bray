package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.BankcardBin;
import org.apache.ibatis.jdbc.SQL;

public class BankcardBinSqlProvider {

    public String insertSelective(BankcardBin record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("bankcard_bin");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getBankId() != null) {
            sql.VALUES("BANK_ID", "#{bankId,jdbcType=VARCHAR}");
        }
        
        if (record.getBankName() != null) {
            sql.VALUES("BANK_NAME", "#{bankName,jdbcType=VARCHAR}");
        }
        
        if (record.getCardType() != null) {
            sql.VALUES("CARD_TYPE", "#{cardType,jdbcType=VARCHAR}");
        }
        
        if (record.getBinStat() != null) {
            sql.VALUES("BIN_STAT", "#{binStat,jdbcType=INTEGER}");
        }
        
        if (record.getCardName() != null) {
            sql.VALUES("CARD_NAME", "#{cardName,jdbcType=VARCHAR}");
        }
        
        if (record.getBankLink() != null) {
            sql.VALUES("BANK_LINK", "#{bankLink,jdbcType=VARCHAR}");
        }
        
        if (record.getCardBin() != null) {
            sql.VALUES("CARD_BIN", "#{cardBin,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(BankcardBin record) {
        SQL sql = new SQL();
        sql.UPDATE("bankcard_bin");
        
        if (record.getBankId() != null) {
            sql.SET("BANK_ID = #{bankId,jdbcType=VARCHAR}");
        }
        
        if (record.getBankName() != null) {
            sql.SET("BANK_NAME = #{bankName,jdbcType=VARCHAR}");
        }
        
        if (record.getCardType() != null) {
            sql.SET("CARD_TYPE = #{cardType,jdbcType=VARCHAR}");
        }
        
        if (record.getBinStat() != null) {
            sql.SET("BIN_STAT = #{binStat,jdbcType=INTEGER}");
        }
        
        if (record.getCardName() != null) {
            sql.SET("CARD_NAME = #{cardName,jdbcType=VARCHAR}");
        }
        
        if (record.getBankLink() != null) {
            sql.SET("BANK_LINK = #{bankLink,jdbcType=VARCHAR}");
        }
        
        if (record.getCardBin() != null) {
            sql.SET("CARD_BIN = #{cardBin,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}