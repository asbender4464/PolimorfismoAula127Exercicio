package entidade;

public class ProdutoSuperclasse {

	//Atributos
	protected String nomeProduto;
	protected Double precoProduto;
	
	
	//Construtores
	public ProdutoSuperclasse() {
	}
	
	public ProdutoSuperclasse(String nomeProduto, Double precoProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
	}

	//GETs e SETs
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}
	
	//Métodos
	public double precoTotal () {
		return precoProduto;
	}
	
	public String etiqueta() {
		return nomeProduto + " - $" + String.format("%.2f", precoProduto) + " ";
	}
}
