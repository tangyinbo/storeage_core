package cn.cowboy.dao;

import cn.cowboy.domain.Permission;

public interface PermissionMapper {

	public void createPermission(Permission permission);

	public void deletePermission(Integer permissionId);
}
