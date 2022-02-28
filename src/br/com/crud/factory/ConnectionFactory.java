package br.com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	private static String url = "jdbc:sqlserver://recodecris.database.windows.net;databaseName=Bookstore;";
	private static String usuario = "adminazure";
	private static String senha = "@admin123";
		
		public static Connection createConnectionSQLServer() throws Exception {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
			
			Connection connection = DriverManager.getConnection(url, usuario, senha);
			
			return connection;
		}
		
		
		public static void main(String[] args) throws Exception{
			// Recupera uma conex�o com o banco de dados
			Connection con = createConnectionSQLServer();
			// Testa se a conex�o � nula
			if (con != null) {
				System.out.println("Conex�o obtida com sucesso! " + con);
				con.close();
			}
		}
}
