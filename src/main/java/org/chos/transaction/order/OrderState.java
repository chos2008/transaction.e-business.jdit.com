/*
 * @(#)OrderState.java	1.0 2015-5-2 上午02:18:10
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

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-5-2 上午02:18:10
 * @since 1.0
 */
public enum OrderState {

	wait_pay(0), 
	
	wait_ack(1), 
	
	wait_recv(2), 
	
	completion(-1), 
	
	wait_delivery(11), 
	
	wait_evaluate(22);
	
	private int value;
	
	private OrderState(int value) {
		this.value = value;
	}
	
	public static OrderState state(String s) {
		OrderState state;
		try {
			state = OrderState.valueOf(s);
		} catch(Exception e) {
			state = null;
		}
		return state;
	}
	
	public int value() {
		return value;
	}
}
