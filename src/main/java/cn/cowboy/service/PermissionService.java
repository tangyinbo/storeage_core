package cn.cowboy.service;

import cn.cowboy.domain.Permission;

public interface PermissionService {
	public Permission createPermission(Permission permission);
	public void deletePermission(Integer permissionId);
}
