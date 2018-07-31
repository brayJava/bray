package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.TransReceiveRecord;
import com.whiteplanet.mapper.model.TransReceiveRecordExample;
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
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trans_doc_id", property="transDocId", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_doc_id", property="receiveDocId", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="describe_reason", property="describeReason", jdbcType=JdbcType.VARCHAR),
        @Result(column="opration_date", property="oprationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_free", property="isFree", jdbcType=JdbcType.INTEGER)
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
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trans_doc_id", property="transDocId", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_doc_id", property="receiveDocId", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="describe_reason", property="describeReason", jdbcType=JdbcType.VARCHAR),
        @Result(column="opration_date", property="oprationDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_free", property="isFree", jdbcType=JdbcType.INTEGER)
    })
    TransReceiveRecord selectByPrimaryKey(String id);

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
}