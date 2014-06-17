package cn.cowboy.provide.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 
 * @ClassName: WebSessionUtils
 * @Description: session 工具类
 * @author Tangyinbo
 * @date 2014-6-17 下午4:04:41
 * 
 */
public class WebSessionUtils {

	public static HttpSession getSession(HttpServletRequest request) {
		return request.getSession();
	}

	public static void saveAttribute(HttpServletRequest request, String key, Object value) {
		getSession(request).setAttribute(key, value);
	}
}
