package com.tiantang.study.config;

import com.tiantang.study.dao.OrderDao;
import com.tiantang.study.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liujinkun
 * @Title: AppConfig
 * @Description: TODO
 * @date 2019/9/8 10:03 PM
 */
@Configuration
@ComponentScan("com.tiantang.study")
public class AppConfig {

	@Bean
	public UserDao userDao(){
		// 会被打印几次 ？？
		System.out.println("注入UserDao");
		return new UserDao();
	}

	@Bean
	public OrderDao orderDao(){
		// 在这里调用userDao()方法
		userDao();
		return new OrderDao();
	}

}
