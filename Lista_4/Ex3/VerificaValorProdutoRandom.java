/* Guilherme Afonso de Oliveira Ramos */


import java.lang.Math;
public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
		
		int precoProduto1 = (int) (Math.random() * 1000)+1;
		int precoProduto2 = (int) (Math.random() * 1000)+1;
		
		System.out.println("Preço do Produto 1: " + precoProduto1);
		System.out.println("Preço do Produto 2: " + precoProduto2);  
		
		if(precoProduto1 != precoProduto2){
			if(precoProduto1 < precoProduto2){
			System.out.println("O Produto 1 é mais barato que o Produto 2");
					}
				else{
					System.out.println("O Produto 2 é mais barato que o Produto 1");
		}
		}	
		else{
			System.out.println("O Preço dos Produtos são Iguais");
		
		}
		
	}
}

