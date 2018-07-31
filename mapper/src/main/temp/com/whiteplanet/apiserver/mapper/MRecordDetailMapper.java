package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.MRecordDetail;
import com.whiteplanet.mapper.model.MRecordDetailExample;
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

public interface MRecordDetailMapper {
    @SelectProvider(type=MRecordDetailSqlProvider.class, method="countByExample")
    int countByExample(MRecordDetailExample example);

    @DeleteProvider(type=MRecordDetailSqlProvider.class, method="deleteByExample")
    int deleteByExample(MRecordDetailExample example);

    @Delete({
        "delete from m_record_detail",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into m_record_detail (id, m_record_id, ",
        "illness_describe, status, ",
        "create_time, update_time)",
        "values (#{id,jdbcType=VARCHAR}, #{mRecordId,jdbcType=VARCHAR}, ",
        "#{illnessDescribe,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(MRecordDetail record);

    @InsertProvider(type=MRecordDetailSqlProvider.class, method="insertSelective")
    int insertSelective(MRecordDetail record);

    @SelectProvider(type=MRecordDetailSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="m_record_id", property="mRecordId", jdbcType=JdbcType.VARCHAR),
        @Result(column="illness_describe", property="illnessDescribe", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MRecordDetail> selectByExample(MRecordDetailExample example);

    @Select({
        "select",
        "id, m_record_id, illness_describe, status, create_time, update_time",
        "from m_record_detail",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="m_record_id", property="mRecordId", jdbcType=JdbcType.VARCHAR),
        @Result(column="illness_describe", property="illnessDescribe", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    MRecordDetail selectByPrimaryKey(String id);

    @UpdateProvider(type=MRecordDetailSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MRecordDetail record, @Param("example") MRecordDetailExample example);

    @UpdateProvider(type=MRecordDetailSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MRecordDetail record, @Param("example") MRecordDetailExample example);

    @UpdateProvider(type=MRecordDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MRecordDetail record);

    @Update({
        "update m_record_detail",
        "set m_record_id = #{mRecordId,jdbcType=VARCHAR},",
          "illness_describe = #{illnessDescribe,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(MRecordDetail record);
}