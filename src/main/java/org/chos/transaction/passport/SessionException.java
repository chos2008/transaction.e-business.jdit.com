/*
 * @(#)SessionException.java	1.0 2015-4-5 下午06:11:24
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

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-5 下午06:11:24
 * @since 1.0
 */
public class SessionException extends Exception {

	private static final long serialVersionUID = 6313821049899836261L;

	
	private int code;
	
	public SessionException() {
		
	}
	
	public SessionException(int code) {
		super();
		this.code = code;
	}
	
	public SessionException(int code, String message) {
		super(message);
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
}
