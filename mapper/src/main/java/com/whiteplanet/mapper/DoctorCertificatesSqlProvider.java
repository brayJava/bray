package com.whiteplanet.mapper;

import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * @author:wuzhiyuan
 * @description: 医生用户信息查询sql辅助类
 * @date: Created in 0:20 2017/12/2
 * @modified By:
 */
public class DoctorCertificatesSqlProvider {

    public String selectDortorCertificates(Map<String,Object> paramMap) {
        String doctorId = (String)paramMap.get("doctorId");
        String phone = (String)paramMap.get("phone");
        String realName =(String) paramMap.get("realName");
        String status = (String)paramMap.get("status");
        String hospitalName = (String)paramMap.get("hospitalName");
        String idcardNum = (String)paramMap.get("idcardNum");
        String licenseType = (String)paramMap.get("licenseType");
        String licenseCode = (String)paramMap.get("licenseCode");
        StringBuffer querySql = new StringBuffer();
        String sql =   "SELECT * FROM ( " +
                " SELECT "  +
                " d.id,"  +
                " department_id,"  +
                " hospital_id,"  +
                " CODE,"  +
                " department_function_id,"  +
                " phone,"  +
                " PASSWORD,"  +
                " real_name,"  +
                " sex,"  +
                " kinde,"  +
                " introduce,"  +
                " treatment,"  +
                " treatment_money,"  +
                " d.create_date,"  +
                " d.update_date,"  +
                " d.STATUS,"  +
                " faceimg,"  +
                " credits,"  +
                " age,"  +
                " source,"  +
                " department_name,"  +
                " department_function_name,"  +
                "  hospital_name,"  +
                " thumbs_up,"  +
                " cryptogram,"  +
                " step,"  +
                " is_first_login,"  +
                " identify_status,"  +
                " identify_remarks,"  +
                " MAX(c.update_date) AS upload_date"  +
                " from doctor d, certificates  c  "+
                " where d.id = c.doctor_id AND c.STATUS not in (-2) "+
                " GROUP BY d.id ) f LEFT JOIN certificates_detail cd on(f.id = cd.doctor_id and cd.status not in(-1)) ";
        querySql.append(sql);
        querySql.append("where 1= 1");
        if(!StringUtils.isEmpty(doctorId) && doctorId != "null")
            querySql.append(" and f.id = #{doctorId,jdbcType=VARCHAR} ");
        if(!StringUtils.isEmpty(phone) && phone != "null")
            querySql.append(" and f.phone = #{phone,jdbcType=VARCHAR} ");
        if("3".equals(status)) {
            querySql.append(" and f.identify_status in ('3','5')");
        } else if(!StringUtils.isEmpty(status) && status != "null" && !"5".equals(status) ) {
            querySql.append(" and f.identify_status = #{status,jdbcType=VARCHAR} ");
        } else {
            querySql.append(" and f.identify_status in ('1','4') ");
        }
        if(!StringUtils.isEmpty(hospitalName) && hospitalName != "null")
            querySql.append(" and f.hospital_name like CONCAT('%',#{hospitalName,jdbcType=VARCHAR},'%' ) ");
        if(!StringUtils.isEmpty(realName) && hospitalName != "null")
            querySql.append(" and f.real_name like CONCAT('%',#{realName,jdbcType=VARCHAR},'%' ) ");
        if(!StringUtils.isEmpty(idcardNum))
            querySql.append(" and idcard_num = #{idcardNum,jdbcType=VARCHAR}");
        if(!StringUtils.isEmpty(licenseType))
            querySql.append(" and license_type = #{licenseType,jdbcType=VARCHAR}");
        if(!StringUtils.isEmpty(licenseCode))
            querySql.append(" and license_code= #{licenseCode,jdbcType=VARCHAR}");
        querySql.append(" and f.upload_date >= #{startTime,jdbcType=VARCHAR} " );
        querySql.append(" and f.upload_date <= #{endTime,jdbcType=VARCHAR} " );
        querySql.append("  ORDER BY f.upload_date DESC");
        return querySql.toString();
    }
}
