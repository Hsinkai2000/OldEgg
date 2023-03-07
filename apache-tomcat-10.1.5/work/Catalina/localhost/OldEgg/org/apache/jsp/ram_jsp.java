/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.5
 * Generated at: 2023-03-07 07:59:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import java.text.*;

public final class ram_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.text");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
 
DecimalFormat priceFormatter = new DecimalFormat("$#0.00");
Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/oldegg?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                           "root", "password");
Statement stmt = conn.createStatement();
Statement stmt2 = conn.createStatement();

String sqlStr = "select * from rams";
if (request.getParameter("sort") !=null) {
  if (request.getParameter("sort").equals("lp")) {
    sqlStr = "SELECT * FROM rams ORDER BY price ASC";
  }

  if (request.getParameter("sort").equals("hp")) {
    sqlStr = "SELECT * FROM rams ORDER BY price DESC";
  }

  if (request.getParameter("sort").equals("az")) {
    sqlStr = "SELECT * FROM rams ORDER BY name ASC";
  }

  if (request.getParameter("sort").equals("za")) {
    sqlStr = "SELECT * FROM rams ORDER BY name DESC";
  }
}
ResultSet rset = stmt.executeQuery(sqlStr);

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("    <title>Old Egg | Home</title>\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"./images/oldegg-icon.png\">\n");
      out.write("    <link\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    />\n");
      out.write("    <link href=\"./style/style.css\" rel=\"stylesheet\" />\n");
      out.write("  </head>\n");
      out.write("  <body class=\"bg_default\">\n");
      out.write("    <nav\n");
      out.write("      class=\"navbar sticky-top navbar-expand-lg navbar-light bg_default\"\n");
      out.write("      style=\"padding: 20px 50px 15px 50px\"\n");
      out.write("    >\n");
      out.write("      <a\n");
      out.write("        class=\"navbar-brand\"\n");
      out.write("        href=\"index.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\n");
      out.write("        style=\"padding-bottom: 15px; padding-right: 50px\"\n");
      out.write("      >\n");
      out.write("        <img\n");
      out.write("          src=\"./images/oldegg-logo-transparent.png\"\n");
      out.write("          width=\"150dp\"\n");
      out.write("          height=\"50dp\"\n");
      out.write("          alt=\"OldEgg\"\n");
      out.write("        />\n");
      out.write("      </a>\n");
      out.write("      <form method=\"get\" action =\"search.jsp\" class=\"navbar-form\" role=\"search\">\n");
      out.write("        <div class=\"input-group\" style=\"width: 40em\">\n");
      out.write("          <input\n");
      out.write("            type=\"text\"\n");
      out.write("            class=\"form-control pl-5\"\n");
      out.write("            placeholder=\"Search parts\"\n");
      out.write("            name=\"srch-term\"\n");
      out.write("            id=\"srch-term-header\"\n");
      out.write("          />\n");
      out.write("          <input hidden name=\"uid\" ");
 if(request.getParameter("uid") != null) {
      out.write("value=\"");
      out.print(request.getParameter("uid") );
      out.write('"');
 } else {
      out.write("value=\"\" ");
}
      out.write(" />\n");
      out.write("          <div class=\"input-group-btn\">\n");
      out.write("            <button\n");
      out.write("              class=\"btn bg_orange\"\n");
      out.write("              width=\"150dp\"\n");
      out.write("              height=\"50dp\"\n");
      out.write("              type=\"submit\"\n");
      out.write("            >\n");
      out.write("              <img src=\"./images/btn-search.svg\" alt=\"Wishlist\" height=\"30dp\" />\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("      <button\n");
      out.write("        class=\"navbar-toggler\"\n");
      out.write("        type=\"button\"\n");
      out.write("        data-bs-toggle=\"collapse\"\n");
      out.write("        data-bs-target=\"#navbarNavAltMarkup\"\n");
      out.write("        aria-controls=\"navbarNavAltMarkup\"\n");
      out.write("        aria-expanded=\"false\"\n");
      out.write("        aria-label=\"Toggle navigation\"\n");
      out.write("      >\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <div\n");
      out.write("        class=\"collapse navbar-collapse fixed-right justify-content-end\"\n");
      out.write("        id=\"navbarNavAltMarkup\"\n");
      out.write("      >\n");
      out.write("        <div class=\"navbar-nav\">\n");
      out.write("          <a\n");
      out.write("            class=\"nav-item nav-link active btn rounded-pill px-4\"\n");
      out.write("            style=\"color: aliceblue; background-color: #7541b0\"\n");
      out.write("            href=\"#\"\n");
      out.write("            ><span class=\"sr-only\">Sell</span></a\n");
      out.write("          >\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"#\"\n");
      out.write("            ><img src=\"./images/btn-wishlist.svg\" alt=\"Wishlist\" height=\"30dp\"\n");
      out.write("          /></a>\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"#\"\n");
      out.write("            ><img src=\"./images/btn-cart.svg\" alt=\"Wishlist\" height=\"30dp\"\n");
      out.write("          /></a>\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"login.jsp\"\n");
      out.write("            ><img src=\"./images/btn-account.svg\" alt=\"Wishlist\" height=\"30dp\"\n");
      out.write("          /></a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div style=\"padding-left: 50px; padding-right: 50px\">\n");
      out.write("      <span class=\"inline\" style=\"color: #7541b0\">SHOP CATEGORIES:</span>\n");
      out.write("      <nav class=\"nav nav-pills flex-column flex-sm-row inline pb-5 pt-1\">\n");
      out.write("        <a class=\"flex-sm-fill text-sm-center nav-link bg_white border50 mx-3\"\n");
      out.write("           href=\"gpu.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\n");
      out.write("         >GPUs</a>\n");
      out.write("\n");
      out.write("        <a class=\"flex-sm-fill text-sm-center nav-link bg_white border50 mx-3\"\n");
      out.write("           href=\"cpu.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\n");
      out.write("         >CPUs</a>\n");
      out.write("        \n");
      out.write("        <a class=\"flex-sm-fill text-sm-center nav-link bg_white border50 mx-3\"\n");
      out.write("           href=\"motherboards.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\n");
      out.write("         >Motherboards</a>\n");
      out.write("         \n");
      out.write("         <a class=\"flex-sm-fill text-sm-center nav-link bg_white border50 mx-3\"\n");
      out.write("           href=\"ram.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\n");
      out.write("         >Rams</a>\n");
      out.write("\n");
      out.write("         <a class=\"flex-sm-fill text-sm-center nav-link bg_white border50 mx-3\"\n");
      out.write("           href=\"storage.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\n");
      out.write("         >Storage</a>\n");
      out.write("\n");
      out.write("         <a class=\"flex-sm-fill text-sm-center nav-link bg_white border50 mx-3\"\n");
      out.write("           href=\"cases.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\n");
      out.write("         >Cases</a>\n");
      out.write("\n");
      out.write("         <a class=\"flex-sm-fill text-sm-center nav-link bg_white border50 mx-3\"\n");
      out.write("           href=\"coolers.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\n");
      out.write("         >Coolers</a>\n");
      out.write("      </nav>\n");
      out.write("\n");
      out.write("      <div class=\"d-flex mb-3\">\n");
      out.write("        <h4 class=\"p-2\">RAM</h4>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"dropdown\">\n");
      out.write("        <button class=\"btn bg_orange dropdown-toggle\" type=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("          Sort By:\n");
      out.write("        </button>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("         \n");
      out.write("          <li><a class=\"dropdown-item\" href=\"?sort=lp&uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\">Lowest Price</a></li>\n");
      out.write("          <li><a class=\"dropdown-item\" href=\"?sort=hp&uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\">Highest Price</a></li>\n");
      out.write("          <li><a class=\"dropdown-item\" href=\"?sort=az&uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\">Name: A to Z</a></li>\n");
      out.write("          <li><a class=\"dropdown-item\" href=\"?sort=za&uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\">Name: Z to A</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("     <div class=\"row row-cols-1 row-cols-md-6 g-4\">\n");
      out.write("        ");
 while (rset.next()) {
      out.write("\n");
      out.write("          <div class=\"col\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <img src=\"");
      out.print(rset.getString("link"));
      out.write("\"class=\"card-img-top\" alt=\"...\">\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <h5 class=\"card-text\">");
      out.print(rset.getString("name"));
      out.write("</h5>\n");
      out.write("                <h5 class=\"card-text\">");
out.print(priceFormatter.format(rset.getFloat("price")));
      out.write("</h5>\n");
      out.write("                ");

                    String listing = "SELECT * FROM listings WHERE type = 'rams' AND itemID = '" +rset.getString("id")+"'";
                    ResultSet listingSet = stmt2.executeQuery(listing);
                    listingSet.next();
                    String listingID = listingSet.getString("id");
                
      out.write("\n");
      out.write("                <form method=\"get\" action=\"viewListing\">\n");
      out.write("                  <input hidden name=\"listingId\" value=\"");
      out.print(listingID);
      out.write("\"/>\n");
      out.write("                  <input hidden name=\"uid\" ");
 if(request.getParameter("uid") != null) {
      out.write("value=\"");
      out.print(request.getParameter("uid") );
      out.write('"');
 } else {
      out.write("value=\"\" ");
}
      out.write(" />\n");
      out.write("                  <button type=\"submit\" class=\"btn bg_orange\" >View Listing</button>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("    <div class=\"footer\">\n");
      out.write("      <footer class=\"site-footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12 col-md-6\">\n");
      out.write("              <h6>About</h6>\n");
      out.write("              <p class=\"text-justify\">\n");
      out.write("                OldEgg <i>Your Trusted PC Store </i> is an initiative to help\n");
      out.write("                the community of gamers and developers with their pc needs.\n");
      out.write("                OldEgg focuses on providing the most trusted and hassle free\n");
      out.write("                platform to obtain your pc parts. We will ensure you have a\n");
      out.write("                reliably working workhorse to push through all your needs.\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-xs-6 col-md-3\">\n");
      out.write("              <h6>Categories</h6>\n");
      out.write("              <ul class=\"footer-links\">\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"gpu.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\n");
      out.write("                    >GPUs</a\n");
      out.write("                  >\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"cpu.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\n");
      out.write("                    >CPUs</a\n");
      out.write("                  >\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"motherboards.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\n");
      out.write("                    >Motherboards</a\n");
      out.write("                  >\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"ram.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\n");
      out.write("                    >Rams</a\n");
      out.write("                  >\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"storage.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\n");
      out.write("                    >Storage</a\n");
      out.write("                  >\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"cases.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\n");
      out.write("                    >Cases</a\n");
      out.write("                  >\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"coolers.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\n");
      out.write("                    >Coolers</a\n");
      out.write("                  >\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <hr />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-8 col-sm-6 col-xs-12\">\n");
      out.write("              <p class=\"copyright-text\">\n");
      out.write("                Copyright &copy; 2023 All Rights Reserved by\n");
      out.write("                <a href=\"#\">Ng Hsin-Kai</a> and <a href=\"#\">Irfan Syakir</a>\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4 col-sm-6 col-xs-12\">\n");
      out.write("              <ul class=\"social-icons\">\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"facebook bg_slategrey\" href=\"#\"\n");
      out.write("                    ><i class=\"fa fa-facebook\"></i\n");
      out.write("                  ></a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"twitter bg_slategrey\" href=\"#\"\n");
      out.write("                    ><i class=\"fa fa-twitter\"></i\n");
      out.write("                  ></a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"dribbble bg_slategrey\" href=\"#\"\n");
      out.write("                    ><i class=\"fa fa-dribbble\"></i\n");
      out.write("                  ></a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"linkedin bg_slategrey\" href=\"#\"\n");
      out.write("                    ><i class=\"fa fa-linkedin\"></i\n");
      out.write("                  ></a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </footer>\n");
      out.write("    </div>\n");
      out.write("    <script\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("      integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
