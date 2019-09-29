package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidade.ProdutoImportadoSubclasse;
import entidade.ProdutoSuperclasse;
import entidade.ProdutoUsadoSubclasse;


public class Polimorfismo {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<ProdutoSuperclasse> listaProduto = new ArrayList<>();
		
		System.out.print("Quantos produtos ser�o registrados? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do Produto #" + i + ": ");
			System.out.print("O produto � NOVO, USADO ou IMPORTADO? (n/u/i) ");
			char caracteristica = sc.next().charAt(0);
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Pre�o unit�rio: ");
			Double precoProduto = sc.nextDouble();
			if (caracteristica == 'i') {
				System.out.print("Informe o custo de importa��o: ");
				Double custoImportacao = sc.nextDouble();
				//Chamar m�todo etiquetaDoProduto -> Subclasse ProdutoImportadoSubclasse.
				//ProdutoSuperclasse prod = new ProdutoImportadoSubclasse(nomeProduto, precoProduto, custoImportacao);
				//listaProduto.add(prod);
				listaProduto.add(new ProdutoImportadoSubclasse(nomeProduto, precoProduto, custoImportacao));
			}
			if (caracteristica == 'u') {
				System.out.print("Informe a data de manufatura: (dd/mm/yyyy) ");
				sc.nextLine();
				String dataFabricacao = sc.nextLine();
				Date dataDeManufatura = sdf.parse(dataFabricacao);
				listaProduto.add(new ProdutoUsadoSubclasse(nomeProduto, precoProduto, dataDeManufatura));
				//Chamar m�todo etiquetaDoProduto -> Subclasse ProdutoUsadoSubclasse.
			}
			if (caracteristica == 'n') {
				listaProduto.add(new ProdutoSuperclasse(nomeProduto, precoProduto));
				//Chamar m�todo etiquetaDoProduto -> Superclasse.
			}
		}
			System.out.println("----------------------------------------------------------------------");
			System.out.println("ETIQUETAS DE PRE�O:");
			for (ProdutoSuperclasse lista : listaProduto) {
				System.out.println(lista.etiqueta());
			}
		sc.close();
	}
}
