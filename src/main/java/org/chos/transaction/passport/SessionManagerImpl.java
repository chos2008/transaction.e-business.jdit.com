/*
 * @(#)SessionManagerImpl.java	1.0 2015-3-22 обнГ03:45:00
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

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-3-22 обнГ03:45:00
 * @since 1.0
 */
@Service
public class SessionManagerImpl implements SessionManager {

	@Autowired()
	private SqlSessionTemplate template;
	
	public Session getSession(long userId) {
		return template.selectOne("getSessionByUserId", userId);
	}
	
	public Session getSession(String ut) {
		return template.selectOne("getSession", ut);
	}
}
