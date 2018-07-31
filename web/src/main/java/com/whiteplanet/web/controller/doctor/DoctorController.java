package com.whiteplanet.web.controller.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.web.Final;
import com.whiteplanet.web.entry.*;
import com.whiteplanet.web.entry.doctor.DoctorClinicImageBean;
import com.whiteplanet.web.service.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author:wuzhiyuan
 * @description: 医生个人信息控制器
 * @date: Created in 10:23 2017/12/25
 * @modified By:
 */
@RestController
public class DoctorController extends BaseDoctorController {

    @Autowired
    private DoctorService doctorService;

    /**
     * 医生个人简介
     * @param account
     * @return
     */
    @PostMapping("/introduction")
    public ReturnResult introduction(@RequestAttribute Account account) {
        return doctorService.introduction(account);
    }
    /**
     * 医生个人简介修改
     * @param param
     * @param account
     * @return
     */
    @PostMapping("/introduction-save")
    public ReturnResult introductionSave(@RequestBody JsonParam<SingleStringBean> param,
                                         @RequestAttribute Account account) {
        return doctorService.introductionSave(param.getData(),account);
    }
    /**
     * 医生个人风采照片上传
     * @param param
     * @param account
     * @return
     */
    @PostMapping("/doctor-image-upload")
    public ReturnResult doctorImageUpload(@RequestBody JsonParam<DoctorClinicImageBean> param,
                                          Account account) {
        return doctorService.doctorImageUpload(param.getData(),account);
    }
    /**
     * 查看个人风采照片
     * @param account
     * @return
     */
    @PostMapping("/doctor-image")
    public ReturnResult showDoctorImage(@RequestAttribute(value = Final.ATTR_ACCOUNT) Account account) {
        return doctorService.showDoctorImage(account);
    }
    /**
     * 医生详情
     * @param account
     * @return
     */
    @PostMapping("/info")
    public ReturnResult doctorDetail(@RequestAttribute(value = Final.ATTR_ACCOUNT) Account account) {
        return doctorService.doctorDetail(account);
    }
    /**
     * 保存医生详细信息
     * @param param
     * @param account
     * @return
     */
    @PostMapping("/info-save")
    public ReturnResult doctorInfoSave(@RequestBody JsonParam<DoctorInfoVo> param,
                                       @RequestAttribute(value = Final.ATTR_ACCOUNT) Account account) {
        return doctorService.doctorInfoSave(param.getData(),account);
    }


}
