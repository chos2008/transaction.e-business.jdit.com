/*
 * @(#)AlapayAccountService.java	1.0 2015-4-30 下午06:12:34
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
package org.chos.transaction.alapay;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-30 下午06:12:34
 * @since 1.0
 */
public interface AlapayAccountService {

	public AlapayAccount getByUsername(String username);
	
	public Alapay getByUserId(long userId);
}
