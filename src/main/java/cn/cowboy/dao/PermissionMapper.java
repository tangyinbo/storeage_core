package cn.cowboy.dao;

import java.security.Permissions;
import java.util.List;

import cn.cowboy.domain.Permission;
import cn.cowboy.provide.common.Pagination;
import cn.cowboy.provide.utils.JsTreeHelper;

public interface PermissionMapper {

	public void createPermission(Permission permission);

	public void deletePermission(Integer permissionId);

	public List<Permission> getPrivs(Integer parentPriv);

	public List<Permission> selectPermissions(Pagination pagination);

	public int selectPermissionsCount();

	public List<Permission> getJsTree();
}
