package com.tiantang.spring.study.register;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liujinkun
 * @Title: MyImport
 * @Description: TODO
 * @date 2019/7/4 9:09 PM
 */
public class MyImport implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		System.out.println(importingClassMetadata.getAnnotationTypes());
		System.out.println(importingClassMetadata.getClassName());
		System.out.println("执行自定义的register");
	}
}
