package cn.cowboy.shiro.provide;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.cowboy.domain.User;
import cn.cowboy.service.UserService;

/**
 * 
* @ClassName: UserRealm
* @Description: TODO
* @author Tangyinbo
* @date 2014-6-12 下午2:41:46
*
 */
public class UserRealm extends AuthorizingRealm{
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * 授权信息获取
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//获取用户名
		String username = (String) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		simpleAuthorizationInfo.setRoles(userService.findRoles(username));
		simpleAuthorizationInfo.setStringPermissions(userService.findPermissions(username));
		return simpleAuthorizationInfo;
	}

	/**
	 * 登陆认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username = (String) token.getPrincipal();
		User user = userService.findByUsername(username);
		if(user==null){
			throw new UnknownAccountException();//账号不存在
		}
		//账户的不同状态...相应操作
		if("S0X".equals(user.getStat())){
			throw new LockedAccountException();
		}
		
		
		SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user.getUserName(),user.getPassword(),ByteSource.Util.bytes(user.getCredentialsSalt()),getName());
		
		return simpleAuthenticationInfo;
	}

}
