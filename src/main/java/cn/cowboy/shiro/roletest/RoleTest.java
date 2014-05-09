package cn.cowboy.shiro.roletest;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class RoleTest extends BastTest{
	@Test
	public void testHasRole(){
		//登录
		login("classpath:shiro-role.ini", "wang", "123");
		
		//判断拥有角色：role1
		Assert.assertTrue(subject().hasRole("role1"));
		//判断拥有角色：role1 and role2
		Assert.assertTrue(subject().hasAllRoles(Arrays.asList("role1", "role2")));
		//判断拥有角色：role1 and role2 and !role3
		boolean[] result = subject().hasRoles(Arrays.asList("role1", "role2", "role3"));
		Assert.assertEquals(true, result[0]);
		Assert.assertEquals(true, result[1]);
		Assert.assertEquals(false, result[2]);
	}
	
	@Test
	public void checkRole(){
		login("classpath:shiro-role.ini", "wang", "123");
		subject().checkRole("role1");
		subject().checkRole("role2");
	}
	
	@Test
	public void testIsPermitted() {
	login("classpath:shiro-permission.ini", "zhang", "123");
	//判断拥有权限：user:create
	Assert.assertTrue(subject().isPermitted("user/create"));
	//判断拥有权限：user:update and user:delete
	Assert.assertTrue(subject().isPermittedAll("user:update", "user:delete"));
	//判断没有权限：user:view
	Assert.assertFalse(subject().isPermitted("user:view"));
	}
}
