<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%@ include file="../layout/taglib.jsp" %>
 
<style>
body{
	font-size:18px;
}
ul li{
	list-style-type:none;
}
 #tab1{
	width:80%;
	text-align:center;
}
 #tab2{
	width:70%;
	text-align:center;
	

}
td{
	border: double 1px;
}
th{
	border: double 1px;
}
table  #titre{
	background-color:rgb(153,153,153);
}
</style>
<style media="print">
.btn{
	display:none;
}
.navbar, .row{
	display:none;
}
</style>

<ul>
<li><b>Société</b></li>
<li>Adresse</li>
<li>Tél/Fax</li>
<li>M.F</li>
<li>R.C</li>
<li>Email</li>
<li style="text-align:center"><b>facture numéro ${facture.numFact}</b></li>
<li>le :${facture.dateF }</li>
<li>Livré a :${facture.client.nomCl }</li>
<li>Adresse :${facture.client.adresseCl }</li>
<li>M.F : ${facture.client.mf}</li>
<li>R.C :${facture.client.rc }</li>
</ul>
<center><table>
<tr id="titre">
	<td><b>Qantité</b></td>
    <td><b>Désignation</b></td>
    <td><b>P.H.H.T</b></td>
    <td><b>Montant H.T</b></td>
</tr>
<tr>
	<td>${facture.quantite}</td>
    <td>
    ${facture.articles}
     
    </td>
    <td>${facture.total_HTVA }</td>
    <td>${facture.TTTC }</td>
</tr>

</table></center>
<br>
<center><div><table id="tab2">
<tr id="titre">
	<th>Total HT</th>
    <th>TVA</th>
    <th>Remise</th>
    <th>Fodec</th>
    <th>Timbre fiscal</th>
    <th>Net à payer</th>
</tr>
<tr>
	<td>8746578</td>
    <td>18%</td>
    <td>5%</td>
    <td>1%</td>
    <td>0.3</td>
    <td>5676778</td>
</tr>
<tr style="border:none">
<td colspan="5" style="border:none"></td>
<td colspan="1" style="border:none; font-size:20px "><b>signature / cachet</b></td>
</tr>
</table> <br>
</div>
<br /><input type="button" onClick="window.print();" value="Print" class="btn"> </center>