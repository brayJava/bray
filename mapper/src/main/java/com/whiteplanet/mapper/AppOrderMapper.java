package com.whiteplanet.mapper;


import com.whiteplanet.mapper.data.AppointmentStatBean;
import com.whiteplanet.mapper.data.AppointmentTimeResultBean;
import com.whiteplanet.mapper.model.AppOrder;
import com.whiteplanet.mapper.model.AppOrderExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

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
        "note)",
        "values (#{id,jdbcType=VARCHAR}, #{orderNo,jdbcType=VARCHAR}, ",
        "#{mRecordId,jdbcType=VARCHAR}, #{visitPersonId,jdbcType=VARCHAR}, ",
        "#{inspectStartDate,jdbcType=TIMESTAMP}, #{inspectEndDate,jdbcType=TIMESTAMP}, ",
        "#{inspectCheckCity,jdbcType=VARCHAR}, #{inspectCheckCost,jdbcType=BIGINT}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=INTEGER}, #{transDocId,jdbcType=VARCHAR}, ",
        "#{transDocName,jdbcType=VARCHAR}, #{transDate,jdbcType=TIMESTAMP}, ",
        "#{receiveDocId,jdbcType=VARCHAR}, #{receiveDocName,jdbcType=VARCHAR}, ",
        "#{receiveDate,jdbcType=TIMESTAMP}, #{treatmentMoney,jdbcType=DECIMAL}, "
    })
    int insert(AppOrder record);

    @InsertProvider(type=AppOrderSqlProvider.class, method="insertSelective")
    int insertSelective(AppOrder record);

    @SelectProvider(type=AppOrderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="order_no", property="orderNo", jdbcType= JdbcType.VARCHAR),
        @Result(column="m_record_id", property="mRecordId", jdbcType= JdbcType.VARCHAR),
        @Result(column="visit_person_id", property="visitPersonId", jdbcType= JdbcType.VARCHAR),
        @Result(column="inspect_start_date", property="inspectStartDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="inspect_end_date", property="inspectEndDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="inspect_check_city", property="inspectCheckCity", jdbcType= JdbcType.VARCHAR),
        @Result(column="inspect_check_cost", property="inspectCheckCost", jdbcType= JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
        @Result(column="trans_doc_name", property="transDocName", jdbcType= JdbcType.VARCHAR),
        @Result(column="trans_date", property="transDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
        @Result(column="receive_doc_name", property="receiveDocName", jdbcType= JdbcType.VARCHAR),
        @Result(column="receive_date", property="receiveDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="treatment_money", property="treatmentMoney", jdbcType= JdbcType.DECIMAL),
        @Result(column="pay_type", property="payType", jdbcType= JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType= JdbcType.VARCHAR)
    })
    List<AppOrder> selectByExample(AppOrderExample example);

    @Select({
        "select",
        "id, order_no, m_record_id, visit_person_id, inspect_start_date, inspect_end_date, ",
        "inspect_check_city, inspect_check_cost, create_time, update_time, status, trans_doc_id, ",
        "trans_doc_name, trans_date, receive_doc_id, receive_doc_name, receive_date, phone_no, ",
        "treatment_money,note,cancel_type, cancel_reason, is_trans_free ,is_receive_free, is_paid,is_patient_evaluated ",
        "from app_order",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="order_no", property="orderNo", jdbcType= JdbcType.VARCHAR),
        @Result(column="m_record_id", property="mRecordId", jdbcType= JdbcType.VARCHAR),
        @Result(column="phone_no", property="phoneNo", jdbcType= JdbcType.VARCHAR),
        @Result(column="visit_person_id", property="visitPersonId", jdbcType= JdbcType.VARCHAR),
        @Result(column="inspect_start_date", property="inspectStartDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="inspect_end_date", property="inspectEndDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="inspect_check_city", property="inspectCheckCity", jdbcType= JdbcType.VARCHAR),
        @Result(column="inspect_check_cost", property="inspectCheckCost", jdbcType= JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
        @Result(column="trans_doc_name", property="transDocName", jdbcType= JdbcType.VARCHAR),
        @Result(column="trans_date", property="transDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
        @Result(column="receive_doc_name", property="receiveDocName", jdbcType= JdbcType.VARCHAR),
        @Result(column="receive_date", property="receiveDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="treatment_money", property="treatmentMoney", jdbcType= JdbcType.DECIMAL),
        @Result(column="is_trans_free", property="isTransFree", jdbcType= JdbcType.INTEGER),
        @Result(column="is_receive_free", property="isReceiveFree", jdbcType= JdbcType.INTEGER),
        @Result(column="is_paid", property="isPaid", jdbcType= JdbcType.INTEGER),
        @Result(column="is_patient_evaluated", property="isPatientEvaluated", jdbcType= JdbcType.INTEGER),
        @Result(column="cancel_type", property="cancelType", jdbcType= JdbcType.INTEGER),
        @Result(column="cancel_reason", property="cancelReason", jdbcType= JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType= JdbcType.VARCHAR)
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
          "note = #{note,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(AppOrder record);
    @Select({
            "select",
            "id, order_no, m_record_id, visit_person_id, inspect_start_date, inspect_end_date, phone_no, ",
            "inspect_check_city, inspect_check_cost, create_time, update_time, status, trans_doc_id, ",
            "trans_doc_name, trans_date, receive_doc_id, receive_doc_name, receive_date, ",
            "treatment_money, is_trans_free,is_receive_free,is_paid,note,cancel_type,cancel_reason",
            "from app_order",
            "where (trans_doc_id = #{docId,jdbcType=VARCHAR} or ",
            "receive_doc_id = #{docId,jdbcType=VARCHAR}) and ",
            "status = 1 "
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="order_no", property="orderNo", jdbcType= JdbcType.VARCHAR),
            @Result(column="m_record_id", property="mRecordId", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone_no", property="phoneNo", jdbcType= JdbcType.VARCHAR),
            @Result(column="visit_person_id", property="visitPersonId", jdbcType= JdbcType.VARCHAR),
            @Result(column="inspect_start_date", property="inspectStartDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="inspect_end_date", property="inspectEndDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="inspect_check_city", property="inspectCheckCity", jdbcType= JdbcType.VARCHAR),
            @Result(column="inspect_check_cost", property="inspectCheckCost", jdbcType= JdbcType.BIGINT),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="trans_doc_name", property="transDocName", jdbcType= JdbcType.VARCHAR),
            @Result(column="trans_date", property="transDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="receive_doc_name", property="receiveDocName", jdbcType= JdbcType.VARCHAR),
            @Result(column="receive_date", property="receiveDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="treatment_money", property="treatmentMoney", jdbcType= JdbcType.DECIMAL),
            @Result(column="is_trans_free", property="isTransFree", jdbcType= JdbcType.INTEGER),
            @Result(column="is_receive_free", property="isReceiveFree", jdbcType= JdbcType.INTEGER),
            @Result(column="is_paid", property="isPaid", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel_type", property="cancelType", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel_reason", property="cancelReason", jdbcType= JdbcType.VARCHAR),
            @Result(column="note", property="note", jdbcType= JdbcType.VARCHAR)
    })
    List<AppOrder> selectUnTransOrders(String docId);
    @Select({
            " SELECT ",
            " order_time, ",
            " appointment_count, ",
            " cancel_count, ",
            " CONCAT( ",
            "       ROUND( ",
            "               cancel_count / appointment_count * 100, ",
            "               2 ",
            "       ), ",
            "       '%' ",
            " ) fail_rate ",
            " FROM ",
            "       ( ",
            "               SELECT ",
            "               date_format(a.create_time, '%Y/%m/%d') order_time, ",
            "               count( ",
            "                       date_format(a.create_time, '%Y/%m/%d') ",
            "               ) appointment_count ",
            "               FROM ",
            "               app_order a ",
            "               GROUP BY ",
            "               order_time DESC ",
            "       ) a ",
            " LEFT JOIN ( ",
            " SELECT ",
            " date_format(a.create_time, '%Y/%m/%d') order_time_1, ",
            " count( ",
            "       date_format(a.create_time, '%Y/%m/%d') ",
            " ) cancel_count ",
            " FROM ",
            " app_order a ",
            " WHERE ",
            " a.STATUS = 9 ",
            " GROUP BY ",
            " order_time_1 DESC ",
            " ) b ON ( ",
            " a.order_time = b.order_time_1 ",
            " ) where order_time >= #{startTime,jdbcType=VARCHAR})",
            " and order_time <= #{endTime,jdbcType=VARCHAR})"
    })
    @Results({
            @Result(column="order_time", property="orderTime", jdbcType= JdbcType.VARCHAR),
            @Result(column="appointment_count", property="appointmentCount", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel_count", property="cancelCount", jdbcType= JdbcType.INTEGER),
            @Result(column="fail_rate", property="failRate", jdbcType= JdbcType.VARCHAR)
    })
    List<AppointmentTimeResultBean> selectAppointmentStat(AppointmentStatBean appointmentStatBean);

    @Select({
            "select",
            "id, order_no, m_record_id, visit_person_id, inspect_start_date, inspect_end_date, ",
            "inspect_check_city, inspect_check_cost, create_time, update_time, status, trans_doc_id, ",
            "trans_doc_name, trans_date, receive_doc_id, receive_doc_name, receive_date, phone_no, ",
            "treatment_money,note,cancel_type, cancel_reason, is_trans_free ,is_receive_free, is_paid,is_patient_evaluated ",
            "from app_order a",
            "where a. STATUS NOT IN (1) " ,
            "AND a.note IS NOT NULL" ,
            "and a.update_time >= #{startTime,jdbcType=VARCHAR})" ,
            "and a.update_time <= #{endTime,jdbcType=VARCHAR})"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="order_no", property="orderNo", jdbcType= JdbcType.VARCHAR),
            @Result(column="m_record_id", property="mRecordId", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone_no", property="phoneNo", jdbcType= JdbcType.VARCHAR),
            @Result(column="visit_person_id", property="visitPersonId", jdbcType= JdbcType.VARCHAR),
            @Result(column="inspect_start_date", property="inspectStartDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="inspect_end_date", property="inspectEndDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="inspect_check_city", property="inspectCheckCity", jdbcType= JdbcType.VARCHAR),
            @Result(column="inspect_check_cost", property="inspectCheckCost", jdbcType= JdbcType.BIGINT),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="trans_doc_name", property="transDocName", jdbcType= JdbcType.VARCHAR),
            @Result(column="trans_date", property="transDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="receive_doc_name", property="receiveDocName", jdbcType= JdbcType.VARCHAR),
            @Result(column="receive_date", property="receiveDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="treatment_money", property="treatmentMoney", jdbcType= JdbcType.DECIMAL),
            @Result(column="is_trans_free", property="isTransFree", jdbcType= JdbcType.INTEGER),
            @Result(column="is_receive_free", property="isReceiveFree", jdbcType= JdbcType.INTEGER),
            @Result(column="is_paid", property="isPaid", jdbcType= JdbcType.INTEGER),
            @Result(column="is_patient_evaluated", property="isPatientEvaluated", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel_type", property="cancelType", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel_reason", property="cancelReason", jdbcType= JdbcType.VARCHAR),
            @Result(column="note", property="note", jdbcType= JdbcType.VARCHAR)
    })
    List<AppOrder> selectByNoteConent(String startTime ,String endTime);
}