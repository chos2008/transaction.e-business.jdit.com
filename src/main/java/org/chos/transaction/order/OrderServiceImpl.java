/*
 * @(#)OrderServiceImpl.java	1.0 2015-4-19 下午03:56:34
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
package org.chos.transaction.order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-19 下午03:56:34
 * @since 1.0
 */


@Service
public class OrderServiceImpl implements OrderService {

	@Autowired()
	@Qualifier(value = "sqlSessionTemplateForOrder")
	private SqlSessionTemplate template;
	
	public List<Order> getOrders(long userId) {
		return template.selectList("order-list-by-userid", userId);
	}
	
	public Order order(Order order) {
		template.insert("order-order", order);
		return order;
	}
	
	public List<Order> getTopNormalOrdersGroupByState(long userId, int top, OrderState state) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("userId", userId);
		param.put("top", top);
		if (state != null) {
			param.put("state", state.value());
		}
		return template.selectList("normal-orders-top-groupbystate", param);
	}
	
	public List<Order> getTopOrdersGroupByState(long userId, int top, OrderState state) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("userId", userId);
		param.put("top", top);
		if (state != null) {
			param.put("state", state.value());
		}
		return template.selectList("orders-top-groupbystate", param);
	}
}
