package com.whiteplanet.backward.service.data.impl;

import com.whiteplanet.back.mapper.ClinicInvocationStatisticsMapper;
import com.whiteplanet.back.model.ClinicInvocationStatistics;
import com.whiteplanet.mapper.data.AppointmentStatBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 邀请数据统计
 * @date: Created in 10:17 2018/6/15
 * @modified By:
 */
public class InvocationStatServiceImpl {

    @Autowired
    private ClinicInvocationStatisticsMapper clinicInvocationStatisticsMapper;

    public void clinicInvocationStat(String startTime ,String endTime) {

        List<ClinicInvocationStatistics> clinicInvocationStatistics =
                clinicInvocationStatisticsMapper.selectInvocationStat(startTime, endTime);
    }
}
