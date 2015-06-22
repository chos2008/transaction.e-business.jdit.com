/*
 * @(#)UserController.java	1.0 2015-3-8 ����10:42:38
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
package org.chos.transaction.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.chos.transaction.Merchant;
import org.chos.transaction.User;
import org.chos.transaction.UserService;
import org.chos.transaction.alapay.AlapayAccount;
import org.chos.transaction.alapay.AlapayAccountService;
import org.chos.transaction.passport.HttpContextSessionManager;
import org.chos.transaction.passport.Session;
import org.chos.transaction.user.UserAddress;
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
 * @author luoxiaoyong
 * @version 1.0  2015-3-8 ����10:42:38
 * @since 1.0
 */
@Controller
public class UserController {
	
	@Autowired
	private HttpContextSessionManager httpContextSessionManager;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AlapayAccountService alapayAccountService;

	@RequestMapping(value = "/user/{id}")
	public String account(@PathVariable String id, HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		User user = userService.getUser(session.getUserId());
		model.addAttribute("user", user);
		
		Merchant merchant = userService.getMerchantByUserId(session.getUserId());
		model.addAttribute("merchant", merchant);
		return "user/account";
	}
	
	@RequestMapping(value = "/user/{id}/address")
	public String getUserAddress(@PathVariable String id, HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		List<UserAddress> addresses = userService.getUserAddress(session.getUserId());
		model.addAttribute("addresses", addresses);
		return "user/user-address-mgr";
	}
	
	@RequestMapping(value = "/address/add/view")
	public String addUserAddress0(HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		User user = userService.getUser(session.getUserId());
		model.addAttribute("user", user);
		return "user/user-address";
	}
	
	@RequestMapping(value = "/address/add")
	@ResponseBody
	public Object addUserAddress(HttpServletRequest request, HttpServletResponse response, Model model) {
		Map<String, Object> resp = new HashMap<String, Object>();
		String username = request.getParameter("username");
		if (StringUtils.isBlank(username)) {
			resp.put("code", ErrorCode.PARAM_ERROR);
			return resp;
		}
		String contact = request.getParameter("contact");
		if (StringUtils.isBlank(contact)) {
			resp.put("code", ErrorCode.PARAM_ERROR);
			return resp;
		}
		String region = request.getParameter("region");
		if (StringUtils.isBlank(contact)) {
			resp.put("code", ErrorCode.PARAM_ERROR);
			return resp;
		}
		String address = request.getParameter("address");
		if (StringUtils.isBlank(contact)) {
			resp.put("code", ErrorCode.PARAM_ERROR);
			return resp;
		}
		String postcode = request.getParameter("postcode");
		Session session = httpContextSessionManager.getSession(request);
		UserAddress userAddress = new UserAddress();
		userAddress.setUserId(session.getUserId());
		userAddress.setUsername(username);
		userAddress.setContact(contact);
		userAddress.setPostCode(postcode);
		userAddress.setAddress(region + " " + address);
		userAddress.setCreation(new Date());
		
		userService.addUserAddress(userAddress);
		resp.put("code", 0);
		return resp;
	}
	
	@RequestMapping(value = "/user/bindAlaPayAccount")
	public String bindAlaPayAccount(HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		User user = userService.getUser(session.getUserId());
		model.addAttribute("user", user);
		
		Merchant merchant = userService.getMerchantByUserId(session.getUserId());
		model.addAttribute("merchant", merchant);
		return "user/bind-alapay";
	}
	
	@RequestMapping(value = "/user/bindAlaPayAccount/action")
	@ResponseBody
	public Object bindAlaPayAccount1(HttpServletRequest request, HttpServletResponse response, Model model) {
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
		AlapayAccount account = alapayAccountService.getByUsername(username);
		if (account == null) {
			resp.put("code", UserErrorCode.USER_NOT_EXISTS);
			return resp;
			
		}
		if (! account.getPassword().equals(password)) {
			resp.put("code", UserErrorCode.PASSWORD_NOT_MATCHES);
			return resp;
		}
		Session session = httpContextSessionManager.getSession(request);
		User user = userService.getUser(session.getUserId());
		if (! StringUtils.isBlank(user.getAlapayAccount())) {
			resp.put("code", UserErrorCode.USER_ALREADY_BIND_ALAPAY);
			return resp;
		}
		user.setAlapayAccount(username);
		user.setUpdation(new Date());
		userService.updateUserInfo(user);
		resp.put("code", 0);
		return resp;
	}
	
	@RequestMapping(value = "/user/{id}/settings")
	public String settings(@PathVariable String id, HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		User user = userService.getUser(session.getUserId());
		model.addAttribute("user", user);
		
		Merchant merchant = userService.getMerchantByUserId(session.getUserId());
		model.addAttribute("merchant", merchant);
		return "user/settings";
	}
}
