/*
 * @(#)BidServiceImpl.java	1.0 2015-3-8 ����08:56:57
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
package org.chos.transaction;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-3-8 ����08:56:57
 * @since 1.0
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired()
	@Qualifier(value = "sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	@Autowired
	private BidService bidService;
	
	public List<Item> list(long firstResult, int maxResultSize) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("firstResult", firstResult);
		param.put("maxResultSize", maxResultSize);
		return template.selectList("item-list-r", param);
	}
	
	public List<Item> list(long userId, long firstResult, int maxResultSize) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("userId", userId);
		param.put("firstResult", firstResult);
		param.put("maxResultSize", maxResultSize);
		return template.selectList("item-list-r", param);
	}
	
	public Item getItem(long id) {
		return template.selectOne("get-item", id);
	}
	
	public void issue(Item requirement) {
		template.insert("issue", requirement);
	}
	
	public Bid toBid(long id) {
		Item item = getItem(id);
		if (item == null) {
			return null;
		}
		Bid bid = new Bid();
		String no = UUID.randomUUID().toString();
		no = no.replaceAll("-", "");
		bid.setNo(no);
		bid.setTenderSide(item.getUserId());
		bid.setProjectName(item.getTitle());
		bid.setAmount(item.getAmount());
		bid.setProjectBidContent(item.getContent());
		bid.setStartTime(new Date());
		bid.setCreation(new Date());
		bid = bidService.issue(bid);
		delete(id);
		return bid;
	}
	
	public void delete(long id) {
		template.delete("delete-item", id);
	}
	
	public Product addProduct(Product product) {
		template.insert("product-add", product);
		return product;
	}
	
	public List<Category> getCategories(long userId) {
		return template.selectList("category-getByUserId", userId);
	}
}
