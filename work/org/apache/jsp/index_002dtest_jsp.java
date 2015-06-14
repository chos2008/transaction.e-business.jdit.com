package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_002dtest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />\r\n");
      out.write("<meta property=\"wb:webmaster\" content=\"36343efaedf263e8\" />\r\n");
      out.write("<meta property=\"wb:webmaster\" content=\"be826800965491db\" />\r\n");
      out.write("<meta property=\"qc:admins\" content=\"2540734107320016513066547\" />\r\n");
      out.write("<title>this is index page</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/zepto/zepto.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/zepto/event.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/zepto/fx.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/zepto-extends.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/index-test.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin: 0px 0px; height: 100%; min-height: 755px; background: #4e5359 url(images/bg_universal17ced3.png) repeat 0 0; color: #666; font: 14px/1.5 Helvetica, \"微软雅黑\", \"黑体\", Arial, Tahoma; text-align: center; overflow-y: auto;\">\r\n");
      out.write("<div class=\"slide\">\r\n");
      out.write("    <p>\r\n");
      out.write("        Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\r\n");
      out.write("    </p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<button class=\"slide-trigger\">Click me</button>\r\n");
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
