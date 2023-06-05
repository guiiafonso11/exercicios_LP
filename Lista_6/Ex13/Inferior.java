/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class Inferior {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double soma = 0;
		
		for(int i = 0; i < 10 ; i++){
			System.out.print("Digite um valor: ");
			int valor = leia.nextInt();
				if(valor < 40){
					soma+=valor;
				}
		
		}
		System.out.print("Resultado: " + soma);
	}
}

