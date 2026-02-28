package appilcation;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Estoque;

public class Produto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Estoque> lista = new ArrayList<>();
		
		System.out.print("Quantos produtos quer cadastrar?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Produto " + (i+1) );
			System.out.print("Nome:");
			String nome = sc.next();
			System.out.print("Codigo:");
		    int codigo = sc.nextInt();
			System.out.print("Preço:");
			double preço = sc.nextDouble();
			
			Estoque estoque = new Estoque(nome,codigo,preço);
			
			lista.add(estoque);
			
			
		}
		
		System.out.print("Digite o codigo do produto:");
		double codigoProduto = sc.nextDouble();
		
		
		
		Integer pos = position(lista,codigoProduto);
		
		if(pos != null) {
			System.out.print("Produto cadastrado com sucesso!");
		}else {
			System.out.println("Produto nao achado no sistema");
		}
		/*Essa parte do sistema vai mostra a lista de produtos*/
		System.out.println();
		System.out.println("Lista de produtos:");
		
		for(Estoque estoque : lista) {
			System.out.println(estoque.toString());
		}
		
		

	}
	public static Integer position(List<Estoque> lista,double codigoProduto) {
		for(int i = 0; i < lista.size(); i++) {
			
			if(lista.get(i).getCodigo() == codigoProduto) {
				
				return i;
			}
			
		}
		return null;
	}
	

}
