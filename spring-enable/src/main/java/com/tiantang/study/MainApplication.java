package com.tiantang.study;

import com.tiantang.study.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liujinkun
 * @Title: MainApplication
 * @Description: 启动类
 * @date 2019/9/18 11:26 PM
 */
public class MainApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
