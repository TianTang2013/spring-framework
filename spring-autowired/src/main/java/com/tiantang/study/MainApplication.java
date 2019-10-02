package com.tiantang.study;

import com.tiantang.study.config.AppConfig;
import com.tiantang.study.dao.UserDao;
import com.tiantang.study.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liujinkun
 * @Title: MainApplication
 * @Description: TODO
 * @date 2019/9/8 10:02 PM
 */
public class MainApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		UserDao userDao = applicationContext.getBean(UserDao.class);
//		System.out.println(userDao);
	}

}
