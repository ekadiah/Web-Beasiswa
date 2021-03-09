package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.DatadiriModel;
import DAO.DatadiriDAO;

public final class editdata_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("              * {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text],input[type=number], select, textarea{\n");
      out.write("  width: 400%;\n");
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
      out.write("  padding: 12px 20px;\n");
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
      out.write("  padding: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container2 {\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  padding: 20px;\n");
      out.write("  margin-top: 20px;\n");
      out.write("}\n");
      out.write(".col-25 {\n");
      out.write("  \n");
      out.write("  width: 25%;\n");
      out.write("  margin-top: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-75 {\n");
      out.write("  \n");
      out.write("  width: 75%;\n");
      out.write("  margin-top: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label.container2{\n");
      out.write("    width: 500%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write(".row:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write(".row2:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write(" \n");
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
      out.write("        <title>Data Diri</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            DatadiriDAO dao = new DatadiriDAO();
            String ID = request.getParameter("ID");
            DatadiriModel datadiri = dao.getDataById(Integer.parseInt(ID));
        
      out.write("\n");
      out.write("        <h1>DAFTAR BEASISWA</h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h4>Informasi Pribadi</h4>\n");
      out.write("            <form action=\"ubah\" method=\"GET\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <table>\n");
      out.write("                 <input type=\"hidden\" name=\"ID\" value=\"");
      out.print( datadiri.getID() );
      out.write("\"\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><label>Nama Lengkap</label></td>\n");
      out.write("                    <td><input type=\"text\" name=\"nama\" value=\"");
      out.print( datadiri.getNama());
      out.write("\"></td>\n");
      out.write("                </tr></div>\n");
      out.write("                <div class=\"col-75\"><tr>\n");
      out.write("                        <td><label>Nomor KTP</label></td>\n");
      out.write("                        <td><input type=\"number\" name=\"noktp\" value=\"");
      out.print( datadiri.getNoktp());
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                    </tr></div>\n");
      out.write("                <div class=\"col-25\"><tr>\n");
      out.write("                    <td><label>Jenis Kelamin</label></td>\n");
      out.write("                    <td> <td> <input type=\"radio\" name=\"kelamin\" value=\"Laki-Laki\">");
      out.print( datadiri.getKelamin());
      out.write("Laki-Laki</td>\n");
      out.write("                    <td> <input type=\"radio\" name=\"kelamin\" value=\"Perempuan\">");
      out.print( datadiri.getKelamin());
      out.write("Perempuan</td>\n");
      out.write("                    </tr></div>\n");
      out.write("                <div class=\"col-75\"><tr>\n");
      out.write("                        <td><label>Status Menikah</label></td>\n");
      out.write("                        <td><select name=\"status\">\n");
      out.write("                            <option value=\"");
      out.print(datadiri.getStatus());
      out.write('"');
      out.write('>');
      out.print(datadiri.getStatus());
      out.write("</option>\n");
      out.write("                            <option value=\"Sudah\">Sudah Menikah</option>\n");
      out.write("                                <option value=\"Belum\"> Belum Menikah</option>\n");
      out.write("                        </select></td>\n");
      out.write("                    </tr></div>\n");
      out.write("                <div class=\"col-25\"><tr>\n");
      out.write("                        <td><label>Agama</label></td>\n");
      out.write("                    <td><select name=\"agama\"> \n");
      out.write("                            <option value=\"");
      out.print(datadiri.getAgama());
      out.write('"');
      out.write('>');
      out.print(datadiri.getAgama() );
      out.write("</option>\n");
      out.write("                            <option value=\"Islam\">Islam</option>\n");
      out.write("                            <option value=\"Kristen\">Kristen</option>\n");
      out.write("                            <option value=\"Budha\">Budha</option>\n");
      out.write("                            <option value=\"Hindu\">Hindu</option>\n");
      out.write("                            <option value=\"Konguchu\">Konguchu</option>\n");
      out.write("                         </select></td>\n");
      out.write("                    </tr></div>\n");
      out.write("                <div class=\"col-75\"><tr>\n");
      out.write("                        <td><label>Tanggal Lahir</label></td>\n");
      out.write("                        <td><input type=\"text\" name=\"tanggal\" value=\"");
      out.print( datadiri.getTanggal());
      out.write("\"></td>\n");
      out.write("                    </tr></div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-25\"><tr>\n");
      out.write("                        <td><label>Alamat</label></td>\n");
      out.write("                        <td><textarea rows=\"8\" cols=\"20\" name=\"alamat\" >");
      out.print(datadiri.getAlamat());
      out.write("</textarea></td>\n");
      out.write("                    </tr></div>\n");
      out.write("                <div class=\"col-75\"><tr>\n");
      out.write("                        <td><label>No Handphone</label></td>\n");
      out.write("                        <td><input type=\"number\" name=\"nohp\" value=\"");
      out.print(datadiri.getNohp());
      out.write("\"></td>\n");
      out.write("                    </tr></div>\n");
      out.write("                     </tr></div>\n");
      out.write("                <div class=\"col-25\"><tr>\n");
      out.write("                        <tr><td><h4>Pendidikan Terakhir</h4></td></tr>\n");
      out.write("                        <td><label>Jenjang Pendidikan</label></td>\n");
      out.write("                    <td><select name=\"pendidikan\"> \n");
      out.write("                            <option value=\"");
      out.print(datadiri.getPendidikan());
      out.write('"');
      out.write('>');
      out.print(datadiri.getPendidikan());
      out.write("</option>\n");
      out.write("                            <option value=\"S2\">S2</option>\n");
      out.write("                            <option value=\"S1\">S1</option>\n");
      out.write("                            <option value=\"D3\">D3</option>\n");
      out.write("                            <option value=\"D2\">D2</option>\n");
      out.write("                            <option value=\"SMA/SMK\">SMA/SMK</option>\n");
      out.write("                         </select></td>\n");
      out.write("                    </tr></div>\n");
      out.write("                <div class=\"col-75\"><tr>\n");
      out.write("                        <td><label>Tahun Kelulusan</label></td>\n");
      out.write("                    <td> <select name=\"tahunlulus\"> \n");
      out.write("                            <option value=\"");
      out.print(datadiri.getTahunlulus());
      out.write('"');
      out.write('>');
      out.print(datadiri.getTahunlulus());
      out.write("</option>\n");
      out.write("                            <option value=\"2019\">2019</option>\n");
      out.write("                            <option value=\"2018\">2018</option>\n");
      out.write("                            <option value=\"2017\">2017</option>\n");
      out.write("                            <option value=\"2016\">2016</option>\n");
      out.write("                            <option value=\"2015\">2015</option>\n");
      out.write("                         </select></td>\n");
      out.write("                    </tr></div>\n");
      out.write("             </tr></div>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <p><b>Apakah Anda sudah yakin dengan data yang sudah diisi?</b></p>\n");
      out.write("                       <label><input type=\"checkbox\">Ya</label>\n");
      out.write("</td>\n");
      out.write("                    <td><input type=\"submit\" value=\"SUBMIT\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
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
