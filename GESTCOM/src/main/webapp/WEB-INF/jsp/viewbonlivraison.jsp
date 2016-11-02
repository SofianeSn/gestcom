<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>



<style>
body{
	font-size:16px;
}
ul li{
	list-style-type:none;
}
table{
	width:80%;
	text-align:center;
	
}
table td{
	border: solid 2px;
}
table  #titre{
	background-color:rgb(153,153,153);
}
</style>
<style media="print">
.btn{
	display:none;
}
</style>
</style>
<style media="print">
.btn{
	display:none;
}
.navbar, .row{
	display:none;
}
</style>
<body>
<ul>
<li><b>Société</b></li>
<li><b>Adresse</b></li>
<li><b>Tél/Fax</b></li>
<li><b>M.F</b></li>
<li><b>R.C</b></li>
<li><b>Email</b></li>
<li style="text-align:center"><h3>Bon de livraison numéro ${bonlivraison.numBL }</h3></li>
<li><b>Le :${bonlivraison.dateBL }</b></li>
<li><b>Livré a :${bonlivraison.client.nomCl }</b></li>
<li><b>Adresse :${bonlivraison.client.adresseCl }</b></li>
<li><b>M.F :${bonlivraison.client.mf }</b></li>
<li><b>R.C :${bonlivraison.client.rc }</b></li>
</ul>
<center><table>
<tr id="titre">
	<td><b>Qantité</b></td>
    <td><b>Désignation</b></td>
    <td><b>P.H.H.T</b></td>
    <td><b>Montant H.T</b></td>
</tr>
<tr>
	<td>${bonlivraison.quantite }</td>
    <td>${bonlivraison.articles }</td>
    <td>${bonlivraison.articles}</td>
    <td>${bonlivraison.tht }</td>
</tr>
<tr style="border:none">
<td colspan="3" style="border:none"></td>
<td colspan="1" style="border:none;font-size:20px "><b>signature / cachet</b></td>
</tr>
</table>
<br /><input type="button" onClick="window.print();" value="Print" class="btn">  
</center>