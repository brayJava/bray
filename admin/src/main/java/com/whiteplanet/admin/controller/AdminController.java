package com.whiteplanet.admin.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.whiteplanet.admin.config.JGPushConfig;
import com.whiteplanet.admin.domain.aop.LoggerManage;
import com.whiteplanet.admin.dto.Constant;
import com.whiteplanet.admin.dto.DoctorCerDto;
import com.whiteplanet.admin.dto.DoctorDto;
import com.whiteplanet.admin.dto.DoctorStatusDto;
import com.whiteplanet.admin.mapper.model.AdminUser;
import com.whiteplanet.admin.service.AdminService;
import com.whiteplanet.admin.service.DoctorUserService;
import com.whiteplanet.admin.util.DateUtil;
import com.whiteplanet.admin.util.PageUtil;
import com.whiteplanet.mapper.data.DoctorCertificatesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * @author:wuzhiyuan
 * @description:  admin下用户信息控制器
 * @date: Created in 17:20 2017/11/27
 * @modified By:
 */
@Controller
@RequestMapping("/admin")
class AdminController extends BaseController{

    @Autowired
    private AdminService adminService;

    @Autowired
    private DoctorUserService doctorUserService;

    @Autowired
    private JGPushConfig jgPushConfig;
    /**
     * 首页跳转
     */
    @RequestMapping("/index")
    ModelAndView index() {
        return new ModelAndView("audit/index","errorCode","00000");
    }
    /**
     * 首页跳转
     */
//    @RequestMapping({"/index"})
//    ModelAndView index()
//    {
//        String context = null;
//        String strTime = null;
//        StringBuffer buf = new StringBuffer("");
//        try
//        {
//            strTime = String.valueOf(System.currentTimeMillis());
//            context = "appkey=4060fbce4d18d78a9a57c242&timestamp=" + strTime + "&random_str=022cd9fd995849b58b3ef0e943421ed9&key=aba99fcba8f6a42ac5b52f32";
//            MessageDigest md = MessageDigest.getInstance("MD5");
//            md.update(context.getBytes());
//            byte[] encryContext = md.digest();
//
//            for (int offset = 0; offset < encryContext.length; offset++)
//            {
//                int i = encryContext[offset];
//                if (i < 0) i += 256;
//                if (i < 16) buf.append("0");
//                buf.append(Integer.toHexString(i));
//            }
//            System.out.println(buf.toString());
//            System.out.println("16result: " + buf.toString().substring(8, 24));
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("appkey", "4060fbce4d18d78a9a57c242");
//        jsonObject.put("random_str", "022cd9fd995849b58b3ef0e943421ed9");
//        jsonObject.put("signature", buf.toString());
//        jsonObject.put("timestamp", strTime);
//        return new ModelAndView("audit/index", "errorCode", jsonObject.toString());
//    }
    @PostMapping("/auth-code")
    @ResponseBody
    public String authCode() {
        String context = null;
        String strTime = null;
        StringBuffer buf = new StringBuffer("");
        try
        {
            strTime = String.valueOf(System.currentTimeMillis());
            context = "appkey="+jgPushConfig.getAppkey()+"&timestamp=" + strTime + "&" +
                    "random_str=022cd9fd995849b58b3ef0e943421ed9&key="+jgPushConfig.getMasterSecret();
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(context.getBytes());
            byte[] encryContext = md.digest();

            for (int offset = 0; offset < encryContext.length; offset++)
            {
                int i = encryContext[offset];
                if (i < 0) i += 256;
                if (i < 16) buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            System.out.println(buf.toString());
            System.out.println("16result: " + buf.toString().substring(8, 24));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("appkey", jgPushConfig.getAppkey());
        jsonObject.put("random_str", "022cd9fd995849b58b3ef0e943421ed9");
        jsonObject.put("signature", buf.toString());
        jsonObject.put("timestamp", strTime);
        return jsonObject.toString();
    }
    /**
     * 首页跳转
     */
    @RequestMapping("/indexList")
    public String indexList() {
        return Constant.INDEXLIST_T;
    }

    /**
     * 用户登入验证
     * @param adminUser
     * @return
     */
    @PostMapping(value = "/login")
    @LoggerManage(description = "用户登入")
    ModelAndView login(AdminUser adminUser, Model model, HttpSession httpSession) {
        if(!StringUtils.isEmpty(adminUser.getName()) && !StringUtils.isEmpty(adminUser.getPwd())) {
            List<AdminUser> adminUsers = adminService.login(adminUser);
            httpSession.setAttribute(Constant.ADMIN_USER,adminUser);
            if(!CollectionUtils.isEmpty(adminUsers)) {
                return new ModelAndView("redirect:/admin/initList");
            }
        }
        return new ModelAndView("audit/index","errorCode","00001");
    }
    /**
     * 初始化列表，查詢所有医生信息
     * @param doctorCerDto
     * @param model
     * @return
     */
    @GetMapping("/initList")
    @LoggerManage(description = "用户审核界面初始化",serviceType = "userList")
    String initQuery(DoctorCerDto doctorCerDto, Model model,HttpSession session) {
        //处理时间，开始时间->00:00:01，结束时间->23:59:59
        dealTime(doctorCerDto);
        //默认查看待审核的医生用户
        doctorCerDto.setStatus(Constant.WAIT_AUDIT);
        Map<String, Object> resMap = doctorUserService.fuzzySelectDoctorUserByPage(doctorCerDto);
        PageInfo<DoctorCertificatesBean> pageInfo = (PageInfo<DoctorCertificatesBean>) resMap.get(Constant.PAGEINFO);
        //返回界面展示model
        model.addAttribute(Constant.PAGEINFO_DTO,  PageUtil.pageInfoHandle((PageInfo) resMap.get(Constant.PAGEINFO)));
        model.addAttribute(Constant.DOCTORDTOS,resMap.get(Constant.LIST));
        model.addAttribute(Constant.ADMIN_USER,session.getAttribute(Constant.ADMIN_USER));
        //设置时间返回格式
        doctorCerDto.setStartTime(DateUtil.getFormatDate(DateUtil.parseDate(doctorCerDto.getStartTime()),DateUtil.PATTERN_yyyy_MM_dd));
        doctorCerDto.setEndTime(DateUtil.getFormatDate(DateUtil.parseDate(doctorCerDto.getEndTime()),DateUtil.PATTERN_yyyy_MM_dd));
        return "audit/indexListT";
    }
    /**
     * 按条件查找对应的医生用户信息
     * @param doctorCerDto
     * @return
     */
    @PostMapping("/getByCondition")
    @LoggerManage(description = "按需查询审核信息列表",serviceType = "userList")
    String queryDoctorUserByCondition(DoctorCerDto doctorCerDto,Model model) {
        //如果时间为空，则取最新一天时间
        if(StringUtils.isEmpty(doctorCerDto.getStartTime()))
            dealTime(doctorCerDto);
        //处理时间，开始时间->00:00:01，结束时间->23:59:59
        doctorCerDto.setStartTime( DateUtil.getStartDate(doctorCerDto.getStartTime()));
        doctorCerDto.setEndTime(DateUtil.getLastDate(doctorCerDto.getEndTime()));
        //按条件查询接口
        Map<String, Object> resMap = doctorUserService.fuzzySelectDoctorUserByPage(doctorCerDto);
        PageInfo<DoctorCertificatesBean> pageInfo = (PageInfo<DoctorCertificatesBean>) resMap.get(Constant.PAGEINFO);
        //返回界面展示model
        model.addAttribute(Constant.PAGEINFO_DTO,  PageUtil.pageInfoHandle((PageInfo) resMap.get(Constant.PAGEINFO)));
        model.addAttribute(Constant.DOCTORDTOS,resMap.get(Constant.LIST) == null ? new ArrayList<DoctorDto>() : resMap.get(Constant.LIST));
        model.addAttribute(Constant.ADMIN_USER,getSession().getAttribute(Constant.ADMIN_USER));
        //设置时间返回格式
        doctorCerDto.setStartTime(DateUtil.getFormatDate(DateUtil.parseDate(doctorCerDto.getStartTime()),DateUtil.PATTERN_yyyy_MM_dd));
        doctorCerDto.setEndTime(DateUtil.getFormatDate(DateUtil.parseDate(doctorCerDto.getEndTime()),DateUtil.PATTERN_yyyy_MM_dd));
        return "audit/layout";
    }
    /**
     * 修改医生用户相关信息审核状态
     */
    @PostMapping("/updateDoctorUser")
    @ResponseBody
    @LoggerManage(description = "用户审核状态更新")
    public String udpateDoctorUser(DoctorStatusDto doctorStatusDto,Map model) {

        if(doctorUserService.updateDoctorAuditStatus(doctorStatusDto)){
            model.put("code","00000");
        } else {
            model.put("code","00001");
        }
        String jsonStr = JSON.toJSONString(model);
        return jsonStr;
    }

    @RequestMapping(value = "/sessions", method = RequestMethod.GET)
    @ResponseBody
    public Object sessions (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("sessionId", request.getSession().getId());
        map.put("message", request.getSession().getAttribute("map"));
        return map;
    }
    /**
     *  处理时间，开始结束时间
     * @param doctorCerDto
     */
    private void dealTime(DoctorCerDto doctorCerDto) {
        Date currentDate = new Date();
        String dateStr = DateUtil.formatDate(currentDate, DateUtil.PATTERN_yyyy_MM_dd);
        doctorCerDto.setStartTime( DateUtil.getStartDate(dateStr));
        doctorCerDto.setEndTime(DateUtil.getLastDate(dateStr));
    }
}