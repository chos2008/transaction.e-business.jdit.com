/*
 * @(#)BidServiceImpl.java	1.0 2015-3-8 ����08:56:57
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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-3-8 ����08:56:57
 * @since 1.0
 */
@Service
public class BidServiceImpl implements BidService {

	@Autowired()
	@Qualifier(value = "sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	public Bid getBid(int id) {
		return template.selectOne("get-bid", id);
	}
	
	public List<Bid> list(long firstResult, int maxResultSize) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("firstResult", firstResult);
		param.put("maxResultSize", maxResultSize);
		return template.selectList("bid-list", param);
	}
	
	public List<Bid> list(long userId, long firstResult, int maxResultSize) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("userId", userId);
		param.put("firstResult", firstResult);
		param.put("maxResultSize", maxResultSize);
		return template.selectList("bid-list", param);
	}
	
	public Bid issue(Bid bid) {
		template.insert("bid-issue", bid);
		return bid;
	}
}
