/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar5 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
		int contador = 0;	
			
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine();
		
		
		
		for(int i = 0; i < frase.length(); i++){
			
			if(frase.toLowerCase().charAt(i) == 'a'){
				
				contador++;
			}
			
		}
		System.out.println("\nO Caracter \'a\' apareceu: " + contador);	
			
	}
}

