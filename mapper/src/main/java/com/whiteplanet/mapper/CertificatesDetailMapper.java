package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.CertificatesDetail;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 证件细节接口mapper
 * @date: Created in 17:45 2017/12/4
 * @modified By:
 */
public interface CertificatesDetailMapper {

    @Delete({
            "delete from certificates_detail",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into certificates_detail (id,doctor_id,",
            "idcard_num,license_type,license_code",
            "status)",
            "values (#{id,jdbcType=VARCHAR}, #{doctor_id,jdbcType=VARCHAR}, ",
            "#{idcard_num,jdbcType=VARCHAR}, #{license_type,jdbcType=VARCHAR}, ",
            "#{license_code,jdbcType=VARCHAR},#{status,jdbcType=INTEGER})"
    })
    int insert(CertificatesDetail record);

    @InsertProvider(type=CertificatesDetailSqlProvider.class, method="insertSelective")
    int insertSelective(CertificatesDetail record);

    @Select({
            "select",
            "id,doctor_id,",
            "idcard_num,license_type,license_code,status",
            "from certificates_detail where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="idcard_num", property="idcardNum", jdbcType= JdbcType.VARCHAR),
            @Result(column="license_type", property="licenseType", jdbcType= JdbcType.VARCHAR),
            @Result(column="license_code", property="licenseCode", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    CertificatesDetail selectByPrimaryKey(String id);
    @Select({
            "select",
            "id,doctor_id,",
            "idcard_num,license_type,license_code,status",
            "from certificates_detail where doctor_id = #{doctorId,jdbcType=VARCHAR} and status not in(-1)"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="idcard_num", property="idcardNum", jdbcType= JdbcType.VARCHAR),
            @Result(column="license_type", property="licenseType", jdbcType= JdbcType.VARCHAR),
            @Result(column="license_code", property="licenseCode", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    List<CertificatesDetail> selectByDoctorId(@Param("doctorId") String doctorId);
    @UpdateProvider(type=CertificatesDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CertificatesDetail record);

    @Update({
            "update certificates_detail",
            "set doctor_id = #{doctorId,jdbcType=VARCHAR},",
            "idcard_num = #{idcardNum,jdbcType=VARCHAR},",
            "license_type = #{licenseType,jdbcType=VARCHAR},",
            "license_code = #{licenseCode,jdbcType=VARCHAR}",
            "status = #{status,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(CertificatesDetail record);
    @Update({
            "update certificates_detail",
            "set ",
            "status = -1 ",
            "where doctor_id = #{doctorId, jdbcType=VARCHAR}"
    })
    int updateStatusByDoctorId(
            @Param("doctorId") String doctorId);

}
