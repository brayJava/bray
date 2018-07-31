package com.whiteplanet.backward;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author:wuzhiyuan
 * @description: 后台运营管理启动类
 * @date: Created in 11:03 2018/3/30
 * @modified By:
 */
@SpringBootApplication
@ComponentScan(value = "com.whiteplanet")
public class BackwardApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackwardApplication.class,args);
    }
}
