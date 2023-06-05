/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class Soma {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double soma = 0;
		
		for(int i = 0; i < 10 ; i++){
			System.out.print("Digite um valor: ");
			int valor = leia.nextInt();
			soma+=valor;
			
		}
		
		System.out.print("Soma: " + soma);
		
	}
}

