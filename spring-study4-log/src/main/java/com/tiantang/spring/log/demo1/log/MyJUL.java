package com.tiantang.spring.log.demo1.log;

import java.util.logging.Logger;

/**
 * @author liujinkun
 * @Title: MyJUL
 * @Description: TODO
 * @date 2019/7/21 3:54 PM
 */
public class MyJUL {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("JUL");
		logger.info("jul");
	}
}
