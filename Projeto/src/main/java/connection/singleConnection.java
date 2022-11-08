package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class singleConnection {

	private static String url = "jdbc:mysql://localhost:3306/db_applivraria?autoReconnect=true";
	private static String user = "root";
	private static String senha = "admin";
	private static Connection connection;

	
	public static Connection getConnection() {
		return connection;
	}

	static {
		conectar();
	}
	public singleConnection() {
		
	}
	private static void conectar() {
		try {
			if (connection == null) {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url,user,senha);
				connection.setAutoCommit(false);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
