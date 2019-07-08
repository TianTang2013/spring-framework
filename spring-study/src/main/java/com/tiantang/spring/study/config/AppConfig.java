package com.tiantang.spring.study.config;

import com.tiantang.spring.study.register.MyImport;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author liujinkun
 * @Title: AppConfig
 * @Description: TODO
 * @date 2019/6/11 10:00 AM
 */
@Configuration
@ComponentScan("com.tiantang.spring.study")
@Import(MyImport.class)
public class AppConfig {
}
