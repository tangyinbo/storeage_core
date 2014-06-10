package cn.cowboy.service;

import java.util.List;

import cn.cowboy.domain.User;

public interface UserService {
	int addUser(User user);
	int deleteUser(User user);
	int lockUser(User user);
	User getUser(String userName);
}
