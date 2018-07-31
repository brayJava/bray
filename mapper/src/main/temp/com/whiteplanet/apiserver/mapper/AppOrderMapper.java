package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.AppOrder;
import com.whiteplanet.mapper.model.AppOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface AppOrderMapper {
    @SelectProvider(type=AppOrderSqlProvider.class, method="countByExample")
    int countByExample(AppOrderExample example);

    @DeleteProvider(type=AppOrderSqlProvider.class, method="deleteByExample")
    int deleteByExample(AppOrderExample example);

    @Delete({
        "delete from app_order",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into app_order (id, order_no, ",
        "m_record_id, visit_person_id, ",
        "inspect_start_date, inspect_end_date, ",
        "inspect_check_city, inspect_check_cost, ",
        "create_time, update_time, ",
        "status, trans_doc_id, ",
        "trans_doc_name, trans_date, ",
        "receive_doc_id, receive_doc_name, ",
        "receive_date, treatment_money, ",
        "pay_type, note)",
        "values (#{id,jdbcType=VARCHAR}, #{orderNo,jdbcType=VARCHAR}, ",
        "#{mRecordId,jdbcType=VARCHAR}, #{visitPersonId,jdbcType=VARCHAR}, ",
        "#{inspectStartDate,jdbcType=TIMESTAMP}, #{inspectEndDate,jdbcType=TIMESTAMP}, ",
        "#{inspectCheckCity,jdbcType=VARCHAR}, #{inspectCheckCost,jdbcType=BIGINT}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=INTEGER}, #{transDocId,jdbcType=VARCHAR}, ",
        "#{transDocName,jdbcType=VARCHAR}, #{transDate,jdbcType=TIMESTAMP}, ",
        "#{receiveDocId,jdbcType=VARCHAR}, #{receiveDocName,jdbcType=VARCHAR}, ",
        "#{receiveDate,jdbcType=TIMESTAMP}, #{treatmentMoney,jdbcType=DECIMAL}, ",
        "#{payType,jdbcType=INTEGER}, #{note,jdbcType=VARCHAR})"
    })
    int insert(AppOrder record);

    @InsertProvider(type=AppOrderSqlProvider.class, method="insertSelective")
    int insertSelective(AppOrder record);

    @SelectProvider(type=AppOrderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="m_record_id", property="mRecordId", jdbcType=JdbcType.VARCHAR),
        @Result(column="visit_person_id", property="visitPersonId", jdbcType=JdbcType.VARCHAR),
        @Result(column="inspect_start_date", property="inspectStartDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="inspect_end_date", property="inspectEndDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="inspect_check_city", property="inspectCheckCity", jdbcType=JdbcType.VARCHAR),
        @Result(column="inspect_check_cost", property="inspectCheckCost", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="trans_doc_id", property="transDocId", jdbcType=JdbcType.VARCHAR),
        @Result(column="trans_doc_name", property="transDocName", jdbcType=JdbcType.VARCHAR),
        @Result(column="trans_date", property="transDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="receive_doc_id", property="receiveDocId", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_doc_name", property="receiveDocName", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_date", property="receiveDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="treatment_money", property="treatmentMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="pay_type", property="payType", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR)
    })
    List<AppOrder> selectByExample(AppOrderExample example);

    @Select({
        "select",
        "id, order_no, m_record_id, visit_person_id, inspect_start_date, inspect_end_date, ",
        "inspect_check_city, inspect_check_cost, create_time, update_time, status, trans_doc_id, ",
        "trans_doc_name, trans_date, receive_doc_id, receive_doc_name, receive_date, ",
        "treatment_money, pay_type, note",
        "from app_order",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="m_record_id", property="mRecordId", jdbcType=JdbcType.VARCHAR),
        @Result(column="visit_person_id", property="visitPersonId", jdbcType=JdbcType.VARCHAR),
        @Result(column="inspect_start_date", property="inspectStartDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="inspect_end_date", property="inspectEndDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="inspect_check_city", property="inspectCheckCity", jdbcType=JdbcType.VARCHAR),
        @Result(column="inspect_check_cost", property="inspectCheckCost", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="trans_doc_id", property="transDocId", jdbcType=JdbcType.VARCHAR),
        @Result(column="trans_doc_name", property="transDocName", jdbcType=JdbcType.VARCHAR),
        @Result(column="trans_date", property="transDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="receive_doc_id", property="receiveDocId", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_doc_name", property="receiveDocName", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_date", property="receiveDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="treatment_money", property="treatmentMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="pay_type", property="payType", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR)
    })
    AppOrder selectByPrimaryKey(String id);

    @UpdateProvider(type=AppOrderSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AppOrder record, @Param("example") AppOrderExample example);

    @UpdateProvider(type=AppOrderSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AppOrder record, @Param("example") AppOrderExample example);

    @UpdateProvider(type=AppOrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AppOrder record);

    @Update({
        "update app_order",
        "set order_no = #{orderNo,jdbcType=VARCHAR},",
          "m_record_id = #{mRecordId,jdbcType=VARCHAR},",
          "visit_person_id = #{visitPersonId,jdbcType=VARCHAR},",
          "inspect_start_date = #{inspectStartDate,jdbcType=TIMESTAMP},",
          "inspect_end_date = #{inspectEndDate,jdbcType=TIMESTAMP},",
          "inspect_check_city = #{inspectCheckCity,jdbcType=VARCHAR},",
          "inspect_check_cost = #{inspectCheckCost,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER},",
          "trans_doc_id = #{transDocId,jdbcType=VARCHAR},",
          "trans_doc_name = #{transDocName,jdbcType=VARCHAR},",
          "trans_date = #{transDate,jdbcType=TIMESTAMP},",
          "receive_doc_id = #{receiveDocId,jdbcType=VARCHAR},",
          "receive_doc_name = #{receiveDocName,jdbcType=VARCHAR},",
          "receive_date = #{receiveDate,jdbcType=TIMESTAMP},",
          "treatment_money = #{treatmentMoney,jdbcType=DECIMAL},",
          "pay_type = #{payType,jdbcType=INTEGER},",
          "note = #{note,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(AppOrder record);
}