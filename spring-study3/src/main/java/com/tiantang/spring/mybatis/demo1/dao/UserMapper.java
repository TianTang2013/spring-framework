package com.tiantang.spring.mybatis.demo1.dao;

import com.tiantang.spring.mybatis.demo1.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author liujinkun
 * @Title: UserMapper
 * @Description: TODO
 * @date 2019/7/14 8:06 PM
 */
public interface UserMapper {

	@Select("select * from user")
	List<User> queryList();
}
