package com.whiteplanet.mapper;

import com.whiteplanet.mapper.data.DoctorCertificatesBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import java.util.List;
/**
 * @author:wuzhiyuan
 * @description: 医生用户和证件映射接口
 * @date: Created in 23:49 2017/12/1
 * @modified By:
 */
public interface DoctorCertificatesMapper {
//    @Select({
//            "select * form (",
//            "select",
//            "id, department_id, hospital_id, code, department_function_id, phone, password, ",
//            "real_name, sex, kinde, introduce, treatment, treatment_money, create_date, update_date, ",
//            "status, faceimg, credits, age, source, department_name, department_function_name, ",
//            "hospital_name, thumbs_up, cryptogram, step,is_first_login,identify_status,identify_remarks ",
//            ",MAX(c.create_date) as upload_date",
//            "from doctor d, certificates c",
//            "where d.id = c.doctor_id AND c.STATUS = '1' ",
//            "GROUP BY d.id ) f ORDER BY f.upload_date desc"
//    })
    @SelectProvider(type = DoctorCertificatesSqlProvider.class,method = "selectDortorCertificates")
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="department_id", property="departmentId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_id", property="departmentFunctionId", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="password", property="password", jdbcType= JdbcType.VARCHAR),
            @Result(column="real_name", property="realName", jdbcType= JdbcType.VARCHAR),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="kinde", property="kinde", jdbcType= JdbcType.VARCHAR),
            @Result(column="introduce", property="introduce", jdbcType= JdbcType.VARCHAR),
            @Result(column="treatment", property="treatment", jdbcType= JdbcType.BIT),
            @Result(column="treatment_money", property="treatmentMoney", jdbcType= JdbcType.DECIMAL),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="faceimg", property="faceimg", jdbcType= JdbcType.VARCHAR),
            @Result(column="credits", property="credits", jdbcType= JdbcType.DECIMAL),
            @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
            @Result(column="source", property="source", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_name", property="departmentName", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_name", property="departmentFunctionName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="thumbs_up", property="thumbsUp", jdbcType= JdbcType.INTEGER),
            @Result(column="cryptogram", property="cryptogram", jdbcType= JdbcType.VARCHAR),
            @Result(column="step", property="step", jdbcType= JdbcType.INTEGER),
            @Result(column="is_first_login", property="firstLogin", jdbcType=JdbcType.INTEGER),
            @Result(column="identify_status", property="identifyStatus", jdbcType=JdbcType.INTEGER),
            @Result(column="identify_remarks", property="identifyRemarks", jdbcType=JdbcType.VARCHAR),
            @Result(column="upload_date", property="uploadDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="idcard_num", property="idcardNum", jdbcType=JdbcType.VARCHAR),
            @Result(column="license_type", property="licenseType", jdbcType=JdbcType.VARCHAR),
            @Result(column="license_code", property="licenseCode", jdbcType=JdbcType.VARCHAR)
    })
    List<DoctorCertificatesBean> selectDortorCertificates(@Param("doctorId") String doctorId,
                                                          @Param("phone") String phone,
                                                          @Param("realName") String realName,
                                                          @Param("hospitalName") String hospitalName,
                                                          @Param("status") String status,
                                                          @Param("startTime") String startTime,
                                                          @Param("endTime") String endTime,
                                                          @Param("idcardNum") String idcardNum,
                                                          @Param("licenseType") String licenseType,
                                                          @Param("licenseCode") String licenseCode);
}
