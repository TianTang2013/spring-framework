package com.tiantang.spring.demo1.dao;

import com.tiantang.spring.demo1.service.IndexService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author liujinkun
 * @Title: IndexDao
 * @Description: TODO
 * @date 2019/7/8 3:12 PM
 */
@Repository
public class IndexDao implements InitializingBean {

	@Autowired
	private IndexService indexService;

	@Autowired
	private Map<String,IndexService> map;

	@Autowired
	private List<IndexService> indexServiceList;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("indexDao 的初始化后置处理方法");
	}

	@Override
	public String toString() {
		return "IndexDao{" +
				"indexService=" + indexService +
				", map=" + map +
				", indexServiceList=" + indexServiceList +
				'}';
	}
}
