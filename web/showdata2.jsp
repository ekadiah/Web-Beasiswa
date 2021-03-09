<%-- 
    Document   : showdata2
    Created on : Jul 20, 2020, 1:49:19 AM
    Author     : Acer
--%>

<%@page import="model.BeasiswaModel"%>
<%@page import="DAO.BeasiswaDAO"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seluruh Data Peserta</title>
        <style type="text/css">
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
                margin-right: 40px;
             }
             .container {
                border-radius: 5px;
                background-color: white;
                
             }
            
        </style>
    </head>
    <body>
        <%  
           BeasiswaDAO dao = new BeasiswaDAO();
           List<BeasiswaModel> beasiswa = dao.showAllData();
           request.setAttribute("beasiswa", beasiswa);
        %>
        <div class="header"><jsp:include page="header.jsp"></jsp:include></div> <br><br>
        <div class="container">
            <h1 style="color: black; font-size: large;">Tabel Data Beasiswa</h1>
        <table class="tabel" border="1 brown solid">
            <tr>
                <th>ID Peserta</th>
                <th>Kategori</th>
                <th>Jenjang</th>
                <th>Lembaga</th>
                <th>LOA</th>
                <th>Periode Perkuliahan</th>
                <th>Universitas</th>
                <th>Fakultas</th>
                <th>Jurusan</th>
                <th>Lokasi Tes</th>
                <th>Beasiswa Lain</th>
                <th colspan="2">Actions</th>
            </tr>
            <c:forEach items="${beasiswa}" var="i">
            <tr>
                <td>${i.getID()}</td>
                   <td>${i.getKategori()}</td>
                   <td>${i.getJenjang()}</td>
                   <td>${i.getLembaga()}</td>
                   <td>${i.getSurat()}</td>
                   <td>${i.getPeriode()}</td>
                   <td>${i.getUniv()}</td>
                   <td>${i.getFakultas()}</td>
                   <td>${i.getJurusan()}</td>
                   <td>${i.getLokasi()}</td>
                   <td>${i.getPernyataan()}</td>
                
                <td><a href="hapusbeasiswa?ID=${i.getID()}">Delete</a></td>
            </tr>
            </c:forEach>
            
        </table>
        <div class="button">
            <a href="showdata.jsp"><input type="submit" value="Data Diri"></a>
        </div>
        </div>
        
        <div class="footer"><jsp:include page="footer.jsp"></jsp:include></div>
    </body>
</html>
