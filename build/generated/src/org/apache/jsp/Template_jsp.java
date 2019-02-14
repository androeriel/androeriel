package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Template_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Exotica Travel Agency</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--Kode Navbar-->\n");
      out.write("        <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("              <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("              <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                  <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                  <span class=\"icon-bar\"></span>\n");
      out.write("                  <span class=\"icon-bar\"></span>\n");
      out.write("                  <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"HomePage.jsp\">E X O T I C A  T R A V E L by Giat Alexander Silaban</a>\n");
      out.write("              </div>\n");
      out.write(" \n");
      out.write("              <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("              <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                  <li class=\"active\"><a href=\"#\">E X O T I C A <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                  <li><a href=\"#\">Travels</a></li>\n");
      out.write("                  <li class=\"dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Check our Services <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                      <li><a href=\"Hotels.jsp\">Hotel</a></li>\n");
      out.write("                      <li><a href=\"TourPackage.jsp\">Tour Package</a></li>\n");
      out.write("                      <li><a href=\"Flights.jsp\">Airline</a></li>\n");
      out.write("                      <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                      <li><a href=\"#\">About</a></li>\n");
      out.write("                      <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                      <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"navbar-form navbar-left\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                  </div>\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("                </form>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                  <li><a href=\"#\">Travels</a></li>\n");
      out.write("                  <li class=\"dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Our Services <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                      <li><a href=\"Hotels.jsp\">Hotel</a></li>\n");
      out.write("                      <li><a href=\"TourPackage.jsp\">Tour Package</a></li>\n");
      out.write("                      <li><a href=\"Flights.jsp\">Airline</a></li>\n");
      out.write("                      <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                      <li><a href=\"#\">About</a></li>\n");
      out.write("                      <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                      <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </div><!-- /.navbar-collapse -->\n");
      out.write("            </div><!-- /.container-fluid -->\n");
      out.write("        </nav>\n");
      out.write("        <!--Akhir Navbar-->");
      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<table border='0' bgcolor='#000080' align='top' width='100%' style='height:100px'>\n");
      out.write("    <tr>\n");
      out.write("        <td bgcolor='#000080' align='center'>\n");
      out.write("            <font style='font-family: Arial Rounded MT Bold',Gadget,sans-serif;' size='+4' color='#FFE4B5'>Exotica Travels</font>\n");
      out.write("        </td>\n");
      out.write("        <td bgcolor='#000080' align='left' width='150'>\n");
      out.write("            <img src='images/companylogo_.png' width='200' height='120' align='right'/>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("<table bgcolor=\"white\" border=\"0\" align=\"top\" width=\"100%\" style=\"height:470px\">\n");
      out.write("    <tr>\n");
      out.write("        <td style=\"width: 216px;\" colspan=\"1\" rowspan=\"4\"><img style=\"width: 215px; height:560px; float:left\" alt=\"\" src=\"images/Sidebar.jpg\">\n");
      out.write("        </td>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("   ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
