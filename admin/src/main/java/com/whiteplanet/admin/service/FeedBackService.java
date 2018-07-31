package com.whiteplanet.admin.service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whiteplanet.admin.dto.Constant;
import com.whiteplanet.admin.dto.DoctorFeedBackDto;
import com.whiteplanet.mapper.DoctorMapper;
import com.whiteplanet.mapper.FeedbackMapper;
import com.whiteplanet.mapper.model.Doctor;
import com.whiteplanet.mapper.model.Feedback;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.StringUtils;

import java.util.*;
/**
 * @author:wuzhiyuan
 * @description: 用户手机反馈业务处理
 * @date: Created in 16:43 2017/12/6
 * @modified By:
 */
@Component
public class FeedBackService {
    protected Log logger = LogFactory.getLog(this.getClass());
    /**
     * 问题反馈收集mapper接口
     */
    @Autowired
    private FeedbackMapper feedbackMapper;
    /**
     * 用户信息mapper接口
     */
    @Autowired
    private DoctorMapper doctorMapper;
    /**
     * 分页查询所有用户收集信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    public Map<String,Object> queryAllFeedback(int pageNum,int pageSize) {
        PageInfo<Feedback> feedbackPageInfo = null;
        Map<String,Object> resultMap = new HashMap<>();
        List<DoctorFeedBackDto> doctorFeedBackDtos = new ArrayList<>();
        try {
            //分页查询
            PageHelper.startPage(pageNum, pageSize);
            List<Feedback> feedbacks = feedbackMapper.selectAllFeedBack();
            feedbacks.forEach(feedback -> {
//                Doctor doctor = doctorMapper.selectByPrimaryKey(feedback.getDoctorId());
                Doctor doctor = null;
                if(!StringUtils.isEmpty(feedback.getDoctorId())) {
                    doctor = doctorMapper.selectByPrimaryKey(feedback.getDoctorId());
                } else if(!StringUtils.isEmpty(feedback.getPhone())) {
                    doctor = doctorMapper.selectByPhone(feedback.getPhone());
                }
                if(Objects.isNull(doctor)) {
                    doctor = new Doctor();
                    doctor.setRealName("");
                    doctor.setPhone("");
                }
                DoctorFeedBackDto doctorFeedBackDto = new DoctorFeedBackDto();
                doctorFeedBackDto.setFeedback(feedback);
                doctorFeedBackDto.setName(doctor.getRealName());
                doctorFeedBackDto.setPhone(doctor.getPhone());
                doctorFeedBackDtos.add(doctorFeedBackDto);
            });
            feedbackPageInfo = new PageInfo<Feedback>(feedbacks);
        } catch (Exception e) {
            logger.error("用户反馈信息查询失败.....");
            feedbackPageInfo = new PageInfo<>();
            e.printStackTrace();
        }
        resultMap.put(Constant.PAGEINFO,feedbackPageInfo);
        resultMap.put(Constant.DOCTOR_FEEDBACK_DTOS,doctorFeedBackDtos);
        System.out.println("feedBackService中："+doctorMapper);
        return resultMap;
    }
}