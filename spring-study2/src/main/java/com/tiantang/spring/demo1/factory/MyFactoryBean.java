package com.tiantang.spring.demo1.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author liujinkun
 * @Title: MyFactoryBean
 * @Description: TODO
 * @date 2019/7/11 9:17 PM
 */
//@Component
public class MyFactoryBean implements FactoryBean<MapperBean> {

	public MyFactoryBean(){
		System.out.println("^^^^^^^^^^^^^^ my factory bean instantiation^^^^^^^^^^^^^^^^");
	}

	@Override
	public MapperBean getObject() throws Exception {
		return new MapperBean();
	}

	@Override
	public Class<?> getObjectType() {
		return MapperBean.class;
	}
}
