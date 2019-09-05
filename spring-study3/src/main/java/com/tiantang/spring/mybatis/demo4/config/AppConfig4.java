package com.tiantang.spring.mybatis.demo4.config;

import com.tiantang.spring.mybatis.demo4.bean.InterfaceMethodBean;
import com.tiantang.spring.mybatis.demo4.register.MyImportSelector;
import com.tiantang.spring.mybatis.demo4.register.MyRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author liujinkun
 * @Title: AppConfig4
 * @Description: TODO
 * @date 2019/8/20 12:01 PM
 */
@ComponentScan({"com.tiantang.spring.mybatis.demo4.dao","com.tiantang.spring.mybatis.demo4.service"})
//@Import(MyRegistrar.class)
@Import({MyImportSelector.class,MyRegistrar.class})
@Configuration
public class AppConfig4 implements AppConfigInterface{

//	@Bean()
//	public InterfaceMethodBean InterfaceMethodBean(){
//		return new InterfaceMethodBean();
//	}
}
