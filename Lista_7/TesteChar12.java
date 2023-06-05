/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar12VogalDificil {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
		char caracter;
		int contadorA = 0 ; 
		int contadorE = 0; 
		int contadorI = 0; 
		int contadorO = 0; 
		int contadorU = 0;
			
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine().toLowerCase();
	
		for(int i = 0; i < frase.length(); i++){
			
			if(frase.charAt(i) == 'a'){
				
				contadorA++;
			}
			if(frase.charAt(i) == 'e'){
				
				contadorE++;
			}
			if(frase.charAt(i) == 'i'){
				
				contadorI++;
			}
			if(frase.charAt(i) == 'o'){
				
				contadorO++;
			}
			if(frase.charAt(i) == 'u'){
				
				contadorU++;
			}
		}
		System.out.println("\nA frase tem " + contadorA + " letras A");	
		System.out.println("\nA frase tem " + contadorE + " letras E");	
		System.out.println("\nA frase tem " + contadorI + " letras I");	
		System.out.println("\nA frase tem " + contadorO + " letras O");	
		System.out.println("\nA frase tem " + contadorU + " letras U");	
			
			
	}
}

