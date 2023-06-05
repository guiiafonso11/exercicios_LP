/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar13Dois {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
		String consoantes = "bcdfghjklmnpqrstvwxyz";
		
		int contador = 0;	
		
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine().toLowerCase();
	
	for(int c = 0; c < consoantes.length(); c++){
		
		for(int i = 0; i < frase.length(); i++){
			
			if(frase.charAt(i) == consoantes.charAt(c)){
				
				contador++;
			}
		}
	}
		System.out.println("Quantidade de consoantes: " + contador);	
			
			
	}
}

