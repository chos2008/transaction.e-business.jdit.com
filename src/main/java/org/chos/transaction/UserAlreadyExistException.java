/*
 * @(#)UserAlreadyExistException.java	1.0 2015-4-5 下午06:29:37
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

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-5 下午06:29:37
 * @since 1.0
 */
public class UserAlreadyExistException extends Exception {

	private static final long serialVersionUID = -8209587712595472306L;

	/**
	 * 
	 */
	public UserAlreadyExistException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public UserAlreadyExistException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public UserAlreadyExistException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
