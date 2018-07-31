package com.whiteplanet.mapper;

import com.whiteplanet.mapper.data.ReceiveCountBean;
import com.whiteplanet.mapper.model.ReceiveDetail;
import com.whiteplanet.mapper.model.ReceiveDetailExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import java.util.List;

public interface ReceiveDetailMapper {
    @SelectProvider(type=ReceiveDetailSqlProvider.class, method="countByExample")
    int countByExample(ReceiveDetailExample example);

    @DeleteProvider(type=ReceiveDetailSqlProvider.class, method="deleteByExample")
    int deleteByExample(ReceiveDetailExample example);

    @Delete({
        "delete from receive_detail",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into receive_detail (id, trans_doc_id, ",
        "receive_doc_id, order_id, ",
        "start_date, end_date, ",
        "outpatient_type, outpatient_name, ",
        "hospital_name, hospital_addr, ",
        "hospital_addr_detail, is_free)",
        "values (#{id,jdbcType=VARCHAR}, #{transDocId,jdbcType=VARCHAR}, ",
        "#{receiveDocId,jdbcType=VARCHAR}, #{orderId,jdbcType=VARCHAR}, ",
        "#{startDate,jdbcType=TIMESTAMP}, #{endDate,jdbcType=TIMESTAMP}, ",
        "#{outpatientType,jdbcType=INTEGER}, #{outpatientName,jdbcType=VARCHAR}, ",
        "#{hospitalName,jdbcType=VARCHAR}, #{hospitalAddr,jdbcType=VARCHAR}, ",
        "#{hospitalAddrDetail,jdbcType=VARCHAR}, #{isFree,jdbcType=INTEGER})"
    })
    int insert(ReceiveDetail record);

    @InsertProvider(type=ReceiveDetailSqlProvider.class, method="insertSelective")
    int insertSelective(ReceiveDetail record);

    @SelectProvider(type=ReceiveDetailSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
        @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="start_date", property="startDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="end_date", property="endDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="outpatient_type", property="outpatientType", jdbcType= JdbcType.INTEGER),
        @Result(column="outpatient_name", property="outpatientName", jdbcType= JdbcType.VARCHAR),
        @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
        @Result(column="hospital_addr", property="hospitalAddr", jdbcType= JdbcType.VARCHAR),
        @Result(column="hospital_addr_detail", property="hospitalAddrDetail", jdbcType= JdbcType.VARCHAR),
        @Result(column="is_free", property="isFree", jdbcType= JdbcType.INTEGER)
    })
    List<ReceiveDetail> selectByExample(ReceiveDetailExample example);

    @Select({
        "select",
        "id, trans_doc_id, receive_doc_id, order_id, start_date, end_date, outpatient_type, ",
        "outpatient_name, hospital_name, hospital_addr, hospital_addr_detail, is_free ,create_date",
        "from receive_detail",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
        @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="start_date", property="startDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="end_date", property="endDate", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="outpatient_type", property="outpatientType", jdbcType= JdbcType.INTEGER),
        @Result(column="outpatient_name", property="outpatientName", jdbcType= JdbcType.VARCHAR),
        @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
        @Result(column="hospital_addr", property="hospitalAddr", jdbcType= JdbcType.VARCHAR),
        @Result(column="hospital_addr_detail", property="hospitalAddrDetail", jdbcType= JdbcType.VARCHAR),
        @Result(column="is_free", property="isFree", jdbcType= JdbcType.INTEGER)
    })
    ReceiveDetail selectByPrimaryKey(String id);

    @UpdateProvider(type=ReceiveDetailSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ReceiveDetail record, @Param("example") ReceiveDetailExample example);

    @UpdateProvider(type=ReceiveDetailSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ReceiveDetail record, @Param("example") ReceiveDetailExample example);

    @UpdateProvider(type=ReceiveDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ReceiveDetail record);

    @Update({
        "update receive_detail",
        "set trans_doc_id = #{transDocId,jdbcType=VARCHAR},",
          "receive_doc_id = #{receiveDocId,jdbcType=VARCHAR},",
          "order_id = #{orderId,jdbcType=VARCHAR},",
          "start_date = #{startDate,jdbcType=TIMESTAMP},",
          "end_date = #{endDate,jdbcType=TIMESTAMP},",
          "outpatient_type = #{outpatientType,jdbcType=INTEGER},",
          "outpatient_name = #{outpatientName,jdbcType=VARCHAR},",
          "hospital_name = #{hospitalName,jdbcType=VARCHAR},",
          "hospital_addr = #{hospitalAddr,jdbcType=VARCHAR},",
          "hospital_addr_detail = #{hospitalAddrDetail,jdbcType=VARCHAR},",
          "is_free = #{isFree,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ReceiveDetail record);

    @Select({
            "select",
            "id, trans_doc_id, receive_doc_id,date_type, order_id, start_date, end_date, outpatient_type, ",
            "outpatient_name, hospital_name, hospital_addr, hospital_addr_detail, is_free ,create_date",
            "from receive_detail",
            "where receive_doc_id = #{docId,jdbcType=VARCHAR} ",
            "and start_date > DATE_SUB(curdate(),INTERVAL -1 DAY)"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="date_type", property="dateType", jdbcType= JdbcType.INTEGER),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="start_date", property="startDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="end_date", property="endDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="outpatient_type", property="outpatientType", jdbcType= JdbcType.INTEGER),
            @Result(column="outpatient_name", property="outpatientName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_addr", property="hospitalAddr", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_addr_detail", property="hospitalAddrDetail", jdbcType= JdbcType.VARCHAR),
            @Result(column="is_free", property="isFree", jdbcType= JdbcType.INTEGER)
    })
    List<ReceiveDetail> selectUncheckByDocId(String docId);


    @Select({
            "select",
            "id, trans_doc_id, receive_doc_id,date_type, order_id, start_date, end_date, outpatient_type, ",
            "outpatient_name, hospital_name, hospital_addr, hospital_addr_detail, is_free , create_date",
            "from receive_detail",
            "where order_id = #{orderId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="date_type", property="dateType", jdbcType= JdbcType.INTEGER),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="start_date", property="startDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="end_date", property="endDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="outpatient_type", property="outpatientType", jdbcType= JdbcType.INTEGER),
            @Result(column="outpatient_name", property="outpatientName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_addr", property="hospitalAddr", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_addr_detail", property="hospitalAddrDetail", jdbcType= JdbcType.VARCHAR),
            @Result(column="is_free", property="isFree", jdbcType= JdbcType.INTEGER)
    })
    ReceiveDetail selectByOrderId(String orderId);

    /**
     * 约诊日程-我的接诊
     * @param date
     * @param docId
     * @return
     */
    @Select({
            "select",
            "id, trans_doc_id, receive_doc_id,date_type, order_id, start_date, end_date, outpatient_type, ",
            "outpatient_name, hospital_name, hospital_addr, hospital_addr_detail, is_free,create_date",
            "from receive_detail",
            "where 1=1 ",
            "and start_date > #{date,jdbcType=VARCHAR} ",
            "and start_date < DATE_SUB(#{date,jdbcType=VARCHAR},INTERVAL -1 DAY) ",
            "and receive_doc_id = #{docId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="date_type", property="dateType", jdbcType= JdbcType.INTEGER),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="start_date", property="startDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="end_date", property="endDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="outpatient_type", property="outpatientType", jdbcType= JdbcType.INTEGER),
            @Result(column="outpatient_name", property="outpatientName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_addr", property="hospitalAddr", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="hospital_addr_detail", property="hospitalAddrDetail", jdbcType= JdbcType.VARCHAR),
            @Result(column="is_free", property="isFree", jdbcType= JdbcType.INTEGER)
    })
    List<ReceiveDetail> selectReceiveDetailsByDate(@Param("date") java.util.Date date, @Param("docId") String docId);


    /**
     * 约诊日程-我的转诊
     * @param date
     * @param docId
     * @return
     */
    @Select({
            "select",
            "id, trans_doc_id, receive_doc_id,date_type, order_id, start_date, end_date, outpatient_type, ",
            "outpatient_name, hospital_name, hospital_addr, hospital_addr_detail, is_free ,create_date",
            "from receive_detail",
            "where 1=1 ",
            "and start_date > #{date,jdbcType=VARCHAR} ",
            "and start_date < DATE_SUB(#{date,jdbcType=VARCHAR},INTERVAL -1 DAY) ",
            "and trans_doc_id = #{docId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="trans_doc_id", property="transDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="date_type", property="dateType", jdbcType= JdbcType.INTEGER),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="start_date", property="startDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="end_date", property="endDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="outpatient_type", property="outpatientType", jdbcType= JdbcType.INTEGER),
            @Result(column="outpatient_name", property="outpatientName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_addr", property="hospitalAddr", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_addr_detail", property="hospitalAddrDetail", jdbcType= JdbcType.VARCHAR),
            @Result(column="is_free", property="isFree", jdbcType= JdbcType.INTEGER)
    })
    List<ReceiveDetail> selectTransDetailsByDate(@Param("date") java.util.Date date, @Param("docId") String docId);


    /**
     * 根据日期查询约诊记录数
     * @param startDate
     * @param endDate
     * @param docId
     * @return
     */
    @Select({
            "select",
            "DATE_FORMAT(t.start_date,'%Y%m%d') as time ",
            "FROM receive_detail t ",
            "where 1=1 ",
            "and start_date > #{startDate,jdbcType=VARCHAR} ",
            "and start_date < #{endDate,jdbcType=VARCHAR} ",
            "and (trans_doc_id = #{docId,jdbcType=VARCHAR} or receive_doc_id = #{docId,jdbcType=VARCHAR}) ",
            " GROUP BY  time  "
    })
    List<String> selectMyDateCount(@Param("startDate") java.util.Date startDate, @Param("endDate") java.util.Date endDate, @Param("docId") String docId);


    /**
     * 根据日期查询转诊数
     * @param date
     * @param docId
     * @return
     */
    @Select({
            "select count(0)",
            "FROM receive_detail t ",
            "where 1=1 ",
            "and DATE_FORMAT(t.start_date, '%Y%m%d') = #{date,jdbcType=VARCHAR} ",
            "and trans_doc_id = #{docId,jdbcType=VARCHAR} ",
    })
    Integer selectTransDateCount(@Param("date") String date, @Param("docId") String docId);

    /**
     * 根据日期查询接诊数
     * @param date
     * @param docId
     * @return
     */
    @Select({
            "select count(0)",
            "FROM receive_detail t ",
            "where 1=1 ",
            "and DATE_FORMAT(t.start_date, '%Y%m%d') = #{date,jdbcType=VARCHAR} ",
            "and receive_doc_id = #{docId,jdbcType=VARCHAR} ",
    })
    Integer selectReceiveDateCount(@Param("date") String date, @Param("docId") String docId);

    /**
     * 接诊医生每天接诊量
     */
    @Select({
        " SELECT " ,
        " temp.*, d.real_name " ,
        " FROM " ,
        " ( " ,
        " SELECT " ,
        " t.receive_doc_id, " ,
        " count(receive_doc_id) receive_count " ,
        " FROM " ,
        " ( " ,
        " SELECT " ,
        " r.receive_doc_id " ,
        " FROM " ,
        " receive_detail r " ,
        " LEFT JOIN app_order a ON (r.order_id = a.id) " ,
        " WHERE " ,
        " a. STATUS NOT IN (9) " ,
        " and start_date >= #{startDate,jdbcType=VARCHAR} " ,
        " and start_date <= #{endDate,jdbcType=VARCHAR} " ,
         ") t    " ,
        " GROUP BY " ,
        " t.receive_doc_id " ,
	    " ) temp " ,
        " LEFT JOIN doctor d ON (temp.receive_doc_id = d.id) " ,
    })
    @Results({
            @Result(column="receive_doc_id", property="receiveDocId", jdbcType= JdbcType.VARCHAR),
            @Result(column="receive_count", property="receiveCount", jdbcType= JdbcType.INTEGER),
            @Result(column="real_name", property="realName", jdbcType= JdbcType.VARCHAR)
    })
    List<ReceiveCountBean> selectReceiveCountById(@Param("startDate") String startDate, @Param("endDate") String endDate);
    /**
     * 查询接诊医生接诊订单患者名字
     */
    @Select({
            " SELECT " ,
            " DISTINCT nickname FROM( " ,
            " SELECT " ,
            " visit_person_id " ,
            " FROM " ,
            " receive_detail rd " ,
            " LEFT JOIN app_order a ON (rd.order_id = a.id) " ,
            " where rd.receive_doc_id = #{reveiveDocId,jdbcType=VARCHAR} " ,
            " and rd.start_date >= #{startDate,jdbcType=VARCHAR} ",
            " and rd.start_date <= #{endDate,jdbcType=VARCHAR} " ,
            " and a.status not in(9) ",
            " ) temp " ,
            " LEFT JOIN visit_person vp ON (temp.visit_person_id = vp.id) "
    })
    List<String> selectPatientNameByReveiveDocId(@Param("reveiveDocId") String reveiveDocId,@Param("startDate") String startDate, @Param("endDate") String endDate);
}