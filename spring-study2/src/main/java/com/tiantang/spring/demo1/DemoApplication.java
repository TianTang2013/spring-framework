package com.tiantang.spring.demo1;

import com.tiantang.spring.demo1.config.AppConfig;
import com.tiantang.spring.demo1.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liujinkun
 * @Title: DemoApplication
 * @Description: TODO
 * @date 2019/7/8 3:12 PM
 */
public class DemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexService indexService = applicationContext.getBean(IndexService.class);
		System.out.println(indexService);
	}
}
