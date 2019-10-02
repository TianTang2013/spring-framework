package com.tiantang.spring.mybatis.demo4;

import com.tiantang.spring.mybatis.demo4.bean.InterfaceMethodBean;
import com.tiantang.spring.mybatis.demo4.config.AppConfig4;
import com.tiantang.spring.mybatis.demo4.config.AppConfigParent;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liujinkun
 * @Title: Demo4Application
 * @Description: TODO
 * @date 2019/8/20 12:00 PM
 */
public class Demo4Application {

	public static void main(String[] args) {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/liujinkun/Downloads/CGLIBTemp");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig4.class);
		System.out.println(applicationContext.getBean(InterfaceMethodBean.class));
//		System.out.println(applicationContext.getBean(AppConfigParent.class));
		applicationContext.close();
	}
}
