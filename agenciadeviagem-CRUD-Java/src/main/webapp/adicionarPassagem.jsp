<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Comprar</title>
</head>
<body>

<%@ include file="navbar.jsp"%>

<div class="container" align="center">
	<h1>Encontre os melhores voos</h1>
	<h3>Campos com (*) são obrigatórios</h3>
		<form name="frmPassagem" action="insert">
			<table>
				<tr>
					<td><input type="text" name="origem" placeholder="*Origem" class="Caixa1" required></td>
				</tr>
				<tr>
					<td><input type="text" name="destino" placeholder="*Destino" class="Caixa1"></td>
				</tr>
				<tr>
					<td><input type="text" name="trecho" placeholder="*Trecho" class="Caixa1"></td>
				</tr>
				<tr>
					<td><input type="date" name="dataIda" class="Caixa1" /></td>
				</tr>
				<tr>
					<td><input type="date" name="dataVolta" class="Caixa1" /></td>
				</tr>
				<tr>
					<td><input type="text" name="qtdPassageiros" placeholder="*Passageiros" class="Caixa1"></td>
				</tr>
			</table>
			<input type="button" value="Comprar" class="Botao1" onclick="validar2()">
		</form>
	</div>
<script src="scripts/validador.js"></script>
</body>
</html>