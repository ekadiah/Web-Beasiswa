<%-- 
    Document   : lihatData
    Created on : Jul 19, 2020, 3:05:29 AM
    Author     : Acer
--%>

<%@page import="java.util.List"%>
<%@page import="DAO.DatadiriDAO"%>
<%@page import="model.DatadiriModel"%>
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
margin-right: 100px;
  text-align: left;
  float: left;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
 
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
  float: inside;
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  float: inside;
  width: 75%;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
    float: left;
  content: "";
  display: table;
  clear: left;


}
.box{
    
}
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
          <%;
            DatadiriDAO dao = new DatadiriDAO();
            List<DatadiriModel> datadiri = dao.showAllData();
            request.setAttribute("datadiri", datadiri);
               %>
               <h1 style="text-align:center; ">Data Informasi Diri</h1>
               <div class="container">
            <form action="formbeasiswa.jsp">
            <div class="row">
               <table>
                   <div class="col-25"><tr>
                           <td><label>Nama Lengkap </label></td>
                       <c:forEach items="${datadiri}" var="i"><td><%=nama %></td></c:foreach>
                   </tr></div>
                   <div class="col-75"><tr>
                           <td><label>Nomor KTP </label></td>
                       <c:forEach items="${datadiri}" var="i"><td></td></c:foreach>
                   </tr></div>
                   <div class="col-25"><tr>
                           <td><label>Jenis Kelamin </label></td>
                       <c:forEach items="${datadiri}" var="i"><td>${i.getKelamin()}</td></c:foreach>
                   </tr></div>
                   <div class="col-75"><tr>
                           <td><label>Status Menikah </label></td>
                       <c:forEach items="${datadiri}" var="i">${i.getStatus()}</td></c:foreach>
                   </tr></div>
                   <div class="col-25"><tr>
                           <td><label> Agama </label></td>
                       <c:forEach items="${datadiri}" var="i"><td>${i.getAgama()}</td></c:foreach>
                   </tr></div>
                 
                   <div class="col-75"><tr>
                           <td><label>Tanggal Lahir </label></td>
                       <c:forEach items="${datadiri}" var="i"><td>${i.getTanggal()}</td></c:foreach>
                   </tr></div>
                   <div class="col-25"><tr>
                           <td><label>Alamat </label></td>
                       <c:forEach items="${datadiri}" var="i"><td>${i.getAlamat()}</td></c:foreach>
                   </tr></div>
                  
                   <div class="col-75"><tr>
                           <td><label>Handphone </label></td>
                       <c:forEach items="${datadiri}" var="i"><td>${i.getNohp()}</td></c:foreach>
                   </tr></div>
                   <div class="col-25"><tr>
                           <td><label>Jenjang Pendidikan </label></td>
                       <c:forEach items="${datadiri}" var="i"><td>${i.getPendidikan()}</td></c:foreach>
                   </tr></div>
                   <div class="col-75"><tr>
                           <td><label>Tahun Kelulusan </label></td>
                       <c:forEach items="${datadiri}" var="i"><td>${i.getTahunlulus()}</td></c:foreach>
                   </tr></div>
                    
                   
        </table>
                       <input type="submit" value="SAVE">
                       <td><c:forEach items="${datadiri}" var="i"><a href="editdata.jsp?ID=${i.getID()}">Edit</a></c:forEach></td>

                 </div>
            </form>
         </div>
            <jsp:include page="footer.jsp"></jsp:include>       
    </body>
</html>