package cn.cowboy.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.filter.PathMatchingFilter;

/**
 * 
 * @ClassName: PermissionMatchFilter
 * @Description: 对用用户访问的路径的过滤
 * @author Tangyinbo
 * @date 2014-6-16 上午11:04:12
 * 
 */
public class PermissionMatchFilter extends AccessControlFilter {

	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
		System.out.println("========isAccessAllowed=========" + mappedValue);
		if (isAllowPermission(request, response))
			return true;
		return false;
	}

	private boolean isAllowPermission(ServletRequest request, ServletResponse response) {
		String requestURI = getPathWithinApplication(request);
		System.out.println("--------------->"+requestURI);
		boolean a =SecurityUtils.getSubject().isPermitted(requestURI);
		return false;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		return false;
	}

}
