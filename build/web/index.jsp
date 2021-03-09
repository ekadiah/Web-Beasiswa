<%-- 
    Document   : index
    Created on : Jul 19, 2020, 1:49:44 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Sistem Beasiswa</title>
    <style>
        #isi{

	width				: 30%;
	height				: auto;
	background-color                : white;
	position                        : absolute;
	margin-top			: 5px;
	text-align			: left;
	
}
/*pengaturan posting*/
.isiposting{
	background-color	: lavender;
	width                   : 70%;
	height                  : 200px;
	text-align		: left;
	display			: inline-block;
	border-radius		: 10px ;
	margin-bottom		: 30px;
        margin-left             : 200px;
	margin-right		: 200px;
	padding-right           : 10px;
	font-family             : 'Roboto Condensed', sans-serif;

}

td{
    margin-left: 100px;
}

h2, p{
    margin-left: 10px;
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
div.footer{
                height: 350%;
                width: 330%;
            }
    </style>

</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
        <div id="isi">
            <TABLE>
              <tr>
                <td><div class="isiposting">
                        <h2>Beasiswa Vokasi D3(Reguler) Oleh PT Pertamina Tahun 2020</h2> <hr>
                <p>  Periode Pendaftaran: 29/06/2020 s.d 29/08/2020</p>
                <p>  Status Pendataran: Pendaftaran Dibuka</p>
                <p>  Penerima Beasiswa: 75</p>
                    </div></td>
              <td>
                <div class="isiposting">
                    <h2>  Beasiswa Vokasi D3(Reguler) Oleh PT Pertamina Tahun 2020</h2>  <hr>
                <p>  Periode Pendaftaran: 29/06/2020 s.d 29/08/2020</p>
                <p>  Status Pendataran: Pendaftaran Dibuka</p>
                <p>  Penerima Beasiswa: 75</div>
              </td></tr>
              <tr>
                <td>
                  <div class="isiposting">
                      <h2> Beasiswa Vokasi D3(Reguler) Oleh PT Pertamina Tahun 2020</h2> <hr>
                <p>  Periode Pendaftaran: 29/06/2020 s.d 29/08/2020</p>
                <p>  Status Pendataran: Pendaftaran Dibuka</p>
                <p>  Penerima Beasiswa: 75</div></td>
                <td>
                  <div class="isiposting">
                      <h2>Beasiswa Vokasi D3(Reguler) Oleh PT Pertamina Tahun 2020</h2> <hr>
                <p>  Periode Pendaftaran: 29/06/2020 s.d 29/08/2020</p>
                <p>  Status Pendataran: Pendaftaran Dibuka</p>
                <p>  Penerima Beasiswa: 75
                </div>
                </td></tr>
                <tr><td>
                  <div class="isiposting">
                      <h2>Beasiswa Vokasi D3(Reguler) Oleh PT Pertamina Tahun 2020</h2> <hr>
                <p>  Periode Pendaftaran: 29/06/2020 s.d 29/08/2020</p>
                <p>  Status Pendataran: Pendaftaran Dibuka</p>
                <p>  Penerima Beasiswa: 75</div>
                </td>
                <td>
                  <div class="isiposting">
                      <h2>Beasiswa Vokasi D3(Reguler) Oleh PT Pertamina Tahun 2020</h2><hr>
                <p>  Periode Pendaftaran: 29/06/2020 s.d 29/08/2020</p>
                <p>  Status Pendataran: Pendaftaran Dibuka</p>
                <p>  Penerima Beasiswa: 75</div>	
                </td></tr>
                
            </TABLE>
  
            <div class="footer"> <jsp:include page="footer.jsp"></jsp:include></div>
</body>
</html>

