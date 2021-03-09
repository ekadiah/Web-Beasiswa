<%-- 
    Document   : header
    Created on : Jul 19, 2020, 1:34:49 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            .header { 
	padding-block-start	: 10px;
	font-size			: 18px;
        font-weight			: 200;
	color				:white;
	background			: #20232e;
	width				: 100%;
	height				: 90px;
	
}

 .logo {
	 float				: left;
	 margin-bottom		: 10px;
	 padding-left		: 20px;
	 padding-block-end: 100px;
	 position: absolute;
 }
 .navbar {
	 float				: right;
	 padding-right: 30px;
	 font-family: brandon-grotesque, sans-serif;
	 font-size: 14px;
	 font-style: normal;
	 font-weight: normal;
	 letter-spacing: 2px;
	 line-height: 12px;
	 text-transform: uppercase;
	}

 .navbar ul {
	 list-style			: none;padding-top: 20px; padding-left: 20px;
	}

 .navbar ul li {
	 display			: inline; margin:10px;
	}

 .navbar ul li a{
	 text-decoration	: none; 
	 color				:whitesmoke;
	}

 .navbar ul li a:hover {
	 border-bottom		: 2px solid #da0808;
	}

        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="header">
        <div class="logo">
            <h1>Beasiswa IDN</h1>
        </div>
        
        <nav class="navbar">
            <ul>
                <li> <a href="index.jsp">Home</a></li>
                <li> <a href="login1.jsp">Daftar</a></li>
                
                
            </ul>
        </nav>
    </div>
    </body>
</html>
