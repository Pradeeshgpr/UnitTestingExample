package com.test.unit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class Config {

    private static final String DATA_SOURCE_URL = "spring.datasource.url";
    private static final String DATA_SOURCE_USER_NAME = "spring.datasource.username";
    private static final String DATA_SOURCE_PASSWORD = "spring.datasource.password";
    private static final String DATA_SOURCE_DRIVER_CLASS = "spring.datasource.driver-class-name";

    @Autowired
    private Environment env;

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(env.getProperty(DATA_SOURCE_URL));
        dataSourceBuilder.username(env.getProperty(DATA_SOURCE_USER_NAME));
        dataSourceBuilder.password(env.getProperty(DATA_SOURCE_PASSWORD));
        dataSourceBuilder.driverClassName(env.getProperty(DATA_SOURCE_DRIVER_CLASS));
        return dataSourceBuilder.build();
    }
}
