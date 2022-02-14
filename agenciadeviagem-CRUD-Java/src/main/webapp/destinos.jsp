<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Destinos</title>
</head>
<body>

<%@ include file="navbar.jsp"%>

<div class="container">
	<h2 class="primary-color display-6 text-center fw-bold my-5">
		Confira nossos melhores destinos!</h2>
		<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-4">
			<div class="col">
				<div class="card h-100">
					<img src="img/img-9.png" class="card-img-top" alt="..." />
					<div class="card-body">
						<h2 class="card-title">Floresta Amazônica</h2>
						<p class="card-text">📍 7 ou 14 dias</p>
					</div>
				</div>
			</div>
			<div class="col">
				<div class="card h-100">
					<img src="img/img-2.png" class="card-img-top" alt="..." />
					<div class="card-body">
						<h2 class="card-title">Bali</h2>
						<p class="card-text">📍 7 ou 14 dias</p>
					</div>
				</div>
			</div>
			<div class="col">
				<div class="card h-100">
					<img src="img/img-3.png" class="card-img-top" alt="..." />
					<div class="card-body">
						<h2 class="card-title">Porto Seguro</h2>
						<p class="card-text">📍 8 ou 10 dias</p>
					</div>
				</div>
			</div>
			<div class="col">
				<div class="card h-100">
					<img src="img/img-4.png" class="card-img-top" alt="..." />
					<div class="card-body">
						<h2 class="card-title">Montanhas do Himalaia</h2>
						<p class="card-text">📍 4 ou 7 dias</p>
					</div>
				</div>
			</div>
			<div class="col">
				<div class="card h-100">
					<img src="img/img-8.png" class="card-img-top" alt="..." />
					<div class="card-body">
						<h2 class="card-title">Deserto do Saara</h2>
						<p class="card-text">📍 4 ou 7 dias</p>
					</div>
				</div>
			</div>
			<div class="col">
				<div class="card h-100">
					<img src="img/img-10.png" class="card-img-top" alt="..." />
					<div class="card-body">
						<h2 class="card-title">Canadá</h2>
						<p class="card-text">📍 8 ou 10 dias</p>
					</div>
				</div>
			</div>
		</div>
	<a href="main"><input type="button" class="btn btn-primary my-3 form-control" value="Agendar Viagem"></a>
</div>
	
<%@ include file="footer.jsp"%>

</body>
</html>