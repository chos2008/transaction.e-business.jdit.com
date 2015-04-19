/*
 * @(#)HttpContextSessionManager.java	1.0 2015-3-22 ����03:36:50
 *
 * Copyright 2008 WWW.YHD.COM. All rights reserved.
 *      YIHAODIAN PROPRIETARY/CONFIDENTIAL. 
 *       Use is subject to license terms.
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the WWW.YHD.COM License is distributed on an "AS 
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either ex-
 * press or implied. See the License for the specific language govern-
 * ing permissions and limitations under the License.
 */
package org.chos.transaction.passport;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.chos.servlet.http.Cookie;
import org.chos.transaction.User;
import org.chos.transaction.UserService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-3-22 ����03:36:50
 * @since 1.0
 */
@Service
public class HttpContextSessionManager {
	
	private static final String USER_TOKEN = "ut";

	@Autowired()
	@Qualifier(value = "sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private SessionManager sessionManager;
	
	private javax.servlet.http.Cookie getCookie(HttpServletRequest request, String name) {
		javax.servlet.http.Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			return null;
		}
		for (javax.servlet.http.Cookie cookie : cookies) {
			if (cookie.getName().equals(name)) {
				return cookie;
			}
		}
		return null;
	}
	
	public Session getSession(long userId, String ut, HttpServletResponse response) {
		Session session = sessionManager.getSession(ut);
		if (session == null) {
			session = sessionManager.getSession(userId, true);
			if (session == null) {
				User user = userService.getUser(userId);
				return openSession(user, response);
			} else {
				openSession0(session, response);
			}
			return session;
		}
		return session;
	}
	
	public Session getSession(long userId, HttpServletRequest request, HttpServletResponse response) {
		javax.servlet.http.Cookie cookie = getCookie(request, USER_TOKEN);
		if (cookie == null) {
			Session session = sessionManager.getSession(userId, true);
			if (session == null) {
				User user = userService.getUser(userId);
				return openSession(user, response);
			} else {
				openSession0(session, response);
			}
			return session;
		}
		return getSession(userId, cookie.getValue(), response);
	}
	
	public Session getSession(HttpServletRequest request) {
		javax.servlet.http.Cookie cookie = getCookie(request, USER_TOKEN);
		if (cookie == null) {
			return null;
		}
		return sessionManager.getSession(cookie.getValue());
	}
	
	public Session getSession(User user, String ut, HttpServletResponse response) {
		Session session = sessionManager.getSession(ut);
		if (session == null) {
			session = sessionManager.getSession(user.getId(), true);
			if (session == null) {
				return openSession(user, response);
			} else {
				openSession0(session, response);
			}
			return session;
		}
		return session;
	}
	
	public Session getSession(User user, HttpServletRequest request, HttpServletResponse response) {
		javax.servlet.http.Cookie cookie = getCookie(request, USER_TOKEN);
		if (cookie == null) {
			Session session = sessionManager.getSession(user.getId(), true);
			if (session == null) {
				return openSession(user, response);
			} else {
				openSession0(session, response);
			}
			return session;
		}
		return getSession(user, cookie.getValue(), response);
	}
	
	private Session openSession(User user, HttpServletResponse response) {
		Session session = new Session();
		session.setUserId(user.getId());
		template.insert("openSession", session);
		openSession0(session, response);
		return session;
	}
	
	private Session openSession0(Session session, HttpServletResponse response) {
		Cookie cookie = new Cookie(USER_TOKEN, session.getToken());
//		cookie.setSecure(true);
		cookie.setPath("/");
		cookie.setHttpOnly(true);
		response.addCookie(cookie);
		return session;
	}
}
