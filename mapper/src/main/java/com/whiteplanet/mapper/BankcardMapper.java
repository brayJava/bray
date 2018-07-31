package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Bankcard;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface BankcardMapper {
    @Delete({
        "delete from bankcard",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into bankcard (id, bankcode, ",
        "idcard, name, bank, ",
        "cardtype, mobile, ",
        "create_date, doctor_id, ",
        "bankcard_bin_id, status)",
        "values (#{id,jdbcType=VARCHAR}, #{bankcode,jdbcType=VARCHAR}, ",
        "#{idcard,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, #{bank,jdbcType=VARCHAR}, ",
        "#{cardtype,jdbcType=VARCHAR}, #{mobile,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{doctorId,jdbcType=VARCHAR}, ",
        "#{bankcardBinId,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER})"
    })
    int insert(Bankcard record);

    @InsertProvider(type=BankcardSqlProvider.class, method="insertSelective")
    int insertSelective(Bankcard record);

    @Select({
        "select",
        "id, bankcode, idcard, name, bank, cardtype, mobile, create_date, doctor_id, ",
        "bankcard_bin_id, status",
        "from bankcard",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="bankcode", property="bankcode", jdbcType= JdbcType.VARCHAR),
        @Result(column="idcard", property="idcard", jdbcType= JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
        @Result(column="bank", property="bank", jdbcType= JdbcType.VARCHAR),
        @Result(column="cardtype", property="cardtype", jdbcType= JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="bankcard_bin_id", property="bankcardBinId", jdbcType= JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    Bankcard selectByPrimaryKey(String id);

    @UpdateProvider(type=BankcardSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Bankcard record);

    @Update({
        "update bankcard",
        "set bankcode = #{bankcode,jdbcType=VARCHAR},",
          "idcard = #{idcard,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "bank = #{bank,jdbcType=VARCHAR},",
          "cardtype = #{cardtype,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "doctor_id = #{doctorId,jdbcType=VARCHAR},",
          "bankcard_bin_id = #{bankcardBinId,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Bankcard record);

    @Update({
        "update bankcard",
        "set status = #{status, jdbcType=INTEGER}",
        "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
        "and status = 0"
    })
    int updateStatusByDoctorIdAndStatusZero(Bankcard record);

    @Select({
            "select",
            "id, bankcode, idcard, name, bank, cardtype, mobile, create_date, doctor_id, ",
            "bankcard_bin_id, status",
            "from bankcard",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and status = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="bankcode", property="bankcode", jdbcType= JdbcType.VARCHAR),
            @Result(column="idcard", property="idcard", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="bank", property="bank", jdbcType= JdbcType.VARCHAR),
            @Result(column="cardtype", property="cardtype", jdbcType= JdbcType.VARCHAR),
            @Result(column="mobile", property="mobile", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="bankcard_bin_id", property="bankcardBinId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    List<Bankcard> selectByDoctorId(String doctorId);

    @Select({
            "select",
            "id, bankcode, idcard, name, bank, cardtype, mobile, create_date, doctor_id, ",
            "bankcard_bin_id, status",
            "from bankcard",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and bankcode = #{bankcode, jdbcType=VARCHAR}",
            "and status = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="bankcode", property="bankcode", jdbcType= JdbcType.VARCHAR),
            @Result(column="idcard", property="idcard", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="bank", property="bank", jdbcType= JdbcType.VARCHAR),
            @Result(column="cardtype", property="cardtype", jdbcType= JdbcType.VARCHAR),
            @Result(column="mobile", property="mobile", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="bankcard_bin_id", property="bankcardBinId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    Bankcard selectByDoctorIdAndBankcode(Bankcard bankcard);

    @Select({
            "select",
            "id, bankcode, idcard, name, bank, cardtype, mobile, create_date, doctor_id, ",
            "bankcard_bin_id, status",
            "from bankcard",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and id = #{id, jdbcType=VARCHAR}",
            "and status = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="bankcode", property="bankcode", jdbcType= JdbcType.VARCHAR),
            @Result(column="idcard", property="idcard", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="bank", property="bank", jdbcType= JdbcType.VARCHAR),
            @Result(column="cardtype", property="cardtype", jdbcType= JdbcType.VARCHAR),
            @Result(column="mobile", property="mobile", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="bankcard_bin_id", property="bankcardBinId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    Bankcard selectByDoctorIdAndId(Bankcard bankcard);
}