/*
 * @(#)PassportServiceImpl.java	1.0 2015-4-5 下午05:59:58
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

import org.chos.servlet.http.ChosHttpServletResponse;
import org.chos.transaction.User;
import org.chos.transaction.UserService;
import org.chos.transaction.controller.UserErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-5 下午05:59:58
 * @since 1.0
 */
@Service
public class PassportServiceImpl implements PassportService {

	@Autowired
	private UserService userService;
	
	@Autowired
	private HttpContextSessionManager httpContextSessionManager;
	
	public User auth(String username, String password) throws SessionException {
		User user = userService.getUser(username);
		if (user == null) {
			throw new SessionException(UserErrorCode.USER_NOT_EXISTS);
		}
		if (! password.equals(user.getPassword())) {
			throw new SessionException(UserErrorCode.PASSWORD_NOT_MATCHES);
		}
		return user;
	}
	
	public void createSession(String username, String password, HttpServletRequest request, HttpServletResponse response) throws SessionException {
		User user = auth(username, password);
		httpContextSessionManager.getSession(user, request, new ChosHttpServletResponse(response));
	}
}
