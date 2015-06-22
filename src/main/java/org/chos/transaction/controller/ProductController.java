/*
 * @(#)ProductController.java	1.0 2015-6-22 下午05:33:16
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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.chos.transaction.DocumentPart;
import org.chos.transaction.DocumentService;
import org.chos.transaction.Item;
import org.chos.transaction.ItemService;
import org.chos.transaction.Product;
import org.chos.transaction.ProductService;
import org.chos.transaction.UserService;
import org.chos.transaction.order.OrderService;
import org.chos.transaction.order.OrderSheetService;
import org.chos.transaction.passport.HttpContextSessionManager;
import org.chos.transaction.passport.Session;
import org.chos.transaction.passport.SessionManager;
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
 * @version 1.0  2015-6-22 下午05:33:16
 * @since 1.0
 */
@Controller
public class ProductController extends AbstractItemController {

	@Autowired
	private ItemService itemService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private DocumentService documentService;
	
	@Autowired
	private HttpContextSessionManager httpContextSessionManager;
	
	@Autowired
	private SessionManager sessionManager;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private OrderSheetService orderSheetService;
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "product/{id}")
	public String item(@PathVariable long id, HttpServletRequest request, HttpServletResponse response, Model model) {
		Product item = productService.getById(id);
		model.addAttribute("item", item);
		return "item/s-product-item";
	}
	
	@RequestMapping(value = "item/add/view")
	public String addItemView(HttpServletRequest request, HttpServletResponse response) {
		return "business/item-add";
	}
	
	@RequestMapping(value = "item/add")
	@ResponseBody
	public Object add(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> json = new HashMap<String, Object>();
		
		String name = request.getParameter("name");
		if (StringUtils.isBlank(name)) {
			json.put("code", 1000);
			return json;
		}
		String price = request.getParameter("price");
		if (StringUtils.isBlank(price)) {
			json.put("code", 1000);
			return json;
		}
		String stock = request.getParameter("stock");
		if (StringUtils.isBlank(stock)) {
			json.put("code", 1000);
			return json;
		}
		String description = request.getParameter("content");
		if (StringUtils.isBlank(description)) {
			json.put("code", 1000);
			return json;
		}
		
		Session session = httpContextSessionManager.getSession(request);
		
		Product product = new Product();
		product.setName(name);
		product.setUserId(session.getUserId());
		product.setPrice(StringUtils.isBlank(price) ? 0 : Float.parseFloat(price));
		product.setStock(Integer.parseInt(stock));
		product.setCategory(6);
		
		product.setDescription(description);
		product.setCreation(new Date());
		itemService.addProduct(product);
		json.put("code", 0);
		return json;
	}
}
