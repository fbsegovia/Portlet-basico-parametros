<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	List<Integer> listaNumeros = 
		(List<Integer>)request.getAttribute("listaNumerosPares");
%>

<table border="1">
	<tr>
		<td>Numeros Pares</td>
	</tr>
	<%
	for(Integer i : listaNumeros){
	%>
		<tr>
			<td><%=i %></td>
		</tr>
	<%
	}
	%>
</table>