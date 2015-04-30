/*
 * @(#)BusinessPassportController.java	1.0 2015-3-22 下午02:16:09
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

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.chos.transaction.Merchant;
import org.chos.transaction.User;
import org.chos.transaction.UserService;
import org.chos.transaction.passport.HttpContextSessionManager;
import org.chos.transaction.passport.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-3-22 下午02:16:09
 * @since 1.0
 */
@Controller
public class BusinessPassportController {
	
	@Autowired
	private HttpContextSessionManager httpContextSessionManager;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/continue")
	public String gogogo(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "register-success";
	}
	
	@RequestMapping(value = "/business/register")
	public String input(HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
		Session session = httpContextSessionManager.getSession(request);
		if (session == null) {
			response.sendRedirect("../login.shtml?returnUrl=/business/register.shtml");
		}
		Merchant merchant = userService.getMerchantByUserId(session.getUserId());
		if (merchant != null) {
			response.sendRedirect("/merchant/1234.shtml");
		}
		return "business/register-businesses";
	}
	
	@RequestMapping(value = "/user/business/register")
	@ResponseBody
	public Object register(HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
		Map<String, Object> resp = new HashMap<String, Object>();
		Session session = httpContextSessionManager.getSession(request);
		if (session == null) {
			response.sendRedirect("../login.shtml?returnUrl=/business/register.shtml");
		}
		String username = request.getParameter("username");
		if (StringUtils.isBlank(username)) {
			resp.put("code", 1000);
			return resp;
		}
		String mobile = request.getParameter("mobile");
		if (! StringUtils.isBlank(mobile) && ! mobile.matches("1[0-9]{10}")) {
			resp.put("code", 1100);
			return resp;
		}
		String email = request.getParameter("email");
		
//		userService.
		Merchant merchant = new Merchant();
		merchant.setName(username);
		merchant.setUserId(session.getUserId());
		merchant.setMobile(mobile);
		merchant.setCreation(new Date());
		userService.createMerchant(merchant);
		resp.put("code", 0);
		return resp;
	}
	
	@RequestMapping(value = "/business/login")
	public String logininput(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "login";
	}
	
	@RequestMapping(value = "/user/business/login")
	@ResponseBody
	public Object login(HttpServletRequest request, HttpServletResponse response, Model model) {
		Map<String, Object> resp = new HashMap<String, Object>();
		String username = request.getParameter("username");
		if (StringUtils.isBlank(username)) {
			resp.put("code", 1000);
			return resp;
		}
		String password = request.getParameter("password");
		if (StringUtils.isBlank(password)) {
			resp.put("code", 1000);
			return resp;
		}
		User user = userService.getUser(username);
		if (user == null) {
			resp.put("code", 1000);
			return resp;
		}
		resp.put("code", 0);
		return resp;
	}
}
