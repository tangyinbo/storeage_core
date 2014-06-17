package cn.cowboy.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cowboy.domain.Permission;
import cn.cowboy.parent.BaseTest;
import cn.cowboy.service.PermissionService;

public class PermissionServiceTest extends BaseTest{
	
	@Autowired
	private PermissionService permissionService;
	
	@Test
	public void testCreatePermission(){
		Permission priv = new Permission();
		priv.setPermission("/test/all");
		priv.setDescription("测试");
		priv.setStat("S0A");
		permissionService.createPermission(priv);
	}
	
	@Test
	public void testDeltePermission(){
		permissionService.deletePermission(2);
	}
	
	@Test
	public void testAddPriv(){
		//11->用户管理->system:user:creat->/sys/user/create->0->S0A
		Permission priv =null;
		for(int i=1;i<5;i++){
			priv = new Permission();
			priv.setDescription("用户管理"+i);
			priv.setPermission("system:user:creat"+i);
			priv.setParentPriv(11);
			priv.setPrivUrl("/sys/user/create"+i);
			permissionService.createPermission(priv);
			System.out.println(priv);
		}
	}
}
