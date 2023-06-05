/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar4 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
		int contador = 0;	
			
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine();
		
		frase = frase.toLowerCase();
		
		for(int i = 0; i < frase.length(); i++){
			
			if(frase.charAt(i) == 'a'){
				
				contador++;
			}
			
		}
		System.out.println("\nO Caracter \'a\' apareceu: " + contador);	
			
	}
}

