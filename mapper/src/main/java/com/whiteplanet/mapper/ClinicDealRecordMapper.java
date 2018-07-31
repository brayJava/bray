package com.whiteplanet.mapper;



import com.whiteplanet.mapper.data.ClinicIncomeBean;
import com.whiteplanet.mapper.model.ClinicDealRecord;
import com.whiteplanet.mapper.model.ClinicDealRecordExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ClinicDealRecordMapper {
    @SelectProvider(type=ClinicDealRecordSqlProvider.class, method="countByExample")
    int countByExample(ClinicDealRecordExample example);

    @DeleteProvider(type=ClinicDealRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(ClinicDealRecordExample example);

    @Delete({
        "delete from clinic_deal_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into clinic_deal_record (id, clinic_id, ",
        "money, order_id, ",
        "deal_type, create_date)",
        "values (#{id,jdbcType=INTEGER}, #{clinicId,jdbcType=VARCHAR}, ",
        "#{money,jdbcType=DECIMAL}, #{orderId,jdbcType=VARCHAR}, ",
        "#{dealType,jdbcType=INTEGER}, #{createDate,jdbcType=TIMESTAMP})"
    })
    int insert(ClinicDealRecord record);

    @InsertProvider(type=ClinicDealRecordSqlProvider.class, method="insertSelective")
    int insertSelective(ClinicDealRecord record);

    @SelectProvider(type=ClinicDealRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR),
        @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
        @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="deal_type", property="dealType", jdbcType= JdbcType.INTEGER),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    List<ClinicDealRecord> selectByExample(ClinicDealRecordExample example);

    @Select({
        "select",
        "id, clinic_id,withdraw_id, money, order_id, deal_type, create_date",
        "from clinic_deal_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR),
        @Result(column="withdraw_id", property="withDrawId", jdbcType= JdbcType.VARCHAR),
        @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
        @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="deal_type", property="dealType", jdbcType= JdbcType.INTEGER),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    ClinicDealRecord selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ClinicDealRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ClinicDealRecord record, @Param("example") ClinicDealRecordExample example);

    @UpdateProvider(type=ClinicDealRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ClinicDealRecord record, @Param("example") ClinicDealRecordExample example);

    @UpdateProvider(type=ClinicDealRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ClinicDealRecord record);

    @Update({
        "update clinic_deal_record",
        "set clinic_id = #{clinicId,jdbcType=VARCHAR},",
          "money = #{money,jdbcType=DECIMAL},",
          "order_id = #{orderId,jdbcType=VARCHAR},",
          "deal_type = #{dealType,jdbcType=INTEGER},",
          "create_date = #{createDate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ClinicDealRecord record);

    @Select({
            "select",
            "id, clinic_id, money,withdraw_id, order_id, deal_type, create_date",
            "from clinic_deal_record",
            "where clinic_id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="withdraw_id", property="withDrawId", jdbcType= JdbcType.VARCHAR),
            @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR),
            @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="deal_type", property="dealType", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    List<ClinicDealRecord> selectByClinicId(String id);

    @Select({
            "select",
            "DATE_FORMAT(create_date,'%Y%m') months ",
            "from clinic_deal_record ",
            "where clinic_id = #{id,jdbcType=VARCHAR} ",
            "GROUP BY  months",
            "ORDER BY months desc"
    })
    List<String> selectRecordMonths(String id);

    @Select({
            "select",
            "id, clinic_id, money,withdraw_id, order_id, deal_type, create_date",
            "from clinic_deal_record",
            "where clinic_id = #{id,jdbcType=VARCHAR}",
            "and DATE_FORMAT(create_date,'%Y%m') = #{month,jdbcType=VARCHAR}",
            " ORDER BY create_date desc"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR),
            @Result(column="withdraw_id", property="withDrawId", jdbcType= JdbcType.VARCHAR),
            @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="deal_type", property="dealType", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    List<ClinicDealRecord> selectByMonth(@Param("id") String id, @Param("month") String month);
    @Select({
            " SELECT " ,
            " t.clinic_id, " ,
            " total_money, " ,
            " total_count, " ,
            " t1.doctor_id, " ,
            " t1.real_name, " ,
            " t1.phone " ,
            " FROM " ,
            " ( "  ,
                  "  SELECT" ,
                    " clinic_id, " ,
                    " sum(money) total_money, " ,
                    " count(clinic_id) total_count " ,
                    " FROM " ,
                    " clinic_deal_record " ,
                    " WHERE " ,
                    " deal_type IN (1, 2, 4) " ,
                    " and create_date >= #{startDate,jdbcType=VARCHAR}" ,
                    " and create_date <= #{endDate,jdbcType=VARCHAR}" ,
                    " GROUP BY " ,
                    " clinic_id " ,
            " ) t " ,
            " LEFT JOIN ( " ,
            " SELECT " ,
            " c.id clinic_id,d.id doctor_id,d.real_name,d.phone " ,
            " FROM " ,
            " doctor d, " ,
            " clinic c " ,
            " WHERE " ,
            " d.id = c.doctor_id " ,
        " ) t1 ON (t.clinic_id = t1.clinic_id) "
    })
    @Results({
            @Result(column="clinic_id", property="clinicId", jdbcType= JdbcType.VARCHAR),
            @Result(column="total_money", property="totalMoney", jdbcType= JdbcType.VARCHAR),
            @Result(column="total_count", property="totalCount", jdbcType= JdbcType.DECIMAL),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="real_name", property="realName", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR)
    })
    List<ClinicIncomeBean> selectClinicIncome(@Param("startDate") String startDate, @Param("endDate") String endDate);
}


