package com.tiantang.spring.study.test;

import com.tiantang.spring.study.config.AppConfig;
import com.tiantang.spring.study.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liujinkun
 * @Title: StartTest
 * @Description: TODO
 * @date 2019/6/11 10:00 AM
 */
public class StartTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		IndexService indexService = annotationConfigApplicationContext.getBean(IndexService.class);
		IndexService indexService = (IndexService) annotationConfigApplicationContext.getBean("indexService");
		indexService.query();
	}
}
