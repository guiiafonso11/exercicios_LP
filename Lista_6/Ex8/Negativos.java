/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class Negativos {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int negativos = 0;
		
		
		for(int i = 0; i<10; i++){
			System.out.print("Digite um valor: ");
			int valor = leia.nextInt();
			if(valor<0){
				negativos++;
			}
			
		}
		System.out.print("Quantidade de negativos: " + negativos);
		
	}
}

