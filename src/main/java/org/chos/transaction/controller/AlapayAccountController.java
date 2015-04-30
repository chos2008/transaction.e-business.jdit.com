/*
 * @(#)AlapayAccountController.java	1.0 2015-5-1 上午12:39:09
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.chos.transaction.Merchant;
import org.chos.transaction.User;
import org.chos.transaction.UserService;
import org.chos.transaction.alapay.Alapay;
import org.chos.transaction.alapay.AlapayAccount;
import org.chos.transaction.alapay.AlapayAccountService;
import org.chos.transaction.passport.HttpContextSessionManager;
import org.chos.transaction.passport.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-5-1 上午12:39:09
 * @since 1.0
 */
@Controller
public class AlapayAccountController {

	@Autowired
	private HttpContextSessionManager httpContextSessionManager;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AlapayAccountService alapayAccountService;
	
	@RequestMapping(value = "/alapay/account")
	public String bindAlaPayAccount(HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		User user = userService.getUser(session.getUserId());
		
		String alapayAccount = user.getAlapayAccount();
		if (StringUtils.isBlank(alapayAccount)) {
			model.addAttribute("alapay", null);
		} else {
			AlapayAccount account = alapayAccountService.getByUsername(alapayAccount);
			if (account == null) {
				model.addAttribute("alapay", null);
			} else {
				model.addAttribute("alapay", account);
				Alapay alapay = alapayAccountService.getByUserId(account.getId());
				model.addAttribute("account", alapay);
			}
		}
		return "alapay/account";
	}
}
