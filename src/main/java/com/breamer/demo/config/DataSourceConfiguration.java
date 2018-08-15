package com.breamer.demo.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;
/**
 * 数据源配置
 * @author zhang.penghao
 * @date 2018/7/11 11:36
 */
//@Configuration
@MapperScan("com.breamer.demo.dao")
public class DataSourceConfiguration {
    @Value("${jdbc.username}")
    private String jdbcUser;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(name="dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(jdbcUser);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setDriverClass(jdbcDriver);
        dataSource.setPassword(jdbcPassword);
        dataSource.setAutoCommitOnClose(true);
        return dataSource;
    }
}
