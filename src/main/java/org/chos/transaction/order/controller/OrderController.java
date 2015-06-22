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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.chos.transaction.Item;
import org.chos.transaction.ItemService;
import org.chos.transaction.User;
import org.chos.transaction.UserService;
import org.chos.transaction.controller.ErrorCode;
import org.chos.transaction.controller.ItemErrorCode;
import org.chos.transaction.controller.SessionErrorCode;
import org.chos.transaction.order.Order;
import org.chos.transaction.order.OrderItem;
import org.chos.transaction.order.OrderService;
import org.chos.transaction.order.OrderSheet;
import org.chos.transaction.order.OrderSheetService;
import org.chos.transaction.order.OrderState;
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
 * @author ada
 * @version 1.0  2015-4-19 下午04:12:12
 * @since 1.0
 */
@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private OrderSheetService orderSheetService;
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private HttpContextSessionManager httpContextSessionManager;
	
	@RequestMapping(value = "order/commit")
	public String commit(HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		if (session == null) {
			return "order/error";
		}
		List<OrderSheet> orders = orderSheetService.orderSheet(session.getToken());
		Map<Long, List<OrderSheet>> orderMap = new HashMap<Long, List<OrderSheet>>();
		Map<Long, Item> itemMap = new HashMap<Long, Item>();
		Map<Long, User> userMap = new HashMap<Long, User>();
		for (OrderSheet order : orders) {
			long merchandiseId = order.getItemId();
			Item item = itemService.getItem(merchandiseId);
			itemMap.put(merchandiseId, item);
			if (item != null) {
				User user = userService.getUser(item.getUserId());
				if (user != null) {
					List<OrderSheet> list = orderMap.get(user.getId());
					if (list == null) {
						list = new LinkedList<OrderSheet>();
					}
					list.add(order);
					orderMap.put(user.getId(), list);
					userMap.put(merchandiseId, user);
				}
			} else {
				userMap.put(merchandiseId, null);
			}
		}
		
		UserAddress userAddress = userService.getUserDefaultAddress(session.getUserId());
		model.addAttribute("orders", orders);
		model.addAttribute("orderMap", orderMap);
		model.addAttribute("itemMap", itemMap);
		model.addAttribute("userMap", userMap);
		model.addAttribute("userAddress", userAddress);
		return "order/sheet-order";
	}
	
	@RequestMapping(value = "order")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		if (session == null) {
			return "order/error";
		}
		List<Order> orders = orderService.getOrders(session.getUserId());
		Map<String, List<Item>> itemMap = new HashMap<String, List<Item>>();
		Map<Long, OrderItem> orderItemMap = new HashMap<Long, OrderItem>();
		Map<Long, List<User>> userMap = new HashMap<Long, List<User>>();
		for (Order order : orders) {
//			long merchandiseId = order.getMerchandiseId();
			List<OrderItem> orderItems = orderService.getOrderItems(order.getNo());
			for (OrderItem orderItem : orderItems) {
				Item item = itemService.getItem(orderItem.getItemId());
				if (item != null) {
					User user = userService.getUser(item.getUserId());
					if (user != null) {
						List<User> merchants = userMap.get(order.getId());
						if (merchants == null) {
							merchants = new ArrayList<User>();
						}
						merchants.add(user);
						userMap.put(order.getId(), merchants);
						
						List<Item> items = itemMap.get(user.getId());
						if (items == null) {
							items = new ArrayList<Item>();
						}
						items.add(item);
						itemMap.put(order.getId() + "_" + user.getId(), items);
						
						orderItemMap.put(orderItem.getItemId(), orderItem);
					}
				}
			}
		}
		model.addAttribute("orders", orders);
		model.addAttribute("itemMap", itemMap);
		model.addAttribute("orderItemMap", orderItemMap);
		model.addAttribute("userMap", userMap);
		return "order/list";
	}
	
	@RequestMapping(value = "order/normal/top")
	public String getTopNormalOrdersGroupByState(HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		if (session == null) {
			return "order/error";
		}
		OrderState state = OrderState.state(request.getParameter("state"));
		List<Order> orders = orderService.getTopNormalOrdersGroupByState(session.getUserId(), 6, state);
		Map<Long, List<Item>> itemMap = new HashMap<Long, List<Item>>();
		Map<Long, OrderItem> orderItemMap = new HashMap<Long, OrderItem>();
		Map<Long, List<User>> userMap = new HashMap<Long, List<User>>();
		for (Order order : orders) {
//			long merchandiseId = order.getMerchandiseId();
			List<OrderItem> orderItems = orderService.getOrderItems(order.getNo());
			for (OrderItem orderItem : orderItems) {
				Item item = itemService.getItem(orderItem.getItemId());
				if (item != null) {
					User user = userService.getUser(item.getUserId());
					if (user != null) {
						List<User> merchants = userMap.get(order.getId());
						if (merchants == null) {
							merchants = new ArrayList<User>();
						}
						merchants.add(user);
						userMap.put(order.getId(), merchants);
						
						List<Item> items = itemMap.get(user.getId());
						if (items == null) {
							items = new ArrayList<Item>();
						}
						items.add(item);
						itemMap.put(user.getId(), items);
						
						orderItemMap.put(orderItem.getItemId(), orderItem);
					}
				}
			}
		}
		model.addAttribute("orders", orders);
		model.addAttribute("itemMap", itemMap);
		model.addAttribute("orderItems", orderItemMap);
		model.addAttribute("userMap", userMap);
		return "order/tmpl-order-list-item";
	}
	
	@RequestMapping(value = "order/x-normal/top")
	public String getTopOrdersGroupByState(HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		if (session == null) {
			return "order/error";
		}
		OrderState state = OrderState.state(request.getParameter("state"));
		List<Order> orders = orderService.getTopOrdersGroupByState(session.getUserId(), 6, state);
		Map<Long, List<Item>> itemMap = new HashMap<Long, List<Item>>();
		Map<Long, OrderItem> orderItemMap = new HashMap<Long, OrderItem>();
		Map<Long, List<User>> userMap = new HashMap<Long, List<User>>();
		for (Order order : orders) {
//			long merchandiseId = order.getMerchandiseId();
			List<OrderItem> orderItems = orderService.getOrderItems(order.getNo());
			for (OrderItem orderItem : orderItems) {
				Item item = itemService.getItem(orderItem.getItemId());
				if (item != null) {
					User user = userService.getUser(item.getUserId());
					if (user != null) {
						List<User> merchants = userMap.get(order.getId());
						if (merchants == null) {
							merchants = new ArrayList<User>();
						}
						merchants.add(user);
						userMap.put(order.getId(), merchants);
						
						List<Item> items = itemMap.get(user.getId());
						if (items == null) {
							items = new ArrayList<Item>();
						}
						items.add(item);
						itemMap.put(user.getId(), items);
						
						orderItemMap.put(orderItem.getItemId(), orderItem);
					}
				}
			}
		}
		model.addAttribute("orders", orders);
		model.addAttribute("itemMap", itemMap);
		model.addAttribute("orderItems", orderItemMap);
		model.addAttribute("userMap", userMap);
		return "order/tmpl-order-list-item";
	}
	
	@RequestMapping(value = "cart")
	public void cart(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Session session = httpContextSessionManager.getSession(request);
		if (session == null) {
			response.sendRedirect("login.shtml");
		}
		String itemId = request.getParameter("item");
		if (StringUtils.isBlank(itemId)) {
			response.sendRedirect("item/error.shtml");
		}
		Item item = itemService.getItem(Integer.parseInt(itemId));
		if (item == null) {
			response.sendRedirect("item/error.shtml");
		}
		OrderSheet order = new OrderSheet();
		String no = UUID.randomUUID().toString();
		no = no.replaceAll("-", "");
		order.setAmount(item.getAmount());
		order.setUt(session.getToken());
		order.setItemId(item.getId());
		order.setItemType(0);
		order.setQuantity(1);
		order.setCreation(new Date());
		
		orderSheetService.cart(order);
		response.sendRedirect("order-sheet.shtml");
	}
	
	@RequestMapping(value = "order-sheet")
	public String orderSheet(HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		if (session == null) {
			return "order/error";
		}
		List<OrderSheet> orders = orderSheetService.orderSheet(session.getToken());
		Map<Long, List<OrderSheet>> orderMap = new HashMap<Long, List<OrderSheet>>();
		Map<Long, Item> itemMap = new HashMap<Long, Item>();
		Map<Long, User> userMap = new HashMap<Long, User>();
		for (OrderSheet order : orders) {
			long merchandiseId = order.getItemId();
			Item item = itemService.getItem(merchandiseId);
			itemMap.put(merchandiseId, item);
			if (item != null) {
				User user = userService.getUser(item.getUserId());
				if (user != null) {
					List<OrderSheet> list = orderMap.get(user.getId());
					if (list == null) {
						list = new LinkedList<OrderSheet>();
					}
					list.add(order);
					orderMap.put(user.getId(), list);
					userMap.put(merchandiseId, user);
				}
			} else {
				userMap.put(merchandiseId, null);
			}
		}
		model.addAttribute("orders", orders);
		model.addAttribute("orderMap", orderMap);
		model.addAttribute("itemMap", itemMap);
		model.addAttribute("userMap", userMap);
		return "order/order-sheet";
	}
	
	@RequestMapping(value = "order-sheet/simple")
	@ResponseBody
	public Object simpleOrderSheet(HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		Map<String, Object> resp = new HashMap<String, Object>();
		if (session == null) {
			resp.put("code", SessionErrorCode.INVALID_SESSION);
			return resp;
		}
		long count = orderSheetService.getOrderSheetCount(session.getToken());
		resp.put("count", count);
		resp.put("code", 0);
		return resp;
	}
	
	@RequestMapping(value = "order-sheet/{id}/delete")
	@ResponseBody
	public Object deleteOrderSheet(@PathVariable long id, HttpServletRequest request, HttpServletResponse response, Model model) {
		Session session = httpContextSessionManager.getSession(request);
		Map<String, Object> resp = new HashMap<String, Object>();
		if (session == null) {
			resp.put("code", SessionErrorCode.INVALID_SESSION);
			return resp;
		}
		orderSheetService.deleteOrderSheet(id);
		resp.put("code", 0);
		return resp;
	}
}
