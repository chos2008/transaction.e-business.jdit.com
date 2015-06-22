package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/c.tld");
    _jspx_dependants.add("/WEB-INF/fmt.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("<title>谁是谁的菜</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/common-style.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/cart.css\"/>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/zepto/zepto.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/tips.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/iscroll/iscroll-4.2.5.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/s-item.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/index.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/list-item.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<!-- \r\n");
      out.write("<body style=\"padding: 0; min-width: 300px; max-width: 640px; margin: 0 auto;\">\r\n");
      out.write(" -->\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\" style=\"position: relative;\">\r\n");
      out.write("\t<div id=\"nav\" class=\"nav-bar\">\r\n");
      out.write("\t\t<div class=\"nav-bar-box\">\r\n");
      out.write("\t\t\t<div class=\"nav-bar-box-item\" style=\"width: 300px;\">\r\n");
      out.write("\t\t\t\t<p id=\"nav-back\" style=\"width: 90px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<!-- \r\n");
      out.write("\t\t\t\t\t<label title=\"paypal\" class=\"icon-paypal\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t\t\t\t\t<label style=\"width: 100%; display: block;\"><a href=\"/mindex.htm\" style=\" color: #ffffff;\">我的帐户</a></label>\r\n");
      out.write("\t\t\t\t\t -->\r\n");
      out.write("\t\t\t\t\t<a href=\"/mindex.htm\" style=\"width: 30px; height: 30px; margin: 0px 0px 0px 4px; position: relative; top: 5px; -webkit-user-select: none; -webkit-tap-highlight-color: rgba(0,0,0,0); display: inline-block; border-radius: 15px 15px 15px 15px; background: url('images/m_logo_j_40x40.jpg'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;\"></a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"nav-bar-box-item nav-bar-box-center-item\" style=\"\">\r\n");
      out.write("\t\t\t\t<div style=\"height: 24px; line-height: 24px; position: relative; margin: 7px auto; border: 1px solid silver; border-radius: 5px 5px 5px 5px;\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"list-item-default list-item-toolbar-box\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"list-item-t-item-normal item-normal item-selected\" style=\"font-size: 12px; padding: 0px 3px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a style=\"-webkit-user-select: none; -webkit-tap-highlight-color: rgba(0,0,0,0);\">需求</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"list-item-t-item-normal\" style=\"font-size: 12px; padding: 0px 3px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"investment.jsp\" style=\"-webkit-user-select: none; -webkit-tap-highlight-color: rgba(0,0,0,0);\">发布需求</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"list-item-t-item-normal item-bid\" style=\"font-size: 12px; padding: 0px 3px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a style=\"-webkit-user-select: none; -webkit-tap-highlight-color: rgba(0,0,0,0);\">标书</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"nav-bar-box-item nav-bar-box-end-item\" style=\"width: 300px;\">\r\n");
      out.write("\t\t\t\t<p style=\"height: 36px; line-height: 36px; margin: 0px 0px; text-align: right;\">\r\n");
      out.write("\t\t\t\t\t<!-- \r\n");
      out.write("\t\t\t\t\t<label title=\"google wallet\" class=\"icon-google-wallet\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t\t\t\t\t<label style=\"width: 100%; display: block;\"><a id=\"order-sheet\" style=\"color: #ffffff;\">接单</a></label>\r\n");
      out.write("\t\t\t\t\t -->\r\n");
      out.write("\t\t\t\t\t<a id=\"order-sheet\" style=\"width: 30px; height: 30px; margin: 0px 4px 0px 0px; position: relative; top: 5px; -webkit-user-select: none; -webkit-tap-highlight-color: rgba(0,0,0,0); color: #ffffff; display: inline-block; border-radius: 2px 2px 2px 2px; background: url('images/ied.png'); background-position: center center; background-repeat: no-repeat; background-size: 100% 100%;\"></a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"nav-bar-box nav-bar-box-cart-and-ordersheet\" style=\"height: 240px; display: none;\">\r\n");
      out.write("\t\t\t<div class=\"nav-bar-box-item nav-bar-box-center-item\" style=\"\">\r\n");
      out.write("\t\t\t\t<div style=\"height: 120px; line-height: 120px; position: relative; margin: 0px auto;\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"list-item-default\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"list-item-t-item-normal\" style=\"width: 120px; font-size: 12px; padding: 0px 3px; background: url('images/guide_cart_on.png'); background-position: center center; background-repeat: no-repeat;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript: void(0);\">购物车</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"list-item-t-item-normal\" style=\"width: 120px;font-size: 12px; padding: 0px 3px; background: url('images/guide_discover_on.png'); background-position: center center; background-repeat: no-repeat;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/order-sheet.shtml\">单子<i class=\"order-sheet-stats\">0</i></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"nav-bar-box\" style=\"padding: 4px 0px;\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width: 70px; text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"height: 80px; border: 0px solid silver;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label title=\"stripe\" class=\"icon-cc-stripe\" style=\"height: 60px; width: 60px;  margin: 0px auto; line-height: 60px; display: block; background: url('../images/aa1_60x60.png'); background-size: 60px 60px; background-position: center; background-repeat: no-repeat;\"></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label style=\"height: 14px; line-height: 14px; width: 100%; margin: 4px 0px; display: block; font-size: 12px;\"><a href=\"../investment/splash.jsp\">阿拉贷</a></label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\t<div id=\"scroller\">\r\n");
      out.write("\t\t<div id=\"pullDown\">\r\n");
      out.write("\t\t\t<span class=\"pullDownIcon\"></span><span class=\"pullDownLabel\">向下拖动刷新...</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div style=\"height: 160px; width: 100%; background-image: url('images/merchants_749x240.jpg'); background-repeat: no-repeat; background-size: 100% 100%;\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"menu-box\" style=\"padding: 4px 0px; background-color: white;\">\r\n");
      out.write("\t\t\t\t<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->\r\n");
      out.write("\t\t\t\t<div style=\"width: 70px; text-align: center;\">\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 80px; border: 0px solid silver;\">\r\n");
      out.write("\t\t\t\t\t\t<label title=\"stripe\" class=\"icon-cc-stripe\" style=\"height: 60px; width: 60px;  margin: 0px auto; line-height: 60px; border-radius: 3px 3px; display: block; background: url('../images/a_60x60.png'); background-size: 60px 60px; background-position: center; background-repeat: no-repeat;\"></label>\r\n");
      out.write("\t\t\t\t\t\t<label style=\"width: 100%; margin: 4px 0px; display: block;\"><a href=\"../investment.jsp\">发布需求</a></label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--  -->\r\n");
      out.write("\t\t\t\t<div style=\"width: 70px; text-align: center;\">\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 80px; border: 0px solid silver;\">\r\n");
      out.write("\t\t\t\t\t\t<label title=\"stripe\" class=\"icon-cc-stripe\" style=\"height: 60px; width: 60px;  margin: 0px auto; line-height: 60px; display: block; background: url('../images/aa1_60x60.png'); background-size: 60px 60px; background-position: center; background-repeat: no-repeat;\"></label>\r\n");
      out.write("\t\t\t\t\t\t<label style=\"width: 100%; margin: 4px 0px; display: block;\"><a href=\"../investment/splash.jsp\">项目</a></label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"width: 70px; text-align: center;\">\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 80px; border: 0px solid silver;\">\r\n");
      out.write("\t\t\t\t\t\t<label title=\"stripe\" class=\"icon-cc-stripe\" style=\"height: 60px; width: 60px;  margin: 0px auto; line-height: 60px; display: block; background: url('../images/aa1_60x60.png'); background-size: 60px 60px; background-position: center; background-repeat: no-repeat;\"></label>\r\n");
      out.write("\t\t\t\t\t\t<label style=\"width: 100%; margin: 4px 0px; display: block;\"><a href=\"../tag/123456789.shtml\">天使入驻</a></label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"width: 70px; text-align: center;\">\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 80px; border: 0px solid silver;\">\r\n");
      out.write("\t\t\t\t\t\t<label title=\"paypal\" class=\"icon-paypal\" style=\"height: 60px; width: 60px;  margin: 0px auto; line-height: 60px; border-radius: 3px 3px; display: block; background: url('../images/c_60x60.png'); background-size: 60px 60px; background-position: center; background-repeat: no-repeat;\"></label>\r\n");
      out.write("\t\t\t\t\t\t<label style=\"width: 100%; margin: 4px 0px; display: block;\"><a href=\"../bid/list.shtml\">附近</a></label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul id=\"thelist\" style=\"display: block;\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"pullUp\">\r\n");
      out.write("\t\t\t<span class=\"pullUpIcon\"></span><span class=\"pullUpLabel\">向上拉动刷新...</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"quicktocart\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("</div>\r\n");
      out.write("<!-- \r\n");
      out.write("<div id=\"footer\"></div>\r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/chos/template-engine/TEngine.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/zepto/event.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/zepto/fx.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/zepto-extends.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_005fimport_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f0.setParent(null);
    // /WEB-INF/index.jsp(134,3) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f0.setUrl("tmpl-index-list-item.jsp");
    int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
      if (_jspx_eval_c_005fimport_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_005fimport_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_c_005fimport_005f0[0]++;
          _jspx_th_c_005fimport_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_c_005fimport_005f0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fimport_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_005fimport_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_c_005fimport_005f0[0]--;
        }
      }
      if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl.reuse(_jspx_th_c_005fimport_005f0);
    }
    return false;
  }
}
