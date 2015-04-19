/*
 * @(#)UserServiceImpl.java	1.0 2015-3-8 ����10:29:43
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
package org.chos.transaction;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.chos.servlet.http.ChosHttpServletResponse;
import org.chos.transaction.passport.HttpContextSessionManager;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-3-8 ����10:29:43
 * @since 1.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired()
	@Qualifier(value = "sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	@Autowired
	private HttpContextSessionManager httpContextSessionManager;
	
	public User create(String username, String password, String mobile, String email, 
			boolean autoSession, HttpServletRequest request, HttpServletResponse response) {
		if (StringUtils.isBlank(username)) {
			username = UUID.randomUUID().toString();
		}
		if (StringUtils.isBlank(password)) {
			password = UUID.randomUUID().toString();
		}
		User user = getUser(username);
		if (user == null) {
			user = new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setMobile(mobile);
			user.setEmail(email);
			user.setCreation(new Date());
			create(user);
		}
		if (autoSession) {
			httpContextSessionManager.getSession(user, request, new ChosHttpServletResponse(response));
		}
		return user;
	}
	
	public User create(String username, String password, String mobile, String email) throws UserAlreadyExistException {
		User user = getUser(username);
		if (user != null) {
			throw new UserAlreadyExistException();
		}
		user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setMobile(mobile);
		user.setEmail(email);
		user.setCreation(new Date());
		create(user);
		return user;
	}
	
	public void create(User user) {
		template.insert("user-insert", user);
	}
	
	public User getUser(long userId) {
		return template.selectOne("user-getByUserId", userId);
	}
	
	public User getUser(String username) {
		return template.selectOne("user-getByUsername", username);
	}
}
