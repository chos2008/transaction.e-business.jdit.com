/*
 * @(#)OrderController.java	1.0 2015-4-19 下午04:12:12
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
package org.chos.transaction.order.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.chos.transaction.order.Order;
import org.chos.transaction.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-19 下午04:12:12
 * @since 1.0
 */
@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "order")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		String param = request.getParameter("userId");
		if (StringUtils.isBlank(param)) {
			return "order/error";
		}
		long userId = Long.parseLong(param);
		List<Order> orders = orderService.getOrders(userId);
		model.addAttribute("orders", orders);
		return "order/list";
	}
}
