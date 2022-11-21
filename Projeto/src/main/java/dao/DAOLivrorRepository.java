package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.singleConnection;
import model.Livro;

public class DAOLivrorRepository {
	
	Connection connection;
	public DAOLivrorRepository() {
		connection =singleConnection.getConnection();
	}
	public void Gravarlivro (Livro livro) throws SQLException {
		
		String sql = "insert into tbl_livro(nome_livro,editora,preco,genero)values(?,?,?,?)";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, livro.getNome_livro());
		statement.setString(2, livro.getEditora());
		statement.setDouble(3, livro.getPreco());
		statement.setString(4, livro.getGenero());
		
		
		
		statement.execute();
		connection.commit();
	}

}
