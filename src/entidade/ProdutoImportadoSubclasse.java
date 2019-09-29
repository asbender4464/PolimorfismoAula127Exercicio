package entidade;

public class ProdutoImportadoSubclasse extends ProdutoSuperclasse {

	//Atributos
	protected Double custoImportacao;	
	
	//Construtores
	public ProdutoImportadoSubclasse() {
		super();
	}

	public ProdutoImportadoSubclasse(String nomeProduto, Double precoProduto, Double custoImportacao) {
		super(nomeProduto, precoProduto);
		this.custoImportacao = custoImportacao;
	}

	//GETs e SETs
	public Double getCustoImportacao() {
		return custoImportacao;
	}

	public void setCustoImportacao(Double custoImportacao) {
		this.custoImportacao = custoImportacao;
	}
		
	//Método com superposição.
	@Override
	public double precoTotal() {
		return super.precoTotal() + custoImportacao;
	}
	
	@Override
	public String etiqueta() {
		return nomeProduto + " $" + String.format("%.2f", precoProduto + custoImportacao) +
				" (Custo de importação: $" + String.format("%.2f", custoImportacao) + ")";
	}
		
}
