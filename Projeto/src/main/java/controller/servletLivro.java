package controller;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.tomcat.jakartaee.commons.compress.utils.IOUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import dao.DAOLivrorRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import model.Livro;

@MultipartConfig
public class servletLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;
    DAOLivrorRepository daoLivro = new DAOLivrorRepository();   
    
    public servletLivro() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nomeLivro");
	    String editora = request.getParameter("editora");
	    String preco = request.getParameter("preco");
	    String  genero= request.getParameter("genero");
	   
	    
	   Livro  livro = new Livro();
	   
	   livro.setEditora(editora);
	   livro.setNome_livro(nome);
	   livro.setPreco(Double.parseDouble(preco));
	   livro.setGenero(genero);
	  
	   
	   if(ServletFileUpload.isMultipartContent(request)) {
		   
		 Part part =request.getPart("filefoto");
		 byte []foto = IOUtils.toByteArray(part.getInputStream());
		 String imagemBase64 ="data:image/"+part.getContentType().split("\\/")[1] + ";base64,"+ new Base64().encodeBase64String(foto);
		 
		 livro.setFotouser(imagemBase64);
		 livro.setExtensaofoto(part.getContentType().split("\\/")[1]);
		 
	   }
	   
	   try {
		daoLivro.Gravarlivro(livro);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
