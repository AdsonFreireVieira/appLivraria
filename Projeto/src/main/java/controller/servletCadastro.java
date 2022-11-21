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

@WebServlet(urlPatterns = {"/cadastro","/limparCadastro"})
public class servletCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DAOUsuarioRepository dao = new DAOUsuarioRepository();
    
    public servletCadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher red;
		
		String acao= request.getParameter("acao");
		
		 
		if(acao.equalsIgnoreCase("limpar")) {
			
			 red = request.getRequestDispatcher("/Principal/CadastroLogin.jsp");
			red.forward(request, response);
			
		}
		
		else if(acao.equalsIgnoreCase("paginAcao")) {
			
			red = request.getRequestDispatcher("/Principal/pages/pageAcao.jsp");
			request.setAttribute("txt","PAgina chegou");
			red.forward(request, response);
		}
		else if (acao.equalsIgnoreCase("paginBiografia")) {
			
			red= request.getRequestDispatcher("/Principal/pages/pageBiografia.jsp");
			red.forward(request, response);
			
		}
		else if(acao.equalsIgnoreCase("paginCientifico")) {
			
			 red = request.getRequestDispatcher("/Principal/pages/pageCientifico.jsp");
			 red.forward(request, response);
			
		}
		else if (acao.equalsIgnoreCase("paginCronicas")) {
			
			red= request.getRequestDispatcher("/Principal/pages/pageCronica.jsp");
			red.forward(request, response);
			
		}else if (acao.equalsIgnoreCase("Fabulas")) {
			red = request.getRequestDispatcher("/Principal/pages/pageFabulas.jsp");
			red.forward(request, response);
		}
		else if (acao.equalsIgnoreCase("Gastronomia")) {
			
			red = request.getRequestDispatcher("/Principal/pages/pageGastronomia.jsp");
			red.forward(request, response);
		}
		else if(acao.equalsIgnoreCase("nficcao")) {
			
			red = request.getRequestDispatcher("/Principal/pages/pageNficcao.jsp");
			red.forward(request, response);
			
		}else if (acao.equalsIgnoreCase("Poesia")) {
			red = request.getRequestDispatcher("/Principal/pages/pagePoesia.jsp");
			red.forward(request, response);
			
		}else if (acao.equalsIgnoreCase("novo")) {
			red = request.getRequestDispatcher("/Principal/pages/CadastroLivro.jsp");
			red.forward(request, response);
			
		}
		else {
			
			red = request.getRequestDispatcher("index.jsp");
            red.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		String nome= request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		
		String cep = request.getParameter("cep");
		
		String cidade = request.getParameter("cidade");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Cliente cliente = new Cliente();
		
		cliente.setNome_cliente(nome);
		cliente.setCpf_cliente(cpf);
		cliente.setEmail_cliente(email);
		cliente.setCep(cep);
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
