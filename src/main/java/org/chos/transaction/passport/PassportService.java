/*
 * @(#)PassportService.java	1.0 2015-4-5 下午05:59:44
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-5 下午05:59:44
 * @since 1.0
 */
public interface PassportService {

	public void createSession(String username, String password, HttpServletRequest request, HttpServletResponse response) throws SessionException;
}
