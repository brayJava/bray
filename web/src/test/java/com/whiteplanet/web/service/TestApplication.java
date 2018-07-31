package com.whiteplanet.web.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 测试类统一boot启动入口
 */
@SpringBootApplication
@ComponentScan(value = {"com.whiteplanet"})//这个是引用包用的
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class,args);
    }

}
