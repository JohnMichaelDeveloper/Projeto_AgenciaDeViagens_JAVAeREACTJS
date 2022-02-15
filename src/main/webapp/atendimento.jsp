<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JLK - Viajando com você pelo mundo!</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">
<link rel="icon" type="image/png"
	href="https://media.discordapp.net/attachments/871853660706058323/925117445226766406/icone.png?width=398&height=397">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Amiko:wght@400;600;700&display=swap"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Amiko:wght@400;600;700&family=Poppins:ital,wght@0,300;0,400;0,500;0,600;1,300;1,400&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
<style>

/*ESTILO PADRÃO APLICADO EM TODOS OS ELEMENTOS*/
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}
/*DEFINIÇÕES DE ESTILO NO CORPO DO DOCUMENTO*/
body {
	overflow-x: hidden;	
    margin: 1rem 1rem;
    background-image: linear-gradient(180deg, #f9b800, #1900ff66, #11111133);
    background-repeat: no-repeat;
    font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", "Roboto", "Oxygen", "Ubuntu", "Cantarell",
     "Fira Sans", "Droid Sans", "Helvetica Neue", sans-serif;
}
/*ESTILOS DA BARRA DE NAVEGAÇÃO*/
.logo {
	width: 120px;
	height: 35px;
}

.nav-bar {
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding-left: 30px;
	padding-right: 30px;
	padding-top: 10px;
	padding-bottom: 10px;
}

.fundo-img {
	width: 100%;
	height: 100vh;
	background-image: url("./images/img-4.jpg");
	background-size: cover;
	background-position: CENTER;
	background-repeat: no-repeat;
	position: relative;
	overflow: hidden;
	padding-right: 20px;
	padding-left: 40px;
}

.icones-img {
	margin-top: -27px;
	position: absolute;
	margin-left: 6rem;
	width: 20px;
	height: 20px;
}

/*.menu-close {
	padding: 8px 0 4px 23px;
	color: #6B6B6B;
	display: block;
	margin: -30px 0 -10px -20px;
	font-size: 35px;
	text-decoration: none;
}

.close-up {
	margin-left: 0.5rem;
}

#button-hamburger {
	background: none;
	border: 0;
	outline: none;
	cursor: pointer;
}

.menu-hamburger button i {
	transform: translateX(80px);
	outline: none;
}

.menu-hamburger ul {
	background: #ffc107 !important;
	border-radius: 20px 0px 0px 20px;
	padding: 10px 20px 10px 20px;
	overflow-x: hidden;
	opacity: 0;
	transition-timing-function: ease-in;
	transition-duration: 0.2s;
	-webkit-box-shadow: 1px 13px 17px -12px #000000;
	box-shadow: 1px 13px 17px -12px #000000;
}

.menu-hamburger ul li {
	list-style: none;
	line-height: 40px;
}

.menu-hamburger ul li a {
	font-family: "Amiko", sans-serif;
	font-size: 15px;
	color: white;
	text-decoration: none;
	cursor: default;
}

.menu-hamburger ul li a:hover {
	color: rgba(255, 255, 255, 0.671);
}

.menu-hamburger {
	display: flex;
	flex-direction: column;
	z-index: 99;
	display: block;
	position: absolute;
	right: 0px;
	top: 25px;
}

.menu-hamburger button:focus+ul {
	opacity: 1;
}

.menu-hamburger button:focus+ul li a {
	opacity: 1;
	cursor: pointer;
} */

.cid-s1pj7EandR {
	padding-top: 8rem;
	padding-bottom: 8rem;
	background-image: url(../../../assets/images/tours4-1-1200x800.jpg);
}

/*ESTILO DO CONTEÚDO PRINCIPAL*/
.main-content {
	transform: translateY(220px);
}

.main-content h1 {
	font-family: "Poppins", sans-serif;
	font-weight: bold;
	font-size: 45px;
	color: white;
	margin-bottom: 20px;
}

.main-content h3 {
	font-family: "Poppins", sans-serif;
	font-weight: normal;
	font-size: 35px;
	color: white;
}

.fundo-color {
	background-color: #ECF0F1;
	width: 100%;
	height: 100vh;
	padding-left: 30px;
	padding-right: 30px;
	padding-top: 60px;
}

.icones-content {
	width: 30px;
	height: 30px;
	margin-right: 10px;
}

.pacotes-content {
	display: flex;
	justify-content: space-between;
	align-items: center;
}

.titulos {
	font-family: "Poppins", sans-serif;
	font-weight: bold;
	font-size: 20px;
	color: #262626;
	margin-bottom: 25px;
	transform: translateY(5px);
}

.paragrafos {
	font-family: "Poppins", sans-serif;
	font-weight: lighter;
	font-size: 15px;
	color: #262626;
	width: 35%;
	line-height: 30px;
	margin-bottom: 30px;
}

.icone-titulo {
	display: flex;
}

.pacotes-cards {
	width: 100%;
}

.cards {
	background: white;
	height: 360px;
	width: 230px;
	border-radius: 20px;
	display: flex;
	flex-direction: column;
	justify-content: flex-end;
	padding-left: 20px;
	padding-right: 20px;
	-webkit-box-shadow: 1px 8px 15px -7px #000000;
	box-shadow: 1px 8px 15px -7px #000000;
	margin-bottom: 40px;
	margin-right: 20px;
}

.cards-text {
	font-family: "Poppins", sans-serif;
	color: black;
	vertical-align: bottom;
	font-size: 12px;
	line-height: 25px;
}

#card01 {
	background-image: url("../img/card-gramado.jpg");
	background-size: contain;
	background-position: top;
	background-repeat: no-repeat;
}

#card02 {
	background-image: url("../img/card-jp.jpg");
	background-size: contain;
	background-position: top;
	background-repeat: no-repeat;
}

#card03 {
	background-image: url("../img/card-salvador.jpg");
	background-size: contain;
	background-position: top;
	background-repeat: no-repeat;
}

#card04 {
	background-image: url("../img/card-natal.jpg");
	background-size: contain;
	background-position: top;
	background-repeat: no-repeat;
}

#card05 {
	background-image: url("../img/card-rj.jpg");
	background-size: contain;
	background-position: top;
	background-repeat: no-repeat;
}

.card-button {
	display: flex;
	justify-content: space-between;
	align-items: center;
	transform: translateY(-25px);
}

.button {
	background: none;
	border: 0;
	outline: none;
	cursor: pointer;
	opacity: 0.7;
}

.button:hover {
	opacity: 1;
}

.pacotes-cards {
	width: 100%;
	height: 100%;
	display: flex;
	justify-content: start;
	align-items: center;
	flex-wrap: wrap;
	padding-left: 30px;
}

.atendimento-content {
	height: 100%;
	width: 100%;
	display: flex;
	justify-content: space-between;
	align-items: center;
	flex-wrap: wrap;
	padding-right: 20px;
	padding-left: 20px;
	padding-bottom: 50px;
}

.bloco-texto {
	margin-top: 40px;
}

.cadastro-content {
	height: 100%;
	width: 100%;
	display: flex;
	justify-content: space-between;
	align-items: center;
	flex-wrap: wrap;
	padding-right: 20px;
	padding-left: 20px;
	padding-bottom: 50px;
}

.login-content {
	height: 100%;
	width: 100%;
	display: flex;
	justify-content: space-between;
	align-items: center;
	flex-wrap: wrap;
	padding-right: 20px;
	padding-left: 20px;
	padding-bottom: 200px;
}

.login-content div ul {
	line-height: 40px;
	transform: translateX(10px);
}

.form-style {
	display: flex;
	flex-direction: column;
	align-items: flex-start;
}

.h3--Size {
	font-size: 14px;
}
/*Código novo ---------------------------------------------------------------*/
section {
	position: relative;
	margin-top: 1.1rem;
	width: 100%;
	height: 100%;
	/*padding: 20px;*/
	margin-bottom: 7rem;
}

.background {
	height: 25rem;
	border-radius: 10px;
	background-image:
		url("https://cdn.pixabay.com/photo/2017/01/20/00/30/maldives-1993704_960_720.jpg");
	background-size: cover;
	background-repeat: no-repeat;
}

.homeImage {
	/*width: 100%;*/
	filter: brightness(60%);
	height: 25rem;
	border-radius: 10px;
}

.content {
	height: 96%;
    width: 100%;
    position: absolute;
    top: 0;
    z-index: 3;
    text-align: center;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    gap: 1rem;
    left: 0;
}

.title {
    color: white;
    margin-left: 0rem;
    margin-bottom: 0rem;
}

h1 {
	font-size: 2.5rem;
	letter-spacing: 0.2rem;
}

p {
	text-align: center;
	padding: 0 30vw;
	margin-top: 0.5rem;
	font-size: 1.2rem;
}

.search {
	display: flex;
	background-color: #ffffffce;
	padding: 0.5rem;
	border-radius: 0.5rem;
}

.container {
	display: flex;
	align-items: center;
	justify-content: center;
	flex-direction: column;
	padding: 0 1.5rem;
}

label {
	font-size: 1.1rem;
	color: #03045e;
}

input {
	background-color: transparent;
	border: none;
	text-align: center;
	color: black;
}

button {
	padding: 1rem;
	cursor: pointer;
	border-radius: 0.3rem;
	border: none;
	color: white;
	background-color: #4361ee;
	font-size: 1.1rem;
	text-transform: uppercase;
	transition: 0.3s ease-in-out;
}

button::hover {
	background-color: #023e8a;
}

ul {
	margin-top: -7px;
	margin-bottom: 1rem;
}

/*Fim código novo ---------------------------------------------------------------*/
.input-style {
	margin-bottom: 15px;
	outline: none;
	width: 270px;
	background: #D6D6D6;
	padding: 5px 10px 5px 10px;
	font-family: "Poppins", sans-serif;
	font-size: 15px;
	border: none;
}

.label-style {
	font-family: "Poppins", sans-serif;
	font-size: 15px;
}

.select-style {
	margin-bottom: 15px;
	outline: none;
	width: 270px;
	background: #D6D6D6;
	padding: 5px 10px 5px 10px;
	font-family: "Poppins", sans-serif;
	font-size: 15px;
	border: none;
}

.input-button {
	font-family: "Poppins", sans-serif;
	background: #34495E;
	color: white;
	font-size: 15px;
	border: none;
	outline: none;
	padding: 5px 12px 5px 12px;
}

.input-button:hover {
	background: #212e3b;;
}

.textarea-style {
	margin-bottom: 15px;
	resize: none;
	outline: none;
	width: 270px;
	background: #D6D6D6;
	padding: 10px;
	font-family: "Poppins", sans-serif;
	border: none;
}

.atendimento-content ul li {
	width: 260px;
	list-style: none;
}

.icone-lista {
	margin-right: 8px;
}

@media screen and (max-width:994px) {
	.paragrafos {
		width: 60%;
	}
}

@media screen and (max-width:580px) {
	.paragrafos {
		width: 70%;
	}
}

.main-content {
	animation-name: change-opacity;
	animation-duration: 1s;
	animation-timing-function: ease-in;
}

@keyframes change-opacity {
	from {opacity: 0;
}

to {
	opacity: 1;
}

}
.table {
	margin-top: 50px;
}

.usuarios-content {
	padding-bottom: 130px;
}

/*MENSAGENS DE VIEWBAGS*/
.mensagem-style {
	font-family: "Poppins", sans-serif;
	font-size: 15px;
	margin-top: 15px;
	animation-name: mensagem;
	animation-duration: 4s;
	animation-timing-function: ease-out;
	opacity: 0;
}

@keyframes mensagem { 
	10%{opacity: 0.7;}
	20%{opacity:0.8;}
	30%{opacity:0.9;}
	60%{opacity:1;}
	100%{opacity:1;}
}

/*DEFINIÇÕES DE ESTILO DO RODAPÉ*/
footer {
	background-color: #34495E;
	padding-left: 15px;
	padding-right: 15px;
	padding-top: 25px;
	padding-bottom: 10px;
	font-family: "Amiko", sans-serif;
	font-size: 15px;
	color: white;
	text-align: center;
	width: 100%;
	position: relative;
}

@media screen and (min-width: 749px) and (max-width: 980px) {
	.background img {
		height: 100%;
	}
	.content .title h1 {
		font-size: 1.5rem;
	}
	p {
		font-size: 1rem;
   		padding: 1vw;
	}
	.search {
		display: flex;
	    background-color: #ffffffce;
	    padding: 0.5rem;
	    border-radius: 0.5rem;
        width: 85%;
	}
	.container {
		padding: 0px 0.2rem;
    	font-size: 13px;
	}
	input {
		padding-left: 1rem;
	}
	button {
		padding: 1rem;
		font-size: 1rem;
	}
}

@media screen and (min-width: 576px) and (max-width: 748px) {
	.background {
		background-color: palegreen;
	}
	img {
		height: 100%;
	}
	.content .title h1 {
		font-size: 1.3rem;
	    letter-spacing: 0.2rem;
	    padding: 39px;
	    margin: 0px 10px -20px 6px !important;
	}
	p {
		font-size: 0.8rem;
	    padding: 0vw;
	    margin-top: -7px;
	    margin-bottom: -6px;
	}
	.search {
		flex-direction: column;
		padding: 0.8rem;
		gap: 0.8rem;
	}
		.container{
		padding	:0	0.8rem;
	}
	input{
		padding-left:1rem;
	}

	button {
		padding: 1rem;
		font-size: 1rem;
	}


}
@media screen and (min-width: 280px) and (max-width: 575px) {
	
    .background img { 
    	height:100%;
		border-radius: 10px;
	}
	.content .title h1 { 		
	font-size: 1.3rem;
    letter-spacing: 0.2rem;
    padding: 39px 23px;
    margin: 0px 10px -20px 6px !important;
    }
	p {
		font-size: 0.8rem;
		padding: 1vw;
	}
	.search {
		flex-direction: column;
	    padding: 0.8rem;
	    gap: 0.8rem;
	    width: 13rem;
	    margin-top: -5px;
	}
	.container	{
		padding	:0	0.8rem;
		
	}
	input{
		padding-left:1rem;
	}


	button {
		padding: 0.8rem;
    	font-size: 1rem;
	}


}

/*Servicos*/
	.section--servicos{
	  	padding: 1rem 0;
	    display: grid;
	    grid-template-columns: repeat(4, 1fr);
	    gap: 1rem;
	    margin-left: -21px;
	    margin-top: -129px;
	    margin: 0;
	 }
  	.servico {
    display: flex;
    flex-direction: column;
    gap: 1rem;
    padding: 2rem;
    background-color: aliceblue;
    box-shadow: rgb(100 100 111 / 20%) 0px 7px 29px 0px;
    transition: 0.3s ease-in-out;
    margin: auto;
    height: 100%;
    }
    .servico:hover {
      transform: translateX(0.4rem) translateY(-1rem);
      box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;
    }
    
    .icon img {
        height: 2.4rem;
      
    }
    
    .servico h3{
    padding:10px;
    
    }
    .servico p{
    padding:10px;
    
    }
    .tam--p{
    	font-size: 0.9rem;
    }
  
  @media screen and (min-width: 280px) and (max-width: 720px) {
    .section--servicos{
    grid-template-columns: repeat(auto-fill, minmax(221px, 1fr));
 	}
  }
  @media screen and (min-width: 720px) and (max-width: 1080px) {
  .section--servicos{
    grid-template-columns: repeat(2, 1fr);
    }
  }

/*button open/close*/
 ul {
  margin: 0px;
  padding: 0px;
}

a {
  color: black;
  text-decoration: none;
  font-family: sans-serif;
}

a:hover {
  background: #ffc107;
    width: 13rem;
    height: 3rem;
    margin: 0 -12px !important;
    /* text-align: center; */
    border-radius: 10px;
    padding-left: 24px !important;
}

#logo {
  font-size: 1.5rem;
  font-weight: bold;
}

#header {
  box-sizing: border-box;
  height: 35px;
  padding: 1rem;
  display: flex;
  align-items: center;
  justify-content: space-between;
  background: #e7e7e700;
}

#menu {
  display: flex;
  list-style: none;
  gap: 0.5rem;
}

#menu a {
  display: block;
  padding: 0.5rem;
}

#btn-mobile {
  display: none;
}
li{
	
}

@media (max-width: 2000px) {
  #menu {
    display: block;
    position: absolute;
    width: 14rem;
    top: 70px;
    right: 10px;
    background: #f9fafbeb!important;
    transition: 0.6s;
    z-index: 1000;
    height: 0px;
    visibility: hidden;
    overflow-y: hidden;
    border-radius: 20px 20px 20px 20px;
    padding: 10px 20px 10px 20px;
    overflow-x: hidden;
    transition-timing-function: ease-in;
    transition-duration: 0.2s;
    box-shadow: 1px 13px 17px -12px #000000;
  }
  #nav.active #menu {
    height: calc(100vh - 25%);
    visibility: visible;
    /*overflow-y: auto;*/
  }
  #menu a {
    padding: 1rem 0;
    margin: 0 1rem;
  }
  #btn-mobile {
    display: flex;
    padding: 0.5rem 1rem;
    font-size: 1rem;
    border: none;
    background: none;
    cursor: pointer;
    gap: 0.5rem;
  }
  #hamburger {
    border-top: 2px solid;
    width: 20px;
  }
  #hamburger::after,
  #hamburger::before {
    content: '';
    display: block;
    width: 20px;
    height: 2px;
    background: currentColor;
    margin-top: 5px;
    transition: 0.3s;
    position: relative;
  }
  #nav.active #hamburger {
    border-top-color: transparent;
  }
  #nav.active #hamburger::before {
    transform: rotate(135deg);
  }
  #nav.active #hamburger::after {
    transform: rotate(-135deg);
    top: -7px;
  }
}

/* Footer*/
  

.ghNkeo {
    display: -webkit-box;
    display: -webkit-flex;
    display: -ms-flexbox;
    display: flex;
    -webkit-box-pack: space-evenly;
    -webkit-justify-content: space-evenly;
    -ms-flex-pack: space-evenly;
    justify-content: space-evenly;
    background-color: #023e8a6b;
    border-radius: 0.5rem;
    padding: 2.5rem;
}
.ghNkeo ul {
    display: -webkit-box;
    display: -webkit-flex;
    display: -ms-flexbox;
    display: flex;
    list-style-type: none;
    gap: 2rem;
}
.ghNkeo ul li {
        font-size: 1.3rem;
        transition: 0.3s ease-in-out;
        }
.ghNkeo ul li svg a {
          color: #fff;
          filter: invert(1);
        }
.ghNkeo ul li svg a:hover {
          color: #302ce9;
        }

 /*button open/close*/ 
</style>

</head>
<body>

<!-- _______________________________________________NAVBAR________________________________________________________________ -->
	
		<header id="header" >
		    <a id="logo" href="" class="animate__animated animate__slideInDown animate__delay-2s"><img
				src="https://media.discordapp.net/attachments/871853660706058323/925117445776228352/logo-branco.png"
				alt="Logo" title="Viagens JLK" class="logo img-just" /></a>
		    
		    <nav id="nav">
		      <button class="animate__animated animate__slideInDown animate__delay-2s" aria-label="Abrir Menu" id="btn-mobile" aria-haspopup="true" aria-controls="menu" aria-expanded="false">
		        <span id="hamburger"></span>
		      </button>
		      <ul id="menu" role="menu" class="bg-warning drop-warning">
		        <li><a href="index.html" exact>Inicio</a></li>
		        <li><a href="#servicos" exact>Serviços</a></li>
				<li><a href="CreateAndFind" exact>Lista de Usuário</a></li>
				<li><a href="/teste/cadastrarPacote.html" exact>Cadastrar Pacotes</a></li>	
				<li><a href="CriarEncontrar" exact>Lista de Pacotes</a></li>
				<li><a href="/teste/atendimento.jsp" exact>Atendimento</a></li>
				<li><a href="Criar" exact>Lista de Atendimentos</a></li>
				<li><a href="/teste/cadastrarUsuario.html" exact>Cadastre-se</a></li>				
		      </ul>
		    </nav>
		  </header>

<div class="container">
	<div class="row">
		<div class="cold-md-7">
			<hr>
			<h3>Cadastro de Pacotes</h3>
			<hr>
			<form action="Criar" method="POST">
				<div class="form-floating mb-3">
						<input name="nome" maxlength="100" type="text" class="form-control" id="floatingInput1"> 
						<label>Informe Seu Nome</label>
					</div>
					<div class="form-floating mb-3">
						<input name="email" maxlength="200" type="text" class="form-control"> 
						<label>Informe Seu Email</label>
					</div>
					<div class="form-floating mb-3">
						<input name="destino" type="date" class="form-control"> 
						<label>Informe a Data de Hoje</label>
					</div>
				
					<div class="form-floating mb-3">
						<input name="inform_add" type="text" rows="5" cols="60" class="form-control" placeholder="Informações">						
						<label>Qual é Sua Dúvidas?</label>
					</div>
					<div class="form-floating mb-3">								 
					<input name="satisfacao" maxlength="2" type="text" class="form-control" id="floatingInput1"> 
						<label>Atribua Uma Nota 0 a 10.</label>					
					</div>
					
					<button class="btn btn-primary" type="submit">Enviar</button>
					<button class="btn btn-secondary" type="reset">Limpar
						Formulário</button>
			</form>
			<br>
			
		</div>
		
	</div>
</div>
	
<!-- Footer -->

<footer class="sc-iCfMLu ghNkeo" data-sr-id="6" style="visibility: visible; opacity: 1; transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1); transition: opacity 2s cubic-bezier(0.5, 0, 0, 1) 0s, transform 2s cubic-bezier(0.5, 0, 0, 1) 0s;">
	<span>Copyright © 2022 JLK. All rights reserved</span>
	<!-- <ul class="links">
		<li><a href="#home">Home</a></li><li><a href="#servicos">Serviços</a></li>
		<li><a href="#pacotes">Pacotes</a></li>
		<li><a href="#depoimentos">Depoimentos</a></li>
		<li><a href="#depoimentos">Atendimentos</a></li>
	</ul> -->
	<ul class="social__links">
	
		<li>			
			<svg stroke="currentColor" fill="currentColor" stroke-width="0" viewBox="0 0 16 16" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg">
				<a href="https://www.facebook.com/" alt ="facebook">
					<path d="M16 8.049c0-4.446-3.582-8.05-8-8.05C3.58 0-.002 3.603-.002 8.05c0 4.017 2.926 7.347 6.75 7.951v-5.625h-2.03V8.05H6.75V6.275c0-2.017 1.195-3.131 3.022-3.131.876 0 1.791.157 1.791.157v1.98h-1.009c-.993 0-1.303.621-1.303 1.258v1.51h2.218l-.354 2.326H9.25V16c3.824-.604 6.75-3.934 6.75-7.951z">
					</path>
				</a>
			</svg>			
		</li>
		<li>			
			<svg stroke="currentColor" fill="currentColor" stroke-width="0" viewBox="0 0 1024 1024" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg">
				<a href="https://www.instagram.com/" alt ="instagram">	
					
					<path d="M512 378.7c-73.4 0-133.3 59.9-133.3 133.3S438.6 645.3 512 645.3 645.3 585.4 645.3 512 585.4 378.7 512 378.7zM911.8 512c0-55.2.5-109.9-2.6-165-3.1-64-17.7-120.8-64.5-167.6-46.9-46.9-103.6-61.4-167.6-64.5-55.2-3.1-109.9-2.6-165-2.6-55.2 0-109.9-.5-165 2.6-64 3.1-120.8 17.7-167.6 64.5C132.6 226.3 118.1 283 115 347c-3.1 55.2-2.6 109.9-2.6 165s-.5 109.9 2.6 165c3.1 64 17.7 120.8 64.5 167.6 46.9 46.9 103.6 61.4 167.6 64.5 55.2 3.1 109.9 2.6 165 2.6 55.2 0 109.9.5 165-2.6 64-3.1 120.8-17.7 167.6-64.5 46.9-46.9 61.4-103.6 64.5-167.6 3.2-55.1 2.6-109.8 2.6-165zM512 717.1c-113.5 0-205.1-91.6-205.1-205.1S398.5 306.9 512 306.9 717.1 398.5 717.1 512 625.5 717.1 512 717.1zm213.5-370.7c-26.5 0-47.9-21.4-47.9-47.9s21.4-47.9 47.9-47.9 47.9 21.4 47.9 47.9a47.84 47.84 0 0 1-47.9 47.9z">
					</path>
				</a>	
			</svg>		
		</li>
		<li >			
			<svg stroke="currentColor" fill="currentColor" stroke-width="0" viewBox="0 0 16 16" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg">
				<a href="https://www.linkedin.com/" alt ="linkedin">
					<path d="M0 1.146C0 .513.526 0 1.175 0h13.65C15.474 0 16 .513 16 1.146v13.708c0 .633-.526 1.146-1.175 1.146H1.175C.526 16 0 15.487 0 14.854V1.146zm4.943 12.248V6.169H2.542v7.225h2.401zm-1.2-8.212c.837 0 1.358-.554 1.358-1.248-.015-.709-.52-1.248-1.342-1.248-.822 0-1.359.54-1.359 1.248 0 .694.521 1.248 1.327 1.248h.016zm4.908 8.212V9.359c0-.216.016-.432.08-.586.173-.431.568-.878 1.232-.878.869 0 1.216.662 1.216 1.634v3.865h2.401V9.25c0-2.22-1.184-3.252-2.764-3.252-1.274 0-1.845.7-2.165 1.193v.025h-.016a5.54 5.54 0 0 1 .016-.025V6.169h-2.4c.03.678 0 7.225 0 7.225h2.4z">
					</path>
				</a>
			</svg>			
		</li>
	</ul>
</footer>

	<!-- JavaScript -->
	<script src="~/lib/jquery/dist/jquery.min.js"></script>
	<script src="~/lib/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
	
	<script>
	const btnMobile = document.getElementById('btn-mobile');

	function toggleMenu(event) 
	{
	  if (event.type === 'touchstart') event.preventDefault();
	  const nav = document.getElementById('nav');
	  nav.classList.toggle('active');
	  const active = nav.classList.contains('active');
	  event.currentTarget.setAttribute('aria-expanded', active);
	  /*Se ativado então Fecha Menu senão desativa e Abrir Menu */
	  if (active) 
	  {
	    event.currentTarget.setAttribute('aria-label', 'Fechar Menu');
	  } else {
	    event.currentTarget.setAttribute('aria-label', 'Abrir Menu');
	  }
	}

	btnMobile.addEventListener('click', toggleMenu);
	btnMobile.addEventListener('touchstart', toggleMenu);
	
	</script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>