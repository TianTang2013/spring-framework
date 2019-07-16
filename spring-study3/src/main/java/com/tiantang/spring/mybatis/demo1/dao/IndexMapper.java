package com.tiantang.spring.mybatis.demo1.dao;

import org.apache.ibatis.annotations.Select;

/**
 * @author liujinkun
 * @Title: IndexMapper
 * @Description: TODO
 * @date 2019/7/15 7:01 PM
 */
public interface IndexMapper {

	@Select("select count(*) from user")
	int count();
}
