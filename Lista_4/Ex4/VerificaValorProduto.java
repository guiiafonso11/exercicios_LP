/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class VerificaValorProduto {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		
		int precoProduto1;
		int precoProduto2;
		
		System.out.print("Digite o preço do Produto 1: ");
		precoProduto1 = leia.nextInt(); 
		
		System.out.print("Digite o preço do Produto 2: ");
		precoProduto2 = leia.nextInt();
		
		if(precoProduto1 > 1000 || precoProduto1 < 1 || precoProduto2 > 1000 || precoProduto2 < 1){
				
				System.out.println("VALORES INVÁLIDOS!");
				System.out.println("Valor do Produto 1: " + precoProduto1 + "\n" + "Valor do Produto 2: " + precoProduto2);
				
		}
		else{
			
			if(precoProduto1 < precoProduto2){
			System.out.println("O Produto 1 é mais barato que o Produto 2");
					}
				else{
					System.out.println("O Produto 2 é mais barato que o Produto 1");
		}
			
		}		
		 
	}
}

