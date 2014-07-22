package cn.cowboy.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;

import cn.cowboy.domain.Permission;
import cn.cowboy.provide.common.Pagination;
import cn.cowboy.provide.utils.JsTreeHelper;
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
	
	@RequestMapping(value="/privTree")
	public @ResponseBody String getPrivTree(){
		List<JsTreeHelper> jstree = permissionService.getJsTree();
		return JSON.toJSONString(jstree);
	}
	
	@RequestMapping(value="/ajaxTest")
	public @ResponseBody String ajaxTest() throws UnsupportedEncodingException{
		Map<String,Object>  data = new HashMap<String,Object>();
		List<Map<String,Object>> nodes = new ArrayList<Map<String,Object>>();
		nodes.add(getFormatString("node_1","哈哈","icon_tree",true,false,true,null));
		nodes.add(getFormatString("node_2","node_test_2","",true,false,true,null));
		nodes.add(getFormatString("node_3","node_test_3","icon_tree",true,false,true,null));
		nodes.add(getFormatString("node_4","node_test_4","",true,false,true,null));
		nodes.add(getFormatString("node_5","node_test_5","",true,false,true,null));
		nodes.add(getFormatString("node_6","node_test_6","",true,false,true,null));
		return JSONUtils.toJSONString(nodes);
	}
	
	
	private Map<String,Object> getFormatString(String id,String text,String icon,boolean opened,boolean disabled,boolean selected,List<Map<String,Object>> children){
		 Map<String,Object> node= new HashMap<String,Object>();
		node.put("id", id);
		node.put("text", text);
		node.put("icon", icon);
		Map<String,Boolean> state  = new HashMap<String,Boolean>();
		state.put("opened", opened);
		state.put("disabled", disabled);
		state.put("selected", selected);
		node.put("state", state);
		if(children!=null){
			node.put("children", children);
		}
		return node;
	}
}
