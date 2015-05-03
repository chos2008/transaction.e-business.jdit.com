/*
 * @(#)OrderStateTest.java	1.0 2015-5-2 上午02:26:21
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

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-5-2 上午02:26:21
 * @since 1.0
 */
public class OrderStateTest {

	@Test
	public void valueOf() {
		OrderState state = null;
		try {
			state = OrderState.valueOf("wait_pay");
		} catch(Exception e) {
			state = null;
		}
		Assert.assertTrue(state.value() == OrderState.wait_pay.value());
		
		try {
			state = OrderState.valueOf("unknown");
		} catch(Exception e) {
			state = null;
		}
		Assert.assertNull(state);
	}
}
