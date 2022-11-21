<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
   <link rel="stylesheet" href="src/stylePrincipal.css">
 
<meta charset="ISO-8859-1">

<title>Tela Principal</title>


</head>
   <h3 id="titulo">JSP LIVROS </h3>
<body>
          
          <form action="servletLivros" method="post">          
	<div class="gallery_container">
		<div class="image" data-title="Livro">
		<a href="servletCadastro?acao=paginAcao"><img alt="" src="src/image/download.jpg"> </a>
			<h3>Acao</h3>
		</div>
		
   <div class="image" data-title="Livro">
		<a  href="servletCadastro?acao=paginBiografia"><img alt="" src="src/image/lBiografia.jpg"> </a>
			<h3>Biografia</h3>
		</div>
   
   <div class="image" data-title="Livro">
		<a href="servletCadastro?acao=paginCientifico"><img alt="" src="src/image/cientifico.jpg"></a>	
			<h3>Cientifico</h3>
		</div>
		
  <div class="image" data-title="Livro">
		<a href="servletCadastro?acao=paginCronicas"><img alt="" src="src/image/lCronicas.jpg"></a>	
			<h3>Cronicas</h3>
		</div>
 <div class="image" data-title="Livros">
			<a href="servletCadastro?acao=Fabulas"><img alt="" src="src/image/lFabulas.jpg"></a>
			<h3>Fabulas</h3>
		</div>
 <div class="image" data-title="Livros">
		<a href="servletCadastro?acao=Gastronomia"><img alt="" src="src/image/lGastronomia.jpg"></a>	
			<h3>Gastronomia</h3>
		</div>	
<div class="image" data-title="Livro">
		<a href="servletCadastro?acao=nficcao"><img alt= "" src="src/image/lnficcao.jpg"></a>	
			<h3>Nao Ficcao</h3>
		</div>	
<div class="image" data-title="Livro">
		<a href="servletCadastro?acao=Poesia"><img alt= "" src="src/image/lPoesia.jpg"></a>	
			<h3>Poesia</h3>
		</div>		
	
	
	<div class="image" data-title="Cadastro">
		<a href="servletCadastro?acao=novo"><img alt="" src="src/image/incluir.png"></a>	
		<h3>Cadastrar Novo</h3>
			
		</div>		
	</div>
    
    
</form>


</body>
</html>