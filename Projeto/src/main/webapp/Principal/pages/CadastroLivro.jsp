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

	<form action="cadastro" method="post">
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
			<label for="inputPassword" class="col-sm-1 col-form-label">status</label>
			<div class="col-sm-7">
				<input type="text" name="status" class="form-control"
					id="inputPassword" required="required" placeholder="">
			</div>
		</div>
  <select class="form-select" aria-label="Default select example">
				
					<option selected>Genero Livro</option>
					<option value="acao">Acao</option>
					<option value="biografia">Biografia</option>
					<option value="cientifico">Cientifico</option>
					<option value="cronicas">Cronicas</option>
					<option value="fabulas">Fabulas</option>
					<option value="gastronomia">Gastronomia</option>
					<option value="nficcao">Não Ficcao</option>
					<option value="poesia">Poesia</option>
				</select>
   
	</form>


</body>
</html>