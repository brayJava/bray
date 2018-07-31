package com.whiteplanet.backward.quartz.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author:wuzhiyuan
 * @description: 消息记录同步定时器
 * @date: Created in 18:39 2018/02/01
 * @modified By:
 */
@Service
public class JMessageSynchronousTask extends BaseTask {
    //设置同步时间
    @Value("${task.cron}")
    private String cronEexpression;
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//       super.execute(jobExecutionContext);
        //消息同步入库
//        jMessageSaveServiceImpl.synchronousJMessage();
    }

    @Override
    public String getCronEexpression() {

        return cronEexpression;
    }
}