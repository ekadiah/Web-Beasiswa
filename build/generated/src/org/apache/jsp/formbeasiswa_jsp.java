package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formbeasiswa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], select, textarea {\n");
      out.write("  width: 500%;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  resize: vertical;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("  padding: 12px 12px 12px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 12px 60px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color: #45a049;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25 {\n");
      out.write("  float: left;\n");
      out.write("  width: 25%;\n");
      out.write("  margin-top: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-75 {\n");
      out.write("  float: left;\n");
      out.write("  width: 75%;\n");
      out.write("  margin-top: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write(".row:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */\n");
      out.write("@media screen and (max-width: 600px) {\n");
      out.write("  .col-25, .col-75, input[type=submit] {\n");
      out.write("    width: 100%;\n");
      out.write("    margin-top: 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <title>Daftar Beasiswa</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <h1>DAFTAR BEASISWA</h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"tambahbeasiswa\" method=\"GET\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <table>\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><label>Kategori</label></td>\n");
      out.write("                    <td><select name=\"kategori\">\n");
      out.write("                            <option></option>\n");
      out.write("                                <option value=\"Reguler\">Reguler</option>\n");
      out.write("                                <option value=\"Unggulan\">Unggulan</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr></div>\n");
      out.write("                <div class=\"col-75\"><tr>\n");
      out.write("                        <td><label>Jenjang Pendidikan</label></td>\n");
      out.write("                        <td><select name=\"jenjang\">\n");
      out.write("                            <option></option>\n");
      out.write("                            <option value=\"D3\">Vokasi (D3)</option>\n");
      out.write("                            <option value=\"S1\">Sarjana (D4/S1)</option>\n");
      out.write("                            <option value=\"S2\">Magister (S2)</option>\n");
      out.write("                            \n");
      out.write("                    </td>\n");
      out.write("                    </tr></div>\n");
      out.write("                <div class=\"col-25\"><tr>\n");
      out.write("                        <td><label>Lembaga Beasiswa</label></td>\n");
      out.write("                    <td><select name=\"lembaga\">\n");
      out.write("                            <option></option>\n");
      out.write("                            <option value=\"Bank Indonesia\">Bank Indonesia</option>\n");
      out.write("                            <option value=\"PT Pertamina\">PT Pertamina</option>\n");
      out.write("                            <option value=\"PT Astra\">PT Astra</option>\n");
      out.write("                            <option value=\"MUFG Bank\">MUFG Bank</option>     \n");
      out.write("                        </select></td>\n");
      out.write("                    </tr></div>\n");
      out.write("                <div class=\"col-75\"><tr>\n");
      out.write("                        <td><label>Surat Penerimaan Masuk Perguruan Tinggi</label></td>\n");
      out.write("                        <td><select name=\"surat\">\n");
      out.write("                            <option></option>\n");
      out.write("                            <option value=\"Memiliki\">Memiliki</option>\n");
      out.write("                                <option value=\"Tidak Memiliki\"> Tidak Memiliki</option>\n");
      out.write("                        </select></td>\n");
      out.write("                    </tr></div>\n");
      out.write("                <div class=\"col-25\"><tr>\n");
      out.write("                        <td><label>Periode Perkuliahan</label></td>\n");
      out.write("                    <td><input type=\"text\" name=\"date\"></td>\n");
      out.write("                    </tr></div>\n");
      out.write("                <div class=\"col-75\"><tr>\n");
      out.write("                        <td><label>Universitas</label></td>\n");
      out.write("                    <td><input type=\"text\" name=\"univ\"></td>\n");
      out.write("                    </tr></div>\n");
      out.write("                <div class=\"col-25\"><tr>\n");
      out.write("                        <td><label>Fakultas</label></td>\n");
      out.write("                    <td><input type=\"text\" name=\"fakultas\"></td>\n");
      out.write("                    </tr></div>\n");
      out.write("                <div class=\"col-75\"><tr>\n");
      out.write("                        <td><label>Jurusan</label></td>\n");
      out.write("                    <td><input type=\"text\" name=\"jurusan\"></td>\n");
      out.write("                    </tr></div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-25\"><tr>\n");
      out.write("                        <td><label>Pemilihan Lokasi Seleksi</label></td>\n");
      out.write("                        <td><select name=\"lokasi\">\n");
      out.write("                                    <option></option>\n");
      out.write("                                     <option value=\"Jakarta\">Jakarta</option>\n");
      out.write("                                     <option value=\"Bandung\">Bandung</option>\n");
      out.write("                                     <option value=\"Surabaya\">Surabaya</option>\n");
      out.write("                                        <option value=\"Yogyakarta\">Yogyakarta</option>\n");
      out.write("                                        <option value=\"Semarang\">Semarang</option>\n");
      out.write("                                         <option value=\"Bogor\">Bogor</option>\n");
      out.write("                                             \n");
      out.write("                        </select></td>\n");
      out.write("                    </tr></div>\n");
      out.write("                <div class=\"col-75\"><tr>\n");
      out.write("                        <td><label>Selama mengikuti proses pendaftaran<br> sampai dengan rangkaian seleksi Beasiswa IDN ini,<br> apakah Anda akan/sedang<br> proses pendaftaran beasiswa lain?</label></td>\n");
      out.write("                        <td><select name=\"pernyataan\">\n");
      out.write("                                    <option ></option>\n");
      out.write("                                    <option value=\"Ya\">Ya</option>\n");
      out.write("                                    <option value=\"Tidak\">Tidak</option>\n");
      out.write("                        </select></td>\n");
      out.write("                    </tr></div>\n");
      out.write("                <tr>\n");
      out.write("                  \n");
      out.write("                        <td><b>Apakah Anda yakin data yang Anda isi sudah benar?</b></td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"checkbox\"> Ya</td>\n");
      out.write("                    <td><input type=\"submit\" value=\"DAFTAR\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
