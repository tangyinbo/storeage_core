package cn.cowboy.controller;

import java.security.Permissions;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cowboy.domain.Permission;
import cn.cowboy.provide.common.Pagination;
import cn.cowboy.service.PermissionService;

/**
 * 
* @ClassName: PermissionController
* @Description: 权限管理
* @author Tangyinbo
* @date 2014-6-20 上午11:25:15
*
 */
@Controller
@RequestMapping("/system/priv")
public class PermissionController {
	@Autowired
	private PermissionService permissionService;
	
	@RequestMapping("/list")
	public String list(int page,ModelMap model){
		Pagination pagination = new Pagination();
		pagination.setCurrentPage(page);
		List<Permission> permissions =permissionService.selectList(pagination);
		model.addAttribute("privs", permissions);
		model.addAttribute("pagination", pagination);
		return "/priv/list";
	}
}
