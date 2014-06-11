package cn.cowboy.service.impl;

import java.util.Set;

import org.apache.shiro.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cowboy.dao.UserMapper;
import cn.cowboy.domain.User;
import cn.cowboy.service.UserService;
import cn.cowboy.shiro.provide.PasswordHelper;

@Service(value="userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public User createUser(User user) {
		PasswordHelper.encryptPassword(user);
		userMapper.addUser(user);
		return user;
	}


	@Override
	public void changePassword(Integer userId, String newPassword) {
		User user = userMapper.getById(userId);
		PasswordHelper.encryptPassword(user);
		userMapper.updateUser(user);
	}


	@Override
	public void correlationRoles(Integer userId, Integer... roleIds) {
		
	}


	@Override
	public void uncorrelationRoles(Integer userId, Integer... roleIds) {
		
	}


	@Override
	public User findByUsername(String username) {
		return null;
	}


	@Override
	public Set<String> findRoles(String username) {
		return null;
	}


	@Override
	public Set<String> findPermissions(String username) {
		return null;
	}
}
