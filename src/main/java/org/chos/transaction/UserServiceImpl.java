/*
 * @(#)UserServiceImpl.java	1.0 2015-3-8 обнГ10:29:43
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

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-3-8 обнГ10:29:43
 * @since 1.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired()
	private SqlSessionTemplate template;
	
	public void create(User user) {
		template.insert("user-insert", user);
	}
	
	public User getUser(long userId) {
		return template.selectOne("user-getByUserId", userId);
	}
	
	public User getUser(String username) {
		return template.selectOne("user-getByUsername", username);
	}
}
