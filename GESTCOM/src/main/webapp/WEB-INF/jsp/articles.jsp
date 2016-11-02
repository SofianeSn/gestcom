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


 
<br/>

<ul class="nav nav-pills">
  <li class="active"><a href='<spring:url value="/articles.html"></spring:url>'>Article</a></li>
  <li ><a href='<spring:url value="/categories.html"/>'>Categorie</a></li>
  <li ><a href='<spring:url value="/marque.html"/>'>Marque</a></li>
</ul>
<br/> 



<h2>Article List</h2>

<div class="col-sm-12">

<div class="well">

<a href='<spring:url value="/articleForm.html"/>' class="btn btn-primary  active" >New Article</a><br> <br>


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
      <th> article designation</th>
      <th>article categorie</th>
      <th>article marque</th>
      <th> article quantité</th>
      <th> article price</th>
      <th> action</th>
   </tr>
  </thead>
 <tbody>
       <c:forEach items="${articles }" var="article">
                 <tr>
                     <td>
                       ${article.designation}
                     </td>
                     <td>
                       ${article.categorie.nomCat}
                     </td>
                     
                     <td>
                       ${article.marque.description}
                     </td>
                     <td>
                     ${article.quantite }
                     </td>
                      <td>
                       ${article.prix_HTVA}
                     </td>
                     <td>
                     <a href='<spring:url value="/user/update/${user.id }.html"  />' class="btn btn-default  triggerUpdate">Update</a>
                     <a href='<spring:url value="/article/remove/${article.idArt }.html" />' class="btn btn-danger triggerRemove">Remove</a>
                     </td>

                 </tr>

       </c:forEach>
 </tbody>
</table>
<br/> <br/>


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
