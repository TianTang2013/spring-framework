package com.tiantang.spring.demo1.service;

import com.tiantang.spring.demo1.dao.IndexDao;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liujinkun
 * @Title: IndexService
 * @Description: TODO
 * @date 2019/7/8 3:12 PM
 */
@Service
public class IndexService implements InitializingBean {

	@Autowired
	private IndexDao indexDao;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("indexService的初始化后置处理方法");
		System.out.println(indexDao);
	}
}
