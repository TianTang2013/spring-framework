package com.tiantang.spring.mybatis.demo4.register;

import com.tiantang.spring.mybatis.demo4.service.IndexService;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liujinkun
 * @Title: MyRegistrar
 * @Description: TODO
 * @date 2019/8/20 12:03 PM
 */
public class MyRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(IndexService.class);
		beanDefinitionBuilder.setAutowireMode(AutowireCapableBeanFactory.AUTOWIRE_BY_NAME);
		registry.registerBeanDefinition("aa",beanDefinitionBuilder.getBeanDefinition());
	}
}
