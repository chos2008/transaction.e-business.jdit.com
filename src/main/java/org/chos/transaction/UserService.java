/*
 * @(#)UserService.java	1.0 2015-3-8 ����10:29:51
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.chos.transaction.user.UserAddress;

/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-3-8 ����10:29:51
 * @since 1.0
 */
public interface UserService {
	
	public User create(String username, String password, String mobile, String email, 
			boolean autoSession, HttpServletRequest request, HttpServletResponse response);

	public SimpleCategory getProximityCategory(int categoryId);
	
	public User create(String username, String password, String mobile, String email) throws UserAlreadyExistException;
	
	public void create(User user);
	
	public User getUser(String username);
	
	public User getUser(long userId);
	
	/**
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddress(long userId);
	
	/**
	 * @param userId
	 * @return
	 */
	public UserAddress getUserDefaultAddress(long userId);
	
	/**
	 * @param address
	 */
	public void addUserAddress(UserAddress address);
	
	public User updateUserInfo(User user);
	
	public Merchant createMerchant(Merchant merchant);
	
	public Merchant getMerchantByUserId(long userId);
}
