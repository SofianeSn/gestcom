<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp" %>

<script type="text/javascript">
$(document).ready(function(){
	$(".triggerUpdate").click(function(a) {
		a.preventDefault();
		$("#modalupdate .updateBtn").attr("href", $(this).attr("href"));
		$("#modalupdate").modal();
	});
	


	$(".triggerRemove").click(function(e) {
		e.preventDefault();
		$("#modalremove .removeBtn").attr("href", $(this).attr("href"));
		$("#modalremove").modal();
	});
	
});


</script>


<h2>User List</h2>
<div class="col-sm-12">
<div class="well">
<a href='<spring:url value="/userform.html"/>' class="btn btn-primary  active" >New User</a><br> <br>

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
      <th>user name</th>
      <th>user email</th>
      <th>user password</th>
      <th> Action </th>
   </tr>
  </thead>
 <tbody>
       <c:forEach items="${users }" var="user">
                 <tr>
                     <td>
                       ${user.name}
                     </td>
                     <td>
                       ${user.email}
                     </td>
                     
                     <td>
                       ${user.password}
                     </td>
                     <td>
                     <a href='<spring:url value="/user/update/${user.id }.html"  />' class="btn btn-default  triggerUpdate">Update</a>
                       <a href='<spring:url value="/user/remove/${user.id }.html"  />' class="btn btn-danger triggerRemove">Remove</a>
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
        <h4 class="modal-title" id="myModalLabel">Remove User</h4>
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

<form:form commandName="user" cssClass="form-horizontal">
<!-- Modal -->
<div class="modal fade" id="modalupdate" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel">Update User</h4>
      </div>
      <div class="modal-body">
      
       <div class="form-group">
<label for="nomCat" class="col-sm-2 control-label">Name </label>
<div class="col-sm-10">
 <form:input path="name" title="${user.name }" cssClass="form-control"/>
</div>
</div>
<form:hidden path="id"/>
<div class="form-group">
<label for="descr" class="col-sm-2 control-label">Email  </label>
<div class="col-sm-10">
 <form:input path="email" title="${user.email }" cssClass="form-control"/>
</div>
</div>
       
       <div class="form-group">
<label for="password" class="col-sm-2 control-label">Password </label>
<div class="col-sm-10">
 <form:password path="Password" title="${user.password }" cssClass="form-control"/>
</div>
</div>
        


      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
        <a href="" class="btn btn-primary updateBtn">save</a>
      </div>
    </div>
  </div>
</div>
</form:form>