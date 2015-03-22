/*
 * @(#)SessionManager.java	1.0 2015-3-22 обнГ03:44:48
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
package org.chos.transaction.passport;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-3-22 обнГ03:44:48
 * @since 1.0
 */
public interface SessionManager {

	/**
	 * 
	 */
	public static int GLOBAL_SESSION_EXPIRE_TIME = 1;
	
	/**
	 * @param userId
	 * @return
	 */
	public Session getSession(long userId);
	
	/**
	 * @param ut
	 * @return
	 */
	public Session getSession(String ut);
}
