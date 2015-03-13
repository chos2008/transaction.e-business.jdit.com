package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/c.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />\r\n");
      out.write("\r\n");
      out.write("<title>谁是谁的菜</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/iscroll/iscroll.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("var myScroll;\r\n");
      out.write("\r\n");
      out.write("function loaded () {\r\n");
      out.write("\tmyScroll = new IScroll('#wrapper', {\r\n");
      out.write("\t\tscrollbars: true,\r\n");
      out.write("\t\tmouseWheel: true,\r\n");
      out.write("\t\tinteractiveScrollbars: true,\r\n");
      out.write("\t\tshrinkScrollbars: 'scale',\r\n");
      out.write("\t\tfadeScrollbars: true\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("document.addEventListener('touchmove', function (e) { e.preventDefault(); }, false);\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("* {\r\n");
      out.write("\t-webkit-box-sizing: border-box;\r\n");
      out.write("\t-moz-box-sizing: border-box;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("html {\r\n");
      out.write("\t-ms-touch-action: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body,ul,li {\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tborder: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tfont-family: ubuntu, helvetica, arial;\r\n");
      out.write("\toverflow: hidden; /* this is important to prevent the whole page to bounce */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tz-index: 2;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 45px;\r\n");
      out.write("\tline-height: 45px;\r\n");
      out.write("\tbackground: #CD235C;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tcolor: #eee;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footer {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tz-index: 2;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 48px;\r\n");
      out.write("\tbackground: #444;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tborder-top: 1px solid #444;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#wrapper {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tz-index: 1;\r\n");
      out.write("\ttop: 45px;\r\n");
      out.write("\t/*bottom: 48px;*/\r\n");
      out.write("\tbottom: 0px;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tbackground: #ccc;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#scroller {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tz-index: 1;\r\n");
      out.write("\t-webkit-tap-highlight-color: rgba(0,0,0,0);\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\t-webkit-transform: translateZ(0);\r\n");
      out.write("\t-moz-transform: translateZ(0);\r\n");
      out.write("\t-ms-transform: translateZ(0);\r\n");
      out.write("\t-o-transform: translateZ(0);\r\n");
      out.write("\ttransform: translateZ(0);\r\n");
      out.write("\t-webkit-touch-callout: none;\r\n");
      out.write("\t-webkit-user-select: none;\r\n");
      out.write("\t-moz-user-select: none;\r\n");
      out.write("\t-ms-user-select: none;\r\n");
      out.write("\tuser-select: none;\r\n");
      out.write("\t-webkit-text-size-adjust: none;\r\n");
      out.write("\t-moz-text-size-adjust: none;\r\n");
      out.write("\t-ms-text-size-adjust: none;\r\n");
      out.write("\t-o-text-size-adjust: none;\r\n");
      out.write("\ttext-size-adjust: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#scroller ul {\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#scroller li {\r\n");
      out.write("\tpadding: 0 10px;\r\n");
      out.write("\t/*height: 40px;*/\r\n");
      out.write("\tline-height: 40px;\r\n");
      out.write("\tborder-bottom: 1px solid #ccc;\r\n");
      out.write("\tborder-top: 1px solid #fff;\r\n");
      out.write("\tbackground-color: #fafafa;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"loaded()\">\r\n");
      out.write("<div id=\"header\"><a href=\"investment.jsp\">发布需求</a></div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\t<div id=\"scroller\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- \r\n");
      out.write("<div id=\"footer\"></div>\r\n");
      out.write(" -->\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /index.jsp(144,3) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requirements}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /index.jsp(144,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("variable");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<li>\r\n");
          out.write("\t\t\t\t<div style=\"margin: 2px 3px 5px 3px; border-top: 0px solid silver; border-bottom: 0px solid silver;\">\r\n");
          out.write("\t\t\t\t\t<span style=\"width: 100%; display: inline-block;\"><a href=\"\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${variable.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('-');
          out.write('标');
          out.write('号');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${variable.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></span>\r\n");
          out.write("\t\t\t\t\t<span style=\"width: 100%; display: inline-block;\">招标项目金额：");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${variable.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("元</span>\r\n");
          out.write("\t\t\t\t\t<div style=\"width: 100%; line-height: 20px; text-align: left; font-size: 10px\">\r\n");
          out.write("\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${variable.content}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<span style=\"width: 100%; display: inline-block;\">招标时间：");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${variable.startTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t</li>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
