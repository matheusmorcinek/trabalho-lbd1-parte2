package admin_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class conexao_DB {

	public void ConectarBanco() {
				
		
		Properties connectionProps = new Properties();
		connectionProps.put("user", "de123456");
		connectionProps.put("password", "de123456");
		
	
		
		//Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@//camburi.pucrs.br:1521/facin11g",connectionProps);
	
		
		
		
	}
	
	
}
