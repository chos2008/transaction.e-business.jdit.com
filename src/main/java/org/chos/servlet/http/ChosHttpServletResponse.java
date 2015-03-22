/*
 * @(#)ChosHttpServletResponse.java	1.0 2015-3-22 ÏÂÎç04:47:31
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

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-3-22 ÏÂÎç04:47:31
 * @since 1.0
 */
public class ChosHttpServletResponse implements HttpServletResponse {

	private HttpServletResponse response;
	
	public ChosHttpServletResponse(HttpServletResponse response) {
		this.response = response;
	}
	
	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.ServletResponse#flushBuffer()
	 */
	public void flushBuffer() throws IOException {
		response.flushBuffer();
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.ServletResponse#getBufferSize()
	 */
	public int getBufferSize() {
		return response.getBufferSize();
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.ServletResponse#getCharacterEncoding()
	 */
	public String getCharacterEncoding() {
		return response.getCharacterEncoding();
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.ServletResponse#getContentType()
	 */
	public String getContentType() {
		return response.getContentType();
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.ServletResponse#getLocale()
	 */
	public Locale getLocale() {
		return response.getLocale();
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.ServletResponse#getOutputStream()
	 */
	public ServletOutputStream getOutputStream() throws IOException {
		return response.getOutputStream();
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.ServletResponse#getWriter()
	 */
	public PrintWriter getWriter() throws IOException {
		return response.getWriter();
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.ServletResponse#isCommitted()
	 */
	public boolean isCommitted() {
		return response.isCommitted();
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.ServletResponse#reset()
	 */
	public void reset() {
		response.reset();
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.ServletResponse#resetBuffer()
	 */
	public void resetBuffer() {
		response.resetBuffer();
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.ServletResponse#setBufferSize(int)
	 */
	public void setBufferSize(int i) {
		response.setBufferSize(i);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.ServletResponse#setCharacterEncoding(java.lang.String)
	 */
	public void setCharacterEncoding(String s) {
		response.setCharacterEncoding(s);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.ServletResponse#setContentLength(int)
	 */
	public void setContentLength(int i) {
		response.setContentLength(i);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.ServletResponse#setContentType(java.lang.String)
	 */
	public void setContentType(String s) {
		response.setContentType(s);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.ServletResponse#setLocale(java.util.Locale)
	 */
	public void setLocale(Locale locale) {
		response.setLocale(locale);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#addCookie(javax.servlet.http.Cookie)
	 */
	public void addCookie(Cookie cookie) {
		if (cookie instanceof org.chos.servlet.http.Cookie) {
			((org.chos.servlet.http.Cookie) cookie).add(response);
			return;
		}
		response.addCookie(cookie);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#containsHeader(java.lang.String)
	 */
	public boolean containsHeader(String s) {
		return response.containsHeader(s);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#encodeURL(java.lang.String)
	 */
	public String encodeURL(String s) {
		return response.encodeURL(s);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#encodeRedirectURL(java.lang.String)
	 */
	public String encodeRedirectURL(String s) {
		return response.encodeRedirectURL(s);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#encodeUrl(java.lang.String)
	 */
	public String encodeUrl(String s) {
		return response.encodeUrl(s);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#encodeRedirectUrl(java.lang.String)
	 */
	public String encodeRedirectUrl(String s) {
		return response.encodeRedirectUrl(s);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#sendError(int, java.lang.String)
	 */
	public void sendError(int i, String s) throws IOException {
		response.sendError(i, s);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#sendError(int)
	 */
	public void sendError(int i) throws IOException {
		response.sendError(i);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#sendRedirect(java.lang.String)
	 */
	public void sendRedirect(String s) throws IOException {
		response.sendRedirect(s);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#setDateHeader(java.lang.String, long)
	 */
	public void setDateHeader(String s, long l) {
		response.setDateHeader(s, l);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#addDateHeader(java.lang.String, long)
	 */
	public void addDateHeader(String s, long l) {
		response.addDateHeader(s, l);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#setHeader(java.lang.String, java.lang.String)
	 */
	public void setHeader(String s, String s1) {
		response.setHeader(s, s1);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#addHeader(java.lang.String, java.lang.String)
	 */
	public void addHeader(String s, String s1) {
		response.addHeader(s, s1);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#setIntHeader(java.lang.String, int)
	 */
	public void setIntHeader(String s, int i) {
		response.setIntHeader(s, i);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#addIntHeader(java.lang.String, int)
	 */
	public void addIntHeader(String s, int i) {
		response.addIntHeader(s, i);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#setStatus(int)
	 */
	public void setStatus(int i) {
		response.setStatus(i);
	}

	/**
	 * (Javadoc)
	 *
	 * @see javax.servlet.http.HttpServletResponse#setStatus(int, java.lang.String)
	 */
	public void setStatus(int i, String s) {
		response.setStatus(i, s);
	}
}
