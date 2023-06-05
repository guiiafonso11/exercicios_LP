/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar7 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		Scanner leitor = new Scanner (System.in);
			
		String frase = "";
		int contador = 0;	
			
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine().toUpperCase();
		
		System.out.println(frase);
	for(char caracter = 'A'; caracter<='Z'; caracter++){
		
		contador = 0;
		
		for(int i = 0; i < frase.length(); i++){
			
			
			if(frase.charAt(i) == caracter){
				
				contador++;
			}
			
		}
		System.out.println(caracter + " - " + contador);
	}
			
	}
}

