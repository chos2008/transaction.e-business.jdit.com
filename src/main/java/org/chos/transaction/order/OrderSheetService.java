/*
 * @(#)OrderSheetService.java	1.0 2015-4-26 上午01:34:17
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
 * @version 1.0  2015-4-26 上午01:34:17
 * @since 1.0
 */
public interface OrderSheetService {

	public OrderSheet cart(OrderSheet orderSheet);
	
	public List<OrderSheet> orderSheet(String ut);
	
}
