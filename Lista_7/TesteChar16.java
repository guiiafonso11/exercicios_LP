/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar16 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "";
		int contador = 0;	
			
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine();
	
		for(int i = 0; i < frase.length(); i++){
			
			if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z'){
				contador++;
			}
		}
		if(contador>0){
		System.out.println("\nA frase nao tem somente letras maiusculas");	
		}
		else{
		System.out.println("\nA frase tem somente letras maiusculas");	
		}
	}
}

