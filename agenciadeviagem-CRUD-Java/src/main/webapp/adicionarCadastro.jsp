
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%><!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Cadastrar</title>
</head>
<body>

<%@ include file="navbar.jsp" %>

<div class="container" align="center">
	<h1>Cadastre-se e aproveite os melhores preços em passagens aéreas!</h1>
	<h3>Campos com (*) são obrigatórios</h3>
		<form name="frmCadastro" action="insertPessoas">
			<table>
				<tr>
					<td><input type="text" name="nome" placeholder="*Nome completo" class="Caixa1"></td>
				</tr>
				<tr>
					<td><input type="text" name="cpf" placeholder="*CPF (apenas números)" class="Caixa1"></td>
				</tr>
			</table>
				<input type="button" value="Cadastrar" class="Botao1" onclick="validar()" >
		</form>
	</div>	
<script src="scripts/validador.js"></script>
</body>
</html>