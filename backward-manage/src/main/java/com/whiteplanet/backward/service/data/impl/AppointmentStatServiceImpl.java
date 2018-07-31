package com.whiteplanet.backward.service.data.impl;

import com.whiteplanet.mapper.TransReceiveRecordMapper;
import com.whiteplanet.mapper.data.AppointmentResultBean;
import com.whiteplanet.mapper.data.AppointmentStatBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 约诊相关统计
 * @date: Created in 10:31 2018/6/1
 * @modified By:
 */
public class AppointmentStatServiceImpl {

    @Autowired
    private TransReceiveRecordMapper transReceiveRecordMapper;


    void appointmentStat(AppointmentStatBean appointmentStatBean) {
        //获取约诊统计数据
        List<AppointmentResultBean> appointmentResultBeans =
                transReceiveRecordMapper.selectAppointmentStat(appointmentStatBean);


    }
}
