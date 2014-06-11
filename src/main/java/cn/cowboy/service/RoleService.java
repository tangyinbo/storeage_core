package cn.cowboy.service;

import cn.cowboy.domain.Roles;

public interface RoleService {
	public Roles createRole(Roles role);

	public void deleteRole(Integer roleId);

	// 添加角色-权限之间关系
	public void correlationPermissions(Integer roleId, Integer... permissionIds);

	// 移除角色-权限之间关系
	public void uncorrelationPermissions(Integer roleId, Integer... permissionIds);//
}
