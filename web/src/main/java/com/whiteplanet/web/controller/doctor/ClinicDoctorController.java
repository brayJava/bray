package com.whiteplanet.web.controller.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.web.Final;
import com.whiteplanet.web.entry.Account;
import com.whiteplanet.web.entry.JsonParam;
import com.whiteplanet.web.entry.SingleStringBean;
import com.whiteplanet.web.service.doctor.ClinicDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author:wuzhiyuan
 * @description: 医生诊所主页信息处理
 * @date: Created in 14:27 2017/12/20
 * @modified By:
 */
@RestController
public class ClinicDoctorController extends BaseDoctorController {
    @Autowired
    private ClinicDoctorService clinicDoctorService;
    /**
     *  初始化诊所主页
     * @param account
     * @return
     */
    @PostMapping("/clinic")
    public ReturnResult myClinic(@RequestAttribute(value = Final.ATTR_ACCOUNT) Account account) {
        return clinicDoctorService.initializeInfoFromMyClinic(account);
    }
    /**
     * 修改医生诊所名称
     * @param param
     * @param account
     * @return
     */
    @PostMapping("/clinic-name")
    public ReturnResult updateClinicName(@RequestBody JsonParam<SingleStringBean> param,
                                               @RequestAttribute Account account) {
        return clinicDoctorService.UpdateClinicName(param.getData(),account);
    }

    /**
     * 修改诊所理念
     * @param param
     * @param account
     * @return
     */
    @PostMapping("/clinic-note")
    public ReturnResult updateClinicNote(@RequestBody JsonParam<SingleStringBean> param,
                                         @RequestAttribute Account account){
        return clinicDoctorService.updateClinicNote(param.getData(),account);
    }

    /**
     *  修改诊所营业状态
     * @param account
     * @return
     */
    @PostMapping("/clinic-status")
    public ReturnResult updateClinicStatus (@RequestAttribute Account account) {
        return clinicDoctorService.updateClinicStatus(account);
    }

    /**
     * 诊所详情信息
     * @param account
     * @return
     */
    @PostMapping("/clinic-info")
    public ReturnResult clinicDetails(@RequestAttribute(Final.ATTR_ACCOUNT) Account account) {

        return clinicDoctorService.clinicDetails(account);
    }
}
