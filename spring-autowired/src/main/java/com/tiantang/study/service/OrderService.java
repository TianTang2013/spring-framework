package com.tiantang.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liujinkun
 * @Title: OrderService
 * @Description: TODO
 * @date 2019/10/11 8:20 PM
 */
@Service
public class OrderService {

	@Autowired
	private UserService userService;

	public void query(){
		System.out.println(userService);
	}
}
