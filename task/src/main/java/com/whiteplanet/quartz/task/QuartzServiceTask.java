package com.whiteplanet.quartz.task;

import com.whiteplanet.im.jiguang.api.util.DateUtil;
import com.whiteplanet.mapper.ClinicDealRecordMapper;
import com.whiteplanet.mapper.DoctorMapper;
import com.whiteplanet.mapper.ReceiveDetailMapper;
import com.whiteplanet.mapper.data.ClinicIncomeBean;
import com.whiteplanet.mapper.data.ReceiveCountBean;
import com.whiteplanet.mapper.model.ClinicDealRecord;
import com.whiteplanet.mapper.model.Doctor;
import com.whiteplanet.push.jg.JPushService;
import com.whiteplanet.sms.SmsSendService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
/**
 * @author:wuzhiyuan
 * @description: 定时器-提醒看诊医生看诊数量
 * @date: Created in 14:05 2018/6/21
 * @modified By:
 */
@Service
public class QuartzServiceTask {
    Logger logger = LoggerFactory.getLogger(QuartzServiceTask.class);
    /**
     * 短信发送接口
     */
    @Autowired
    private SmsSendService smsSendService;
    @Autowired
    private JPushService jPushService;
    @Autowired
    private ReceiveDetailMapper receiveDetailMapper;
    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private ClinicDealRecordMapper clinicDealRecordMapper;
    /**
     * 每天早上七点发送定时内容，推送看诊提醒
     */
    @Scheduled(cron = "0 0 7 * * ?")
    public void sendSMSScheduler() {
        logger.info(">>>>>>>>>>>>>>>>>>看诊定时短信提醒发送开始....");
        //起始时间为上午07:00:00
        String startDate  = LocalDateTime.of(LocalDate.now(), LocalTime.MIN).plusHours(7)
                .format(DateTimeFormatter.ofPattern(DateUtil.PATTERN_yyyy_MM_dd_HH_mm_ss));
        //结束时间为晚上23:59:59
        String endDate = LocalDateTime.of(LocalDate.now(), LocalTime.MAX)
                .format(DateTimeFormatter.ofPattern(DateUtil.PATTERN_yyyy_MM_dd_HH_mm_ss));
        try {
            List<ReceiveCountBean> receiveCountBeans = receiveDetailMapper.selectReceiveCountById(startDate, endDate);
            if(!Objects.isNull(receiveCountBeans) && receiveCountBeans.size()>0) {
                receiveCountBeans.forEach(receiveCountBean -> {
                    List<String> names = receiveDetailMapper.selectPatientNameByReveiveDocId(receiveCountBean.getReceiveDocId(), startDate, endDate);
                    String nameStr = getNameStr(names);
                    Doctor doctor = doctorMapper.selectByPrimaryKey(receiveCountBean.getReceiveDocId());
                    //短信发送
                    smsSendService.sendSms(doctor.getPhone(),"【C医O】"+receiveCountBean.getRealName()+"您好，您今天将有"+
                            receiveCountBean.getReceiveCount()+"位患者来看诊，患者姓名为"+nameStr);
                    //app推送
                    jPushService.sendPushWithNotificationByAliasToAllPlatform(doctor.getId(),receiveCountBean.getRealName()+"您好，您今天将有"+
                            receiveCountBean.getReceiveCount()+"位患者来看诊，患者姓名为"+nameStr,"");
                });
            }
            logger.info(">>>>>>>>>>>>>>>>>>看诊定时短信提醒发送完成....");
        } catch (Exception e) {
            logger.error(">>>>>>>>>>>>>>>>>定时短信提醒和推送发送失败");
            e.printStackTrace();
        }
    }
    /**
     *  诊所收入相关通知提醒
     */
    @Scheduled(cron = "0 0 7 * * ?")
    public void clinicIncomeAdvice() {
        logger.info(">>>>>>>>>>>>>>>>>>诊所收入定时短信提醒发送开始....");
        //起始时间为昨天00:00:00
        String startDate  = LocalDateTime.of(LocalDate.now(), LocalTime.MIN).minusDays(1)
                .format(DateTimeFormatter.ofPattern(DateUtil.PATTERN_yyyy_MM_dd_HH_mm_ss));
        //结束时间为昨天23:59:59
        String endDate = LocalDateTime.of(LocalDate.now(), LocalTime.MAX).minusDays(1)
                .format(DateTimeFormatter.ofPattern(DateUtil.PATTERN_yyyy_MM_dd_HH_mm_ss));
        try {
            List<ClinicIncomeBean> clinicIncomeBeans = clinicDealRecordMapper.selectClinicIncome(startDate, endDate);
            if(!Objects.isNull(clinicIncomeBeans) || clinicIncomeBeans.size() > 0) {
                clinicIncomeBeans.forEach(clinicIncomeBean -> {
                    //诊所收入短信发送
                    smsSendService.sendSms(clinicIncomeBean.getPhone(),"【C医O】"+clinicIncomeBean.getRealName()+"您好，您昨天有"+
                            clinicIncomeBean.getTotalCount()+"笔收入已到账，共"+clinicIncomeBean.getTotalMoney()+"元。");
                    jPushService.sendPushWithNotificationByAliasToAllPlatform(clinicIncomeBean.getDoctorId(),clinicIncomeBean.getRealName()+"您好，您昨天有"+
                            clinicIncomeBean.getTotalCount()+"笔收入已到账，共"+clinicIncomeBean.getTotalMoney()+"元。","");

                });
            }
            logger.info(">>>>>>>>>>>>>>>>>>诊所收入定时短信提醒发送完成....");
        } catch (Exception e) {
            logger.error(">>>>>>>>>>>>>>>>>诊所收入定时短信提醒发送失败");
            e.printStackTrace();
        }
    }
    /**
     * 获取患者名字字符链接
     * @param names
     */
    private String getNameStr(List<String> names) {
        if(names.size() == 0) {
           return "";
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            for(String name : names) {
                nameBuilder.append(name).append("、");
            }
            return nameBuilder.deleteCharAt(nameBuilder.length()-1).toString();
        }
    }
}