package com.wenchao.fu.app.mybatis_spring_demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.Service.ITService;
import com.demo.ServiceImpl.TServiceImpl;
import com.demo.model.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserTest {
	@Autowired
	@Qualifier("userService")
	ITService<User> userService;// = new TServiceImpl<User,String>();
	
	@Test
	public void test(){
		userService.getT(1);
		System.out.println("success");
	}
	
}
