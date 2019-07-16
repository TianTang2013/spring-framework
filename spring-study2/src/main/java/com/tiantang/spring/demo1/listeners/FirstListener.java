package com.tiantang.spring.demo1.listeners;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author liujinkun
 * @Title: FirstListener
 * @Description: TODO
 * @date 2019/7/9 3:45 PM
 */
//@Component
public class FirstListener implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("============ 执行自定义的第一个监听器 =============");
	}
}
