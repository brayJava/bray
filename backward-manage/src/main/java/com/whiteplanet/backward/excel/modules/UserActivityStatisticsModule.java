package com.whiteplanet.backward.excel.modules;

import com.whiteplanet.back.model.UserActivityStatistics;
import com.whiteplanet.backward.excel.annotation.ExcelField;
import com.whiteplanet.backward.util.DateUtil;

/**
 * @author:wuzhiyuan
 * @description: 用户活跃度模板
 * @date: Created in 17:19 2018/4/17
 * @modified By:
 */
public class UserActivityStatisticsModule {
    // 时间
    @ExcelField(title = "时间", order = 1)
    private String time;
    // 日活跃度
    @ExcelField(title = "DAU", order = 2)
    private Integer dailyActivity;
    // 周活跃度
    @ExcelField(title = "WAU", order = 3)
    private Integer weekActivity;
    // 月活跃度
    @ExcelField(title = "MAU", order = 4)
    private Integer monthActivity;

    public UserActivityStatisticsModule() {
    }

    public UserActivityStatisticsModule(UserActivityStatistics userActivityStatistics) {
        this.time = DateUtil.formatDate(userActivityStatistics.getTime(), DateUtil.PATTERN_yyyyMMdd2);
        this.dailyActivity = userActivityStatistics.getDailyActivity();
        this.weekActivity = userActivityStatistics.getWeekActivity();
        this.monthActivity = userActivityStatistics.getMonthActivity();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getDailyActivity() {
        return dailyActivity;
    }

    public void setDailyActivity(Integer dailyActivity) {
        this.dailyActivity = dailyActivity;
    }

    public Integer getWeekActivity() {
        return weekActivity;
    }

    public void setWeekActivity(Integer weekActivity) {
        this.weekActivity = weekActivity;
    }

    public Integer getMonthActivity() {
        return monthActivity;
    }

    public void setMonthActivity(Integer monthActivity) {
        this.monthActivity = monthActivity;
    }
}
