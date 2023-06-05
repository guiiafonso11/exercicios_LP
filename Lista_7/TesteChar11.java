/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar11 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
		char caracter;
		int contadorLetras = 0;	
		int contadorNumeros = 0;
			
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine().toLowerCase();
	
		for(int i = 0; i < frase.length(); i++){
			
			if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z' ){
				
				contadorLetras++;
			}
			if(frase.charAt(i) >= '0' && frase.charAt(i) <= '9'){
				
				contadorNumeros++;
			}
		}
		System.out.println("\nA frase tem " + contadorLetras + " letras alfabeticas");	
		System.out.println("\nA frase tem " + contadorNumeros + " numeros");	
			
	}
}

