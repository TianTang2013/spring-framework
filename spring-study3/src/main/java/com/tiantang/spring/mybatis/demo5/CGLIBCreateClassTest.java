package com.tiantang.spring.mybatis.demo5;


import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.annotation.ConfigurationClassEnhancer;

/**
 * @author liujinkun
 * @Title: CGLIBCreateClassTest
 * @Description: TODO
 * @date 2019/8/23 11:48 PM
 */
public class CGLIBCreateClassTest {

	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/liujinkun/Downloads/CGLIBTemp");
		ConfigurationClassEnhancer enhancer = new ConfigurationClassEnhancer();
		Class<?> cglibBeanClass = enhancer.enhance(CGLIBBean.class, CGLIBBean.class.getClassLoader());
		CGLIBBean cglibBean = (CGLIBBean) cglibBeanClass.newInstance();
		cglibBean.test();
	}

}
