package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.DiagnosisReport;
import com.whiteplanet.mapper.model.DiagnosisReportExample;
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

public interface DiagnosisReportMapper {
    @SelectProvider(type=DiagnosisReportSqlProvider.class, method="countByExample")
    int countByExample(DiagnosisReportExample example);

    @DeleteProvider(type=DiagnosisReportSqlProvider.class, method="deleteByExample")
    int deleteByExample(DiagnosisReportExample example);

    @Delete({
        "delete from diagnosis_report",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into diagnosis_report (id, m_record_detail_id, ",
        "file_path, create_time, ",
        "status)",
        "values (#{id,jdbcType=VARCHAR}, #{mRecordDetailId,jdbcType=VARCHAR}, ",
        "#{filePath,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=INTEGER})"
    })
    int insert(DiagnosisReport record);

    @InsertProvider(type=DiagnosisReportSqlProvider.class, method="insertSelective")
    int insertSelective(DiagnosisReport record);

    @SelectProvider(type=DiagnosisReportSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="m_record_detail_id", property="mRecordDetailId", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_path", property="filePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    List<DiagnosisReport> selectByExample(DiagnosisReportExample example);

    @Select({
        "select",
        "id, m_record_detail_id, file_path, create_time, status",
        "from diagnosis_report",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="m_record_detail_id", property="mRecordDetailId", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_path", property="filePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    DiagnosisReport selectByPrimaryKey(String id);

    @UpdateProvider(type=DiagnosisReportSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") DiagnosisReport record, @Param("example") DiagnosisReportExample example);

    @UpdateProvider(type=DiagnosisReportSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") DiagnosisReport record, @Param("example") DiagnosisReportExample example);

    @UpdateProvider(type=DiagnosisReportSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DiagnosisReport record);

    @Update({
        "update diagnosis_report",
        "set m_record_detail_id = #{mRecordDetailId,jdbcType=VARCHAR},",
          "file_path = #{filePath,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DiagnosisReport record);
}