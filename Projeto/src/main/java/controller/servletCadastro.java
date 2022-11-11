package controller;

import java.io.IOException;

import dao.DAOLoginRepository;
import dao.DAOUsuarioRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;

@WebServlet(urlPatterns = {"/cadastro","/limparCadastro","/paginas"})
public class servletCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DAOUsuarioRepository dao = new DAOUsuarioRepository();
    
    public servletCadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao= request.getParameter("acao");
		
		String page = request.getParameter("acao");
		
		if(acao.equalsIgnoreCase("limpar")) {
			
			RequestDispatcher red = request.getRequestDispatcher("/Principal/CadastroLogin.jsp");
			red.forward(request, response);
			
		}
		
		else if(page.equalsIgnoreCase("paginAcao")) {
			
			RequestDispatcher redirecionar = request.getRequestDispatcher("/Principal/pages/pageAcao.jsp");
			request.setAttribute("txt","PAgina chegou");
			redirecionar.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		String nome= request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String logradouro = request.getParameter("logradouro");
		String cep = request.getParameter("cep");
		String numero = request.getParameter("numero");
		String cidade = request.getParameter("cidade");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Cliente cliente = new Cliente();
		
		cliente.setNome_cliente(nome);
		cliente.setCpf_cliente(cpf);
		cliente.setEmail_cliente(email);
		cliente.setLogradouro(logradouro);
		cliente.setCep(cep);
		cliente.setNumero(numero);
		cliente.setCidade(cidade);
		cliente.setLogin(login);
		cliente.setSenha(senha); 
		
		
	
			
				dao.cadastrarUsuario(cliente);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		RequestDispatcher redirecionar = request.getRequestDispatcher("/index.jsp");
		redirecionar.forward(request, response);
		
		
	}

}
