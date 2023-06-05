/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class PositivoNegativo {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		int valor = leia.nextInt();
		
		if(valor >= 0) {
			
			System.out.println("É POSITIVO; VALOR: " + valor);
			
		}else{
			System.out.println("É NEGATIVO; VALOR: " + valor);
		}
		
	}
}

