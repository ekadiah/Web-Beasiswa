<%-- 
    Document   : databeasiswa
    Created on : Jul 18, 2020, 9:52:01 PM
    Author     : Acer
--%>

<%@page import="model.BeasiswaModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
             *{ box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 500%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
  margin-bottom: 20px;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 60px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
    float: left;
  content: "";
  display: table;
  clear: both;
}
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <%
            BeasiswaModel beasiswa = (BeasiswaModel) request.getAttribute("beasiswa");
            
        String kategori = beasiswa.getKategori();
        String jenjang = beasiswa.getJenjang();
        String lembaga= beasiswa.getLembaga();
        String surat= beasiswa.getSurat();
        String periode= beasiswa.getPeriode();
        String univ= beasiswa.getUniv();
        String fakultas= beasiswa.getFakultas();
        String jurusan= beasiswa.getJurusan();
        String lokasi= beasiswa.getLokasi();
        String pernyataan= beasiswa.getPernyataan();
            %>
        <h1>DATA BEASISWA</h1>
         <div class="container">
            <form action="persyaratan.jsp">
            <div class="row">
        <table>
                <div class="col-25">
                <tr>
                    <td><label>Kategori</label></td>
                    <td> <%= kategori %> </td>
                </tr></div>
                <div class="col-75"><tr>
                        <td><label>Jenjang Pendidikan</label></td>
                        <td><%= jenjang %>
                    </td>
                    </tr></div>
                <div class="col-25"><tr>
                        <td><label>Lembaga Beasiswa</label></td>
                    <td><%= lembaga %></td>
                    </tr></div>
                <div class="col-75"><tr>
                        <td><label>Surat Penerimaan Masuk Perguruan Tinggi</label></td>
                        <td><%= surat %></td>
                    </tr></div>
                <div class="col-25"><tr>
                        <td><label>Periode Perkuliahan</label></td>
                    <td><%= periode %></td>
                    </tr></div>
                <div class="col-75"><tr>
                        <td><label>Universitas</label></td>
                    <td><%= univ %></td>
                    </tr></div>
                <div class="col-25"><tr>
                        <td><label>Fakultas</label></td>
                    <td><%= fakultas %></td>
                    </tr></div>
                <div class="col-75"><tr>
                        <td><label>Jurusan</label></td>
                    <td><%= jurusan %></td>
                    </tr></div>
                
                <div class="col-25"><tr>
                        <td><label>Pemilihan Lokasi Seleksi</label></td>
                        <td><%= lokasi %></td>
                    </tr></div>
                <div class="col-75"><tr>
                        <td><label>Selama mengikuti proses pendaftaran<br> sampai dengan rangkaian seleksi Beasiswa IDN ini,<br> apakah Anda akan/sedang<br> proses pendaftaran beasiswa lain?</label></td>
                        <td><%= pernyataan %></td>
                    </tr></div>

                <tr>
                    
                    <td></td>                    
                    <td><input type="submit" value="HOME"></td>
                    
                </tr>
            </table>
            </div>
            </form>
         </div>
                    <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
