package org.apache.jsp.WEB_002dINF.item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<meta name=\"mobile-web-app-capable\" content=\"yes\" />\r\n");
      out.write("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("<meta name=\"MobileOptimized\" content=\"320\" />\r\n");
      out.write("<title>发布需求</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/common-style.css\"/>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../js/zepto/zepto.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../js/issue.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin: 0px 0px; padding: 0px 0px;\">\r\n");
      out.write("<div class=\"full-screen\">\r\n");
      out.write("\t<div id=\"nav\" class=\"nav-bar\">\r\n");
      out.write("\t\t<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->\r\n");
      out.write("\t\t<div class=\"nav-bar-box\">\r\n");
      out.write("\t\t\t<div class=\"nav-bar-box-item\">\r\n");
      out.write("\t\t\t\t<p id=\"nav-back\" style=\"width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;\">\r\n");
      out.write("\t\t\t\t\t<label title=\"paypal\" class=\"icon-paypal\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t\t\t\t\t<label style=\"width: 100%; display: block;\"><a href=\"javascript: void(0);\" style=\" color: #ffffff;\">返回</a></label>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"nav-bar-box-item nav-bar-box-center-item\">\r\n");
      out.write("\t\t\t\t<label class=\"text-location\" style=\"width: 100%; height: 40px; line-height: 40px; display: inline-block; white-space:nowrap; color: #ffffff;\">31.123456,121.123456</label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"nav-bar-box-item nav-bar-box-end-item\">\r\n");
      out.write("\t\t\t\t<p style=\"width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;\">\r\n");
      out.write("\t\t\t\t\t<label title=\"google wallet\" class=\"icon-google-wallet\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t\t\t\t\t<label style=\"width: 100%; display: block;\"><a id=\"issue\" href=\"javascript: void(0);\" style=\"color: #ffffff;\">发布</a></label>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width: 100%; position: absolute; top: 70px; bottom: 0px;\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div style=\"position: relative;\">\r\n");
      out.write("\t\t\t\t<i id=\"icon-location\" class=\"icon-location\" style=\"width: 13px; height: 20px; margin: 2px 3px; display: block; background: url('../../images/fah.png'); float: left;\"></i>\r\n");
      out.write("\t\t\t\t<div style=\"position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;\">\r\n");
      out.write("\t\t\t\t\t<input id=\"title\" type=\"text\" maxlength=\"32\" name=\"title\" placeholder=\"请描述您的需求\" style=\"width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div id=\"sole\" style=\"position: relative; display: block; margin-bottom: 5px;\">\r\n");
      out.write("\t\t\t<div style=\"width: 100%; position: relative;\">\r\n");
      out.write("\t\t\t\t<div style=\"margin: 2px 5px 3px; padding: 3px 5px; border: 1px solid silver; background-color: white;\">\r\n");
      out.write("\t\t\t\t\t<input id=\"contact\" type=\"text\" name=\"contact\" placeholder=\"手机/电子邮箱\" style=\"width: 100%; height: 35px; line-height: 35px; border: 0px solid red;font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div style=\"margin: 2px 5px 3px; padding: 3px 5px; border: 1px solid silver; background-color: white; background-image: url('images/qapp_center_loading.png'); background-position: center center; background-repeat: no-repeat; opacity: 0.6;\">\r\n");
      out.write("\t\t\t\t\t<textarea id=\"content\" name=\"content\" rows=\"20\" spellcheck=\"true\" contenteditable=\"true\" placeholder=\"请填写您的具体要求\" style=\"width: 100%; border: 0px solid red; margin: 0px 0px; padding: 0px 0px; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; resize: none; outline: none; opacity: 0.6; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;\"></textarea>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- \r\n");
      out.write("\t\t\t\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver; text-align: center;\">\r\n");
      out.write("\t\t\t\t\t<input id=\"sole_submit\" type=\"submit\" value=\"发布\" style=\"width: 100%; height: 35px; border: 1px solid red;\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../js/chos/template-engine/TEngine.js\" ></script>\r\n");
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
