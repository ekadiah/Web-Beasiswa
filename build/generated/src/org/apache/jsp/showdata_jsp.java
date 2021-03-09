package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.DatadiriModel;
import DAO.DatadiriDAO;
import java.util.List;

public final class showdata_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <style>\n");
      out.write("                        body{\n");
      out.write("                color:peru;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table.tabel{\n");
      out.write("                \n");
      out.write("                margin-right: 15%;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            table{\n");
      out.write("                border-collapse:  collapse;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1{\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                color:white;\n");
      out.write("                font-size: larger;\n");
      out.write("               \n");
      out.write("                text-align: center;\n");
      out.write("                padding-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div.header{\n");
      out.write("                height: 90px;\n");
      out.write("                width: 100%;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div.footer{\n");
      out.write("                height: 50px;\n");
      out.write("                width: 100%;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div.tabel{\n");
      out.write("                margin-left: 35%;\n");
      out.write("                margin-right: 35%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th{\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                color: white;\n");
      out.write("                height: 10px;\n");
      out.write("                background-color: darkslateblue;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            td{\n");
      out.write("                width : 200px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: black;\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=submit] {\n");
      out.write("            background-color: darkslateblue;\n");
      out.write("            color: white;\n");
      out.write("            padding: 12px 60px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            float: right;\n");
      out.write("             }\n");
      out.write("            div.button{\n");
      out.write("                margin-bottom: 100px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                \n");
      out.write("             }\n");
      out.write("             .container {\n");
      out.write("                border-radius: 5px;\n");
      out.write("                background-color: white;\n");
      out.write("                \n");
      out.write("             }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");
  
            
            DatadiriDAO dao = new DatadiriDAO();
            List<DatadiriModel> datadiri = dao.showAllData();
            request.setAttribute("datadiri", datadiri);
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 style=\"color: black; font-size: x-large;\">Data Beasiswa</h1>\n");
      out.write("             <table class=\"table\" border=\"1 pt\">\n");
      out.write("              \n");
      out.write("                 <tr>\n");
      out.write("                <th>Nama Lengkap</th>\n");
      out.write("                <th>No KTP</th>\n");
      out.write("                <th>Jenis Kelamin</th>\n");
      out.write("                <th>Status Menikah</th>\n");
      out.write("                <th>Agama</th>\n");
      out.write("                <th>Tanggal Lahir</th>\n");
      out.write("                <th>Alamat</th>\n");
      out.write("                <th>No Hanpdhone</th>\n");
      out.write("                <th>Jenjang Pendidikan</th>\n");
      out.write("                <th>Tahun Lulus</th>\n");
      out.write("                <th colspan=\"2\">Actions</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                    </table>\n");
      out.write("         <div class=\"button\">\n");
      out.write("            <a href=\"showdata2.jsp\"><input type=\"submit\" value=\"Data Beasiswa\"></a>\n");
      out.write("         </div></div>\n");
      out.write("     \n");
      out.write("         ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${datadiri}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <tr>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getNama()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getNoktp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getKelamin()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getStatus()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getAgama()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getTanggal()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getAlamat()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getNohp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getPendidikan()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getTahunlulus()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("               \n");
          out.write("                <td><a href=\"hapusdata?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Delete</a></td>\n");
          out.write("            </tr>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
