package cn.cowboy.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.cowboy.domain.User;
import cn.cowboy.provide.utils.WebSessionUtils;
import cn.cowboy.service.PermissionService;

@SessionAttributes(value={"user"})
@Controller
public class LoginController {
	private static Logger log = LoggerFactory.getLogger(LoginController.class);
	
	
	@Autowired
	private PermissionService permissionService;
	
	@RequestMapping("/login")
	public String login(User user, ModelMap model,HttpServletRequest request) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getPassword());
		String msg = "";
		String dest ="login";
		try {
			subject.login(token);
		} catch (UnknownAccountException e) {
			log.error("用户名不存在", e);
			msg = "用户名/密码错误";
		} catch (IncorrectCredentialsException e) {
			log.error("密码错误", e);
			msg= "用户名/密码错误";
		} catch (LockedAccountException e) {
			log.error("账户被锁定", e);
			msg= "账户被锁定";
		} catch (AuthenticationException e) {
			log.error("登录失败", e);
			// 其他错误，比如锁定，如果想单独处理请单独catch处理
			msg = "其他错误：" + e.getMessage();
		} catch (Exception e) {
			log.error("登录失败", e);
			msg = "其他错误：" + e.getMessage();
		}
		if(StringUtils.hasLength(msg)){
			model.addAttribute("msg", msg);
		}else{
			dest="redirect:/list";
		}
		return dest;
	}
	
	@RequiresAuthentication
	@RequestMapping("/list")
	public String loginSuccess(@ModelAttribute(value="user") User user,HttpServletRequest request,HttpServletResponse response){
		//权限数据放入session中
		List<Map<String,Object>> privs = permissionService.getPrivs();
		WebSessionUtils.saveAttribute(request, "menuPriv", privs);
		return "index";
	}
}
