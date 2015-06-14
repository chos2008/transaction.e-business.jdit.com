/*
 * @(#)RequirementController.java	1.0 2015-3-8 ����08:45:11
 *
 * Copyright 2008 CHOS. All rights reserved.
 *        CHOS PROPRIETARY/CONFIDENTIAL. 
 *       Use is subject to license terms.
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the CHOS License is distributed on an "AS IS" BA-
 * SIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express o
 * r implied. See the License for the specific language governing per-
 * missions and limitations under the License.
 */
package org.chos.transaction.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.chos.transaction.Bid;
import org.chos.transaction.DocumentPart;
import org.chos.transaction.DocumentService;
import org.chos.transaction.Item;
import org.chos.transaction.ItemService;
import org.chos.transaction.Product;
import org.chos.transaction.User;
import org.chos.transaction.UserService;
import org.chos.transaction.order.Order;
import org.chos.transaction.order.OrderService;
import org.chos.transaction.order.OrderSheet;
import org.chos.transaction.order.OrderSheetService;
import org.chos.transaction.order.OrderType;
import org.chos.transaction.passport.HttpContextSessionManager;
import org.chos.transaction.passport.LocalSession;
import org.chos.transaction.passport.Session;
import org.chos.transaction.passport.SessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
public class ItemController {

	@Autowired
	private ItemService itemService;
	
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
	
	/**
	 * http://domain.com/index.shtml
	 * http://domain.com/index.shtml?html
	 * http://domain.com/index.shtml?html=
	 * http://domain.com/index.shtml?html=something&down
	 * http://domain.com/index.shtml?html=something&down=
	 * http://domain.com/index.shtml?html=something&down=something
	 * http://domain.com/index.shtml?html=something&up
	 * http://domain.com/index.shtml?html=something&up=
	 * http://domain.com/index.shtml?html=something&up=something
	 * http://domain.com/index.shtml?html&up
	 * http://domain.com/index.shtml?html&up=
	 * http://domain.com/index.shtml?html&up=something
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "index")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		String html = request.getParameter("html");
		String result = null;
		LocalSession localsession = null;
		List<Item> results = null;
		if (html != null) {
			String position = request.getParameter("down");
			localsession = sessionManager.getLocalSession(session.getUserId(), 1, position != null ? -1 : 1);
			if (localsession.getCurrentPage() > 0) {
				long firstResult = (localsession.getCurrentPage() - 1) * localsession.getPageSize();
				int maxResultSize = localsession.getPageSize();
				results = itemService.list(firstResult, maxResultSize);
			} else {
				results = new ArrayList<Item>(0);
			}

			
			result = "tmpl-index-list-item";
		} else {
			localsession = sessionManager.getLocalSession(session.getUserId(), 1, 0);
			if (localsession.getCurrentPage() > 0) {
				long firstResult = (localsession.getCurrentPage() - 1) * localsession.getPageSize();
				int maxResultSize = localsession.getPageSize();
				results = itemService.list(firstResult, maxResultSize);
			} else {
				results = new ArrayList<Item>(0);
			}
			
			
			result = "index";
		}
		
		model.addAttribute("requirements", results);

		
		return result;
	}
	
	/**
	 * http://domain.com/item
	 * http://domain.com/item?html
	 * http://domain.com/item?html=
	 * http://domain.com/item?html=something
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "item")
	public String list0(HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		String html = request.getParameter("html");
		String result = null;
		LocalSession localsession = null;
		List<Item> results = null;
		if (html != null) {
			String position = request.getParameter("down");
			localsession = sessionManager.getLocalSession(session.getUserId(), 0, position != null ? -1 : 1);
			
			if (localsession.getCurrentPage() > 0) {
				long firstResult = (localsession.getCurrentPage() - 1) * localsession.getPageSize();
				int maxResultSize = localsession.getPageSize();
				results = itemService.list(session.getUserId(), firstResult, maxResultSize);
			} else {
				results = new ArrayList<Item>(0);
			}
			
			result = "item/tmpl-item-list-item";
		} else {
			localsession = sessionManager.getLocalSession(session.getUserId(), 0, 0);
			
			if (localsession.getCurrentPage() > 0) {
				long firstResult = (localsession.getCurrentPage() - 1) * localsession.getPageSize();
				int maxResultSize = localsession.getPageSize();
				results = itemService.list(session.getUserId(), firstResult, maxResultSize);
			} else {
				results = new ArrayList<Item>(0);
			}
			result = "item/list";
		}
		model.addAttribute("requirements", results);
		
		return result;
	}
	
	@RequestMapping(value = "item_as_json")
	@ResponseBody
	public Object listAsJson(HttpServletRequest request, HttpServletResponse response, Model model) {
		Map<String, Object> result = new HashMap<String, Object>();
		Session session = httpContextSessionManager.getSession(request);
		if (session == null) {
			result.put("code", SessionErrorCode.INVALID_SESSION);
			return result;
		}
		
		
		String json = request.getParameter("json");
		LocalSession localsession = null;
		List<Item> results = null;
		if (json != null) {
			String position = request.getParameter("down");
			localsession = sessionManager.getLocalSession(session.getUserId(), 0, position != null ? -1 : 1);
			
			if (localsession.getCurrentPage() > 0) {
				long firstResult = (localsession.getCurrentPage() - 1) * localsession.getPageSize();
				int maxResultSize = localsession.getPageSize();
				results = itemService.list(session.getUserId(), firstResult, maxResultSize);
			} else {
				results = new ArrayList<Item>(0);
			}
		} else {
			if (request.getParameter("top") != null) {
				results = itemService.list(session.getUserId(), 0, 6);
			} else {
				localsession = sessionManager.getLocalSession(session.getUserId(), 0, 0);
				
				if (localsession.getCurrentPage() > 0) {
					long firstResult = (localsession.getCurrentPage() - 1) * localsession.getPageSize();
					int maxResultSize = localsession.getPageSize();
					results = itemService.list(session.getUserId(), firstResult, maxResultSize);
				} else {
					results = new ArrayList<Item>(0);
				}
			}
		}
		
		result.put("data", results);
		return result;
	}
	
	@RequestMapping(value = "item/{id}")
	public String item(@PathVariable int id, HttpServletRequest request, HttpServletResponse response, Model model) {
		
		String type = request.getParameter("type");
		if ("1".equals(type)) {
			Item item = new Item();
			model.addAttribute("item", item);
			
			List<DocumentPart> document = new ArrayList<DocumentPart>();
			
			model.addAttribute("details", document);
			return "item-product";
		} else if ("2".equals(type)) {
			Item item = new Item();
			model.addAttribute("item", item);
			
			List<DocumentPart> document = new ArrayList<DocumentPart>();
			
			model.addAttribute("details", document);
			return "item-0";
		} else {
			Item item = itemService.getItem(id);
			model.addAttribute("item", item);
			
			List<DocumentPart> document = documentService.getDocumentById(item.getId());
			
			model.addAttribute("details", document);
			return "item";
		}
	}
	
	@RequestMapping(value = "item/share")
	public void share(HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
		String itemId = request.getParameter("item_id");
		if (StringUtils.isBlank(itemId)) {
			return;
		}
		Item item = itemService.getItem(Long.parseLong(itemId));
		if (item == null) {
			return;
		}
		
		String url = "http://chos2009.eicp.net/item/8929093.shtml";
		String title = item.getTitle();
		try {
			url = URLEncoder.encode(url, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		try {
			title = URLEncoder.encode(title, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String content = title + "@" + url;
		response.sendRedirect("http://weibo.cn/ext/share?ru=" + url + "&rt=" + title + "&ntitle=" + content + "&st=" + System.currentTimeMillis()+ "&appkey=1824142258");
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
		Session session = httpContextSessionManager.getSession(request);
		long userId = 0;
		if (session == null) {
			User user = userService.create(null, null, contact, contact, true, request, response);
			userId = user.getId();
		} else {
			userId = session.getUserId();
		}
		
		Item item = new Item();
		item.setUserId(userId);
		item.setTitle(title);
		item.setAmount(StringUtils.isBlank(amount) ? 0 : Double.parseDouble(amount));
		item.setContent(description);
		item.setCreation(new Date());
		itemService.issue(item);
		
		DocumentPart part = new DocumentPart();
		part.setDocumentId(item.getId());
		part.setDocumentType(0);
		part.setPartContent(description);
		part.setPartType(0);
		part.setCreation(new Date());
		documentService.store(part);
		json.put("code", 0);
		return json;
	}
	
	@RequestMapping(value = "item/tobid")
	@ResponseBody
	public Object tobid(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> json = new HashMap<String, Object>();
		
		String itemId = request.getParameter("item_id");
		if (StringUtils.isBlank(itemId)) {
			json.put("code", 1000);
			return json;
		}
		
		Bid bid = itemService.toBid(Long.parseLong(itemId));
		if (bid == null) {
			json.put("code", ItemErrorCode.ITEM_NOT_EXISTS);
			return json;
		}
		json.put("code", 0);
		return json;
	}
	
	@RequestMapping(value = "item/edit/view")
	public String toEdit(HttpServletRequest request, HttpServletResponse response, Model model) {
		String itemId = request.getParameter("item_id");
		if (StringUtils.isBlank(itemId)) {
			return "item/error";
		}
		Item item = itemService.getItem(Long.parseLong(itemId));
		if (item == null) {
			return "item/error";
		}
		Session session = httpContextSessionManager.getSession(request);
		User user = userService.getUser(session.getUserId());
		model.addAttribute("item", item);
		model.addAttribute("user", user);
		return "item/edit";
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
	
	@RequestMapping(value = "item/cart/preview")
	public String previewCart(@RequestParam("itemId") long itemId, HttpServletRequest request, HttpServletResponse response, Model model) {
		Item item = itemService.getItem(itemId);
		if (item == null) {
			
		}
		model.addAttribute("item", item);
		return "cart/preview";
	}
	
	@RequestMapping(value = "item/cart")
	@ResponseBody
	public Object cart(HttpServletRequest request, HttpServletResponse response) {
		Session session = httpContextSessionManager.getSession(request);
		Map<String, Object> json = new HashMap<String, Object>();
		if (session == null) {
			json.put("code", SessionErrorCode.INVALID_SESSION);
			return json;
		}
		String itemId = request.getParameter("itemId");
		String quantity = request.getParameter("quantity");
		if (StringUtils.isBlank(itemId)) {
			json.put("code", ErrorCode.PARAM_ERROR);
			return json;
		}
		if (StringUtils.isBlank(quantity)) {
			json.put("code", ErrorCode.PARAM_ERROR);
			return json;
		}
		int _quantity = Integer.parseInt(quantity);
		if (_quantity < 1) {
			json.put("code", ErrorCode.PARAM_ERROR);
			return json;
		}
		Item item = itemService.getItem(Integer.parseInt(itemId));
		if (item == null) {
			json.put("code", ItemErrorCode.ITEM_NOT_EXISTS);
			return json;
		}
		OrderSheet order = new OrderSheet();
		String no = UUID.randomUUID().toString();
		no = no.replaceAll("-", "");
		order.setAmount(item.getAmount());
		order.setUt(session.getToken());
		order.setItemId(item.getId());
		order.setItemType(0);
		order.setQuantity(_quantity);
		order.setCreation(new Date());
		
		orderSheetService.cart(order);
		json.put("code", 0);
		return json;
	}
	
	@RequestMapping(value = "item/order")
	@ResponseBody
	public Object order(HttpServletRequest request, HttpServletResponse response) {
		Session session = httpContextSessionManager.getSession(request);
		Map<String, Object> json = new HashMap<String, Object>();
		if (session == null) {
			json.put("code", SessionErrorCode.INVALID_SESSION);
			return json;
		}
		List<OrderSheet> orders = orderSheetService.orderSheet(session.getToken());
		for (OrderSheet orderSheet : orders) {
			Item item = itemService.getItem(orderSheet.getItemId());
			if (item != null) {
				Order order = new Order();
				String no = UUID.randomUUID().toString();
				no = no.replaceAll("-", "");
				order.setNo(no);
				order.setType(OrderType.BUSINESS_ORDER.value());
				order.setAmount(item.getAmount());
				order.setUserId(session.getUserId());
				order.setMerchId(item.getUserId());
//				order.setMerchandiseId(item.getId());
//				order.setMerchandiseType(0);
//				order.setQuantity(1);
				order.setState(0);
				order.setCreation(new Date());
				orderService.order(order);
				orderSheetService.deleteOrderSheet(orderSheet.getId());
			}
		}
		json.put("code", 0);
		return json;
	}
	
	@RequestMapping(value = "item/{itemId}/order")
	@ResponseBody
	public Object order(@PathVariable long itemId, HttpServletRequest request, HttpServletResponse response) {
		Session session = httpContextSessionManager.getSession(request);
		Map<String, Object> json = new HashMap<String, Object>();
		if (session == null) {
			json.put("code", SessionErrorCode.INVALID_SESSION);
			return json;
		}
//		String itemId = request.getParameter("itemId");
//		if (StringUtils.isBlank(itemId)) {
//			json.put("code", ErrorCode.PARAM_ERROR);
//			return json;
//		}
		Item item = itemService.getItem(itemId);
		if (item == null) {
			json.put("code", ItemErrorCode.ITEM_NOT_EXISTS);
			return json;
		}
		Order order = new Order();
		String no = UUID.randomUUID().toString();
		no = no.replaceAll("-", "");
		order.setNo(no);
		order.setType(OrderType.BUSINESS_ORDER.value());
		order.setAmount(item.getAmount());
		order.setUserId(session.getUserId());
		order.setMerchId(item.getUserId());
//		order.setMerchandiseId(item.getId());
//		order.setMerchandiseType(0);
//		order.setQuantity(1);
		order.setState(0);
		order.setCreation(new Date());
		
		orderService.order(order);
		json.put("code", 0);
		return json;
	}
}
