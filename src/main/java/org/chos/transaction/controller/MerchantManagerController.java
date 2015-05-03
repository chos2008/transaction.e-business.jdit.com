/*
 * @(#)MerchantManagerController.java	1.0 2015-3-29 下午04:55:47
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

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.chos.transaction.Category;
import org.chos.transaction.DocumentPart;
import org.chos.transaction.DocumentService;
import org.chos.transaction.ItemService;
import org.chos.transaction.Merchant;
import org.chos.transaction.User;
import org.chos.transaction.UserService;
import org.chos.transaction.passport.HttpContextSessionManager;
import org.chos.transaction.passport.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-3-29 下午04:55:47
 * @since 1.0
 */
@Controller
public class MerchantManagerController {

	@Autowired
	private HttpContextSessionManager httpContextSessionManager;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private DocumentService documentService;
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/merchant/{id}")
	public String merchant(@PathVariable int id, HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
		Session session = httpContextSessionManager.getSession(request);
		if (session == null) {
			response.sendRedirect("login.shtml");
		}
		Merchant merchant = userService.getMerchantByUserId(session.getUserId());
		if (merchant == null) {
			response.sendRedirect("/continue.shtml");
		}
		
		List<DocumentPart> document = documentService.getDocument(merchant.getId(), 3);
		List<Category> categories = itemService.getCategories(session.getUserId());
		model.addAttribute("merchant", merchant);
		model.addAttribute("categories", categories);
		model.addAttribute("document", document);
		return "business/merchant";
	}
	
	@RequestMapping(value = "/merchant/{id}/details")
	public String merchantDetails(@PathVariable int id, HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
		Session session = httpContextSessionManager.getSession(request);
		if (session == null) {
			response.sendRedirect("login.shtml");
		}
		Merchant merchant = userService.getMerchantByUserId(session.getUserId());
		if (merchant == null) {
			response.sendRedirect("/continue.shtml");
		}
		
		List<DocumentPart> document = documentService.getDocument(merchant.getId(), 3);
		model.addAttribute("document", document);
		return "business/tmpl-merchant-details";
	}
	
	@RequestMapping(value = "/merchant/{id}/item")
	public String merchantItem(@PathVariable int id, HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
		Session session = httpContextSessionManager.getSession(request);
		if (session == null) {
			response.sendRedirect("login.shtml");
		}
		List<Category> categories = itemService.getCategories(session.getUserId());
		model.addAttribute("categories", categories);
		return "business/tmpl-merchant-item";
	}
	
	@RequestMapping(value = "/merchant0/{id}")
	public String merchant0(@PathVariable int id, HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
		Session session = httpContextSessionManager.getSession(request);
		if (session == null) {
			response.sendRedirect("login.shtml");
		}
		Merchant merchant = userService.getMerchantByUserId(session.getUserId());
		if (merchant == null) {
			response.sendRedirect("/continue.shtml");
		}
		
		List<DocumentPart> document = documentService.getDocument(merchant.getId(), 3);
		List<Category> categories = itemService.getCategories(session.getUserId());
		model.addAttribute("merchant", merchant);
		model.addAttribute("categories", categories);
		model.addAttribute("document", document);
		return "business/merchant";
	}
	
	@RequestMapping(value = "/merchant0/{id}/details")
	public String merchant00(@PathVariable int id, HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
		Session session = httpContextSessionManager.getSession(request);
		if (session == null) {
			response.sendRedirect("login.shtml");
		}
		Merchant merchant = userService.getMerchantByUserId(session.getUserId());
		if (merchant == null) {
			response.sendRedirect("/continue.shtml");
		}
		
		List<DocumentPart> document = documentService.getDocument(merchant.getId(), 3);
		List<Category> categories = itemService.getCategories(session.getUserId());
		model.addAttribute("merchant", merchant);
		model.addAttribute("categories", categories);
		model.addAttribute("document", document);
		return "business/merchant";
	}
}
