package com.tiantang.spring.demo1.imports;

import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liujinkun
 * @Title: ImportSelector
 * @Description: TODO
 * @date 2019/7/8 4:23 PM
 */
public class ImportSelector implements org.springframework.context.annotation.ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.tiantang.spring.demo1.imports.beans.ImportSelectorBean"};
	}
}
