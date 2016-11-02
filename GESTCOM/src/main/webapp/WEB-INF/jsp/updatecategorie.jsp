<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
      <%@ include file="../layout/taglib.jsp" %>
    
    
    <h1>Update Categorie </h1>
    
    <form:form commandName="categorie" cssClass="form-horizontal">
    
    <form:hidden path="idCat"/>
    
         <div class="form-group">
<label for="name" class="col-sm-2 control-label">Name </label>
<div class="col-sm-10">
 <form:input path="nomCat" title="${categorie.nomCat }" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="description" class="col-sm-2 control-label">Description </label>
<div class="col-sm-10">
 <form:input path="descr" title="${categorie.descr }" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<div class="col-sm-10">
 <input type="submit" value="save" class="btn btn_lg btn-primary"/>
</div>
</div>

 </form:form> 
