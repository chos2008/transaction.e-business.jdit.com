/*
 * @(#)BidServiceImpl.java	1.0 2015-3-8 ÏÂÎç08:56:57
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-3-8 ÏÂÎç08:56:57
 * @since 1.0
 */
@Service
public class RequirementServiceImpl implements RequirementService {

	@Autowired()
	private SqlSessionTemplate template;
	
	public List<Requirement> list(long firstResult, int maxResultSize) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("firstResult", firstResult);
		param.put("maxResultSize", maxResultSize);
		return template.selectList("req-list", param);
	}
	
	public void issue(Requirement requirement) {
		template.insert("issue", requirement);
	}
}
