<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ include file="../layout/taglib.jsp" %>
    <script>
  
    </script>


<form:form commandName="stockBL" cssClass="form-horizontal">

      <c:if test="${param.success eq true }">
      <div class="alert alert-success">Founisseur added successfully!</div>
      </c:if>
      


<div class="form-group">
<label for="numfact" class="col-sm-2 control-label">Numéro BL :</label>
<div class="col-sm-10">
 <form:input path="numfact" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="numfact" class="col-sm-2 control-label">Numéro BL :</label>
<div class="col-sm-10">
 <form:input path="dateA" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="marque" class="col-sm-2 control-label">Article :</label>
<div class="col-sm-10">
<form:select path="article.idArt"  class="form-control">
<c:forEach items="${articles }" var="article">
  <form:option value="${article.idArt }" label="${article.designation }"/>
  </c:forEach>
</form:select>
</div>
</div>



<div class="form-group">
<label for="marque" class="col-sm-2 control-label">Fournnisseur :</label>
<div class="col-sm-10">
<form:select path="fournisseur.idFourn"  class="form-control">
<c:forEach items="${fournisseurs }" var="fournisseur">
  <form:option value="${fournisseur.idFourn }" label="${fournisseur.nom }"/>
  </c:forEach>
</form:select>
</div>
</div>

<div class="form-group">
<label for="nbreboite" class="col-sm-2 control-label">NbrBoitr :</label>
<div class="col-sm-10">
 <form:input path="nbreboite" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="puht" class="col-sm-2 control-label">PUHT :</label>
<div class="col-sm-10">
 <form:input path="puht" cssClass="form-control"/>
</div>
</div>


<div class="form-group">
<label for="remiseboite" class="col-sm-2 control-label">Remise par boite :</label>
<div class="col-sm-10">
 <form:input path="remiseboite" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="tvaboite" class="col-sm-2 control-label">TVA par boite :</label>
<div class="col-sm-10">
 <form:input path="tvaboite" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="total_ht" class="col-sm-2 control-label">Total HTVA:</label>
<div class="col-sm-10">
 <form:input path="total_ht" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="puttc" class="col-sm-2 control-label">PUTTC :</label>
<div class="col-sm-10">
 <form:input path="puttc" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="remise" class="col-sm-2 control-label">Remise :</label>
<div class="col-sm-10">
 <form:input path="remise" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="tva" class="col-sm-2 control-label">TVA :</label>
<div class="col-sm-10">
 <form:input path="tva" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<label for="total_ttc" class="col-sm-2 control-label">Total TTC :</label>
<div class="col-sm-10">
 <form:input path="total_ttc" cssClass="form-control"/>
</div>
</div>

<div class="form-group">
<div class="col-sm-10">
 <input type="submit" value="save" class="btn btn_lg btn-primary"/>
</div>
</div>



</form:form>