/*
 * @(#)MerchantManagerController.java	1.0 2015-3-29 下午04:55:47
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
package org.chos.transaction.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-3-29 下午04:55:47
 * @since 1.0
 */
@Controller
public class MerchantManagerController {

	@RequestMapping(value = "/merchant/{id}")
	public String merchant(@PathVariable int id, HttpServletRequest request, HttpServletResponse response) {
		
		return "business/merchant";
	}
}
