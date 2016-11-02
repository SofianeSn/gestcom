<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp" %>

<form:form commandName="client" cssClass="form-horizontal">

     <c:if test="${param.success eq true }">
      <div class="alert alert-success">Client added successfully!</div>
      </c:if>
     
<div class="form-group">
<label for="nomCl" class="col-sm-2 control-label">Name :</label>
<div class="col-sm-10">
 <form:input path="nomCl" cssClass="form-control"/>
 <form:errors path="nomCl" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="email" class="col-sm-2 control-label">Email :</label>
<div class="col-sm-10">
 <form:input path="email" cssClass="form-control"/>
 <form:errors path="email" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="adresseCl" class="col-sm-2 control-label">Adresse :</label>
<div class="col-sm-10">
 <form:input path="adresseCl" cssClass="form-control"/>
 <form:errors path="adresseCl" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="Fax" class="col-sm-2 control-label">Fax :</label>
<div class="col-sm-10">
 <form:input path="fax" cssClass="form-control"/>
 <form:errors path="fax" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="tel" class="col-sm-2 control-label">phone :</label>
<div class="col-sm-10">
 <form:input path="tel" cssClass="form-control"/>
 <form:errors path="tel" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="pays" class="col-sm-2 control-label">Pays :</label>
<div class="col-sm-10">
 <form:input path="pays" cssClass="form-control"/>
 <form:errors path="pays" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="mf" class="col-sm-2 control-label">Matricule Fiscale :</label>
<div class="col-sm-10">
 <form:input path="mf" cssClass="form-control"/>
 <form:errors path="mf" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="rc" class="col-sm-2 control-label">Registre De Commerce :</label>
<div class="col-sm-10">
 <form:input path="rc" cssClass="form-control"/>
 <form:errors path="rc" cssClass="error"/>
</div>
</div>

<div class="form-group">
<div class="col-sm-10">
 <input type="submit" value="save" class="btn btn_lg btn-primary"/>
</div>
</div>


</form:form>