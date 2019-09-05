package com.tiantang.spring.mybatis.demo4.service;

import com.tiantang.spring.mybatis.demo4.dao.IndexDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liujinkun
 * @Title: IndexService
 * @Description: TODO
 * @date 2019/8/20 12:59 PM
 */
//@Service
public class IndexService {

	@Autowired
	private IndexDao aa;

	public void query(){
		System.out.println(aa);
	}
}
