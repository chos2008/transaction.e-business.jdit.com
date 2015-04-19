/*
 * @(#)BidController.java	1.0 2015-3-8 ����08:45:11
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
import org.chos.servlet.http.ChosHttpServletResponse;
import org.chos.transaction.Bid;
import org.chos.transaction.BidService;
import org.chos.transaction.BidServiceImpl;
import org.chos.transaction.DocumentPart;
import org.chos.transaction.DocumentService;
import org.chos.transaction.Requirement;
import org.chos.transaction.RequirementService;
import org.chos.transaction.User;
import org.chos.transaction.UserService;
import org.chos.transaction.passport.HttpContextSessionManager;
import org.chos.transaction.passport.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-3-8 ����08:45:11
 * @since 1.0
 */
@Controller(value = "RequirementController")
public class RequirementController {

	@Autowired
	private RequirementService requirementService;
	
	@Autowired
	private DocumentService documentService;
	
	@Autowired
	private HttpContextSessionManager httpContextSessionManager;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "index")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		long firstResult = 0;
		int maxResultSize = 50;
		List<Requirement> results = requirementService.list(firstResult, maxResultSize);
		model.addAttribute("requirements", results);
		return "index";
	}
	
	@RequestMapping(value = "item")
	public String list0(HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		
		String pFirstResult = request.getParameter("firstResult");
		long firstResult = 0;
		if (! StringUtils.isBlank(pFirstResult)) {
			firstResult = Long.parseLong(pFirstResult);
		}
		String pMaxResultSize = request.getParameter("maxResultSize");
		int maxResultSize = 5;
		if (! StringUtils.isBlank(pMaxResultSize)) {
			maxResultSize = Integer.parseInt(pMaxResultSize);
		}
		List<Requirement> results = requirementService.list(session.getUserId(), firstResult, maxResultSize);
		model.addAttribute("requirements", results);
		return "item/list";
	}
	
	@RequestMapping(value = "item_as_json")
	@ResponseBody
	public Object listAsJson(HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		Map<String, Object> result = new HashMap<String, Object>();
		if (session == null) {
			result.put("code", 2000);
			return result;
		}
		String pFirstResult = request.getParameter("firstResult");
		long firstResult = 0;
		if (! StringUtils.isBlank(pFirstResult)) {
			firstResult = Long.parseLong(pFirstResult);
		}
		String pMaxResultSize = request.getParameter("maxResultSize");
		int maxResultSize = 5;
		if (! StringUtils.isBlank(pMaxResultSize)) {
			maxResultSize = Integer.parseInt(pMaxResultSize);
		}
		List<Requirement> list = requirementService.list(session.getUserId(), firstResult, maxResultSize);
		result.put("data", list);
		return result;
	}
	
	@RequestMapping(value = "item/{id}")
	public String item(@PathVariable int id, HttpServletRequest request, HttpServletResponse response, Model model) {
		Requirement item = requirementService.getItem(id);
		model.addAttribute("item", item);
		
		List<DocumentPart> document = documentService.getDocumentById(item.getId());
		
		model.addAttribute("details", document);
		return "item";
	}
	
	@RequestMapping(value = "item/issue")
	@ResponseBody
	public Object issue(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> json = new HashMap<String, Object>();
		
		String title = request.getParameter("title");
		if (StringUtils.isBlank(title)) {
			json.put("code", 1000);
			return json;
		}
		String amount = request.getParameter("amount");
//		if (StringUtils.isBlank(amount)) {
//			json.put("code", 1000);
//			return json;
//		}
		String description = request.getParameter("content");
		if (StringUtils.isBlank(description)) {
			json.put("code", 1000);
			return json;
		}
		
		String contact = request.getParameter("contact");
		User user = userService.create(null, null, contact, contact, true, request, response);
		
		Requirement requirement = new Requirement();
		requirement.setUserId(user.getId());
		requirement.setTitle(title);
		requirement.setAmount(StringUtils.isBlank(amount) ? 0 : Double.parseDouble(amount));
		requirement.setContent(description);
		requirement.setStartTime(new Date());
		requirement.setCreation(new Date());
		requirementService.issue(requirement);
		json.put("code", 0);
		return json;
	}
}
