/*
 * @(#)SessionServiceImpl.java	1.0 2015-4-9 上午11:53:13
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
package org.chos.transaction.passport.oauth.impl;

import org.chos.transaction.passport.OAuthSession;
import org.chos.transaction.passport.oauth.SessionService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-9 上午11:53:13
 * @since 1.0
 */
@Service
public class SessionServiceImpl implements SessionService {

	@Autowired()
	private SqlSessionTemplate template;
	
	public OAuthSession getSession(String state) {
		return template.selectOne("authsession-getSession", state);
	}
	
	public OAuthSession createSession(OAuthSession session) {
		template.insert("createSession", session);
		return session;
	}
}
