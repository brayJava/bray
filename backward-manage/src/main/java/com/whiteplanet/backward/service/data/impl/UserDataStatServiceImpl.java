package com.whiteplanet.backward.service.data.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whiteplanet.back.mapper.StatUserTabMapper;
import com.whiteplanet.back.mapper.UserDataStatisticsMapper;
import com.whiteplanet.back.model.StatUserTab;
import com.whiteplanet.back.model.UserDataStatistics;
import com.whiteplanet.backward.config.StatTypeInf;
import com.whiteplanet.backward.excel.handler.ModuleToExcel;
import com.whiteplanet.backward.excel.modules.UserDataStatisticsModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 医生用户接口数据
 * @date: Created in 16:34 2018/4/10
 * @modified By:
 */
public class UserDataStatServiceImpl {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private UserDataStatisticsMapper userDataStatisticsMapper;

    private StatUserTabMapper statUserTabMapper;
    /**
     * 医生用户统计相关
     */
    void doctorDataStat(String startTime ,String endTime,int pageNum,int pageSize) {

        //查询用户统计表格列名称
        List<StatUserTab> statUserTabs = statUserTabMapper.selectAllTabs(StatTypeInf.USER_STAT);
        //分页查询
        PageHelper.startPage(pageNum, pageSize);
        List<UserDataStatistics> userDataStatistics = userDataStatisticsMapper.selectDoctorDataStat(startTime, endTime);

        //--------------------------------生成excel--------------------------
        List<UserDataStatisticsModule> userDataStatisticsModules = new ArrayList<>();
        userDataStatistics.forEach(userDataStat -> {
            UserDataStatisticsModule userDataStatisticsModule = new UserDataStatisticsModule(userDataStat);
            userDataStatisticsModules.add(userDataStatisticsModule);
        });
        try {
            ModuleToExcel.ObjectToExcel(userDataStatisticsModules,UserDataStatisticsModule.class,"userDataStat.xlsx");
        } catch (Exception e) {
            logger.error("生成excel表格失败....");
            e.printStackTrace();
        }
        //--------------------------------生成excel---------------------------

        PageInfo<UserDataStatistics> userDataStatisticsPageInfo = new PageInfo<UserDataStatistics>(userDataStatistics);
    }
}
