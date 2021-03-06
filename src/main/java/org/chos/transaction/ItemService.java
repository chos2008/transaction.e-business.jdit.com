/*
 * @(#)BidService.java	1.0 2015-3-8 ����09:34:26
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

import java.util.List;

/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-3-8 ����09:34:26
 * @since 1.0
 */
public interface ItemService {

	/**
	 * @param firstResult
	 * @param maxResultSize
	 * @return
	 */
	public List<Item> list(long firstResult, int maxResultSize);
	
	public List<Item> list(long userId, long firstResult, int maxResultSize);
	
	/**
	 * @param id
	 * @return
	 */
	public Item getItem(long id);
	
	/**
	 * @param requirement
	 */
	public void issue(Item requirement);
	
	public Bid toBid(long id);
	
	/**
	 * @param itemId
	 */
	public void delete(long itemId);
	
	/**
	 * @param product
	 * @return
	 */
	public Product addProduct(Product product);
	
	/**
	 * @param userId
	 * @return
	 */
	public List<Category> getCategories(long userId);
}
