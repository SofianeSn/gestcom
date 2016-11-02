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
    
    <h2>Client List</h2>
<div class="col-sm-12">
<div class="well">
<a href='<spring:url value="/clientform.html"/>' class="btn btn-primary  active" >Add Client</a><br> <br>

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
      <th> Client Name</th>
      <th> Client Email</th>
      <th> Client Adresse</th>
      <th> Client phone</th>
      <th> Client Country</th>
      <th> Action</th>
   </tr>
  </thead>
 <tbody>
       <c:forEach items="${clients }" var="client">
                 <tr>
                     <td>
                       ${client.nomCl}
                     </td>
                     <td>
                       ${client.email}
                     </td>
                     
                     <td>
                       ${client.adresseCl}
                     </td>
                      <td>
                       ${client.tel}
                     </td>
                     <td>
                       ${client.pays}
                     </td>
                     
                     <td>
                       <a href='<spring:url value="/client/update/${client.idClent}.html" />' class="btn btn-default">update</a>
                     
                       <a href='<spring:url value="/client/remove/${client.idClent }.html" />' class="btn btn-danger triggerRemove">remove</a>
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
        <h4 class="modal-title" id="myModalLabel">Remove Client</h4>
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