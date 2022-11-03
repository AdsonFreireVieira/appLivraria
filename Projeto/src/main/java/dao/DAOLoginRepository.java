package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.singleConnection;
import model.Cliente;

public class DAOLoginRepository {
	private Connection connection;
	
	public DAOLoginRepository() {
		connection = singleConnection.getConnection();
	}
	
	public boolean validarLogin(Cliente cliente) throws Exception  {
		String sql = "select * from tbl_cliente where login = ?  and senha = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1,cliente.getLogin());
		statement.setString(2,cliente.getSenha());
	
		ResultSet result = statement.executeQuery();
		
		if(result.next()) {
			return true;
		}	
		
		return false; 
	}
	

}
