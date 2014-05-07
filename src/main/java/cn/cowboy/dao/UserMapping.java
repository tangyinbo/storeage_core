package cn.cowboy.dao;

import java.util.List;

import cn.cowboy.domain.User;

public interface UserMapping {
	public List<User> selectAllUser();
	public int addUser(User user);
}
