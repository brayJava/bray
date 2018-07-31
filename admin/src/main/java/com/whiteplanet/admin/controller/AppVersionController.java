package com.whiteplanet.admin.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.whiteplanet.admin.dto.AppVersionBean;
import com.whiteplanet.admin.dto.Constant;
import com.whiteplanet.admin.service.impl.AppVersionServiceImpl;
import com.whiteplanet.admin.util.PageUtil;
import com.whiteplanet.mapper.data.AppVersionWithCont;
import com.whiteplanet.mapper.data.AppVersionWithContent;
import com.whiteplanet.mapper.model.PhoneCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/version")
@Controller
public class AppVersionController extends BaseController{

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AppVersionServiceImpl appVersionServiceImpl;
    /**
     * 查询最新版本号
     * @return
     */
    @PostMapping("/version-add")
    @ResponseBody
    public String versionAdd(AppVersionBean appVersionBean,Model model) {
        appVersionServiceImpl.addAppVersionWithContent(appVersionBean);
        return JSON.toJSONString(model);
    }
    /**
     * 查询最新版本号
     * @return
     */
    @RequestMapping("/newest-version")
    @PostMapping
    @ResponseBody
    public AppVersionWithContent queryNewestAppVersion() {
        return appVersionServiceImpl.selectNewestAppVersion();
    }
    /**
     * 查询所有版本号
     * @return
     */
    @RequestMapping("/get-all")
    public String queryAppVersions(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                                     @RequestParam(value = "pageSize",defaultValue = "5") int pageSize, Model model) {
        queryVersionMethod(pageNum, pageSize, model);
        return "version/app-version";
    }
    /**
     * 查询所有版本号(分页)
     * @return
     */
    @RequestMapping("/get-page")
    public String queryAppVersionsByPage(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                   @RequestParam(value = "pageSize",defaultValue = "5") int pageSize, Model model) {
        queryVersionMethod(pageNum, pageSize, model);
        return "version/layoutTab";
    }
    /**
     * 删除版本
     * @param versionID
     * @return
     */
    @PostMapping("/delete")
    @ResponseBody
    public String delAppVersion(int versionID) {
        appVersionServiceImpl.delAppVersion(versionID);
        return "OK";
    }
    private void queryVersionMethod(int pageNum, int pageSize, Model model) {
        PageInfo<AppVersionWithCont> appVersionWithContPageInfo = appVersionServiceImpl.selectAppversion(pageNum, pageSize);
        model.addAttribute(Constant.PAGEINFO_DTO, PageUtil.pageInfoHandle(appVersionWithContPageInfo));
        model.addAttribute(Constant.APP_VERSION_DTOS,appVersionWithContPageInfo.getList());
        model.addAttribute(Constant.ADMIN_USER,getSession().getAttribute(Constant.ADMIN_USER));
    }

    /**
     * 查询所有版本号
     * @return
     */
    @RequestMapping("/sms")
    public String queryNewestSms(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                       @RequestParam(value = "pageSize",defaultValue = "5") int pageSize, Model model) {
        PageInfo<PhoneCode> phoneCodePageInfo = appVersionServiceImpl.selectNewestSms(pageNum, pageSize);
        model.addAttribute(Constant.PAGEINFO_DTO,PageUtil.pageInfoHandle(phoneCodePageInfo));
        model.addAttribute(Constant.APP_SMS_DTOS,phoneCodePageInfo.getList());
        model.addAttribute(Constant.ADMIN_USER,getSession().getAttribute(Constant.ADMIN_USER));
        return "sms/sms";
    }
    /**
     * 查询所有版本号
     * @return
     */
    @RequestMapping("/sms-page")
    public String queryNewestSmsByPage(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                       @RequestParam(value = "pageSize",defaultValue = "5") int pageSize, Model model) {
        PageInfo<PhoneCode> phoneCodePageInfo = appVersionServiceImpl.selectNewestSms(pageNum, pageSize);
        model.addAttribute(Constant.PAGEINFO_DTO,PageUtil.pageInfoHandle(phoneCodePageInfo));
        model.addAttribute(Constant.APP_SMS_DTOS,phoneCodePageInfo.getList());
        model.addAttribute(Constant.ADMIN_USER,getSession().getAttribute(Constant.ADMIN_USER));
        return "sms/layoutTab";
    }
}