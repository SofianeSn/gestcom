<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html >
<html>
<head>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">

<link rel="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.css">

<link rel="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css">

<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>

<!-- Latest compiled and minified JavaScript -->
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>

<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> <tiles:getAsString name="title"/> </title>
</head>
<body>

<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<tilesx:useAttribute name="current"/>



<div class="container">

   <!-- Static navbar -->
      <div class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href='<spring:url value="/"/>'>GESTCOM</a>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
            <security:authorize access="isAuthenticated()">
              <li class="${ current=='index' ?'active' :''}"><a href='<spring:url value="/"/>'>Home</a></li>
              </security:authorize>
              
              <security:authorize access="isAuthenticated()">
              <li class="${ current=='articles' ?'active' :''}"><a href='<spring:url value="/articles.html"/>'>Article</a></li>
             </security:authorize>
             <security:authorize access="isAuthenticated()">
              <li class="${ current=='stock' ?'active' :''}"><a href='<spring:url value="/stock.html"/>'>E/S Stock</a></li>
             </security:authorize>
              <li class="dropdown">
              <security:authorize access="isAuthenticated()">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Client/Fournisseur <b class="caret"></b></a>
                </security:authorize>
                <ul class="dropdown-menu">
                  <li><a class="${ current=='clients' ?'active' :''}"><a href='<spring:url value="/clients.html"/>'>Client</a></li>
                  <li><a class="${ current=='fournisseurs' ?'active' :''}"><a href='<spring:url value="/fournisseurs.html"/>'>Fournisseur</a></li>                  
                  
                </ul>
                <security:authorize access="hasRole('ROLE_ADMIN')">
              <li class="${ current=='users' ?'active' :''}"><a href='<spring:url value="/users.html"/>'>User</a></li>
              </security:authorize>
              </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
            
            <security:authorize access="isAuthenticated()" >
              <li class="${ current=='my account' ?'active' :''}"><a href='<spring:url value="/account.html"/>'>My account </a></li>
             </security:authorize>
            <security:authorize access="isAuthenticated()">
              <li ><a href="/logout">Logout</a></li>
              </security:authorize>
            </ul>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </div>

<tiles:insertAttribute name="body"/>


          <br>
          <br>
          <br>
          <br>

          <center>

  <tiles:insertAttribute name="footer"/>

           </center>
           
     </div>      


</body>
</html>