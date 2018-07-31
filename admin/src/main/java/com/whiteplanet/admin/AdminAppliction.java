package com.whiteplanet.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by 185378641@qq.com on 2017/11/2.
 *
 * @author jiangtao
 */
@SpringBootApplication
@ComponentScan(value = "com.whiteplanet")
@ServletComponentScan
public class AdminAppliction {
    public static void main(String[] args) {
        SpringApplication.run(AdminAppliction.class,args);
    }

    /**
     * 设置session时间
     * @return
     */
    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer(){
        return new EmbeddedServletContainerCustomizer() {
            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                container.setSessionTimeout(7200);//单位为S
            }
        };
    }
}