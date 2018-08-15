package com.breamer.demo.util;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author breamer
 * @Description:
 * @date 2018/7/31 16:10
 */
public class DataSourceUtil {
    public static SqlSessionFactoryBean createSqlSessionFactoryBean(String primaryFilePath, DataSource dataSource, String mapperPath, String entityPackage) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(primaryFilePath));
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String pathLocation = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperPath;
        sqlSessionFactoryBean.setTypeAliasesPackage(entityPackage);
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(pathLocation));
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }
}
