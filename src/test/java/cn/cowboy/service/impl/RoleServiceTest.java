package cn.cowboy.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.cowboy.domain.Roles;
import cn.cowboy.parent.BaseTest;
import cn.cowboy.service.RoleService;

public class RoleServiceTest extends BaseTest {
	@Autowired
	private RoleService roleService;

	@Test
	public void testCreateRole() {
		Roles role = new Roles();
		role.setRoleName("测试");
		role.setDescription("test");
		role.setStat("S0A");
		role =roleService.createRole(role);
		System.out.println(role);
	}
	
	@Test
	public void testDeleteRole(){
		roleService.deleteRole(1);
	}
	
	@Test
	public void testCorrelationPermissions(){
		roleService.correlationPermissions(2, 3,4);
	}

	
	@Test
	public void testuncorrelationPermissions(){
		roleService.uncorrelationPermissions(1, 2,3);
	}
}
