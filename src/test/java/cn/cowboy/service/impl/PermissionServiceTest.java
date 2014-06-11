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
	
	public void test3(){
		
	}
}
