package com.tiantang.spring.mybatis.demo3;

import com.tiantang.spring.mybatis.demo3.config.AppConfig3;
import com.tiantang.spring.mybatis.demo3.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liujinkun
 * @Title: AopDemoApplication
 * @Description: TODO
 * @date 2019/7/21 2:18 PM
 */
public class AopDemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig3.class);
		IndexService indexService = annotationConfigApplicationContext.getBean(IndexService.class);
		indexService.query();
	}
}
