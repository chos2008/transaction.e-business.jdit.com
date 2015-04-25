/*
 * @(#)CartServiceImpl.java	1.0 2015-4-26 上午01:50:44
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

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-26 上午01:50:44
 * @since 1.0
 */
@Service
public class CartServiceImpl implements CartService {

	@Autowired()
	@Qualifier(value = "sqlSessionTemplateForOrder")
	private SqlSessionTemplate template;
	
	/**
	 * (Javadoc)
	 *
	 * @see org.chos.transaction.order.CartService#cart(org.chos.transaction.order.Cart)
	 */
	public Cart cart(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

}
