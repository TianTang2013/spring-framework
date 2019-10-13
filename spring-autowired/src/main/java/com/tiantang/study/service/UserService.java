package com.tiantang.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liujinkun
 * @Title: UserService
 * @Description: TODO
 * @date 2019/9/8 10:05 PM
 */
@Service
public class UserService {

	@Autowired
	private OrderService orderService;

	public void query(){
		System.out.println(orderService);
	}
}
