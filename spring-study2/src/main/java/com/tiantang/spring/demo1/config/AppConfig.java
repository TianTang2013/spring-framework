package com.tiantang.spring.demo1.config;

import com.tiantang.spring.demo1.imports.ImportSelector;
import com.tiantang.spring.demo1.imports.Registrar;
import com.tiantang.spring.demo1.imports.beans.ImportDirectBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author liujinkun
 * @Title: AppConfig
 * @Description: TODO
 * @date 2019/7/8 3:13 PM
 */
@Configuration
@ComponentScan("com.tiantang.spring.demo1")
//@Import(Registrar.class)
//@Import(ImportSelector.class)
@Import(ImportDirectBean.class)
public class AppConfig {
}
