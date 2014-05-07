package cn.cowboy.service;

import java.util.List;

import cn.cowboy.domain.User;

public interface UserService {
	List<User> getAllUser();
	int addUser(User user);
}
