package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/c.tld");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />\r\n");
      out.write("<title>登录</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/common-style.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\"/>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/zepto/zepto.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/tips.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/login.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body topmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" leftmargin=\"0\" marginheight=\"0\" marginwidth=\"0\" style=\"margin: 0px 0px; padding: 0px 0px;\">\r\n");
      out.write("<div style=\"width: 100%; height: 32px; line-height: 32px; text-align: center; border: 0px solid silver; border-bottom: 1px solid silver;\">\r\n");
      out.write("\t<ul class=\"list-item-t list-item-item\" style=\"position: relative;\">\r\n");
      out.write("\t\t<li class=\"list-item-t-item\" style=\"width: 33.3%\"></li>\r\n");
      out.write("\t\t<li class=\"list-item-t-item\" style=\"width: 33.3%\"><label>登录</label></li>\r\n");
      out.write("\t\t<li class=\"list-item-t-item-right\" style=\"width: 33.3%; text-align: right;\">\r\n");
      out.write("\t\t\t<p style=\"font-size: 12px; color: black;\"><a href=\"javascript: void(0);\" class=\"td-login\">使用其他帐号登录</a></p>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"  margin: 6px 0px 0px 0px;\">\r\n");
      out.write("\t<form action=\"\">\r\n");
      out.write("\t\t<input type=\"hidden\" class=\"ipt-return\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${returnUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t<div style=\"width: 300px; margin: 0px auto; padding: 0px 10px;\">\r\n");
      out.write("\t\t\t<div style=\"height: 44px; border: 1px solid #e5e5e5; border-radius: 6px 6px 0px 0px; box-shadow: -0px -1px 1px 0px #e5e5e5; -webkit-box-shadow: -0px -1px 1px 0px #e5e5e5; -moz-box-shadow: -0px -1px 1px 0px #e5e5e5; margin: 0px auto; display: -webkit-box; display: -webkit-flex; display: -ms-flexbox; display: flex;\">\r\n");
      out.write("\t\t\t\t<label for=\"\" class=\"icon-user2\" style=\"display: block; width: 42px; height: 44px; line-height: 44px; text-align: center; font-size: 1.6rem; color: #666;\"></label>\r\n");
      out.write("\t\t\t\t<div style=\"height: 43px; -webkit-box-flex: 1; -webkit-flex: 1; -ms-flex: 1; flex: 1;\">\r\n");
      out.write("\t\t\t\t\t<input id=\"username\" type=\"text\" style=\"width: 100%; border: 0px solid #e5e5e5; padding: 12px 30px 11px 0; outline: none;\" placeholder=\"手机号码/邮箱/用户名\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"height: 44px; border: 1px solid #e5e5e5; border-top-width: 0px; border-radius: 0px 0px 6px 6px; margin: 0px auto; display: -webkit-box; display: -webkit-flex; display: -ms-flexbox; display: flex;\">\r\n");
      out.write("\t\t\t\t<label for=\"\" class=\"icon-unlock-alt\" style=\"display: block; width: 42px; height: 44px; line-height: 44px; text-align: center; font-size: 1.6rem; color: #666;\"></label>\r\n");
      out.write("\t\t\t\t<div style=\"height: 43px; -webkit-box-flex: 1; -webkit-flex: 1; -ms-flex: 1; flex: 1;\">\r\n");
      out.write("\t\t\t\t\t<input id=\"password\" type=\"password\" style=\"width: 100%; border: 0px solid #e5e5e5; padding: 12px 30px 11px 0; outline: none;\" placeholder=\"请输入密码\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<p style=\"width: 100%; float: right; font-size: 12px; color: black; text-align: right;\"><a href=\"register2.shtml\">注册新用户</a></p>\r\n");
      out.write("\t\t\t<div style=\"width: 100%; margin: 0px auto; padding: 15px 0px 10px 0px; display: -webkit-box; display: -webkit-flex; display: -ms-flexbox; display: flex;\">\r\n");
      out.write("\t\t\t\t<a id=\"submit\" href=\"javascript: void(0);\" style=\"width: 100%; margin: 0px auto; height: 36px; line-height: 36px; display: block; color: #fff; background-color: #ff3c3c; border-radius: 5px; -webkit-border-radius: 5px;text-align: center; font-size: 1.4rem;\">登录</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"nav\" class=\"nav-bar\" style=\"height: 64px; position: absolute; bottom: 0px; background-color: seashell; opacity: 1; border-top: 3px solid sandybrown; display: none;\">\r\n");
      out.write("\t<div style=\"width: 100%; text-align: center; font-size: 12px; font-family: Arial, 'Microsoft YaHei';\">&nbsp;</div>\r\n");
      out.write("\t<div class=\"nav-bar-box\" style=\"\">\r\n");
      out.write("\t\t<div class=\"nav-bar-box-default-item nav-bar-box-center-item\" style=\"width: 70px; font-size: 12px; font-family: Arial, 'Microsoft YaHei';\">\r\n");
      out.write("\t\t\t<p style=\"width: 70px; margin: 0px 0px; text-align: center;\">\r\n");
      out.write("\t\t\t\t<a href=\"../wechat.shtml\" style=\"border-radius: 6px; font-size: 14px; display: block; height: 1.5rem; line-height: 1.5rem; color: #c3c6ca; border: 2px solid #42454d; background-color: #555965; padding: 0 .75rem; text-decoration: none;\">微信</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"nav-bar-box-default-item nav-bar-box-center-item\" style=\"width: 70px; font-size: 12px; font-family: Arial, 'Microsoft YaHei';\">\r\n");
      out.write("\t\t\t<p style=\"width: 70px; margin: 0px 0px; text-align: center;\">\r\n");
      out.write("\t\t\t\t<a href=\"../qq.shtml\" style=\"border-radius: 6px; font-size: 14px; display: block; height: 1.5rem; line-height: 1.5rem; color: #c3c6ca; border: 2px solid #42454d; background-color: #555965; padding: 0 .75rem; text-decoration: none;\">支付宝</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"nav-bar-box-default-item nav-bar-box-center-item\" style=\"width: 70px; font-size: 12px; font-family: Arial, 'Microsoft YaHei';\">\r\n");
      out.write("\t\t\t<p style=\"width: 70px; margin: 0px 0px; text-align: center;\">\r\n");
      out.write("\t\t\t\t<a href=\"../qq.shtml\" style=\"border-radius: 6px; font-size: 14px; display: block; height: 1.5rem; line-height: 1.5rem; color: #c3c6ca; border: 2px solid #42454d; background-color: #555965; padding: 0 .75rem; text-decoration: none;\">QQ</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"nav-bar-box-default-item nav-bar-box-center-item\" style=\"width: 70px; font-size: 12px; font-family: Arial, 'Microsoft YaHei';\">\r\n");
      out.write("\t\t\t<p style=\"width: 70px; margin: 0px 0px; text-align: center;\">\r\n");
      out.write("\t\t\t\t<a href=\"../weibo.shtml\" style=\"border-radius: 6px; font-size: 14px; display: block; height: 1.5rem; line-height: 1.5rem; color: #c3c6ca; border: 2px solid #42454d; background-color: #555965; padding: 0 .75rem; text-decoration: none;\">微博</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/chos/template-engine/TEngine.js\" ></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
