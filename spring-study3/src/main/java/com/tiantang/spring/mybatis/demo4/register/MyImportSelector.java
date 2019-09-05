package com.tiantang.spring.mybatis.demo4.register;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liujinkun
 * @Title: MyImportSelector
 * @Description: TODO
 * @date 2019/8/23 9:52 PM
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		System.out.println("=========== import Selector");
		return new String[]{"com.tiantang.spring.mybatis.demo4.bean.ImportSelectorBean"};
	}
}
