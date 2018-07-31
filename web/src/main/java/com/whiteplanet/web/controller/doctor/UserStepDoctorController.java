package com.whiteplanet.web.controller.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.web.Final;
import com.whiteplanet.web.entry.Account;
import com.whiteplanet.web.entry.CertificatesVo;
import com.whiteplanet.web.entry.DoctorInfoVo;
import com.whiteplanet.web.entry.JsonParam;
import com.whiteplanet.web.interceptor.Token;
import com.whiteplanet.web.service.doctor.CertificatesService;
import com.whiteplanet.web.service.doctor.DoctorProfileService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: HeWei
 * @Description: 第一次登录引导页面
 * @Date: Created in 11:51 2017
 * @Modified By:
 */
@RestController
public class UserStepDoctorController extends BaseDoctorController{

    @Resource
    private DoctorProfileService doctorInfoService;
    @Resource
    private CertificatesService certificatesService;

    /**
     * 第一步 提交医生信息
     * @param param
     * @return
     */
    @Token(false)
    @RequestMapping(value = "/put-info", method = RequestMethod.POST)
    public ReturnResult putDoctor(@RequestBody JsonParam<DoctorInfoVo> param,
                                  @RequestAttribute(value = Final.ATTR_ACCOUNT) Account account){
        return doctorInfoService.addDoctorInfo(param.getData());
    }

    @Token(false)
    @RequestMapping(value = "/certificates-all", method = RequestMethod.POST)
    public ReturnResult certificatesAll(@RequestBody JsonParam<CertificatesVo> param,
                                  @RequestAttribute(value = Final.ATTR_ACCOUNT) Account account){
        return certificatesService.certificatesAll(param.getData(),account);
    }
}
