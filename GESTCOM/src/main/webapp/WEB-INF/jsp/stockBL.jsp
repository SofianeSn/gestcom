<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

        <%@ include file="../layout/taglib.jsp" %>
    <h4><center> Fiche « Entrée stock / Bon de livraison » numéro ${stoc.numfact }</center></h4><br/>
    <br/>
    <br/>
    
    <h5>NbrBoitr</h5> :${stoc.nbreboite} <br/>
    <h5>Numéro BL</h5> :${stoc.numfact} <br/>
    <h5>PUHT</h5> :${stoc.puht} <br>
    <h5>Remise par boite</h5> :${stoc.remiseboite} <br/>
    <h5>TVA par boite</h5> :${stoc.tvaboite} <br/>
    <h5>Total HTVA </h5>:${stoc.total_ht } <br/>
    <h5>PUTTC </h5>:${stoc.puttc } <br/>
    <h5>Remise </h5>:${stoc.remise } <br/>
    <h5>TVA </h5>:${stoc.tva } <br/>
    <h5>Total TTC</h5> :${stoc.total_ttc }<br/>
    
    
    <form:form>
    <input type="button" value=" Print this page "
onclick="window.print();" />
    </form:form>
    
    