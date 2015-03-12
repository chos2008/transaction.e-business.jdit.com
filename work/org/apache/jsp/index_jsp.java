package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tbottom: 48px;\r\n");
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
      out.write("\theight: 40px;\r\n");
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
      out.write("\t\t\t<li>Pretty row 1</li>\r\n");
      out.write("\t\t\t<li>Pretty row 2</li>\r\n");
      out.write("\t\t\t<li>Pretty row 3</li>\r\n");
      out.write("\t\t\t<li>Pretty row 4</li>\r\n");
      out.write("\t\t\t<li>Pretty row 5</li>\r\n");
      out.write("\t\t\t<li>Pretty row 6</li>\r\n");
      out.write("\t\t\t<li>Pretty row 7</li>\r\n");
      out.write("\t\t\t<li>Pretty row 8</li>\r\n");
      out.write("\t\t\t<li>Pretty row 9</li>\r\n");
      out.write("\t\t\t<li>Pretty row 10</li>\r\n");
      out.write("\t\t\t<li>Pretty row 11</li>\r\n");
      out.write("\t\t\t<li>Pretty row 12</li>\r\n");
      out.write("\t\t\t<li>Pretty row 13</li>\r\n");
      out.write("\t\t\t<li>Pretty row 14</li>\r\n");
      out.write("\t\t\t<li>Pretty row 15</li>\r\n");
      out.write("\t\t\t<li>Pretty row 16</li>\r\n");
      out.write("\t\t\t<li>Pretty row 17</li>\r\n");
      out.write("\t\t\t<li>Pretty row 18</li>\r\n");
      out.write("\t\t\t<li>Pretty row 19</li>\r\n");
      out.write("\t\t\t<li>Pretty row 20</li>\r\n");
      out.write("\t\t\t<li>Pretty row 21</li>\r\n");
      out.write("\t\t\t<li>Pretty row 22</li>\r\n");
      out.write("\t\t\t<li>Pretty row 23</li>\r\n");
      out.write("\t\t\t<li>Pretty row 24</li>\r\n");
      out.write("\t\t\t<li>Pretty row 25</li>\r\n");
      out.write("\t\t\t<li>Pretty row 26</li>\r\n");
      out.write("\t\t\t<li>Pretty row 27</li>\r\n");
      out.write("\t\t\t<li>Pretty row 28</li>\r\n");
      out.write("\t\t\t<li>Pretty row 29</li>\r\n");
      out.write("\t\t\t<li>Pretty row 30</li>\r\n");
      out.write("\t\t\t<li>Pretty row 31</li>\r\n");
      out.write("\t\t\t<li>Pretty row 32</li>\r\n");
      out.write("\t\t\t<li>Pretty row 33</li>\r\n");
      out.write("\t\t\t<li>Pretty row 34</li>\r\n");
      out.write("\t\t\t<li>Pretty row 35</li>\r\n");
      out.write("\t\t\t<li>Pretty row 36</li>\r\n");
      out.write("\t\t\t<li>Pretty row 37</li>\r\n");
      out.write("\t\t\t<li>Pretty row 38</li>\r\n");
      out.write("\t\t\t<li>Pretty row 39</li>\r\n");
      out.write("\t\t\t<li>Pretty row 40</li>\r\n");
      out.write("\t\t\t<li>Pretty row 41</li>\r\n");
      out.write("\t\t\t<li>Pretty row 42</li>\r\n");
      out.write("\t\t\t<li>Pretty row 43</li>\r\n");
      out.write("\t\t\t<li>Pretty row 44</li>\r\n");
      out.write("\t\t\t<li>Pretty row 45</li>\r\n");
      out.write("\t\t\t<li>Pretty row 46</li>\r\n");
      out.write("\t\t\t<li>Pretty row 47</li>\r\n");
      out.write("\t\t\t<li>Pretty row 48</li>\r\n");
      out.write("\t\t\t<li>Pretty row 49</li>\r\n");
      out.write("\t\t\t<li>Pretty row 50</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\"></div>\r\n");
      out.write("\r\n");
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
