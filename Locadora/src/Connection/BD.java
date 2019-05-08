package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
 
public class BD {
	public static String status = "Não conectou...";
	public static Connection getConexaoMySQL() {
         Connection connection = null;
    
    try {
		String driverName = "com.mysql.jdbc.Driver";
		Class.forName(driverName);
		
            String serverName = "localhost";    //caminho do servidor do BD
	    String mydatabase ="locadora";        //nome do seu banco de dados
	    String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
	    String username = "root";        //nome de um usuário de seu BD      
	    String password = "";      //sua senha de acesso
	   
	    
	    connection = DriverManager.getConnection(url, username, password);
	    
	    //Testa sua conexão//  
	    if (connection != null) {
	    	status = ("STATUS--->Conectado com sucesso!");
	    } else {
	    	status = ("STATUS--->Não foi possivel realizar conexão");
	    }
	 
	    return connection;
	 	
		} catch (ClassNotFoundException e) {  //Driver não encontrado
			System.out.println("O driver expecificado nao foi encontrado.");
	        return null;
	   } catch (SQLException e) {
		   //Não conseguindo se conectar ao banco
	       System.out.println("Nao foi possivel conectar ao Banco de Dados.");
	       return null;
	   }
	}
	
    public static String statusConection() {
        return status;
    }
 
    public static boolean FecharConexao() {
        try {
        	BD.getConexaoMySQL().close();
            return true; 
        } catch (SQLException e) {
            return false; 
        }
    }
 
    public static java.sql.Connection ReiniciarConexao() {
    	FecharConexao();
        return BD.getConexaoMySQL();
    }
}