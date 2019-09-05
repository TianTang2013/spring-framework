package com.tiantang.spring.mybatis.demo3.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author liujinkun
 * @Title: MyAspect
 * @Description: TODO
 * @date 2019/7/21 2:20 PM
 */
@Aspect
//@Component
public class MyAspect {

	@Pointcut("execution(* com.tiantang.spring.mybatis.demo3.service.*.*(..))")
	public void pointCut(){

	}

	@Before("pointCut()")
	public void before(){
		System.out.println("=========== Aop Before ==========");
	}
}
