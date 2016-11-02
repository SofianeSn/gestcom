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
  
  
  <h2>Fournisseur List</h2>
<div class="col-sm-12">
<div class="well">
<a href='<spring:url value="/fournisseurform.html"/>' class="btn btn-primary  active" >Add Fournisseur</a><br> <br>

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
      <th> Fournisseur Name</th>
      <th> Fournisseur Email</th>
      <th> Fournisseur Adresse</th>
      <th> Fournisseur phone</th>
      <th> Fournisseur Country</th>
      <th> Action</th>
      
   </tr>
  </thead>
 <tbody>
       <c:forEach items="${fournisseurs }" var="fournisseur">
                 <tr>
                     <td>
                       ${fournisseur.nom}
                     </td>
                     <td>
                       ${fournisseur.email}
                     </td>
                     
                     <td>
                       ${fournisseur.adresse}
                     </td>
                      <td>
                       ${fournisseur.tel}
                     </td>
                     <td>
                       ${fournisseur.pays}
                     </td>
                     <td>
                       <a href='<spring:url value="/fournisseur/update/${fournisseur.idFourn}.html" />' class="btn btn-default">update</a>
                     
                       <a href='<spring:url value="/fournisseur/remove/${fournisseur.idFourn}.html" />' class="btn btn-danger triggerRemove">remove</a>
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
        <h4 class="modal-title" id="myModalLabel">Remove Fournisseur</h4>
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