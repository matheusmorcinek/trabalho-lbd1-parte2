package admin_RN;

import java.util.ArrayList;

public class Produtos {
	
	
	private int _totalProdutos;
	
	public int get_totalProdutos() {
		return _totalProdutos;
	}

	public void set_totalProdutos(int _totalProdutos) {
		this._totalProdutos = _totalProdutos;
	}
	
	public ArrayList<Produto> RetornaProdutos(){

		
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
