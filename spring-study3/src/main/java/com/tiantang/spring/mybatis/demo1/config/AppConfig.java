package com.tiantang.spring.mybatis.demo1.config;

import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.logging.jdk14.Jdk14LoggingImpl;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.logging.Logger;

/**
 * @author liujinkun
 * @Title: AppConfig
 * @Description: TODO
 * @date 2019/7/14 8:06 PM
 */
@Configuration
@ComponentScan("com.tiantang.spring.mybatis.demo1")
@MapperScan("com.tiantang.spring.mybatis.demo1.dao")
@EnableTransactionManagement
public class AppConfig {

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/example");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		return dataSource;
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(){
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
		return sqlSessionFactoryBean;
	}
//
//	@Bean
//	public org.apache.ibatis.session.Configuration configuration(){
//		org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
//		configuration.setLogImpl(StdOutImpl.class);
//		return configuration;
//	}
//
//	@Bean
//	public PlatformTransactionManager platformTransactionManager(){
//		DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager(dataSource());
//		return dataSourceTransactionManager;
//	}
}
