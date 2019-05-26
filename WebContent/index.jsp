<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="Utils.Html"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BGStore</title>
<script src="js/jquery-3.3.1.slim.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="slick/slick.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="fontawesome-free-5.8.2-web/css/all.css">
<link rel="stylesheet" type="text/css" href="css/style_base.css">
<link rel="stylesheet" href="slick/slick.css">
<link rel="stylesheet" href="slick/slick-theme.css">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<nav class="navbar navbar-light bg-dark">
			<a class="navbar-brand" href="#"> <img src="img/logo.png"
				width="150" height="50" alt="">
			</a>
		</nav>


		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Inicio
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Jogos </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Lançamentos</a> <a
							class="dropdown-item" href="#">Menos de 10 R$</a> <a
							class="dropdown-item" href="#">Menos de 20 R$</a>
					</div></li>
				<li class="nav-item"><a class="nav-link disabled" href="#"
					tabindex="-1" aria-disabled="true">Contato</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Pesquisar" aria-label="Search">
				<button type="button" class="btn btn-dark">Buscar</button>
				<a id="login" class="btn btn-dark">Login</a>

			</form>
		</div>
	</nav>

	<div class="destaques">
		<div>
			<p align="center">
				<img
					src="https://i.pinimg.com/originals/53/f7/d9/53f7d969762523414600a6549e36202a.jpg"
					alt="" width="1100" height="500">
			</p>
			<div class="carousel-caption">
				<h3>Playerunknow´s Battlegrounds</h3>
				<p>Vivencie o verdadeiro Battle Royale !!</p>
			</div>
		</div>
		<div>
			<p align="center">
				<img src="https://images3.alphacoders.com/887/thumb-1920-887499.jpg"
					alt="" width="1100" height="500">
			</p>
			<div class="carousel-caption">
				<h3>Metro Exodus</h3>
				<p>Vivencie o Survival horror da proxima geração</p>
			</div>
		</div>
		<div>
			<p align="center">
				<img
					src="http://www.codemasters.com/wp-content/uploads/2018/09/hero_dirtrally2_2019.jpg"
					alt="New York" width="1100" height="500">
			</p>
			<div class="carousel-caption">
				<h3>Dirt Rally 2.0</h3>
				<p>Sinta-se no comando de um real carro de Rally</p>
			</div>
		</div>
	</div>
	<div class="text-promo">
		<h2 class="products-dock--title">Itens em destaque</h2>

		<%
		int[] destaques = { 234140, 271590, 578080, 552520, 452410 };
		out.print(Html.slickCarousel(destaques, "destaques"));
		%>

	</div>

	<div class="text-promo">
		<h2 class="products-dock--title">Promoção :</h2>
	</div>

	<div class="container maisvendidos">

		<%
			int[] maisvendidos = { 770240, 752590, 625340, 976310, 381210 };
			out.print(Html.slickCarousel(maisvendidos, "maisvendidos"));
		%>


	</div>

	<br>
	<div id="formulario" class="container">
		<div class="d-flex justify-content-center">
			<form method="POST">
				<h1>Area de Login</h1>
				<h3>Email:</h3>
				<input type="text" id="login" class="form-control" name="login"
					placeholder="Insira seu e-mail...">
				<h3>Senha:</h3>
				<input type="password" id="password" class="form-control"
					name="login" placeholder="insira sua senha..."> <input
					type="submit" class="btn btn-primary m-2" value="Logar" /> <input
					type="submit" class="btn btn-primary m-2" value="Cadastrar" />
			</form>
		</div>
	</div>
	<footer class="page-footer">
		<div class="footer-copyright text-center py-3">
			� 2019 Copyright: <a href="Login.html"> BGstore</a>
		</div>
	</footer>
	<script src="js/index.js"></script>
</body>
</html>