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
import org.chos.transaction.Bid;
import org.chos.transaction.BidService;
import org.chos.transaction.BidServiceImpl;
import org.chos.transaction.Requirement;
import org.chos.transaction.RequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
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
	
	@RequestMapping(value = "index")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		long firstResult = 0;
		int maxResultSize = 50;
		List<Requirement> results = requirementService.list(firstResult, maxResultSize);
		model.addAttribute("requirements", results);
		return "index";
	}
	
	@RequestMapping(value = "issue")
	@ResponseBody
	public Object issue(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> json = new HashMap<String, Object>();
		
		String title = request.getParameter("title");
		if (StringUtils.isBlank(title)) {
			json.put("code", 1000);
			return json;
		}
		String amount = request.getParameter("amount");
		if (StringUtils.isBlank(amount)) {
			json.put("code", 1000);
			return json;
		}
		String description = request.getParameter("content");
		if (StringUtils.isBlank(description)) {
			json.put("code", 1000);
			return json;
		}
		Requirement requirement = new Requirement();
		requirement.setUserId(1234);
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
