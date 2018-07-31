package com.whiteplanet.web.entry.doctor;

import com.whiteplanet.mapper.data.DepartmentFunctionDoctorBean;
import com.whiteplanet.mapper.data.DoctorPartnerBean;

import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 合伙人相关信息
 * @date: Created in 17:23 2017/12/28
 * @modified By:
 */
public class PartnerBean {
    /**
     *  其他用户合伙人科室信息
     */
    private List<DepartmentFunctionDoctorBean> departmentFunctionDoctorBeans;
    /**
     *  其他用户最新加入的合伙人信息
     */
    private List<DoctorPartnerBean> doctorPartnerBeans;

    public List<DepartmentFunctionDoctorBean> getDepartmentFunctionDoctorBeans() {
        return departmentFunctionDoctorBeans;
    }

    public void setDepartmentFunctionDoctorBeans(List<DepartmentFunctionDoctorBean> departmentFunctionDoctorBeans) {
        this.departmentFunctionDoctorBeans = departmentFunctionDoctorBeans;
    }

    public List<DoctorPartnerBean> getDoctorPartnerBeans() {
        return doctorPartnerBeans;
    }

    public void setDoctorPartnerBeans(List<DoctorPartnerBean> doctorPartnerBeans) {
        this.doctorPartnerBeans = doctorPartnerBeans;
    }
}
