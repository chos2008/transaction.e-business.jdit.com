/*
 * @(#)LoginInterceptor.java	1.0 2015-4-5 下午09:07:51
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

import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-5 下午09:07:51
 * @since 1.0
 */
public class LoginInterceptor implements HandlerInterceptor {

	private String url;
	
	private String redirectUrl;
	
	private HttpContextSessionManager httpContextSessionManager;
	
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @param redirectUrl the redirectUrl to set
	 */
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	/**
	 * @param httpContextSessionManager the httpContextSessionManager to set
	 */
	public void setHttpContextSessionManager(
			HttpContextSessionManager httpContextSessionManager) {
		this.httpContextSessionManager = httpContextSessionManager;
	}

	/**
	 * (Javadoc)
	 *
	 * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * (Javadoc)
	 *
	 * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * (Javadoc)
	 *
	 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj) throws Exception {
		String requestUrl = request.getRequestURI().replace(request.getContextPath(), "");
        System.out.println(requestUrl);
        Session session = httpContextSessionManager.getSession(request);
        if(session != null) {
        	String redirect = request.getParameter("redirect");
        	if (StringUtils.isBlank(redirect)) {
        		redirect = redirectUrl;
        	}
        	response.sendRedirect(redirect);
        }
        return true;
	}

}
