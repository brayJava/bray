package com.whiteplanet.web.controller.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.web.Final;
import com.whiteplanet.web.entry.Account;
import com.whiteplanet.web.entry.JsonParam;
import com.whiteplanet.web.entry.SingleStringBean;
import com.whiteplanet.web.service.doctor.DoctorIllnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author:wuzhiyuan
 * @description: 医生擅长项目控制器
 * @date: Created in 9:59 2017/12/26
 * @modified By:
 */
@RestController
public class DoctorIllnessController extends BaseDoctorController {
    /**
     * 医生擅长项目业务接口
     */
    @Autowired
    private DoctorIllnessService doctorIllnessService;
    /**
     * 医生擅长项目
     * @param account
     * @return
     */
    public ReturnResult doctorIllness(@RequestAttribute(value = Final.ATTR_ACCOUNT)Account account) {
        return doctorIllnessService.doctorIllness(account);

    }
    /**
     * 添加擅长项目名称
     * @param param {id:"项目id"}
     * @param account
     * @return
     */
    public ReturnResult IllnessAdd(@RequestBody JsonParam<SingleStringBean> param,
                                   @RequestAttribute(value = Final.ATTR_ACCOUNT)Account account) {
        return doctorIllnessService.illnessAdd(param.getData(),account);
    }

    /**
     * 删除擅长的项目
     * @param param {id:"项目id"}
     * @param account
     * @return
     */
    public ReturnResult IllnessDelete(@RequestBody JsonParam<SingleStringBean> param,
                                      @RequestAttribute(value = Final.ATTR_ACCOUNT)Account account) {
        return doctorIllnessService.illnessDelete(param.getData(),account);
    }
}
