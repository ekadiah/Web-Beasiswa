package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class persyaratan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            input[type=submit] {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 12px 60px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color: #45a049;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("  background-color:white;\n");
      out.write("  color: black;\n");
      out.write("  padding: 12px 60px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  float: left;\n");
      out.write("  font-family: Baskerville Old Face;\n");
      out.write("  font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1{\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("    h4{\n");
      out.write("        color: #ef4223;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("        </style>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <h1>Selamat Datang di Beasiswa IDN, Jika Anda ingin mendaftar beasiswa silahkan klik button Daftar di bawah.<br></h1>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <h4>Persyaratan Beasiswa</h4>\n");
      out.write("        <form action=\"datadiri.jsp\">\n");
      out.write("       <ul>\n");
      out.write("                <li>Mengisi Data Informasi Diri</li>\n");
      out.write("                <li>Berkewarganegaraan Indonesia</li>\n");
      out.write("                <li>Memiliki Kartu Tanda Penduduk</li>\n");
      out.write("                <li>Sedang Menjalani Kuliah</li>\n");
      out.write("                <li>Penyeleksian Selama 1 Bulan</li>\n");
      out.write("                <li>Hasil Selesi akan di kirim melalui email masing - masing</li>\n");
      out.write("            <h4>Berkas Yang Harus disiapkan</h4>\n");
      out.write("            <ol>\n");
      out.write("                <li>Melampirkan Foto 4x6 dan 3x6 masing-masing 2 lembar Background foto bebas</li>\n");
      out.write("                <li>Melampirkan Surat Keterangan Penerimaan dari Perguruan Tinggi/LOA</li>\n");
      out.write("                <li>Melampirakn Essay </li>\n");
      out.write("                <li>Melampirkan Softcopy Kartu Tanda Penduduk</li>\n");
      out.write("                <li>Melampirkan Softcopy Kartu Keluarga</li>\n");
      out.write("                <li>Melampirkan Slip Gaji</li>\n");
      out.write("                <li>Melampirkan IPK  </li> \n");
      out.write("                <li>Melampirkan file berupa soft copy ke beasiswaidn@gmail.com</li>\n");
      out.write("            </ol>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("            <h4>Alur Pendaftaran</h4>\n");
      out.write("            <ol>\n");
      out.write("                <li> Membuat Akun</li>\n");
      out.write("                <li> Login</li>\n");
      out.write("                <li> Persyaratan Beasiswa</li>\n");
      out.write("                <li> Pengisiian Data Diri</li>\n");
      out.write("                <li> Pengisiian Form Beasiswa</li>\n");
      out.write("                <li> Penyeleksian</li>\n");
      out.write("                <li> Hasil Seleksi</li>\n");
      out.write("            </ol>\n");
      out.write("    <tr>\n");
      out.write("        <td><input type=\"submit\" value=\"Daftar\" </td>\n");
      out.write("    </tr>\n");
      out.write("        </form>\n");
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
