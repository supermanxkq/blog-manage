package com.xukaiqiang.blog.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.Assert;

/**
 * @Description:(Cookie 辅助类)
 * @author wang.zx 
 * @date 2014-12-20 下午10:23:10
 * @version 1.0
 */
public class CookieUtils {

	/**
	 * @Description:(获取cookie)
	 * @author wang.zx 
	 * @date 2014-12-20 下午10:23:37
	 * @version 1.0
	 * @param request
	 * @param name
	 * @return
	 */
	public static Cookie getCookie(HttpServletRequest request, String name) {
		Assert.notNull(request);
		Cookie[] cookies = request.getCookies();
		if (cookies != null && cookies.length > 0) {
			for (Cookie c : cookies) {
				if (c.getName().equals(name)) {
					return c;
				}
			}
		}
		return null;
	}

	/**
	 * @Description:(根据部署路径，将cookie保存在根目录)
	 * @author wang.zx 
	 * @date 2014-12-20 下午10:24:04
	 * @param request
	 * @param response
	 * @param name
	 * @param value
	 * @param expiry
	 * @return
	 */
	public static Cookie addCookie(HttpServletRequest request,
			HttpServletResponse response, String name, String value,
			Integer expiry) {
		Cookie cookie = new Cookie(name, value);
		if (expiry != null) {
			cookie.setMaxAge(expiry);
		}
		String ctx = request.getContextPath();
		cookie.setPath(StringUtils.isBlank(ctx) ? "/" : ctx);
		response.addCookie(cookie);
		return cookie;
	}

	/**
	 * @Description:(删除cookie)
	 * @author wang.zx 
	 * @date 2014-12-20 下午10:24:46
	 * @version 1.0
	 * @param response
	 * @param name
	 * @param domain
	 */
	public static void cancleCookie(HttpServletResponse response, String name,
			String domain) {
		Cookie cookie = new Cookie(name, null);
		cookie.setMaxAge(0);
		cookie.setPath("/");
		if (!StringUtils.isBlank(domain)) {
			cookie.setDomain(domain);
		}
		response.addCookie(cookie);
	}
}
