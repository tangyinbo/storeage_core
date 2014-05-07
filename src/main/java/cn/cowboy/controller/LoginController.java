package cn.cowboy.controller;

import java.util.Map;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cowboy.domain.User;

@Controller
public class LoginController {
	private static Logger log = LoggerFactory.getLogger(LoginController.class);
	@RequestMapping("/login")
	public String login(User user,ModelMap model){
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
		SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getPasswd());
		try{
			subject.login(token);
		}catch(Exception e){
			log.error("登录失败",e);
			model.addAttribute("mes", "登录失败");
			return "index";
		}
		return "main";
	}
}
