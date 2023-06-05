/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar6 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		Scanner leitor = new Scanner (System.in);
			
		String frase = "";
		char caracter;
		int contador = 0;	
			
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine();
		
		System.out.print("Digite o caracter que deseja procurar: ");
		caracter = leiaStr.nextLine().charAt(0);
	
	
		for(int i = 0; i < frase.length(); i++){
			
			if(frase.charAt(i) == caracter){
				
				contador++;
			}
			
		}
		System.out.println("\nO Caracter "+ caracter + "apareceu: " + contador + " vezes");	
			
	}
}

