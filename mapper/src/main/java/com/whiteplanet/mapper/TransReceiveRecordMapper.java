package com.whiteplanet.mapper;


import com.whiteplanet.mapper.data.*;
import com.whiteplanet.mapper.model.TransReceiveRecord;
import com.whiteplanet.mapper.model.TransReceiveRecordExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface TransReceiveRecordMapper {
    @SelectProvider(type=TransReceiveRecordSqlProvider.class, method="countByExample")
    int countByExample(TransReceiveRecordExample example);

    @DeleteProvider(type=TransReceiveRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(TransReceiveRecordExample example);

    @Delete({
        "delete from trans_receive_record",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into trans_receive_record (id, trans_doc_id, ",
        "receive_doc_id, order_id, ",
        "status, describe_reason, ",
        "opration_date, is_free)",
        "values (#{id,jdbcType=VARCHAR}, #{transDocId,jdbcType=VARCHAR}, ",
        "#{receiveDocId,jdbcType=VARCHAR}, #{orderId,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER}, #{describeReason,jdbcType=VARCHAR}, ",
        "#{oprationDate,jdbcType=TIMESTAMP}, #{isFree,jdbcType=INTEGER})"
    })
    int insert(TransReceiveRecord record);

    @InsertProvider(type=TransReceiveRecordSqlProvider.class, method="insertSelective")
    int insertSelective(TransReceiveRecord record);

    @SelectProvider(type=TransReceiveRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
        @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="describe_reason", property="describeReason", jdbcType= JdbcType.VARCHAR),
        @Result(column="opration_date", property="oprationDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="is_free", property="isFree", jdbcType= JdbcType.INTEGER)
    })
    List<TransReceiveRecord> selectByExample(TransReceiveRecordExample example);

    @Select({
        "select",
        "id, trans_doc_id, receive_doc_id, order_id, status, describe_reason, opration_date, ",
        "is_free",
        "from trans_receive_record",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
        @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="describe_reason", property="describeReason", jdbcType= JdbcType.VARCHAR),
            @Result(column="cancel_reason", property="describeReason", jdbcType= JdbcType.VARCHAR),
        @Result(column="opration_date", property="oprationDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="del_flag", property="delFlag", jdbcType= JdbcType.INTEGER),
        @Result(column="is_free", property="isFree", jdbcType= JdbcType.INTEGER)
    })
    TransReceiveRecord selectByPrimaryKey(String id);
    /**
     *  查询拒绝接诊原因
     * @param startTime
     * @param endTime
     * @return
     */
    @Select({
            "select",
            "id, trans_doc_id, receive_doc_id, order_id, status, describe_reason, opration_date, ",
            "is_free",
            "from trans_receive_record",
            "where status = '7' " ,
            "and opration_date >= #{startTime,jdbcType=VARCHAR}" ,
            "and opration_date <= #{endTime,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="describe_reason", property="describeReason", jdbcType= JdbcType.VARCHAR),
            @Result(column="cancel_reason", property="describeReason", jdbcType= JdbcType.VARCHAR),
            @Result(column="opration_date", property="oprationDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="del_flag", property="delFlag", jdbcType= JdbcType.INTEGER),
            @Result(column="is_free", property="isFree", jdbcType= JdbcType.INTEGER)
    })
    TransReceiveRecord selectRefusedReason(String startTime , String endTime);

    @UpdateProvider(type=TransReceiveRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TransReceiveRecord record, @Param("example") TransReceiveRecordExample example);

    @UpdateProvider(type=TransReceiveRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TransReceiveRecord record, @Param("example") TransReceiveRecordExample example);

    @UpdateProvider(type=TransReceiveRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TransReceiveRecord record);

    @Update({
        "update trans_receive_record",
        "set trans_doc_id = #{transDocId,jdbcType=VARCHAR},",
          "receive_doc_id = #{receiveDocId,jdbcType=VARCHAR},",
          "order_id = #{orderId,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "describe_reason = #{describeReason,jdbcType=VARCHAR},",
          "opration_date = #{oprationDate,jdbcType=TIMESTAMP},",
          "is_free = #{isFree,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TransReceiveRecord record);

    @Select({
            "select ",
            "id, trans_doc_id, receive_doc_id, order_id, status, describe_reason, opration_date, ",
            "is_free ,cancel_reason  ",
            "from trans_receive_record ",
            "where order_id = #{orderId,jdbcType=VARCHAR} ",
            "and del_flag = 0 "
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="describe_reason", property="describeReason", jdbcType= JdbcType.VARCHAR),
            @Result(column="cancel_reason", property="cancelReason", jdbcType= JdbcType.VARCHAR),
            @Result(column="opration_date", property="oprationDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="is_free", property="isFree", jdbcType= JdbcType.INTEGER)
    })
    List<TransReceiveRecord> selectByOrderId(String orderId);

    /**
     * 全部撤销转诊 销毁转诊记录
     * @param orderId
     * @return
     */
    @Update({
            "update trans_receive_record",
            "set del_flag = 1 ",
            "where order_id = #{orderId,jdbcType=VARCHAR}"
    })
    int delTransRecord(String orderId);

    /**
     * 单个撤销转诊
     * @param orderId
     * @return
     */
    @Update({
            "update trans_receive_record ",
            "set status = 8, ",
            " cancel_reason = #{note,jdbcType=VARCHAR} ",
            "where order_id = #{orderId,jdbcType=VARCHAR} ",
            "and receive_doc_id = #{docId,jdbcType=VARCHAR} "
    })
    int cancelSingleTransRecord(@Param("orderId") String orderId, @Param("docId") String docId,
                                @Param("note") String note);

    /**
     * 接诊
     * @param orderId
     * @param docId
     * @return
     */
    @Update({
            "update trans_receive_record",
            "set status = 3",
            "where order_id = #{orderId,jdbcType=VARCHAR} ",
            "and receive_doc_id = #{docId,jdbcType=VARCHAR}"
    })
    int receiveOrder(@Param("orderId") String orderId, @Param("docId") String docId);


    /**
     * 取消其他人接诊
     * @param orderId
     * @param docId
     * @return
     */
    @Update({
            "update trans_receive_record",
            "set status = 9 , cancel_type = #{cancelType,jdbcType=INTEGER}",
            "where order_id = #{orderId,jdbcType=VARCHAR} ",
            "and receive_doc_id <> #{docId,jdbcType=VARCHAR} ",
            "and status = 2"
    })
    int cancelOtherOrder(@Param("orderId") String orderId, @Param("docId") String docId, @Param("cancelType") Integer cancelType);

    /**
     * 根据接诊人取消订单
     * @param orderId
     * @param docId
     * @return
     */
    @Update({
            "update trans_receive_record",
            "set status = 9 , cancel_type = #{cancelType,jdbcType=INTEGER} , ",
            "cancel_reason = #{cancelReason,jdbcType=VARCHAR}",
            "where order_id = #{orderId,jdbcType=VARCHAR} ",
            "and receive_doc_id = #{docId,jdbcType=VARCHAR}"
    })
    int cancelReceivedOrder(@Param("orderId") String orderId, @Param("docId") String docId,
                            @Param("cancelType") Integer cancelType, @Param("cancelReason") String cancelReason);

    /**
     * 根据id取消订单
     * @param id
     * @param cancelType
     * @return
     */
    @Update({
            "update trans_receive_record",
            "set status = 9 , cancel_type = #{cancelType,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=VARCHAR} "
    })
    int cancelReceivedOrderById(@Param("id") String id, @Param("cancelType") Integer cancelType);
    /**
     * 取消所有订单
     * @param orderId
     * @return
     */
    @Update({
            "update trans_receive_record",
            "set status = 9 , cancel_type = #{cancelType,jdbcType=INTEGER}",
            "where order_id = #{orderId,jdbcType=VARCHAR} "
    })
    int cancelAllOrder(@Param("orderId") String orderId, @Param("cancelType") Integer cancelType);

    /**
     * 查询订单被拒绝数
     */
    @Select({
            "select count(0)",
            "from trans_receive_record",
            "where order_id = #{orderId,jdbcType=VARCHAR}",
            "and status = 3"
    })
    int selectDisabledOrdersCount(String orderId);

    /**
     * 根据订单id 订单状态 查询订单数
     */
    @Select({
            "select count(0)",
            "from trans_receive_record",
            "where order_id = #{orderId,jdbcType=VARCHAR}",
            "and status = #{status,jdbcType=INTEGER} "
    })
    int selectCountByOrderIdAndStatus(@Param("orderId") String orderId, @Param("status") Integer status);

    /**
     * 查询订单取消数
     */
    @Select({
            "select count(0)",
            "from trans_receive_record",
            "where order_id = #{orderId,jdbcType=VARCHAR}",
            "and status = 9"
    })
    int selectCancelOrdersCount(String orderId);

    /**
     * 查询订单所有被转记录数
     */
    @Select({
            "select count(0)",
            "from trans_receive_record",
            "where order_id = #{orderId,jdbcType=VARCHAR}"
    })
    int selectAllOrdersCount(String orderId);

    /**
     * 拒绝接诊
     * @param orderId
     * @param docId
     * @return
     */
    @Update({
            "update trans_receive_record",
            "set status = 7",
            "where order_id = #{orderId,jdbcType=VARCHAR},",
            "and receive_doc_id = #{docId,jdbcType=VARCHAR}"
    })
    int refuseOrder(@Param("orderId") String orderId, @Param("docId") String docId);

    @Select({
            "select ",
            "id, trans_doc_id, receive_doc_id, order_id, status,cancel_type, describe_reason,cancel_reason, opration_date, ",
            "is_free ",
            "from trans_receive_record ",
            "where order_id = #{orderId,jdbcType=VARCHAR}",
            "and receive_doc_id = #{docId,jdbcType=VARCHAR} ",
            "order by opration_date desc limit 0,1"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="describe_reason", property="describeReason", jdbcType= JdbcType.VARCHAR),
            @Result(column="cancel_type", property="cancelType", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel_reason", property="cancelReason", jdbcType= JdbcType.VARCHAR),
            @Result(column="opration_date", property="oprationDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="del_flag", property="delFlag", jdbcType= JdbcType.INTEGER),
            @Result(column="is_free", property="isFree", jdbcType= JdbcType.INTEGER)
    })
    TransReceiveRecord selectByReceiveAndOrderId(@Param("orderId") String orderId, @Param("docId") String docId);

    /**
     * 根据订单查询待付款记录
     * @param orderId
     * @return
     */
    @Select({
            "select ",
            "id, trans_doc_id, receive_doc_id, order_id, status, describe_reason,cancel_reason, opration_date, ",
            "is_free ",
            "from trans_receive_record ",
            "where order_id = #{orderId,jdbcType=VARCHAR}",
            "and status = 3 ",
            "and del_flag = 0 "
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="describe_reason", property="describeReason", jdbcType= JdbcType.VARCHAR),
            @Result(column="cancel_reason", property="cancelReason", jdbcType= JdbcType.VARCHAR),
            @Result(column="opration_date", property="oprationDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="del_flag", property="delFlag", jdbcType= JdbcType.INTEGER),
            @Result(column="is_free", property="isFree", jdbcType= JdbcType.INTEGER)
    })
    TransReceiveRecord selectUnPayRecord(@Param("orderId") String orderId);
    @Results({
            @Result(column="department_name", property="departmentName", jdbcType= JdbcType.VARCHAR),
            @Result(column="appointment_count", property="appointmentCount", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel_count", property="cancelCount", jdbcType= JdbcType.INTEGER)
    })
    @Select({
            " SELECT "  ,
            " department_name, "  ,
            " appointment_count, " ,
            " cancel_count " ,
            " FROM " ,
            "( " ,
                " SELECT " ,
                " d.department_name department_name, " ,
                " count(d.department_name) appointment_count " ,
                " FROM " ,
                " trans_receive_record tr " ,
                " LEFT JOIN doctor d ON (tr.receive_doc_id = d.id) " ,
                " WHERE ",
                " d.department_name IS NOT NULL " ,
                " AND d.source like '%#{source, jdbcType=VARCHAR}%' ",
                " AND d.department_name like '%#{departmentName, jdbcType=VARCHAR}%' ",
                " AND date_format(d.update_date, '%Y/%m/%d') >= #{startTime, jdbcType=VARCHAR} ",
                " AND date_format(d.update_date, '%Y/%m/%d') <= #{endTime, jdbcType=VARCHAR} ",
                " GROUP BY ",
                " d.department_name" ,
            " ) a ",
            " LEFT JOIN ( " ,
            " SELECT " ,
            " d.department_name department_name_1, " ,
            " count(d.department_name) cancel_count ",
            " FROM ",
            " trans_receive_record tr " ,
            " LEFT JOIN doctor d ON (tr.receive_doc_id = d.id) " ,
            " WHERE " ,
            " d.department_name IS NOT NULL ",
            " AND tr.STATUS = 9 ",
            " AND d.source like '%#{source, jdbcType=VARCHAR}%' ",
            " AND d.department_name like '%#{departmentName, jdbcType=VARCHAR}%' ",
            " AND date_format(tr.update_date, '%Y/%m/%d') >= #{startTime, jdbcType=VARCHAR} ",
            " AND date_format(tr.update_date, '%Y/%m/%d') <= #{endTime, jdbcType=VARCHAR} " ,
            " GROUP BY ",
            " d.department_name" ,
    " ) b ON ( " ,
            " a.department_name = b.department_name_1 " ,
    " ) "
    })
    List<AppointmentResultBean> selectAppointmentStat(AppointmentStatBean appointmentStatBean);

    @Results({
            @Result(column="department_name", property="departmentName", jdbcType= JdbcType.VARCHAR),
            @Result(column="trans_count", property="transCount", jdbcType= JdbcType.INTEGER),
            @Result(column="receive_count", property="receiveCount", jdbcType= JdbcType.INTEGER),
            @Result(column="success_rate", property="successRate", jdbcType= JdbcType.VARCHAR)
    })
    @Select({
            " SELECT " ,
            " department_name, " ,
            " trans_count, " ,
            " receive_count, " ,
            " CONCAT(ROUND(receive_count/tran_count * 100 ,2),'%') success_rate " ,
            " FROM " ,
                     "( " ,
                           " SELECT " ,
                            " d.department_name, " ,
                            " count(*) tran_count " ,
            " FROM " ,
            " trans_receive_record t " ,
            " LEFT JOIN doctor d ON (t.trans_doc_id = d.id) " ,
            " d.department_name IS NOT NULL ",
            " AND tr.STATUS = 9 ",
            " AND d.source like '%#{source, jdbcType=VARCHAR}%' ",
            " AND d.department_name like '%#{departmentName, jdbcType=VARCHAR}%' ",
            " AND date_format(tr.update_date, '%Y/%m/%d') >= #{startTime, jdbcType=VARCHAR} ",
            " AND date_format(tr.update_date, '%Y/%m/%d') <= #{endTime, jdbcType=VARCHAR} " ,
            " GROUP BY " ,
            " d.department_name " ,
            " ) a " ,
            " LEFT JOIN ( " ,
                    " SELECT " ,
                            " d.department_name department_name_1, " ,
                    " count(*) receive_count " ,
            " FROM " ,
            " app_order ao " ,
            " LEFT JOIN doctor d ON (ao.receive_doc_id = d.id) " ,
            " where department_name is not NULL " ,
            " and receive_doc_id is not null " ,
            " AND d.source like '%#{source, jdbcType=VARCHAR}%' ",
            " AND d.department_name like '%#{departmentName, jdbcType=VARCHAR}%' ",
            " AND date_format(ao.update_date, '%Y/%m/%d') >= #{startTime, jdbcType=VARCHAR} ",
            " AND date_format(ao.update_date, '%Y/%m/%d') <= #{endTime, jdbcType=VARCHAR} " ,
            " GROUP BY " ,
            " d.department_name " ,
        " ) b ON ( " ,
                    " a.department_name = b.department_name_1 ",
            " ) "
        })
    List<TransStatBean> selectTransferStat(AppointmentStatBean appointmentStatBean);

    @Select({
            " SELECT " ,
            " department_name, " ,
            " receive_count, " ,
            " success_receive_count, " ,
            " CONCAT(ROUND(success_count/receive_count * 100 ,2),'%') success_rate " ,
            " FROM " ,
            " ( " ,
            " SELECT " ,
            " d.department_name, " ,
            " count(*) success_receive_count " ,
            " FROM " ,
            " app_order ao " ,
            " LEFT JOIN doctor d ON (ao.receive_doc_id = d.id) " ,
            " where department_name is not NULL" ,
            " and receive_doc_id is not null " ,
            " AND d.source like '%#{source, jdbcType=VARCHAR}%' ",
            " AND d.department_name like '%#{departmentName, jdbcType=VARCHAR}%' ",
            " AND date_format(ao.update_date, '%Y/%m/%d') >= #{startTime, jdbcType=VARCHAR} ",
            " AND date_format(ao.update_date, '%Y/%m/%d') <= #{endTime, jdbcType=VARCHAR} " ,
            " GROUP BY " ,
            " d.department_name " ,
            " ) a " ,
            " LEFT JOIN ( " ,
                    " SELECT " ,
                            " d.department_name department_name_1, " ,
                    " count(*) success_count " ,
            " FROM " ,
            " app_order ao "  ,
            " LEFT JOIN doctor d ON (ao.receive_doc_id = d.id) " ,
            " where department_name is not NULL " ,
            " and receive_doc_id is not null " ,
            " and ao.status  = 7 " ,
            " AND d.source like '%#{source, jdbcType=VARCHAR}%' " ,
            " AND d.department_name like '%#{departmentName, jdbcType=VARCHAR}%' " ,
            " AND date_format(ao.update_date, '%Y/%m/%d') >= #{startTime, jdbcType=VARCHAR} " ,
            " AND date_format(ao.update_date, '%Y/%m/%d') <= #{endTime, jdbcType=VARCHAR} "  ,
            " GROUP BY " ,
            " d.department_name " ,
            " ) b ON ( " ,
                    " a.department_name = b.department_name_1 " ,
            " ) "

        })
    List<ReceiveResultBean> selectReceviceStat(AppointmentStatBean appointmentStatBean);

    /**
     * 转诊成功统计
     * @param startTime
     * @param endTime
     * @return
     */
    @Select({
            " SELECT " ,
            " total_time, " ,
            " tans_count, " ,
            " receive_count, ",
            " CONCAT( " ,
            " ROUND( " ,
                    " receive_count / tans_count * 100, " ,
                    " 2 " ,
            " ), " ,
            " '%' " ,
            " ) success_rate " ,
            " FROM " ,
            " ( " ,
                   "  SELECT " ,
                    " date_format(t.opration_date, '%Y/%m/%d') total_time,  " ,
                    " count( " ,
                            " date_format(t.opration_date, '%Y/%m/%d') " ,
                    " ) tans_count " ,
                    " FROM " ,
                    " trans_receive_record t " ,
                    " GROUP BY " ,
                    " total_time DESC " ,
            ") a " ,
            " LEFT JOIN ( " ,
            "  SELECT " ,
            " date_format(a.update_time, '%Y/%m/%d') total_time_1, " ,
            " count( " ,
                    " date_format(a.update_time, '%Y/%m/%d') " ,
            " ) receive_count ",
            " FROM " ,
            " app_order a " ,
            " WHERE " ,
            " a.receive_doc_id IS NOT NULL " ,
            " GROUP BY " ,
            " total_time_1 DESC " ,
    " ) b ON ( " ,
            " a.total_time = b.total_time_1 " ,
    ") where total_time >= #{startTime, jdbcType=VARCHAR} " ,
            "and total_time <= #{endTime, jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="total_time", property="totalTime", jdbcType= JdbcType.VARCHAR),
            @Result(column="trans_count", property="transCount", jdbcType= JdbcType.INTEGER),
            @Result(column="receive_count", property="receiveCount", jdbcType= JdbcType.INTEGER),
            @Result(column="success_rate", property="successRate", jdbcType= JdbcType.VARCHAR)
    })
    List<TransferStatTimeBean> selectTransferStatGroupByTime(String startTime,String endTime);
    @Select({

            " SELECT " ,
            " total_time, " ,
            " receive_count, " ,
            " receive_success_count, " ,
            " CONCAT( " ,
            " ROUND( " ,
                    " receive_count / receive_success_count * 100, " ,
                    " 2 " ,
            " ), " ,
            " '%' " ,
            " ) success_rate " ,
            " FROM " ,
            " ( " ,
                   " SELECT " ,
                    " date_format(a.update_time, '%Y/%m/%d') total_time, " ,
                    " count( " ,
                            " date_format(a.update_time, '%Y/%m/%d') " ,
                    " ) receive_count " ,
                    " FROM " ,
                    " app_order a " ,
                    " WHERE " ,
                    " a.receive_doc_id IS NOT NULL " ,
                    " GROUP BY " ,
                    " total_time DESC " ,
            " ) a " ,
            " LEFT JOIN ( " ,
            " SELECT " ,
            " date_format(a.update_time, '%Y/%m/%d') total_time_1, " ,
            " count( ",
                    " date_format(a.update_time, '%Y/%m/%d') " ,
            " ) receive_success_count " ,
            " FROM " ,
            " app_order a " ,
            " WHERE " ,
            " a.receive_doc_id IS NOT NULL " ,
            " and a.status = 7 " ,
            " GROUP BY " ,
            " total_time_1 DESC " ,
    " ) b ON ( " ,
            " a.total_time = b.total_time_1 ",
    " ) where total_time >= #{startTime, jdbcType=VARCHAR} " ,
            "and total_time <= #{endTime, jdbcType=VARCHAR}"
    })
    List<ReceiveStatTimeBean> selectReceiveStatGroupByTime(String startTime,String endTime);
}