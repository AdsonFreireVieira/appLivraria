package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("servletLivro")
public class servletLivros extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public servletLivros() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome= request.getParameter("nomeLivro");
		String editora = request.getParameter("editora");
		String preco = request.getParameter("preco");
		String status = request.getParameter("status");
		String genero = request.getParameter("select");
		
		System.out.println("nome :" +nome +"\n"+
				           "editora :"+editora +"\n"+
				           "preco "+preco+"\n"+
				           "status "+status+"\n"+
				            "genero :"+genero);
	}

}
