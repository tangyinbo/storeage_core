package cn.cowboy.service;

import java.util.Set;

import cn.cowboy.domain.User;

public interface UserService {
	public User createUser(User user); // 创建账户

	public void changePassword(Integer userId, String newPassword);// 修改密码

	public void correlationRoles(Integer userId, Integer... roleIds); // 添加用户-角色关系

	public void uncorrelationRoles(Integer userId, Integer... roleIds);// 移除用户-角色关系

	public User findByUsername(String username);// 根据用户名查找用户

	public Set<String> findRoles(String username);// 根据用户名查找其角色

	public Set<String> findPermissions(String username); // 根据用户名查找其权限
}
