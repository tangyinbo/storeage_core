package cn.cowboy.service.impl;

import java.util.Set;
import java.util.UUID;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.cowboy.domain.User;
import cn.cowboy.parent.BaseTest;
import cn.cowboy.service.UserService;


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
	
	@Test
	public void testcorrelationRoles(){
		userService.correlationRoles(1, 2,3);
	}
	
	@Test
	public void testuncorrelationRoles(){
		userService.uncorrelationRoles(1, 2,3);
	}
	
	@Test
	public void testfindRoles(){
		Set<String> set =userService.findRoles("tangyinbo");
		System.out.println(set);
	}
	
	@Test
	public void testfindPermissions(){
		Set<String> set=userService.findPermissions("wu");
		System.out.println(set);
	}
}
