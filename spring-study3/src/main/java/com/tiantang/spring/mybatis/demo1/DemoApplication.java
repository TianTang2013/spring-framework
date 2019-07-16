package com.tiantang.spring.mybatis.demo1;

import com.tiantang.spring.mybatis.demo1.config.AppConfig;
import com.tiantang.spring.mybatis.demo1.dao.UserMapper;
import com.tiantang.spring.mybatis.demo1.entity.User;
import com.tiantang.spring.mybatis.demo1.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author liujinkun
 * @Title: DemoApplication
 * @Description: TODO
 * @date 2019/7/14 8:06 PM
 */
public class DemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		UserService userService= annotationConfigApplicationContext.getBean(UserService.class);
//		System.out.println(userService.userList());
		UserMapper userMapper = annotationConfigApplicationContext.getBean(UserMapper.class);
		List<User> users = userMapper.queryList();
		System.out.println(users);
	}
}
