package com.whiteplanet.web.entry.doctor;

import com.whiteplanet.mapper.model.Clinic;
import com.whiteplanet.mapper.model.Doctor;

import java.util.Objects;

/**
 * @author:wuzhiyuan
 * @description: 医生详情数据
 * @date: Created in 15:15 2017/12/25
 * @modified By:
 */
public class DoctorDetailBean {
     /**
      * 用户id
      */
     private String id;
     /**
      *  医生姓名
      */
     private String name;
     /**
      * 是否存在诊所
      */
     private boolean hasClinic;
     /**
      * 部门id
      */
     private String departmentId;
     /**
      * 部门名称
      */
     private String departmentName;
     /**
      * 部门编码
      */
     private String departmentCode;
     /**
      * 医院id
      */
     private String hospitalId;
     /**
      * 医院名称
      */
     private String hospitalName;
     /**
      * 功能科室id
      */
     private String departmentFunctionId;
     /**
      * 功能科室名称
      */
     private String departmentFunctionName;
     /**
      * 图像
      */
     private String faceimage;
     /**
      * 医生电话
      */
     private String phone;
     /**
      * 医生性别
      */
     private boolean sex;

     public DoctorDetailBean() {
     }
     public DoctorDetailBean(Doctor doctor, Clinic clinic,String departmentCode) {
          this.id = doctor.getId();
          this.name = doctor.getRealName();
          this.hasClinic = Objects.isNull(clinic) ? false : true;
          this.departmentId = doctor.getDepartmentId();
          this.departmentName = doctor.getDepartmentName();
          this.departmentCode = Objects.isNull(departmentCode) ? "" :departmentCode;
          this.hospitalId = doctor.getHospitalId();
          this.hospitalName = doctor.getHospitalName();
          this.departmentFunctionId = doctor.getDepartmentFunctionId();
          this.departmentFunctionName = doctor.getDepartmentFunctionName();
          this.faceimage = doctor.getFaceimg();
          this.phone = doctor.getPhone();
          this.sex = doctor.getSex();
     }
     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public boolean isHasClinic() {
          return hasClinic;
     }

     public void setHasClinic(boolean hasClinic) {
          this.hasClinic = hasClinic;
     }

     public String getDepartmentId() {
          return departmentId;
     }

     public void setDepartmentId(String departmentId) {
          this.departmentId = departmentId;
     }

     public String getDepartmentName() {
          return departmentName;
     }

     public void setDepartmentName(String departmentName) {
          this.departmentName = departmentName;
     }

     public String getDepartmentCode() {
          return departmentCode;
     }

     public void setDepartmentCode(String departmentCode) {
          this.departmentCode = departmentCode;
     }

     public String getHospitalId() {
          return hospitalId;
     }

     public void setHospitalId(String hospitalId) {
          this.hospitalId = hospitalId;
     }

     public String getHospitalName() {
          return hospitalName;
     }

     public void setHospitalName(String hospitalName) {
          this.hospitalName = hospitalName;
     }

     public String getDepartmentFunctionId() {
          return departmentFunctionId;
     }

     public void setDepartmentFunctionId(String departmentFunctionId) {
          this.departmentFunctionId = departmentFunctionId;
     }

     public String getDepartmentFunctionName() {
          return departmentFunctionName;
     }

     public void setDepartmentFunctionName(String departmentFunctionName) {
          this.departmentFunctionName = departmentFunctionName;
     }

     public String getFaceimage() {
          return faceimage;
     }

     public void setFaceimage(String faceimage) {
          this.faceimage = faceimage;
     }

     public String getPhone() {
          return phone;
     }

     public void setPhone(String phone) {
          this.phone = phone;
     }

     public boolean isSex() {
          return sex;
     }

     public void setSex(boolean sex) {
          this.sex = sex;
     }

     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }
}
