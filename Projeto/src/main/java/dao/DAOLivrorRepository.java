package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.singleConnection;
import model.Livro;

public class DAOLivrorRepository {
	
	Connection connection;
	public DAOLivrorRepository() {
		connection =singleConnection.getConnection();
	}
	public void Gravarlivro (Livro livro) throws SQLException {
		
		String sql = "insert into tbl_livro(nome_livro,editora,preco,genero,fotouser,extensaofoto)values(?,?,?,?,?,?)";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, livro.getNome_livro());
		statement.setString(2, livro.getEditora());
		statement.setDouble(3, livro.getPreco());
		statement.setString(4, livro.getGenero());
		statement.setString(5, livro.getFotouser());
		statement.setString(6, livro.getExtensaofoto());
		
		
		
		statement.execute();
		connection.commit();
	
	}
	
public List<Livro> consultalivroGenero(String genero) throws Exception {
		
		List<Livro> retorno = new ArrayList<Livro>();
		
		String sql = "select * from tbl_livro where genero = ?  ";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1,  genero );
		
		ResultSet resultado = statement.executeQuery();
		
		while (resultado.next()) { 
			
			Livro   livro = new Livro();
			
			livro.setFotouser(resultado.getString("fotouser"));
			livro.setPreco(resultado.getDouble("preco"));
			
			
			retorno.add(livro);
		}
		
		
		return retorno;
	}

}
