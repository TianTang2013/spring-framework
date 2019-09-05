package com.tiantang.spring.mybatis.demo2;

import com.tiantang.spring.mybatis.demo2.config.AppConfig2;
import com.tiantang.spring.mybatis.demo2.enable.DbUtilImportAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liujinkun
 * @Title: Demo2Application
 * @Description: TODO
 * @date 2019/7/21 12:52 PM
 */
public class Demo2Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig2.class);
		DbUtilImportAware bean = annotationConfigApplicationContext.getBean(DbUtilImportAware.class);
		System.out.println(bean.getName());
		System.out.println(bean.getPassword());
	}
}
