package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("        <title>Login</title> \n");
      out.write("        <style>\n");
      out.write("            form {\n");
      out.write("  \n");
      out.write("  height: 400px;\n");
      out.write("  display: inline-table;\n");
      out.write("  width: 500px;\n");
      out.write("  margin-left: 500px;\n");
      out.write("  margin-top: 50px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Full-width inputs */\n");
      out.write("\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("  width: 200%;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Set a style for all buttons */\n");
      out.write("button {\n");
      out.write("  background-color: darkblue;\n");
      out.write("  color: white;\n");
      out.write("  padding: 10px 20px;\n");
      out.write("  margin: 10px 0;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button a{\n");
      out.write("    text-decoration: none;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add a hover effect for buttons */\n");
      out.write("button:hover {\n");
      out.write("  opacity: 0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Extra style for the cancel button (red) */\n");
      out.write(".cancelbtn {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 10px 18px;\n");
      out.write("  background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Center the avatar image inside this container */\n");
      out.write(".imgcontainer {\n");
      out.write("  text-align: center;\n");
      out.write("  margin: 24px 0 12px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Avatar image */\n");
      out.write("img.avatar {\n");
      out.write("  width: 40%;\n");
      out.write("  border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add padding to containers */\n");
      out.write(".container {\n");
      out.write("  padding: 16px;\n");
      out.write("  margin-top: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The \"Forgot password\" text */\n");
      out.write("span.psw {\n");
      out.write("  float: right;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change styles for span and cancel button on extra small screens */\n");
      out.write("@media screen and (max-width: 300px) {\n");
      out.write("  span.psw {\n");
      out.write("    display: block;\n");
      out.write("    float: none;\n");
      out.write("  }\n");
      out.write("  .cancelbtn {\n");
      out.write("    width: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bsw{\n");
      out.write("    background-color: gainsboro;\n");
      out.write("    font-family:-apple-system,BlinkMacSystemFont,\"Segoe UI\",Roboto,\"Helvetica Neue\",Arial,sans-serif,\"Apple Color Emoji\",\"Segoe UI Emoji\",\"Segoe UI Symbol\";\n");
      out.write("    width: auto;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".next a{\n");
      out.write("\tbackground-color\t: rgb(174, 174, 250);\n");
      out.write("\tpadding                 : 2mm;\n");
      out.write("\ttext-decoration         : none;\n");
      out.write("\tborder\t\t\t: 1px solid white;\n");
      out.write("\tcolor\t\t\t: white;\n");
      out.write("        width                   : 100%;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write(".next a:hover{\n");
      out.write("\tbackground-color\t: rgb(97, 97, 163);\n");
      out.write("\tborder\t\t\t: 2px solid  black;\n");
      out.write("\n");
      out.write("\t\n");
      out.write("}\n");
      out.write(".next{\n");
      out.write("        margin-left: 600px;\n");
      out.write("\tmargin-bottom\t\t: 15mm;\n");
      out.write("\tmargin-top\t\t\t: 5mm;\n");
      out.write("\tborder-radius: 6px;\n");
      out.write("        width: 100%\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("            \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("  <form>\n");
      out.write("\n");
      out.write("  <div class=\"container\" style=\"background-color:#f1f1f1\">\n");
      out.write("      <button type=\"button\" class=\"button\"><a href=\"login.jsp\">Login</a></button>\n");
      out.write("      <button type=\"button\" class=\"button\"><a href=\"loginadmin.jsp\">Login Admin</a></button>\n");
      out.write("    <button type=\"button\" class=\"button\" ><a href=\"signup.jsp\">Create Account</a></button>\n");
      out.write("    \n");
      out.write("  </div>  \n");
      out.write("</form>\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
