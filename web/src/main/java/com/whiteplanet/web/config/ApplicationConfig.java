package com.whiteplanet.web.config;

import com.whiteplanet.web.interceptor.AuthWebRequestInterceptor;
import com.whiteplanet.web.interceptor.LogWebRequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;
import java.util.List;

@Configuration
@EnableScheduling
@Import({com.whiteplanet.mapper.config.MapperConfig.class})
public class ApplicationConfig extends WebMvcConfigurerAdapter {

    /**
     * 权限处理
     */
    @Resource
    private AuthWebRequestInterceptor authWebRequestInterceptor;

    /**
     * 日志处理
     */
    @Resource
    private LogWebRequestInterceptor logWebRequestInterceptor;

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new MappingJackson2HttpMessageConverter());
        super.configureMessageConverters(converters);
    }

    /**
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authWebRequestInterceptor);
        registry.addInterceptor(logWebRequestInterceptor);
        super.addInterceptors(registry);
    }

    /**
     *
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/weixin/*").allowedOrigins("*");
        registry.addMapping("/api/*").allowedOrigins("*");
        registry.addMapping("/api/im/*").allowedOrigins("*");
        registry.addMapping("/api/doctor/*").allowedOrigins("*");
        registry.addMapping("/api/patient/*").allowedOrigins("*");
        registry.addMapping("/api/manager/*").allowedOrigins("*");
        super.addCorsMappings(registry);
    }
}
