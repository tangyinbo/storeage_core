package cn.cowboy.service.impl;

import java.security.Permissions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cowboy.dao.PermissionMapper;
import cn.cowboy.domain.Permission;
import cn.cowboy.provide.common.Pagination;
import cn.cowboy.provide.utils.JsTreeHelper;
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
	private static final int DEFAULT_ANCESTORPRIVID = 0; // 默认最顶级的菜单id为0
	private static final String PRIVID = "privId";
	private static final String PRIVNAME = "privName";
	private static final String PRIVURL = "privUrl";
	private static final String SUBPRIV = "subPriv";
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

	@Override
	public List<Map<String, Object>> getPrivs() {
		Integer parentPriv = 0;
		List<Permission> privs = permissionMapper.getPrivs(parentPriv);
		List<Map<String, Object>> privTree = getPrivTree(privs, DEFAULT_ANCESTORPRIVID);
		return privTree;
	}

	/**
	 * 
	 * @Title: getPrivTree
	 * @Description: TODO
	 * @param @return
	 * @return List<Map<String,Object>>
	 * @author Tangyinbo
	 * @date 2014-6-17 下午3:21:57
	 * @throws
	 */
	private List<Map<String, Object>> getPrivTree(List<Permission> privs, int ancestorPrivId) {
		List<Map<String, Object>> privTree = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = null;
		for (Permission p : privs) {
			if (p.getParentPriv() == ancestorPrivId) {
				map = new HashMap<String, Object>();
				map.put(PRIVID, p.getPrivId());
				map.put(PRIVNAME, p.getDescription());
				map.put(PRIVURL, p.getPrivUrl());
				map.put(SUBPRIV, getPrivTree(privs, p.getPrivId()));
				privTree.add(map);
			}
		}
		return privTree;
	}

	@Override
	public List<Permission> selectList(Pagination pagination) {
		int count = permissionMapper.selectPermissionsCount();
		pagination.setRowCount(count);
		return permissionMapper.selectPermissions(pagination);
	}

	@Override
	public List<JsTreeHelper> getJsTree() {
		List<Permission> privs = permissionMapper.getJsTree();
		List<JsTreeHelper> jstree =recursionTree(privs,null);
		return jstree;
	}

	/**
	 * 
	 * @Title: recursionTree
	 * @Description: 递归权限树
	 * @param @param privs
	 * @param @return
	 * @return JsTreeHelper
	 * @author Tangyinbo
	 * @date 2014-7-18 下午2:28:21
	 * @throws
	 */
	private List<JsTreeHelper> recursionTree(List<Permission> privs, Integer parentPriv) {
		List<JsTreeHelper> jstree = new ArrayList<JsTreeHelper>();
		JsTreeHelper tree = null;
		Map<String,Object> state = null;
		for (Permission priv : privs) {
			if (parentPriv == priv.getParentPriv()) {
				tree = new JsTreeHelper();
				tree.setId(priv.getPrivId() + "");
				tree.setText(priv.getDescription());
				tree.setChildren(recursionTree(privs, priv.getPrivId()));
				if(tree.getChildren().size()==0){
					tree.setIcon("icon_tree");
				}
				state = new HashMap<String,Object>();
				state.put("opened", true);
				tree.setState(state);
				jstree.add(tree);
			}
		}
		return jstree;
	}
}
