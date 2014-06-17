package cn.cowboy.service;

import java.util.List;
import java.util.Map;

import cn.cowboy.domain.Permission;

public interface PermissionService {
	public Permission createPermission(Permission permission);
	public void deletePermission(Integer permissionId);
	public List<Map<String,Object>> getPrivs();
}
