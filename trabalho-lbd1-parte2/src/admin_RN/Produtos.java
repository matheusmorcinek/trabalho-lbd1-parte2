package admin_RN;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.spi.DirStateFactory.Result;

import admin_DB.conexao_DB;

public class Produtos {


	private int _totalProdutos;


	public int get_totalProdutos() {
		return _totalProdutos;
	}

	public void set_totalProdutos(int _totalProdutos) {
		this._totalProdutos = _totalProdutos;
	}

	public ArrayList<Produto> RetornaProdutos(){

		ArrayList<Produto> produtos = new ArrayList<>();
		
		String sql = "SELECT * FROM PRODUTOS ORDER BY (NOME);";
		
		try {

			PreparedStatement stmt = conexao_DB.getConexao().prepareStatement(sql);

			ResultSet resultado = stmt.executeQuery();
			
			while(resultado.next()){
				
				Produto produto = new Produto(resultado.getDouble("PRECO"),resultado.getString("NOME"), resultado.getInt("COD_CATEGORIA"));
				produtos.add(produto);
				
			}
			
			
			stmt.execute();
			stmt.close();
		} catch (SQLException ex) {
			Logger.getLogger(conexao_DB.class.getName()).log(Level.SEVERE, null, ex);
		}

		
		
		


		//           PreparedStatement stmt = this.conexao.prepareStatement(s);
		//           

		//this.conexao.prepareStatement(s);

		//consulta no banco count produtos e usa _totalProdutos

		//aqui chama a model, faz as consultas e monta os objetos na array.

		return null;	
	}

	public Produto RetornaProduto(int codProduto){

		//chama model e retorna produto

		return null;

	}

	public void Cadastrar(Produto produto){

	}

	public void Editar(Produto produto){

	}

	public void Excluir(int codProduto){

	}



}
