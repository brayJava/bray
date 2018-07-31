package com.whiteplanet.web.controller.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.web.entry.JsonParam;
import com.whiteplanet.web.entry.SingleStringBean;
import com.whiteplanet.web.interceptor.Token;
import com.whiteplanet.web.service.doctor.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: HeWei
 * @Description:  职称相关 (重构点:命名规范化，新增职称只能通过管理后台配置，用户不能新增)
 * @Date: Created in 14:47 2017
 * @Modified By:
 */
@RestController
public class DepartmentController extends BaseDoctorController{
    //todo
    @Resource
    private DepartmentService departmentService;

    @Token(false)
    @RequestMapping(value = "/department", method = RequestMethod.POST)
    public ReturnResult search(@RequestBody JsonParam<SingleStringBean> param){
        return departmentService.findByCode(param.getData());
    }

}
