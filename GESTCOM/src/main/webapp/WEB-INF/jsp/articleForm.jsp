<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp" %>

<form:form commandName="article" cssClass="form-horizontal">

     <c:if test="${param.success eq true }">
      <div class="alert alert-success">Article added successfully!</div>
      </c:if>
      
      <div class="form-group">
<label for="idArt" class="col-sm-2 control-label">Numero Article :</label>
<div class="col-sm-10">
 <form:input path="idArt" cssClass="form-control"/>
</div>
</div>
     
<div class="form-group">
<label for="designation" class="col-sm-2 control-label">Designation :</label>
<div class="col-sm-10">
 <form:input path="designation" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="ref_Art" class="col-sm-2 control-label">reference :</label>
<div class="col-sm-10">
 <form:input path="ref_Art" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="codeABr" class="col-sm-2 control-label">Code a bare :</label>
<div class="col-sm-10">
 <form:input path="codeABr" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="quantite" class="col-sm-2 control-label">Quantité :</label>
<div class="col-sm-10">
 <form:input path="quantite" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="quantite_min" class="col-sm-2 control-label">Quantité Min :</label>
<div class="col-sm-10">
 <form:input path="quantite_min" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="prix_HTVA" class="col-sm-2 control-label">Prix HTVA :</label>
<div class="col-sm-10">
 <form:input path="prix_HTVA" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="TVA" class="col-sm-2 control-label">TVA :</label>
<div class="col-sm-10">
 <form:input path="TVA" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="marque" class="col-sm-2 control-label">Marque :</label>
<div class="col-sm-10">
<form:select path="marque.idMarque"  class="form-control">
<c:forEach items="${marques }" var="marque">
  <form:option value="${marque.idMarque }" label="${marque.description }"/>
  </c:forEach>
</form:select>
</div>
</div>

<div class="form-group">
<label for="marque" class="col-sm-2 control-label">Categorie :</label>
<div class="col-sm-10">
<form:select path="categorie.idCat"  class="form-control">
<c:forEach items="${categories }" var="categorie">
  <form:option value="${categorie.idCat }" label="${categorie.nomCat }"/>
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
