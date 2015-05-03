/*
 * @(#)DocumentServiceImpl.java	1.0 2015-4-18 下午04:02:09
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
 * @author ada
 * @version 1.0  2015-4-18 下午04:02:09
 * @since 1.0
 */
@Service
public class DocumentServiceImpl implements DocumentService {

	@Autowired()
	@Qualifier(value = "sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	public List<DocumentPart> getDocumentById(long documentId) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("documentId", documentId);
		return template.selectList("documentpart-getByDocumentId", param);
	}
	
	public List<DocumentPart> getDocument(long documentId, int type) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("documentId", documentId);
		param.put("type", type);
		return template.selectList("documentpart-getByDocumentId", param);
	}
}
