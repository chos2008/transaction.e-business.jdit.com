/*
 * @(#)OrderService.java	1.0 2015-4-19 下午03:56:22
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

import java.util.List;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-19 下午03:56:22
 * @since 1.0
 */
public interface OrderService {

	/**
	 * @param userId
	 * @return
	 */
	public List<Order> getOrders(long userId);
	
	/**
	 * @param order
	 * @return
	 */
	public Order order(Order order);
	
	/**
	 * @param userId
	 * @param top
	 * @param state
	 * @return
	 */
	public List<Order> getTopNormalOrdersGroupByState(long userId, int top, OrderState state);
	
	/**
	 * @param userId
	 * @param top
	 * @param state
	 * @return
	 */
	public List<Order> getTopOrdersGroupByState(long userId, int top, OrderState state);
}
