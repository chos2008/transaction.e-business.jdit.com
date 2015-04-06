/*
 * @(#)SessionInterceptor.java	1.0 2015-4-5 下午07:40:43
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

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-5 下午07:40:43
 * @since 1.0
 */
public class SessionInterceptor implements HandlerInterceptor {

	public String[] allowUrls;
	
	private HttpContextSessionManager httpContextSessionManager;
	
	/**
	 * @param allowUrls the allowUrls to set
	 */
	public void setAllowUrls(String[] allowUrls) {
		this.allowUrls = allowUrls;
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
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object obj, Exception exception)
			throws Exception {

	}

	/**
	 * (Javadoc)
	 *
	 * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj, ModelAndView mv) throws Exception {

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
        if(null != allowUrls && allowUrls.length >= 1) {
            for(String url : allowUrls) {
                if(requestUrl.contains(url)) {
                    return true;
                }
            }
        }
        Session session = httpContextSessionManager.getSession(request);
        if(session != null) {
            return true;  //返回true，则这个方面调用后会接着调用postHandle(),  afterCompletion()
        }
        throw new SessionException();
	}

}
