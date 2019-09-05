package com.tiantang.spring.mybatis.demo4.config;

import com.tiantang.spring.mybatis.demo4.bean.InterfaceMethodBean;
import org.springframework.context.annotation.Bean;

/**
 * @author liujinkun
 * @Title: AppConfigInterface
 * @Description: TODO
 * @date 2019/8/23 5:26 PM
 */
public interface AppConfigInterface {

	@Bean
	default InterfaceMethodBean interfaceMethodBean() {
		return new InterfaceMethodBean();
	}
}


