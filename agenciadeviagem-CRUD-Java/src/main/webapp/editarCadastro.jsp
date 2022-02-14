<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Editar</title>
</head>
<body>

<%@ include file="navbar.jsp" %>

<div class="container" align="center">
	<h1>Editar cadastro</h1>
	<form name="frmCadastro" action="updatePessoas">
		<table>
			<tr>
				<td><input type="text" name="codPessoa" id="caixa3" readonly
				value="<%out.print(request.getAttribute("codPessoa"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="nome" class="Caixa1" 
				value="<%out.print(request.getAttribute("nome"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="cpf" class="Caixa1"
				value="<%out.print(request.getAttribute("cpf"));%>"></td>
			</tr>
		</table>
		<input type="button" value="Salvar" class="Botao1" onclick="validar()">
	</form>
	</div>
  <script src="scripts/validador.js"></script>
</body>
</html>