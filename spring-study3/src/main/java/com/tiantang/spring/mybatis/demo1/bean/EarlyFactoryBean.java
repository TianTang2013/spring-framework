package com.tiantang.spring.mybatis.demo1.bean;

import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author liujinkun
 * @Title: EarlyFactoryBean
 * @Description: TODO
 * @date 2019/7/16 12:02 PM
 */
@Component
public class EarlyFactoryBean implements SmartFactoryBean<MySmartFactoryBean> {
	@Override
	public MySmartFactoryBean getObject() throws Exception {
		return new MySmartFactoryBean();
	}

	@Override
	public Class<?> getObjectType() {
		return MySmartFactoryBean.class;
	}

	@Override
	public boolean isEagerInit() {
		return true;
	}
}
