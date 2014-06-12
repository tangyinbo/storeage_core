package cn.cowboy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cowboy.dao.PermissionMapper;
import cn.cowboy.domain.Permission;
import cn.cowboy.service.PermissionService;

/**
 * 
 * @ClassName: PermissionServiceImpl
 * @Description: TODO
 * @author Tangyinbo
 * @date 2014-6-11 上午10:01:30
 * 
 */
@Service(value = "permissionService")
public class PermissionServiceImpl implements PermissionService {
	@Autowired
	private PermissionMapper permissionMapper;

	@Override
	public Permission createPermission(Permission permission) {
		permissionMapper.createPermission(permission);
		return permission;
	}

	@Override
	public void deletePermission(Integer permissionId) {
		permissionMapper.deletePermission(permissionId);
	}

}
