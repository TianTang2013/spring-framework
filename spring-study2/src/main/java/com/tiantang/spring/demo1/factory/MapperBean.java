package com.tiantang.spring.demo1.factory;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author liujinkun
 * @Title: MapperBean
 * @Description: TODO
 * @date 2019/7/11 9:19 PM
 */
public class MapperBean implements InitializingBean{

	public MapperBean(){
		System.out.println("************* mapper bean instantiation ***********");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// 并不会执行
		// 对于FactoryBean而言，它在初始化以后，之后只会执行BeanProcessor后置处理器的postProcessAfterInitialization方法
		System.out.println("======== 属性设置完成以后执行执行");
	}
}
