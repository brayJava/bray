package com.whiteplanet.admin.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import javax.annotation.PostConstruct;

/**
 * @author:wuzhiyuan
 * @description:
 * @date: Created in 16:22 2017/12/29
 * @modified By:
 */
@Configuration
public class ThymeleafConfig {

    @Autowired
    private SpringTemplateEngine templateEngine;

    @PostConstruct
    public void init() {
//        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();

        resolver.setPrefix("audit/");
        resolver.setSuffix(".html");
//        resolver.setTemplateMode("LEGACYHTML5");
        resolver.setOrder(templateEngine.getTemplateResolvers().size());
        templateEngine.addTemplateResolver(resolver);
    }
}
