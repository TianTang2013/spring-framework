package com.tiantang.spring.study.dao;

import com.tiantang.spring.study.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author liujinkun
 * @Title: IndexDao
 * @Description: TODO
 * @date 2019/6/30 3:44 PM
 */
@Repository
public class IndexDao {

	@Autowired
	private IndexService indexService;

	public IndexDao(){
		System.out.println("indexDao 无参构造器");
	}
}
