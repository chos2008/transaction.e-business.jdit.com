/*
 * @(#)AlapayAccountServiceImpl.java	1.0 2015-4-30 下午06:12:47
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

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-30 下午06:12:47
 * @since 1.0
 */
@Service
public class AlapayAccountServiceImpl implements AlapayAccountService {

	@Autowired()
	@Qualifier(value = "sqlSessionTemplateForAlaPay")
	private SqlSessionTemplate template;
	
	public AlapayAccount getByUsername(String username) {
		return template.selectOne("alapay-account-getByUsername", username);
	}
	
	public Alapay getByUserId(long userId) {
		return template.selectOne("alapay-getByUserId", userId);
	}
}
