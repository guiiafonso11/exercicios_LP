/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class Lojinha {
	
	public static void main (String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o numero total de mercadorias em estoque: ");
		int numMercadorias = leia.nextInt()-1;
		int soma = 0;
		double media = 0;
		double cont = 0;
		
		for(int i = 0; i <= numMercadorias; i++){
		System.out.print("Digite o valor de cada mercadoria: ");
		double valorMercadoria = leia.nextDouble();
		soma+=valorMercadoria;
		cont++;
		
		}
		media = soma / cont;
		System.out.println("Valor total em estoque: " + soma);
		System.out.println("Media de valor das mercadorias: " + media);		
	}
}

