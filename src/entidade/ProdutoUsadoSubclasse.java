package entidade;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ProdutoUsadoSubclasse extends ProdutoSuperclasse {

	//Atributos
	protected Date dataDeManufatura;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//Construtores
	public ProdutoUsadoSubclasse () {
		super();
	}
	
	public ProdutoUsadoSubclasse(String nomeProduto, Double precoProduto, Date dataDeManufatura) {
		super(nomeProduto, precoProduto);
		this.dataDeManufatura = dataDeManufatura;
	}

	//GETs e SETs
	public Date getDataDeManufatura() {
		return dataDeManufatura;
	}

	public void setDataDeManufatura(Date dataDeManufatura) {
		this.dataDeManufatura = dataDeManufatura;
	}	
		
	//Método com superposição.
	@Override
	public double precoTotal() {
		return super.precoTotal();
	}

	@Override
	public String etiqueta() {
		return super.etiqueta() + " (usado) - " + "Data de manufatura: " + sdf.format(dataDeManufatura);
	}
	
}
