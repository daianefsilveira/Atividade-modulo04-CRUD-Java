<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Agência de Viagem</title>
</head>
<body>

<%@ include file="navbar.jsp" %>

<!-- PROMOÇÕES -->	
<div class="container"  id="promo">
	<h2 class="primary-color display-6 text-center fw-bold my-5">
		Sua próxima viagem promete. Confira nossas promoções!
	</h2>
	<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-4">
       <div class="col">
         <div class="card h-100">
           <img src="img/img-9.png" class="card-img-top" alt="..." />
           <div class="card-body">
             <h5 class="card-title">
               Explore a cachoeira escondida nas profundezas da Floresta Amazônica
             </h5>
             <p class="card-text">📍Aventura 📅4 dias</p>
             <p class="card-text"><strike>De R$ 200</strike></p>
             <p class="card-text primary-color h2">
               Por R$ 175 <span class="secondary-color fs-6">/por pessoa</span>
             </p>
           </div>
         </div>
       </div>
       <div class="col">
         <div class="card h-100">
           <img src="img/img-2.png" class="card-img-top" alt="..." />
           <div class="card-body">
            <h5 class="card-title">
              Viaje pelas Ilhas de Bali em um Cruzeiro Privado
             </h5>
             <p class="card-text">📍Luxo 📅4 dias</p>
             <p class="card-text"><strike>De R$ 300</strike></p>
             <p class="card-text primary-color h2">
               Por R$ 250 <span class="secondary-color fs-6">/por pessoa</span>
             </p>
           </div>
         </div>
       </div>
       <div class="col">
         <div class="card h-100">
            <img src="img/img-3.png" class="card-img-top" alt="..." />
            <div class="card-body">
              <h5 class="card-title">
                Navegue no Oceano Atlântico visitando Águas Inexploradas
              </h5>
              <p class="card-text">📍Mistério 📅4 dias</p>
              <p class="card-text"><strike>De R$ 200</strike></p>
              <p class="card-text primary-color h2">
                Por R$ 175 <span class="secondary-color fs-6">/por pessoa</span>
              </p>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card h-100">
            <img src="img/img-4.png" class="card-img-top" alt="..." />
            <div class="card-body">
              <h5 class="card-title">
              Experimente o futebol no topo das Montanhas do Himalaia
              </h5>
              <p class="card-text">📍Aventura 📅18 dias</p>
              <p class="card-text"><strike>De R$ 500</strike></p>
              <p class="card-text primary-color h2">
                Por R$ 474 <span class="secondary-color fs-6">/por pessoa</span>
              </p>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card h-100">
            <img src="img/img-8.png" class="card-img-top" alt="..." />
            <div class="card-body">
              <h5 class="card-title">
			Passeie pelo Deserto do Saara em um passeio guiado de camelo
			</h5>
              <p class="card-text">📍Adrenalina 📅20 dias</p>
              <p class="card-text"><strike>De R$ 850</strike></p>
              <p class="card-text primary-color h2">
                Por R$ 700 <span class="secondary-color fs-6">/por pessoa</span>
              </p>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card h-100">
            <img src="img/img-10.png" class="card-img-top" alt="..." />
            <div class="card-body">
              <h5 class="card-title">
              Para quem ama destinos de inverno, esse é o local perfeito
              </h5>
              <p class="card-text">📍Aventura 📅8 dias</p>
              <p class="card-text"><strike>De R$ 675</strike></p>
              <p class="card-text primary-color h2">
                Por R$ 600<span class="secondary-color fs-6">/por pessoa</span>
              </p>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- CONTATO -->
    <div class="container" id="contato">
      <h2 class="primary-color display-6 text-center fw-bold my-5">
        Entre em contato
      </h2>
      <div>
        <form action="https://formsubmit.co/daiane.pguni@gmail.com" method="POST">
          <div class="form-group w-50 mx-auto">
            <input
              type="text"
              class="form-control my-3"
              placeholder="Digite o seu nome"
              required=""
            />
            <input
              type="text"
              class="form-control my-3"
              placeholder="Digite o seu E-mail"
              required=""
            />

            <textarea placeholder="Digite a sua Mensagem" rows="4" cols="50" name="message" required="" class="form-control my-3"></textarea>
            <input type = "hidden" name = "_ captcha" value = "false">
            <input type = "hidden" name = "_ autoresponse" value = "Mensagem enviada!">
            <input type = "hidden" name = "_ next" value = "index.jsp">
            <button class="btn btn-primary form-control my-3">Enviar</button>
          </div>
        </form>
      </div>
      </div>
    </div>

<%@ include file="footer.jsp" %>

</body>
</html>