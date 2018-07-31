package com.whiteplanet.web.controller.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.web.Final;
import com.whiteplanet.web.entry.Account;
import com.whiteplanet.web.entry.JsonParam;
import com.whiteplanet.web.entry.SingleStringBean;
import com.whiteplanet.web.service.doctor.DoctorClinicCardService;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:wuzhiyuan
 * @description: 医生卡片信息
 * @date: Created in 13:44 2017/12/27
 * @modified By:
 */
@RestController
public class DoctorClinicCardController {
    /**
     * 主页信息服务接口
     */
    private DoctorClinicCardService doctorClinicCardService;

    /**
     * 自己主页信息
     * @param param {id:"用户id"}
     * @return
     */
    public ReturnResult doctorClinicCard(@RequestBody JsonParam<SingleStringBean> param) {

        return doctorClinicCardService.doctorClinicCard(param.getData());
    }
    /**
     * 他人诊所信息
     * @param param {id:"他人诊所id"}
     * @param account
     * @return
     */
    public ReturnResult otherDoctorClinicCard(@RequestBody JsonParam<SingleStringBean> param,
                                              @RequestAttribute(value = Final.ATTR_ACCOUNT) Account account) {
        return doctorClinicCardService.otherDoctorClinicCard(param.getData(),account);
    }
}
