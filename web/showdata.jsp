<%-- 
    Document   : showdata
    Created on : Jul 19, 2020, 9:45:19 PM
    Author     : Acer
--%>

<%@page import="model.DatadiriModel"%>
<%@page import="DAO.DatadiriDAO"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <style>
                        body{
                color:peru;
            }

            table.tabel{
                
                margin-right: 15%;
                
                
                
            }
            
            table{
                border-collapse:  collapse;
                width: 100%;
            }

            h1{
                font-family: sans-serif;
                color:white;
                font-size: larger;
               
                text-align: center;
                padding-top: 10px;
            }

            div.header{
                height: 90px;
                width: 100%;
                
            }

            div.footer{
                height: 50px;
                width: 100%;
                
            }

            div.tabel{
                margin-left: 35%;
                margin-right: 35%;
            }

            th{
                font-family: sans-serif;
                color: white;
                height: 10px;
                background-color: darkslateblue;
            }

            td{
                width : 200px;
                text-align: center;
                color: black;
                background-color: #f2f2f2;

            }
            
            input[type=submit] {
            background-color: darkslateblue;
            color: white;
            padding: 12px 60px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            float: right;
             }
            div.button{
                margin-bottom: 100px;
                margin-top: 10px;
                
             }
             .container {
                border-radius: 5px;
                background-color: white;
                
             }

        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <%  
            
            DatadiriDAO dao = new DatadiriDAO();
            List<DatadiriModel> datadiri = dao.showAllData();
            request.setAttribute("datadiri", datadiri);
        %>
        <div class="container">
            <h1 style="color: black; font-size: x-large;">Data Beasiswa</h1>
             <table class="table" border="1 pt">
              
                 <tr>
                <th>Nama Lengkap</th>
                <th>No KTP</th>
                <th>Jenis Kelamin</th>
                <th>Status Menikah</th>
                <th>Agama</th>
                <th>Tanggal Lahir</th>
                <th>Alamat</th>
                <th>No Hanpdhone</th>
                <th>Jenjang Pendidikan</th>
                <th>Tahun Lulus</th>
                <th colspan="2">Actions</th>
            </tr>
            <c:forEach items="${datadiri}" var="i">
            <tr>
                <td>${i.getNama()}</td>
                <td>${i.getNoktp()}</td>
                <td>${i.getKelamin()}</td>
                <td>${i.getStatus()}</td>
                <td>${i.getAgama()}</td>
                <td>${i.getTanggal()}</td>
                <td>${i.getAlamat()}</td>
                <td>${i.getNohp()}</td>
                <td>${i.getPendidikan()}</td>
                <td>${i.getTahunlulus()}</td>
               
                <td><a href="hapusdata?ID=${i.getID()}">Delete</a></td>
            </tr>
            </c:forEach>
            <tr>
                    </table>
         <div class="button">
            <a href="showdata2.jsp"><input type="submit" value="Data Beasiswa"></a>
         </div></div>
     
         <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
