/*
 * @(#)WechatPassportController.java	1.0 2015-5-23 下午06:22:36
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
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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
 * @version 1.0  2015-5-23 下午06:22:36
 * @since 1.0
 */
@Controller
public class WechatPassportController {

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

	@RequestMapping(value = "/wechat")
	public void logininput(HttpServletRequest request, HttpServletResponse response) throws IOException {
		OAuthSession session = new OAuthSession();
		sessionService.createSession(session);
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("appid", "wxd5c717bf0a6db8a5");//
		params.put("redirect_uri", URLEncoder.encode("http://chos2009.eicp.net/wechat/login.shtml", "utf-8"));
		params.put("response_type", "code");
		params.put("scope", "snsapi_userinfo");//snsapi_userinfo
		params.put("state", session.getState());
		//params.put("language", "en");
		//response.sendRedirect("https://api.weibo.com/oauth2/authorize");
		String web = request.getParameter("clientType");
		String url = null;
		if ("web".equals(web)) {
			params.put("appid", "wxae1060ae89dd9934");
			params.put("scope", "snsapi_login");
			url = getHttpRequestUrl("https://open.weixin.qq.com/connect/qrconnect", params);
		} else {
			url = getHttpRequestUrl("https://open.weixin.qq.com/connect/oauth2/authorize", params);
		}
		url = url + "#wechat_redirect";
		response.sendRedirect(url);
	}
	
	public Map<String, Object> parseParam(String param) {
		String[] params = param.split("&");
		Map<String, Object> paramMap = new HashMap<String, Object>();
		for(String p : params) {
			String ps[] = p.split("=");
			paramMap.put(ps[0], ps[1]);
		}
		return paramMap;
	}
	
	@RequestMapping(value = "/wechat/login")
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
		param.put("appid", "wxd5c717bf0a6db8a5");
		param.put("secret", "ebb68eb5937479818ac829417bf31919");
		param.put("grant_type", "authorization_code");
		param.put("code", code);
		HttpTemplate template = new HttpTemplate();
		String resp = null;
		try {
			resp = template.post("https://api.weixin.qq.com/sns/oauth2/access_token", param);
		} catch(HttpException e) {
			response.sendRedirect("http://chos2009.eicp.net/login.shtml");
		}
		Map<String, Object> paramMap = parseParam(resp);
		String ak = (String) paramMap.get("access_token");
		String openId = (String) paramMap.get("openid");
		
		param = new HashMap<String, String>();
		param.put("access_token", ak);
		param.put("openid", openId);
		param.put("lang", "zh_CN");
		try {
			resp = template.post("https://api.weixin.qq.com/sns/userinfo", param);
		} catch(HttpException e) {
			response.sendRedirect("http://chos2009.eicp.net/login.shtml");
		}
		JSONObject json = JSONObject.fromObject(resp);
		String unionId = json.getString("unionid");
		openId = json.getString("openid");
		String nickname = json.getString("nickname");
		
		User user = userService.create(unionId + "@wechat", null, "13120984792", "13120984792@qq.com", true, request, response);
		response.sendRedirect("http://chos2009.eicp.net/mindex.htm");
	}
}
