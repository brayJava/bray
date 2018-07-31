package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Certificates;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface CertificatesMapper {
    @Delete({
            "delete from certificates",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into certificates (id, doctor_id, ",
            "pub_file_id, type, ",
            "status, create_date, ",
            "update_date)",
            "values (#{id,jdbcType=VARCHAR}, #{doctorId,jdbcType=VARCHAR}, ",
            "#{pubFileId,jdbcType=VARCHAR}, #{type,jdbcType=VARCHAR}, ",
            "#{status,jdbcType=INTEGER}, #{createDate,jdbcType=TIMESTAMP}, ",
            "#{updateDate,jdbcType=TIMESTAMP})"
    })
    int insert(Certificates record);

    @InsertProvider(type=CertificatesSqlProvider.class, method="insertSelective")
    int insertSelective(Certificates record);

    @Select({
            "select",
            "id, doctor_id, pub_file_id, type, status, create_date, update_date",
            "from certificates",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pub_file_id", property="pubFileId", jdbcType= JdbcType.VARCHAR),
            @Result(column="type", property="type", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    Certificates selectByPrimaryKey(String id);

    @UpdateProvider(type=CertificatesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Certificates record);

    @Update({
            "update certificates",
            "set doctor_id = #{doctorId,jdbcType=VARCHAR},",
            "pub_file_id = #{pubFileId,jdbcType=VARCHAR},",
            "type = #{type,jdbcType=VARCHAR},",
            "status = #{status,jdbcType=INTEGER},",
            "create_date = #{createDate,jdbcType=TIMESTAMP},",
            "update_date = #{updateDate,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Certificates record);

    /**
     * 丢弃上次上传的数据
     *
     * @param doctorId
     * @param type
     * @return
     */
    @Update({
            "update certificates",
            "set",
            "status = #{status,jdbcType=VARCHAR},",
            "update_date = now()",
            "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and type = #{type, jdbcType = VARCHAR}",
    })
    int updateByUploadDelete(
            @Param("doctorId") String doctorId,
            @Param("type") String type);
    /**
     * 审核不通过修改状态
     *
     * @param doctorId
     * @return
     */
    @Update({
            "update certificates",
            "set",
            "status = -1 ",
            "where doctor_id = #{doctorId, jdbcType=VARCHAR}"
    })
    int updateByUpdateAuditStatus(
            @Param("doctorId") String doctorId);
    @Select({
            "select",
            "count(1)",
            "from certificates",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and type like CONCAT(#{type,jdbcType=VARCHAR},'%' )",
            "and status = 0"
    })
    int selectByDoctorIdAndTypeEnable(
            @Param("doctorId") String doctorId,
            @Param("type") String type
    );

    @Update({
            "update certificates set status =1",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and type like CONCAT(#{type,jdbcType=VARCHAR},'%' )",
            "and status = 0"
    })
    int updateByUploadEnable(@Param("doctorId") String doctorId,
                             @Param("type") String type);

    @Select({
            "select",
            "id, doctor_id, pub_file_id, type, status, create_date, update_date",
            "from certificates",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and type like CONCAT(#{type,jdbcType=VARCHAR},'%' )",
            "and status >= -1"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pub_file_id", property="pubFileId", jdbcType= JdbcType.VARCHAR),
            @Result(column="type", property="type", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    List<Certificates> selectByDoctorIdAndType(
            @Param("doctorId") String doctorId,
            @Param("type") String type
    );

    @Select({
            "select",
            "id, doctor_id, pub_file_id, type, status, create_date, update_date",
            "from certificates",
            "where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and status = #{status,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pub_file_id", property="pubFileId", jdbcType= JdbcType.VARCHAR),
            @Result(column="type", property="type", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    List<Certificates> selectByDoctorIdAndStatus(@Param("doctorId") String doctorId,@Param("status") Integer status);
    @Select({
            " SELECT " ,
            " id, " ,
            " doctor_id, " ,
            " pub_file_id, " ,
            " a.type, " ,
            " STATUS, " ,
            " create_date," ,
            " update_date " ,
            " FROM " ,
                    " ( " ,
                           " SELECT " ,
                            " max(update_date) max_date, " ,
                            " type " ,
                            " FROM " ,
                            " certificates " ,
                            " where STATUS NOT IN (- 2) " +
                            " and doctor_id = #{doctorId,jdbcType=VARCHAR}" ,
                            " GROUP BY " ,
                            " type " ,
                    " ) b " ,
            " LEFT JOIN ( " ,
            " SELECT " ,
            " id, " ,
            " doctor_id, " ,
            " pub_file_id, " ,
            " type, " ,
            " STATUS, " ,
            " create_date, " ,
            " update_date " ,
            " FROM ",
            " certificates " ,
            " WHERE " ,
            " STATUS NOT IN (- 2) " ,
    " ) a ON (a.update_date = b.max_date) "
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pub_file_id", property="pubFileId", jdbcType= JdbcType.VARCHAR),
            @Result(column="type", property="type", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    List<Certificates> selectByDoctorId(@Param("doctorId") String doctorId);
}