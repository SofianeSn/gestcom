<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp" %>

<form:form commandName="facture" cssClass="form-horizontal">

     <c:if test="${param.success eq true }">
      <div class="alert alert-success">Facture added successfully!</div>
      </c:if>
     
<div class="form-group">
<label for="nomCl" class="col-sm-2 control-label">Date :</label>
<div class="col-sm-10">
 <form:input path="dateF" cssClass="form-control"/>
 <form:errors path="dateF" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="email" class="col-sm-2 control-label">TVA :</label>
<div class="col-sm-10">
 <form:input path="tva" cssClass="form-control"/>
 <form:errors path="tva" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="adresseCl" class="col-sm-2 control-label">Remise :</label>
<div class="col-sm-10">
 <form:input path="remise" cssClass="form-control"/>
 <form:errors path="remise" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="Fax" class="col-sm-2 control-label">Fodec :</label>
<div class="col-sm-10">
 <form:input path="fodec" cssClass="form-control"/>
 <form:errors path="fodec" cssClass="error"/>
</div>
</div>

<div class="form-group">
<label for="articles" class="col-sm-2 control-label">Article :</label>
<div class="col-sm-10">
<form:select path="articles"  class="form-control">
<c:forEach items="${articles }" var="article">
  <form:option value="${article.idArt }" label="${article.designation }"/>
  </c:forEach>
</form:select>
</div>
</div>

<div class="form-group">
<label for="client" class="col-sm-2 control-label">Client :</label>
<div class="col-sm-10">
<form:select path="client.idClent"  class="form-control">
<c:forEach items="${clients }" var="client">
  <form:option value="${client.idClent }" label="${client.nomCl }"/>
  </c:forEach>
</form:select>
</div>
</div>

<div class="form-group">
<div class="col-sm-10">
 <input type="submit" value="save" class="btn btn_lg btn-primary"/>
</div>
</div>


</form:form>