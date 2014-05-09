package cn.cowboy.service.impl;

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
	public int addUser(User user) {
		int a =  userMapper.addUser(user);
		return a;
	}


	@Override
	public int deleteUser(User user) {
		String userId = user.getUserId()+"";
		int effects =0;
		if(StringUtils.hasLength(userId)){
			effects= userMapper.deleteUserById(userId);
			return effects;
		}
		
		String userName = user.getUserName();
		
		if(StringUtils.hasText(userName)){
			effects = userMapper.deleteUserByUserName(userName);
			return effects;
		}
		return effects;
	}


	@Override
	public int lockUser(User user) {
		String userId = user.getUserId()+"";
		int effects =0;
		if(StringUtils.hasLength(userId)){
			effects= userMapper.lockUserById(userId);
			return effects;
		}
		
		String userName = user.getUserName();
		
		if(StringUtils.hasText(userName)){
			effects = userMapper.lockUserByName(userName);
			return effects;
		}
		return effects;
	}


	@Override
	public User getUser(String userName) {
		return userMapper.getUserByName(userName);
	}
}
