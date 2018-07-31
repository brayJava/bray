package com.whiteplanet.web.controller.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.web.Final;
import com.whiteplanet.web.controller.BaseController;
import com.whiteplanet.web.entry.Account;
import com.whiteplanet.web.entry.GlobalPageVo;
import com.whiteplanet.web.entry.JsonParam;
import com.whiteplanet.web.entry.SingleStringBean;
import com.whiteplanet.web.interceptor.Token;
import com.whiteplanet.web.service.doctor.DepartmentFunctionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: HeWei
 * @Description: 科室相关
 * @Date: Created in 17:43 2017
 * @Modified By:
 */
@RestController
public class DepartmentFunctionController extends BaseController{
    @Resource
    private DepartmentFunctionService departmentFunctionService;

    /**
     * 查询科室
     * @param param
     * @return
     */
    @Token(false)
    @RequestMapping(value = "/department-function", method = RequestMethod.POST)
    public ReturnResult search(@RequestBody JsonParam<GlobalPageVo> param){
        return departmentFunctionService.searchDepartmentFun(param.getData());
    }

    /**
     * 新增科室
     * @param param
     * @param account
     * @return
     */
    @RequestMapping(value = "/put-department-function", method = RequestMethod.POST)
    public ReturnResult putDepFun(@RequestBody JsonParam<SingleStringBean> param ,
                        @RequestAttribute(value = Final.ATTR_ACCOUNT) Account account){
        return departmentFunctionService.addDepartmentFun(param.getData(),account.getPhone());
    }
}
