package cn.cowboy.dao;

import java.util.List;

import cn.cowboy.domain.Permission;

public interface PermissionMapper {

	public void createPermission(Permission permission);

	public void deletePermission(Integer permissionId);

	public List<Permission> getPrivs(Integer parentPriv);
}
