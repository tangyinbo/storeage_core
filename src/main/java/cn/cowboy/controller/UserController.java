package cn.cowboy.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cowboy.domain.User;
import cn.cowboy.service.UserService;



@RequestMapping("/user")
@Controller
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	@RequestMapping("/first")
	public String first(){
		//List<User> users = userService.getAllUser();
		User user = new User();
		user.setName("wujianyuan4");
		user.setUser_name("heheheh4");
		user.setRegister_date(new Date());
		user.setPasswd("123456");
		userService.addUser(user);
		return "first";
	}
}
