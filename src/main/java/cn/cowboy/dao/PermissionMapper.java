package cn.cowboy.dao;

import java.security.Permissions;
import java.util.List;

import cn.cowboy.domain.Permission;
import cn.cowboy.provide.common.Pagination;

public interface PermissionMapper {

	public void createPermission(Permission permission);

	public void deletePermission(Integer permissionId);

	public List<Permission> getPrivs(Integer parentPriv);

	public List<Permission> selectPermissions(Pagination pagination);

	public int selectPermissionsCount();
}
