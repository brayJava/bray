package com.whiteplanet.quartz.config;

import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * Created by wuzhiyuan on 2018/02/01.
 */
@Configuration
public class QuartzConfig {

    @Autowired
    private SpringBeanJobFactory springBeanJobFactory;

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        //把job交给Spring来管理，这样job就能使用Spring产生的bean了
        schedulerFactoryBean.setJobFactory(springBeanJobFactory);
        return schedulerFactoryBean;
    }

    @Bean
    public Scheduler scheduler() {
        return schedulerFactoryBean().getScheduler();
    }

}
