/*
 * @(#)CaptchaController.java	1.0 2015-4-29 下午08:32:21
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

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-29 下午08:32:21
 * @since 1.0
 */
@Controller
public class CaptchaController {

	private static final String base = "ABCDEFGHJKLMNPQRSTUVWXYZ23456789";
	
	private String generate() {
		StringBuilder sb = new StringBuilder();
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < 4; i++) {
			int j = random.nextInt(base.length());
			sb.append(base.charAt(j));
		}
		return sb.toString();
	}
	
	private Color generateColor() {
	        int r = (int) (Math.random() * 180);
	        int g = (int) (Math.random() * 180);
	        int b = (int) (Math.random() * 180);
	        return new Color(r, g, b);
	 }
	
	@RequestMapping(value = "/captcha")
	public void captcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
		BufferedImage bi = new BufferedImage(40, 18, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.getGraphics();
		String c = generate();
		g.setColor(Color.white);
		g.fillRect(1, 1, 38, 16);
		
		g.setColor(generateColor());
		g.drawString(c, 4, 13);
		response.setContentType("image/jpeg");
		ServletOutputStream os = response.getOutputStream();
//		os.write(b)
//		ImageIO.createImageOutputStream(os);
		ImageIO.write(bi, "jpg", os);
		os.flush();
		os.close();
		request.getSession().setAttribute("captcha", c);
	}
}
