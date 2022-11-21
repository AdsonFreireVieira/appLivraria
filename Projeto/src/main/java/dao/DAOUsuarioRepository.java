package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.singleConnection;
import model.Cliente;

public class DAOUsuarioRepository {

	private Connection connection;
	
	public DAOUsuarioRepository() {
		
		connection = singleConnection.getConnection();
	}
	
	public void cadastrarUsuario(Cliente objeto){
		
		try {
		String sql="insert into tbl_cliente(nome_cliente,cpf_cliente,email,cep,cidade,login,senha)values(?, ?, ?, ?, ?, ?, ?);";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
	
		statement.setString(1,objeto.getNome_cliente());
		statement.setString(2,objeto.getCpf_cliente());
		statement.setString(3,objeto.getEmail_cliente());
		statement.setString(4,objeto.getCep());
		statement.setString(5,objeto.getCidade());
		statement.setString(6,objeto.getLogin());
		statement.setString(7,objeto.getSenha());
		
		statement.execute();
		connection.commit();
		
		}catch (Exception e){
			e.printStackTrace();
			
		}
	}

}
