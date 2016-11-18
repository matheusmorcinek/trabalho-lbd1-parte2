package admin_RN;

public class Produto {
	
	private int codProduto;
	private double preco;
	private String nome;
	private int codCategoria;
	//private Categoria categoria;
	
	public Produto(double preco, String nome, int codCategoria){
		this.preco = preco;
		this.nome = nome;
		this.categoria = categoria;
	}
	
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString(){
		return "Código do produto: "+codProduto+" - [ Nome: "+nome+" - Categoria: "+categoria+" -> Preço: "+preco+"]";
	}

	
}
