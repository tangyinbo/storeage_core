package cn.cowboy.dao;

import java.util.List;
import java.util.Map;

import cn.cowboy.domain.Roles;

/**
 * 
* @ClassName: RoleMapper
* @Description: 角色持久层
* @author Tangyinbo
* @date 2014-6-11 上午10:08:33
*
 */
public interface RoleMapper {

	public int createRole(Roles role);

	public void deleteRole(Integer roleId);

	public void correlationPermissions(List<Map<String,Integer>> rolePrivs);

	public void uncorrelationPermissions(List<Map<String,Integer>> rolePrivs);

}
