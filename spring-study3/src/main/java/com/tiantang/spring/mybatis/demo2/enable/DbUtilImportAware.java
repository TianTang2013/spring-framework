package com.tiantang.spring.mybatis.demo2.enable;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @author liujinkun
 * @Title: DbUtilImportAware
 * @Description: TODO
 * @date 2019/7/21 12:56 PM
 */
@Configuration
public class DbUtilImportAware implements ImportAware {

	private String name;

	private String password;

	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		System.out.println("================== import aware ==================");
		Map<String, Object> map = importMetadata.getAnnotationAttributes(EnableDbUtil.class.getName());
		AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(map);
		this.name = annotationAttributes.getString("name");
		this.password = annotationAttributes.getString("password");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
