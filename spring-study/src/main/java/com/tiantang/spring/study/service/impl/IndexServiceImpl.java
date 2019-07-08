	package com.tiantang.spring.study.service.impl;

import com.tiantang.spring.study.dao.IndexDao;
import com.tiantang.spring.study.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liujinkun
 * @Title: IndexServiceImpl
 * @Description: TODO
 * @date 2019/6/11 10:01 AM
 */
@Service("indexService")
public class IndexServiceImpl implements IndexService {

	@Autowired
	private IndexDao indexDao;

	public IndexServiceImpl() {
		System.out.println("indexService 无参构造器");
	}

//	@Autowired
//	public IndexServiceImpl(IndexDao indexDao) {
//		System.out.println("有参构造器");
//		this.indexDao = indexDao;
//	}

	@Override
	public void query() {
		System.out.println(indexDao);
		System.out.println("service query");
	}
}
