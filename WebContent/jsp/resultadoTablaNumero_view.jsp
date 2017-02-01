<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet"%>

<%
	Integer numero = (Integer)request.getAttribute("numero");
%>

<table border="1">
	<tr>
		<th>Numero</th>
		<th>Iteracion</th>
		<th>Resultado</th>
	</tr>
	<%
		for(int i=1;i<=10;i++){
	%>
		<tr>
			<td><%=numero %></td>
			<td><%=i %></td>
			<td><%=numero*i %></td>
		</tr>
	<%
		}
	%>
</table>
<a href="<portlet:actionURL/>">Volver</a>
