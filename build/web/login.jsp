<%-- 
    Document   : login
    Created on : Jul 18, 2020, 4:50:56 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>Login</title> 
        <style>
            form {
  border: 3px solid #f1f1f1;
  height: 400px;
  display: inline-table;
  width: 500px;
  margin-left: 500px;
  margin-top: 50px;
  
}

/* Full-width inputs */

input[type=text], input[type=password] {
  width: 200%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 10px 20px;
  margin: 10px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

.button a{
    text-decoration: none;
    color: white;
}

/* Add a hover effect for buttons */
button:hover {
  opacity: 0.8;
}

/* Extra style for the cancel button (red) */
.cancelbtn {
  width: 100%;
  padding: 10px 18px;
  background-color: #f44336;
}

/* Center the avatar image inside this container */
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

/* Avatar image */
img.avatar {
  width: 40%;
  border-radius: 50%;
}

/* Add padding to containers */
.container {
  padding: 16px;
  margin-top: 20px;
}

/* The "Forgot password" text */
span.psw {
  float: right;
  
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
    display: block;
    float: none;
  }
  .cancelbtn {
    width: 100%;
  }
}

.bsw{
    background-color: gainsboro;
    font-family:-apple-system,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif,"Apple Color Emoji","Segoe UI Emoji","Segoe UI Symbol";
    width: auto;


}

.next a{
	background-color	: rgb(174, 174, 250);
	padding                 : 2mm;
	text-decoration         : none;
	border			: 1px solid white;
	color			: white;
        width                   : 100%;
	
}

.next a:hover{
	background-color	: rgb(97, 97, 163);
	border			: 2px solid  black;

	
}
.next{
        margin-left: 600px;
	margin-bottom		: 15mm;
	margin-top			: 5mm;
	border-radius: 6px;
        width: 100%
}





        </style>
            
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
  <form action="loginadmin" method="post">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
      <table>
          <tr> <td> <label for="uname"><b>Username</b></label></td>
              <td><input type="text" placeholder="Enter Username" name="uname" required></td></tr>

          <tr><td><label for="psw"><b>Password</b></label></td>
              <td><input type="password" placeholder="Enter Password" name="psw" required></td>

  </div>
</table>
  <div class="container" style="background-color:#f1f1f1">
      <button type="button" class="button"><a href="persyaratan.jsp">Login</a></button>
    <label><input type="checkbox" checked="checked" name="remember"> Remember me</label>
                  
    <span class="psw">Forgot <a ref="#">password?</a></span>
    
  </div>  
</form>
 
    </body>
</html>

