package com.whiteplanet.backward.service.data.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whiteplanet.back.mapper.UserActivityStatisticsMapper;
import com.whiteplanet.back.model.UserActivityStatistics;
import com.whiteplanet.backward.dto.StatParam;
import com.whiteplanet.backward.excel.handler.ModuleToExcel;
import com.whiteplanet.backward.excel.modules.UserActivityStatisticsModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 用户活跃度统计接口
 * @date: Created in 16:41 2018/4/17
 * @modified By:
 */
@Service
public class UserActivityStatServiceImpl {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserActivityStatisticsMapper userActivityStatisticsMapper;
    /**
     * 获取活跃度统计数据
     * @param statParam
     */
    void userActivityStat(StatParam statParam) {

        PageHelper.startPage(statParam.getPageNum(), statParam.getPageSize());
        List<UserActivityStatistics> userActivityStatistics = userActivityStatisticsMapper
                .selectUserActivityStat(statParam.getStartTime(), statParam.getEntTime());
        ArrayList<UserActivityStatisticsModule> userActivityStatisticsModules = new ArrayList<>();
        userActivityStatistics.forEach(userActivityStat -> {
            UserActivityStatisticsModule userActivityStatisticsModule = new UserActivityStatisticsModule();
            userActivityStatisticsModules.add(userActivityStatisticsModule);
        });
        try {
            //生成excel
            ModuleToExcel.ObjectToExcel(userActivityStatistics,UserActivityStatisticsModule.class,"userActivityStat.xlsx");
        } catch (Exception e) {
            logger.error("生成excel失败......");
            e.printStackTrace();
        }
        //返回分页项结果
        PageInfo<UserActivityStatistics> userActivityStatisticsPageInfo = new PageInfo<>(userActivityStatistics);

    }
}
