package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.WxApplyRecord;
import com.whiteplanet.mapper.model.WxApplyRecordExample;
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
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="docId", property="docid", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="apply_type", property="applyType", jdbcType=JdbcType.INTEGER),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<WxApplyRecord> selectByExample(WxApplyRecordExample example);

    @Select({
        "select",
        "id, docId, phone, apply_type, create_date",
        "from wx_apply_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="docId", property="docid", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="apply_type", property="applyType", jdbcType=JdbcType.INTEGER),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP)
    })
    WxApplyRecord selectByPrimaryKey(Integer id);

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
}