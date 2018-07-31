package com.whiteplanet.quartz.task;

import com.whiteplanet.im.jiguang.api.service.JMessageService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author:wuzhiyuan
 * @description: im消息通知定时器
 * @date: Created in 9:27 2018/6/20
 * @modified By:
 */
@Service
public class JMessageAdviceTask extends BaseTask{

    //设置同步时间
    @Value("${task.cron.advice}")
    private String cronEexpression;
    @Autowired
    private JMessageService jMessageService;
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//       super.execute(jobExecutionContext);
        //消息同步入库
        jMessageService.adviceJMessage();
    }

    @Override
    public String getCronEexpression() {

        return cronEexpression;
    }
}
