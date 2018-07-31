package com.whiteplanet.backward.service.data.impl;

import com.whiteplanet.mapper.AppOrderMapper;
import com.whiteplanet.mapper.TransReceiveRecordMapper;
import com.whiteplanet.mapper.model.AppOrder;
import com.whiteplanet.mapper.model.TransReceiveRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 用户行为相关统计
 * @date: Created in 16:40 2018/6/13
 * @modified By:
 */
@Service
public class UserActionStatServiceImpl {

    @Autowired
    private TransReceiveRecordMapper transReceiveRecordMapper;
    @Autowired
    private AppOrderMapper appOrderMapper;
    /**
     * 约诊拒绝原因统计
     * @param startTime
     * @param endTime
     */
    public void refuseReasonStat(String startTime,String endTime) {

        TransReceiveRecord transReceiveRecord =
                transReceiveRecordMapper.selectRefusedReason(startTime, endTime);
    }
    /**
     * 小纸条内容统计
     * @param startTime
     * @param endTime
     */
    public void noteContentStat(String startTime ,String endTime) {

        List<AppOrder> appOrders = appOrderMapper.selectByNoteConent(startTime, endTime);
    }


}
