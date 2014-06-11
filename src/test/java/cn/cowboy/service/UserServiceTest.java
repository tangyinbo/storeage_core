package cn.cowboy.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.cowboy.domain.User;
import cn.cowboy.parent.BaseTest;


public class UserServiceTest extends BaseTest{
	@Autowired
	private UserService userService;
	
	@Test
	public void test1(){
		User user = new User();
		user.setUserName("tangyinbo2");
		user.setPassword("123456");
		user.setSalt(System.currentTimeMillis()+"");
		user.setStat("S0A");
		userService.createUser(user);
	}
}
