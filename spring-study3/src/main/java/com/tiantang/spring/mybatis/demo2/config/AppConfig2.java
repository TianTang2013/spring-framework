package com.tiantang.spring.mybatis.demo2.config;

import com.tiantang.spring.mybatis.demo2.enable.EnableDbUtil;
import org.springframework.context.annotation.Configuration;

/**
 * @author liujinkun
 * @Title: AppConfig3
 * @Description: TODO
 * @date 2019/7/21 12:53 PM
 */
@Configuration
@EnableDbUtil(name = "aaaaa",password = "bbbbb")
public class AppConfig2 {
}
