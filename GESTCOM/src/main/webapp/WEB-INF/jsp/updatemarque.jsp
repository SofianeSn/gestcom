<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    
      <%@ include file="../layout/taglib.jsp" %>
    
    
    <h1>Update Marque </h1>
    
    <form:form commandName="marque" cssClass="form-horizontal">
    
    <form:hidden path="idMarque"/>
    
         <div class="form-group">
<label for="name" class="col-sm-2 control-label">Name </label>
<div class="col-sm-10">
 <form:input path="name" title="${marque.name }" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="description" class="col-sm-2 control-label">Description </label>
<div class="col-sm-10">
 <form:input path="description" title="${marque.description }" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<div class="col-sm-10">
 <input type="submit" value="save" class="btn btn_lg btn-primary"/>
</div>
</div>

 </form:form>       
    