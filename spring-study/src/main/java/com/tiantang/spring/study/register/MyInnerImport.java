package com.tiantang.spring.study.register;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liujinkun
 * @Title: MyImport
 * @Description: TODO
 * @date 2019/7/4 9:09 PM
 */
public class MyInnerImport implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
//		return new String[]{"com.tiantang.spring.study.register.InnerImportBean"};
		return new String[0];
	}
}
