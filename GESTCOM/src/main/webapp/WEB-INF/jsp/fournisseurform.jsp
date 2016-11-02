<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp" %>

<form:form commandName="fournisseur" cssClass="form-horizontal">

      <c:if test="${param.success eq true }">
      <div class="alert alert-success">Founisseur added successfully!</div>
      </c:if>
      
<div class="form-group">
<label for="nom" class="col-sm-2 control-label">Name :</label>
<div class="col-sm-10">
 <form:input path="nom"  cssClass="form-control"/>
 <form:errors path="nom" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="email" class="col-sm-2 control-label">Email :</label>
<div class="col-sm-10">
 <form:input path="email"  cssClass="form-control"/>
 <form:errors path="email" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="adresse" class="col-sm-2 control-label">Adresse :</label>
<div class="col-sm-10">
 <form:input path="adresse"  cssClass="form-control"/>
 <form:errors path="adresse" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="fax" class="col-sm-2 control-label">Fax :</label>
<div class="col-sm-10">
 <form:input path="fax"  cssClass="form-control"/>
 <form:errors path="fax" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="tel" class="col-sm-2 control-label">phone :</label>
<div class="col-sm-10">
 <form:input path="tel"  cssClass="form-control"/>
 <form:errors path="fax" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="pays" class="col-sm-2 control-label">Pays :</label>
<div class="col-sm-10">
 <form:input path="pays"  cssClass="form-control"/>
 <form:errors path="pays" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="MF" class="col-sm-2 control-label">Matricule Fiscale :</label>
<div class="col-sm-10">
 <form:input path="MF"  cssClass="form-control"/>
 <form:errors path="MF" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="RC" class="col-sm-2 control-label">Registre De Commerce :</label>
<div class="col-sm-10">
 <form:input path="RC"  cssClass="form-control"/>
 <form:errors path="RC" cssClass="error"/>
</div>
</div>

<div class="form-group">
<div class="col-sm-10">
 <input type="submit" value="save" class="btn btn_lg btn-primary"/>
</div>
</div>


</form:form>