package cn.cowboy.parent;

import javax.management.relation.Role;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.apache.shiro.util.ThreadContext;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.cowboy.domain.Permission;
import cn.cowboy.domain.Roles;
import cn.cowboy.domain.User;
import cn.cowboy.service.PermissionService;
import cn.cowboy.service.RoleService;
import cn.cowboy.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml","classpath:spring-shiro.xml" })
public class BaseTest {
	@Autowired
	private UserService userService;
	@Autowired
	private PermissionService permissionService;
	@Autowired
	private RoleService roleService;

	protected String password = "123";

	protected Permission p1;
	protected Permission p2;
	protected Permission p3;
	protected Roles r1;
	protected Roles r2;
	protected User u1;
	protected User u2;
	protected User u3;
	protected User u4;

	{
		// 1、新增权限
		p1 = new Permission("user:create", "用户模块新增", "S0A");
		p2 = new Permission("user:update", "用户模块修改", "S0A");
		p3 = new Permission("menu:create", "菜单模块新增", "S0A");
		// 2、新增角色
		r1 = new Roles("admin", "管理员", "S0A");
		r2 = new Roles("user", "用户管理员", "S0A");

		// 4、新增用户
		u1 = new User("zhang", password);
		u2 = new User("li", password);
		u3 = new User("wu", password);
		u4 = new User("wang", password);
		u4.setStat("S0X");
	}

	public void setUp() {

		permissionService.createPermission(p1);
		permissionService.createPermission(p2);
		permissionService.createPermission(p3);

		roleService.createRole(r1);
		roleService.createRole(r2);
		System.out.println(r1);
		System.out.println(r2);
		// 3、关联角色-权限
		roleService.correlationPermissions(r1.getRoleId(), p1.getprivId());
		roleService.correlationPermissions(r1.getRoleId(), p2.getprivId());
		roleService.correlationPermissions(r1.getRoleId(), p3.getprivId());

		roleService.correlationPermissions(r2.getRoleId(), p1.getprivId());
		roleService.correlationPermissions(r2.getRoleId(), p2.getprivId());

		userService.createUser(u1);
		userService.createUser(u2);
		userService.createUser(u3);
		userService.createUser(u4);
		// 5、关联用户-角色
		userService.correlationRoles(u1.getUserId(), r1.getRoleId());
	}

	/*
	 * @Test public void test1(){ System.out.println(userService); System.out.println(permissionService); System.out.println(roleService); }
	 */

	@After
	public void tearDown() throws Exception {
		ThreadContext.unbindSubject();// 退出时请解除绑定Subject到线程 否则对下次测试造成影响
	}

	protected void login(String username, String password) {
		/*// 1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
		Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory(configFile);

		// 2、得到SecurityManager实例 并绑定给SecurityUtils
		org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);

		// 3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
*/		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);

		subject.login(token);
	}

	public Subject subject() {
		return SecurityUtils.getSubject();
	}

}
