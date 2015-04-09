/*
 * @(#)WeiboPassportController.java	1.0 2015-4-9 上午11:08:14
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
package org.chos.transaction.passport.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpException;
import org.chos.servlet.http.HttpTemplate;
import org.chos.transaction.User;
import org.chos.transaction.UserService;
import org.chos.transaction.passport.OAuthSession;
import org.chos.transaction.passport.oauth.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-9 上午11:08:14
 * @since 1.0
 */
@Controller
public class WeiboPassportController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private SessionService sessionService;
	
	private String getHttpRequestUrl(String url, Map<String, String> params) {
		if (params == null) {
			return url;
		}
		StringBuilder sb = new StringBuilder(url);
		if (url.indexOf("?") == -1) {
			sb.append("?");
		}
		for (Entry<String, String> entry : params.entrySet()) {
			sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
		}
		url = sb.toString();
		url = url.substring(0, url.length() - 1);
		return url;
	}

	@RequestMapping(value = "/weibo")
	public void logininput(HttpServletRequest request, HttpServletResponse response) throws IOException {
		OAuthSession session = new OAuthSession();
		sessionService.createSession(session);
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("client_id", "745794700");
		params.put("redirect_uri", "http://chos2009.eicp.net/weibo/login.shtml");
		params.put("scope", "all");
		params.put("state", session.getState());
		params.put("display", "mobile");
		params.put("forcelogin", "true");
		//params.put("language", "en");
		//response.sendRedirect("https://api.weibo.com/oauth2/authorize");
		String url = getHttpRequestUrl("https://open.weibo.cn/oauth2/authorize", params);
		response.sendRedirect(url);
	}
	
	@RequestMapping(value = "/weibo/login")
	public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String code = request.getParameter("code");
		String state = request.getParameter("state");
		OAuthSession session = sessionService.getSession(state);
		if (session == null) {
			response.sendRedirect("http://chos2009.eicp.net/login.shtml");
		}
		if (state == null) {
			response.sendRedirect("http://chos2009.eicp.net/login.shtml");
		}
		if (! state.equals(session.getState())) {
			response.sendRedirect("http://chos2009.eicp.net/login.shtml");
		}
		Map<String, String> param = new HashMap<String, String>();
		param.put("client_id", "745794700");
		param.put("client_secret", "faf14e92171d99265795121303dc9aba");
		param.put("grant_type", "authorization_code");
		param.put("code", code);
		param.put("redirect_uri", "http://chos2009.eicp.net");
		HttpTemplate template = new HttpTemplate();
		String resp = null;
		try {
			resp = template.post("https://api.weibo.com/oauth2/access_token", param);
		} catch(HttpException e) {
			response.sendRedirect("http://chos2009.eicp.net/login.shtml");
		}
		JSONObject json = JSONObject.fromObject(resp);
		String ak = json.getString("access_token");
		param = new HashMap<String, String>();
		param.put("access_token", ak);
		try {
			resp = template.post("https://api.weibo.com/oauth2/get_token_info", param);
		} catch(HttpException e) {
			response.sendRedirect("http://chos2009.eicp.net/login.shtml");
		}
		json = JSONObject.fromObject(resp);
		String userId = json.getString("uid");
		
		User user = userService.create(userId + "@weibo", null, "13120984792", "13120984792@weibo.com", true, request, response);
		response.sendRedirect("http://chos2009.eicp.net/user/index.jsp");
	}
}
