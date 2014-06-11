package cn.cowboy.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cowboy.dao.RoleMapper;
import cn.cowboy.domain.Roles;
import cn.cowboy.service.RoleService;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleMapper roleMapper;
		
	@Override
	public Roles createRole(Roles role) {
		roleMapper.createRole(role);
		return role;
	}

	@Override
	public void deleteRole(Integer roleId) {
		roleMapper.deleteRole(roleId);
	}

	@Override
	public void correlationPermissions(Integer roleId, Integer... permissionIds) {
	
		roleMapper.correlationPermissions(formatRolePrivs(roleId,permissionIds));
	}

	@Override
	public void uncorrelationPermissions(Integer roleId, Integer... permissionIds) {
		roleMapper.uncorrelationPermissions(formatRolePrivs(roleId,permissionIds));
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
	* @date 2014-6-11 下午4:05:39
	* @throws
	 */
	private List<Map<String,Integer>> formatRolePrivs(Integer roleId,Integer ...privids){
		Map<String,Integer> rolePriv= null;
		List<Map<String,Integer>> rolePrivs = new ArrayList<Map<String,Integer>>();
		for(Integer i:privids){
			rolePriv= new HashMap<String,Integer>(); 
			rolePriv.put("roleId", roleId);
			rolePriv.put("privId", i);
			rolePrivs.add(rolePriv);
		}
		return rolePrivs;
	}
}
