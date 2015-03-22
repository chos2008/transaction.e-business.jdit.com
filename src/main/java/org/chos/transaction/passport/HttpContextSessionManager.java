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

import javax.servlet.http.HttpServletResponse;

import org.chos.servlet.http.Cookie;
import org.chos.transaction.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired()
	private SqlSessionTemplate template;
	
	public Session openSession(User user, HttpServletResponse response) {
		Session session = new Session();
		session.setUserId(user.getId());
		session.setUsername(user.getUsername());
		template.insert("openSession", session);
		Cookie cookie = new Cookie("ut", session.getToken());
//		cookie.setSecure(true);
		cookie.setHttpOnly(true);
		response.addCookie(cookie);
		return session;
	}
}
