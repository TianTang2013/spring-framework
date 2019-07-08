package com.tiantang.spring.demo1.imports;

import com.tiantang.spring.demo1.imports.beans.RegistrarBean;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liujinkun
 * @Title: Registrar
 * @Description: TODO
 * @date 2019/7/8 4:02 PM
 */
public class Registrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(RegistrarBean.class);
		registry.registerBeanDefinition("registerBean",beanDefinitionBuilder.getBeanDefinition());
		System.out.println("----------- registry bean ------------");
	}
}
