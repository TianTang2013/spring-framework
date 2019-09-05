package com.tiantang.spring.log.demo1;

import com.tiantang.spring.log.demo1.config.AppConfig;
import com.tiantang.spring.log.demo1.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liujinkun
 * @Title: Demo1Application
 * @Description: TODO
 * @date 2019/7/21 3:27 PM
 */
public class Demo1Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexService bean = annotationConfigApplicationContext.getBean(IndexService.class);
		System.out.println(bean);
	}
}
