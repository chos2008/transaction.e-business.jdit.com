/*
 * @(#)Cookie.java	1.0 2015-3-22 ÏÂÎç04:30:52
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
package org.chos.servlet.http;

import javax.servlet.http.HttpServletResponse;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-3-22 ÏÂÎç04:30:52
 * @since 1.0
 */
public class Cookie extends javax.servlet.http.Cookie {

	private boolean httpOnly;

	public Cookie(String name, String value) {
		super(name, value);
	}
	
	public void add(HttpServletResponse response) {
		StringBuilder sb = new StringBuilder();
		sb.append(getName()).append("=").append(getValue()).append(";");
		if (getMaxAge() > 0) {
			sb.append("max-age").append("=").append(getMaxAge()).append(";");
		}
		if (getSecure()) {
			sb.append("secure").append(";");
		}
		if (httpOnly) {
			sb.append("httponly").append(";");
		}
		String s = sb.toString();
		if (s.endsWith(";")) {
			s = s.substring(0, s.length() - 1);
		}
		response.addHeader("Set-Cookie", s);
	}
	
	/**
	 * @return the httpOnly
	 */
	public boolean isHttpOnly() {
		return httpOnly;
	}

	/**
	 * @param httpOnly the httpOnly to set
	 */
	public void setHttpOnly(boolean httpOnly) {
		this.httpOnly = httpOnly;
	}
	
	
}
