package com.whiteplanet.admin.controller;

import com.github.pagehelper.PageInfo;
import com.whiteplanet.admin.domain.aop.LoggerManage;
import com.whiteplanet.admin.dto.Constant;
import com.whiteplanet.admin.service.FeedBackService;
import com.whiteplanet.admin.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
/**
 * @author:wuzhiyuan
 * @description: 用户反馈收集控制器
 * @date: Created in 16:38 2017/12/6
 * @modified By:
 */
@Controller
@RequestMapping("/feed")
public class FeedBackController extends BaseController{

    @Autowired
    private FeedBackService feedBackService;
    /**
     * 用户反馈信息收集界面初始化
     * @param pageNum
     * @param pageSize
     * @param model
     * @return
     */
    @RequestMapping("/init")
    @LoggerManage(description = "用户反馈信息展示",serviceType = "feedList")
    public String selectAllFeedBack(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                    @RequestParam(value = "pageSize",defaultValue = "10") int pageSize, Model model) {
        selectFeedbacks(pageNum, pageSize, model);
        return "feedback/feed";
    }
    @PostMapping("/pageGo")
    @LoggerManage(description = "用户反馈跳页信息展示",serviceType = "feedList")
    public String selectAllFeedBackByPage(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                    @RequestParam(value = "pageSize",defaultValue = "10") int pageSize, Model model) {
        selectFeedbacks(pageNum, pageSize, model);
        return "feedback/layoutTab";
    }
    /**
     * 收集问题反馈处理逻辑
     * @param pageNum
     * @param pageSize
     * @param model
     */
    private void selectFeedbacks(int pageNum, int pageSize, Model model) {
        Map<String, Object> resultMap = feedBackService.queryAllFeedback(pageNum, pageSize);
        model.addAttribute(Constant.DOCTOR_FEEDBACK_DTOS,resultMap.get(Constant.DOCTOR_FEEDBACK_DTOS));
        model.addAttribute(Constant.PAGEINFO_DTO,  PageUtil.pageInfoHandle((PageInfo) resultMap.get(Constant.PAGEINFO)));
        model.addAttribute(Constant.ADMIN_USER,getSession().getAttribute(Constant.ADMIN_USER));
    }
}