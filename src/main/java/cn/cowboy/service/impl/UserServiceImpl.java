package cn.cowboy.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.shiro.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cowboy.dao.UserMapper;
import cn.cowboy.domain.User;
import cn.cowboy.provide.common.Pagination;
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
		userMapper.correlationRoles(formatUerRoles(userId,roleIds));
	}


	@Override
	public void uncorrelationRoles(Integer userId, Integer... roleIds) {
		userMapper.uncorrelationRoles(formatUerRoles(userId,roleIds));
	}


	@Override
	public User findByUsername(String username) {
		return userMapper.findByUsername(username);
	}


	@Override
	public Set<String> findRoles(String username) {
		return userMapper.findRoles(username);
	}


	@Override
	public Set<String> findPermissions(String username) {
		return userMapper.findPermissions(username);
	}
	
	/**
	 * 
	* @Title: formatRolePrivs 
	* @Description: TODO
	* @param @param roleId
	* @param @param privids
	* @param @return   
	* @return List<Map<String,Integer>>  
	* @author Tangyinbo   
	* @date 2014-6-11 下午4:21:37
	* @throws
	 */
	private List<Map<String,Integer>> formatUerRoles(Integer roleId,Integer ...privids){
		Map<String,Integer> userRole= null;
		List<Map<String,Integer>> userRoles = new ArrayList<Map<String,Integer>>();
		for(Integer i:privids){
			userRole= new HashMap<String,Integer>(); 
			userRole.put("userId", roleId);
			userRole.put("roleId", i);
			userRoles.add(userRole);
		}
		return userRoles;
	}


	@Override
	public List<User> selectUsers(Pagination pagination) {
		int count = userMapper.selectUserCount();
		pagination.setRowCount(count);
		pagination.setCurrentPage(pagination.getCurrentPage());
		List<User> users =userMapper.selectUsers(pagination);
		return users;
	}
}
