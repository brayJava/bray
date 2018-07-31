package com.whiteplanet.backward.service.total.impl;

import com.whiteplanet.back.mapper.ClinicInvocationStatisticsMapper;
import com.whiteplanet.back.model.ClinicInvocationStatistics;
import com.whiteplanet.backward.util.DateUtil;
import com.whiteplanet.mapper.DoctorJoinClinicMapper;
import com.whiteplanet.mapper.WxApplyRecordMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.NumberFormat;
import java.util.Date;
/**
 * @author:wuzhiyuan
 * @description: 邀请同步统计
 * @date: Created in 15:25 2018/5/30
 * @modified By:
 */
@Service
@Transactional
public class InvocationSyschronousServiceImpl {

        private final Logger logger = LoggerFactory.getLogger(this.getClass());
        @Autowired
        private DoctorJoinClinicMapper doctorJoinClinicMapper;

        @Autowired
        private WxApplyRecordMapper wxApplyRecordMapper;

        @Autowired
        private ClinicInvocationStatisticsMapper clinicInvocationStatisticsMapper;

        void invocationSynchronous() {
                ClinicInvocationStatistics clinicInvocationStatistics = new ClinicInvocationStatistics();
                String time = DateUtil.formatDate(new Date(), DateUtil.PATTERN_yyMMdd);
                clinicInvocationStatistics.setTime(new Date());
                //获取邀请总数
                int invocationCount = doctorJoinClinicMapper.selectInvocationCount(time);
                clinicInvocationStatistics.setInvocationTotalCount(invocationCount);
                //获取邀请成功总数
                int registerCount = wxApplyRecordMapper.selectInvocationRegisterCount(time);
                clinicInvocationStatistics.setInvocationRegisterCount(registerCount);
                //邀请成功率设置
                clinicInvocationStatistics.setInvocationSuccessPer(getPercentage(registerCount,invocationCount));
                //获取平均要求数量
                int clinicAvgInvocationCount = doctorJoinClinicMapper.selectClinicAvgInvocationCount(time);
                clinicInvocationStatistics.setClinicAvgInvocation(clinicAvgInvocationCount);
                try {
                        clinicInvocationStatisticsMapper.insertSelective(clinicInvocationStatistics);
                } catch (Exception e) {
                        e.printStackTrace();
                        logger.info("邀请统计相关插入失败...");
                }
        }
        //获取百分比
        public String getPercentage(int num1, int num2) {
                NumberFormat numberFormat = NumberFormat.getInstance();
                numberFormat.setMaximumFractionDigits(2);
                String result = numberFormat.format((float) num1 / (float) num2 * 100)+"%";
                return result;
        }
}