//package admin_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexao_DB {
    
    private Connection conexao;

	public void conectarBanco() {
				
		
		Properties connectionProps = new Properties();
		connectionProps.put("user", "de123456");
		connectionProps.put("password", "de123456");
		try{
                  conexao = DriverManager.getConnection("jdbc:oracle:thin:@//camburi.pucrs.br:1521/facin11g",connectionProps);  
                  System.out.println("Conexão bem sucedida!");
                  //return conexao;
                } catch(SQLException e){
                    System.out.println("Falha na conexão!");                    
                }
	}
        
        public Connection getConexao(){
            return this.conexao;
        }
        
        public void fechaConexao(){
            try {
                this.conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(conexao_DB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
	
//        public void cadastraItem(String s){
//        try {
//            PreparedStatement stmt = this.conexao.prepareStatement(s);
//            stmt.execute();
//            stmt.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(conexao_DB.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        }
        
        
	
}

