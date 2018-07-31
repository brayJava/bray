package com.whiteplanet.backward.service.total.impl;

import com.whiteplanet.back.mapper.UserDataStatisticsMapper;
import com.whiteplanet.back.model.UserDataStatistics;
import com.whiteplanet.backward.util.DateUtil;
import com.whiteplanet.mapper.DoctorStatMapper;
import com.whiteplanet.mapper.model.FillDataStat;
import com.whiteplanet.mapper.model.RealnameAuthStat;
import com.whiteplanet.mapper.model.RegisterStat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
/**
 * @author:wuzhiyuan
 * @description: 医生用户数据同步
 * @date: Created in 14:00 2018/4/9
 * @modified By:
 */
@Service
@Transactional
public class UserDataSyschronousServiceImpl {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private DoctorStatMapper doctorStatMapper;

    private UserDataStatisticsMapper userDataStatisticsMapper;
    /**
     * 同步用户后台数据
     */
    void synchronousRegisterStat() {
        List<UserDataStatistics> insertUserDataStats = new ArrayList<>();
        //查询最新统计的时间
        UserDataStatistics userDataStatistics = userDataStatisticsMapper.selectMaxUserDataStatistics();
        String startTime = DateUtil.formatDate(userDataStatistics.getTime(), DateUtil.PATTERN_yyyyMMdd2);
        //获取用户填写资料的统计数据
        List<FillDataStat> fillDataStats = doctorStatMapper.selectFillDataTimes(startTime);
        Map<String,Integer> fillDataMap = new HashMap();
        fillDataStats.forEach(fillDataStat -> {
            fillDataMap.put(fillDataStat.getFillDataTime(),fillDataStat.getFillDataCount());
        });
        //获取申请实名的用户统计数据
        List<RealnameAuthStat> realnameAuthStats = doctorStatMapper.selectRealnameAuthTimes(startTime);
        Map<String,Integer> realnameAuthMap = new HashMap();
        realnameAuthStats.forEach(realnameAuthStat -> {
            realnameAuthMap.put(realnameAuthStat.getRealnameAuthTime(),realnameAuthStat.getRealnameAuthCount());
        });
        //获取注册统计数据
        List<RegisterStat> registerStats = doctorStatMapper.selectRegisterTimes(startTime);
        registerStats.forEach(registerStat -> {
            UserDataStatistics uds = new UserDataStatistics();
            //获取插入时间
            String insertTime = registerStat.getRegisterTime();
            uds.setTime(DateUtil.parseDate(insertTime));
            uds.setRegisterUserCount(registerStat.getRegisterCount());
            uds.setFillDataCount(fillDataMap.get(insertTime) == null? 0 : fillDataMap.get(insertTime));
            uds.setApplyRealnameCount(realnameAuthMap.get(insertTime) == null ? 0 : realnameAuthMap.get(insertTime));
            insertUserDataStats.add(uds);
        });
        //批量插入统计数据
        try {
            userDataStatisticsMapper.insertBatch(insertUserDataStats);
        } catch (Exception e) {
            logger.error("批量插入用户统计数据失败...");
            e.printStackTrace();
        }
    }
}