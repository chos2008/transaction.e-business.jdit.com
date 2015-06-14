/*
 * @(#)OrderType.java	1.0 2015-5-31 下午10:23:41
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
 * @version 1.0  2015-5-31 下午10:23:41
 * @since 1.0
 */
public enum OrderType {

	// business order
	BUSINESS_ORDER(0), 
	
	// bid order
	BID_ORDER(1);
	
	private int value;
	
	private OrderType(int value) {
		this.value = value;
	}
	
	public int value() {
		return value;
	}
}
