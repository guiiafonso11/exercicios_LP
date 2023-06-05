/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class Produto {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
			
		double media = 0;
		double soma = 0;
		int maior = 0;
		double cont = 0;
		
		for(int i = 0; i<15 ; i++){
			System.out.print("Digite o codigo do produto: ");
			int codigo = leia.nextInt();
			System.out.print("Digite o preco do produto: ");
			int preco = leia.nextInt();
			
			if(i == 0){
			
			maior = preco;	
			}
			if(preco>maior){
				
			maior = preco;
			}
			soma+=preco;
			cont++;	
		}
			media = soma / cont;
			System.out.println("O maior preco lido: " + maior);
			System.out.println("A media dos precos: " + media); 
		
		
	}
}

