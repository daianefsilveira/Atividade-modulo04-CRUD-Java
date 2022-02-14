<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="model.Passagens"%>
<%@ page import="java.util.ArrayList"%>
<%
@ SuppressWarnings ("unchecked")
ArrayList<Passagens> lista = (ArrayList<Passagens>) request.getAttribute("passagens");
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Passagens</title>
</head>
<body>

<%@ include file="navbar.jsp"%>
<!-- main -->
<div class="container" align="center">
	<h1>Bem-vindo à sua próxima viagem!</h1>
	<h1>Encontre os melhores voos</h1>
	<a href="adicionarPassagem.jsp" class="Botao1">Nova compra</a> 
	<table id="tabela">
		<thead>
			<tr>
				<th>Id</th>
				<th>Origem</th>
				<th>Destino</th>
				<th>Trecho</th>
				<th>Data de Ida</th>
				<th>Data de Volta</th>
				<th>Passageiros</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				<td><%=lista.get(i).getCodPassagens()%></td>
				<td><%=lista.get(i).getOrigem()%></td>
				<td><%=lista.get(i).getDestino()%></td>
				<td><%=lista.get(i).getTrecho()%></td>
				<td><%=lista.get(i).getDataIda()%></td>
				<td><%=lista.get(i).getDataVolta()%></td>
				<td><%=lista.get(i).getQtdPassageiros()%></td>
				<td>
					<a href="select?codPassagens=<%=lista.get(i).getCodPassagens()%>" class="Botao1">Editar</a> 
					<a href="delete?codPassagens=<%=lista.get(i).getCodPassagens()%>" class="Botao2">Excluir</a>
				</td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</div>
</body>
</html>