package com.whiteplanet.admin.mapper.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by 185378641@qq.com on 2017/11/2.
 *
 * @author jiangtao
 */
@Configuration
@MapperScan(basePackages = "com.whiteplanet.admin.mapper", sqlSessionTemplateRef  = "adminSqlSessionTemplate")
public class AdminMapperConfig {

    @Bean(name = "admin")
    @ConfigurationProperties(prefix = "admin.datasource")
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        try {
            druidDataSource.setFilters("stat,wall,log4j");
            druidDataSource.setUseGlobalDataSourceStat(true);
        } catch (SQLException e) {
            //
        }
        return druidDataSource;
    }

    @Bean(name = "adminSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("admin") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
//        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/test2/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "adminTransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("admin") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "adminSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("adminSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}