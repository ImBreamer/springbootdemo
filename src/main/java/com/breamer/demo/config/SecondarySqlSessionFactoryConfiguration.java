package com.breamer.demo.config;

import com.breamer.demo.util.DataSourceUtil;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * SqlSessionFactory配置
 * @author zhang.penghao
 * @date 2018/7/11 11:42
 */
@Configuration
@MapperScan(basePackages = {"com.breamer.demo.dao.secondary"} , sqlSessionFactoryRef = "secondarySqlSessionFactory")
public class SecondarySqlSessionFactoryConfiguration {

    @Autowired
    @Qualifier("secondaryDataSource")
    private DataSource secondaryDataSource;
    @Value("${secondary_entity_package}")
    private String secondaryEntityPackage;
    @Value("${secondary_mapper_path}")
    private String secondaryMapperPath;
    @Value("${mybatis_config_path}")
    private String primaryFilePath;

    @Bean(name="secondarySqlSessionFactory")
    public SqlSessionFactoryBean secondaryCreateSqlSessionFactoryBean() throws IOException {
        return DataSourceUtil.createSqlSessionFactoryBean(primaryFilePath,secondaryDataSource, secondaryMapperPath, secondaryEntityPackage);
    }
}
