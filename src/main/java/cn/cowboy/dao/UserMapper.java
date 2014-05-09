package cn.cowboy.dao;

import cn.cowboy.domain.User;
/**
 * 
* @ClassName: UserMapper
* @Description: 用户持久层
* @author Tangyinbo
* @date 2014-5-9 下午3:23:38
*
 */
public interface UserMapper {
	public int addUser(User user);

	public int deleteUserById(String userId);

	public int deleteUserByUserName(String userName);

	public int lockUserById(String userId);

	public int lockUserByName(String userName);

	public User getUserByName(String userName);
}
