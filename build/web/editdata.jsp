<%-- 
    Document   : editdata
    Created on : Jul 20, 2020, 1:05:25 AM
    Author     : Acer
--%>

<%@page import="model.DatadiriModel"%>
<%@page import="DAO.DatadiriDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
              * {
  box-sizing: border-box;
}

input[type=text],input[type=number], select, textarea{
  width: 400%;
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
  padding: 12px 20px;
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
  padding: 50px;
}

.container2 {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
  margin-top: 20px;
}
.col-25 {
  
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  
  width: 75%;
  margin-top: 6px;
}

label.container2{
    width: 500%;
}


/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}
.row2:after {
  content: "";
  display: table;
 
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}

        </style>
        <title>Data Diri</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <%
            DatadiriDAO dao = new DatadiriDAO();
            String ID = request.getParameter("ID");
            DatadiriModel datadiri = dao.getDataById(Integer.parseInt(ID));
        %>
        <h1>DAFTAR BEASISWA</h1>
        <div class="container">
            <h4>Informasi Pribadi</h4>
            <form action="ubahdata" method="GET">
            <div class="row">
            <table>
                 <input type="hidden" name="ID" value="<%= datadiri.getID()%>">
                <div class="col-25">
                <tr>
                    <td><label>Nama Lengkap</label></td>
                    <td id="field"><input type="text" name="nama" value="<%= datadiri.getNama()%>"></td>
                </tr></div>
                <div class="col-75"><tr>
                        <td><label>Nomor KTP</label></td>
                        <td id="field"><input type="number" name="noktp" value="<%= datadiri.getNoktp()%>">
                    </td>
                    </tr></div>
                <div class="col-25"><tr>
                    <td><label>Jenis Kelamin</label></td>
                    <td id="field"> <select name="kelamin" >
                            <option value="<%= datadiri.getKelamin()%>"> <%= datadiri.getKelamin()%> </option>
                            <option value="Laki-Laki">Laki-Laki</option>
                            <option value="Perempuan">Perempuan</option>
                            
                        </select>
                    </td>
                    </tr></div>
                <div class="col-75"><tr>
                        <td><label>Status Menikah</label></td>
                        <td id="field"><select name="status">
                                <option value="<%=datadiri.getStatus()%>"> <%=datadiri.getStatus()%> </option>
                            <option value="Sudah">Sudah Menikah</option>
                                <option value="Belum"> Belum Menikah</option>
                        </select></td>
                    </tr> </div>
                <div class="col-25"><tr>
                        <td><label>Agama</label></td>
                    <td id="field"><select name="agama"> 
                            <option value="<%=datadiri.getAgama()%>"> <%=datadiri.getAgama() %> </option>
                            <option value="Islam">Islam</option>
                            <option value="Kristen">Kristen</option>
                            <option value="Budha">Budha</option>
                            <option value="Hindu">Hindu</option>
                            <option value="Konguchu">Konguchu</option>
                         </select></td>
                    </tr></div>
                <div class="col-75"><tr>
                        <td><label>Tanggal Lahir</label></td>
                        <td id="field"><input type="text" name="tanggal" value="<%= datadiri.getTanggal()%>"></td>
                    </tr></div>
                
                <div class="col-25"><tr>
                        <td><label>Alamat</label></td>
                        <td id="field"><textarea rows="8" cols="20" name="alamat" > <%=datadiri.getAlamat()%> </textarea></td>
                    </tr></div>
                <div class="col-75"><tr>
                        <td><label>No Handphone</label></td>
                        <td id="field"><input type="number" name="nohp" value="<%=datadiri.getNohp()%>"></td>
                    </tr></div>
                    <tr><td><h4>Pendidikan Terakhir</h4></td></tr>
                <div class="col-25"><tr>
                        
                        <td><label>Jenjang Pendidikan</label></td>
                    <td id="field"><select name="pendidikan"> 
                            <option value="<%=datadiri.getPendidikan()%>"> <%=datadiri.getPendidikan()%> </option>
                            <option value="S2">S2</option>
                            <option value="S1">S1</option>
                            <option value="D3">D3</option>
                            <option value="D2">D2</option>
                            <option value="SMA/SMK">SMA/SMK</option>
                         </select></td>
                    </tr></div>
                <div class="col-75"><tr>
                        <td><label>Tahun Kelulusan</label></td>
                    <td id="field"> <select name="tahunlulus"> 
                            <option value="<%=datadiri.getTahunlulus()%>"> <%=datadiri.getTahunlulus()%> </option>
                            <option value="2019">2019</option>
                            <option value="2018">2018</option>
                            <option value="2017">2017</option>
                            <option value="2016">2016</option>
                            <option value="2015">2015</option>
                         </select></td>
                    </tr></div>
            
                <tr>
                    <td></td>
                    <td><input type="submit" value="SUBMIT"></td>
                </tr>
            </table>
                
            </div>
        </form>
        </div>
                            <jsp:include page="footer.jsp"></jsp:include>
    </body>
    
</html>
