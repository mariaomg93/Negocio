<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/estilo.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript" src="js/registro.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container text-center">
		<div id="cabecera" class=row>
			<br>
			<h1>Bienvenido</h1>
		</div>
		<br>
		<br>
		<br>
		<br>
	</div>




	<!-- BOTONES PRINCIPALES -->
	<div class="container text-center">
		<div class=col-md-6>
			<button id="acceso" type="button"
				class="btn btn-default orange-circle-button" href="">
				Acceso<span class="orange-circle-greater-than"></span>
			</button>
			<br>
			<br>
		</div>

		<div class=col-md-6>
			<button id="registro" type="button"
				class="btn btn-default orange-circle-button" href="">
				Registro<span class="orange-circle-greater-than"></span>
			</button>
			<br>
			<br>
		</div>




		<!-- FORMULARIO DE ACCESO -->
		<div class=col-md-6>
			<form action="ControladorLogin" method="get" id="formulario1">
				Usuario<br> <input name="usuario" type="text"
					placeholder="Usuario"><br>
				<br> Contraseña<br> <input name="contrasenha"
					type="password" placeholder="Contraseña"><br>
				<br> <input name="aceptar1" type="submit" value="Aceptar"
					id="aceptar1">
			</form>
		</div>


		<!-- FORMULARIO DE REGISTRO-->
		<div class=col-md-6>
			<form action="ControladorLogin" method="get" id="formulario2">
				Nombre<br> <input name="nombre" type="text"
					placeholder="Nombre"><br>
				<br> Edad<br> <input name="edad" type=""
					placeholder="Edad"><br>
				<br> Usuario<br> <input name="usuario" type="text"
					placeholder="Usuario"><br>
				<br> Contraseña<br> <input name="contrasenha"
					type="password" placeholder="Contraseña"><br>
				<br> <input name="aceptar2" type="submit" value="Aceptar"
					id="aceptar2"><br>
				<br>
			</form>
		</div>







	</div>
</body>
</html>