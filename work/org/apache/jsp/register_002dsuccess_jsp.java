package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_002dsuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/common-style.css\"/>\r\n");
      out.write("<title>注册</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body topmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" leftmargin=\"0\" marginheight=\"0\" marginwidth=\"0\">\r\n");
      out.write("<div style=\"width: 100%; height: 35px; line-height: 35px; text-align: center; border: 0px solid silver; border-bottom: 1px solid silver;\">\r\n");
      out.write("    <label>注册</label>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("\t<div style=\"width: 100%;\">\r\n");
      out.write("\t\t<form action=\"\">\r\n");
      out.write("\t\t\t<div style=\"width: 300px; margin: 0px auto; padding: 0px 10px;\">\r\n");
      out.write("\t\t\t\t<div style=\"margin: 0px auto; margin-top: 2px; margin-bottom: 5px; display: -webkit-box; display: -webkit-flex; display: -ms-flexbox; display: flex;\">\r\n");
      out.write("\t\t\t\t\t<a href=\"user/index.jsp\" style=\"width: 100%; height: 36px; line-height: 36px; display: block; color: #fff; background-color: #ff3c3c; border-radius: 5px; -webkit-border-radius: 5px;text-align: center; font-size: 1.4rem;\">完成</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"margin: 0px auto; margin-top: 2px; margin-bottom: 5px; display: -webkit-box; display: -webkit-flex; display: -ms-flexbox; display: flex;\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/business/register.shtml\" style=\"width: 100%; height: 36px; line-height: 36px; display: block; color: #fff; background-color: #ff3c3c; border-radius: 5px; -webkit-border-radius: 5px;text-align: center; font-size: 1.4rem;\">继续注册成为商家</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
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
