package cn.cowboy.shiro.roletest;

import org.junit.Assert;
import org.junit.Test;

import junit.runner.BaseTestRunner;

public class AuthorizationTest extends BastTest{
	@Test
	public void tesstAu(){
		login("classpath:shiro-authorizer.ini", "zhang", "123");
		Assert.assertTrue(subject().isPermitted("user1:update"));
		Assert.assertTrue(subject().isPermitted("user2:update"));
		//通过二进制位的方式表示权限
		Assert.assertTrue(subject().isPermitted("+user1+2"));//新增权限
		Assert.assertTrue(subject().isPermitted("+user1+8"));//查看权限
		Assert.assertTrue(subject().isPermitted("+user2+10"));//新增及查看
		Assert.assertFalse(subject().isPermitted("+user1+4"));//没有删除权限
		Assert.assertTrue(subject().isPermitted("menu:view"));// 通过MyRolePermissionResolver 解析得到的权限
		
	}
}
