/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar14 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "", saida = "";
		char caracter;
		
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine().toLowerCase();
	
		System.out.print("Digite o caracter: ");
		caracter = leiaStr.nextLine().charAt(0);
	
		for(int i = 0; i < frase.length(); i++){
			
			if(frase.charAt(i) == caracter){
				
				saida += '*';
			}
			else{
				
				saida += frase.charAt(i);
			}
		}
		System.out.println("Saida: " + caracter + " = " + saida);	
			
	}
}

