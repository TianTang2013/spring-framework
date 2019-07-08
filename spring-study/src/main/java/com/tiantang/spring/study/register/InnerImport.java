package com.tiantang.spring.study.register;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @author liujinkun
 * @Title: InnerImport
 * @Description: TODO
 * @date 2019/7/7 2:42 PM
 */
@Component
//@Import(MyInnerImport.class)
public class InnerImport {

	@Bean
	public TestBean testBean(){
		return new TestBean();
	}
}
