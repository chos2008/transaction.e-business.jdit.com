/*
 * @(#)ProductService.java	1.0 2014-03-10 下午09:33:57
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
 * @author ada
 * @version 1.0  2014-03-10 下午09:33:57
 * @since 1.0
 */
public interface ProductService {

	/**
	 * @param itemId
	 * @return
	 */
	public Product getById(long itemId);
	
	/**
	 * @param userId
	 * @return
	 */
	public List<Product> getByUserId(long userId);
}
