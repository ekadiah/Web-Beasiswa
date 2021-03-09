package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <title>Sistem Beasiswa</title>\n");
      out.write("    <style>\n");
      out.write("        #isi{\n");
      out.write("\n");
      out.write("\twidth\t\t\t\t: 30%;\n");
      out.write("\theight\t\t\t\t: auto;\n");
      out.write("\tbackground-color                : white;\n");
      out.write("\tposition                        : absolute;\n");
      out.write("\tmargin-top\t\t\t: 5px;\n");
      out.write("\ttext-align\t\t\t: left;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("/*pengaturan posting*/\n");
      out.write(".isiposting{\n");
      out.write("\tbackground-color\t: lavender;\n");
      out.write("\twidth                   : 70%;\n");
      out.write("\theight                  : 200px;\n");
      out.write("\ttext-align\t\t: left;\n");
      out.write("\tdisplay\t\t\t: inline-block;\n");
      out.write("\tborder-radius\t\t: 10px ;\n");
      out.write("\tmargin-bottom\t\t: 30px;\n");
      out.write("        margin-left             : 200px;\n");
      out.write("\tmargin-right\t\t: 200px;\n");
      out.write("\tpadding-right           : 10px;\n");
      out.write("\tfont-family             : 'Roboto Condensed', sans-serif;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("td{\n");
      out.write("    margin-left: 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2, p{\n");
      out.write("    margin-left: 10px;\n");
      out.write("}\n");
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
      out.write("div.footer{\n");
      out.write("                height: 300%;\n");
      out.write("                width: 300%;\n");
      out.write("            }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div id=\"isi\">\n");
      out.write("            <TABLE>\n");
      out.write("              <tr>\n");
      out.write("                <td><div class=\"isiposting\">\n");
      out.write("                        <h2>Beasiswa Vokasi D3(Reguler) Oleh PT Pertamina Tahun 2020</h2> <hr>\n");
      out.write("                <p>  Periode Pendaftaran: 29/06/2020 s.d 29/08/2020</p>\n");
      out.write("                <p>  Status Pendataran: Pendaftaran Dibuka</p>\n");
      out.write("                <p>  Penerima Beasiswa: 75</p>\n");
      out.write("                    </div></td>\n");
      out.write("              <td>\n");
      out.write("                <div class=\"isiposting\">\n");
      out.write("                    <h2>  Beasiswa Vokasi D3(Reguler) Oleh PT Pertamina Tahun 2020</h2>  <hr>\n");
      out.write("                <p>  Periode Pendaftaran: 29/06/2020 s.d 29/08/2020</p>\n");
      out.write("                <p>  Status Pendataran: Pendaftaran Dibuka</p>\n");
      out.write("                <p>  Penerima Beasiswa: 75</div>\n");
      out.write("              </td></tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>\n");
      out.write("                  <div class=\"isiposting\">\n");
      out.write("                      <h2> Beasiswa Vokasi D3(Reguler) Oleh PT Pertamina Tahun 2020</h2> <hr>\n");
      out.write("                <p>  Periode Pendaftaran: 29/06/2020 s.d 29/08/2020</p>\n");
      out.write("                <p>  Status Pendataran: Pendaftaran Dibuka</p>\n");
      out.write("                <p>  Penerima Beasiswa: 75</div></td>\n");
      out.write("                <td>\n");
      out.write("                  <div class=\"isiposting\">\n");
      out.write("                      <h2>Beasiswa Vokasi D3(Reguler) Oleh PT Pertamina Tahun 2020</h2> <hr>\n");
      out.write("                <p>  Periode Pendaftaran: 29/06/2020 s.d 29/08/2020</p>\n");
      out.write("                <p>  Status Pendataran: Pendaftaran Dibuka</p>\n");
      out.write("                <p>  Penerima Beasiswa: 75\n");
      out.write("                </div>\n");
      out.write("                </td></tr>\n");
      out.write("                <tr><td>\n");
      out.write("                  <div class=\"isiposting\">\n");
      out.write("                      <h2>Beasiswa Vokasi D3(Reguler) Oleh PT Pertamina Tahun 2020</h2> <hr>\n");
      out.write("                <p>  Periode Pendaftaran: 29/06/2020 s.d 29/08/2020</p>\n");
      out.write("                <p>  Status Pendataran: Pendaftaran Dibuka</p>\n");
      out.write("                <p>  Penerima Beasiswa: 75</div>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                  <div class=\"isiposting\">\n");
      out.write("                      <h2>Beasiswa Vokasi D3(Reguler) Oleh PT Pertamina Tahun 2020</h2><hr>\n");
      out.write("                <p>  Periode Pendaftaran: 29/06/2020 s.d 29/08/2020</p>\n");
      out.write("                <p>  Status Pendataran: Pendaftaran Dibuka</p>\n");
      out.write("                <p>  Penerima Beasiswa: 75</div>\t\n");
      out.write("                </td></tr>\n");
      out.write("                \n");
      out.write("            </TABLE>\n");
      out.write("  \n");
      out.write("            <div class=\"footer\"> ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
