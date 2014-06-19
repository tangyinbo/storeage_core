package cn.cowboy.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.cowboy.domain.User;
import cn.cowboy.provide.common.Pagination;
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

	public User getById(Integer userId);

	public void updateUser(User user);

	public void correlationRoles(List<Map<String, Integer>> formatUerRoles);

	public void uncorrelationRoles(List<Map<String, Integer>> formatUerRoles);

	public User findByUsername(String username);

	public Set<String> findPermissions(String username);

	public Set<String> findRoles(String username);

	public List<User> selectUsers(Pagination pagination);

	public int selectUserCount();

}
