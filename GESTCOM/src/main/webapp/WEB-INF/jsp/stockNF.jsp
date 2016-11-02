<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../layout/taglib.jsp" %>
    <script type="text/javascript">
$(document).ready(function(){
	$(".triggerRemove").click(function(e) {
		e.preventDefault();
		$("#modalremove .removeBtn").attr("href", $(this).attr("href"));
		$("#modalremove").modal();
	});
	
});


</script>
<br>

 <ul class="nav nav-pills">
  <li ><a href='<spring:url value="/stock.html"></spring:url>'>Achat/BL</a></li>
  <li ><a href='<spring:url value="/stockfacture.html"></spring:url>'>Achat/Facture</a></li>
  <li class="active"><a href='<spring:url value="/stockNF.html"></spring:url>'>Achat/NF </a></li>
    <li><a href='<spring:url value="/facture.html"></spring:url>'>Facture </a></li>
      <li><a href='<spring:url value="/stockNF.html"></spring:url>'>commande </a></li>
      <li><a href='<spring:url value="/bonlivraison.html"></spring:url>'>Bon de Livraison </a></li>
      <li><a href='<spring:url value="/stockNF.html"></spring:url>'>Devis </a></li>
      <li><a href='<spring:url value="/stockNF.html"></spring:url>'>Sortie </a></li>
        </ul>
        
<br>
<h2>StockNF List</h2>
<div class="col-sm-12">
<div class="well">
<a href='<spring:url value="/stockBLform.html"/>' class="btn btn-primary  active" >Add StockNF</a><br> <br>

<form class="navbar-form navbar-left" role="search">
  <div class="form-group">
    <input type="text" class="form-control" placeholder="Search">
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>
    <br/>
    <br/>

</div>
    
<table class="table table-bodered table-hover table-striped">

  <thead>
   <tr>
      
      <th> Marque</th>
      <th> Reference</th>
      <th> Fournisseur</th>
      <th> Nombre de boite</th>
      <th> Date</th>
      <th> Action</th>
      
      
   </tr>
  </thead>
 <tbody>
       <c:forEach items="${stockNF }" var="stockNF">
                 <tr>
                    
                     <td>
                       ${stockNF.article.marque.name}
                     </td>
                     
                     <td>
                       ${stockNF.article.ref_Art}
                     </td>
                     
                     <td>
                       ${stockNF.fournisseur.nom}
                     </td>
                     
                      <td>
                       ${stockNF.quantite}
                     </td>
                     <td>
                       ${stockNF.dateA}
                     </td>
                     
                     <td>
                       <a href='<spring:url value="/stockNF/remove/${stockNF.id }.html" />' class="btn btn-danger triggerRemove">remove</a>
                     </td>

                 </tr>

       </c:forEach>
 </tbody>
</table>
</div>

<!-- Modal -->
<div class="modal fade" id="modalremove" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel">Remove Article</h4>
      </div>
      <div class="modal-body">
        Really remove???????!!!!!!
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
        <a href="" class="btn btn-danger removeBtn">Remove</a>
      </div>
    </div>
  </div>
  </div>


