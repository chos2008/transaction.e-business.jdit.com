/*
 * @(#)PassportController.java	1.0 2015-3-22 下午02:15:50
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
package org.chos.transaction.passport.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.chos.servlet.http.ChosHttpServletResponse;
import org.chos.transaction.User;
import org.chos.transaction.UserAlreadyExistException;
import org.chos.transaction.UserService;
import org.chos.transaction.controller.ErrorCode;
import org.chos.transaction.passport.HttpContextSessionManager;
import org.chos.transaction.passport.PassportService;
import org.chos.transaction.passport.SessionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-3-22 下午02:15:50
 * @since 1.0
 */
@Controller
public class PassportController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private HttpContextSessionManager httpContextSessionManager;
	
	@Autowired
	private PassportService passportService;
	
	@RequestMapping(value = "/register{id}")
	public String input(@PathVariable String id, HttpServletRequest request, HttpServletResponse response, Model model) {
		return "register" + id;
	}
	
	@RequestMapping(value = "/user/register")
	@ResponseBody
	public Object register(HttpServletRequest request, HttpServletResponse response, Model model) {
		Map<String, Object> resp = new HashMap<String, Object>();
		String username = request.getParameter("username");
		if (StringUtils.isBlank(username)) {
			resp.put("code", ErrorCode.PARAM_ERROR);
			return resp;
		}
		String password = request.getParameter("password");
		if (StringUtils.isBlank(password)) {
			resp.put("code", ErrorCode.PARAM_ERROR);
			return resp;
		}
		String mobile = request.getParameter("mobile");
		if (! StringUtils.isBlank(mobile) && ! mobile.matches("1[0-9]{10}")) {
			resp.put("code", ErrorCode.MOBILE_FORMAT_ERROR);
			return resp;
		}
		String email = request.getParameter("email");
		
		try {
			userService.create(username, password, mobile, email);
		} catch (UserAlreadyExistException e) {
			resp.put("code", ErrorCode.USER_ALREADY_EXISTS);
			return resp;
		}
		resp.put("code", 0);
		return resp;
	}
	
	@RequestMapping(value = "/login")
	public String logininput(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "login";
	}
	
	@RequestMapping(value = "/user/login")
	@ResponseBody
	public Object login(HttpServletRequest request, HttpServletResponse response, Model model) {
		Map<String, Object> resp = new HashMap<String, Object>();
		String username = request.getParameter("username");
		if (StringUtils.isBlank(username)) {
			resp.put("code", ErrorCode.PARAM_ERROR);
			return resp;
		}
		String password = request.getParameter("password");
		if (StringUtils.isBlank(password)) {
			resp.put("code", ErrorCode.PARAM_ERROR);
			return resp;
		}
		try {
			passportService.createSession(username, password, request, response);
		} catch (SessionException e) {
			resp.put("code", e.getCode());
			return resp;
		}
		resp.put("code", 0);
		return resp;
	}
}
