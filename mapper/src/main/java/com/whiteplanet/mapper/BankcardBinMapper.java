package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.BankcardBin;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface BankcardBinMapper {
    @Delete({
        "delete from bankcard_bin",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into bankcard_bin (id, BANK_ID, ",
        "BANK_NAME, CARD_TYPE, ",
        "BIN_STAT, CARD_NAME, ",
        "BANK_LINK, CARD_BIN)",
        "values (#{id,jdbcType=VARCHAR}, #{bankId,jdbcType=VARCHAR}, ",
        "#{bankName,jdbcType=VARCHAR}, #{cardType,jdbcType=VARCHAR}, ",
        "#{binStat,jdbcType=INTEGER}, #{cardName,jdbcType=VARCHAR}, ",
        "#{bankLink,jdbcType=VARCHAR}, #{cardBin,jdbcType=VARCHAR})"
    })
    int insert(BankcardBin record);

    @InsertProvider(type=BankcardBinSqlProvider.class, method="insertSelective")
    int insertSelective(BankcardBin record);

    @Select({
        "select",
        "id, BANK_ID, BANK_NAME, CARD_TYPE, BIN_STAT, CARD_NAME, BANK_LINK, CARD_BIN",
        "from bankcard_bin",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="BANK_ID", property="bankId", jdbcType= JdbcType.VARCHAR),
        @Result(column="BANK_NAME", property="bankName", jdbcType= JdbcType.VARCHAR),
        @Result(column="CARD_TYPE", property="cardType", jdbcType= JdbcType.VARCHAR),
        @Result(column="BIN_STAT", property="binStat", jdbcType= JdbcType.INTEGER),
        @Result(column="CARD_NAME", property="cardName", jdbcType= JdbcType.VARCHAR),
        @Result(column="BANK_LINK", property="bankLink", jdbcType= JdbcType.VARCHAR),
        @Result(column="CARD_BIN", property="cardBin", jdbcType= JdbcType.VARCHAR)
    })
    BankcardBin selectByPrimaryKey(String id);

    @UpdateProvider(type=BankcardBinSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BankcardBin record);

    @Update({
        "update bankcard_bin",
        "set BANK_ID = #{bankId,jdbcType=VARCHAR},",
          "BANK_NAME = #{bankName,jdbcType=VARCHAR},",
          "CARD_TYPE = #{cardType,jdbcType=VARCHAR},",
          "BIN_STAT = #{binStat,jdbcType=INTEGER},",
          "CARD_NAME = #{cardName,jdbcType=VARCHAR},",
          "BANK_LINK = #{bankLink,jdbcType=VARCHAR},",
          "CARD_BIN = #{cardBin,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(BankcardBin record);


    @Select({
            "select",
            "count(1)",
            "from bankcard_bin",
            "where CARD_BIN = #{cardBin,jdbcType=VARCHAR}"
    })
    int selectCountByCardBin(String cardBin);

    @Select({
            "select",
            "id, BANK_ID, BANK_NAME, CARD_TYPE, BIN_STAT, CARD_NAME, BANK_LINK, CARD_BIN",
            "from bankcard_bin",
            "where CARD_BIN = #{cardBin,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="BANK_ID", property="bankId", jdbcType= JdbcType.VARCHAR),
            @Result(column="BANK_NAME", property="bankName", jdbcType= JdbcType.VARCHAR),
            @Result(column="CARD_TYPE", property="cardType", jdbcType= JdbcType.VARCHAR),
            @Result(column="BIN_STAT", property="binStat", jdbcType= JdbcType.INTEGER),
            @Result(column="CARD_NAME", property="cardName", jdbcType= JdbcType.VARCHAR),
            @Result(column="BANK_LINK", property="bankLink", jdbcType= JdbcType.VARCHAR),
            @Result(column="CARD_BIN", property="cardBin", jdbcType= JdbcType.VARCHAR)
    })
    BankcardBin selectByCardBin(String cardBin);
}