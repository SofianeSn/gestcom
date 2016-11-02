

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
  <li ><a href='<spring:url value="/articles.html"></spring:url>'>Article</a></li>
  <li class="active"><a href='<spring:url value="/categories.html"></spring:url>'>Categorie</a></li>
  <li ><a href='<spring:url value="/marque.html"></spring:url>'>Marque</a></li>
</ul>
<br/>
    
      <h2>Categorie List</h2>

<div class="col-sm-12">
<div class="well">

<!-- Button trigger modal -->
<button class="btn btn-primary " data-toggle="modal" data-target="#myModal">
  New Categorie
</button>


<form:form commandName="categorie" cssClass="form-horizontal">
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel">New Categorie</h4>
      </div>
      <div class="modal-body">
       
       <div class="form-group">
<label for="nomCat" class="col-sm-2 control-label">Name </label>
<div class="col-sm-10">
 <form:input path="nomCat" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="descr" class="col-sm-2 control-label">Description </label>
<div class="col-sm-10">
 <form:input path="descr" cssClass="form-control"/>
</div>
</div>
       
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
         <input type="submit" value="save" class="btn btn-primary"/>
        
      </div>
    </div>
  </div>
</div>
<!-- modal -->
</form:form>
<br/>
<br/>

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
      <th> Categorie Name</th>
      <th>Categorie Description</th>
      <th> Action</th>
      
   </tr>
  </thead>
 <tbody>
       <c:forEach items="${categories }" var="categorie">
                 <tr>
                     <td>
                       ${categorie.nomCat}
                     </td>
                     <td>
                       ${categorie.descr}
                     </td>
                     <td>
                       <a href='<spring:url value="/categorie/update/${categorie.idCat }.html"  />' class="btn btn-default  ">Update</a>
                     
                       <a href='<spring:url value="/categorie/remove/${categorie.idCat }.html" />' class="btn btn-danger triggerRemove">Remove</a>
                       
                     </td>
                   

                 </tr>

       </c:forEach>
 </tbody>
</table>

<!-- Modal -->
<div class="modal fade" id="modalremove" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel">Remove Categorie</h4>
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