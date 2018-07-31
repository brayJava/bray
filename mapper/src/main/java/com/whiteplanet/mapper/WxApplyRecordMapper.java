package com.whiteplanet.mapper;


import com.whiteplanet.mapper.model.WxApplyRecord;
import com.whiteplanet.mapper.model.WxApplyRecordExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface WxApplyRecordMapper {
    @SelectProvider(type=WxApplyRecordSqlProvider.class, method="countByExample")
    int countByExample(WxApplyRecordExample example);

    @DeleteProvider(type=WxApplyRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(WxApplyRecordExample example);

    @Delete({
        "delete from wx_apply_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into wx_apply_record (id, docId, ",
        "phone, apply_type, ",
        "create_date)",
        "values (#{id,jdbcType=INTEGER}, #{docid,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=VARCHAR}, #{applyType,jdbcType=INTEGER}, ",
        "#{createDate,jdbcType=TIMESTAMP})"
    })
    int insert(WxApplyRecord record);

    @InsertProvider(type=WxApplyRecordSqlProvider.class, method="insertSelective")
    int insertSelective(WxApplyRecord record);

    @SelectProvider(type=WxApplyRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="docId", property="docid", jdbcType= JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
        @Result(column="apply_type", property="applyType", jdbcType= JdbcType.INTEGER),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    List<WxApplyRecord> selectByExample(WxApplyRecordExample example);

    @Select({
        "select",
        "id, docId, phone, apply_type, create_date",
        "from wx_apply_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="docId", property="docid", jdbcType= JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
        @Result(column="apply_type", property="applyType", jdbcType= JdbcType.INTEGER),
        @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    WxApplyRecord selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, docId, phone, apply_type, create_date",
            "FROM wx_apply_record w",
            "where phone = #{phone,jdbcType=VARCHAR} LIMIT 1"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="docId", property="docid", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="apply_type", property="applyType", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP)
    })
    WxApplyRecord selectByPhone(String phone);

    @UpdateProvider(type=WxApplyRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") WxApplyRecord record, @Param("example") WxApplyRecordExample example);

    @UpdateProvider(type=WxApplyRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") WxApplyRecord record, @Param("example") WxApplyRecordExample example);

    @UpdateProvider(type=WxApplyRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(WxApplyRecord record);

    @Update({
        "update wx_apply_record",
        "set docId = #{docid,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "apply_type = #{applyType,jdbcType=INTEGER},",
          "create_date = #{createDate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(WxApplyRecord record);
    @Select({
            " SELECT " ,
            " count(*)" ,
            " FROM " ,
            " wx_apply_record " ,
            " WHERE " ,
            " phone IS NOT NULL " ,
            " AND date_format(create_date, '%Y/%m/%d') = #{time,jdbcType=VARCHAR} ",
    })
    int selectInvocationRegisterCount(String time);
}