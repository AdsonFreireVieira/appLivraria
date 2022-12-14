 package controller;

import java.io.IOException;

import dao.DAOLoginRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;

@WebServlet(urlPatterns = {"/login", "/loginCadastro"})
public class servletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   private DAOLoginRepository daologin = new  DAOLoginRepository();
	
    public servletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getParameter("acao");

		if (!acao.isEmpty()&& acao.equalsIgnoreCase("cadastrar")) {
			 
			RequestDispatcher redirecionar = request.getRequestDispatcher("/Principal/CadastroLogin.jsp");
			redirecionar.forward(request, response);
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("password");
	
          Cliente cliente = new Cliente();
		
		cliente.setLogin(login);
		cliente.setSenha(senha);
		try {
		
	if(daologin.validarLogin(cliente)){ 
			
		
		RequestDispatcher redirecionar = request.getRequestDispatcher("/Principal/principal.jsp");
		redirecionar.forward(request, response);
		return;
		
	}
	
	RequestDispatcher redirecionar = request.getRequestDispatcher("/index.jsp");
    request.setAttribute("msg", "Login Invalido");
	redirecionar.forward(request, response);
	
	}catch(Exception e) {
	  e.printStackTrace();
	   
	}
		
		
	
	}
}
