package com.tiantang.spring.study.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author liujinkun
 * @Title: MyFactoryBean
 * @Description: TODO
 * @date 2019/7/1 5:40 PM
 */
@Component
public class MyFactoryBean implements FactoryBean<IndexBean> {
	@Override
	public IndexBean getObject() throws Exception {
		return new IndexBean();
	}

	@Override
	public Class<?> getObjectType() {
		return IndexBean.class;
	}
}
