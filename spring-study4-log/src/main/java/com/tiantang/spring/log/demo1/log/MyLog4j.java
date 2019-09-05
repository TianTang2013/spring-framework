package com.tiantang.spring.log.demo1.log;

import org.apache.log4j.Logger;

/**
 * @author liujinkun
 * @Title: MyLog4j
 * @Description: TODO
 * @date 2019/7/21 3:50 PM
 */
public class MyLog4j {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("log4j");
		logger.info("aaa");
	}
}
