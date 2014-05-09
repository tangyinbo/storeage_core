package cn.cowboy.dao;

import java.util.List;

import cn.cowboy.domain.User2;

public interface UserMapping {
	public List<User2> selectAllUser();
	public int addUser(User2 user);
}
