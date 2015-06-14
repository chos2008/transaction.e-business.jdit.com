/*
 * @(#)SimpleCategory.java	1.0 2015-6-13 下午02:39:48
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

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-6-13 下午02:39:48
 * @since 1.0
 */
public class SimpleCategory {

	private String name;
	
	private List<Category> proximity;
	
	public SimpleCategory(String name, List<Category> proximity) {
		this.name = name;
		this.proximity = proximity;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the proximity
	 */
	public List<Category> getProximity() {
		return proximity;
	}
	
}
