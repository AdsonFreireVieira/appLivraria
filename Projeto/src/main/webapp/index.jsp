<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="src/style.css">
<title>Cadastro Login</title>

</head>
  <body>
 <h5>JSP LIVROS</h5>
 <div id="div-login">
          
	<form action="login" method="post">

  <div class="txtinput"><input type="text" name="login"><br> </div>
  <div class="txtinput"><input type="password" name="senha"></div><br> 
	
	
	
	<div ><input type="submit" value="Enviar"><br></div>
	<input type="submit" value ="nao Tenho Cadastro">
	</form>
       </div>
</body>
<h4>${msg}</h4>
</html>