<%-- 
    Document   : persyaratan
    Created on : Jul 19, 2020, 2:57:05 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            input[type=submit] {
  background-color: darkslateblue;
  color: white;
  padding: 12px 60px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: left;
}

input[type=submit]:hover {
  background-color: #ccc;
}
body{
  background-color:white;
  color: black;
  padding: 12px 60px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: left;
  font-family: Baskerville Old Face;
  font-size: 18px;
}

h1{
    text-align: center;
}
    h4{
        color: #ef4223;
        
    }
    .container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 50px;
    }
    .header{
        width: 100%;
    }
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="header"><jsp:include page="header.jsp"></jsp:include></div>
        <div class="container">
            <h1>Selamat Datang di Beasiswa IDN, Jika Anda ingin mendaftar beasiswa silahkan klik button Daftar di bawah.<br></h1>
            
        <h4>Persyaratan Beasiswa</h4>
        <form action="datadiri.jsp">
       <ul>
                <li>Mengisi Data Informasi Diri</li>
                <li>Berkewarganegaraan Indonesia</li>
                <li>Memiliki Kartu Tanda Penduduk</li>
                <li>Sedang Menjalani Kuliah</li>
                <li>Penyeleksian Selama 1 Bulan</li>
                <li>Hasil Selesi akan di kirim melalui email masing - masing</li>
            <h4>Berkas Yang Harus disiapkan</h4>
            <ol>
                <li>Melampirkan Foto 4x6 dan 3x6 masing-masing 2 lembar Background foto bebas</li>
                <li>Melampirkan Surat Keterangan Penerimaan dari Perguruan Tinggi/LOA</li>
                <li>Melampirakn Essay </li>
                <li>Melampirkan Softcopy Kartu Tanda Penduduk</li>
                <li>Melampirkan Softcopy Kartu Keluarga</li>
                <li>Melampirkan Slip Gaji</li>
                <li>Melampirkan IPK  </li> 
                <li>Melampirkan file berupa soft copy ke beasiswaidn@gmail.com</li>
            </ol>
            </ul>
            
            <h4>Alur Pendaftaran</h4>
            <ol>
                <li> Membuat Akun</li>
                <li> Login</li>
                <li> Persyaratan Beasiswa</li>
                <li> Pengisiian Data Diri</li>
                <li> Pengisiian Form Beasiswa</li>
                <li> Penyeleksian</li>
                <li> Hasil Seleksi</li>
            </ol>
    <tr>
        <td><input type="submit" value="Daftar" </td>
    </tr>
        </form></div>
            <div class="header"><jsp:include page="footer.jsp"></jsp:include></div>
    </body>
</html>
