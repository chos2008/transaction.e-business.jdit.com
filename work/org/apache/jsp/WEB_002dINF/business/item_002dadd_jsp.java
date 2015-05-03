package org.apache.jsp.WEB_002dINF.business;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class item_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />\r\n");
      out.write("<title>添加商品</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/common-style.css\"/>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../js/zepto/zepto.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../js/item-add.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../js/tips.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin: 0px 0px; padding: 0px 0px;\">\r\n");
      out.write("\t<div class=\"nav-bar nav-bar-2_0\" style=\"height: 40px; \">\r\n");
      out.write("\t\t<a href=\"javascript: void(0);\" class=\"item-add\">完成</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"width: 100%; position: absolute; top: 70px; bottom: 0px;\">\r\n");
      out.write("\t\t<div style=\"position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;\">\r\n");
      out.write("\t\t\t<input id=\"name\" type=\"text\" maxlength=\"32\" name=\"title\" placeholder=\"请填写商品名称\" style=\"width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;\">\r\n");
      out.write("\t\t\t<span style=\"width: 100%; display: block; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; color: initial;  -webkit-appearance: textfield;-webkit-appearance: textfield; padding: 1px; background-color: white; border: 0px inset; border-image-source: initial; border-image-slice: initial; border-image-width: initial; border-image-outset: initial; border-image-repeat: initial; -webkit-rtl-ordering: logical; -webkit-user-select: text; cursor: auto; color: darkgrey;\">商品图片</span>\r\n");
      out.write("\t\t\t<span style=\"width: 72px; height: 72px; display: block; background: url('../../images/rate_cross_480.png'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;\"></span>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"margin: 2px 5px 3px; padding: 3px 5px 3px 15px; border: 0px solid silver; background-color: white; background-image: url('images/qapp_center_loading.png'); background-position: center center; background-repeat: no-repeat; opacity: 0.6;\">\r\n");
      out.write("\t\t\t<textarea id=\"content\" name=\"content\" rows=\"10\" spellcheck=\"true\" contenteditable=\"true\" placeholder=\"请输入商品描述\" style=\"width: 100%; border: 0px solid red; margin: 0px 0px; padding: 0px 0px; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; resize: none; outline: none; opacity: 0.6; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;\"></textarea>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;\">\r\n");
      out.write("\t\t\t<input id=\"price\" type=\"number\" maxlength=\"32\" name=\"title\" placeholder=\"请输入商品价格\" style=\"width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only; margin: 0; -moz-appearance: textfield;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;\">\r\n");
      out.write("\t\t\t<input id=\"stock\" type=\"number\" maxlength=\"32\" name=\"title\" placeholder=\"请输入商品库存\" style=\"width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only; margin: 0; -moz-appearance: textfield;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../js/chos/template-engine/TEngine.js\" ></script>\r\n");
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
