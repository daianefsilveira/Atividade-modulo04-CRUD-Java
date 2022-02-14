<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="model.Pessoas"%>
<%@ page import="java.util.ArrayList"%>
<%
@ SuppressWarnings ("unchecked")
ArrayList<Pessoas> lista = (ArrayList<Pessoas>) request.getAttribute("cadastros");
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Pessoas</title>
</head>
<body>

<%@ include file="navbar.jsp" %>
<!-- main -->
<div class="container" align="center">
	<h1>Não tem cadastro?</h1>
	<h1>É rápido e simples, basta informar alguns dados</h1>
	<a href="adicionarCadastro.jsp" class="Botao1">Novo Cadastro</a> 
	<table id="tabela">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>CPF</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				<td><%=lista.get(i).getCodPessoa()%></td>
				<td><%=lista.get(i).getNome()%></td>
				<td><%=lista.get(i).getCpf()%></td>
				<td>
				<a href="selectPessoas?codPessoa=<%=lista.get(i).getCodPessoa()%>" class="Botao1">Editar</a> 
				<a href="deletePessoas?codPessoa=<%=lista.get(i).getCodPessoa()%>" class="Botao2">Excluir</a>
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