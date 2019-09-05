package com.tiantang.spring.mybatis.demo1.service;

import com.tiantang.spring.mybatis.demo1.dao.UserMapper;
import com.tiantang.spring.mybatis.demo1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liujinkun
 * @Title: UserService
 * @Description: TODO
 * @date 2019/7/14 10:58 PM
 */
@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

//	@Transactional
	public List<User> userList(){
		System.out.println(userMapper.queryList());
		return userMapper.queryList();
	}
}
