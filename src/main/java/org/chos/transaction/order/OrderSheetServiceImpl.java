/*
 * @(#)OrderSheetServiceImpl.java	1.0 2015-4-26 上午01:47:28
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

import java.util.Date;
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
 * @version 1.0  2015-4-26 上午01:47:28
 * @since 1.0
 */
@Service
public class OrderSheetServiceImpl implements OrderSheetService {

	@Autowired()
	@Qualifier(value = "sqlSessionTemplateForOrder")
	private SqlSessionTemplate template;
	
	public OrderSheet cart(OrderSheet orderSheet) {
		String ut = orderSheet.getUt();
		long merchandiseId = orderSheet.getMerchandiseId();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("ut", ut);
		param.put("merchandiseId", merchandiseId);
		List<OrderSheet> list = template.selectList("order-sheet-list-by-ut-merch-id", param);
		if (list.isEmpty()) {
			template.insert("order-sheet-order", orderSheet);
		} else {
			OrderSheet order = list.get(0);
			order.setQuantity(order.getQuantity() + orderSheet.getQuantity());
			order.setUpdation(new Date());
			template.update("update-order-sheet-by-id", order);
		}
		return orderSheet;
	}
	
	public List<OrderSheet> orderSheet(String ut) {
		return template.selectList("order-sheet-list-by-ut", ut);
	}
	
	public long getOrderSheetCount(String ut) {
		return template.selectOne("order-sheet-count-by-ut", ut);
	}
	
	public void deleteOrderSheet(long id) {
		template.delete("deleteOrderSheet", id);
	}
}
