package cn.cowboy.service.impl;

import java.util.Set;

import org.apache.shiro.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cowboy.dao.UserMapper;
import cn.cowboy.domain.User;
import cn.cowboy.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public User createUser(User user) {
		userMapper.addUser(user);
		return user;
	}


	@Override
	public void changePassword(Long userId, String newPassword) {
		
	}


	@Override
	public void correlationRoles(Long userId, Long... roleIds) {
		
	}


	@Override
	public void uncorrelationRoles(Long userId, Long... roleIds) {
		
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
