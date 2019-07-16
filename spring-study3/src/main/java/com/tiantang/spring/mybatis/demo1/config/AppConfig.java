package com.tiantang.spring.mybatis.demo1.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author liujinkun
 * @Title: AppConfig
 * @Description: TODO
 * @date 2019/7/14 8:06 PM
 */
@Configuration
@ComponentScan("com.tiantang.spring.mybatis.demo1")
@MapperScan("com.tiantang.spring.mybatis.demo1.dao")
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
}
