<?php
$vt_sunucu="localhost";
$vt_kullanici="root";
$vt_sifre="";
$vt_adi="çocuklara spor merkezi1";
  

$baglan=mysqli_connect($vt_sunucu,$vt_kullanici,$vt_sifre,$vt_adi);
if(!$baglan)
{
    die("Veritabanı bağlantı işlemi basarısız".mysqli_connect_error());
}
else{
    

    include("panelgiris1.php");

}
?>