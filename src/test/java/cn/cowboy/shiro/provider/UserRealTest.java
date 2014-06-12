package cn.cowboy.shiro.provider;

import junit.framework.Assert;

import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.junit.Test;

import cn.cowboy.parent.BaseTest;

public class UserRealTest extends BaseTest{
	@Test
	public void testLoginSuccess(){
		login(u2.getUserName(), password);
		Assert.assertTrue(subject().isAuthenticated());
	}
	
	 @Test(expected = UnknownAccountException.class)
	    public void testLoginFailWithUnknownUsername() {
	        login( u1.getUserName() + "1", password);
	    }

	    @Test(expected = IncorrectCredentialsException.class)
	    public void testLoginFailWithErrorPassowrd() {
	        login( u1.getUserName(), password + "1");
	    }

	    @Test(expected = LockedAccountException.class)
	    public void testLoginFailWithLocked() {
	        login( u4.getUserName(), password + "1");
	    }

	    @Test(expected = ExcessiveAttemptsException.class)
	    public void testLoginFailWithLimitRetryCount() {
	        for(int i = 1; i <= 5; i++) {
	            try {
	                login( u3.getUserName(), password + "1");
	            } catch (Exception e) {/*ignore*/}
	        }
	        login( u3.getUserName(), password + "1");

	        //需要清空缓存，否则后续的执行就会遇到问题(或者使用一个全新账户测试)
	    }


	    @Test
	    public void testHasRole() {
	        login( u1.getUserName(), password );
	        Assert.assertTrue(subject().hasRole("admin"));
	    }

	    @Test
	    public void testNoRole() {
	        login( u2.getUserName(), password);
	        Assert.assertFalse(subject().hasRole("admin"));
	    }

	    @Test
	    public void testHasPermission() {
	        login( u1.getUserName(), password);
	        Assert.assertTrue(subject().isPermittedAll("user:create", "menu:create"));
	    }

	    @Test
	    public void testNoPermission() {
	        login( u2.getUserName(), password);
	        Assert.assertFalse(subject().isPermitted("menu:create"));
	    }
}
