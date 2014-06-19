package cn.cowboy.controller;

import java.util.Date;
import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cowboy.domain.User;
import cn.cowboy.service.UserService;



@RequestMapping("/system/user")
@Controller
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequiresPermissions(value="system:user:first2")
	@RequestMapping("/first")
	public String first(){
		//List<User> users = userService.getAllUser();
		User user = new User();
		user.setUserName("wujianyuan5");
		user.setPassword("123456");
		userService.createUser(user);
		return "first";
	}
	
	/**
	 * 
	* @Title: creatUser 
	* @Description: 创建用户
	* @param @return   
	* @return String  
	* @author Tangyinbo   
	* @date 2014-6-19 下午3:19:35
	* @throws
	 */
	@RequiresPermissions(value={"system:user:create"})
	@RequestMapping("/create")
	public String creatUser(User user){
		userService.createUser(user);
		return "index";
	}
}
