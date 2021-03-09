/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.BeasiswaDAO;
import DAO.DatadiriDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.BeasiswaModel;
import model.DatadiriModel; 


/**
 *
 * @author Acer
 */
public class DatadiriServlet extends HttpServlet {

    private DatadiriDAO dao;
    private BeasiswaDAO dao2;
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        dao = new DatadiriDAO();
       dao2 = new BeasiswaDAO();
        
        String action = request.getServletPath();

		try {
			switch (action) {
			case "/databaru":
				formInputdata(request, response);
				break;
			case "/insertdata":
				insertdata(request, response);
				break;
                        case "/ubahdata":
				editdata(request, response);
				break;
                        case "/hapusdata":
				deletedata(request, response);
				break;
                       case "/beasiswabaru":
				formInputBeasiswa(request, response);
				break;
			case "/tambahbeasiswa":
				insertBeasiswa(request, response);
				break;
                        case "/ubahbeasiswa":
				editBeasiswa(request, response);
				break;
                        case "/hapusbeasiswa":
				deleteBeasiswa(request, response);
				break; 
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
    }
                
     private void formInputdata(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	RequestDispatcher dp = request.getRequestDispatcher("datadiri.jsp");
	dp.forward(request, response);
    }
     
     private void insertdata(HttpServletRequest request, HttpServletResponse response) 
		throws SQLException, IOException, ServletException {
	    
      String nama= request.getParameter("nama");
      int noktp= Integer.parseInt(request.getParameter("noktp"));
      String kelamin=request.getParameter("kelamin");
      String status=request.getParameter("status");
      String agama=request.getParameter("agama");
      String tanggal=request.getParameter("tanggal");
      String alamat=request.getParameter("alamat");
      int nohp=Integer.parseInt(request.getParameter("nohp"));
      String pendidikan=request.getParameter("pendidikan");
      int tahunlulus=Integer.parseInt(request.getParameter("tahunlulus")); 
        
        DatadiriModel datadiri= new DatadiriModel(nama,noktp,kelamin,status,agama,tanggal,alamat,nohp,pendidikan,tahunlulus);
        request.setAttribute("datadiri", datadiri);
        
        
        dao.insertData(datadiri);
        
        RequestDispatcher dp = request.getRequestDispatcher("lihatData.jsp");
        dp.forward(request, response);
    }
     
     private void editdata(HttpServletRequest request, HttpServletResponse response) 
		throws SQLException, IOException, ServletException {
	int ID = Integer.parseInt(request.getParameter("ID"));    
        String nama= request.getParameter("nama");
        int noktp= Integer.parseInt(request.getParameter("noktp"));
        String kelamin=request.getParameter("kelamin");
        String status=request.getParameter("status");
        String agama=request.getParameter("agama");
        String tanggal=request.getParameter("tanggal");
        String alamat=request.getParameter("alamat");
        int nohp=Integer.parseInt(request.getParameter("nohp"));
        String pendidikan=request.getParameter("pendidikan");
        int tahunlulus=Integer.parseInt(request.getParameter("tahunlulus")); 
        
        DatadiriModel datadiri= new DatadiriModel(ID,nama,noktp,kelamin,status,agama,tanggal,alamat,nohp,pendidikan,tahunlulus);
        dao.editData(datadiri);
        request.setAttribute("datadiri", datadiri);
        RequestDispatcher dp = request.getRequestDispatcher("showdata.jsp");
        dp.forward(request, response);
        
        
    }
     private void deletedata(HttpServletRequest request, HttpServletResponse response) 
		throws SQLException, IOException {
	int ID = Integer.parseInt(request.getParameter("ID"));
	dao.deleteData(ID);
        response.sendRedirect("showdata.jsp");
    }
  
    private void formInputBeasiswa(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	RequestDispatcher dp = request.getRequestDispatcher("formbeasiswa.jsp");
	dp.forward(request, response);
    }
     
     private void insertBeasiswa(HttpServletRequest request, HttpServletResponse response) 
		throws SQLException, IOException, ServletException {
	    
       String kategori = request.getParameter("kategori");
        String jenjang = request.getParameter("jenjang");
        String lembaga= request.getParameter("lembaga");
        String surat= request.getParameter("surat");
        String periode= request.getParameter("date");
        String univ= request.getParameter("univ");
        String fakultas= request.getParameter("fakultas");
        String jurusan= request.getParameter("jurusan");
        String lokasi= request.getParameter("lokasi");
        String pernyataan= request.getParameter("pernyataan");
        
     BeasiswaModel beasiswa = new BeasiswaModel(kategori,jenjang, lembaga, surat, periode, univ, fakultas, jurusan, lokasi, pernyataan);
         request.setAttribute("beasiswa", beasiswa);
            dao2.insertData(beasiswa);
        
        RequestDispatcher dp = request.getRequestDispatcher("databeasiswa.jsp");
        dp.forward(request, response);
    }
     
     private void editBeasiswa(HttpServletRequest request, HttpServletResponse response) 
		throws SQLException, IOException, ServletException {
	int ID = Integer.parseInt(request.getParameter("ID"));    
        String kategori = request.getParameter("kategori");
        String jenjang = request.getParameter("jenjang");
        String lembaga= request.getParameter("lembaga");
        String surat= request.getParameter("surat");
        String periode= request.getParameter("date");
        String univ= request.getParameter("univ");
        String fakultas= request.getParameter("fakultas");
        String jurusan= request.getParameter("jurusan");
        String lokasi= request.getParameter("lokasi");
        String pernyataan= request.getParameter("pernyataan");
        

        BeasiswaModel beasiswa = new BeasiswaModel(ID,kategori,jenjang, lembaga, surat, periode, univ, fakultas, jurusan, lokasi, pernyataan);
        dao2.editData(beasiswa);
        request.setAttribute("beasiswa", beasiswa);
        RequestDispatcher dp = request.getRequestDispatcher("showdata2.jsp");
        dp.forward(request, response);
        
        
    }
     private void deleteBeasiswa(HttpServletRequest request, HttpServletResponse response) 
		throws SQLException, IOException {
	int ID = Integer.parseInt(request.getParameter("ID"));
	dao2.deleteData(ID);
        response.sendRedirect("showdata2.jsp");
    }
     

       


    

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
