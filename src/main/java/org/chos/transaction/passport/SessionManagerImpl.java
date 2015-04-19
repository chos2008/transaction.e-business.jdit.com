/*
 * @(#)SessionManagerImpl.java	1.0 2015-3-22 ����03:45:00
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

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-3-22 ����03:45:00
 * @since 1.0
 */
@Service
public class SessionManagerImpl implements SessionManager {

	@Autowired()
	@Qualifier(value = "sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	public Session getSession(long userId, boolean refresh) {
		Session session = template.selectOne("getSessionByUserId", userId);
		if (session != null) {
			if (refresh) {
				session.setUpdation(new Date());
				template.update("refreshSession", session);
				return session;
			} else {
				return session.isExpire() ? null : session;
			}
		}
		return null;
	}
	
	public LocalSession getLocalSession(long userId, int type) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("type", type);
		List<LocalSession> list = template.selectList("localsession-getSession", map);
		LocalSession session = null;
		if (! list.isEmpty()) {
			session = list.get(0);
		} else {
			session = new LocalSession();
			session.setUserId(userId);
			session.setCursorType(type);
			template.insert("localsession-createSession", session);
		}
		return session;
	}
	
	public Session getSession(String ut) {
		return template.selectOne("getSession", ut);
	}
}
