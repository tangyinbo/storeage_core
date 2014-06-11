package cn.cowboy.dao;

import cn.cowboy.domain.Permission;

public interface PermissionMapper {

	public Permission createPermission(Permission permission);

	public void deletePermission(Integer permissionId);
}
