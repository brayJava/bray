package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.ReceiveDetail;
import com.whiteplanet.mapper.model.ReceiveDetailExample;
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
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trans_doc_id", property="transDocId", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_doc_id", property="receiveDocId", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_date", property="startDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="outpatient_type", property="outpatientType", jdbcType=JdbcType.INTEGER),
        @Result(column="outpatient_name", property="outpatientName", jdbcType=JdbcType.VARCHAR),
        @Result(column="hospital_name", property="hospitalName", jdbcType=JdbcType.VARCHAR),
        @Result(column="hospital_addr", property="hospitalAddr", jdbcType=JdbcType.VARCHAR),
        @Result(column="hospital_addr_detail", property="hospitalAddrDetail", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_free", property="isFree", jdbcType=JdbcType.INTEGER)
    })
    List<ReceiveDetail> selectByExample(ReceiveDetailExample example);

    @Select({
        "select",
        "id, trans_doc_id, receive_doc_id, order_id, start_date, end_date, outpatient_type, ",
        "outpatient_name, hospital_name, hospital_addr, hospital_addr_detail, is_free",
        "from receive_detail",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trans_doc_id", property="transDocId", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_doc_id", property="receiveDocId", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_date", property="startDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="outpatient_type", property="outpatientType", jdbcType=JdbcType.INTEGER),
        @Result(column="outpatient_name", property="outpatientName", jdbcType=JdbcType.VARCHAR),
        @Result(column="hospital_name", property="hospitalName", jdbcType=JdbcType.VARCHAR),
        @Result(column="hospital_addr", property="hospitalAddr", jdbcType=JdbcType.VARCHAR),
        @Result(column="hospital_addr_detail", property="hospitalAddrDetail", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_free", property="isFree", jdbcType=JdbcType.INTEGER)
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
}