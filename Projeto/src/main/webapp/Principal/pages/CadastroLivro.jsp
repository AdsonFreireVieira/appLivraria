<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<meta charset="ISO-8859-1">
<title>Cadastro Livro</title>
</head>
<body>
	<h2>JSP LIVROS</h2>

	<form  class="form-material" enctype="multipart/form-data" action="servletLivro" method="post">

		<div class="form-group  form-default  input-group mb-4">
			<div class="input-group-prepend ">
				<img alt="Imagem User" id="fotoembase64" src="" width="70px;">
			</div>
			<input type="file"  id="filefoto" name="filefoto"  accept="image/*"  onchange="visualizarImg('fotoembase64', 'filefoto');" class="form-control-file">
		</div>
		<div class="form-group row">
			<label for="inputPassword" class="col-sm-1 col-form-label">Nome
				Livro</label>
			<div class="col-sm-7">
				<input type="text" name="nomeLivro" class="form-control"
					id="inputPassword" required="required" placeholder="">
			</div>
		</div>
		<div class="form-group row">
			<label for="inputPassword" class="col-sm-1 col-form-label">Editora</label>
			<div class="col-sm-7">
				<input type="text" name="editora" class="form-control"
					required="required" placeholder="">
			</div>
		</div>

		<div class="form-group row">
			<label for="inputPassword" class="col-sm-1 col-form-label">Preço</label>
			<div class="col-sm-7">
				<input type="text" name="preco" class="form-control"
					required="required" placeholder="">
			</div>
		</div>

		<div class="form-group row">
			<label for="inputPassword" class="col-sm-1 col-form-label">Genero
				Livro</label> <select class="col-sm-7" name="genero"
				aria-label="Default select example">

				<option selected></option>
				<option value="acao">Acao</option>
				<option value="biografia">Biografia</option>
				<option value="cientifico">Cientifico</option>
				<option value="cronicas">Cronicas</option>
				<option value="fabulas">Fabulas</option>
				<option value="gastronomia">Gastronomia</option>
				<option value="nficcao">Não Ficcao</option>
				<option value="poesia">Poesia</option>
			</select>
		</div>

		<input type="submit" class="btn btn-primary" value="Cadastrar">
	</form>







<script type="text/javascript">

function visualizarImg(fotoembase64, filefoto) {
	
	var preview = document.getElementById(fotoembase64);
	var fileuser= document.getElementById(filefoto).files[0];
	var reader = new FileReader();
	
	reader.onloadend = function(){
		
		preview.src = reader.result;
	
	};
	
	if(fileuser){
		reader.readAsDataURL(fileuser);
	}else{
		preview.src = '';
	}
	
}





</script>

</body>
</html>

