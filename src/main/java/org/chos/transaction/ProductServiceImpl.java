/*
 * @(#)ProductServiceImpl.java	1.0 2014-03-10 下午09:33:57
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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2014-03-10 下午09:33:57
 * @since 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired()
	@Qualifier(value = "sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	public Product getById(long itemId) {
		List<Product> list = template.selectList("get-byId", itemId);
		return list.isEmpty() ? null : list.get(0);
	}
	
	public List<Product> getByUserId(long userId) {
		return template.selectList("get-byuserId", userId);
	}
}
