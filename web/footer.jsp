<%-- 
    Document   : footer
    Created on : Jul 19, 2020, 1:35:05 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            footer {
	margin-top			: 3px;
	text-align			: center;
	background-color	: #20232e;
	padding				: 60px 0px;
}

footer ul.social-icons {
	padding-bottom		: 60px;
	margin-bottom		: 60px;
	border-bottom		: 1px solid rgba(250,250,250,0.15);
}

footer ul.social-icons li {
	display				: inline-block;
	margin-right		: 30px;
}

footer ul.social-icons li:after {
	content				: "|";
	color				: #fff;
	margin-left			: 30px;
}

footer ul.social-icons li:last-child {
	margin-right		: 0px;
}

footer ul.social-icons li:last-child::after {
	display				: none;
}

footer ul.social-icons li a {
	font-size			: 14px;
	text-transform		: uppercase;
	color				: #fff;
	font-weight			: 500;
	letter-spacing		: 0.25px;
	transition			: all .3s;
}

footer ul.social-icons li a:hover {
	color				: #f48840;
}

footer p {
	font-size			: 13px;
	text-transform		: uppercase;
	color				: #fff;
}

footer p a {
	color				: #f48840;
}

footer p a:hover {
	color				: #f48840;
}
        </style>
        <title>JSP Page</title>
        
    </head>
    <body>
        <footer>
            <div class="container2">
              <div class="row2">
                <div class="col-lg-12">
                  <ul class="social-icons">
                      <li><a>Email</a></li>
                      <li><a>Instagram</a></li>
                      <li><a>Facebook</a></li>
                      <li><a>Whatsapp</a></li>
                      <li><a>LinkedIn</a></li>
                  </ul>
                </div>
                <div class="col-lg-12">
                  <div class="copyright-text">
                    <p>&copy;Copyright 2020 Beasiswa IDN</p>
                  </div>
                </div>
              </div>
            </div>
          </footer>
    </body>
</html>
