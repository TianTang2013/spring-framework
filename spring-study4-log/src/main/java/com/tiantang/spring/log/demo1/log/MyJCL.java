package com.tiantang.spring.log.demo1.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author liujinkun
 * @Title: MyJCL
 * @Description: TODO
 * @date 2019/7/21 4:12 PM
 */
public class MyJCL {

	public static void main(String[] args) {
		Log log = LogFactory.getLog("jcl");
		log.info("cccc==========jcl");
	}
}
