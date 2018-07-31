package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.CertificatesDetail;
import org.apache.ibatis.jdbc.SQL;
/**
 * @author:wuzhiyuan
 * @description:
 * @date: Created in 18:02 2017/12/4
 * @modified By:
 */
public class CertificatesDetailSqlProvider {

    public String insertSelective(CertificatesDetail record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("certificates_detail");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }

        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getIdcardNum() != null) {
            sql.VALUES("idcard_num", "#{idcardNum,jdbcType=VARCHAR}");
        }

        if (record.getLicenseType() != null) {
            sql.VALUES("license_type", "#{licenseType,jdbcType=VARCHAR}");
        }

        if (record.getStatus() != null) {
            sql.VALUES("license_code", "#{licenseCode,jdbcType=VARCHAR}");
        }
        if (record.getStatus() != null) {
            sql.VALUES("status","#{status,jdbcType=INTEGER}");
        }
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CertificatesDetail record) {
        SQL sql = new SQL();
        sql.UPDATE("certificates_detail");

        if (record.getDoctorId() != null) {
            sql.SET("doctor_id", "#{doctorId,jdbcType=VARCHAR}");
        }

        if (record.getIdcardNum() != null) {
            sql.SET("idcard_num", "#{idcardNum,jdbcType=VARCHAR}");
        }

        if (record.getLicenseType() != null) {
            sql.SET("license_type", "#{licenseType,jdbcType=VARCHAR}");
        }
        if (record.getLicenseCode() != null) {
            sql.SET("license_code", "#{licenseCode,jdbcType=VARCHAR}");
        }
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }

        sql.WHERE("id = #{id,jdbcType=VARCHAR}");

        return sql.toString();
    }

}
