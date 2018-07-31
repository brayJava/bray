package com.whiteplanet.backward.service.data.impl;

import com.whiteplanet.mapper.TransReceiveRecordMapper;
import com.whiteplanet.mapper.data.AppointmentStatBean;
import com.whiteplanet.mapper.data.ReceiveResultBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 接诊成功率统计
 * @date: Created in 20:11 2018/6/4
 * @modified By:
 */
public class ReceiveStatServiceImpl {

    @Autowired
    private TransReceiveRecordMapper transReceiveRecordMapper;

    public void receiveSucessStat(AppointmentStatBean appointmentStatBean) {

        List<ReceiveResultBean> receiveResultBeans =
                transReceiveRecordMapper.selectReceviceStat(appointmentStatBean);


    }
}
