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
			// Recupera uma conexão com o banco de dados
			Connection con = createConnectionSQLServer();
			// Testa se a conexão é nula
			if (con != null) {
				System.out.println("Conexão obtida com sucesso! " + con);
				con.close();
			}
		}
}
