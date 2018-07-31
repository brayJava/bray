package com.whiteplanet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author:wuzhiyuan
 * @description: 启动类
 * @date: Created in 14:46 2018/2/5
 * @modified By:
 */
@SpringBootApplication
//@ComponentScan(basePackages={"com.whiteplanet.im.jiguang.api","com.whiteplanet"})
@Configuration
@EnableScheduling
public class TaskBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskBootApplication.class, args);
    }

}
