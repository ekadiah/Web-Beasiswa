<%-- 
    Document   : editbeasiswa
    Created on : Jul 19, 2020, 5:35:59 PM
    Author     : Acer
--%>

<%@page import="model.BeasiswaModel"%>
<%@page import="DAO.BeasiswaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            * {
  box-sizing: border-box;
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
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}

        </style>
        <title>Daftar Beasiswa</title>
    </head>
    <body>
        <%
            BeasiswaDAO dao2 = new BeasiswaDAO();
            String ID = request.getParameter("ID");
            BeasiswaModel beasiswa = dao2.getDataById(Integer.parseInt(ID));
        %>
        <jsp:include page="header.jsp"></jsp:include>
        <h1>DAFTAR BEASISWA</h1>
        <div class="container">
            <form action="ubahbeasiswa" method="GET">
            <div class="row">
            <table>
                <input type="hidden" name="ID" value="<%= beasiswa.getID() %>"
                <div class="col-25">
                <tr>
                    <td><label>Kategori</label></td>
                    <td><select name="kategori" >
                            <option value="<%=beasiswa.getKategori() %>"> <%= beasiswa.getKategori() %></option>
                                <option value="Reguler">Reguler</option>
                                <option value="Unggulan">Unggulan</option>
                        </select></td>
                </tr></div>
                <div class="col-75"><tr>
                        <td><label>Jenjang Pendidikan</label></td>
                        <td><select name="jenjang" >
                            <option value="<%= beasiswa.getJenjang() %>"><%= beasiswa.getJenjang()%></option>
                            <option value="D3">Vokasi (D3)</option>
                            <option value="S1">Sarjana (D4/S1)</option>
                            <option value="S2">Magister (S2)</option>
                            
                    </td>
                    </tr></div>
                <div class="col-25"><tr>
                        <td><label>Lembaga Beasiswa</label></td>
                    <td><select name="lembaga">
                            <option value="<%= beasiswa.getLembaga() %>"> <%= beasiswa.getLembaga()%></option>
                            <option value="Bank Indonesia">Bank Indonesia</option>
                            <option value="PT Pertamina">PT Pertamina</option>
                            <option value="PT Astra">PT Astra</option>
                            <option value="MUFG Bank">MUFG Bank</option>     
                        </select></td>
                    </tr></div>
                <div class="col-75"><tr>
                        <td><label>Surat Penerimaan Masuk Perguruan Tinggi</label></td>
                        <td><select name="surat">
                                <option value="<%= beasiswa.getSurat() %>"><%= beasiswa.getSurat()%></option>
                            <option value="Memiliki">Memiliki</option>
                                <option value="Tidak Memiliki"> Tidak Memiliki</option>
                        </select></td>
                    </tr></div>
                <div class="col-25"><tr>
                        <td><label>Periode Perkuliahan</label></td>
                    <td><input type="text" name="date" value="<%= beasiswa.getPeriode() %>"></td>
                    </tr></div>
                <div class="col-75"><tr>
                        <td><label>Universitas</label></td>
                    <td><input type="text" name="univ" value="<%= beasiswa.getUniv() %>"></td>
                    </tr></div>
                <div class="col-25"><tr>
                        <td><label>Fakultas</label></td>
                    <td><input type="text" name="fakultas" value="<%= beasiswa.getFakultas() %>"></td
                    </tr></div
                <div class="col-75"><tr>
                        <td><label>Jurusan</label></td>
                    <td><input type="text" name="jurusan" value="<%= beasiswa.getJurusan() %>" ></td>
                    </tr></div>
                
                <div class="col-25"><tr>
                        <td><label>Pemilihan Lokasi Seleksi</label></td>
                        <td><select name="lokasi">
                                    <option value="<%= beasiswa.getLokasi() %>"> <%= beasiswa.getLokasi()%></option>
                                     <option value="Jakarta">Jakarta</option>
                                     <option value="Bandung">Bandung</option>
                                     <option value="Surabaya">Surabaya</option>
                                        <option value="Yogyakarta">Yogyakarta</option>
                                        <option value="Semarang">Semarang</option>
                                         <option value="Bogor">Bogor</option>
                                             
                        </select></td>
                    </tr></div>
                <div class="col-75"><tr>
                        <td><label>Selama mengikuti proses pendaftaran<br> sampai dengan rangkaian seleksi Beasiswa IDN ini,<br> apakah Anda akan/sedang<br> proses pendaftaran beasiswa lain?</label></td>
                        <td><select name="pernyataan">
                                    <option value="<%= beasiswa.getPernyataan() %>"><%= beasiswa.getPernyataan()%></option>
                                    <option value="Ya">Ya</option>
                                    <option value="Tidak">Tidak</option>
                        </select></td>
                    </tr></div>
                <tr>
                    <td></td>
                    <td><input type="submit" value="EDIT"></td>
                </tr>
            </table>
                
            </div>
        </form>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
