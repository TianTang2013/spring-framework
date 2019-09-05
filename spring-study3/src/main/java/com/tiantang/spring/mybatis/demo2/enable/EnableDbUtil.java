package com.tiantang.spring.mybatis.demo2.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author liujinkun
 * @Title: EnableDbUtil
 * @Description: TODO
 * @date 2019/7/21 12:53 PM
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(DbUtilImportAware.class)
public @interface EnableDbUtil {

	String name() default "root";

	String password() default "123456";
}
