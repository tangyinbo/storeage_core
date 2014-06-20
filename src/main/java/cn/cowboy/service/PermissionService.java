package cn.cowboy.service;

import java.security.Permissions;
import java.util.List;
import java.util.Map;

import cn.cowboy.domain.Permission;
import cn.cowboy.provide.common.Pagination;

public interface PermissionService {
	public Permission createPermission(Permission permission);
	public void deletePermission(Integer permissionId);
	public List<Map<String,Object>> getPrivs();
	public List<Permission> selectList(Pagination pagination);
}
