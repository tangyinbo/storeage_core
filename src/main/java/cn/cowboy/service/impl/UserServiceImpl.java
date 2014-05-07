package cn.cowboy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cowboy.dao.UserMapping;
import cn.cowboy.domain.User;
import cn.cowboy.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapping userMapping;

	@Override
	public List<User> getAllUser() {
		return userMapping.selectAllUser();
	}

	@Override
	public int addUser(User user) {
		int a =  userMapping.addUser(user);
		//int b = 1/0;
		return a;
	}
}
