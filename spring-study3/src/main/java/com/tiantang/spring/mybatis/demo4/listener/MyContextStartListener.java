package com.tiantang.spring.mybatis.demo4.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * @author liujinkun
 * @Title: ContextStartListener
 * @Description: TODO
 * @date 2019/9/8 8:53 PM
 */
@Component
public class MyContextStartListener implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("================容器启动完成");
	}
}
