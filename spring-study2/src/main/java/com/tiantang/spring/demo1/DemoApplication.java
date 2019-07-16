package com.tiantang.spring.demo1;

import com.tiantang.spring.demo1.config.AppConfig;
import com.tiantang.spring.demo1.dao.IndexDao;
import com.tiantang.spring.demo1.factory.MyFactoryBean;
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
		IndexDao indexDao = applicationContext.getBean(IndexDao.class);
		System.out.println(indexDao);
//		System.out.println(indexService);
//		Object bean = applicationContext.getBean("&myFactoryBean");
//		Object bean2 = applicationContext.getBean("myFactoryBean");
//		System.out.println(bean);
//		System.out.println(bean2);
//		System.out.println(bean);
	}
}
