package cn.cowboy.service;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.cowboy.domain.User;
import cn.cowboy.parent.BaseTest;


public class UserServiceTest extends BaseTest{
	@Autowired
	private UserService userService;
	
	@Test
	public void test1(){
		User user = new User();
		user.setUserName(UUID.randomUUID().toString());
		user.setPassword("123456");
		user.setStat("S0A");
		userService.createUser(user);
		System.out.println(user);
	}
	
	@Test
	public void testChangePassword(){
		userService.changePassword(2, "hahaha");
	}
}
