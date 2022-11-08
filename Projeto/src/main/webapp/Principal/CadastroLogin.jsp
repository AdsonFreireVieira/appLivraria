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
 
  <form action="cadastro" method="post">
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Nome</label>
    <div class="col-sm-7">
      <input type="text" name="nome" class="form-control" id="inputPassword" required="required" placeholder="Nome">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Cpf</label>
    <div class="col-sm-7">
      <input type="text"  name="cpf"class="form-control"  required="required" placeholder="Cpf">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Email</label>
    <div class="col-sm-7">
    <input type="email" name="email"class="form-control" required="required" placeholder="Email">
   </div>
  </div>
  <div class="form-group row">
    <label for="" class="col-sm-1 col-form-label">Logradouro</label>
    <div class="col-sm-7">
      <input type="text" name="logradouro"class="form-control" id="inputPassword" required="required"" placeholder="logradouro">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Cep</label>
    <div class="col-sm-7">
      <input type="text" name="cep" class="form-control" id="inputPassword" required="required" placeholder="Cep">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Numero</label>
    <div class="col-sm-7">
      <input type="text" name="numero" class="form-control" id="inputPassword" required="required" placeholder="Numero">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Cidade</label>
    <div class="col-sm-7">
      <input type="text" name="cidade"class="form-control" required="required"  placeholder="Cidade">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Login</label>
    <div class="col-sm-7">
      <input type="text" name="login" class="form-control"  placeholder="Login">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-1 col-form-label">Senha</label>
    <div class="col-sm-7">
      <input type="password" name="senha"class="form-control"  required="required" placeholder="Senha">
    </div>
  </div>
  <input type="submit" class="btn btn-primary" value="Salvar"> 
  <a href="limparCadastro?acao=limpar" class="btn btn-primary">Limpar</a>
  

</form>

</body>
</html>