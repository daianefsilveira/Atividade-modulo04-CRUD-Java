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
	<h1>Editar Passagem</h1>
	<form name="frmPassagem" action="update">
		<table>
			<tr>
				<td><input type="text" name="codPassagens" id="caixa3" readonly 
					value="<%out.print(request.getAttribute("codPassagens"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="origem" class="Caixa1" required  
					value="<%out.print(request.getAttribute("origem"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="destino" class="Caixa1" 
					value="<%out.print(request.getAttribute("destino"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="trecho" class="Caixa1" required
					value="<%out.print(request.getAttribute("trecho"));%>"></td>
			</tr>
			<tr>
				<td><input type="date" name="dataIda" class="Caixa1" required  
					value="<%out.print(request.getAttribute("dataIda"));%>"></td>
			</tr>
			<tr>
				<td><input type="date" name="dataVolta" class="Caixa1" required  
					value="<%out.print(request.getAttribute("dataVolta"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="qtdPassageiros" class="Caixa1" required  
					value="<%out.print(request.getAttribute("qtdPassageiros"));%>"></td>
			</tr>
		</table>
			<input type="button" value="Salvar" class="Botao1" onclick="validar2()">
		</form>
	</div>	
<script src="scripts/validador.js"></script>
</body>
</html>