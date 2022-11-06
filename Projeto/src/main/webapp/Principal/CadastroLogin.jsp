<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Login </title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>

 <h4>Cadastro Usuario</h4>
 
  <form action="/cadastro" method="post">
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Nome</label>
    <div class="col-sm-7">
      <input type="text" class="form-control" id="inputPassword" placeholder="Nome">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Cpf</label>
    <div class="col-sm-7">
      <input type="text" class="form-control" id="inputPassword" placeholder="Cpf">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Email</label>
    <div class="col-sm-7">
				<input type="email" class="form-control" id="inputPassword"
					placeholder="Email">
			</div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Logradouro</label>
    <div class="col-sm-7">
      <input type="text" class="form-control" id="inputPassword" placeholder="logradouro">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Cep</label>
    <div class="col-sm-7">
      <input type="password" class="form-control" id="inputPassword" placeholder="Cep">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Numero</label>
    <div class="col-sm-7">
      <input type="password" class="form-control" id="inputPassword" placeholder="Numero">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Cidade</label>
    <div class="col-sm-7">
      <input type="text" class="form-control" id="inputPassword" placeholder="Cidade">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Login</label>
    <div class="col-sm-7">
      <input type="text" class="form-control" id="inputPassword" placeholder="Login">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Senha</label>
    <div class="col-sm-7">
      <input type="password" class="form-control" id="inputPassword" placeholder="Senha">
    </div>
  </div>
  <button type="submit" class="btn btn-primary">Salvar</button>
  <button type="button" class="btn btn-success">Limpar</button>
  

</form>

</body>
</html>