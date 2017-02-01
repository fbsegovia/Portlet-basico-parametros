<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet"%>

<img src="/02_PortletParametros/img/123.png"/>
<form action="<portlet:actionURL/>" method="post">
	Numero:<input type="number" name="numero"/><br/>
	<input type="submit" name="accion" value="Calcular">
</form>