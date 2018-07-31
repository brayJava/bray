package com.whiteplanet.backward.service.data.impl;

import com.whiteplanet.mapper.TransReceiveRecordMapper;
import com.whiteplanet.mapper.data.AppointmentStatBean;
import com.whiteplanet.mapper.data.TransStatBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 转诊成功率统计
 * @date: Created in 17:11 2018/6/4
 * @modified By:
 */
public class TransferStatServiceImpl {

    @Autowired
    private TransReceiveRecordMapper transReceiveRecordMapper;

    public void transferStat(AppointmentStatBean appointmentStatBean) {

        List<TransStatBean> transStatBeans =
                transReceiveRecordMapper.selectTransferStat(appointmentStatBean);


    }
}
