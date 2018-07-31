package com.whiteplanet.backward.service.total.impl;

import com.whiteplanet.back.mapper.UserActivityStatisticsMapper;
import com.whiteplanet.back.model.UserActivityStatistics;
import com.whiteplanet.backward.util.DateUtil;
import com.whiteplanet.mapper.LoginStatMapper;
import com.whiteplanet.mapper.model.LoginStat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author:wuzhiyuan
 * @description: 用户活跃度数据同步接口
 * @date: Created in 17:26 2018/4/13
 * @modified By:
 */
@Service
@Transactional
public class UserActivitySyschronousServiceImpl {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LoginStatMapper loginStatMapper;

    @Autowired
    private UserActivityStatisticsMapper userActivityStatisticsMapper;
    /**
     * 同步活跃用户
     */
    void UserActivitySyschronous() {
        SimpleDateFormat simdf = new SimpleDateFormat(DateUtil.PATTERN_yyMMdd);
        Calendar cal = Calendar.getInstance();
        String time = simdf.format(cal.getTime());
        //获取日活跃度
        Integer dailyActivity = loginStatMapper.selectDailyActivity(time);

        //获取周活跃度
        cal.set(cal.DAY_OF_WEEK, cal.MONDAY);
        String weekhand = simdf.format(cal.getTime());
        cal.set(Calendar.DATE, cal.get(cal.DATE) + 6);
        String weeklast = simdf.format(cal.getTime());
        Integer weekActivity = loginStatMapper.selectWeekOrMonthActivity(weekhand, weeklast);

        //获取月活跃度
        cal.add(Calendar.MONTH, 0);
        cal.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        String monthhand = simdf.format(cal.getTime());
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        String monthlast = simdf.format(cal.getTime());
        Integer monthActivity = loginStatMapper.selectWeekOrMonthActivity(monthhand, monthlast);

        //同步活跃度统计信息
        UserActivityStatistics userActivityStatistics = new UserActivityStatistics();
        userActivityStatistics.setTime(new Date());
        userActivityStatistics.setDailyActivity(dailyActivity);
        userActivityStatistics.setWeekActivity(weekActivity);
        userActivityStatistics.setMonthActivity(monthActivity);
        try {
            userActivityStatisticsMapper.insertSelective(userActivityStatistics);
        } finally {
            logger.error("活跃度统计插入失败...");
        }

    }

    public static void main(String[] args) {

        SimpleDateFormat simdf = new SimpleDateFormat("YYYY/MM/dd");

        Calendar cal = Calendar.getInstance();
        cal.setTime(DateUtil.parseDate("2018/06/23"));
        System.out.println("现在时间："+simdf.format(cal.getTime()));
        //分别获取年、月、日
        System.out.println("年："+cal.get(cal.YEAR));
        System.out.println("月："+(cal.get(cal.MONTH)+1));//老外把一月份整成了0，翻译成中国月份要加1
        System.out.println("日："+cal.get(cal.DATE));

        cal.set(cal.DAY_OF_WEEK, cal.MONDAY);
        String weekhand = simdf.format(cal.getTime());
        System.out.println("当前时间所在周周一日期："+weekhand);
        //cal.set(cal.DAY_OF_WEEK, cal.SUNDAY);这个不符合中国人的时间观，老外把上周周日定为一周的开始。

        cal.set(Calendar.DATE, cal.get(cal.DATE) + 6);
        String weeklast = simdf.format(cal.getTime());
        System.out.println("当前时间所在周周日日期："+weeklast);

        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        //获取当前月第一天：
        Calendar c = Calendar.getInstance();
        c.setTime(DateUtil.parseDate("2018/06/23"));
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        String first = format.format(c.getTime());
        System.out.println("===============first:"+first);

                 //获取当前月最后一天
        Calendar ca = Calendar.getInstance();
        ca.setTime(DateUtil.parseDate("2018/06/23"));
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        String last = format.format(ca.getTime());
        System.out.println("===============last:"+last);

    }
}

